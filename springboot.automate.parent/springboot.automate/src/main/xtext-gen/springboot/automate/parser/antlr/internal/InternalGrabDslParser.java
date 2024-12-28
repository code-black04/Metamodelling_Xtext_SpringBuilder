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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'class'", "'implements'", "'interface'", "'('", "','", "')'", "':'", "';'", "'='", "'@'", "'public'", "'private'", "'protected'", "'void'", "'String'", "'double'", "'float'", "'int'", "'UUID'", "'Date'", "'Timestamp'", "'List'", "'.'", "'<'", "'>'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalGrabDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_packages_3_0= rulePackageDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_packages_3_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:77:2: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_packages_3_0= rulePackageDefinition ) )* otherlv_4= '}' ) )
            // InternalGrabDsl.g:78:2: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_packages_3_0= rulePackageDefinition ) )* otherlv_4= '}' )
            {
            // InternalGrabDsl.g:78:2: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_packages_3_0= rulePackageDefinition ) )* otherlv_4= '}' )
            // InternalGrabDsl.g:79:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_packages_3_0= rulePackageDefinition ) )* otherlv_4= '}'
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
            		
            // InternalGrabDsl.g:106:3: ( (lv_packages_3_0= rulePackageDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGrabDsl.g:107:4: (lv_packages_3_0= rulePackageDefinition )
            	    {
            	    // InternalGrabDsl.g:107:4: (lv_packages_3_0= rulePackageDefinition )
            	    // InternalGrabDsl.g:108:5: lv_packages_3_0= rulePackageDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_packages_3_0=rulePackageDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packages",
            	    						lv_packages_3_0,
            	    						"springboot.automate.GrabDsl.PackageDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalGrabDsl.g:133:1: entryRulePackageDefinition returns [EObject current=null] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final EObject entryRulePackageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinition = null;


        try {
            // InternalGrabDsl.g:133:58: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // InternalGrabDsl.g:134:2: iv_rulePackageDefinition= rulePackageDefinition EOF
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
    // InternalGrabDsl.g:140:1: rulePackageDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )* otherlv_6= '}' ) ;
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
            // InternalGrabDsl.g:146:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )* otherlv_6= '}' ) )
            // InternalGrabDsl.g:147:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )* otherlv_6= '}' )
            {
            // InternalGrabDsl.g:147:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )* otherlv_6= '}' )
            // InternalGrabDsl.g:148:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )* otherlv_6= '}'
            {
            // InternalGrabDsl.g:148:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGrabDsl.g:149:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:149:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:150:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            		
            // InternalGrabDsl.g:171:3: ( (lv_packageName_2_0= ruleQualifiedName ) )
            // InternalGrabDsl.g:172:4: (lv_packageName_2_0= ruleQualifiedName )
            {
            // InternalGrabDsl.g:172:4: (lv_packageName_2_0= ruleQualifiedName )
            // InternalGrabDsl.g:173:5: lv_packageName_2_0= ruleQualifiedName
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

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGrabDsl.g:194:3: ( (lv_classes_4_0= ruleClassDefinition ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalGrabDsl.g:195:4: (lv_classes_4_0= ruleClassDefinition )
            	    {
            	    // InternalGrabDsl.g:195:4: (lv_classes_4_0= ruleClassDefinition )
            	    // InternalGrabDsl.g:196:5: lv_classes_4_0= ruleClassDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getClassesClassDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
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

            // InternalGrabDsl.g:213:3: ( (lv_interfaces_5_0= ruleInterfaceDefinition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGrabDsl.g:214:4: (lv_interfaces_5_0= ruleInterfaceDefinition )
            	    {
            	    // InternalGrabDsl.g:214:4: (lv_interfaces_5_0= ruleInterfaceDefinition )
            	    // InternalGrabDsl.g:215:5: lv_interfaces_5_0= ruleInterfaceDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getInterfacesInterfaceDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
    // InternalGrabDsl.g:240:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalGrabDsl.g:240:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalGrabDsl.g:241:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalGrabDsl.g:247:1: ruleClassDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' ) ;
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
            // InternalGrabDsl.g:253:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' ) )
            // InternalGrabDsl.g:254:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' )
            {
            // InternalGrabDsl.g:254:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}' )
            // InternalGrabDsl.g:255:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleMemberDefinition ) )* otherlv_7= '}'
            {
            // InternalGrabDsl.g:255:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGrabDsl.g:256:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:256:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:257:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            		
            // InternalGrabDsl.g:278:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:279:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:279:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:280:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalGrabDsl.g:296:3: (otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGrabDsl.g:297:4: otherlv_3= 'implements' ( (lv_interface_4_0= ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getImplementsKeyword_3_0());
                    			
                    // InternalGrabDsl.g:301:4: ( (lv_interface_4_0= ruleQualifiedName ) )
                    // InternalGrabDsl.g:302:5: (lv_interface_4_0= ruleQualifiedName )
                    {
                    // InternalGrabDsl.g:302:5: (lv_interface_4_0= ruleQualifiedName )
                    // InternalGrabDsl.g:303:6: lv_interface_4_0= ruleQualifiedName
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

            otherlv_5=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGrabDsl.g:325:3: ( (lv_members_6_0= ruleMemberDefinition ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=23 && LA7_0<=26)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGrabDsl.g:326:4: (lv_members_6_0= ruleMemberDefinition )
            	    {
            	    // InternalGrabDsl.g:326:4: (lv_members_6_0= ruleMemberDefinition )
            	    // InternalGrabDsl.g:327:5: lv_members_6_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getMembersMemberDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
    // InternalGrabDsl.g:352:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // InternalGrabDsl.g:352:60: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // InternalGrabDsl.g:353:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
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
    // InternalGrabDsl.g:359:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMemberDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:365:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMemberDefinition ) )* otherlv_5= '}' ) )
            // InternalGrabDsl.g:366:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMemberDefinition ) )* otherlv_5= '}' )
            {
            // InternalGrabDsl.g:366:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMemberDefinition ) )* otherlv_5= '}' )
            // InternalGrabDsl.g:367:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMemberDefinition ) )* otherlv_5= '}'
            {
            // InternalGrabDsl.g:367:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrabDsl.g:368:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:368:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:369:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            		
            // InternalGrabDsl.g:390:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:391:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:391:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:392:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGrabDsl.g:412:3: ( (lv_members_4_0= ruleMemberDefinition ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=23 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGrabDsl.g:413:4: (lv_members_4_0= ruleMemberDefinition )
            	    {
            	    // InternalGrabDsl.g:413:4: (lv_members_4_0= ruleMemberDefinition )
            	    // InternalGrabDsl.g:414:5: lv_members_4_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMembersMemberDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_members_4_0=ruleMemberDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_4_0,
            	    						"springboot.automate.GrabDsl.MemberDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalGrabDsl.g:439:1: entryRuleMemberDefinition returns [EObject current=null] : iv_ruleMemberDefinition= ruleMemberDefinition EOF ;
    public final EObject entryRuleMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDefinition = null;


        try {
            // InternalGrabDsl.g:439:57: (iv_ruleMemberDefinition= ruleMemberDefinition EOF )
            // InternalGrabDsl.g:440:2: iv_ruleMemberDefinition= ruleMemberDefinition EOF
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
    // InternalGrabDsl.g:446:1: ruleMemberDefinition returns [EObject current=null] : ( ( (lv_method_0_0= ruleMethodDefinition ) ) | ( (lv_property_1_0= rulePropertyDefinition ) ) ) ;
    public final EObject ruleMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_method_0_0 = null;

        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:452:2: ( ( ( (lv_method_0_0= ruleMethodDefinition ) ) | ( (lv_property_1_0= rulePropertyDefinition ) ) ) )
            // InternalGrabDsl.g:453:2: ( ( (lv_method_0_0= ruleMethodDefinition ) ) | ( (lv_property_1_0= rulePropertyDefinition ) ) )
            {
            // InternalGrabDsl.g:453:2: ( ( (lv_method_0_0= ruleMethodDefinition ) ) | ( (lv_property_1_0= rulePropertyDefinition ) ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalGrabDsl.g:454:3: ( (lv_method_0_0= ruleMethodDefinition ) )
                    {
                    // InternalGrabDsl.g:454:3: ( (lv_method_0_0= ruleMethodDefinition ) )
                    // InternalGrabDsl.g:455:4: (lv_method_0_0= ruleMethodDefinition )
                    {
                    // InternalGrabDsl.g:455:4: (lv_method_0_0= ruleMethodDefinition )
                    // InternalGrabDsl.g:456:5: lv_method_0_0= ruleMethodDefinition
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
                    // InternalGrabDsl.g:474:3: ( (lv_property_1_0= rulePropertyDefinition ) )
                    {
                    // InternalGrabDsl.g:474:3: ( (lv_property_1_0= rulePropertyDefinition ) )
                    // InternalGrabDsl.g:475:4: (lv_property_1_0= rulePropertyDefinition )
                    {
                    // InternalGrabDsl.g:475:4: (lv_property_1_0= rulePropertyDefinition )
                    // InternalGrabDsl.g:476:5: lv_property_1_0= rulePropertyDefinition
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
    // InternalGrabDsl.g:497:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // InternalGrabDsl.g:497:57: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // InternalGrabDsl.g:498:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
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
    // InternalGrabDsl.g:504:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' ) ;
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
            // InternalGrabDsl.g:510:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' ) )
            // InternalGrabDsl.g:511:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' )
            {
            // InternalGrabDsl.g:511:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' )
            // InternalGrabDsl.g:512:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';'
            {
            // InternalGrabDsl.g:512:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGrabDsl.g:513:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:513:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:514:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getMethodDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop11;
                }
            } while (true);

            // InternalGrabDsl.g:531:3: ( (lv_visibility_1_0= ruleVisibilityModifier ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=24 && LA12_0<=26)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGrabDsl.g:532:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    {
                    // InternalGrabDsl.g:532:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    // InternalGrabDsl.g:533:5: lv_visibility_1_0= ruleVisibilityModifier
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

            // InternalGrabDsl.g:550:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:551:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:551:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:552:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGrabDsl.g:572:3: ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGrabDsl.g:573:4: ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )*
                    {
                    // InternalGrabDsl.g:573:4: ( (lv_parameters_4_0= ruleParameterDefinition ) )
                    // InternalGrabDsl.g:574:5: (lv_parameters_4_0= ruleParameterDefinition )
                    {
                    // InternalGrabDsl.g:574:5: (lv_parameters_4_0= ruleParameterDefinition )
                    // InternalGrabDsl.g:575:6: lv_parameters_4_0= ruleParameterDefinition
                    {

                    						newCompositeNode(grammarAccess.getMethodDefinitionAccess().getParametersParameterDefinitionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalGrabDsl.g:592:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGrabDsl.g:593:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMethodDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGrabDsl.g:597:5: ( (lv_parameters_6_0= ruleParameterDefinition ) )
                    	    // InternalGrabDsl.g:598:6: (lv_parameters_6_0= ruleParameterDefinition )
                    	    {
                    	    // InternalGrabDsl.g:598:6: (lv_parameters_6_0= ruleParameterDefinition )
                    	    // InternalGrabDsl.g:599:7: lv_parameters_6_0= ruleParameterDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodDefinitionAccess().getParametersParameterDefinitionParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getMethodDefinitionAccess().getColonKeyword_6());
            		
            // InternalGrabDsl.g:626:3: ( (lv_returnType_9_0= ruleType ) )
            // InternalGrabDsl.g:627:4: (lv_returnType_9_0= ruleType )
            {
            // InternalGrabDsl.g:627:4: (lv_returnType_9_0= ruleType )
            // InternalGrabDsl.g:628:5: lv_returnType_9_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMethodDefinitionAccess().getReturnTypeTypeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

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
    // InternalGrabDsl.g:653:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalGrabDsl.g:653:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalGrabDsl.g:654:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
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
    // InternalGrabDsl.g:660:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? ) ;
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
            // InternalGrabDsl.g:666:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? ) )
            // InternalGrabDsl.g:667:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? )
            {
            // InternalGrabDsl.g:667:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? )
            // InternalGrabDsl.g:668:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )?
            {
            // InternalGrabDsl.g:668:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGrabDsl.g:669:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:669:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:670:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop15;
                }
            } while (true);

            // InternalGrabDsl.g:687:3: ( (lv_visibility_1_0= ruleVisibilityModifier ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=24 && LA16_0<=26)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGrabDsl.g:688:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    {
                    // InternalGrabDsl.g:688:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    // InternalGrabDsl.g:689:5: lv_visibility_1_0= ruleVisibilityModifier
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

            // InternalGrabDsl.g:706:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:707:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:707:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:708:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3());
            		
            // InternalGrabDsl.g:728:3: ( (lv_type_4_0= ruleType ) )
            // InternalGrabDsl.g:729:4: (lv_type_4_0= ruleType )
            {
            // InternalGrabDsl.g:729:4: (lv_type_4_0= ruleType )
            // InternalGrabDsl.g:730:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalGrabDsl.g:747:3: (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGrabDsl.g:748:4: otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalGrabDsl.g:752:4: ( (lv_defaultValue_6_0= RULE_STRING ) )
                    // InternalGrabDsl.g:753:5: (lv_defaultValue_6_0= RULE_STRING )
                    {
                    // InternalGrabDsl.g:753:5: (lv_defaultValue_6_0= RULE_STRING )
                    // InternalGrabDsl.g:754:6: lv_defaultValue_6_0= RULE_STRING
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
    // InternalGrabDsl.g:775:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // InternalGrabDsl.g:775:60: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // InternalGrabDsl.g:776:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
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
    // InternalGrabDsl.g:782:1: ruleParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:788:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalGrabDsl.g:789:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalGrabDsl.g:789:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalGrabDsl.g:790:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalGrabDsl.g:790:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrabDsl.g:791:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGrabDsl.g:791:4: (lv_name_0_0= RULE_ID )
            // InternalGrabDsl.g:792:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDefinitionAccess().getColonKeyword_1());
            		
            // InternalGrabDsl.g:812:3: ( (lv_type_2_0= ruleType ) )
            // InternalGrabDsl.g:813:4: (lv_type_2_0= ruleType )
            {
            // InternalGrabDsl.g:813:4: (lv_type_2_0= ruleType )
            // InternalGrabDsl.g:814:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterDefinitionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalGrabDsl.g:831:3: (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGrabDsl.g:832:4: otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalGrabDsl.g:836:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalGrabDsl.g:837:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalGrabDsl.g:837:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalGrabDsl.g:838:6: lv_defaultValue_4_0= RULE_STRING
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
    // InternalGrabDsl.g:859:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalGrabDsl.g:859:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalGrabDsl.g:860:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalGrabDsl.g:866:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? ) ;
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
            // InternalGrabDsl.g:872:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? ) )
            // InternalGrabDsl.g:873:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? )
            {
            // InternalGrabDsl.g:873:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? )
            // InternalGrabDsl.g:874:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
            		
            // InternalGrabDsl.g:878:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrabDsl.g:879:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrabDsl.g:879:4: (lv_name_1_0= RULE_ID )
            // InternalGrabDsl.g:880:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalGrabDsl.g:896:3: (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGrabDsl.g:897:4: otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalGrabDsl.g:901:4: ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalGrabDsl.g:902:5: ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )*
                            {
                            // InternalGrabDsl.g:902:5: ( (lv_arguments_3_0= ruleAnnotationArgument ) )
                            // InternalGrabDsl.g:903:6: (lv_arguments_3_0= ruleAnnotationArgument )
                            {
                            // InternalGrabDsl.g:903:6: (lv_arguments_3_0= ruleAnnotationArgument )
                            // InternalGrabDsl.g:904:7: lv_arguments_3_0= ruleAnnotationArgument
                            {

                            							newCompositeNode(grammarAccess.getAnnotationAccess().getArgumentsAnnotationArgumentParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_16);
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

                            // InternalGrabDsl.g:921:5: (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==18) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalGrabDsl.g:922:6: otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) )
                            	    {
                            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalGrabDsl.g:926:6: ( (lv_arguments_5_0= ruleAnnotationArgument ) )
                            	    // InternalGrabDsl.g:927:7: (lv_arguments_5_0= ruleAnnotationArgument )
                            	    {
                            	    // InternalGrabDsl.g:927:7: (lv_arguments_5_0= ruleAnnotationArgument )
                            	    // InternalGrabDsl.g:928:8: lv_arguments_5_0= ruleAnnotationArgument
                            	    {

                            	    								newCompositeNode(grammarAccess.getAnnotationAccess().getArgumentsAnnotationArgumentParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_16);
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
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalGrabDsl.g:956:1: entryRuleAnnotationArgument returns [EObject current=null] : iv_ruleAnnotationArgument= ruleAnnotationArgument EOF ;
    public final EObject entryRuleAnnotationArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationArgument = null;


        try {
            // InternalGrabDsl.g:956:59: (iv_ruleAnnotationArgument= ruleAnnotationArgument EOF )
            // InternalGrabDsl.g:957:2: iv_ruleAnnotationArgument= ruleAnnotationArgument EOF
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
    // InternalGrabDsl.g:963:1: ruleAnnotationArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnnotationArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:969:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalGrabDsl.g:970:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalGrabDsl.g:970:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalGrabDsl.g:971:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalGrabDsl.g:971:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrabDsl.g:972:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGrabDsl.g:972:4: (lv_name_0_0= RULE_ID )
            // InternalGrabDsl.g:973:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationArgumentAccess().getEqualsSignKeyword_1());
            		
            // InternalGrabDsl.g:993:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalGrabDsl.g:994:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalGrabDsl.g:994:4: (lv_value_2_0= RULE_STRING )
            // InternalGrabDsl.g:995:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getAnnotationArgumentAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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


    // $ANTLR start "entryRuleVisibilityModifier"
    // InternalGrabDsl.g:1015:1: entryRuleVisibilityModifier returns [String current=null] : iv_ruleVisibilityModifier= ruleVisibilityModifier EOF ;
    public final String entryRuleVisibilityModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVisibilityModifier = null;


        try {
            // InternalGrabDsl.g:1015:58: (iv_ruleVisibilityModifier= ruleVisibilityModifier EOF )
            // InternalGrabDsl.g:1016:2: iv_ruleVisibilityModifier= ruleVisibilityModifier EOF
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
    // InternalGrabDsl.g:1022:1: ruleVisibilityModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'public' | kw= 'private' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleVisibilityModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1028:2: ( (kw= 'public' | kw= 'private' | kw= 'protected' ) )
            // InternalGrabDsl.g:1029:2: (kw= 'public' | kw= 'private' | kw= 'protected' )
            {
            // InternalGrabDsl.g:1029:2: (kw= 'public' | kw= 'private' | kw= 'protected' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt22=1;
                }
                break;
            case 25:
                {
                alt22=2;
                }
                break;
            case 26:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGrabDsl.g:1030:3: kw= 'public'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityModifierAccess().getPublicKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:1036:3: kw= 'private'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityModifierAccess().getPrivateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGrabDsl.g:1042:3: kw= 'protected'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalGrabDsl.g:1051:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalGrabDsl.g:1051:44: (iv_ruleType= ruleType EOF )
            // InternalGrabDsl.g:1052:2: iv_ruleType= ruleType EOF
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
    // InternalGrabDsl.g:1058:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveType_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_1 = null;

        AntlrDatatypeRuleToken this_GenericType_2 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:1064:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType ) )
            // InternalGrabDsl.g:1065:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType )
            {
            // InternalGrabDsl.g:1065:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalGrabDsl.g:1066:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalGrabDsl.g:1077:3: this_QualifiedName_1= ruleQualifiedName
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
                    // InternalGrabDsl.g:1088:3: this_GenericType_2= ruleGenericType
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
    // InternalGrabDsl.g:1102:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // InternalGrabDsl.g:1102:53: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalGrabDsl.g:1103:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalGrabDsl.g:1109:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'String' | kw= 'double' | kw= 'float' | kw= 'int' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1115:2: ( (kw= 'void' | kw= 'String' | kw= 'double' | kw= 'float' | kw= 'int' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' ) )
            // InternalGrabDsl.g:1116:2: (kw= 'void' | kw= 'String' | kw= 'double' | kw= 'float' | kw= 'int' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' )
            {
            // InternalGrabDsl.g:1116:2: (kw= 'void' | kw= 'String' | kw= 'double' | kw= 'float' | kw= 'int' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' )
            int alt24=9;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt24=1;
                }
                break;
            case 28:
                {
                alt24=2;
                }
                break;
            case 29:
                {
                alt24=3;
                }
                break;
            case 30:
                {
                alt24=4;
                }
                break;
            case 31:
                {
                alt24=5;
                }
                break;
            case 32:
                {
                alt24=6;
                }
                break;
            case 33:
                {
                alt24=7;
                }
                break;
            case 34:
                {
                alt24=8;
                }
                break;
            case 35:
                {
                alt24=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalGrabDsl.g:1117:3: kw= 'void'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getVoidKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:1123:3: kw= 'String'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGrabDsl.g:1129:3: kw= 'double'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getDoubleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGrabDsl.g:1135:3: kw= 'float'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getFloatKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGrabDsl.g:1141:3: kw= 'int'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getIntKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalGrabDsl.g:1147:3: kw= 'UUID'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getUUIDKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalGrabDsl.g:1153:3: kw= 'Date'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getDateKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalGrabDsl.g:1159:3: kw= 'Timestamp'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getTimestampKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalGrabDsl.g:1165:3: kw= 'List'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getListKeyword_8());
                    		

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
    // InternalGrabDsl.g:1174:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalGrabDsl.g:1174:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalGrabDsl.g:1175:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalGrabDsl.g:1181:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1187:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalGrabDsl.g:1188:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalGrabDsl.g:1188:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalGrabDsl.g:1189:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalGrabDsl.g:1196:3: (kw= '.' this_ID_2= RULE_ID )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGrabDsl.g:1197:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalGrabDsl.g:1214:1: entryRuleGenericType returns [String current=null] : iv_ruleGenericType= ruleGenericType EOF ;
    public final String entryRuleGenericType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGenericType = null;


        try {
            // InternalGrabDsl.g:1214:51: (iv_ruleGenericType= ruleGenericType EOF )
            // InternalGrabDsl.g:1215:2: iv_ruleGenericType= ruleGenericType EOF
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
    // InternalGrabDsl.g:1221:1: ruleGenericType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '<' this_Type_2= ruleType kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleGenericType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:1227:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '<' this_Type_2= ruleType kw= '>' ) )
            // InternalGrabDsl.g:1228:2: (this_QualifiedName_0= ruleQualifiedName kw= '<' this_Type_2= ruleType kw= '>' )
            {
            // InternalGrabDsl.g:1228:2: (this_QualifiedName_0= ruleQualifiedName kw= '<' this_Type_2= ruleType kw= '>' )
            // InternalGrabDsl.g:1229:3: this_QualifiedName_0= ruleQualifiedName kw= '<' this_Type_2= ruleType kw= '>'
            {

            			newCompositeNode(grammarAccess.getGenericTypeAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,37,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getGenericTypeAccess().getLessThanSignKeyword_1());
            		

            			newCompositeNode(grammarAccess.getGenericTypeAccess().getTypeParserRuleCall_2());
            		
            pushFollow(FOLLOW_26);
            this_Type_2=ruleType();

            state._fsp--;


            			current.merge(this_Type_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,38,FOLLOW_2); 

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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\15\1\4\2\uffff\1\16\1\4\1\26\1\16\1\5\1\22\1\4\1\26\1\5\1\22";
    static final String dfa_3s = "\1\27\1\4\2\uffff\1\27\1\23\1\26\1\27\1\5\1\23\1\4\1\26\1\5\1\23";
    static final String dfa_4s = "\2\uffff\1\2\1\1\12\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\uffff\1\2\6\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\1\2\1\5\5\uffff\1\1",
            "\1\6\16\uffff\1\7",
            "\1\10",
            "\1\3\1\uffff\1\2\6\uffff\1\1",
            "\1\11",
            "\1\12\1\7",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\12\1\7"
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
            return "()* loopback of 194:3: ( (lv_classes_4_0= ruleClassDefinition ) )*";
        }
    }
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\5\4\1\21\1\4\2\uffff\1\4\1\26\1\4\1\5\1\22\1\4\1\26\1\5\1\22";
    static final String dfa_9s = "\1\32\4\4\1\24\1\32\2\uffff\1\23\1\26\1\32\1\5\1\23\1\4\1\26\1\5\1\23";
    static final String dfa_10s = "\7\uffff\1\2\1\1\11\uffff";
    static final String dfa_11s = "\22\uffff}>";
    static final String[] dfa_12s = {
            "\1\5\22\uffff\1\1\1\2\1\3\1\4",
            "\1\6",
            "\1\5",
            "\1\5",
            "\1\5",
            "\1\10\2\uffff\1\7",
            "\1\5\14\uffff\1\11\5\uffff\1\1\1\2\1\3\1\4",
            "",
            "",
            "\1\12\16\uffff\1\13",
            "\1\14",
            "\1\5\22\uffff\1\1\1\2\1\3\1\4",
            "\1\15",
            "\1\16\1\13",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\16\1\13"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "453:2: ( ( (lv_method_0_0= ruleMethodDefinition ) ) | ( (lv_property_1_0= rulePropertyDefinition ) ) )";
        }
    }
    static final String dfa_13s = "\7\uffff";
    static final String dfa_14s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_15s = "\1\4\1\uffff\2\4\2\uffff\1\4";
    static final String dfa_16s = "\1\43\1\uffff\1\46\1\4\2\uffff\1\46";
    static final String dfa_17s = "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String dfa_18s = "\7\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\26\uffff\11\1",
            "",
            "\1\5\10\uffff\1\5\4\uffff\2\5\1\uffff\6\5\11\uffff\1\3\1\4\1\5",
            "\1\6",
            "",
            "",
            "\1\5\10\uffff\1\5\4\uffff\2\5\1\uffff\6\5\11\uffff\1\3\1\4\1\5"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1065:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000802800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000816000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000812000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007802010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000FF8000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});

}