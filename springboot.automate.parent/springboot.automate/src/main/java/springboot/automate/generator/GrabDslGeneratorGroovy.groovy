package springboot.automate.generator

/**
 * Serialization of entities using the DSL: used in slides
 */
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import com.google.inject.Injector

import groovy.json.StringEscapeUtils
import groovy.transform.Field
import java.lang.reflect.Method
import springboot.automate.GrabDslStandaloneSetup
import springboot.automate.grabDsl.Model
import springboot.automate.grabDsl.PackageDefinition
import springboot.automate.grabDsl.Annotation
import springboot.automate.grabDsl.ClassDefinition
import springboot.automate.grabDsl.MemberDefinition
import springboot.automate.grabDsl.MethodDefinition
import springboot.automate.grabDsl.PropertyDefinition

class GrabDslGeneratorGroovy {
	static void main(String[] args) {
		// Initialize the Xtext injector and resource set
		def injector = new GrabDslStandaloneSetup().createInjectorAndDoEMFRegistration()
		def resourceSet = injector.getInstance(XtextResourceSet)

		// Load the DSL model from a file
		def resource = resourceSet.getResource(URI.createFileURI("src/main/resources/spring.dmodel"), true)
		def model = resource.getContents().get(0) as Model

		// Base directory for the generated Spring Boot project
		def projectBase = new File("generated-springboot-project")
		projectBase.mkdirs()

		// Generate project structure
		generateProjectStructure(model, projectBase)
		println "Spring Boot project generated at: ${projectBase.absolutePath}"
	}

	static void generateProjectStructure(Model model, File projectBase) {
		// Create standard Spring Boot folders
		def mainJavaDir = new File(projectBase, "src/main/java")
		def mainResourcesDir = new File(projectBase, "src/main/resources")
		def testJavaDir = new File(projectBase, "src/test/java")

		mainJavaDir.mkdirs()
		mainResourcesDir.mkdirs()
		testJavaDir.mkdirs()

		// Process the packages in the model
		model.packages.each { pkg ->
			generatePackage(pkg, mainJavaDir, model.packageName.toString())
		}

		// Write application.properties file
		new File(mainResourcesDir, "application.properties").text = "# Spring Boot Application Properties\n"
	}

	static void generatePackage(PackageDefinition pkg, File baseDir, String parentPackageName) {
		def packageName = pkg.packageName?.toString()
		println "Processing package: $packageName"

		if (parentPackageName) {
			packageName = "${parentPackageName}.${packageName}"
		}
		println "Processing package: $packageName"

		if (!packageName) {
			println "Package name is null or empty. Skipping package generation."
			return
		}

		def packageDir = new File(baseDir, packageName.replace('.', '/'))
		if (packageDir.mkdirs()) {
			println "Package directory created at: ${packageDir.absolutePath}"
		} else {
			println "Package directory already exists or could not be created: ${packageDir.absolutePath}"
		}

		pkg.classes?.eachWithIndex { cls, idx ->
			// Merge package-level annotations with class-level annotations
			cls.annotations = (cls.annotations ?: []) + (pkg.annotations ?: [])
			cls.annotations = cls.annotations.unique { it.name }
			println "Found class: ${cls.name}"
			println "Class ${idx + 1}: ${cls.name} | Annotations: ${cls.annotations?.collect { it.name }}"
			generateClass(cls, packageDir)
		}
	}

	static void generateClass(ClassDefinition cls, File packageDir) {
		println "Generating class: ${cls.name} in package: ${packageDir.absolutePath}"

		if (!cls?.name) {
			println "Class name is null or empty. Skipping class generation."
			return
		}

		def classFile = new File(packageDir, "${cls.name}.java")
		def content = new StringBuilder()

		// Use the directory path to determine the package name
		def packageName = packageDir.absolutePath.replaceAll('^.*src/main/java/', '').replace('/', '.')
		println "Using package declaration: $packageName"
		content.append("package $packageName;\n\n")

		// Sets to track imports and autowired fields
		def imports = new HashSet<String>()
		def autowiredFields = new HashSet<String>()

		// Add Spring autowired annotation import
		imports.add("org.springframework.beans.factory.annotation.Autowired")
		imports.add("org.springframework.web.bind.annotation.RequestMapping")
		imports.add("org.springframework.web.bind.annotation.RequestMethod.*")

		// Collect necessary imports and autowired fields
		cls.members.each { member ->
			if (member.method) {
				member.method.parameters.each { param ->
					if (param.type?.toString()?.contains("dto.")) {
						// Generate fully qualified name for import
						def type = "com.project.${param.type}"
						imports.add(type) // Add to imports
						def fieldName = type.split("\\.").last().uncapitalize()
						if (!autowiredFields.contains(fieldName)) {
							autowiredFields.add(fieldName) // Add to autowired fields
						}
					}
				}
			}
		}

		// Add imports to the content
		imports.each { importStatement ->
			if (!importStatement.equals(packageName)) {
				// Avoid self-import
				content.append("import $importStatement;\n")
			}
		}
		content.append("\n")

		// Add class-level annotations
		cls.annotations?.each { annotation ->
			def annotationText = generateAnnotation(annotation)
			println "Adding annotation: ${annotationText} to class: ${cls.name}"
			content.append(annotationText).append("\n")
		}

		// Add class declaration
		content.append("public class ${cls.name} {\n\n")

		// Add autowired fields
		// TODO by Purnima Once IUserInterface is done, add imports as well with autowiring
		autowiredFields.each { fieldName ->
			def className = fieldName.capitalize() // Extract the class name from the field name
			println "Adding autowired field: ${fieldName} of type: ${className}"
			content.append("    @Autowired\n    private ${className} ${fieldName};")
		}
		
		// Add members
		cls.members?.each { member ->
			if (member.method) {
				content.append("    ${generateMethod(member.method)}\n")
			} else if (member.property) {
				content.append("    ${generateProperty(member.property)}\n")
			}
		}

		content.append("}")
		classFile.text = content.toString()
		println "Class file written: ${classFile.absolutePath}"
	}



	static String generateProperty(PropertyDefinition property) {
		println "Processing property: ${property.name}"

		// Safely handle visibility
		def visibility = property.visibility?.toString()?.toLowerCase() ?: "private"

		// Handle type, name, and default value
		def typeName = (property.type instanceof String) ? property.type : property.type?.name ?: "Object"
		def propertyName = property.name ?: "property"
		def defaultValue = property.defaultValue ? " = ${property.defaultValue}" : ""

		// Add annotations if available
		def annotations = property.annotations?.collect { generateAnnotation(it) }?.join("\n    ") ?: ""

		if (annotations.isEmpty()) {
			return "$visibility $typeName $propertyName${defaultValue};\n"
		}
		return "\n\n	${annotations}\n    $visibility $typeName $propertyName${defaultValue};"
	}



	static String generateMethod(MethodDefinition method) {
		println "Processing method: ${method.name}"

		// Safely handle visibility
		def visibility = method.visibility?.toString()?.toLowerCase() ?: "public"

		// Handle parameters
		def parameters = method.parameters?.collect { param ->
			def typeName = (param.type instanceof String) ? param.type.split("\\.").last() : param.type?.name ?: "Object"
			def paramName = param.name ?: "param"
			return "$typeName $paramName"
		}?.join(", ") ?: ""

		// Handle return type
		def returnType = (method.returnType instanceof String) ? method.returnType.split("\\.").last() : method.returnType?.name ?: "void"

		def annotations = method.annotations?.collect { annotation ->
			if (annotation.name == "RequestMapping") {
				def methodArg = annotation.arguments.find { it.name == "method" }?.value?.toUpperCase() ?: "GET"
				return "	@RequestMapping(method = RequestMethod.${methodArg})"
			}
			generateAnnotation(annotation)
		}?.join("\n    ") ?: ""

		return "\n${annotations}\n    $visibility $returnType ${method.name}($parameters) {\n        // TODO: Implement method\n    }"
	}

	static String generateAnnotation(Annotation annotation) {
		def annotationText = "@${annotation.name}"
		if (annotation.arguments) {
			def arguments = annotation.arguments.collect {
				def value = (it.value instanceof String) ? "\"${it.value}\"" : it.value
				"${it.name}=${value}"
			}.join(", ")
			annotationText += "($arguments)"
		}
		return annotationText
	}
}
