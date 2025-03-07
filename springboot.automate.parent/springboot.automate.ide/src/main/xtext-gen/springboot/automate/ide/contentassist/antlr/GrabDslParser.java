/*
 * generated by Xtext 2.32.0
 */
package springboot.automate.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import springboot.automate.ide.contentassist.antlr.internal.InternalGrabDslParser;
import springboot.automate.services.GrabDslGrammarAccess;

public class GrabDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GrabDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GrabDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMemberDefinitionAccess().getAlternatives(), "rule__MemberDefinition__Alternatives");
			builder.put(grammarAccess.getAnnotationArgumentAccess().getValueAlternatives_2_0(), "rule__AnnotationArgument__ValueAlternatives_2_0");
			builder.put(grammarAccess.getBooleanLiteralAccess().getAlternatives(), "rule__BooleanLiteral__Alternatives");
			builder.put(grammarAccess.getVisibilityModifierAccess().getAlternatives(), "rule__VisibilityModifier__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getAlternatives(), "rule__PrimitiveType__Alternatives");
			builder.put(grammarAccess.getGenericTypeAccess().getAlternatives_0(), "rule__GenericType__Alternatives_0");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getPackageDefinitionAccess().getGroup(), "rule__PackageDefinition__Group__0");
			builder.put(grammarAccess.getClassDefinitionAccess().getGroup(), "rule__ClassDefinition__Group__0");
			builder.put(grammarAccess.getClassDefinitionAccess().getGroup_3(), "rule__ClassDefinition__Group_3__0");
			builder.put(grammarAccess.getInterfaceDefinitionAccess().getGroup(), "rule__InterfaceDefinition__Group__0");
			builder.put(grammarAccess.getInterfaceDefinitionAccess().getGroup_3(), "rule__InterfaceDefinition__Group_3__0");
			builder.put(grammarAccess.getMethodDefinitionAccess().getGroup(), "rule__MethodDefinition__Group__0");
			builder.put(grammarAccess.getMethodDefinitionAccess().getGroup_4(), "rule__MethodDefinition__Group_4__0");
			builder.put(grammarAccess.getMethodDefinitionAccess().getGroup_4_1(), "rule__MethodDefinition__Group_4_1__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup(), "rule__PropertyDefinition__Group__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup_5(), "rule__PropertyDefinition__Group_5__0");
			builder.put(grammarAccess.getParameterDefinitionAccess().getGroup(), "rule__ParameterDefinition__Group__0");
			builder.put(grammarAccess.getParameterDefinitionAccess().getGroup_3(), "rule__ParameterDefinition__Group_3__0");
			builder.put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
			builder.put(grammarAccess.getAnnotationAccess().getGroup_2(), "rule__Annotation__Group_2__0");
			builder.put(grammarAccess.getAnnotationAccess().getGroup_2_1(), "rule__Annotation__Group_2_1__0");
			builder.put(grammarAccess.getAnnotationAccess().getGroup_2_1_1(), "rule__Annotation__Group_2_1_1__0");
			builder.put(grammarAccess.getAnnotationArgumentAccess().getGroup(), "rule__AnnotationArgument__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getGenericTypeAccess().getGroup(), "rule__GenericType__Group__0");
			builder.put(grammarAccess.getEntityTypeAccess().getGroup(), "rule__EntityType__Group__0");
			builder.put(grammarAccess.getPomXmlAccess().getGroup(), "rule__PomXml__Group__0");
			builder.put(grammarAccess.getPropertiesAccess().getGroup(), "rule__Properties__Group__0");
			builder.put(grammarAccess.getDependenciesAccess().getGroup(), "rule__Dependencies__Group__0");
			builder.put(grammarAccess.getDependencyAccess().getGroup(), "rule__Dependency__Group__0");
			builder.put(grammarAccess.getDependencyAccess().getGroup_8(), "rule__Dependency__Group_8__0");
			builder.put(grammarAccess.getDependencyAccess().getGroup_9(), "rule__Dependency__Group_9__0");
			builder.put(grammarAccess.getBuildAccess().getGroup(), "rule__Build__Group__0");
			builder.put(grammarAccess.getPluginAccess().getGroup(), "rule__Plugin__Group__0");
			builder.put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
			builder.put(grammarAccess.getModelAccess().getPackageNameAssignment_1(), "rule__Model__PackageNameAssignment_1");
			builder.put(grammarAccess.getModelAccess().getPomXmlAssignment_3(), "rule__Model__PomXmlAssignment_3");
			builder.put(grammarAccess.getModelAccess().getPackagesAssignment_4(), "rule__Model__PackagesAssignment_4");
			builder.put(grammarAccess.getPackageDefinitionAccess().getAnnotationsAssignment_0(), "rule__PackageDefinition__AnnotationsAssignment_0");
			builder.put(grammarAccess.getPackageDefinitionAccess().getPackageNameAssignment_2(), "rule__PackageDefinition__PackageNameAssignment_2");
			builder.put(grammarAccess.getPackageDefinitionAccess().getClassesAssignment_4(), "rule__PackageDefinition__ClassesAssignment_4");
			builder.put(grammarAccess.getPackageDefinitionAccess().getInterfacesAssignment_5(), "rule__PackageDefinition__InterfacesAssignment_5");
			builder.put(grammarAccess.getClassDefinitionAccess().getAnnotationsAssignment_0(), "rule__ClassDefinition__AnnotationsAssignment_0");
			builder.put(grammarAccess.getClassDefinitionAccess().getNameAssignment_2(), "rule__ClassDefinition__NameAssignment_2");
			builder.put(grammarAccess.getClassDefinitionAccess().getInterfaceAssignment_3_1(), "rule__ClassDefinition__InterfaceAssignment_3_1");
			builder.put(grammarAccess.getClassDefinitionAccess().getMembersAssignment_5(), "rule__ClassDefinition__MembersAssignment_5");
			builder.put(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAssignment_0(), "rule__InterfaceDefinition__AnnotationsAssignment_0");
			builder.put(grammarAccess.getInterfaceDefinitionAccess().getNameAssignment_2(), "rule__InterfaceDefinition__NameAssignment_2");
			builder.put(grammarAccess.getInterfaceDefinitionAccess().getInterfaceAssignment_3_1(), "rule__InterfaceDefinition__InterfaceAssignment_3_1");
			builder.put(grammarAccess.getInterfaceDefinitionAccess().getMembersAssignment_5(), "rule__InterfaceDefinition__MembersAssignment_5");
			builder.put(grammarAccess.getMemberDefinitionAccess().getMethodAssignment_0(), "rule__MemberDefinition__MethodAssignment_0");
			builder.put(grammarAccess.getMemberDefinitionAccess().getPropertyAssignment_1(), "rule__MemberDefinition__PropertyAssignment_1");
			builder.put(grammarAccess.getMethodDefinitionAccess().getAnnotationsAssignment_0(), "rule__MethodDefinition__AnnotationsAssignment_0");
			builder.put(grammarAccess.getMethodDefinitionAccess().getVisibilityAssignment_1(), "rule__MethodDefinition__VisibilityAssignment_1");
			builder.put(grammarAccess.getMethodDefinitionAccess().getNameAssignment_2(), "rule__MethodDefinition__NameAssignment_2");
			builder.put(grammarAccess.getMethodDefinitionAccess().getParametersAssignment_4_0(), "rule__MethodDefinition__ParametersAssignment_4_0");
			builder.put(grammarAccess.getMethodDefinitionAccess().getParametersAssignment_4_1_1(), "rule__MethodDefinition__ParametersAssignment_4_1_1");
			builder.put(grammarAccess.getMethodDefinitionAccess().getReturnTypeAssignment_7(), "rule__MethodDefinition__ReturnTypeAssignment_7");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getAnnotationsAssignment_0(), "rule__PropertyDefinition__AnnotationsAssignment_0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getVisibilityAssignment_1(), "rule__PropertyDefinition__VisibilityAssignment_1");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2(), "rule__PropertyDefinition__NameAssignment_2");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4(), "rule__PropertyDefinition__TypeAssignment_4");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getDefaultValueAssignment_5_1(), "rule__PropertyDefinition__DefaultValueAssignment_5_1");
			builder.put(grammarAccess.getParameterDefinitionAccess().getNameAssignment_0(), "rule__ParameterDefinition__NameAssignment_0");
			builder.put(grammarAccess.getParameterDefinitionAccess().getTypeAssignment_2(), "rule__ParameterDefinition__TypeAssignment_2");
			builder.put(grammarAccess.getParameterDefinitionAccess().getDefaultValueAssignment_3_1(), "rule__ParameterDefinition__DefaultValueAssignment_3_1");
			builder.put(grammarAccess.getAnnotationAccess().getNameAssignment_1(), "rule__Annotation__NameAssignment_1");
			builder.put(grammarAccess.getAnnotationAccess().getArgumentsAssignment_2_1_0(), "rule__Annotation__ArgumentsAssignment_2_1_0");
			builder.put(grammarAccess.getAnnotationAccess().getArgumentsAssignment_2_1_1_1(), "rule__Annotation__ArgumentsAssignment_2_1_1_1");
			builder.put(grammarAccess.getAnnotationArgumentAccess().getNameAssignment_0(), "rule__AnnotationArgument__NameAssignment_0");
			builder.put(grammarAccess.getAnnotationArgumentAccess().getValueAssignment_2(), "rule__AnnotationArgument__ValueAssignment_2");
			builder.put(grammarAccess.getEntityTypeAccess().getEntityAssignment_1(), "rule__EntityType__EntityAssignment_1");
			builder.put(grammarAccess.getEntityTypeAccess().getKeyAssignment_3(), "rule__EntityType__KeyAssignment_3");
			builder.put(grammarAccess.getPomXmlAccess().getGroupIdAssignment_4(), "rule__PomXml__GroupIdAssignment_4");
			builder.put(grammarAccess.getPomXmlAccess().getArtifactIdAssignment_7(), "rule__PomXml__ArtifactIdAssignment_7");
			builder.put(grammarAccess.getPomXmlAccess().getVersionAssignment_10(), "rule__PomXml__VersionAssignment_10");
			builder.put(grammarAccess.getPomXmlAccess().getPackagingAssignment_13(), "rule__PomXml__PackagingAssignment_13");
			builder.put(grammarAccess.getPomXmlAccess().getPropertiesAssignment_14(), "rule__PomXml__PropertiesAssignment_14");
			builder.put(grammarAccess.getPomXmlAccess().getDependenciesAssignment_15(), "rule__PomXml__DependenciesAssignment_15");
			builder.put(grammarAccess.getPomXmlAccess().getBuildAssignment_16(), "rule__PomXml__BuildAssignment_16");
			builder.put(grammarAccess.getPropertiesAccess().getJavaVersionAssignment_4(), "rule__Properties__JavaVersionAssignment_4");
			builder.put(grammarAccess.getPropertiesAccess().getSpringBootVersionAssignment_7(), "rule__Properties__SpringBootVersionAssignment_7");
			builder.put(grammarAccess.getDependenciesAccess().getDependenciesAssignment_3(), "rule__Dependencies__DependenciesAssignment_3");
			builder.put(grammarAccess.getDependencyAccess().getGroupIdAssignment_4(), "rule__Dependency__GroupIdAssignment_4");
			builder.put(grammarAccess.getDependencyAccess().getArtifactIdAssignment_7(), "rule__Dependency__ArtifactIdAssignment_7");
			builder.put(grammarAccess.getDependencyAccess().getVersionAssignment_8_2(), "rule__Dependency__VersionAssignment_8_2");
			builder.put(grammarAccess.getDependencyAccess().getScopeAssignment_9_2(), "rule__Dependency__ScopeAssignment_9_2");
			builder.put(grammarAccess.getBuildAccess().getPluginsAssignment_5(), "rule__Build__PluginsAssignment_5");
			builder.put(grammarAccess.getPluginAccess().getGroupIdAssignment_4(), "rule__Plugin__GroupIdAssignment_4");
			builder.put(grammarAccess.getPluginAccess().getArtifactIdAssignment_7(), "rule__Plugin__ArtifactIdAssignment_7");
			builder.put(grammarAccess.getPluginAccess().getVersionAssignment_10(), "rule__Plugin__VersionAssignment_10");
			builder.put(grammarAccess.getPluginAccess().getConfigurationAssignment_11(), "rule__Plugin__ConfigurationAssignment_11");
			builder.put(grammarAccess.getConfigurationAccess().getSourceAssignment_4(), "rule__Configuration__SourceAssignment_4");
			builder.put(grammarAccess.getConfigurationAccess().getTargetAssignment_7(), "rule__Configuration__TargetAssignment_7");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GrabDslGrammarAccess grammarAccess;

	@Override
	protected InternalGrabDslParser createParser() {
		InternalGrabDslParser result = new InternalGrabDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GrabDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GrabDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
