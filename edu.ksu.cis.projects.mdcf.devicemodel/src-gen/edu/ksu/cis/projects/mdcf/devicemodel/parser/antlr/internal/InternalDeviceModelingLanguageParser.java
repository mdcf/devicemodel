package edu.ksu.cis.projects.mdcf.devicemodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.ksu.cis.projects.mdcf.devicemodel.services.DeviceModelingLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceModelingLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NAT", "RULE_LIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'type'", "'component'", "'instance'", "'extends'", "'with'", "'{'", "'}'", "':'", "'='", "'const'", "'val'", "'var'", "'def'", "'inv'", "'..'", "'.'", "'*'", "'app'", "'requires'", "'['", "']'", "'?'", "'!'", "'_'", "'<'", "'>'", "','", "'none'", "'some'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_LIT=6;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_NAT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDeviceModelingLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDeviceModelingLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDeviceModelingLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g"; }



     	private DeviceModelingLanguageGrammarAccess grammarAccess;
     	
        public InternalDeviceModelingLanguageParser(TokenStream input, DeviceModelingLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DeviceModelingLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:76:1: ruleModel returns [EObject current=null] : ( (lv_decls_0_0= ruleDecl ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_decls_0_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:79:28: ( ( (lv_decls_0_0= ruleDecl ) )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:80:1: ( (lv_decls_0_0= ruleDecl ) )*
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:80:1: ( (lv_decls_0_0= ruleDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=10 && LA1_0<=12)||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:81:1: (lv_decls_0_0= ruleDecl )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:81:1: (lv_decls_0_0= ruleDecl )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:82:3: lv_decls_0_0= ruleDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclsDeclParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecl_in_ruleModel130);
            	    lv_decls_0_0=ruleDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decls",
            	            		lv_decls_0_0, 
            	            		"Decl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:106:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:107:2: (iv_ruleDecl= ruleDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:108:2: iv_ruleDecl= ruleDecl EOF
            {
             newCompositeNode(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl166);
            iv_ruleDecl=ruleDecl();

            state._fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl176); 

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
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:115:1: ruleDecl returns [EObject current=null] : (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl | this_AppRequirement_2= ruleAppRequirement ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDecl_0 = null;

        EObject this_ComponentDecl_1 = null;

        EObject this_AppRequirement_2 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:118:28: ( (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl | this_AppRequirement_2= ruleAppRequirement ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:1: (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl | this_AppRequirement_2= ruleAppRequirement )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:1: (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl | this_AppRequirement_2= ruleAppRequirement )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt2=1;
                }
                break;
            case 11:
            case 12:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:120:5: this_TypeDecl_0= ruleTypeDecl
                    {
                     
                            newCompositeNode(grammarAccess.getDeclAccess().getTypeDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeDecl_in_ruleDecl223);
                    this_TypeDecl_0=ruleTypeDecl();

                    state._fsp--;

                     
                            current = this_TypeDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:130:5: this_ComponentDecl_1= ruleComponentDecl
                    {
                     
                            newCompositeNode(grammarAccess.getDeclAccess().getComponentDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComponentDecl_in_ruleDecl250);
                    this_ComponentDecl_1=ruleComponentDecl();

                    state._fsp--;

                     
                            current = this_ComponentDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:140:5: this_AppRequirement_2= ruleAppRequirement
                    {
                     
                            newCompositeNode(grammarAccess.getDeclAccess().getAppRequirementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAppRequirement_in_ruleDecl277);
                    this_AppRequirement_2=ruleAppRequirement();

                    state._fsp--;

                     
                            current = this_AppRequirement_2; 
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
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleTypeDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:156:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:157:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:158:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl312);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl322); 

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
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:165:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:168:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:169:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:169:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:169:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleTypeDecl359); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:173:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:174:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:174:1: (lv_name_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:175:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl376); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleComponentDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:199:1: entryRuleComponentDecl returns [EObject current=null] : iv_ruleComponentDecl= ruleComponentDecl EOF ;
    public final EObject entryRuleComponentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:200:2: (iv_ruleComponentDecl= ruleComponentDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:201:2: iv_ruleComponentDecl= ruleComponentDecl EOF
            {
             newCompositeNode(grammarAccess.getComponentDeclRule()); 
            pushFollow(FOLLOW_ruleComponentDecl_in_entryRuleComponentDecl417);
            iv_ruleComponentDecl=ruleComponentDecl();

            state._fsp--;

             current =iv_ruleComponentDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDecl427); 

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
    // $ANTLR end "entryRuleComponentDecl"


    // $ANTLR start "ruleComponentDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:208:1: ruleComponentDecl returns [EObject current=null] : ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'instance' () ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'with' ( (otherlv_8= RULE_ID ) ) )* )? (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleComponentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_members_10_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:211:28: ( ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'instance' () ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'with' ( (otherlv_8= RULE_ID ) ) )* )? (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:1: ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'instance' () ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'with' ( (otherlv_8= RULE_ID ) ) )* )? (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:1: ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'instance' () ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'with' ( (otherlv_8= RULE_ID ) ) )* )? (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:2: ( (otherlv_0= 'component' () ) | (otherlv_2= 'instance' () ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'with' ( (otherlv_8= RULE_ID ) ) )* )? (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:2: ( (otherlv_0= 'component' () ) | (otherlv_2= 'instance' () ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:3: (otherlv_0= 'component' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:3: (otherlv_0= 'component' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:5: otherlv_0= 'component' ()
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleComponentDecl466); 

                        	newLeafNode(otherlv_0, grammarAccess.getComponentDeclAccess().getComponentKeyword_0_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:216:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:217:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentDeclAccess().getComponentAction_0_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:223:6: (otherlv_2= 'instance' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:223:6: (otherlv_2= 'instance' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:223:8: otherlv_2= 'instance' ()
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleComponentDecl495); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentDeclAccess().getInstanceKeyword_0_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:227:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:228:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentDeclAccess().getInstanceAction_0_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:233:4: ( (lv_name_4_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:234:1: (lv_name_4_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:234:1: (lv_name_4_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:235:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl523); 

            			newLeafNode(lv_name_4_0, grammarAccess.getComponentDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:251:2: (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'with' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:251:4: otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'with' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleComponentDecl541); 

                        	newLeafNode(otherlv_5, grammarAccess.getComponentDeclAccess().getExtendsKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:255:1: ( (otherlv_6= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:256:1: (otherlv_6= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:256:1: (otherlv_6= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:257:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentDeclRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl561); 

                    		newLeafNode(otherlv_6, grammarAccess.getComponentDeclAccess().getSupersComponentDeclCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:268:2: (otherlv_7= 'with' ( (otherlv_8= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:268:4: otherlv_7= 'with' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleComponentDecl574); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getComponentDeclAccess().getWithKeyword_2_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:272:1: ( (otherlv_8= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:273:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:273:1: (otherlv_8= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:274:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getComponentDeclRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl594); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getComponentDeclAccess().getSupersComponentDeclCrossReference_2_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:285:6: (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:285:8: otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleComponentDecl611); 

                        	newLeafNode(otherlv_9, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:289:1: ( (lv_members_10_0= ruleMemberDecl ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||(LA6_0>=19 && LA6_0<=23)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:290:1: (lv_members_10_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:290:1: (lv_members_10_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:291:3: lv_members_10_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getMembersMemberDeclParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleComponentDecl632);
                    	    lv_members_10_0=ruleMemberDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"members",
                    	            		lv_members_10_0, 
                    	            		"MemberDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleComponentDecl645); 

                        	newLeafNode(otherlv_11, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_3_2());
                        

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
    // $ANTLR end "ruleComponentDecl"


    // $ANTLR start "entryRuleMemberDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:319:1: entryRuleMemberDecl returns [EObject current=null] : iv_ruleMemberDecl= ruleMemberDecl EOF ;
    public final EObject entryRuleMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:320:2: (iv_ruleMemberDecl= ruleMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:321:2: iv_ruleMemberDecl= ruleMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getMemberDeclRule()); 
            pushFollow(FOLLOW_ruleMemberDecl_in_entryRuleMemberDecl683);
            iv_ruleMemberDecl=ruleMemberDecl();

            state._fsp--;

             current =iv_ruleMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDecl693); 

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
    // $ANTLR end "entryRuleMemberDecl"


    // $ANTLR start "ruleMemberDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:328:1: ruleMemberDecl returns [EObject current=null] : (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl ) ;
    public final EObject ruleMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject this_AttrDecl_0 = null;

        EObject this_SubMemberDecl_1 = null;

        EObject this_InvariantDecl_2 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:331:28: ( (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:332:1: (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:332:1: (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:333:5: this_AttrDecl_0= ruleAttrDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getAttrDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAttrDecl_in_ruleMemberDecl740);
                    this_AttrDecl_0=ruleAttrDecl();

                    state._fsp--;

                     
                            current = this_AttrDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:343:5: this_SubMemberDecl_1= ruleSubMemberDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getSubMemberDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSubMemberDecl_in_ruleMemberDecl767);
                    this_SubMemberDecl_1=ruleSubMemberDecl();

                    state._fsp--;

                     
                            current = this_SubMemberDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:353:5: this_InvariantDecl_2= ruleInvariantDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getInvariantDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInvariantDecl_in_ruleMemberDecl794);
                    this_InvariantDecl_2=ruleInvariantDecl();

                    state._fsp--;

                     
                            current = this_InvariantDecl_2; 
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
    // $ANTLR end "ruleMemberDecl"


    // $ANTLR start "entryRuleAttrDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:369:1: entryRuleAttrDecl returns [EObject current=null] : iv_ruleAttrDecl= ruleAttrDecl EOF ;
    public final EObject entryRuleAttrDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:370:2: (iv_ruleAttrDecl= ruleAttrDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:371:2: iv_ruleAttrDecl= ruleAttrDecl EOF
            {
             newCompositeNode(grammarAccess.getAttrDeclRule()); 
            pushFollow(FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl829);
            iv_ruleAttrDecl=ruleAttrDecl();

            state._fsp--;

             current =iv_ruleAttrDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrDecl839); 

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
    // $ANTLR end "entryRuleAttrDecl"


    // $ANTLR start "ruleAttrDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:378:1: ruleAttrDecl returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) ) ;
    public final EObject ruleAttrDecl() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_modifier_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_literal_5_0 = null;

        EObject lv_literal_7_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:381:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:382:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:382:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:382:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:382:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:383:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:383:1: (lv_modifier_0_0= ruleModifier )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:384:3: lv_modifier_0_0= ruleModifier
            {
             
            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModifier_in_ruleAttrDecl885);
            lv_modifier_0_0=ruleModifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttrDeclRule());
            	        }
                   		set(
                   			current, 
                   			"modifier",
                    		lv_modifier_0_0, 
                    		"Modifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:400:2: ( (lv_attributeName_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:401:1: (lv_attributeName_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:401:1: (lv_attributeName_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:402:3: lv_attributeName_1_0= RULE_ID
            {
            lv_attributeName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttrDecl902); 

            			newLeafNode(lv_attributeName_1_0, grammarAccess.getAttrDeclAccess().getAttributeNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributeName",
                    		lv_attributeName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:418:2: ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==18) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:418:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:418:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:418:5: otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )?
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAttrDecl921); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttrDeclAccess().getColonKeyword_2_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:422:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:423:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:423:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:424:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAttrDecl942);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttrDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:440:2: (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:440:4: otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) )
                            {
                            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAttrDecl955); 

                                	newLeafNode(otherlv_4, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_0_2_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:444:1: ( (lv_literal_5_0= ruleLiteral ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:445:1: (lv_literal_5_0= ruleLiteral )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:445:1: (lv_literal_5_0= ruleLiteral )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:446:3: lv_literal_5_0= ruleLiteral
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl976);
                            lv_literal_5_0=ruleLiteral();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttrDeclRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"literal",
                                    		lv_literal_5_0, 
                                    		"Literal");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:463:6: (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:463:6: (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:463:8: otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleAttrDecl998); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:467:1: ( (lv_literal_7_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:468:1: (lv_literal_7_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:468:1: (lv_literal_7_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:469:3: lv_literal_7_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl1019);
                    lv_literal_7_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttrDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_7_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleAttrDecl"


    // $ANTLR start "entryRuleModifier"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:493:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:494:2: (iv_ruleModifier= ruleModifier EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:495:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier1058);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier1069); 

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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:502:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:505:28: ( (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:506:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:506:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:507:2: kw= 'const'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleModifier1107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getConstKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:514:2: kw= 'val'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleModifier1126); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getValKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:521:2: kw= 'var'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleModifier1145); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getVarKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:528:2: kw= 'def'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleModifier1164); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getDefKeyword_3()); 
                        

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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleSubMemberDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:541:1: entryRuleSubMemberDecl returns [EObject current=null] : iv_ruleSubMemberDecl= ruleSubMemberDecl EOF ;
    public final EObject entryRuleSubMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:542:2: (iv_ruleSubMemberDecl= ruleSubMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:543:2: iv_ruleSubMemberDecl= ruleSubMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getSubMemberDeclRule()); 
            pushFollow(FOLLOW_ruleSubMemberDecl_in_entryRuleSubMemberDecl1204);
            iv_ruleSubMemberDecl=ruleSubMemberDecl();

            state._fsp--;

             current =iv_ruleSubMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMemberDecl1214); 

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
    // $ANTLR end "entryRuleSubMemberDecl"


    // $ANTLR start "ruleSubMemberDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:550:1: ruleSubMemberDecl returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}' )? ) | (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' ) ) ) ;
    public final EObject ruleSubMemberDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_members_7_0 = null;

        EObject lv_members_10_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:553:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}' )? ) | (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:554:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}' )? ) | (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:554:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}' )? ) | (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:554:2: () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}' )? ) | (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:554:2: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:555:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubMemberDeclAccess().getSubMemberDeclAction_0(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:560:2: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:561:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:561:1: (lv_name_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:562:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberDecl1265); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubMemberDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubMemberDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:578:2: ( (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}' )? ) | (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            else if ( (LA16_0==15) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:578:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:578:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:578:5: otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}' )?
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSubMemberDecl1284); 

                        	newLeafNode(otherlv_2, grammarAccess.getSubMemberDeclAccess().getColonKeyword_2_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:582:1: ( (otherlv_3= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:583:1: (otherlv_3= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:583:1: (otherlv_3= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:584:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubMemberDeclRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberDecl1304); 

                    		newLeafNode(otherlv_3, grammarAccess.getSubMemberDeclAccess().getSupersComponentDeclCrossReference_2_0_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:595:2: (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:595:4: otherlv_4= 'with' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSubMemberDecl1317); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSubMemberDeclAccess().getWithKeyword_2_0_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:599:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:600:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:600:1: (otherlv_5= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:601:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSubMemberDeclRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberDecl1337); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getSubMemberDeclAccess().getSupersComponentDeclCrossReference_2_0_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:612:4: (otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==15) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:612:6: otherlv_6= '{' ( (lv_members_7_0= ruleMemberDecl ) )* otherlv_8= '}'
                            {
                            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSubMemberDecl1352); 

                                	newLeafNode(otherlv_6, grammarAccess.getSubMemberDeclAccess().getLeftCurlyBracketKeyword_2_0_3_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:616:1: ( (lv_members_7_0= ruleMemberDecl ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==RULE_ID||(LA13_0>=19 && LA13_0<=23)) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:617:1: (lv_members_7_0= ruleMemberDecl )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:617:1: (lv_members_7_0= ruleMemberDecl )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:618:3: lv_members_7_0= ruleMemberDecl
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSubMemberDeclAccess().getMembersMemberDeclParserRuleCall_2_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleSubMemberDecl1373);
                            	    lv_members_7_0=ruleMemberDecl();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSubMemberDeclRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"members",
                            	            		lv_members_7_0, 
                            	            		"MemberDecl");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleSubMemberDecl1386); 

                                	newLeafNode(otherlv_8, grammarAccess.getSubMemberDeclAccess().getRightCurlyBracketKeyword_2_0_3_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:639:6: (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:639:6: (otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:639:8: otherlv_9= '{' ( (lv_members_10_0= ruleMemberDecl ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleSubMemberDecl1408); 

                        	newLeafNode(otherlv_9, grammarAccess.getSubMemberDeclAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:643:1: ( (lv_members_10_0= ruleMemberDecl ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||(LA15_0>=19 && LA15_0<=23)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:644:1: (lv_members_10_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:644:1: (lv_members_10_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:645:3: lv_members_10_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSubMemberDeclAccess().getMembersMemberDeclParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleSubMemberDecl1429);
                    	    lv_members_10_0=ruleMemberDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSubMemberDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"members",
                    	            		lv_members_10_0, 
                    	            		"MemberDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleSubMemberDecl1442); 

                        	newLeafNode(otherlv_11, grammarAccess.getSubMemberDeclAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleSubMemberDecl"


    // $ANTLR start "entryRuleInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:673:1: entryRuleInvariantDecl returns [EObject current=null] : iv_ruleInvariantDecl= ruleInvariantDecl EOF ;
    public final EObject entryRuleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:674:2: (iv_ruleInvariantDecl= ruleInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:675:2: iv_ruleInvariantDecl= ruleInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl1480);
            iv_ruleInvariantDecl=ruleInvariantDecl();

            state._fsp--;

             current =iv_ruleInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariantDecl1490); 

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
    // $ANTLR end "entryRuleInvariantDecl"


    // $ANTLR start "ruleInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:682:1: ruleInvariantDecl returns [EObject current=null] : this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl ;
    public final EObject ruleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicityInvariantDecl_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:685:28: (this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:687:5: this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl
            {
             
                    newCompositeNode(grammarAccess.getInvariantDeclAccess().getMultiplicityInvariantDeclParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMultiplicityInvariantDecl_in_ruleInvariantDecl1536);
            this_MultiplicityInvariantDecl_0=ruleMultiplicityInvariantDecl();

            state._fsp--;

             
                    current = this_MultiplicityInvariantDecl_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleInvariantDecl"


    // $ANTLR start "entryRuleMultiplicityInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:703:1: entryRuleMultiplicityInvariantDecl returns [EObject current=null] : iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF ;
    public final EObject entryRuleMultiplicityInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:704:2: (iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:705:2: iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleMultiplicityInvariantDecl_in_entryRuleMultiplicityInvariantDecl1570);
            iv_ruleMultiplicityInvariantDecl=ruleMultiplicityInvariantDecl();

            state._fsp--;

             current =iv_ruleMultiplicityInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityInvariantDecl1580); 

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
    // $ANTLR end "entryRuleMultiplicityInvariantDecl"


    // $ANTLR start "ruleMultiplicityInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:712:1: ruleMultiplicityInvariantDecl returns [EObject current=null] : (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) ;
    public final EObject ruleMultiplicityInvariantDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_invName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_lo_3_0 = null;

        EObject lv_hi_5_0 = null;

        EObject lv_match_6_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:715:28: ( (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:716:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:716:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:716:3: otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMultiplicityInvariantDecl1617); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiplicityInvariantDeclAccess().getInvKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:720:1: ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:720:2: ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:720:2: ( (lv_invName_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:721:1: (lv_invName_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:721:1: (lv_invName_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:722:3: lv_invName_1_0= RULE_ID
                    {
                    lv_invName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1635); 

                    			newLeafNode(lv_invName_1_0, grammarAccess.getMultiplicityInvariantDeclAccess().getInvNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityInvariantDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"invName",
                            		lv_invName_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMultiplicityInvariantDecl1652); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:742:3: ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:742:4: ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:742:4: ( (lv_lo_3_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:743:1: (lv_lo_3_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:743:1: (lv_lo_3_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:744:3: lv_lo_3_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getLoConstraintNatParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1676);
            lv_lo_3_0=ruleConstraintNat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicityInvariantDeclRule());
            	        }
                   		set(
                   			current, 
                   			"lo",
                    		lv_lo_3_0, 
                    		"ConstraintNat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleMultiplicityInvariantDecl1688); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiplicityInvariantDeclAccess().getFullStopFullStopKeyword_2_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:764:1: ( (lv_hi_5_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:765:1: (lv_hi_5_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:765:1: (lv_hi_5_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:766:3: lv_hi_5_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getHiConstraintNatParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1709);
            lv_hi_5_0=ruleConstraintNat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicityInvariantDeclRule());
            	        }
                   		set(
                   			current, 
                   			"hi",
                    		lv_hi_5_0, 
                    		"ConstraintNat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:782:3: ( (lv_match_6_0= ruleSubMemberMatch ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:783:1: (lv_match_6_0= ruleSubMemberMatch )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:783:1: (lv_match_6_0= ruleSubMemberMatch )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:784:3: lv_match_6_0= ruleSubMemberMatch
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchSubMemberMatchParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSubMemberMatch_in_ruleMultiplicityInvariantDecl1731);
            lv_match_6_0=ruleSubMemberMatch();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicityInvariantDeclRule());
            	        }
                   		set(
                   			current, 
                   			"match",
                    		lv_match_6_0, 
                    		"SubMemberMatch");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:800:2: (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:800:4: otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleMultiplicityInvariantDecl1744); 

                        	newLeafNode(otherlv_7, grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:804:1: ( (otherlv_8= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:805:1: (otherlv_8= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:805:1: (otherlv_8= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:806:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityInvariantDeclRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1764); 

                    		newLeafNode(otherlv_8, grammarAccess.getMultiplicityInvariantDeclAccess().getTypeComponentDeclCrossReference_4_1_0()); 
                    	

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
    // $ANTLR end "ruleMultiplicityInvariantDecl"


    // $ANTLR start "entryRuleSubMemberMatch"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:825:1: entryRuleSubMemberMatch returns [EObject current=null] : iv_ruleSubMemberMatch= ruleSubMemberMatch EOF ;
    public final EObject entryRuleSubMemberMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMemberMatch = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:826:2: (iv_ruleSubMemberMatch= ruleSubMemberMatch EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:827:2: iv_ruleSubMemberMatch= ruleSubMemberMatch EOF
            {
             newCompositeNode(grammarAccess.getSubMemberMatchRule()); 
            pushFollow(FOLLOW_ruleSubMemberMatch_in_entryRuleSubMemberMatch1802);
            iv_ruleSubMemberMatch=ruleSubMemberMatch();

            state._fsp--;

             current =iv_ruleSubMemberMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMemberMatch1812); 

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
    // $ANTLR end "entryRuleSubMemberMatch"


    // $ANTLR start "ruleSubMemberMatch"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:834:1: ruleSubMemberMatch returns [EObject current=null] : ( () ( ( (lv_qNames_1_0= RULE_ID ) ) otherlv_2= '.' )* ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_any_4_0= '*' ) ) ) ) ;
    public final EObject ruleSubMemberMatch() throws RecognitionException {
        EObject current = null;

        Token lv_qNames_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_any_4_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:837:28: ( ( () ( ( (lv_qNames_1_0= RULE_ID ) ) otherlv_2= '.' )* ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_any_4_0= '*' ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:838:1: ( () ( ( (lv_qNames_1_0= RULE_ID ) ) otherlv_2= '.' )* ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_any_4_0= '*' ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:838:1: ( () ( ( (lv_qNames_1_0= RULE_ID ) ) otherlv_2= '.' )* ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_any_4_0= '*' ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:838:2: () ( ( (lv_qNames_1_0= RULE_ID ) ) otherlv_2= '.' )* ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_any_4_0= '*' ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:838:2: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:839:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubMemberMatchAccess().getSubMemberMatchAction_0(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:844:2: ( ( (lv_qNames_1_0= RULE_ID ) ) otherlv_2= '.' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==25) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:844:3: ( (lv_qNames_1_0= RULE_ID ) ) otherlv_2= '.'
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:844:3: ( (lv_qNames_1_0= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:845:1: (lv_qNames_1_0= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:845:1: (lv_qNames_1_0= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:846:3: lv_qNames_1_0= RULE_ID
            	    {
            	    lv_qNames_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberMatch1864); 

            	    			newLeafNode(lv_qNames_1_0, grammarAccess.getSubMemberMatchAccess().getQNamesIDTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubMemberMatchRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"qNames",
            	            		lv_qNames_1_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleSubMemberMatch1881); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSubMemberMatchAccess().getFullStopKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:866:3: ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_any_4_0= '*' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==26) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:866:4: ( (lv_name_3_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:866:4: ( (lv_name_3_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:867:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:867:1: (lv_name_3_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:868:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberMatch1901); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getSubMemberMatchAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubMemberMatchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:885:6: ( (lv_any_4_0= '*' ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:885:6: ( (lv_any_4_0= '*' ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:886:1: (lv_any_4_0= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:886:1: (lv_any_4_0= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:887:3: lv_any_4_0= '*'
                    {
                    lv_any_4_0=(Token)match(input,26,FOLLOW_26_in_ruleSubMemberMatch1930); 

                            newLeafNode(lv_any_4_0, grammarAccess.getSubMemberMatchAccess().getAnyAsteriskKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubMemberMatchRule());
                    	        }
                           		setWithLastConsumed(current, "any", lv_any_4_0, "*");
                    	    

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
    // $ANTLR end "ruleSubMemberMatch"


    // $ANTLR start "entryRuleConstraintNat"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:908:1: entryRuleConstraintNat returns [EObject current=null] : iv_ruleConstraintNat= ruleConstraintNat EOF ;
    public final EObject entryRuleConstraintNat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintNat = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:909:2: (iv_ruleConstraintNat= ruleConstraintNat EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:910:2: iv_ruleConstraintNat= ruleConstraintNat EOF
            {
             newCompositeNode(grammarAccess.getConstraintNatRule()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat1980);
            iv_ruleConstraintNat=ruleConstraintNat();

            state._fsp--;

             current =iv_ruleConstraintNat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintNat1990); 

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
    // $ANTLR end "entryRuleConstraintNat"


    // $ANTLR start "ruleConstraintNat"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:917:1: ruleConstraintNat returns [EObject current=null] : ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) ;
    public final EObject ruleConstraintNat() throws RecognitionException {
        EObject current = null;

        Token lv_num_1_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:920:28: ( ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:921:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:921:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_NAT) ) {
                alt21=1;
            }
            else if ( (LA21_0==26) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:921:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:921:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:921:3: () ( (lv_num_1_0= RULE_NAT ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:921:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:922:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getNumNatConstraintAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:927:2: ( (lv_num_1_0= RULE_NAT ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:928:1: (lv_num_1_0= RULE_NAT )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:928:1: (lv_num_1_0= RULE_NAT )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:929:3: lv_num_1_0= RULE_NAT
                    {
                    lv_num_1_0=(Token)match(input,RULE_NAT,FOLLOW_RULE_NAT_in_ruleConstraintNat2042); 

                    			newLeafNode(lv_num_1_0, grammarAccess.getConstraintNatAccess().getNumNATTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintNatRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"num",
                            		lv_num_1_0, 
                            		"NAT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:946:6: ( () otherlv_3= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:946:6: ( () otherlv_3= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:946:7: () otherlv_3= '*'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:946:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:947:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getAnyNatConstraintAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleConstraintNat2076); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstraintNatAccess().getAsteriskKeyword_1_1());
                        

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
    // $ANTLR end "ruleConstraintNat"


    // $ANTLR start "entryRuleAppRequirement"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:966:1: entryRuleAppRequirement returns [EObject current=null] : iv_ruleAppRequirement= ruleAppRequirement EOF ;
    public final EObject entryRuleAppRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppRequirement = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:967:2: (iv_ruleAppRequirement= ruleAppRequirement EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:968:2: iv_ruleAppRequirement= ruleAppRequirement EOF
            {
             newCompositeNode(grammarAccess.getAppRequirementRule()); 
            pushFollow(FOLLOW_ruleAppRequirement_in_entryRuleAppRequirement2115);
            iv_ruleAppRequirement=ruleAppRequirement();

            state._fsp--;

             current =iv_ruleAppRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppRequirement2125); 

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
    // $ANTLR end "entryRuleAppRequirement"


    // $ANTLR start "ruleAppRequirement"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:975:1: ruleAppRequirement returns [EObject current=null] : (otherlv_0= 'app' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'requires' ( (lv_devices_3_0= ruleDevice ) )* ( (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )? ) | (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' ) ) ) ;
    public final EObject ruleAppRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_devices_3_0 = null;

        EObject lv_members_9_0 = null;

        EObject lv_members_12_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:978:28: ( (otherlv_0= 'app' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'requires' ( (lv_devices_3_0= ruleDevice ) )* ( (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )? ) | (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:979:1: (otherlv_0= 'app' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'requires' ( (lv_devices_3_0= ruleDevice ) )* ( (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )? ) | (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:979:1: (otherlv_0= 'app' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'requires' ( (lv_devices_3_0= ruleDevice ) )* ( (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )? ) | (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:979:3: otherlv_0= 'app' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'requires' ( (lv_devices_3_0= ruleDevice ) )* ( (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )? ) | (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleAppRequirement2162); 

                	newLeafNode(otherlv_0, grammarAccess.getAppRequirementAccess().getAppKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:983:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:984:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:984:1: (lv_name_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:985:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppRequirement2179); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAppRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAppRequirementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleAppRequirement2196); 

                	newLeafNode(otherlv_2, grammarAccess.getAppRequirementAccess().getRequiresKeyword_2());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1005:1: ( (lv_devices_3_0= ruleDevice ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1006:1: (lv_devices_3_0= ruleDevice )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1006:1: (lv_devices_3_0= ruleDevice )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1007:3: lv_devices_3_0= ruleDevice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAppRequirementAccess().getDevicesDeviceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDevice_in_ruleAppRequirement2217);
            	    lv_devices_3_0=ruleDevice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAppRequirementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"devices",
            	            		lv_devices_3_0, 
            	            		"Device");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1023:3: ( (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )? ) | (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            else if ( (LA27_0==15) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1023:4: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1023:4: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1023:6: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )?
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAppRequirement2232); 

                        	newLeafNode(otherlv_4, grammarAccess.getAppRequirementAccess().getExtendsKeyword_4_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1027:1: ( (otherlv_5= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1028:1: (otherlv_5= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1028:1: (otherlv_5= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1029:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAppRequirementRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppRequirement2252); 

                    		newLeafNode(otherlv_5, grammarAccess.getAppRequirementAccess().getSupersComponentDeclCrossReference_4_0_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1040:2: (otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1040:4: otherlv_6= 'with' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleAppRequirement2265); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAppRequirementAccess().getWithKeyword_4_0_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1044:1: ( (otherlv_7= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1045:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1045:1: (otherlv_7= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1046:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAppRequirementRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppRequirement2285); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getAppRequirementAccess().getSupersComponentDeclCrossReference_4_0_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1057:4: (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==15) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1057:6: otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}'
                            {
                            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleAppRequirement2300); 

                                	newLeafNode(otherlv_8, grammarAccess.getAppRequirementAccess().getLeftCurlyBracketKeyword_4_0_3_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1061:1: ( (lv_members_9_0= ruleMemberDecl ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==RULE_ID||(LA24_0>=19 && LA24_0<=23)) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1062:1: (lv_members_9_0= ruleMemberDecl )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1062:1: (lv_members_9_0= ruleMemberDecl )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1063:3: lv_members_9_0= ruleMemberDecl
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getAppRequirementAccess().getMembersMemberDeclParserRuleCall_4_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleAppRequirement2321);
                            	    lv_members_9_0=ruleMemberDecl();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getAppRequirementRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"members",
                            	            		lv_members_9_0, 
                            	            		"MemberDecl");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleAppRequirement2334); 

                                	newLeafNode(otherlv_10, grammarAccess.getAppRequirementAccess().getRightCurlyBracketKeyword_4_0_3_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1084:6: (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1084:6: (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1084:8: otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}'
                    {
                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleAppRequirement2356); 

                        	newLeafNode(otherlv_11, grammarAccess.getAppRequirementAccess().getLeftCurlyBracketKeyword_4_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1088:1: ( (lv_members_12_0= ruleMemberDecl ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID||(LA26_0>=19 && LA26_0<=23)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1089:1: (lv_members_12_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1089:1: (lv_members_12_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1090:3: lv_members_12_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAppRequirementAccess().getMembersMemberDeclParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleAppRequirement2377);
                    	    lv_members_12_0=ruleMemberDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAppRequirementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"members",
                    	            		lv_members_12_0, 
                    	            		"MemberDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleAppRequirement2390); 

                        	newLeafNode(otherlv_13, grammarAccess.getAppRequirementAccess().getRightCurlyBracketKeyword_4_1_2());
                        

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
    // $ANTLR end "ruleAppRequirement"


    // $ANTLR start "entryRuleDevice"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1118:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1119:2: (iv_ruleDevice= ruleDevice EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1120:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_ruleDevice_in_entryRuleDevice2428);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevice2438); 

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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1127:1: ruleDevice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1130:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1131:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1131:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1131:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1131:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1132:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1132:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1133:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice2480); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDevice2497); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getColonKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1153:1: ( (otherlv_2= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1154:1: (otherlv_2= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1154:1: (otherlv_2= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1155:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice2517); 

            		newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getTypeAppOrComponentCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1174:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1175:2: (iv_ruleType= ruleType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1176:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2553);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2563); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1183:1: ruleType returns [EObject current=null] : (this_BasicType_0= ruleBasicType ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_BasicType_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1186:28: ( (this_BasicType_0= ruleBasicType ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1187:1: (this_BasicType_0= ruleBasicType ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1187:1: (this_BasicType_0= ruleBasicType ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1188:5: this_BasicType_0= ruleBasicType ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )?
            {
             
                    newCompositeNode(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBasicType_in_ruleType2610);
            this_BasicType_0=ruleBasicType();

            state._fsp--;

             
                    current = this_BasicType_0; 
                    afterParserOrEnumRuleCall();
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1196:1: ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15||LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1196:2: ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )?
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1196:2: ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==29) ) {
                            alt28=1;
                        }
                        else if ( (LA28_0==15) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1196:3: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1196:3: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1196:4: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1196:4: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1197:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getTypeAccess().getListTypeBaseAction_1_0_0_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleType2633); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0_0_1());
                    	        
                    	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleType2645); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_0_0_2());
                    	        

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1211:6: ( () otherlv_5= '{' otherlv_6= '}' )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1211:6: ( () otherlv_5= '{' otherlv_6= '}' )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1211:7: () otherlv_5= '{' otherlv_6= '}'
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1211:7: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1212:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getTypeAccess().getSetTypeBaseAction_1_0_1_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleType2674); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_1_0_1_1());
                    	        
                    	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleType2686); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_1_0_1_2());
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1225:4: ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )?
                    int alt29=4;
                    switch ( input.LA(1) ) {
                        case 31:
                            {
                            alt29=1;
                            }
                            break;
                        case 32:
                            {
                            alt29=2;
                            }
                            break;
                        case 33:
                            {
                            alt29=3;
                            }
                            break;
                    }

                    switch (alt29) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1225:5: (otherlv_7= '?' () )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1225:5: (otherlv_7= '?' () )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1225:7: otherlv_7= '?' ()
                            {
                            otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleType2703); 

                                	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getQuestionMarkKeyword_1_1_0_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1229:1: ()
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1230:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getTypeAccess().getOptionTypeBaseAction_1_1_0_1(),
                                        current);
                                

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1236:6: (otherlv_9= '!' () )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1236:6: (otherlv_9= '!' () )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1236:8: otherlv_9= '!' ()
                            {
                            otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleType2732); 

                                	newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getExclamationMarkKeyword_1_1_1_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1240:1: ()
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1241:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getTypeAccess().getSomeTypeBaseAction_1_1_1_1(),
                                        current);
                                

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1247:6: (otherlv_11= '_' () )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1247:6: (otherlv_11= '_' () )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1247:8: otherlv_11= '_' ()
                            {
                            otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleType2761); 

                                	newLeafNode(otherlv_11, grammarAccess.getTypeAccess().get_Keyword_1_1_2_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1251:1: ()
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1252:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getTypeAccess().getNoneTypeBaseAction_1_1_2_1(),
                                        current);
                                

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBasicType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1265:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1266:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1267:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType2811);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType2821); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1274:1: ruleBasicType returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) ) ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )? ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_elemTypes_3_0 = null;

        EObject lv_elemTypes_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1277:28: ( ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) ) ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1278:1: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) ) ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1278:1: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) ) ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1278:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) ) ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1278:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==34) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1278:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1278:3: ( (otherlv_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1279:1: (otherlv_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1279:1: (otherlv_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1280:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicType2867); 

                    		newLeafNode(otherlv_0, grammarAccess.getBasicTypeAccess().getBaseTypeTypeDeclCrossReference_0_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1292:6: (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1292:6: (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1292:8: otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleBasicType2886); 

                        	newLeafNode(otherlv_1, grammarAccess.getBasicTypeAccess().getLessThanSignKeyword_0_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1296:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1297:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBasicTypeAccess().getTupleTypeAction_0_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1302:2: ( (lv_elemTypes_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1303:1: (lv_elemTypes_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1303:1: (lv_elemTypes_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1304:3: lv_elemTypes_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBasicTypeAccess().getElemTypesTypeParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBasicType2916);
                    lv_elemTypes_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBasicTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"elemTypes",
                            		lv_elemTypes_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1320:2: (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==26) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1320:4: otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleBasicType2929); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getBasicTypeAccess().getAsteriskKeyword_0_1_3_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1324:1: ( (lv_elemTypes_5_0= ruleType ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1325:1: (lv_elemTypes_5_0= ruleType )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1325:1: (lv_elemTypes_5_0= ruleType )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1326:3: lv_elemTypes_5_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBasicTypeAccess().getElemTypesTypeParserRuleCall_0_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleBasicType2950);
                    	    lv_elemTypes_5_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBasicTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elemTypes",
                    	            		lv_elemTypes_5_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleBasicType2964); 

                        	newLeafNode(otherlv_6, grammarAccess.getBasicTypeAccess().getGreaterThanSignKeyword_0_1_4());
                        

                    }


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1346:3: ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            else if ( (LA33_0==33) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1346:4: (otherlv_7= '?' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1346:4: (otherlv_7= '?' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1346:6: otherlv_7= '?' ()
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleBasicType2980); 

                        	newLeafNode(otherlv_7, grammarAccess.getBasicTypeAccess().getQuestionMarkKeyword_1_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1350:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1351:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBasicTypeAccess().getOptionTypeBaseAction_1_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1357:6: (otherlv_9= '_' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1357:6: (otherlv_9= '_' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1357:8: otherlv_9= '_' ()
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleBasicType3009); 

                        	newLeafNode(otherlv_9, grammarAccess.getBasicTypeAccess().get_Keyword_1_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1361:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1362:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBasicTypeAccess().getNoneTypeBaseAction_1_1_1(),
                                current);
                        

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1375:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1376:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1377:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3057);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3067); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1384:1: ruleLiteral returns [EObject current=null] : (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral | this_OptionLiteral_4= ruleOptionLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BasicLiteral_0 = null;

        EObject this_TupleLiteral_1 = null;

        EObject this_ListLiteral_2 = null;

        EObject this_SetLiteral_3 = null;

        EObject this_OptionLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1387:28: ( (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral | this_OptionLiteral_4= ruleOptionLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1388:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral | this_OptionLiteral_4= ruleOptionLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1388:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral | this_OptionLiteral_4= ruleOptionLiteral )
            int alt34=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt34=1;
                }
                break;
            case 34:
                {
                alt34=2;
                }
                break;
            case 29:
                {
                alt34=3;
                }
                break;
            case 15:
                {
                alt34=4;
                }
                break;
            case 37:
            case 38:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1389:5: this_BasicLiteral_0= ruleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicLiteral_in_ruleLiteral3114);
                    this_BasicLiteral_0=ruleBasicLiteral();

                    state._fsp--;

                     
                            current = this_BasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1399:5: this_TupleLiteral_1= ruleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleLiteral_in_ruleLiteral3141);
                    this_TupleLiteral_1=ruleTupleLiteral();

                    state._fsp--;

                     
                            current = this_TupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1409:5: this_ListLiteral_2= ruleListLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleListLiteral_in_ruleLiteral3168);
                    this_ListLiteral_2=ruleListLiteral();

                    state._fsp--;

                     
                            current = this_ListLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1419:5: this_SetLiteral_3= ruleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleLiteral3195);
                    this_SetLiteral_3=ruleSetLiteral();

                    state._fsp--;

                     
                            current = this_SetLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1429:5: this_OptionLiteral_4= ruleOptionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getOptionLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleOptionLiteral_in_ruleLiteral3222);
                    this_OptionLiteral_4=ruleOptionLiteral();

                    state._fsp--;

                     
                            current = this_OptionLiteral_4; 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBasicLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1445:1: entryRuleBasicLiteral returns [EObject current=null] : iv_ruleBasicLiteral= ruleBasicLiteral EOF ;
    public final EObject entryRuleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1446:2: (iv_ruleBasicLiteral= ruleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1447:2: iv_ruleBasicLiteral= ruleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral3257);
            iv_ruleBasicLiteral=ruleBasicLiteral();

            state._fsp--;

             current =iv_ruleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicLiteral3267); 

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
    // $ANTLR end "entryRuleBasicLiteral"


    // $ANTLR start "ruleBasicLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1454:1: ruleBasicLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) ;
    public final EObject ruleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lit_1_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1457:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1458:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1458:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1458:2: ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1458:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1459:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1459:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1460:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicLiteral3312); 

            		newLeafNode(otherlv_0, grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1471:2: ( (lv_lit_1_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1472:1: (lv_lit_1_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1472:1: (lv_lit_1_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1473:3: lv_lit_1_0= RULE_LIT
            {
            lv_lit_1_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleBasicLiteral3329); 

            			newLeafNode(lv_lit_1_0, grammarAccess.getBasicLiteralAccess().getLitLITTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lit",
                    		lv_lit_1_0, 
                    		"LIT");
            	    

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
    // $ANTLR end "ruleBasicLiteral"


    // $ANTLR start "entryRuleTupleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1497:1: entryRuleTupleLiteral returns [EObject current=null] : iv_ruleTupleLiteral= ruleTupleLiteral EOF ;
    public final EObject entryRuleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1498:2: (iv_ruleTupleLiteral= ruleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1499:2: iv_ruleTupleLiteral= ruleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral3370);
            iv_ruleTupleLiteral=ruleTupleLiteral();

            state._fsp--;

             current =iv_ruleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteral3380); 

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
    // $ANTLR end "entryRuleTupleLiteral"


    // $ANTLR start "ruleTupleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1506:1: ruleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1509:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1510:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1510:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1510:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleTupleLiteral3417); 

                	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1514:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1515:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1520:2: ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==15||LA36_0==29||LA36_0==34||(LA36_0>=37 && LA36_0<=38)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1520:3: ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1520:3: ( (lv_elems_2_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1521:1: (lv_elems_2_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1521:1: (lv_elems_2_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1522:3: lv_elems_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral3448);
                    lv_elems_2_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTupleLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"elems",
                            		lv_elems_2_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1538:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==36) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1538:4: otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleTupleLiteral3461); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1542:1: ( (lv_elems_4_0= ruleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1543:1: (lv_elems_4_0= ruleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1543:1: (lv_elems_4_0= ruleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1544:3: lv_elems_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral3482);
                    	    lv_elems_4_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTupleLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_4_0, 
                    	            		"Literal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleTupleLiteral3498); 

                	newLeafNode(otherlv_5, grammarAccess.getTupleLiteralAccess().getGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleTupleLiteral"


    // $ANTLR start "entryRuleListLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1572:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1573:2: (iv_ruleListLiteral= ruleListLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1574:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
             newCompositeNode(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral3534);
            iv_ruleListLiteral=ruleListLiteral();

            state._fsp--;

             current =iv_ruleListLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral3544); 

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
    // $ANTLR end "entryRuleListLiteral"


    // $ANTLR start "ruleListLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1581:1: ruleListLiteral returns [EObject current=null] : (otherlv_0= '[' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_basicType_1_0 = null;

        EObject lv_elems_3_0 = null;

        EObject lv_elems_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1584:28: ( (otherlv_0= '[' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1585:1: (otherlv_0= '[' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1585:1: (otherlv_0= '[' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1585:3: otherlv_0= '[' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleListLiteral3581); 

                	newLeafNode(otherlv_0, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1589:1: ( (lv_basicType_1_0= ruleBasicType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1590:1: (lv_basicType_1_0= ruleBasicType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1590:1: (lv_basicType_1_0= ruleBasicType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1591:3: lv_basicType_1_0= ruleBasicType
            {
             
            	        newCompositeNode(grammarAccess.getListLiteralAccess().getBasicTypeBasicTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBasicType_in_ruleListLiteral3602);
            lv_basicType_1_0=ruleBasicType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"basicType",
                    		lv_basicType_1_0, 
                    		"BasicType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleListLiteral3614); 

                	newLeafNode(otherlv_2, grammarAccess.getListLiteralAccess().getColonKeyword_2());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1611:1: ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_LIT||LA38_0==15||LA38_0==29||LA38_0==34||(LA38_0>=37 && LA38_0<=38)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1611:2: ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1611:2: ( (lv_elems_3_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1612:1: (lv_elems_3_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1612:1: (lv_elems_3_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1613:3: lv_elems_3_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getListLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleListLiteral3636);
                    lv_elems_3_0=ruleSimpleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"elems",
                            		lv_elems_3_0, 
                            		"SimpleLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1629:2: (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==36) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1629:4: otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleListLiteral3649); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getListLiteralAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1633:1: ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1634:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1634:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1635:3: lv_elems_5_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getListLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleListLiteral3670);
                    	    lv_elems_5_0=ruleSimpleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getListLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_5_0, 
                    	            		"SimpleLiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleListLiteral3686); 

                	newLeafNode(otherlv_6, grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleListLiteral"


    // $ANTLR start "entryRuleSetLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1663:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1664:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1665:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral3722);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;

             current =iv_ruleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral3732); 

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
    // $ANTLR end "entryRuleSetLiteral"


    // $ANTLR start "ruleSetLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1672:1: ruleSetLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_basicType_1_0 = null;

        EObject lv_elems_3_0 = null;

        EObject lv_elems_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1675:28: ( (otherlv_0= '{' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1676:1: (otherlv_0= '{' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1676:1: (otherlv_0= '{' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1676:3: otherlv_0= '{' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSetLiteral3769); 

                	newLeafNode(otherlv_0, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1680:1: ( (lv_basicType_1_0= ruleBasicType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1681:1: (lv_basicType_1_0= ruleBasicType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1681:1: (lv_basicType_1_0= ruleBasicType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1682:3: lv_basicType_1_0= ruleBasicType
            {
             
            	        newCompositeNode(grammarAccess.getSetLiteralAccess().getBasicTypeBasicTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBasicType_in_ruleSetLiteral3790);
            lv_basicType_1_0=ruleBasicType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"basicType",
                    		lv_basicType_1_0, 
                    		"BasicType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSetLiteral3802); 

                	newLeafNode(otherlv_2, grammarAccess.getSetLiteralAccess().getColonKeyword_2());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1702:1: ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_LIT||LA40_0==15||LA40_0==29||LA40_0==34||(LA40_0>=37 && LA40_0<=38)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1702:2: ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1702:2: ( (lv_elems_3_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1703:1: (lv_elems_3_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1703:1: (lv_elems_3_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1704:3: lv_elems_3_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral3824);
                    lv_elems_3_0=ruleSimpleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"elems",
                            		lv_elems_3_0, 
                            		"SimpleLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1720:2: (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==36) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1720:4: otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleSetLiteral3837); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSetLiteralAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1724:1: ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1725:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1725:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1726:3: lv_elems_5_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral3858);
                    	    lv_elems_5_0=ruleSimpleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_5_0, 
                    	            		"SimpleLiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleSetLiteral3874); 

                	newLeafNode(otherlv_6, grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleOptionLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1754:1: entryRuleOptionLiteral returns [EObject current=null] : iv_ruleOptionLiteral= ruleOptionLiteral EOF ;
    public final EObject entryRuleOptionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1755:2: (iv_ruleOptionLiteral= ruleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1756:2: iv_ruleOptionLiteral= ruleOptionLiteral EOF
            {
             newCompositeNode(grammarAccess.getOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral3910);
            iv_ruleOptionLiteral=ruleOptionLiteral();

            state._fsp--;

             current =iv_ruleOptionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionLiteral3920); 

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
    // $ANTLR end "entryRuleOptionLiteral"


    // $ANTLR start "ruleOptionLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1763:1: ruleOptionLiteral returns [EObject current=null] : ( (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) ) ) ;
    public final EObject ruleOptionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_lit_6_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1766:28: ( ( (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1767:1: ( (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1767:1: ( (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            else if ( (LA41_0==38) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1767:2: (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1767:2: (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1767:4: otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleOptionLiteral3958); 

                        	newLeafNode(otherlv_0, grammarAccess.getOptionLiteralAccess().getNoneKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1771:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1772:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionLiteralAccess().getNoneLiteralAction_0_1(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleOptionLiteral3979); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionLiteralAccess().getColonKeyword_0_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1781:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1782:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1782:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1783:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionLiteralAccess().getTypeTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleOptionLiteral4000);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1800:6: (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1800:6: (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1800:8: otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleOptionLiteral4020); 

                        	newLeafNode(otherlv_4, grammarAccess.getOptionLiteralAccess().getSomeKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1804:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1805:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionLiteralAccess().getSomeLiteralAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1810:2: ( (lv_lit_6_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1811:1: (lv_lit_6_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1811:1: (lv_lit_6_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1812:3: lv_lit_6_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionLiteralAccess().getLitLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleOptionLiteral4050);
                    lv_lit_6_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"lit",
                            		lv_lit_6_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleOptionLiteral"


    // $ANTLR start "entryRuleSimpleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1836:1: entryRuleSimpleLiteral returns [EObject current=null] : iv_ruleSimpleLiteral= ruleSimpleLiteral EOF ;
    public final EObject entryRuleSimpleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1837:2: (iv_ruleSimpleLiteral= ruleSimpleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1838:2: iv_ruleSimpleLiteral= ruleSimpleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleLiteral_in_entryRuleSimpleLiteral4087);
            iv_ruleSimpleLiteral=ruleSimpleLiteral();

            state._fsp--;

             current =iv_ruleSimpleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleLiteral4097); 

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
    // $ANTLR end "entryRuleSimpleLiteral"


    // $ANTLR start "ruleSimpleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1845:1: ruleSimpleLiteral returns [EObject current=null] : (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleListLiteral_2= ruleSimpleListLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral ) ;
    public final EObject ruleSimpleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBasicLiteral_0 = null;

        EObject this_SimpleTupleLiteral_1 = null;

        EObject this_SimpleListLiteral_2 = null;

        EObject this_SimpleSetLiteral_3 = null;

        EObject this_SimpleOptionLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1848:28: ( (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleListLiteral_2= ruleSimpleListLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1849:1: (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleListLiteral_2= ruleSimpleListLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1849:1: (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleListLiteral_2= ruleSimpleListLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral )
            int alt42=5;
            switch ( input.LA(1) ) {
            case RULE_LIT:
                {
                alt42=1;
                }
                break;
            case 34:
                {
                alt42=2;
                }
                break;
            case 29:
                {
                alt42=3;
                }
                break;
            case 15:
                {
                alt42=4;
                }
                break;
            case 37:
            case 38:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1850:5: this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleBasicLiteral_in_ruleSimpleLiteral4144);
                    this_SimpleBasicLiteral_0=ruleSimpleBasicLiteral();

                    state._fsp--;

                     
                            current = this_SimpleBasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1860:5: this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleTupleLiteral_in_ruleSimpleLiteral4171);
                    this_SimpleTupleLiteral_1=ruleSimpleTupleLiteral();

                    state._fsp--;

                     
                            current = this_SimpleTupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1870:5: this_SimpleListLiteral_2= ruleSimpleListLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleListLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSimpleListLiteral_in_ruleSimpleLiteral4198);
                    this_SimpleListLiteral_2=ruleSimpleListLiteral();

                    state._fsp--;

                     
                            current = this_SimpleListLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1880:5: this_SimpleSetLiteral_3= ruleSimpleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleSetLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSimpleSetLiteral_in_ruleSimpleLiteral4225);
                    this_SimpleSetLiteral_3=ruleSimpleSetLiteral();

                    state._fsp--;

                     
                            current = this_SimpleSetLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1890:5: this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleOptionLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSimpleOptionLiteral_in_ruleSimpleLiteral4252);
                    this_SimpleOptionLiteral_4=ruleSimpleOptionLiteral();

                    state._fsp--;

                     
                            current = this_SimpleOptionLiteral_4; 
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
    // $ANTLR end "ruleSimpleLiteral"


    // $ANTLR start "entryRuleSimpleBasicLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1906:1: entryRuleSimpleBasicLiteral returns [EObject current=null] : iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF ;
    public final EObject entryRuleSimpleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1907:2: (iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1908:2: iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleBasicLiteral_in_entryRuleSimpleBasicLiteral4287);
            iv_ruleSimpleBasicLiteral=ruleSimpleBasicLiteral();

            state._fsp--;

             current =iv_ruleSimpleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBasicLiteral4297); 

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
    // $ANTLR end "entryRuleSimpleBasicLiteral"


    // $ANTLR start "ruleSimpleBasicLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1915:1: ruleSimpleBasicLiteral returns [EObject current=null] : ( (lv_lit_0_0= RULE_LIT ) ) ;
    public final EObject ruleSimpleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1918:28: ( ( (lv_lit_0_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1919:1: ( (lv_lit_0_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1919:1: ( (lv_lit_0_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1920:1: (lv_lit_0_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1920:1: (lv_lit_0_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1921:3: lv_lit_0_0= RULE_LIT
            {
            lv_lit_0_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleSimpleBasicLiteral4338); 

            			newLeafNode(lv_lit_0_0, grammarAccess.getSimpleBasicLiteralAccess().getLitLITTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleBasicLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lit",
                    		lv_lit_0_0, 
                    		"LIT");
            	    

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
    // $ANTLR end "ruleSimpleBasicLiteral"


    // $ANTLR start "entryRuleSimpleTupleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1945:1: entryRuleSimpleTupleLiteral returns [EObject current=null] : iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF ;
    public final EObject entryRuleSimpleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1946:2: (iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1947:2: iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleTupleLiteral_in_entryRuleSimpleTupleLiteral4378);
            iv_ruleSimpleTupleLiteral=ruleSimpleTupleLiteral();

            state._fsp--;

             current =iv_ruleSimpleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTupleLiteral4388); 

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
    // $ANTLR end "entryRuleSimpleTupleLiteral"


    // $ANTLR start "ruleSimpleTupleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1954:1: ruleSimpleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleSimpleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1957:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1958:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1958:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1958:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleSimpleTupleLiteral4425); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1962:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1963:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleTupleLiteralAccess().getSimpleTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1968:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_LIT||LA44_0==15||LA44_0==29||LA44_0==34||(LA44_0>=37 && LA44_0<=38)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1968:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1968:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1969:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1969:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1970:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleTupleLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral4456);
                    lv_elems_2_0=ruleSimpleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleTupleLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"elems",
                            		lv_elems_2_0, 
                            		"SimpleLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1986:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==36) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1986:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleSimpleTupleLiteral4469); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1990:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1991:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1991:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1992:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleTupleLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral4490);
                    	    lv_elems_4_0=ruleSimpleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleTupleLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_4_0, 
                    	            		"SimpleLiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleSimpleTupleLiteral4506); 

                	newLeafNode(otherlv_5, grammarAccess.getSimpleTupleLiteralAccess().getGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleSimpleTupleLiteral"


    // $ANTLR start "entryRuleSimpleOptionLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2020:1: entryRuleSimpleOptionLiteral returns [EObject current=null] : iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF ;
    public final EObject entryRuleSimpleOptionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOptionLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2021:2: (iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2022:2: iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleOptionLiteral_in_entryRuleSimpleOptionLiteral4542);
            iv_ruleSimpleOptionLiteral=ruleSimpleOptionLiteral();

            state._fsp--;

             current =iv_ruleSimpleOptionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOptionLiteral4552); 

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
    // $ANTLR end "entryRuleSimpleOptionLiteral"


    // $ANTLR start "ruleSimpleOptionLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2029:1: ruleSimpleOptionLiteral returns [EObject current=null] : ( (otherlv_0= 'none' () ) | (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) ) ;
    public final EObject ruleSimpleOptionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lit_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2032:28: ( ( (otherlv_0= 'none' () ) | (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2033:1: ( (otherlv_0= 'none' () ) | (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2033:1: ( (otherlv_0= 'none' () ) | (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            else if ( (LA45_0==38) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2033:2: (otherlv_0= 'none' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2033:2: (otherlv_0= 'none' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2033:4: otherlv_0= 'none' ()
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleSimpleOptionLiteral4590); 

                        	newLeafNode(otherlv_0, grammarAccess.getSimpleOptionLiteralAccess().getNoneKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2037:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2038:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSimpleOptionLiteralAccess().getSimpleNoneLiteralAction_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2044:6: (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2044:6: (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2044:8: otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleSimpleOptionLiteral4619); 

                        	newLeafNode(otherlv_2, grammarAccess.getSimpleOptionLiteralAccess().getSomeKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2048:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2049:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSimpleOptionLiteralAccess().getSimpleSomeLiteralAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2054:2: ( (lv_lit_4_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2055:1: (lv_lit_4_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2055:1: (lv_lit_4_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2056:3: lv_lit_4_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleOptionLiteralAccess().getLitSimpleLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleOptionLiteral4649);
                    lv_lit_4_0=ruleSimpleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleOptionLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"lit",
                            		lv_lit_4_0, 
                            		"SimpleLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleSimpleOptionLiteral"


    // $ANTLR start "entryRuleSimpleListLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2080:1: entryRuleSimpleListLiteral returns [EObject current=null] : iv_ruleSimpleListLiteral= ruleSimpleListLiteral EOF ;
    public final EObject entryRuleSimpleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleListLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2081:2: (iv_ruleSimpleListLiteral= ruleSimpleListLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2082:2: iv_ruleSimpleListLiteral= ruleSimpleListLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleListLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleListLiteral_in_entryRuleSimpleListLiteral4686);
            iv_ruleSimpleListLiteral=ruleSimpleListLiteral();

            state._fsp--;

             current =iv_ruleSimpleListLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleListLiteral4696); 

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
    // $ANTLR end "entryRuleSimpleListLiteral"


    // $ANTLR start "ruleSimpleListLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2089:1: ruleSimpleListLiteral returns [EObject current=null] : (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleSimpleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2092:28: ( (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2093:1: (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2093:1: (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2093:3: otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSimpleListLiteral4733); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleListLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2097:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2098:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleListLiteralAccess().getSimpleListLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2103:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_LIT||LA47_0==15||LA47_0==29||LA47_0==34||(LA47_0>=37 && LA47_0<=38)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2103:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2103:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2104:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2104:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2105:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleListLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleListLiteral4764);
                    lv_elems_2_0=ruleSimpleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleListLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"elems",
                            		lv_elems_2_0, 
                            		"SimpleLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2121:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==36) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2121:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleSimpleListLiteral4777); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleListLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2125:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2126:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2126:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2127:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleListLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleListLiteral4798);
                    	    lv_elems_4_0=ruleSimpleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleListLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_4_0, 
                    	            		"SimpleLiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleSimpleListLiteral4814); 

                	newLeafNode(otherlv_5, grammarAccess.getSimpleListLiteralAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleSimpleListLiteral"


    // $ANTLR start "entryRuleSimpleSetLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2155:1: entryRuleSimpleSetLiteral returns [EObject current=null] : iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF ;
    public final EObject entryRuleSimpleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2156:2: (iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2157:2: iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleSetLiteral_in_entryRuleSimpleSetLiteral4850);
            iv_ruleSimpleSetLiteral=ruleSimpleSetLiteral();

            state._fsp--;

             current =iv_ruleSimpleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSetLiteral4860); 

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
    // $ANTLR end "entryRuleSimpleSetLiteral"


    // $ANTLR start "ruleSimpleSetLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2164:1: ruleSimpleSetLiteral returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSimpleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2167:28: ( (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2168:1: (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2168:1: (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2168:3: otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSimpleSetLiteral4897); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleSetLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2172:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2173:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleSetLiteralAccess().getSimpleSetLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2178:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_LIT||LA49_0==15||LA49_0==29||LA49_0==34||(LA49_0>=37 && LA49_0<=38)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2178:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2178:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2179:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2179:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2180:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral4928);
                    lv_elems_2_0=ruleSimpleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleSetLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"elems",
                            		lv_elems_2_0, 
                            		"SimpleLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2196:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==36) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2196:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleSimpleSetLiteral4941); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleSetLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2200:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2201:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2201:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2202:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral4962);
                    	    lv_elems_4_0=ruleSimpleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleSetLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_4_0, 
                    	            		"SimpleLiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSimpleSetLiteral4978); 

                	newLeafNode(otherlv_5, grammarAccess.getSimpleSetLiteralAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleSimpleSetLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleModel130 = new BitSet(new long[]{0x0000000008001C02L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleDecl223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDecl_in_ruleDecl250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppRequirement_in_ruleDecl277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleTypeDecl359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDecl_in_entryRuleComponentDecl417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDecl427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleComponentDecl466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12_in_ruleComponentDecl495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl523 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_13_in_ruleComponentDecl541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl561 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleComponentDecl574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl594 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_15_in_ruleComponentDecl611 = new BitSet(new long[]{0x0000000000F90010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleComponentDecl632 = new BitSet(new long[]{0x0000000000F90010L});
    public static final BitSet FOLLOW_16_in_ruleComponentDecl645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_entryRuleMemberDecl683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDecl693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_ruleMemberDecl740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberDecl_in_ruleMemberDecl767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_ruleMemberDecl794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrDecl839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleAttrDecl885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttrDecl902 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleAttrDecl921 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttrDecl942 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleAttrDecl955 = new BitSet(new long[]{0x0000006420008010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAttrDecl998 = new BitSet(new long[]{0x0000006420008010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier1058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModifier1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleModifier1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleModifier1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleModifier1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberDecl_in_entryRuleSubMemberDecl1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMemberDecl1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberDecl1265 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleSubMemberDecl1284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberDecl1304 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleSubMemberDecl1317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberDecl1337 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_15_in_ruleSubMemberDecl1352 = new BitSet(new long[]{0x0000000000F90010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleSubMemberDecl1373 = new BitSet(new long[]{0x0000000000F90010L});
    public static final BitSet FOLLOW_16_in_ruleSubMemberDecl1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSubMemberDecl1408 = new BitSet(new long[]{0x0000000000F90010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleSubMemberDecl1429 = new BitSet(new long[]{0x0000000000F90010L});
    public static final BitSet FOLLOW_16_in_ruleSubMemberDecl1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl1480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariantDecl1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariantDecl_in_ruleInvariantDecl1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariantDecl_in_entryRuleMultiplicityInvariantDecl1570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityInvariantDecl1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMultiplicityInvariantDecl1617 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1635 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMultiplicityInvariantDecl1652 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1676 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMultiplicityInvariantDecl1688 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1709 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleSubMemberMatch_in_ruleMultiplicityInvariantDecl1731 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleMultiplicityInvariantDecl1744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberMatch_in_entryRuleSubMemberMatch1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMemberMatch1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberMatch1864 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSubMemberMatch1881 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberMatch1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSubMemberMatch1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintNat1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAT_in_ruleConstraintNat2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConstraintNat2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppRequirement_in_entryRuleAppRequirement2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppRequirement2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAppRequirement2162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppRequirement2179 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAppRequirement2196 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_ruleDevice_in_ruleAppRequirement2217 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_13_in_ruleAppRequirement2232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppRequirement2252 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleAppRequirement2265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppRequirement2285 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_15_in_ruleAppRequirement2300 = new BitSet(new long[]{0x0000000000F90010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleAppRequirement2321 = new BitSet(new long[]{0x0000000000F90010L});
    public static final BitSet FOLLOW_16_in_ruleAppRequirement2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAppRequirement2356 = new BitSet(new long[]{0x0000000000F90010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleAppRequirement2377 = new BitSet(new long[]{0x0000000000F90010L});
    public static final BitSet FOLLOW_16_in_ruleAppRequirement2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevice_in_entryRuleDevice2428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevice2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice2480 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDevice2497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleType2610 = new BitSet(new long[]{0x0000000020008002L});
    public static final BitSet FOLLOW_29_in_ruleType2633 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleType2645 = new BitSet(new long[]{0x00000003A0008002L});
    public static final BitSet FOLLOW_15_in_ruleType2674 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleType2686 = new BitSet(new long[]{0x00000003A0008002L});
    public static final BitSet FOLLOW_31_in_ruleType2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleType2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType2811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicType2867 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_34_in_ruleBasicType2886 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBasicType2916 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBasicType2929 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBasicType2950 = new BitSet(new long[]{0x0000000804000000L});
    public static final BitSet FOLLOW_35_in_ruleBasicType2964 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_31_in_ruleBasicType2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBasicType3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_ruleLiteral3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_ruleLiteral3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_ruleLiteral3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleLiteral3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_ruleLiteral3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral3257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicLiteral3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicLiteral3312 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleBasicLiteral3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral3370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteral3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTupleLiteral3417 = new BitSet(new long[]{0x0000006C20008010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral3448 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36_in_ruleTupleLiteral3461 = new BitSet(new long[]{0x0000006420008010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral3482 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleTupleLiteral3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral3534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleListLiteral3581 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleListLiteral3602 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleListLiteral3614 = new BitSet(new long[]{0x0000006460008040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleListLiteral3636 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_36_in_ruleListLiteral3649 = new BitSet(new long[]{0x0000006420008040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleListLiteral3670 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_30_in_ruleListLiteral3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral3722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSetLiteral3769 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleSetLiteral3790 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSetLiteral3802 = new BitSet(new long[]{0x0000006420018040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral3824 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleSetLiteral3837 = new BitSet(new long[]{0x0000006420008040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral3858 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleSetLiteral3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral3910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionLiteral3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOptionLiteral3958 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOptionLiteral3979 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleOptionLiteral4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOptionLiteral4020 = new BitSet(new long[]{0x0000006420008010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleOptionLiteral4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_entryRuleSimpleLiteral4087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLiteral4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBasicLiteral_in_ruleSimpleLiteral4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTupleLiteral_in_ruleSimpleLiteral4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleListLiteral_in_ruleSimpleLiteral4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSetLiteral_in_ruleSimpleLiteral4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOptionLiteral_in_ruleSimpleLiteral4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBasicLiteral_in_entryRuleSimpleBasicLiteral4287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBasicLiteral4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleSimpleBasicLiteral4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTupleLiteral_in_entryRuleSimpleTupleLiteral4378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTupleLiteral4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSimpleTupleLiteral4425 = new BitSet(new long[]{0x0000006C20008040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral4456 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36_in_ruleSimpleTupleLiteral4469 = new BitSet(new long[]{0x0000006420008040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral4490 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleSimpleTupleLiteral4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOptionLiteral_in_entryRuleSimpleOptionLiteral4542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOptionLiteral4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSimpleOptionLiteral4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSimpleOptionLiteral4619 = new BitSet(new long[]{0x0000006420008040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleOptionLiteral4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleListLiteral_in_entryRuleSimpleListLiteral4686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleListLiteral4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSimpleListLiteral4733 = new BitSet(new long[]{0x0000006460008040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleListLiteral4764 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_36_in_ruleSimpleListLiteral4777 = new BitSet(new long[]{0x0000006420008040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleListLiteral4798 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_30_in_ruleSimpleListLiteral4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSetLiteral_in_entryRuleSimpleSetLiteral4850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSetLiteral4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSimpleSetLiteral4897 = new BitSet(new long[]{0x0000006420018040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral4928 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleSimpleSetLiteral4941 = new BitSet(new long[]{0x0000006420008040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral4962 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleSimpleSetLiteral4978 = new BitSet(new long[]{0x0000000000000002L});

}