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
import springboot.automate.grabDsl.PomXml
import springboot.automate.grabDsl.Annotation
import springboot.automate.grabDsl.ClassDefinition
import springboot.automate.grabDsl.InterfaceDefinition
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
		
		if (model.pomXml) {
			generatePomXml(model.pomXmlModel, mainResourcesDir)
		}

		// Process the packages in the model
		model.packages.each { pkg ->
			generatePackage(pkg, mainJavaDir, model.packageName.toString())
		}

		// Write application.properties file
		new File(mainResourcesDir, "application.properties").text = "# Spring Boot Application Properties\n"
	}
	
	static void generatePomXml(PomXml pomXml, File resourcesDir) {
		println "Generating pom.xml"

		def pomFile = new File(resourcesDir, "pom.xml")
		def content = new StringBuilder()

		// Basic XML structure for the pom.xml
		content.append("""<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>${pomXml.groupId}</groupId>
    <artifactId>${pomXml.artifactId}</artifactId>
    <version>${pomXml.version}</version>
    <packaging>${pomXml.packaging}</packaging>

    <properties>
""")

		// Add properties section
		pomXml.properties.each { property ->
			content.append("        <${property.key}>${property.value}</${property.key}>\n")
		}

		content.append("    </properties>\n")

		// Add dependencies section
		content.append("    <dependencies>\n")
		pomXml.dependencies.each { dependency ->
			content.append("        <dependency>\n")
			content.append("            <groupId>${dependency.groupId}</groupId>\n")
			content.append("            <artifactId>${dependency.artifactId}</artifactId>\n")
			content.append("            <version>${dependency.version}</version>\n")
			if (dependency.scope) {
				content.append("            <scope>${dependency.scope}</scope>\n")
			}
			content.append("        </dependency>\n")
		}
		content.append("    </dependencies>\n")

		content.append("</project>")

		// Write the pom.xml file to disk
		pomFile.text = content.toString()
		println "pom.xml file written: ${pomFile.absolutePath}"
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
		
		pkg.interfaces?.eachWithIndex { interfacedef, idx ->
		    // Merge package-level annotations with interface-level annotations
		    interfacedef.annotations = (interfacedef.annotations ?: []) + (pkg.annotations ?: [])
		    interfacedef.annotations = interfacedef.annotations.unique { it.name }
		    println "Found interface: ${interfacedef.name}"
		    generateInterface(interfacedef, packageDir) // Correct method for interfaces
		}

	}

	static void generateClass(ClassDefinition cls, File packageDir) {
		
		def isInterface = false
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

		// Add class declaration with 'implements' if the class implements an interface
		content.append("public class ${cls.name}")
		if (cls.interface) {
			content.append(" implements ${cls.interface}")
		}
		content.append(" {\n\n")

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
				content.append("    ${generateMethod(member.method, isInterface)}\n")
			} else if (member.property) {
				content.append("    ${generateProperty(member.property)}\n")
			}
		}

		content.append("}")
		classFile.text = content.toString()
		println "Class file written: ${classFile.absolutePath}"
	}
	
	
	static void generateInterface(InterfaceDefinition interfacedef, File packageDir) {
		
		def isInterface = true
		println "Generating interface: ${interfacedef.name} in package: ${packageDir.absolutePath}"

		if (!interfacedef?.name) {
			println "Interface name is null or empty. Skipping interface generation."
			return
		}

		def interfaceFile = new File(packageDir, "${interfacedef.name}.java")
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
		

		// Collect necessary imports and autowired fields
		interfacedef.members.each { member ->
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

		// Add interface-level annotations
		interfacedef.annotations?.each { annotation ->
			def annotationText = generateAnnotation(annotation)
			println "Adding annotation: ${annotationText} to interface: ${interfacedef.name}"
			content.append(annotationText).append("\n")
		}

		content.append("public interface ${interfacedef.name} {\n\n")

		// Add autowired fields
		// TODO by Purnima Once IUserInterface is done, add imports as well with autowiring
		autowiredFields.each { fieldName ->
			def interfaceName = fieldName.capitalize() // Extract the class name from the field name
			println "Adding autowired field: ${fieldName} of type: ${className}"
			content.append("    @Autowired\n    private ${className} ${fieldName};")
		}

		// Add members
		interfacedef.members?.each { member ->
			if (member.method) {
				content.append("    ${generateMethod(member.method, isInterface)}\n")
			} else if (member.property) {
				content.append("    ${generateProperty(member.property)}\n")
			}
		}

		content.append("}")
		interfaceFile.text = content.toString()
		println "interface file written: ${interfaceFile.absolutePath}"
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



	static String generateMethod(MethodDefinition method, boolean isInterface) {
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
				return "@RequestMapping(method = RequestMethod.${methodArg})"
			}
			generateAnnotation(annotation)
		}?.join("\n    ") ?: ""
		
		if (!isInterface)
			return "\n	${annotations}\n    $visibility $returnType ${method.name}($parameters) {\n        // TODO: Implement method\n    }"
		else
			return "\n${annotations}\n    $visibility $returnType ${method.name}($parameters);"
		
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
