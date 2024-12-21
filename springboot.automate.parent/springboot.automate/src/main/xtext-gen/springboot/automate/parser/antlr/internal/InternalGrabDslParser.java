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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'class'", "'('", "','", "')'", "':'", "';'", "'='", "'@'", "'public'", "'private'", "'protected'", "'void'", "'String'", "'UUID'", "'Date'", "'Timestamp'", "'List'", "'.'", "'<'", "'>'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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

                if ( (LA1_0==11||LA1_0==21) ) {
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
    // InternalGrabDsl.g:140:1: rulePackageDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* otherlv_5= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_packageName_2_0 = null;

        EObject lv_classes_4_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:146:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* otherlv_5= '}' ) )
            // InternalGrabDsl.g:147:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* otherlv_5= '}' )
            {
            // InternalGrabDsl.g:147:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* otherlv_5= '}' )
            // InternalGrabDsl.g:148:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'package' ( (lv_packageName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_classes_4_0= ruleClassDefinition ) )* otherlv_5= '}'
            {
            // InternalGrabDsl.g:148:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
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
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==21) ) {
                    alt3=1;
                }


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

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalGrabDsl.g:221:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalGrabDsl.g:221:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalGrabDsl.g:222:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalGrabDsl.g:228:1: ruleClassDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMemberDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:234:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMemberDefinition ) )* otherlv_5= '}' ) )
            // InternalGrabDsl.g:235:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMemberDefinition ) )* otherlv_5= '}' )
            {
            // InternalGrabDsl.g:235:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMemberDefinition ) )* otherlv_5= '}' )
            // InternalGrabDsl.g:236:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMemberDefinition ) )* otherlv_5= '}'
            {
            // InternalGrabDsl.g:236:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGrabDsl.g:237:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:237:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:238:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break loop4;
                }
            } while (true);

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getClassKeyword_1());
            		
            // InternalGrabDsl.g:259:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:260:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:260:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:261:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGrabDsl.g:281:3: ( (lv_members_4_0= ruleMemberDefinition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=21 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGrabDsl.g:282:4: (lv_members_4_0= ruleMemberDefinition )
            	    {
            	    // InternalGrabDsl.g:282:4: (lv_members_4_0= ruleMemberDefinition )
            	    // InternalGrabDsl.g:283:5: lv_members_4_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getMembersMemberDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_members_4_0=ruleMemberDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
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
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleMemberDefinition"
    // InternalGrabDsl.g:308:1: entryRuleMemberDefinition returns [EObject current=null] : iv_ruleMemberDefinition= ruleMemberDefinition EOF ;
    public final EObject entryRuleMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDefinition = null;


        try {
            // InternalGrabDsl.g:308:57: (iv_ruleMemberDefinition= ruleMemberDefinition EOF )
            // InternalGrabDsl.g:309:2: iv_ruleMemberDefinition= ruleMemberDefinition EOF
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
    // InternalGrabDsl.g:315:1: ruleMemberDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_method_1_0= ruleMethodDefinition ) ) | ( (lv_property_2_0= rulePropertyDefinition ) ) ) ) ;
    public final EObject ruleMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_method_1_0 = null;

        EObject lv_property_2_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:321:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_method_1_0= ruleMethodDefinition ) ) | ( (lv_property_2_0= rulePropertyDefinition ) ) ) ) )
            // InternalGrabDsl.g:322:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_method_1_0= ruleMethodDefinition ) ) | ( (lv_property_2_0= rulePropertyDefinition ) ) ) )
            {
            // InternalGrabDsl.g:322:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_method_1_0= ruleMethodDefinition ) ) | ( (lv_property_2_0= rulePropertyDefinition ) ) ) )
            // InternalGrabDsl.g:323:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_method_1_0= ruleMethodDefinition ) ) | ( (lv_property_2_0= rulePropertyDefinition ) ) )
            {
            // InternalGrabDsl.g:323:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalGrabDsl.g:324:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:324:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:325:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemberDefinitionRule());
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
            	    break loop6;
                }
            } while (true);

            // InternalGrabDsl.g:342:3: ( ( (lv_method_1_0= ruleMethodDefinition ) ) | ( (lv_property_2_0= rulePropertyDefinition ) ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalGrabDsl.g:343:4: ( (lv_method_1_0= ruleMethodDefinition ) )
                    {
                    // InternalGrabDsl.g:343:4: ( (lv_method_1_0= ruleMethodDefinition ) )
                    // InternalGrabDsl.g:344:5: (lv_method_1_0= ruleMethodDefinition )
                    {
                    // InternalGrabDsl.g:344:5: (lv_method_1_0= ruleMethodDefinition )
                    // InternalGrabDsl.g:345:6: lv_method_1_0= ruleMethodDefinition
                    {

                    						newCompositeNode(grammarAccess.getMemberDefinitionAccess().getMethodMethodDefinitionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_method_1_0=ruleMethodDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemberDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"method",
                    							lv_method_1_0,
                    							"springboot.automate.GrabDsl.MethodDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:363:4: ( (lv_property_2_0= rulePropertyDefinition ) )
                    {
                    // InternalGrabDsl.g:363:4: ( (lv_property_2_0= rulePropertyDefinition ) )
                    // InternalGrabDsl.g:364:5: (lv_property_2_0= rulePropertyDefinition )
                    {
                    // InternalGrabDsl.g:364:5: (lv_property_2_0= rulePropertyDefinition )
                    // InternalGrabDsl.g:365:6: lv_property_2_0= rulePropertyDefinition
                    {

                    						newCompositeNode(grammarAccess.getMemberDefinitionAccess().getPropertyPropertyDefinitionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_property_2_0=rulePropertyDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemberDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"property",
                    							lv_property_2_0,
                    							"springboot.automate.GrabDsl.PropertyDefinition");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleMemberDefinition"


    // $ANTLR start "entryRuleMethodDefinition"
    // InternalGrabDsl.g:387:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // InternalGrabDsl.g:387:57: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // InternalGrabDsl.g:388:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
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
    // InternalGrabDsl.g:394:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' ) ;
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
            // InternalGrabDsl.g:400:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' ) )
            // InternalGrabDsl.g:401:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' )
            {
            // InternalGrabDsl.g:401:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';' )
            // InternalGrabDsl.g:402:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleType ) ) otherlv_10= ';'
            {
            // InternalGrabDsl.g:402:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrabDsl.g:403:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:403:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:404:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getMethodDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
            	    break loop8;
                }
            } while (true);

            // InternalGrabDsl.g:421:3: ( (lv_visibility_1_0= ruleVisibilityModifier ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=22 && LA9_0<=24)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGrabDsl.g:422:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    {
                    // InternalGrabDsl.g:422:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    // InternalGrabDsl.g:423:5: lv_visibility_1_0= ruleVisibilityModifier
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

            // InternalGrabDsl.g:440:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:441:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:441:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:442:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGrabDsl.g:462:3: ( ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGrabDsl.g:463:4: ( (lv_parameters_4_0= ruleParameterDefinition ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )*
                    {
                    // InternalGrabDsl.g:463:4: ( (lv_parameters_4_0= ruleParameterDefinition ) )
                    // InternalGrabDsl.g:464:5: (lv_parameters_4_0= ruleParameterDefinition )
                    {
                    // InternalGrabDsl.g:464:5: (lv_parameters_4_0= ruleParameterDefinition )
                    // InternalGrabDsl.g:465:6: lv_parameters_4_0= ruleParameterDefinition
                    {

                    						newCompositeNode(grammarAccess.getMethodDefinitionAccess().getParametersParameterDefinitionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalGrabDsl.g:482:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalGrabDsl.g:483:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterDefinition ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMethodDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGrabDsl.g:487:5: ( (lv_parameters_6_0= ruleParameterDefinition ) )
                    	    // InternalGrabDsl.g:488:6: (lv_parameters_6_0= ruleParameterDefinition )
                    	    {
                    	    // InternalGrabDsl.g:488:6: (lv_parameters_6_0= ruleParameterDefinition )
                    	    // InternalGrabDsl.g:489:7: lv_parameters_6_0= ruleParameterDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodDefinitionAccess().getParametersParameterDefinitionParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getMethodDefinitionAccess().getColonKeyword_6());
            		
            // InternalGrabDsl.g:516:3: ( (lv_returnType_9_0= ruleType ) )
            // InternalGrabDsl.g:517:4: (lv_returnType_9_0= ruleType )
            {
            // InternalGrabDsl.g:517:4: (lv_returnType_9_0= ruleType )
            // InternalGrabDsl.g:518:5: lv_returnType_9_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMethodDefinitionAccess().getReturnTypeTypeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

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
    // InternalGrabDsl.g:543:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalGrabDsl.g:543:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalGrabDsl.g:544:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
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
    // InternalGrabDsl.g:550:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? ) ;
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
            // InternalGrabDsl.g:556:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? ) )
            // InternalGrabDsl.g:557:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? )
            {
            // InternalGrabDsl.g:557:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )? )
            // InternalGrabDsl.g:558:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityModifier ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )?
            {
            // InternalGrabDsl.g:558:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGrabDsl.g:559:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalGrabDsl.g:559:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalGrabDsl.g:560:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
            	    break loop12;
                }
            } while (true);

            // InternalGrabDsl.g:577:3: ( (lv_visibility_1_0= ruleVisibilityModifier ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=22 && LA13_0<=24)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGrabDsl.g:578:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    {
                    // InternalGrabDsl.g:578:4: (lv_visibility_1_0= ruleVisibilityModifier )
                    // InternalGrabDsl.g:579:5: lv_visibility_1_0= ruleVisibilityModifier
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

            // InternalGrabDsl.g:596:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrabDsl.g:597:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrabDsl.g:597:4: (lv_name_2_0= RULE_ID )
            // InternalGrabDsl.g:598:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3());
            		
            // InternalGrabDsl.g:618:3: ( (lv_type_4_0= ruleType ) )
            // InternalGrabDsl.g:619:4: (lv_type_4_0= ruleType )
            {
            // InternalGrabDsl.g:619:4: (lv_type_4_0= ruleType )
            // InternalGrabDsl.g:620:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalGrabDsl.g:637:3: (otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGrabDsl.g:638:4: otherlv_5= '=' ( (lv_defaultValue_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalGrabDsl.g:642:4: ( (lv_defaultValue_6_0= RULE_STRING ) )
                    // InternalGrabDsl.g:643:5: (lv_defaultValue_6_0= RULE_STRING )
                    {
                    // InternalGrabDsl.g:643:5: (lv_defaultValue_6_0= RULE_STRING )
                    // InternalGrabDsl.g:644:6: lv_defaultValue_6_0= RULE_STRING
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
    // InternalGrabDsl.g:665:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // InternalGrabDsl.g:665:60: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // InternalGrabDsl.g:666:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
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
    // InternalGrabDsl.g:672:1: ruleParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:678:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalGrabDsl.g:679:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalGrabDsl.g:679:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalGrabDsl.g:680:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalGrabDsl.g:680:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrabDsl.g:681:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGrabDsl.g:681:4: (lv_name_0_0= RULE_ID )
            // InternalGrabDsl.g:682:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDefinitionAccess().getColonKeyword_1());
            		
            // InternalGrabDsl.g:702:3: ( (lv_type_2_0= ruleType ) )
            // InternalGrabDsl.g:703:4: (lv_type_2_0= ruleType )
            {
            // InternalGrabDsl.g:703:4: (lv_type_2_0= ruleType )
            // InternalGrabDsl.g:704:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterDefinitionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalGrabDsl.g:721:3: (otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGrabDsl.g:722:4: otherlv_3= '=' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalGrabDsl.g:726:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalGrabDsl.g:727:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalGrabDsl.g:727:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalGrabDsl.g:728:6: lv_defaultValue_4_0= RULE_STRING
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
    // InternalGrabDsl.g:749:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalGrabDsl.g:749:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalGrabDsl.g:750:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalGrabDsl.g:756:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? ) ;
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
            // InternalGrabDsl.g:762:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? ) )
            // InternalGrabDsl.g:763:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? )
            {
            // InternalGrabDsl.g:763:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )? )
            // InternalGrabDsl.g:764:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
            		
            // InternalGrabDsl.g:768:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrabDsl.g:769:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrabDsl.g:769:4: (lv_name_1_0= RULE_ID )
            // InternalGrabDsl.g:770:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalGrabDsl.g:786:3: (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGrabDsl.g:787:4: otherlv_2= '(' ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalGrabDsl.g:791:4: ( ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalGrabDsl.g:792:5: ( (lv_arguments_3_0= ruleAnnotationArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )*
                            {
                            // InternalGrabDsl.g:792:5: ( (lv_arguments_3_0= ruleAnnotationArgument ) )
                            // InternalGrabDsl.g:793:6: (lv_arguments_3_0= ruleAnnotationArgument )
                            {
                            // InternalGrabDsl.g:793:6: (lv_arguments_3_0= ruleAnnotationArgument )
                            // InternalGrabDsl.g:794:7: lv_arguments_3_0= ruleAnnotationArgument
                            {

                            							newCompositeNode(grammarAccess.getAnnotationAccess().getArgumentsAnnotationArgumentParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_13);
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

                            // InternalGrabDsl.g:811:5: (otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==16) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalGrabDsl.g:812:6: otherlv_4= ',' ( (lv_arguments_5_0= ruleAnnotationArgument ) )
                            	    {
                            	    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalGrabDsl.g:816:6: ( (lv_arguments_5_0= ruleAnnotationArgument ) )
                            	    // InternalGrabDsl.g:817:7: (lv_arguments_5_0= ruleAnnotationArgument )
                            	    {
                            	    // InternalGrabDsl.g:817:7: (lv_arguments_5_0= ruleAnnotationArgument )
                            	    // InternalGrabDsl.g:818:8: lv_arguments_5_0= ruleAnnotationArgument
                            	    {

                            	    								newCompositeNode(grammarAccess.getAnnotationAccess().getArgumentsAnnotationArgumentParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_13);
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
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalGrabDsl.g:846:1: entryRuleAnnotationArgument returns [EObject current=null] : iv_ruleAnnotationArgument= ruleAnnotationArgument EOF ;
    public final EObject entryRuleAnnotationArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationArgument = null;


        try {
            // InternalGrabDsl.g:846:59: (iv_ruleAnnotationArgument= ruleAnnotationArgument EOF )
            // InternalGrabDsl.g:847:2: iv_ruleAnnotationArgument= ruleAnnotationArgument EOF
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
    // InternalGrabDsl.g:853:1: ruleAnnotationArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnnotationArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:859:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalGrabDsl.g:860:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalGrabDsl.g:860:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalGrabDsl.g:861:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalGrabDsl.g:861:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrabDsl.g:862:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGrabDsl.g:862:4: (lv_name_0_0= RULE_ID )
            // InternalGrabDsl.g:863:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationArgumentAccess().getEqualsSignKeyword_1());
            		
            // InternalGrabDsl.g:883:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalGrabDsl.g:884:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalGrabDsl.g:884:4: (lv_value_2_0= RULE_STRING )
            // InternalGrabDsl.g:885:5: lv_value_2_0= RULE_STRING
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
    // InternalGrabDsl.g:905:1: entryRuleVisibilityModifier returns [String current=null] : iv_ruleVisibilityModifier= ruleVisibilityModifier EOF ;
    public final String entryRuleVisibilityModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVisibilityModifier = null;


        try {
            // InternalGrabDsl.g:905:58: (iv_ruleVisibilityModifier= ruleVisibilityModifier EOF )
            // InternalGrabDsl.g:906:2: iv_ruleVisibilityModifier= ruleVisibilityModifier EOF
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
    // InternalGrabDsl.g:912:1: ruleVisibilityModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'public' | kw= 'private' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleVisibilityModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:918:2: ( (kw= 'public' | kw= 'private' | kw= 'protected' ) )
            // InternalGrabDsl.g:919:2: (kw= 'public' | kw= 'private' | kw= 'protected' )
            {
            // InternalGrabDsl.g:919:2: (kw= 'public' | kw= 'private' | kw= 'protected' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt19=1;
                }
                break;
            case 23:
                {
                alt19=2;
                }
                break;
            case 24:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGrabDsl.g:920:3: kw= 'public'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityModifierAccess().getPublicKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:926:3: kw= 'private'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityModifierAccess().getPrivateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGrabDsl.g:932:3: kw= 'protected'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

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
    // InternalGrabDsl.g:941:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalGrabDsl.g:941:44: (iv_ruleType= ruleType EOF )
            // InternalGrabDsl.g:942:2: iv_ruleType= ruleType EOF
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
    // InternalGrabDsl.g:948:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveType_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_1 = null;

        AntlrDatatypeRuleToken this_GenericType_2 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:954:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType ) )
            // InternalGrabDsl.g:955:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType )
            {
            // InternalGrabDsl.g:955:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalGrabDsl.g:956:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalGrabDsl.g:967:3: this_QualifiedName_1= ruleQualifiedName
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
                    // InternalGrabDsl.g:978:3: this_GenericType_2= ruleGenericType
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
    // InternalGrabDsl.g:992:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // InternalGrabDsl.g:992:53: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalGrabDsl.g:993:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalGrabDsl.g:999:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'String' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1005:2: ( (kw= 'void' | kw= 'String' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' ) )
            // InternalGrabDsl.g:1006:2: (kw= 'void' | kw= 'String' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' )
            {
            // InternalGrabDsl.g:1006:2: (kw= 'void' | kw= 'String' | kw= 'UUID' | kw= 'Date' | kw= 'Timestamp' | kw= 'List' )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt21=1;
                }
                break;
            case 26:
                {
                alt21=2;
                }
                break;
            case 27:
                {
                alt21=3;
                }
                break;
            case 28:
                {
                alt21=4;
                }
                break;
            case 29:
                {
                alt21=5;
                }
                break;
            case 30:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalGrabDsl.g:1007:3: kw= 'void'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getVoidKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGrabDsl.g:1013:3: kw= 'String'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGrabDsl.g:1019:3: kw= 'UUID'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getUUIDKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGrabDsl.g:1025:3: kw= 'Date'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getDateKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGrabDsl.g:1031:3: kw= 'Timestamp'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getTimestampKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalGrabDsl.g:1037:3: kw= 'List'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getListKeyword_5());
                    		

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
    // InternalGrabDsl.g:1046:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalGrabDsl.g:1046:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalGrabDsl.g:1047:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalGrabDsl.g:1053:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGrabDsl.g:1059:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalGrabDsl.g:1060:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalGrabDsl.g:1060:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalGrabDsl.g:1061:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalGrabDsl.g:1068:3: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGrabDsl.g:1069:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalGrabDsl.g:1086:1: entryRuleGenericType returns [String current=null] : iv_ruleGenericType= ruleGenericType EOF ;
    public final String entryRuleGenericType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGenericType = null;


        try {
            // InternalGrabDsl.g:1086:51: (iv_ruleGenericType= ruleGenericType EOF )
            // InternalGrabDsl.g:1087:2: iv_ruleGenericType= ruleGenericType EOF
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
    // InternalGrabDsl.g:1093:1: ruleGenericType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '<' this_Type_2= ruleType kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleGenericType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalGrabDsl.g:1099:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '<' this_Type_2= ruleType kw= '>' ) )
            // InternalGrabDsl.g:1100:2: (this_QualifiedName_0= ruleQualifiedName kw= '<' this_Type_2= ruleType kw= '>' )
            {
            // InternalGrabDsl.g:1100:2: (this_QualifiedName_0= ruleQualifiedName kw= '<' this_Type_2= ruleType kw= '>' )
            // InternalGrabDsl.g:1101:3: this_QualifiedName_0= ruleQualifiedName kw= '<' this_Type_2= ruleType kw= '>'
            {

            			newCompositeNode(grammarAccess.getGenericTypeAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,32,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getGenericTypeAccess().getLessThanSignKeyword_1());
            		

            			newCompositeNode(grammarAccess.getGenericTypeAccess().getTypeParserRuleCall_2());
            		
            pushFollow(FOLLOW_23);
            this_Type_2=ruleType();

            state._fsp--;


            			current.merge(this_Type_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,33,FOLLOW_2); 

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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\5\4\1\17\1\4\2\uffff\1\4\1\24\1\4\1\5\1\20\1\4\1\24\1\5\1\20";
    static final String dfa_3s = "\1\30\4\4\1\22\1\30\2\uffff\1\21\1\24\1\30\1\5\1\21\1\4\1\24\1\5\1\21";
    static final String dfa_4s = "\7\uffff\1\1\1\2\11\uffff";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\20\uffff\1\1\1\2\1\3\1\4",
            "\1\6",
            "\1\5",
            "\1\5",
            "\1\5",
            "\1\7\2\uffff\1\10",
            "\1\5\12\uffff\1\11\5\uffff\1\1\1\2\1\3\1\4",
            "",
            "",
            "\1\12\14\uffff\1\13",
            "\1\14",
            "\1\5\20\uffff\1\1\1\2\1\3\1\4",
            "\1\15",
            "\1\16\1\13",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\16\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "342:3: ( ( (lv_method_1_0= ruleMethodDefinition ) ) | ( (lv_property_2_0= rulePropertyDefinition ) ) )";
        }
    }
    static final String dfa_7s = "\7\uffff";
    static final String dfa_8s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_9s = "\1\4\1\uffff\2\4\2\uffff\1\4";
    static final String dfa_10s = "\1\36\1\uffff\1\41\1\4\2\uffff\1\41";
    static final String dfa_11s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_12s = "\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\24\uffff\6\1",
            "",
            "\1\4\10\uffff\1\4\2\uffff\2\4\1\uffff\6\4\6\uffff\1\3\1\5\1\4",
            "\1\6",
            "",
            "",
            "\1\4\10\uffff\1\4\2\uffff\2\4\1\uffff\6\4\6\uffff\1\3\1\5\1\4"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "955:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName | this_GenericType_2= ruleGenericType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000202800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001E02010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001E00010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000007E000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});

}