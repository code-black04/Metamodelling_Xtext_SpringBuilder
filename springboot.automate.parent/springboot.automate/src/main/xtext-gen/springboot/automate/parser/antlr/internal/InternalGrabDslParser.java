package springboot.automate.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import springboot.automate.services.GrabDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGrabDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'class'", "'implements'", "'interface'", "'extends'", "'('", "','", "')'", "':'", "';'", "'='", "'@'", "'true'", "'false'", "'public'", "'private'", "'protected'", "'void'", "'String'", "'double'", "'float'", "'int'", "'UUID'", "'Date'", "'Timestamp'", "'List'", "'Optional'", "'.'", "'<'", "'>'", "'pomXml'", "'groupId'", "'artifactId'", "'version'", "'packaging'", "'properties'", "'javaVersion'", "'springBootVersion'", "'dependencies'", "'dependency'", "'scope'", "'build'", "'plugins'", "'plugin'", "'configuration'", "'source'", "'target'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGrabDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGrabDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGrabDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGrabDsl.g"; }



     	private GrabDslGrammarAccess grammarAccess;

        public InternalGrabDslParser(TokenStream input, GrabDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GrabDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGrabDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGrabDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGrabDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGrabDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_pomXml_3_0= rulePomXml ) ) ( (lv_packages_4_0= rulePackageDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_pomXml_3_0 = null;

        EObject lv_packages_4_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:77:2: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_pomXml_3_0= rulePomXml ) ) ( (lv_packages_4_0= rulePackageDefinition ) )* otherlv_5= '}' ) )
            // InternalGrabDsl.g:78:2: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_pomXml_3_0= rulePomXml ) ) ( (lv_packages_4_0= rulePackageDefinition ) )* otherlv_5= '}' )
            {
            // InternalGrabDsl.g:78:2: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_pomXml_3_0= rulePomXml ) ) ( (lv_packages_4_0= rulePackageDefinition ) )* otherlv_5= '}' )
            // InternalGrabDsl.g:79:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_pomXml_3_0= rulePomXml ) ) ( (lv_packages_4_0= rulePackageDefinition ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
            		
            // InternalGrabDsl.g:83:3: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // InternalGrabDsl.g:84:4: (lv_packageName_1_0= ruleQualifiedName )
            {
            // InternalGrabDsl.g:84:4: (lv_packageName_1_0= ruleQualifiedName )
            // InternalGrabDsl.g:85:5: lv_packageName_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"packageName",
            						lv_packageName_1_0,
            						"springboot.automate.GrabDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrabDsl.g:106:3: ( (lv_pomXml_3_0= rulePomXml ) )
            // InternalGrabDsl.g:107:4: (lv_pomXml_3_0= rulePomXml )
            {
            // InternalGrabDsl.g:107:4: (lv_pomXml_3_0= rulePomXml )
            // InternalGrabDsl.g:108:5: lv_pomXml_3_0= rulePomXml
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPomXmlPomXmlParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_pomXml_3_0=rulePomXml();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"pomXml",
            						lv_pomXml_3_0,
            						"springboot.automate.GrabDsl.PomXml");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrabDsl.g:125:3: ( (lv_packages_4_0= rulePackageDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGrabDsl.g:126:4: (lv_packages_4_0= rulePackageDefinition )
            	    {
            	    // InternalGrabDsl.g:126:4: (lv_packages_4_0= rulePackageDefinition )
            	    // InternalGrabDsl.g:127:5: lv_packages_4_0= rulePackageDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_packages_4_0=rulePackageDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packages",
            	    						lv_packages_4_0,
            	    						"springboot.automate.GrabDsl.PackageDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDefinition"
    // InternalGrabDsl.g:152:1: entryRulePackageDefinition returns [EObject current=null] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final EObject entryRulePackageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinition = null;


        try {
            // InternalGrabDsl.g:152:58: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // InternalGrabDsl.g:153:2: iv_rulePackageDefinition= rulePackageDefinition EOF
            {
             newCompositeNode(grammarAccess.getPackageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDefinition=rulePackageDefinition();

            state._fsp--;

             current =iv_rulePackageDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // InternalGrabDsl.g:159:1: rulePackageDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )* otherlv_6= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_packageName_2_0 = null;

        EObject lv_classes_4_0 = null;

        EObject lv_interfaces_5_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:165:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )* otherlv_6= '}' ) )
            // InternalGrabDsl.g:166:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )* otherlv_6= '}' )
            {
            // InternalGrabDsl.g:166:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )* otherlv_6= '}' )
            // InternalGrabDsl.g:167:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )* otherlv_6= '}'
            {
            // InternalGrabDsl.g:167:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGrabDsl.g:168:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:168:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:169:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"springboot.automate.GrabDsl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_1());
            		
            // InternalGrabDsl.g:190:3: ( (lv_packageName_2_0= ruleQualifiedName ) )
            // InternalGrabDsl.g:191:4: (lv_packageName_2_0= ruleQualifiedName )
            {
            // InternalGrabDsl.g:191:4: (lv_packageName_2_0= ruleQualifiedName )
            // InternalGrabDsl.g:192:5: lv_packageName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getPackageNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_packageName_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            					}
            					set(
            						current,
            						"packageName",
            						lv_packageName_2_0,
            						"springboot.automate.GrabDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGrabDsl.g:213:3: ( (lv_classes_4_0= ruleClassDefinition ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalGrabDsl.g:214:4: (lv_classes_4_0= ruleClassDefinition )
            	    {
            	    // InternalGrabDsl.g:214:4: (lv_classes_4_0= ruleClassDefinition )
            	    // InternalGrabDsl.g:215:5: lv_classes_4_0= ruleClassDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getClassesClassDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_classes_4_0=ruleClassDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_4_0,
            	    						"springboot.automate.GrabDsl.ClassDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalGrabDsl.g:232:3: ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGrabDsl.g:233:4: (lv_interfaces_5_0= ruleInterfaceDefinition )
            	    {
            	    // InternalGrabDsl.g:233:4: (lv_interfaces_5_0= ruleInterfaceDefinition )
            	    // InternalGrabDsl.g:234:5: lv_interfaces_5_0= ruleInterfaceDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getInterfacesInterfaceDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_interfaces_5_0=ruleInterfaceDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interfaces",
            	    						lv_interfaces_5_0,
            	    						"springboot.automate.GrabDsl.InterfaceDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleClassDefinition"
    // InternalGrabDsl.g:259:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalGrabDsl.g:259:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalGrabDsl.g:260:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinition=ruleClassDefinition();

            state._fsp--;

             current =iv_ruleClassDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDefinition"


    // $ANTLR start "ruleClassDefinition"
    // InternalGrabDsl.g:266:1: ruleClassDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_interface_4_0 = null;

        EObject lv_members_6_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:272:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' ) )
            // InternalGrabDsl.g:273:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' )
            {
            // InternalGrabDsl.g:273:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' )
            // InternalGrabDsl.g:274:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}'
            {
            // InternalGrabDsl.g:274:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGrabDsl.g:275:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:275:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:276:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"springboot.automate.GrabDsl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getClassKeyword_1());
            		
            // InternalGrabDsl.g:297:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:298:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:298:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:299:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGrabDsl.g:315:3: (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGrabDsl.g:316:4: otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getImplementsKeyword_3_0());
                    			
                    // InternalGrabDsl.g:320:4: ( (lv_interface_4_0= ruleQualifiedName ) )
                    // InternalGrabDsl.g:321:5: (lv_interface_4_0= ruleQualifiedName )
                    {
                    // InternalGrabDsl.g:321:5: (lv_interface_4_0= ruleQualifiedName )
                    // InternalGrabDsl.g:322:6: lv_interface_4_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getClassDefinitionAccess().getInterfaceQualifiedNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_interface_4_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"interface",
                    							lv_interface_4_0,
                    							"springboot.automate.GrabDsl.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGrabDsl.g:344:3: ( (lv_members_6_0= ruleMemberDefinition ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==24||(LA7_0>=27 && LA7_0<=29)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGrabDsl.g:345:4: (lv_members_6_0= ruleMemberDefinition )
            	    {
            	    // InternalGrabDsl.g:345:4: (lv_members_6_0= ruleMemberDefinition )
            	    // InternalGrabDsl.g:346:5: lv_members_6_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getMembersMemberDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_members_6_0=ruleMemberDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_6_0,
            	    						"springboot.automate.GrabDsl.MemberDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDefinition"


    // $ANTLR start "entryRuleInterfaceDefinition"
    // InternalGrabDsl.g:371:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // InternalGrabDsl.g:371:60: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // InternalGrabDsl.g:372:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
             newCompositeNode(grammarAccess.getInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();

            state._fsp--;

             current =iv_ruleInterfaceDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceDefinition"


    // $ANTLR start "ruleInterfaceDefinition"
    // InternalGrabDsl.g:378:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interface_4_0= ruleEntityType ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_interface_4_0 = null;

        EObject lv_members_6_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:384:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interface_4_0= ruleEntityType ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' ) )
            // InternalGrabDsl.g:385:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interface_4_0= ruleEntityType ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' )
            {
            // InternalGrabDsl.g:385:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interface_4_0= ruleEntityType ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' )
            // InternalGrabDsl.g:386:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interface_4_0= ruleEntityType ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}'
            {
            // InternalGrabDsl.g:386:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrabDsl.g:387:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:387:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:388:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"springboot.automate.GrabDsl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1());
            		
            // InternalGrabDsl.g:409:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:410:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:410:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:411:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInterfaceDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGrabDsl.g:427:3: (otherlv_3= 'extends' ( (lv_interface_4_0= ruleEntityType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGrabDsl.g:428:4: otherlv_3= 'extends' ( (lv_interface_4_0= ruleEntityType ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getInterfaceDefinitionAccess().getExtendsKeyword_3_0());
                    			
                    // InternalGrabDsl.g:432:4: ( (lv_interface_4_0= ruleEntityType ) )
                    // InternalGrabDsl.g:433:5: (lv_interface_4_0= ruleEntityType )
                    {
                    // InternalGrabDsl.g:433:5: (lv_interface_4_0= ruleEntityType )
                    // InternalGrabDsl.g:434:6: lv_interface_4_0= ruleEntityType
                    {

                    						newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getInterfaceEntityTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_interface_4_0=ruleEntityType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"interface",
                    							lv_interface_4_0,
                    							"springboot.automate.GrabDsl.EntityType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGrabDsl.g:456:3: ( (lv_members_6_0= ruleMemberDefinition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==24||(LA10_0>=27 && LA10_0<=29)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGrabDsl.g:457:4: (lv_members_6_0= ruleMemberDefinition )
            	    {
            	    // InternalGrabDsl.g:457:4: (lv_members_6_0= ruleMemberDefinition )
            	    // InternalGrabDsl.g:458:5: lv_members_6_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMembersMemberDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_members_6_0=ruleMemberDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_6_0,
            	    						"springboot.automate.GrabDsl.MemberDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceDefinition"


    // $ANTLR start "entryRuleMemberDefinition"
    // InternalGrabDsl.g:483:1: entryRuleMemberDefinition returns [EObject current=null] : iv_ruleMemberDefinition= ruleMemberDefinition EOF ;
    public final EObject entryRuleMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDefinition = null;


        try {
            // InternalGrabDsl.g:483:57: (iv_ruleMemberDefinition= ruleMemberDefinition EOF )
            // InternalGrabDsl.g:484:2: iv_ruleMemberDefinition= ruleMemberDefinition EOF
            {
             newCompositeNode(grammarAccess.getMemberDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberDefinition=ruleMemberDefinition();

            state._fsp--;

             current =iv_ruleMemberDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberDefinition"


    // $ANTLR start "ruleMemberDefinition"
    // InternalGrabDsl.g:490:1: ruleMemberDefinition returns [EObject current=null] : ( ( (lv_method_0_0= ruleMethodDefinition ) ) | ( (lv_property_1_0= rulePropertyDefinition ) ) ) ;
    public final EObject ruleMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_method_0_0 = null;

        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:496:2: ( ( ( (lv_method_0_0= ruleMethodDefinition ) ) | ( (lv_property_1_0= rulePropertyDefinition ) ) ) )
            // InternalGrabDsl.g:497:2: ( ( (lv_method_0_0= ruleMethodDefinition ) ) | ( (lv_property_1_0= rulePropertyDefinition ) ) )
            {
            // InternalGrabDsl.g:497:2: ( ( (lv_method_0_0= ruleMethodDefinition ) ) | ( (lv_property_1_0= rulePropertyDefinition ) ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalGrabDsl.g:498:3: ( (lv_method_0_0= ruleMethodDefinition ) )
                    {
                    // InternalGrabDsl.g:498:3: ( (lv_method_0_0= ruleMethodDefinition ) )
                    // InternalGrabDsl.g:499:4: (lv_method_0_0= ruleMethodDefinition )
                    {
                    // InternalGrabDsl.g:499:4: (lv_method_0_0= ruleMethodDefinition )
                    // InternalGrabDsl.g:500:5: lv_method_0_0= ruleMethodDefinition
                    {

                    					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getMethodMethodDefinitionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_method_0_0=ruleMethodDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMemberDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"method",
                    						lv_method_0_0,
                    						"springboot.automate.GrabDsl.MethodDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:518:3: ( (lv_property_1_0= rulePropertyDefinition ) )
                    {
                    // InternalGrabDsl.g:518:3: ( (lv_property_1_0= rulePropertyDefinition ) )
                    // InternalGrabDsl.g:519:4: (lv_property_1_0= rulePropertyDefinition )
                    {
                    // InternalGrabDsl.g:519:4: (lv_property_1_0= rulePropertyDefinition )
                    // InternalGrabDsl.g:520:5: lv_property_1_0= rulePropertyDefinition
                    {

                    					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getPropertyPropertyDefinitionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_property_1_0=rulePropertyDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMemberDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"property",
                    						lv_property_1_0,
                    						"springboot.automate.GrabDsl.PropertyDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberDefinition"


    // $ANTLR start "entryRuleMethodDefinition"
    // InternalGrabDsl.g:541:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // InternalGrabDsl.g:541:57: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // InternalGrabDsl.g:542:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
             newCompositeNode(grammarAccess.getMethodDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodDefinition=ruleMethodDefinition();

            state._fsp--;

             current =iv_ruleMethodDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodDefinition"


    // $ANTLR start "ruleMethodDefinition"
    // InternalGrabDsl.g:548:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' ) ;
    public final EObject ruleMethodDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_visibility_1_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        AntlrDatatypeRuleToken lv_returnType_9_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:554:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' ) )
            // InternalGrabDsl.g:555:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' )
            {
            // InternalGrabDsl.g:555:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' )
            // InternalGrabDsl.g:556:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';'
            {
            // InternalGrabDsl.g:556:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGrabDsl.g:557:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:557:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:558:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getMethodDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"springboot.automate.GrabDsl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalGrabDsl.g:575:3: ( (lv_visibility_1_0= ruleVisibilityModifier ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=27 && LA13_0<=29)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGrabDsl.g:576:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    {
                    // InternalGrabDsl.g:576:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    // InternalGrabDsl.g:577:5: lv_visibility_1_0= ruleVisibilityModifier
                    {

                    					newCompositeNode(grammarAccess.getMethodDefinitionAccess().getVisibilityVisibilityModifierParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_visibility_1_0=ruleVisibilityModifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"springboot.automate.GrabDsl.VisibilityModifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGrabDsl.g:594:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:595:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:595:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:596:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMethodDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGrabDsl.g:616:3: ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGrabDsl.g:617:4: ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )*
                    {
                    // InternalGrabDsl.g:617:4: ( (lv_parameters_4_0= ruleParameterDefinition ) )
                    // InternalGrabDsl.g:618:5: (lv_parameters_4_0= ruleParameterDefinition )
                    {
                    // InternalGrabDsl.g:618:5: (lv_parameters_4_0= ruleParameterDefinition )
                    // InternalGrabDsl.g:619:6: lv_parameters_4_0= ruleParameterDefinition
                    {

                    						newCompositeNode(grammarAccess.getMethodDefinitionAccess().getParametersParameterDefinitionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_parameters_4_0=ruleParameterDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"springboot.automate.GrabDsl.ParameterDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGrabDsl.g:636:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGrabDsl.g:637:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMethodDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGrabDsl.g:641:5: ( (lv_parameters_6_0= ruleParameterDefinition ) )
                    	    // InternalGrabDsl.g:642:6: (lv_parameters_6_0= ruleParameterDefinition )
                    	    {
                    	    // InternalGrabDsl.g:642:6: (lv_parameters_6_0= ruleParameterDefinition )
                    	    // InternalGrabDsl.g:643:7: lv_parameters_6_0= ruleParameterDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodDefinitionAccess().getParametersParameterDefinitionParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_parameters_6_0=ruleParameterDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"springboot.automate.GrabDsl.ParameterDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getMethodDefinitionAccess().getColonKeyword_6());
            		
            // InternalGrabDsl.g:670:3: ( (lv_returnType_9_0= ruleType ) )
            // InternalGrabDsl.g:671:4: (lv_returnType_9_0= ruleType )
            {
            // InternalGrabDsl.g:671:4: (lv_returnType_9_0= ruleType )
            // InternalGrabDsl.g:672:5: lv_returnType_9_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMethodDefinitionAccess().getReturnTypeTypeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_returnType_9_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_9_0,
            						"springboot.automate.GrabDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // InternalGrabDsl.g:697:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalGrabDsl.g:697:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalGrabDsl.g:698:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // InternalGrabDsl.g:704:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_defaultValue_6_0=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_visibility_1_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:710:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? ) )
            // InternalGrabDsl.g:711:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? )
            {
            // InternalGrabDsl.g:711:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? )
            // InternalGrabDsl.g:712:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )?
            {
            // InternalGrabDsl.g:712:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGrabDsl.g:713:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:713:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:714:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"springboot.automate.GrabDsl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalGrabDsl.g:731:3: ( (lv_visibility_1_0= ruleVisibilityModifier ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=27 && LA17_0<=29)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGrabDsl.g:732:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    {
                    // InternalGrabDsl.g:732:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    // InternalGrabDsl.g:733:5: lv_visibility_1_0= ruleVisibilityModifier
                    {

                    					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getVisibilityVisibilityModifierParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_visibility_1_0=ruleVisibilityModifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"springboot.automate.GrabDsl.VisibilityModifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGrabDsl.g:750:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:751:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:751:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:752:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3());
            		
            // InternalGrabDsl.g:772:3: ( (lv_type_4_0= ruleType ) )
            // InternalGrabDsl.g:773:4: (lv_type_4_0= ruleType )
            {
            // InternalGrabDsl.g:773:4: (lv_type_4_0= ruleType )
            // InternalGrabDsl.g:774:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"springboot.automate.GrabDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrabDsl.g:791:3: (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGrabDsl.g:792:4: otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalGrabDsl.g:796:4: ( (lv_defaultValue_6_0= RULE_STRING ) )
                    // InternalGrabDsl.g:797:5: (lv_defaultValue_6_0= RULE_STRING )
                    {
                    // InternalGrabDsl.g:797:5: (lv_defaultValue_6_0= RULE_STRING )
                    // InternalGrabDsl.g:798:6: lv_defaultValue_6_0= RULE_STRING
                    {
                    lv_defaultValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_6_0, grammarAccess.getPropertyDefinitionAccess().getDefaultValueSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleParameterDefinition"
    // InternalGrabDsl.g:819:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // InternalGrabDsl.g:819:60: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // InternalGrabDsl.g:820:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getParameterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDefinition=ruleParameterDefinition();

            state._fsp--;

             current =iv_ruleParameterDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDefinition"


    // $ANTLR start "ruleParameterDefinition"
    // InternalGrabDsl.g:826:1: ruleParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:832:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalGrabDsl.g:833:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalGrabDsl.g:833:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalGrabDsl.g:834:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalGrabDsl.g:834:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrabDsl.g:835:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGrabDsl.g:835:4: (lv_name_0_0= RULE_ID )
            // InternalGrabDsl.g:836:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDefinitionAccess().getColonKeyword_1());
            		
            // InternalGrabDsl.g:856:3: ( (lv_type_2_0= ruleType ) )
            // InternalGrabDsl.g:857:4: (lv_type_2_0= ruleType )
            {
            // InternalGrabDsl.g:857:4: (lv_type_2_0= ruleType )
            // InternalGrabDsl.g:858:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterDefinitionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"springboot.automate.GrabDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrabDsl.g:875:3: (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGrabDsl.g:876:4: otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalGrabDsl.g:880:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalGrabDsl.g:881:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalGrabDsl.g:881:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalGrabDsl.g:882:6: lv_defaultValue_4_0= RULE_STRING
                    {
                    lv_defaultValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_4_0, grammarAccess.getParameterDefinitionAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDefinition"


    // $ANTLR start "entryRuleAnnotation"
    // InternalGrabDsl.g:903:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalGrabDsl.g:903:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalGrabDsl.g:904:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalGrabDsl.g:910:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:916:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? ) )
            // InternalGrabDsl.g:917:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? )
            {
            // InternalGrabDsl.g:917:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? )
            // InternalGrabDsl.g:918:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
            		
            // InternalGrabDsl.g:922:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrabDsl.g:923:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrabDsl.g:923:4: (lv_name_1_0= RULE_ID )
            // InternalGrabDsl.g:924:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGrabDsl.g:940:3: (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGrabDsl.g:941:4: otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalGrabDsl.g:945:4: ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalGrabDsl.g:946:5: ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )*
                            {
                            // InternalGrabDsl.g:946:5: ( (lv_arguments_3_0= ruleAnnotationArgument ) )
                            // InternalGrabDsl.g:947:6: (lv_arguments_3_0= ruleAnnotationArgument )
                            {
                            // InternalGrabDsl.g:947:6: (lv_arguments_3_0= ruleAnnotationArgument )
                            // InternalGrabDsl.g:948:7: lv_arguments_3_0= ruleAnnotationArgument
                            {

                            							newCompositeNode(grammarAccess.getAnnotationAccess().getArgumentsAnnotationArgumentParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_19);
                            lv_arguments_3_0=ruleAnnotationArgument();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAnnotationRule());
                            							}
                            							add(
                            								current,
                            								"arguments",
                            								lv_arguments_3_0,
                            								"springboot.automate.GrabDsl.AnnotationArgument");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGrabDsl.g:965:5: (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==19) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalGrabDsl.g:966:6: otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalGrabDsl.g:970:6: ( (lv_arguments_5_0= ruleAnnotationArgument ) )
                            	    // InternalGrabDsl.g:971:7: (lv_arguments_5_0= ruleAnnotationArgument )
                            	    {
                            	    // InternalGrabDsl.g:971:7: (lv_arguments_5_0= ruleAnnotationArgument )
                            	    // InternalGrabDsl.g:972:8: lv_arguments_5_0= ruleAnnotationArgument
                            	    {

                            	    								newCompositeNode(grammarAccess.getAnnotationAccess().getArgumentsAnnotationArgumentParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_19);
                            	    lv_arguments_5_0=ruleAnnotationArgument();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getAnnotationRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"arguments",
                            	    									lv_arguments_5_0,
                            	    									"springboot.automate.GrabDsl.AnnotationArgument");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnnotationArgument"
    // InternalGrabDsl.g:1000:1: entryRuleAnnotationArgument returns [EObject current=null] : iv_ruleAnnotationArgument= ruleAnnotationArgument EOF ;
    public final EObject entryRuleAnnotationArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationArgument = null;


        try {
            // InternalGrabDsl.g:1000:59: (iv_ruleAnnotationArgument= ruleAnnotationArgument EOF )
            // InternalGrabDsl.g:1001:2: iv_ruleAnnotationArgument= ruleAnnotationArgument EOF
            {
             newCompositeNode(grammarAccess.getAnnotationArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationArgument=ruleAnnotationArgument();

            state._fsp--;

             current =iv_ruleAnnotationArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationArgument"


    // $ANTLR start "ruleAnnotationArgument"
    // InternalGrabDsl.g:1007:1: ruleAnnotationArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleBooleanLiteral | lv_value_2_3= ruleQualifiedName ) ) ) ) ;
    public final EObject ruleAnnotationArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        AntlrDatatypeRuleToken lv_value_2_2 = null;

        AntlrDatatypeRuleToken lv_value_2_3 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:1013:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleBooleanLiteral | lv_value_2_3= ruleQualifiedName ) ) ) ) )
            // InternalGrabDsl.g:1014:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleBooleanLiteral | lv_value_2_3= ruleQualifiedName ) ) ) )
            {
            // InternalGrabDsl.g:1014:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleBooleanLiteral | lv_value_2_3= ruleQualifiedName ) ) ) )
            // InternalGrabDsl.g:1015:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleBooleanLiteral | lv_value_2_3= ruleQualifiedName ) ) )
            {
            // InternalGrabDsl.g:1015:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrabDsl.g:1016:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGrabDsl.g:1016:4: (lv_name_0_0= RULE_ID )
            // InternalGrabDsl.g:1017:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAnnotationArgumentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationArgumentAccess().getEqualsSignKeyword_1());
            		
            // InternalGrabDsl.g:1037:3: ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleBooleanLiteral | lv_value_2_3= ruleQualifiedName ) ) )
            // InternalGrabDsl.g:1038:4: ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleBooleanLiteral | lv_value_2_3= ruleQualifiedName ) )
            {
            // InternalGrabDsl.g:1038:4: ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleBooleanLiteral | lv_value_2_3= ruleQualifiedName ) )
            // InternalGrabDsl.g:1039:5: (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleBooleanLiteral | lv_value_2_3= ruleQualifiedName )
            {
            // InternalGrabDsl.g:1039:5: (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleBooleanLiteral | lv_value_2_3= ruleQualifiedName )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt23=1;
                }
                break;
            case 25:
            case 26:
                {
                alt23=2;
                }
                break;
            case RULE_ID:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalGrabDsl.g:1040:6: lv_value_2_1= RULE_STRING
                    {
                    lv_value_2_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getAnnotationArgumentAccess().getValueSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnnotationArgumentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:1055:6: lv_value_2_2= ruleBooleanLiteral
                    {

                    						newCompositeNode(grammarAccess.getAnnotationArgumentAccess().getValueBooleanLiteralParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_2=ruleBooleanLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnnotationArgumentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_2,
                    							"springboot.automate.GrabDsl.BooleanLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalGrabDsl.g:1071:6: lv_value_2_3= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getAnnotationArgumentAccess().getValueQualifiedNameParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_3=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnnotationArgumentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_3,
                    							"springboot.automate.GrabDsl.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationArgument"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalGrabDsl.g:1093:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // InternalGrabDsl.g:1093:54: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGrabDsl.g:1094:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalGrabDsl.g:1100:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1106:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGrabDsl.g:1107:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGrabDsl.g:1107:2: (kw= 'true' | kw= 'false' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            else if ( (LA24_0==26) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGrabDsl.g:1108:3: kw= 'true'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:1114:3: kw= 'false'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleVisibilityModifier"
    // InternalGrabDsl.g:1123:1: entryRuleVisibilityModifier returns [String current=null] : iv_ruleVisibilityModifier= ruleVisibilityModifier EOF ;
    public final String entryRuleVisibilityModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVisibilityModifier = null;


        try {
            // InternalGrabDsl.g:1123:58: (iv_ruleVisibilityModifier= ruleVisibilityModifier EOF )
            // InternalGrabDsl.g:1124:2: iv_ruleVisibilityModifier= ruleVisibilityModifier EOF
            {
             newCompositeNode(grammarAccess.getVisibilityModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisibilityModifier=ruleVisibilityModifier();

            state._fsp--;

             current =iv_ruleVisibilityModifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibilityModifier"


    // $ANTLR start "ruleVisibilityModifier"
    // InternalGrabDsl.g:1130:1: ruleVisibilityModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'public' | kw= 'private' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleVisibilityModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1136:2: ( (kw= 'public' | kw= 'private' | kw= 'protected' ) )
            // InternalGrabDsl.g:1137:2: (kw= 'public' | kw= 'private' | kw= 'protected' )
            {
            // InternalGrabDsl.g:1137:2: (kw= 'public' | kw= 'private' | kw= 'protected' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt25=1;
                }
                break;
            case 28:
                {
                alt25=2;
                }
                break;
            case 29:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalGrabDsl.g:1138:3: kw= 'public'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityModifierAccess().getPublicKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:1144:3: kw= 'private'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityModifierAccess().getPrivateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGrabDsl.g:1150:3: kw= 'protected'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityModifierAccess().getProtectedKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityModifier"


    // $ANTLR start "entryRuleType"
    // InternalGrabDsl.g:1159:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalGrabDsl.g:1159:44: (iv_ruleType= ruleType EOF )
            // InternalGrabDsl.g:1160:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGrabDsl.g:1166:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveType_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_1 = null;

        AntlrDatatypeRuleToken this_GenericType_2 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:1172:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType ) )
            // InternalGrabDsl.g:1173:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType )
            {
            // InternalGrabDsl.g:1173:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType )
            int alt26=3;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalGrabDsl.g:1174:3: this_PrimitiveType_0= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                    			current.merge(this_PrimitiveType_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:1185:3: this_QualifiedName_1= ruleQualifiedName
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getQualifiedNameParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedName_1=ruleQualifiedName();

                    state._fsp--;


                    			current.merge(this_QualifiedName_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGrabDsl.g:1196:3: this_GenericType_2= ruleGenericType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getGenericTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GenericType_2=ruleGenericType();

                    state._fsp--;


                    			current.merge(this_GenericType_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalGrabDsl.g:1210:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // InternalGrabDsl.g:1210:53: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalGrabDsl.g:1211:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalGrabDsl.g:1217:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'String' | kw= 'double' | kw= 'float' | kw= 'int' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' | kw= 'Optional' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1223:2: ( (kw= 'void' | kw= 'String' | kw= 'double' | kw= 'float' | kw= 'int' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' | kw= 'Optional' ) )
            // InternalGrabDsl.g:1224:2: (kw= 'void' | kw= 'String' | kw= 'double' | kw= 'float' | kw= 'int' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' | kw= 'Optional' )
            {
            // InternalGrabDsl.g:1224:2: (kw= 'void' | kw= 'String' | kw= 'double' | kw= 'float' | kw= 'int' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' | kw= 'Optional' )
            int alt27=10;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt27=1;
                }
                break;
            case 31:
                {
                alt27=2;
                }
                break;
            case 32:
                {
                alt27=3;
                }
                break;
            case 33:
                {
                alt27=4;
                }
                break;
            case 34:
                {
                alt27=5;
                }
                break;
            case 35:
                {
                alt27=6;
                }
                break;
            case 36:
                {
                alt27=7;
                }
                break;
            case 37:
                {
                alt27=8;
                }
                break;
            case 38:
                {
                alt27=9;
                }
                break;
            case 39:
                {
                alt27=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalGrabDsl.g:1225:3: kw= 'void'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getVoidKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:1231:3: kw= 'String'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGrabDsl.g:1237:3: kw= 'double'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getDoubleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGrabDsl.g:1243:3: kw= 'float'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getFloatKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGrabDsl.g:1249:3: kw= 'int'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getIntKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalGrabDsl.g:1255:3: kw= 'UUID'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getUUIDKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalGrabDsl.g:1261:3: kw= 'Date'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getDateKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalGrabDsl.g:1267:3: kw= 'Timestamp'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getTimestampKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalGrabDsl.g:1273:3: kw= 'List'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getListKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalGrabDsl.g:1279:3: kw= 'Optional'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getOptionalKeyword_9());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalGrabDsl.g:1288:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalGrabDsl.g:1288:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalGrabDsl.g:1289:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalGrabDsl.g:1295:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1301:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalGrabDsl.g:1302:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalGrabDsl.g:1302:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalGrabDsl.g:1303:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalGrabDsl.g:1310:3: (kw= '.' this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGrabDsl.g:1311:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleGenericType"
    // InternalGrabDsl.g:1328:1: entryRuleGenericType returns [String current=null] : iv_ruleGenericType= ruleGenericType EOF ;
    public final String entryRuleGenericType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGenericType = null;


        try {
            // InternalGrabDsl.g:1328:51: (iv_ruleGenericType= ruleGenericType EOF )
            // InternalGrabDsl.g:1329:2: iv_ruleGenericType= ruleGenericType EOF
            {
             newCompositeNode(grammarAccess.getGenericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericType=ruleGenericType();

            state._fsp--;

             current =iv_ruleGenericType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericType"


    // $ANTLR start "ruleGenericType"
    // InternalGrabDsl.g:1335:1: ruleGenericType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_QualifiedName_0= ruleQualifiedName | this_PrimitiveType_1= rulePrimitiveType ) kw= '<' this_Type_3= ruleType kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleGenericType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_PrimitiveType_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:1341:2: ( ( (this_QualifiedName_0= ruleQualifiedName | this_PrimitiveType_1= rulePrimitiveType ) kw= '<' this_Type_3= ruleType kw= '>' ) )
            // InternalGrabDsl.g:1342:2: ( (this_QualifiedName_0= ruleQualifiedName | this_PrimitiveType_1= rulePrimitiveType ) kw= '<' this_Type_3= ruleType kw= '>' )
            {
            // InternalGrabDsl.g:1342:2: ( (this_QualifiedName_0= ruleQualifiedName | this_PrimitiveType_1= rulePrimitiveType ) kw= '<' this_Type_3= ruleType kw= '>' )
            // InternalGrabDsl.g:1343:3: (this_QualifiedName_0= ruleQualifiedName | this_PrimitiveType_1= rulePrimitiveType ) kw= '<' this_Type_3= ruleType kw= '>'
            {
            // InternalGrabDsl.g:1343:3: (this_QualifiedName_0= ruleQualifiedName | this_PrimitiveType_1= rulePrimitiveType )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=30 && LA29_0<=39)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGrabDsl.g:1344:4: this_QualifiedName_0= ruleQualifiedName
                    {

                    				newCompositeNode(grammarAccess.getGenericTypeAccess().getQualifiedNameParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_15);
                    this_QualifiedName_0=ruleQualifiedName();

                    state._fsp--;


                    				current.merge(this_QualifiedName_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:1355:4: this_PrimitiveType_1= rulePrimitiveType
                    {

                    				newCompositeNode(grammarAccess.getGenericTypeAccess().getPrimitiveTypeParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_PrimitiveType_1=rulePrimitiveType();

                    state._fsp--;


                    				current.merge(this_PrimitiveType_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            kw=(Token)match(input,41,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getGenericTypeAccess().getLessThanSignKeyword_1());
            		

            			newCompositeNode(grammarAccess.getGenericTypeAccess().getTypeParserRuleCall_2());
            		
            pushFollow(FOLLOW_29);
            this_Type_3=ruleType();

            state._fsp--;


            			current.merge(this_Type_3);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,42,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getGenericTypeAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericType"


    // $ANTLR start "entryRuleEntityType"
    // InternalGrabDsl.g:1390:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalGrabDsl.g:1390:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalGrabDsl.g:1391:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalGrabDsl.g:1397:1: ruleEntityType returns [EObject current=null] : (otherlv_0= '<' ( (lv_entity_1_0= ruleType ) ) otherlv_2= ',' ( (lv_key_3_0= ruleType ) ) otherlv_4= '>' ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_entity_1_0 = null;

        AntlrDatatypeRuleToken lv_key_3_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:1403:2: ( (otherlv_0= '<' ( (lv_entity_1_0= ruleType ) ) otherlv_2= ',' ( (lv_key_3_0= ruleType ) ) otherlv_4= '>' ) )
            // InternalGrabDsl.g:1404:2: (otherlv_0= '<' ( (lv_entity_1_0= ruleType ) ) otherlv_2= ',' ( (lv_key_3_0= ruleType ) ) otherlv_4= '>' )
            {
            // InternalGrabDsl.g:1404:2: (otherlv_0= '<' ( (lv_entity_1_0= ruleType ) ) otherlv_2= ',' ( (lv_key_3_0= ruleType ) ) otherlv_4= '>' )
            // InternalGrabDsl.g:1405:3: otherlv_0= '<' ( (lv_entity_1_0= ruleType ) ) otherlv_2= ',' ( (lv_key_3_0= ruleType ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getLessThanSignKeyword_0());
            		
            // InternalGrabDsl.g:1409:3: ( (lv_entity_1_0= ruleType ) )
            // InternalGrabDsl.g:1410:4: (lv_entity_1_0= ruleType )
            {
            // InternalGrabDsl.g:1410:4: (lv_entity_1_0= ruleType )
            // InternalGrabDsl.g:1411:5: lv_entity_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEntityTypeAccess().getEntityTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_entity_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityTypeRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_1_0,
            						"springboot.automate.GrabDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityTypeAccess().getCommaKeyword_2());
            		
            // InternalGrabDsl.g:1432:3: ( (lv_key_3_0= ruleType ) )
            // InternalGrabDsl.g:1433:4: (lv_key_3_0= ruleType )
            {
            // InternalGrabDsl.g:1433:4: (lv_key_3_0= ruleType )
            // InternalGrabDsl.g:1434:5: lv_key_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEntityTypeAccess().getKeyTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_key_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityTypeRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_3_0,
            						"springboot.automate.GrabDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityTypeAccess().getGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRulePomXml"
    // InternalGrabDsl.g:1459:1: entryRulePomXml returns [EObject current=null] : iv_rulePomXml= rulePomXml EOF ;
    public final EObject entryRulePomXml() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePomXml = null;


        try {
            // InternalGrabDsl.g:1459:47: (iv_rulePomXml= rulePomXml EOF )
            // InternalGrabDsl.g:1460:2: iv_rulePomXml= rulePomXml EOF
            {
             newCompositeNode(grammarAccess.getPomXmlRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePomXml=rulePomXml();

            state._fsp--;

             current =iv_rulePomXml; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePomXml"


    // $ANTLR start "rulePomXml"
    // InternalGrabDsl.g:1466:1: rulePomXml returns [EObject current=null] : (otherlv_0= 'pomXml' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) otherlv_11= 'packaging' otherlv_12= '=' ( (lv_packaging_13_0= RULE_STRING ) ) ( (lv_properties_14_0= ruleProperties ) ) ( (lv_dependencies_15_0= ruleDependencies ) ) ( (lv_build_16_0= ruleBuild ) ) otherlv_17= '}' ) ;
    public final EObject rulePomXml() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_groupId_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_artifactId_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_version_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_packaging_13_0=null;
        Token otherlv_17=null;
        EObject lv_properties_14_0 = null;

        EObject lv_dependencies_15_0 = null;

        EObject lv_build_16_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:1472:2: ( (otherlv_0= 'pomXml' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) otherlv_11= 'packaging' otherlv_12= '=' ( (lv_packaging_13_0= RULE_STRING ) ) ( (lv_properties_14_0= ruleProperties ) ) ( (lv_dependencies_15_0= ruleDependencies ) ) ( (lv_build_16_0= ruleBuild ) ) otherlv_17= '}' ) )
            // InternalGrabDsl.g:1473:2: (otherlv_0= 'pomXml' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) otherlv_11= 'packaging' otherlv_12= '=' ( (lv_packaging_13_0= RULE_STRING ) ) ( (lv_properties_14_0= ruleProperties ) ) ( (lv_dependencies_15_0= ruleDependencies ) ) ( (lv_build_16_0= ruleBuild ) ) otherlv_17= '}' )
            {
            // InternalGrabDsl.g:1473:2: (otherlv_0= 'pomXml' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) otherlv_11= 'packaging' otherlv_12= '=' ( (lv_packaging_13_0= RULE_STRING ) ) ( (lv_properties_14_0= ruleProperties ) ) ( (lv_dependencies_15_0= ruleDependencies ) ) ( (lv_build_16_0= ruleBuild ) ) otherlv_17= '}' )
            // InternalGrabDsl.g:1474:3: otherlv_0= 'pomXml' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) otherlv_11= 'packaging' otherlv_12= '=' ( (lv_packaging_13_0= RULE_STRING ) ) ( (lv_properties_14_0= ruleProperties ) ) ( (lv_dependencies_15_0= ruleDependencies ) ) ( (lv_build_16_0= ruleBuild ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPomXmlAccess().getPomXmlKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getPomXmlAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPomXmlAccess().getGroupIdKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getPomXmlAccess().getEqualsSignKeyword_3());
            		
            // InternalGrabDsl.g:1490:3: ( (lv_groupId_4_0= RULE_STRING ) )
            // InternalGrabDsl.g:1491:4: (lv_groupId_4_0= RULE_STRING )
            {
            // InternalGrabDsl.g:1491:4: (lv_groupId_4_0= RULE_STRING )
            // InternalGrabDsl.g:1492:5: lv_groupId_4_0= RULE_STRING
            {
            lv_groupId_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_groupId_4_0, grammarAccess.getPomXmlAccess().getGroupIdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPomXmlRule());
            					}
            					setWithLastConsumed(
            						current,
            						"groupId",
            						lv_groupId_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,45,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getPomXmlAccess().getArtifactIdKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getPomXmlAccess().getEqualsSignKeyword_6());
            		
            // InternalGrabDsl.g:1516:3: ( (lv_artifactId_7_0= RULE_STRING ) )
            // InternalGrabDsl.g:1517:4: (lv_artifactId_7_0= RULE_STRING )
            {
            // InternalGrabDsl.g:1517:4: (lv_artifactId_7_0= RULE_STRING )
            // InternalGrabDsl.g:1518:5: lv_artifactId_7_0= RULE_STRING
            {
            lv_artifactId_7_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_artifactId_7_0, grammarAccess.getPomXmlAccess().getArtifactIdSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPomXmlRule());
            					}
            					setWithLastConsumed(
            						current,
            						"artifactId",
            						lv_artifactId_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getPomXmlAccess().getVersionKeyword_8());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getPomXmlAccess().getEqualsSignKeyword_9());
            		
            // InternalGrabDsl.g:1542:3: ( (lv_version_10_0= RULE_STRING ) )
            // InternalGrabDsl.g:1543:4: (lv_version_10_0= RULE_STRING )
            {
            // InternalGrabDsl.g:1543:4: (lv_version_10_0= RULE_STRING )
            // InternalGrabDsl.g:1544:5: lv_version_10_0= RULE_STRING
            {
            lv_version_10_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_version_10_0, grammarAccess.getPomXmlAccess().getVersionSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPomXmlRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,47,FOLLOW_26); 

            			newLeafNode(otherlv_11, grammarAccess.getPomXmlAccess().getPackagingKeyword_11());
            		
            otherlv_12=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_12, grammarAccess.getPomXmlAccess().getEqualsSignKeyword_12());
            		
            // InternalGrabDsl.g:1568:3: ( (lv_packaging_13_0= RULE_STRING ) )
            // InternalGrabDsl.g:1569:4: (lv_packaging_13_0= RULE_STRING )
            {
            // InternalGrabDsl.g:1569:4: (lv_packaging_13_0= RULE_STRING )
            // InternalGrabDsl.g:1570:5: lv_packaging_13_0= RULE_STRING
            {
            lv_packaging_13_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_packaging_13_0, grammarAccess.getPomXmlAccess().getPackagingSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPomXmlRule());
            					}
            					setWithLastConsumed(
            						current,
            						"packaging",
            						lv_packaging_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGrabDsl.g:1586:3: ( (lv_properties_14_0= ruleProperties ) )
            // InternalGrabDsl.g:1587:4: (lv_properties_14_0= ruleProperties )
            {
            // InternalGrabDsl.g:1587:4: (lv_properties_14_0= ruleProperties )
            // InternalGrabDsl.g:1588:5: lv_properties_14_0= ruleProperties
            {

            					newCompositeNode(grammarAccess.getPomXmlAccess().getPropertiesPropertiesParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_36);
            lv_properties_14_0=ruleProperties();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPomXmlRule());
            					}
            					set(
            						current,
            						"properties",
            						lv_properties_14_0,
            						"springboot.automate.GrabDsl.Properties");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrabDsl.g:1605:3: ( (lv_dependencies_15_0= ruleDependencies ) )
            // InternalGrabDsl.g:1606:4: (lv_dependencies_15_0= ruleDependencies )
            {
            // InternalGrabDsl.g:1606:4: (lv_dependencies_15_0= ruleDependencies )
            // InternalGrabDsl.g:1607:5: lv_dependencies_15_0= ruleDependencies
            {

            					newCompositeNode(grammarAccess.getPomXmlAccess().getDependenciesDependenciesParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_37);
            lv_dependencies_15_0=ruleDependencies();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPomXmlRule());
            					}
            					set(
            						current,
            						"dependencies",
            						lv_dependencies_15_0,
            						"springboot.automate.GrabDsl.Dependencies");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrabDsl.g:1624:3: ( (lv_build_16_0= ruleBuild ) )
            // InternalGrabDsl.g:1625:4: (lv_build_16_0= ruleBuild )
            {
            // InternalGrabDsl.g:1625:4: (lv_build_16_0= ruleBuild )
            // InternalGrabDsl.g:1626:5: lv_build_16_0= ruleBuild
            {

            					newCompositeNode(grammarAccess.getPomXmlAccess().getBuildBuildParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_38);
            lv_build_16_0=ruleBuild();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPomXmlRule());
            					}
            					set(
            						current,
            						"build",
            						lv_build_16_0,
            						"springboot.automate.GrabDsl.Build");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getPomXmlAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePomXml"


    // $ANTLR start "entryRuleProperties"
    // InternalGrabDsl.g:1651:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // InternalGrabDsl.g:1651:51: (iv_ruleProperties= ruleProperties EOF )
            // InternalGrabDsl.g:1652:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalGrabDsl.g:1658:1: ruleProperties returns [EObject current=null] : (otherlv_0= 'properties' otherlv_1= '{' otherlv_2= 'javaVersion' otherlv_3= '=' ( (lv_javaVersion_4_0= RULE_STRING ) ) otherlv_5= 'springBootVersion' otherlv_6= '=' ( (lv_springBootVersion_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_javaVersion_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_springBootVersion_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1664:2: ( (otherlv_0= 'properties' otherlv_1= '{' otherlv_2= 'javaVersion' otherlv_3= '=' ( (lv_javaVersion_4_0= RULE_STRING ) ) otherlv_5= 'springBootVersion' otherlv_6= '=' ( (lv_springBootVersion_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalGrabDsl.g:1665:2: (otherlv_0= 'properties' otherlv_1= '{' otherlv_2= 'javaVersion' otherlv_3= '=' ( (lv_javaVersion_4_0= RULE_STRING ) ) otherlv_5= 'springBootVersion' otherlv_6= '=' ( (lv_springBootVersion_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalGrabDsl.g:1665:2: (otherlv_0= 'properties' otherlv_1= '{' otherlv_2= 'javaVersion' otherlv_3= '=' ( (lv_javaVersion_4_0= RULE_STRING ) ) otherlv_5= 'springBootVersion' otherlv_6= '=' ( (lv_springBootVersion_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalGrabDsl.g:1666:3: otherlv_0= 'properties' otherlv_1= '{' otherlv_2= 'javaVersion' otherlv_3= '=' ( (lv_javaVersion_4_0= RULE_STRING ) ) otherlv_5= 'springBootVersion' otherlv_6= '=' ( (lv_springBootVersion_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertiesAccess().getPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertiesAccess().getJavaVersionKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertiesAccess().getEqualsSignKeyword_3());
            		
            // InternalGrabDsl.g:1682:3: ( (lv_javaVersion_4_0= RULE_STRING ) )
            // InternalGrabDsl.g:1683:4: (lv_javaVersion_4_0= RULE_STRING )
            {
            // InternalGrabDsl.g:1683:4: (lv_javaVersion_4_0= RULE_STRING )
            // InternalGrabDsl.g:1684:5: lv_javaVersion_4_0= RULE_STRING
            {
            lv_javaVersion_4_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_javaVersion_4_0, grammarAccess.getPropertiesAccess().getJavaVersionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"javaVersion",
            						lv_javaVersion_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertiesAccess().getSpringBootVersionKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getPropertiesAccess().getEqualsSignKeyword_6());
            		
            // InternalGrabDsl.g:1708:3: ( (lv_springBootVersion_7_0= RULE_STRING ) )
            // InternalGrabDsl.g:1709:4: (lv_springBootVersion_7_0= RULE_STRING )
            {
            // InternalGrabDsl.g:1709:4: (lv_springBootVersion_7_0= RULE_STRING )
            // InternalGrabDsl.g:1710:5: lv_springBootVersion_7_0= RULE_STRING
            {
            lv_springBootVersion_7_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_springBootVersion_7_0, grammarAccess.getPropertiesAccess().getSpringBootVersionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"springBootVersion",
            						lv_springBootVersion_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleDependencies"
    // InternalGrabDsl.g:1734:1: entryRuleDependencies returns [EObject current=null] : iv_ruleDependencies= ruleDependencies EOF ;
    public final EObject entryRuleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencies = null;


        try {
            // InternalGrabDsl.g:1734:53: (iv_ruleDependencies= ruleDependencies EOF )
            // InternalGrabDsl.g:1735:2: iv_ruleDependencies= ruleDependencies EOF
            {
             newCompositeNode(grammarAccess.getDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencies=ruleDependencies();

            state._fsp--;

             current =iv_ruleDependencies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencies"


    // $ANTLR start "ruleDependencies"
    // InternalGrabDsl.g:1741:1: ruleDependencies returns [EObject current=null] : ( () otherlv_1= 'dependencies' otherlv_2= '{' ( (lv_dependencies_3_0= ruleDependency ) )* otherlv_4= '}' ) ;
    public final EObject ruleDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dependencies_3_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:1747:2: ( ( () otherlv_1= 'dependencies' otherlv_2= '{' ( (lv_dependencies_3_0= ruleDependency ) )* otherlv_4= '}' ) )
            // InternalGrabDsl.g:1748:2: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( (lv_dependencies_3_0= ruleDependency ) )* otherlv_4= '}' )
            {
            // InternalGrabDsl.g:1748:2: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( (lv_dependencies_3_0= ruleDependency ) )* otherlv_4= '}' )
            // InternalGrabDsl.g:1749:3: () otherlv_1= 'dependencies' otherlv_2= '{' ( (lv_dependencies_3_0= ruleDependency ) )* otherlv_4= '}'
            {
            // InternalGrabDsl.g:1749:3: ()
            // InternalGrabDsl.g:1750:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependenciesAccess().getDependenciesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDependenciesAccess().getDependenciesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrabDsl.g:1764:3: ( (lv_dependencies_3_0= ruleDependency ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==52) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGrabDsl.g:1765:4: (lv_dependencies_3_0= ruleDependency )
            	    {
            	    // InternalGrabDsl.g:1765:4: (lv_dependencies_3_0= ruleDependency )
            	    // InternalGrabDsl.g:1766:5: lv_dependencies_3_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getDependenciesAccess().getDependenciesDependencyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_dependencies_3_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_3_0,
            	    						"springboot.automate.GrabDsl.Dependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDependenciesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencies"


    // $ANTLR start "entryRuleDependency"
    // InternalGrabDsl.g:1791:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalGrabDsl.g:1791:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalGrabDsl.g:1792:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalGrabDsl.g:1798:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'dependency' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) (otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) )? (otherlv_11= 'scope' otherlv_12= '=' ( (lv_scope_13_0= RULE_STRING ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_groupId_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_artifactId_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_version_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_scope_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1804:2: ( (otherlv_0= 'dependency' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) (otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) )? (otherlv_11= 'scope' otherlv_12= '=' ( (lv_scope_13_0= RULE_STRING ) ) )? otherlv_14= '}' ) )
            // InternalGrabDsl.g:1805:2: (otherlv_0= 'dependency' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) (otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) )? (otherlv_11= 'scope' otherlv_12= '=' ( (lv_scope_13_0= RULE_STRING ) ) )? otherlv_14= '}' )
            {
            // InternalGrabDsl.g:1805:2: (otherlv_0= 'dependency' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) (otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) )? (otherlv_11= 'scope' otherlv_12= '=' ( (lv_scope_13_0= RULE_STRING ) ) )? otherlv_14= '}' )
            // InternalGrabDsl.g:1806:3: otherlv_0= 'dependency' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) (otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) )? (otherlv_11= 'scope' otherlv_12= '=' ( (lv_scope_13_0= RULE_STRING ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependencyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getGroupIdKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getEqualsSignKeyword_3());
            		
            // InternalGrabDsl.g:1822:3: ( (lv_groupId_4_0= RULE_STRING ) )
            // InternalGrabDsl.g:1823:4: (lv_groupId_4_0= RULE_STRING )
            {
            // InternalGrabDsl.g:1823:4: (lv_groupId_4_0= RULE_STRING )
            // InternalGrabDsl.g:1824:5: lv_groupId_4_0= RULE_STRING
            {
            lv_groupId_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_groupId_4_0, grammarAccess.getDependencyAccess().getGroupIdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"groupId",
            						lv_groupId_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,45,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getDependencyAccess().getArtifactIdKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getDependencyAccess().getEqualsSignKeyword_6());
            		
            // InternalGrabDsl.g:1848:3: ( (lv_artifactId_7_0= RULE_STRING ) )
            // InternalGrabDsl.g:1849:4: (lv_artifactId_7_0= RULE_STRING )
            {
            // InternalGrabDsl.g:1849:4: (lv_artifactId_7_0= RULE_STRING )
            // InternalGrabDsl.g:1850:5: lv_artifactId_7_0= RULE_STRING
            {
            lv_artifactId_7_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_artifactId_7_0, grammarAccess.getDependencyAccess().getArtifactIdSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"artifactId",
            						lv_artifactId_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGrabDsl.g:1866:3: (otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGrabDsl.g:1867:4: otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getDependencyAccess().getVersionKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,23,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getDependencyAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalGrabDsl.g:1875:4: ( (lv_version_10_0= RULE_STRING ) )
                    // InternalGrabDsl.g:1876:5: (lv_version_10_0= RULE_STRING )
                    {
                    // InternalGrabDsl.g:1876:5: (lv_version_10_0= RULE_STRING )
                    // InternalGrabDsl.g:1877:6: lv_version_10_0= RULE_STRING
                    {
                    lv_version_10_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    						newLeafNode(lv_version_10_0, grammarAccess.getDependencyAccess().getVersionSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependencyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"version",
                    							lv_version_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGrabDsl.g:1894:3: (otherlv_11= 'scope' otherlv_12= '=' ( (lv_scope_13_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==53) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGrabDsl.g:1895:4: otherlv_11= 'scope' otherlv_12= '=' ( (lv_scope_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,53,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getDependencyAccess().getScopeKeyword_9_0());
                    			
                    otherlv_12=(Token)match(input,23,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getDependencyAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalGrabDsl.g:1903:4: ( (lv_scope_13_0= RULE_STRING ) )
                    // InternalGrabDsl.g:1904:5: (lv_scope_13_0= RULE_STRING )
                    {
                    // InternalGrabDsl.g:1904:5: (lv_scope_13_0= RULE_STRING )
                    // InternalGrabDsl.g:1905:6: lv_scope_13_0= RULE_STRING
                    {
                    lv_scope_13_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

                    						newLeafNode(lv_scope_13_0, grammarAccess.getDependencyAccess().getScopeSTRINGTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependencyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"scope",
                    							lv_scope_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleBuild"
    // InternalGrabDsl.g:1930:1: entryRuleBuild returns [EObject current=null] : iv_ruleBuild= ruleBuild EOF ;
    public final EObject entryRuleBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuild = null;


        try {
            // InternalGrabDsl.g:1930:46: (iv_ruleBuild= ruleBuild EOF )
            // InternalGrabDsl.g:1931:2: iv_ruleBuild= ruleBuild EOF
            {
             newCompositeNode(grammarAccess.getBuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuild=ruleBuild();

            state._fsp--;

             current =iv_ruleBuild; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuild"


    // $ANTLR start "ruleBuild"
    // InternalGrabDsl.g:1937:1: ruleBuild returns [EObject current=null] : ( () otherlv_1= 'build' otherlv_2= '{' otherlv_3= 'plugins' otherlv_4= '{' ( (lv_plugins_5_0= rulePlugin ) )* otherlv_6= '}' otherlv_7= '}' ) ;
    public final EObject ruleBuild() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_plugins_5_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:1943:2: ( ( () otherlv_1= 'build' otherlv_2= '{' otherlv_3= 'plugins' otherlv_4= '{' ( (lv_plugins_5_0= rulePlugin ) )* otherlv_6= '}' otherlv_7= '}' ) )
            // InternalGrabDsl.g:1944:2: ( () otherlv_1= 'build' otherlv_2= '{' otherlv_3= 'plugins' otherlv_4= '{' ( (lv_plugins_5_0= rulePlugin ) )* otherlv_6= '}' otherlv_7= '}' )
            {
            // InternalGrabDsl.g:1944:2: ( () otherlv_1= 'build' otherlv_2= '{' otherlv_3= 'plugins' otherlv_4= '{' ( (lv_plugins_5_0= rulePlugin ) )* otherlv_6= '}' otherlv_7= '}' )
            // InternalGrabDsl.g:1945:3: () otherlv_1= 'build' otherlv_2= '{' otherlv_3= 'plugins' otherlv_4= '{' ( (lv_plugins_5_0= rulePlugin ) )* otherlv_6= '}' otherlv_7= '}'
            {
            // InternalGrabDsl.g:1945:3: ()
            // InternalGrabDsl.g:1946:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildAccess().getBuildAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildAccess().getBuildKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getBuildAccess().getPluginsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGrabDsl.g:1968:3: ( (lv_plugins_5_0= rulePlugin ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==56) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGrabDsl.g:1969:4: (lv_plugins_5_0= rulePlugin )
            	    {
            	    // InternalGrabDsl.g:1969:4: (lv_plugins_5_0= rulePlugin )
            	    // InternalGrabDsl.g:1970:5: lv_plugins_5_0= rulePlugin
            	    {

            	    					newCompositeNode(grammarAccess.getBuildAccess().getPluginsPluginParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_plugins_5_0=rulePlugin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBuildRule());
            	    					}
            	    					add(
            	    						current,
            	    						"plugins",
            	    						lv_plugins_5_0,
            	    						"springboot.automate.GrabDsl.Plugin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuild"


    // $ANTLR start "entryRulePlugin"
    // InternalGrabDsl.g:1999:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // InternalGrabDsl.g:1999:47: (iv_rulePlugin= rulePlugin EOF )
            // InternalGrabDsl.g:2000:2: iv_rulePlugin= rulePlugin EOF
            {
             newCompositeNode(grammarAccess.getPluginRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlugin=rulePlugin();

            state._fsp--;

             current =iv_rulePlugin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlugin"


    // $ANTLR start "rulePlugin"
    // InternalGrabDsl.g:2006:1: rulePlugin returns [EObject current=null] : (otherlv_0= 'plugin' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) ( (lv_configuration_11_0= ruleConfiguration ) ) otherlv_12= '}' ) ;
    public final EObject rulePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_groupId_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_artifactId_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_version_10_0=null;
        Token otherlv_12=null;
        EObject lv_configuration_11_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:2012:2: ( (otherlv_0= 'plugin' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) ( (lv_configuration_11_0= ruleConfiguration ) ) otherlv_12= '}' ) )
            // InternalGrabDsl.g:2013:2: (otherlv_0= 'plugin' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) ( (lv_configuration_11_0= ruleConfiguration ) ) otherlv_12= '}' )
            {
            // InternalGrabDsl.g:2013:2: (otherlv_0= 'plugin' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) ( (lv_configuration_11_0= ruleConfiguration ) ) otherlv_12= '}' )
            // InternalGrabDsl.g:2014:3: otherlv_0= 'plugin' otherlv_1= '{' otherlv_2= 'groupId' otherlv_3= '=' ( (lv_groupId_4_0= RULE_STRING ) ) otherlv_5= 'artifactId' otherlv_6= '=' ( (lv_artifactId_7_0= RULE_STRING ) ) otherlv_8= 'version' otherlv_9= '=' ( (lv_version_10_0= RULE_STRING ) ) ( (lv_configuration_11_0= ruleConfiguration ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPluginAccess().getPluginKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPluginAccess().getGroupIdKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getPluginAccess().getEqualsSignKeyword_3());
            		
            // InternalGrabDsl.g:2030:3: ( (lv_groupId_4_0= RULE_STRING ) )
            // InternalGrabDsl.g:2031:4: (lv_groupId_4_0= RULE_STRING )
            {
            // InternalGrabDsl.g:2031:4: (lv_groupId_4_0= RULE_STRING )
            // InternalGrabDsl.g:2032:5: lv_groupId_4_0= RULE_STRING
            {
            lv_groupId_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_groupId_4_0, grammarAccess.getPluginAccess().getGroupIdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPluginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"groupId",
            						lv_groupId_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,45,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getPluginAccess().getArtifactIdKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getPluginAccess().getEqualsSignKeyword_6());
            		
            // InternalGrabDsl.g:2056:3: ( (lv_artifactId_7_0= RULE_STRING ) )
            // InternalGrabDsl.g:2057:4: (lv_artifactId_7_0= RULE_STRING )
            {
            // InternalGrabDsl.g:2057:4: (lv_artifactId_7_0= RULE_STRING )
            // InternalGrabDsl.g:2058:5: lv_artifactId_7_0= RULE_STRING
            {
            lv_artifactId_7_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_artifactId_7_0, grammarAccess.getPluginAccess().getArtifactIdSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPluginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"artifactId",
            						lv_artifactId_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getPluginAccess().getVersionKeyword_8());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getPluginAccess().getEqualsSignKeyword_9());
            		
            // InternalGrabDsl.g:2082:3: ( (lv_version_10_0= RULE_STRING ) )
            // InternalGrabDsl.g:2083:4: (lv_version_10_0= RULE_STRING )
            {
            // InternalGrabDsl.g:2083:4: (lv_version_10_0= RULE_STRING )
            // InternalGrabDsl.g:2084:5: lv_version_10_0= RULE_STRING
            {
            lv_version_10_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_version_10_0, grammarAccess.getPluginAccess().getVersionSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPluginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGrabDsl.g:2100:3: ( (lv_configuration_11_0= ruleConfiguration ) )
            // InternalGrabDsl.g:2101:4: (lv_configuration_11_0= ruleConfiguration )
            {
            // InternalGrabDsl.g:2101:4: (lv_configuration_11_0= ruleConfiguration )
            // InternalGrabDsl.g:2102:5: lv_configuration_11_0= ruleConfiguration
            {

            					newCompositeNode(grammarAccess.getPluginAccess().getConfigurationConfigurationParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_38);
            lv_configuration_11_0=ruleConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPluginRule());
            					}
            					set(
            						current,
            						"configuration",
            						lv_configuration_11_0,
            						"springboot.automate.GrabDsl.Configuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlugin"


    // $ANTLR start "entryRuleConfiguration"
    // InternalGrabDsl.g:2127:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalGrabDsl.g:2127:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalGrabDsl.g:2128:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalGrabDsl.g:2134:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'configuration' otherlv_1= '{' otherlv_2= 'source' otherlv_3= '=' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'target' otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_target_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:2140:2: ( (otherlv_0= 'configuration' otherlv_1= '{' otherlv_2= 'source' otherlv_3= '=' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'target' otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalGrabDsl.g:2141:2: (otherlv_0= 'configuration' otherlv_1= '{' otherlv_2= 'source' otherlv_3= '=' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'target' otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalGrabDsl.g:2141:2: (otherlv_0= 'configuration' otherlv_1= '{' otherlv_2= 'source' otherlv_3= '=' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'target' otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalGrabDsl.g:2142:3: otherlv_0= 'configuration' otherlv_1= '{' otherlv_2= 'source' otherlv_3= '=' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'target' otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getSourceKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_3());
            		
            // InternalGrabDsl.g:2158:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalGrabDsl.g:2159:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalGrabDsl.g:2159:4: (lv_source_4_0= RULE_STRING )
            // InternalGrabDsl.g:2160:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            					newLeafNode(lv_source_4_0, grammarAccess.getConfigurationAccess().getSourceSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,59,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getTargetKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_6());
            		
            // InternalGrabDsl.g:2184:3: ( (lv_target_7_0= RULE_STRING ) )
            // InternalGrabDsl.g:2185:4: (lv_target_7_0= RULE_STRING )
            {
            // InternalGrabDsl.g:2185:4: (lv_target_7_0= RULE_STRING )
            // InternalGrabDsl.g:2186:5: lv_target_7_0= RULE_STRING
            {
            lv_target_7_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_target_7_0, grammarAccess.getConfigurationAccess().getTargetSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\15\1\4\2\uffff\1\16\1\4\1\27\1\16\1\4\4\23\2\4\1\27\1\23\1\4\4\23\1\4\1\23";
    static final String dfa_3s = "\1\30\1\4\2\uffff\1\30\1\24\1\27\1\30\1\32\3\24\1\50\2\4\1\27\1\50\1\32\3\24\1\50\1\4\1\50";
    static final String dfa_4s = "\2\uffff\1\2\1\1\24\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\uffff\1\2\7\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\1\2\1\uffff\1\5\5\uffff\1\1",
            "\1\6\17\uffff\1\7",
            "\1\10",
            "\1\3\1\uffff\1\2\7\uffff\1\1",
            "\1\14\1\11\23\uffff\1\12\1\13",
            "\1\15\1\7",
            "\1\15\1\7",
            "\1\15\1\7",
            "\1\15\1\7\23\uffff\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\15\1\7\23\uffff\1\16",
            "\1\25\1\22\23\uffff\1\23\1\24",
            "\1\15\1\7",
            "\1\15\1\7",
            "\1\15\1\7",
            "\1\15\1\7\23\uffff\1\26",
            "\1\27",
            "\1\15\1\7\23\uffff\1\26"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 213:3: ( (lv_classes_4_0= ruleClassDefinition ) )*";
        }
    }
    static final String dfa_7s = "\34\uffff";
    static final String dfa_8s = "\5\4\1\22\1\4\2\uffff\1\4\1\27\2\4\4\23\2\4\1\27\1\23\1\4\4\23\1\4\1\23";
    static final String dfa_9s = "\1\35\4\4\1\25\1\35\2\uffff\1\24\1\27\1\35\1\32\3\24\1\50\2\4\1\27\1\50\1\32\3\24\1\50\1\4\1\50";
    static final String dfa_10s = "\7\uffff\1\2\1\1\23\uffff";
    static final String dfa_11s = "\34\uffff}>";
    static final String[] dfa_12s = {
            "\1\5\23\uffff\1\1\2\uffff\1\2\1\3\1\4",
            "\1\6",
            "\1\5",
            "\1\5",
            "\1\5",
            "\1\10\2\uffff\1\7",
            "\1\5\15\uffff\1\11\5\uffff\1\1\2\uffff\1\2\1\3\1\4",
            "",
            "",
            "\1\12\17\uffff\1\13",
            "\1\14",
            "\1\5\23\uffff\1\1\2\uffff\1\2\1\3\1\4",
            "\1\20\1\15\23\uffff\1\16\1\17",
            "\1\21\1\13",
            "\1\21\1\13",
            "\1\21\1\13",
            "\1\21\1\13\23\uffff\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\21\1\13\23\uffff\1\22",
            "\1\31\1\26\23\uffff\1\27\1\30",
            "\1\21\1\13",
            "\1\21\1\13",
            "\1\21\1\13",
            "\1\21\1\13\23\uffff\1\32",
            "\1\33",
            "\1\21\1\13\23\uffff\1\32"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "497:2: ( ( (lv_method_0_0= ruleMethodDefinition ) ) | ( (lv_property_1_0= rulePropertyDefinition ) ) )";
        }
    }
    static final String dfa_13s = "\21\uffff";
    static final String dfa_14s = "\1\uffff\12\14\1\17\4\uffff\1\17";
    static final String dfa_15s = "\14\4\2\uffff\1\4\1\uffff\1\4";
    static final String dfa_16s = "\1\47\13\52\2\uffff\1\4\1\uffff\1\52";
    static final String dfa_17s = "\14\uffff\1\1\1\3\1\uffff\1\2\1\uffff";
    static final String dfa_18s = "\21\uffff}>";
    static final String[] dfa_19s = {
            "\1\13\31\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\14\10\uffff\1\14\5\uffff\2\14\1\uffff\3\14\2\uffff\3\14\13\uffff\1\15\1\14",
            "\1\14\10\uffff\1\14\5\uffff\2\14\1\uffff\3\14\2\uffff\3\14\13\uffff\1\15\1\14",
            "\1\14\10\uffff\1\14\5\uffff\2\14\1\uffff\3\14\2\uffff\3\14\13\uffff\1\15\1\14",
            "\1\14\10\uffff\1\14\5\uffff\2\14\1\uffff\3\14\2\uffff\3\14\13\uffff\1\15\1\14",
            "\1\14\10\uffff\1\14\5\uffff\2\14\1\uffff\3\14\2\uffff\3\14\13\uffff\1\15\1\14",
            "\1\14\10\uffff\1\14\5\uffff\2\14\1\uffff\3\14\2\uffff\3\14\13\uffff\1\15\1\14",
            "\1\14\10\uffff\1\14\5\uffff\2\14\1\uffff\3\14\2\uffff\3\14\13\uffff\1\15\1\14",
            "\1\14\10\uffff\1\14\5\uffff\2\14\1\uffff\3\14\2\uffff\3\14\13\uffff\1\15\1\14",
            "\1\14\10\uffff\1\14\5\uffff\2\14\1\uffff\3\14\2\uffff\3\14\13\uffff\1\15\1\14",
            "\1\14\10\uffff\1\14\5\uffff\2\14\1\uffff\3\14\2\uffff\3\14\13\uffff\1\15\1\14",
            "\1\17\10\uffff\1\17\5\uffff\2\17\1\uffff\3\17\2\uffff\3\17\12\uffff\1\16\1\15\1\17",
            "",
            "",
            "\1\20",
            "",
            "\1\17\10\uffff\1\17\5\uffff\2\17\1\uffff\3\17\2\uffff\3\17\12\uffff\1\16\1\15\1\17"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1173:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001002800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001016000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001012000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000039002010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000039000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000FFC0000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020400000002000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000002000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000000000000L});

}