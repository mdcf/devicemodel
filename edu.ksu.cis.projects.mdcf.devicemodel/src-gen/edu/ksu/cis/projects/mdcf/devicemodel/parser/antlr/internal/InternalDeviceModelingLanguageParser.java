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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NAT", "RULE_LIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'type'", "'component'", "'device'", "'app'", "'extends'", "'with'", "'{'", "'}'", "'requires'", "'provides'", "':'", "'='", "'const'", "'val'", "'var'", "'def'", "':='", "'('", "','", "')'", "'Option'", "'['", "']'", "'Some'", "'None'", "'Either'", "'inv'", "'..'", "'.'", "'*'", "'constraint'", "'report'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'&&'", "'||'", "'==>'", "'<=='", "'+'", "'-'", "'/'", "'%'", "'!'", "'^'", "'~'", "'Seq'", "'Set'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int T__10=10;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_LIT=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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

                if ( ((LA1_0>=10 && LA1_0<=13)||LA1_0==41) ) {
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:115:1: ruleDecl returns [EObject current=null] : (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl | this_ReportDecl_2= ruleReportDecl ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDecl_0 = null;

        EObject this_ComponentDecl_1 = null;

        EObject this_ReportDecl_2 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:118:28: ( (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl | this_ReportDecl_2= ruleReportDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:1: (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl | this_ReportDecl_2= ruleReportDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:1: (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl | this_ReportDecl_2= ruleReportDecl )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt2=1;
                }
                break;
            case 11:
            case 12:
            case 13:
                {
                alt2=2;
                }
                break;
            case 41:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:140:5: this_ReportDecl_2= ruleReportDecl
                    {
                     
                            newCompositeNode(grammarAccess.getDeclAccess().getReportDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReportDecl_in_ruleDecl277);
                    this_ReportDecl_2=ruleReportDecl();

                    state._fsp--;

                     
                            current = this_ReportDecl_2; 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:208:1: ruleComponentDecl returns [EObject current=null] : ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )? (otherlv_20= 'provides' otherlv_21= '{' ( (lv_reports_22_0= ruleReport ) )* otherlv_23= '}' )? ) ;
    public final EObject ruleComponentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_members_12_0 = null;

        EObject lv_devices_16_0 = null;

        EObject lv_assigns_17_0 = null;

        EObject lv_exp_18_0 = null;

        EObject lv_reports_22_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:211:28: ( ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )? (otherlv_20= 'provides' otherlv_21= '{' ( (lv_reports_22_0= ruleReport ) )* otherlv_23= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:1: ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )? (otherlv_20= 'provides' otherlv_21= '{' ( (lv_reports_22_0= ruleReport ) )* otherlv_23= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:1: ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )? (otherlv_20= 'provides' otherlv_21= '{' ( (lv_reports_22_0= ruleReport ) )* otherlv_23= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:2: ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )? (otherlv_20= 'provides' otherlv_21= '{' ( (lv_reports_22_0= ruleReport ) )* otherlv_23= '}' )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:2: ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:223:6: (otherlv_2= 'device' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:223:6: (otherlv_2= 'device' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:223:8: otherlv_2= 'device' ()
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleComponentDecl495); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentDeclAccess().getDeviceKeyword_0_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:227:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:228:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentDeclAccess().getDeviceAction_0_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:234:6: (otherlv_4= 'app' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:234:6: (otherlv_4= 'app' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:234:8: otherlv_4= 'app' ()
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleComponentDecl524); 

                        	newLeafNode(otherlv_4, grammarAccess.getComponentDeclAccess().getAppKeyword_0_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:238:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:239:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentDeclAccess().getAppAction_0_2_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:244:4: ( (lv_name_6_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:245:1: (lv_name_6_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:245:1: (lv_name_6_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:246:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl552); 

            			newLeafNode(lv_name_6_0, grammarAccess.getComponentDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:262:2: (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:262:4: otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleComponentDecl570); 

                        	newLeafNode(otherlv_7, grammarAccess.getComponentDeclAccess().getExtendsKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:266:1: ( (otherlv_8= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:267:1: (otherlv_8= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:267:1: (otherlv_8= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:268:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentDeclRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl590); 

                    		newLeafNode(otherlv_8, grammarAccess.getComponentDeclAccess().getSupersComponentDeclCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:279:2: (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:279:4: otherlv_9= 'with' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleComponentDecl603); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getComponentDeclAccess().getWithKeyword_2_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:283:1: ( (otherlv_10= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:1: (otherlv_10= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:285:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getComponentDeclRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl623); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getComponentDeclAccess().getSupersComponentDeclCrossReference_2_2_1_0()); 
                    	    	

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:296:6: (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:296:8: otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}'
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleComponentDecl640); 

                        	newLeafNode(otherlv_11, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:300:1: ( (lv_members_12_0= ruleMemberDecl ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||(LA6_0>=22 && LA6_0<=25)||LA6_0==36) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:301:1: (lv_members_12_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:301:1: (lv_members_12_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:302:3: lv_members_12_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getMembersMemberDeclParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleComponentDecl661);
                    	    lv_members_12_0=ruleMemberDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentDeclRule());
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
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleComponentDecl674); 

                        	newLeafNode(otherlv_13, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:322:3: (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:322:5: otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleComponentDecl689); 

                        	newLeafNode(otherlv_14, grammarAccess.getComponentDeclAccess().getRequiresKeyword_4_0());
                        
                    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleComponentDecl701); 

                        	newLeafNode(otherlv_15, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:330:1: ( (lv_devices_16_0= ruleDevice ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==20) ) {
                                alt8=1;
                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:331:1: (lv_devices_16_0= ruleDevice )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:331:1: (lv_devices_16_0= ruleDevice )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:332:3: lv_devices_16_0= ruleDevice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getDevicesDeviceParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDevice_in_ruleComponentDecl722);
                    	    lv_devices_16_0=ruleDevice();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"devices",
                    	            		lv_devices_16_0, 
                    	            		"Device");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:348:3: ( (lv_assigns_17_0= ruleAssignment ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==26) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:349:1: (lv_assigns_17_0= ruleAssignment )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:349:1: (lv_assigns_17_0= ruleAssignment )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:350:3: lv_assigns_17_0= ruleAssignment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getAssignsAssignmentParserRuleCall_4_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAssignment_in_ruleComponentDecl744);
                    	    lv_assigns_17_0=ruleAssignment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"assigns",
                    	            		lv_assigns_17_0, 
                    	            		"Assignment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:366:3: ( (lv_exp_18_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:367:1: (lv_exp_18_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:367:1: (lv_exp_18_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:368:3: lv_exp_18_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getExpExpParserRuleCall_4_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleComponentDecl766);
                    lv_exp_18_0=ruleExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"exp",
                            		lv_exp_18_0, 
                            		"Exp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleComponentDecl778); 

                        	newLeafNode(otherlv_19, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:388:3: (otherlv_20= 'provides' otherlv_21= '{' ( (lv_reports_22_0= ruleReport ) )* otherlv_23= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:388:5: otherlv_20= 'provides' otherlv_21= '{' ( (lv_reports_22_0= ruleReport ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleComponentDecl793); 

                        	newLeafNode(otherlv_20, grammarAccess.getComponentDeclAccess().getProvidesKeyword_5_0());
                        
                    otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleComponentDecl805); 

                        	newLeafNode(otherlv_21, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:396:1: ( (lv_reports_22_0= ruleReport ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:397:1: (lv_reports_22_0= ruleReport )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:397:1: (lv_reports_22_0= ruleReport )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:398:3: lv_reports_22_0= ruleReport
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getReportsReportParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReport_in_ruleComponentDecl826);
                    	    lv_reports_22_0=ruleReport();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"reports",
                    	            		lv_reports_22_0, 
                    	            		"Report");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleComponentDecl839); 

                        	newLeafNode(otherlv_23, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_5_3());
                        

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:426:1: entryRuleMemberDecl returns [EObject current=null] : iv_ruleMemberDecl= ruleMemberDecl EOF ;
    public final EObject entryRuleMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:427:2: (iv_ruleMemberDecl= ruleMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:428:2: iv_ruleMemberDecl= ruleMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getMemberDeclRule()); 
            pushFollow(FOLLOW_ruleMemberDecl_in_entryRuleMemberDecl877);
            iv_ruleMemberDecl=ruleMemberDecl();

            state._fsp--;

             current =iv_ruleMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDecl887); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:435:1: ruleMemberDecl returns [EObject current=null] : (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl ) ;
    public final EObject ruleMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject this_AttrDecl_0 = null;

        EObject this_SubMemberDecl_1 = null;

        EObject this_InvariantDecl_2 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:438:28: ( (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:439:1: (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:439:1: (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 36:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:440:5: this_AttrDecl_0= ruleAttrDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getAttrDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAttrDecl_in_ruleMemberDecl934);
                    this_AttrDecl_0=ruleAttrDecl();

                    state._fsp--;

                     
                            current = this_AttrDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:450:5: this_SubMemberDecl_1= ruleSubMemberDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getSubMemberDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSubMemberDecl_in_ruleMemberDecl961);
                    this_SubMemberDecl_1=ruleSubMemberDecl();

                    state._fsp--;

                     
                            current = this_SubMemberDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:460:5: this_InvariantDecl_2= ruleInvariantDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getInvariantDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInvariantDecl_in_ruleMemberDecl988);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:476:1: entryRuleAttrDecl returns [EObject current=null] : iv_ruleAttrDecl= ruleAttrDecl EOF ;
    public final EObject entryRuleAttrDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:477:2: (iv_ruleAttrDecl= ruleAttrDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:478:2: iv_ruleAttrDecl= ruleAttrDecl EOF
            {
             newCompositeNode(grammarAccess.getAttrDeclRule()); 
            pushFollow(FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl1023);
            iv_ruleAttrDecl=ruleAttrDecl();

            state._fsp--;

             current =iv_ruleAttrDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrDecl1033); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:485:1: ruleAttrDecl returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:488:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:489:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:489:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:489:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:489:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:490:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:490:1: (lv_modifier_0_0= ruleModifier )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:491:3: lv_modifier_0_0= ruleModifier
            {
             
            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModifier_in_ruleAttrDecl1079);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:507:2: ( (lv_attributeName_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:508:1: (lv_attributeName_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:508:1: (lv_attributeName_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:509:3: lv_attributeName_1_0= RULE_ID
            {
            lv_attributeName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttrDecl1096); 

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:525:2: ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==21) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:525:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:525:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:525:5: otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )?
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAttrDecl1115); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttrDeclAccess().getColonKeyword_2_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:529:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:530:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:530:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:531:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAttrDecl1136);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:547:2: (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==21) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:547:4: otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) )
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAttrDecl1149); 

                                	newLeafNode(otherlv_4, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_0_2_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:551:1: ( (lv_literal_5_0= ruleLiteral ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:552:1: (lv_literal_5_0= ruleLiteral )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:552:1: (lv_literal_5_0= ruleLiteral )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:553:3: lv_literal_5_0= ruleLiteral
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl1170);
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:570:6: (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:570:6: (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:570:8: otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleAttrDecl1192); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:574:1: ( (lv_literal_7_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:575:1: (lv_literal_7_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:575:1: (lv_literal_7_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:576:3: lv_literal_7_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl1213);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:600:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:601:2: (iv_ruleModifier= ruleModifier EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:602:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier1252);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier1263); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:609:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:612:28: ( (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:613:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:613:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            case 25:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:614:2: kw= 'const'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleModifier1301); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getConstKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:621:2: kw= 'val'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleModifier1320); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getValKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:628:2: kw= 'var'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleModifier1339); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getVarKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:635:2: kw= 'def'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleModifier1358); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:648:1: entryRuleSubMemberDecl returns [EObject current=null] : iv_ruleSubMemberDecl= ruleSubMemberDecl EOF ;
    public final EObject entryRuleSubMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:649:2: (iv_ruleSubMemberDecl= ruleSubMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:650:2: iv_ruleSubMemberDecl= ruleSubMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getSubMemberDeclRule()); 
            pushFollow(FOLLOW_ruleSubMemberDecl_in_entryRuleSubMemberDecl1398);
            iv_ruleSubMemberDecl=ruleSubMemberDecl();

            state._fsp--;

             current =iv_ruleSubMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMemberDecl1408); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:657:1: ruleSubMemberDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) ) | (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleSubMemberDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_2_0 = null;

        EObject lv_members_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:660:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) ) | (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:661:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) ) | (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:661:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) ) | (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:661:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) ) | (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:661:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:662:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:662:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:663:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberDecl1450); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSubMemberDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubMemberDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:679:2: ( (otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) ) | (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            else if ( (LA18_0==21) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:679:3: (otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:679:3: (otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:679:5: otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSubMemberDecl1469); 

                        	newLeafNode(otherlv_1, grammarAccess.getSubMemberDeclAccess().getColonKeyword_1_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:683:1: ( (lv_type_2_0= ruleFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:684:1: (lv_type_2_0= ruleFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:684:1: (lv_type_2_0= ruleFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:685:3: lv_type_2_0= ruleFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubMemberDeclAccess().getTypeFeatureTypeParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureType_in_ruleSubMemberDecl1490);
                    lv_type_2_0=ruleFeatureType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubMemberDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"FeatureType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:702:6: (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:702:6: (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:702:8: otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleSubMemberDecl1510); 

                        	newLeafNode(otherlv_3, grammarAccess.getSubMemberDeclAccess().getEqualsSignKeyword_1_1_0());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSubMemberDecl1522); 

                        	newLeafNode(otherlv_4, grammarAccess.getSubMemberDeclAccess().getLeftCurlyBracketKeyword_1_1_1());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:710:1: ( (lv_members_5_0= ruleMemberDecl ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID||(LA17_0>=22 && LA17_0<=25)||LA17_0==36) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:711:1: (lv_members_5_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:711:1: (lv_members_5_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:712:3: lv_members_5_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSubMemberDeclAccess().getMembersMemberDeclParserRuleCall_1_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleSubMemberDecl1543);
                    	    lv_members_5_0=ruleMemberDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSubMemberDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"members",
                    	            		lv_members_5_0, 
                    	            		"MemberDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleSubMemberDecl1556); 

                        	newLeafNode(otherlv_6, grammarAccess.getSubMemberDeclAccess().getRightCurlyBracketKeyword_1_1_3());
                        

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


    // $ANTLR start "entryRuleAssignment"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:740:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:741:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:742:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1594);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1604); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:749:1: ruleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:752:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExp ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:753:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:753:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExp ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:753:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExp ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:753:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:754:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:754:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:755:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1646); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleAssignment1663); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:775:1: ( (lv_exp_2_0= ruleExp ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:776:1: (lv_exp_2_0= ruleExp )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:776:1: (lv_exp_2_0= ruleExp )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:777:3: lv_exp_2_0= ruleExp
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExp_in_ruleAssignment1684);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_2_0, 
                    		"Exp");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleReport"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:801:1: entryRuleReport returns [EObject current=null] : iv_ruleReport= ruleReport EOF ;
    public final EObject entryRuleReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReport = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:802:2: (iv_ruleReport= ruleReport EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:803:2: iv_ruleReport= ruleReport EOF
            {
             newCompositeNode(grammarAccess.getReportRule()); 
            pushFollow(FOLLOW_ruleReport_in_entryRuleReport1720);
            iv_ruleReport=ruleReport();

            state._fsp--;

             current =iv_ruleReport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReport1730); 

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
    // $ANTLR end "entryRuleReport"


    // $ANTLR start "ruleReport"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:810:1: ruleReport returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )+ otherlv_5= ')' ) ;
    public final EObject ruleReport() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:813:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )+ otherlv_5= ')' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:814:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )+ otherlv_5= ')' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:814:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )+ otherlv_5= ')' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:814:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )+ otherlv_5= ')'
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:814:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:815:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:815:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:816:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReport1772); 

            			newLeafNode(lv_name_0_0, grammarAccess.getReportAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleReport1789); 

                	newLeafNode(otherlv_1, grammarAccess.getReportAccess().getLeftParenthesisKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:836:1: ( (lv_args_2_0= ruleExp ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:837:1: (lv_args_2_0= ruleExp )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:837:1: (lv_args_2_0= ruleExp )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:838:3: lv_args_2_0= ruleExp
            {
             
            	        newCompositeNode(grammarAccess.getReportAccess().getArgsExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExp_in_ruleReport1810);
            lv_args_2_0=ruleExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReportRule());
            	        }
                   		add(
                   			current, 
                   			"args",
                    		lv_args_2_0, 
                    		"Exp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:854:2: (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:854:4: otherlv_3= ',' ( (lv_args_4_0= ruleExp ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleReport1823); 

            	        	newLeafNode(otherlv_3, grammarAccess.getReportAccess().getCommaKeyword_3_0());
            	        
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:858:1: ( (lv_args_4_0= ruleExp ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:859:1: (lv_args_4_0= ruleExp )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:859:1: (lv_args_4_0= ruleExp )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:860:3: lv_args_4_0= ruleExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReportAccess().getArgsExpParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExp_in_ruleReport1844);
            	    lv_args_4_0=ruleExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReportRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"args",
            	            		lv_args_4_0, 
            	            		"Exp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleReport1858); 

                	newLeafNode(otherlv_5, grammarAccess.getReportAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleReport"


    // $ANTLR start "entryRuleFeatureType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:888:1: entryRuleFeatureType returns [EObject current=null] : iv_ruleFeatureType= ruleFeatureType EOF ;
    public final EObject entryRuleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:889:2: (iv_ruleFeatureType= ruleFeatureType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:890:2: iv_ruleFeatureType= ruleFeatureType EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_ruleFeatureType_in_entryRuleFeatureType1894);
            iv_ruleFeatureType=ruleFeatureType();

            state._fsp--;

             current =iv_ruleFeatureType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureType1904); 

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
    // $ANTLR end "entryRuleFeatureType"


    // $ANTLR start "ruleFeatureType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:897:1: ruleFeatureType returns [EObject current=null] : (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' ) | (otherlv_6= 'Some' () otherlv_8= '[' ( (lv_base_9_0= ruleBaseFeatureType ) ) otherlv_10= ']' (otherlv_11= '=' otherlv_12= '{' ( (lv_members_13_0= ruleMemberDecl ) )* otherlv_14= '}' )? ) | (otherlv_15= 'None' () otherlv_17= '[' ( (lv_base_18_0= ruleBaseFeatureType ) ) otherlv_19= ']' ) | (otherlv_20= 'Either' () otherlv_22= '[' ( (lv_bases_23_0= ruleBaseFeatureType ) ) (otherlv_24= ',' ( (lv_bases_25_0= ruleBaseFeatureType ) ) )+ otherlv_26= ']' (otherlv_27= '=' ( (lv_choice_28_0= RULE_NAT ) ) otherlv_29= '{' ( (lv_members_30_0= ruleMemberDecl ) )* otherlv_31= '}' )? ) ) ;
    public final EObject ruleFeatureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_choice_28_0=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject this_BaseFeatureType_0 = null;

        EObject lv_base_4_0 = null;

        EObject lv_base_9_0 = null;

        EObject lv_members_13_0 = null;

        EObject lv_base_18_0 = null;

        EObject lv_bases_23_0 = null;

        EObject lv_bases_25_0 = null;

        EObject lv_members_30_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:900:28: ( (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' ) | (otherlv_6= 'Some' () otherlv_8= '[' ( (lv_base_9_0= ruleBaseFeatureType ) ) otherlv_10= ']' (otherlv_11= '=' otherlv_12= '{' ( (lv_members_13_0= ruleMemberDecl ) )* otherlv_14= '}' )? ) | (otherlv_15= 'None' () otherlv_17= '[' ( (lv_base_18_0= ruleBaseFeatureType ) ) otherlv_19= ']' ) | (otherlv_20= 'Either' () otherlv_22= '[' ( (lv_bases_23_0= ruleBaseFeatureType ) ) (otherlv_24= ',' ( (lv_bases_25_0= ruleBaseFeatureType ) ) )+ otherlv_26= ']' (otherlv_27= '=' ( (lv_choice_28_0= RULE_NAT ) ) otherlv_29= '{' ( (lv_members_30_0= ruleMemberDecl ) )* otherlv_31= '}' )? ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:901:1: (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' ) | (otherlv_6= 'Some' () otherlv_8= '[' ( (lv_base_9_0= ruleBaseFeatureType ) ) otherlv_10= ']' (otherlv_11= '=' otherlv_12= '{' ( (lv_members_13_0= ruleMemberDecl ) )* otherlv_14= '}' )? ) | (otherlv_15= 'None' () otherlv_17= '[' ( (lv_base_18_0= ruleBaseFeatureType ) ) otherlv_19= ']' ) | (otherlv_20= 'Either' () otherlv_22= '[' ( (lv_bases_23_0= ruleBaseFeatureType ) ) (otherlv_24= ',' ( (lv_bases_25_0= ruleBaseFeatureType ) ) )+ otherlv_26= ']' (otherlv_27= '=' ( (lv_choice_28_0= RULE_NAT ) ) otherlv_29= '{' ( (lv_members_30_0= ruleMemberDecl ) )* otherlv_31= '}' )? ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:901:1: (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' ) | (otherlv_6= 'Some' () otherlv_8= '[' ( (lv_base_9_0= ruleBaseFeatureType ) ) otherlv_10= ']' (otherlv_11= '=' otherlv_12= '{' ( (lv_members_13_0= ruleMemberDecl ) )* otherlv_14= '}' )? ) | (otherlv_15= 'None' () otherlv_17= '[' ( (lv_base_18_0= ruleBaseFeatureType ) ) otherlv_19= ']' ) | (otherlv_20= 'Either' () otherlv_22= '[' ( (lv_bases_23_0= ruleBaseFeatureType ) ) (otherlv_24= ',' ( (lv_bases_25_0= ruleBaseFeatureType ) ) )+ otherlv_26= ']' (otherlv_27= '=' ( (lv_choice_28_0= RULE_NAT ) ) otherlv_29= '{' ( (lv_members_30_0= ruleMemberDecl ) )* otherlv_31= '}' )? ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt25=1;
                }
                break;
            case 30:
                {
                alt25=2;
                }
                break;
            case 33:
                {
                alt25=3;
                }
                break;
            case 34:
                {
                alt25=4;
                }
                break;
            case 35:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:902:5: this_BaseFeatureType_0= ruleBaseFeatureType
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseFeatureTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType1951);
                    this_BaseFeatureType_0=ruleBaseFeatureType();

                    state._fsp--;

                     
                            current = this_BaseFeatureType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:911:6: (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:911:6: (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:911:8: otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleFeatureType1969); 

                        	newLeafNode(otherlv_1, grammarAccess.getFeatureTypeAccess().getOptionKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:915:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:916:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getOptionFeatureTypeAction_1_1(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleFeatureType1990); 

                        	newLeafNode(otherlv_3, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:925:1: ( (lv_base_4_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:926:1: (lv_base_4_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:926:1: (lv_base_4_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:927:3: lv_base_4_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2011);
                    lv_base_4_0=ruleBaseFeatureType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_4_0, 
                            		"BaseFeatureType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleFeatureType2023); 

                        	newLeafNode(otherlv_5, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:948:6: (otherlv_6= 'Some' () otherlv_8= '[' ( (lv_base_9_0= ruleBaseFeatureType ) ) otherlv_10= ']' (otherlv_11= '=' otherlv_12= '{' ( (lv_members_13_0= ruleMemberDecl ) )* otherlv_14= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:948:6: (otherlv_6= 'Some' () otherlv_8= '[' ( (lv_base_9_0= ruleBaseFeatureType ) ) otherlv_10= ']' (otherlv_11= '=' otherlv_12= '{' ( (lv_members_13_0= ruleMemberDecl ) )* otherlv_14= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:948:8: otherlv_6= 'Some' () otherlv_8= '[' ( (lv_base_9_0= ruleBaseFeatureType ) ) otherlv_10= ']' (otherlv_11= '=' otherlv_12= '{' ( (lv_members_13_0= ruleMemberDecl ) )* otherlv_14= '}' )?
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleFeatureType2043); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeatureTypeAccess().getSomeKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:952:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:953:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getSomeFeatureTypeAction_2_1(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleFeatureType2064); 

                        	newLeafNode(otherlv_8, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_2_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:962:1: ( (lv_base_9_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:963:1: (lv_base_9_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:963:1: (lv_base_9_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:964:3: lv_base_9_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2085);
                    lv_base_9_0=ruleBaseFeatureType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_9_0, 
                            		"BaseFeatureType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleFeatureType2097); 

                        	newLeafNode(otherlv_10, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_2_4());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:984:1: (otherlv_11= '=' otherlv_12= '{' ( (lv_members_13_0= ruleMemberDecl ) )* otherlv_14= '}' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==21) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:984:3: otherlv_11= '=' otherlv_12= '{' ( (lv_members_13_0= ruleMemberDecl ) )* otherlv_14= '}'
                            {
                            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleFeatureType2110); 

                                	newLeafNode(otherlv_11, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_2_5_0());
                                
                            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleFeatureType2122); 

                                	newLeafNode(otherlv_12, grammarAccess.getFeatureTypeAccess().getLeftCurlyBracketKeyword_2_5_1());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:992:1: ( (lv_members_13_0= ruleMemberDecl ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_ID||(LA20_0>=22 && LA20_0<=25)||LA20_0==36) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:993:1: (lv_members_13_0= ruleMemberDecl )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:993:1: (lv_members_13_0= ruleMemberDecl )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:994:3: lv_members_13_0= ruleMemberDecl
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getMembersMemberDeclParserRuleCall_2_5_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleFeatureType2143);
                            	    lv_members_13_0=ruleMemberDecl();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"members",
                            	            		lv_members_13_0, 
                            	            		"MemberDecl");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleFeatureType2156); 

                                	newLeafNode(otherlv_14, grammarAccess.getFeatureTypeAccess().getRightCurlyBracketKeyword_2_5_3());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1015:6: (otherlv_15= 'None' () otherlv_17= '[' ( (lv_base_18_0= ruleBaseFeatureType ) ) otherlv_19= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1015:6: (otherlv_15= 'None' () otherlv_17= '[' ( (lv_base_18_0= ruleBaseFeatureType ) ) otherlv_19= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1015:8: otherlv_15= 'None' () otherlv_17= '[' ( (lv_base_18_0= ruleBaseFeatureType ) ) otherlv_19= ']'
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_34_in_ruleFeatureType2178); 

                        	newLeafNode(otherlv_15, grammarAccess.getFeatureTypeAccess().getNoneKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1019:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1020:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getNoneFeatureTypeAction_3_1(),
                                current);
                        

                    }

                    otherlv_17=(Token)match(input,31,FOLLOW_31_in_ruleFeatureType2199); 

                        	newLeafNode(otherlv_17, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_3_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1029:1: ( (lv_base_18_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1030:1: (lv_base_18_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1030:1: (lv_base_18_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1031:3: lv_base_18_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2220);
                    lv_base_18_0=ruleBaseFeatureType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_18_0, 
                            		"BaseFeatureType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,32,FOLLOW_32_in_ruleFeatureType2232); 

                        	newLeafNode(otherlv_19, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_3_4());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1052:6: (otherlv_20= 'Either' () otherlv_22= '[' ( (lv_bases_23_0= ruleBaseFeatureType ) ) (otherlv_24= ',' ( (lv_bases_25_0= ruleBaseFeatureType ) ) )+ otherlv_26= ']' (otherlv_27= '=' ( (lv_choice_28_0= RULE_NAT ) ) otherlv_29= '{' ( (lv_members_30_0= ruleMemberDecl ) )* otherlv_31= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1052:6: (otherlv_20= 'Either' () otherlv_22= '[' ( (lv_bases_23_0= ruleBaseFeatureType ) ) (otherlv_24= ',' ( (lv_bases_25_0= ruleBaseFeatureType ) ) )+ otherlv_26= ']' (otherlv_27= '=' ( (lv_choice_28_0= RULE_NAT ) ) otherlv_29= '{' ( (lv_members_30_0= ruleMemberDecl ) )* otherlv_31= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1052:8: otherlv_20= 'Either' () otherlv_22= '[' ( (lv_bases_23_0= ruleBaseFeatureType ) ) (otherlv_24= ',' ( (lv_bases_25_0= ruleBaseFeatureType ) ) )+ otherlv_26= ']' (otherlv_27= '=' ( (lv_choice_28_0= RULE_NAT ) ) otherlv_29= '{' ( (lv_members_30_0= ruleMemberDecl ) )* otherlv_31= '}' )?
                    {
                    otherlv_20=(Token)match(input,35,FOLLOW_35_in_ruleFeatureType2252); 

                        	newLeafNode(otherlv_20, grammarAccess.getFeatureTypeAccess().getEitherKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1056:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1057:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getEitherFeatureTypeAction_4_1(),
                                current);
                        

                    }

                    otherlv_22=(Token)match(input,31,FOLLOW_31_in_ruleFeatureType2273); 

                        	newLeafNode(otherlv_22, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_4_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1066:1: ( (lv_bases_23_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1067:1: (lv_bases_23_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1067:1: (lv_bases_23_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1068:3: lv_bases_23_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBasesBaseFeatureTypeParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2294);
                    lv_bases_23_0=ruleBaseFeatureType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"bases",
                            		lv_bases_23_0, 
                            		"BaseFeatureType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1084:2: (otherlv_24= ',' ( (lv_bases_25_0= ruleBaseFeatureType ) ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==28) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1084:4: otherlv_24= ',' ( (lv_bases_25_0= ruleBaseFeatureType ) )
                    	    {
                    	    otherlv_24=(Token)match(input,28,FOLLOW_28_in_ruleFeatureType2307); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getFeatureTypeAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1088:1: ( (lv_bases_25_0= ruleBaseFeatureType ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1089:1: (lv_bases_25_0= ruleBaseFeatureType )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1089:1: (lv_bases_25_0= ruleBaseFeatureType )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1090:3: lv_bases_25_0= ruleBaseFeatureType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBasesBaseFeatureTypeParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2328);
                    	    lv_bases_25_0=ruleBaseFeatureType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"bases",
                    	            		lv_bases_25_0, 
                    	            		"BaseFeatureType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    otherlv_26=(Token)match(input,32,FOLLOW_32_in_ruleFeatureType2342); 

                        	newLeafNode(otherlv_26, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_4_5());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1110:1: (otherlv_27= '=' ( (lv_choice_28_0= RULE_NAT ) ) otherlv_29= '{' ( (lv_members_30_0= ruleMemberDecl ) )* otherlv_31= '}' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==21) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1110:3: otherlv_27= '=' ( (lv_choice_28_0= RULE_NAT ) ) otherlv_29= '{' ( (lv_members_30_0= ruleMemberDecl ) )* otherlv_31= '}'
                            {
                            otherlv_27=(Token)match(input,21,FOLLOW_21_in_ruleFeatureType2355); 

                                	newLeafNode(otherlv_27, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_4_6_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1114:1: ( (lv_choice_28_0= RULE_NAT ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1115:1: (lv_choice_28_0= RULE_NAT )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1115:1: (lv_choice_28_0= RULE_NAT )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1116:3: lv_choice_28_0= RULE_NAT
                            {
                            lv_choice_28_0=(Token)match(input,RULE_NAT,FOLLOW_RULE_NAT_in_ruleFeatureType2372); 

                            			newLeafNode(lv_choice_28_0, grammarAccess.getFeatureTypeAccess().getChoiceNATTerminalRuleCall_4_6_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFeatureTypeRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"choice",
                                    		lv_choice_28_0, 
                                    		"NAT");
                            	    

                            }


                            }

                            otherlv_29=(Token)match(input,16,FOLLOW_16_in_ruleFeatureType2389); 

                                	newLeafNode(otherlv_29, grammarAccess.getFeatureTypeAccess().getLeftCurlyBracketKeyword_4_6_2());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1136:1: ( (lv_members_30_0= ruleMemberDecl ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==RULE_ID||(LA23_0>=22 && LA23_0<=25)||LA23_0==36) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1137:1: (lv_members_30_0= ruleMemberDecl )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1137:1: (lv_members_30_0= ruleMemberDecl )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1138:3: lv_members_30_0= ruleMemberDecl
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getMembersMemberDeclParserRuleCall_4_6_3_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleFeatureType2410);
                            	    lv_members_30_0=ruleMemberDecl();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"members",
                            	            		lv_members_30_0, 
                            	            		"MemberDecl");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);

                            otherlv_31=(Token)match(input,17,FOLLOW_17_in_ruleFeatureType2423); 

                                	newLeafNode(otherlv_31, grammarAccess.getFeatureTypeAccess().getRightCurlyBracketKeyword_4_6_4());
                                

                            }
                            break;

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
    // $ANTLR end "ruleFeatureType"


    // $ANTLR start "entryRuleBaseFeatureType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1166:1: entryRuleBaseFeatureType returns [EObject current=null] : iv_ruleBaseFeatureType= ruleBaseFeatureType EOF ;
    public final EObject entryRuleBaseFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseFeatureType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1167:2: (iv_ruleBaseFeatureType= ruleBaseFeatureType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1168:2: iv_ruleBaseFeatureType= ruleBaseFeatureType EOF
            {
             newCompositeNode(grammarAccess.getBaseFeatureTypeRule()); 
            pushFollow(FOLLOW_ruleBaseFeatureType_in_entryRuleBaseFeatureType2462);
            iv_ruleBaseFeatureType=ruleBaseFeatureType();

            state._fsp--;

             current =iv_ruleBaseFeatureType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseFeatureType2472); 

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
    // $ANTLR end "entryRuleBaseFeatureType"


    // $ANTLR start "ruleBaseFeatureType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1175:1: ruleBaseFeatureType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleBaseFeatureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1178:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1179:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1179:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1179:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1179:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1180:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1180:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1181:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBaseFeatureTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseFeatureType2517); 

            		newLeafNode(otherlv_0, grammarAccess.getBaseFeatureTypeAccess().getComponentsComponentDeclCrossReference_0_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1192:2: (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1192:4: otherlv_1= 'with' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleBaseFeatureType2530); 

            	        	newLeafNode(otherlv_1, grammarAccess.getBaseFeatureTypeAccess().getWithKeyword_1_0());
            	        
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1196:1: ( (otherlv_2= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1197:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1197:1: (otherlv_2= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1198:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBaseFeatureTypeRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseFeatureType2550); 

            	    		newLeafNode(otherlv_2, grammarAccess.getBaseFeatureTypeAccess().getComponentsComponentDeclCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1209:4: (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1209:6: otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBaseFeatureType2565); 

                        	newLeafNode(otherlv_3, grammarAccess.getBaseFeatureTypeAccess().getEqualsSignKeyword_2_0());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleBaseFeatureType2577); 

                        	newLeafNode(otherlv_4, grammarAccess.getBaseFeatureTypeAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1217:1: ( (lv_members_5_0= ruleMemberDecl ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID||(LA27_0>=22 && LA27_0<=25)||LA27_0==36) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1218:1: (lv_members_5_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1218:1: (lv_members_5_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1219:3: lv_members_5_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBaseFeatureTypeAccess().getMembersMemberDeclParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleBaseFeatureType2598);
                    	    lv_members_5_0=ruleMemberDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBaseFeatureTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"members",
                    	            		lv_members_5_0, 
                    	            		"MemberDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleBaseFeatureType2611); 

                        	newLeafNode(otherlv_6, grammarAccess.getBaseFeatureTypeAccess().getRightCurlyBracketKeyword_2_3());
                        

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
    // $ANTLR end "ruleBaseFeatureType"


    // $ANTLR start "entryRuleInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1247:1: entryRuleInvariantDecl returns [EObject current=null] : iv_ruleInvariantDecl= ruleInvariantDecl EOF ;
    public final EObject entryRuleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1248:2: (iv_ruleInvariantDecl= ruleInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1249:2: iv_ruleInvariantDecl= ruleInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl2649);
            iv_ruleInvariantDecl=ruleInvariantDecl();

            state._fsp--;

             current =iv_ruleInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariantDecl2659); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1256:1: ruleInvariantDecl returns [EObject current=null] : (this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl | this_GeneralInvariantDecl_1= ruleGeneralInvariantDecl ) ;
    public final EObject ruleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicityInvariantDecl_0 = null;

        EObject this_GeneralInvariantDecl_1 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1259:28: ( (this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl | this_GeneralInvariantDecl_1= ruleGeneralInvariantDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1260:1: (this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl | this_GeneralInvariantDecl_1= ruleGeneralInvariantDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1260:1: (this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl | this_GeneralInvariantDecl_1= ruleGeneralInvariantDecl )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA29_2 = input.LA(3);

                    if ( (LA29_2==EOF||LA29_2==RULE_ID||LA29_2==RULE_LIT||LA29_2==17||(LA29_2>=22 && LA29_2<=25)||LA29_2==36||LA29_2==38) ) {
                        alt29=2;
                    }
                    else if ( (LA29_2==20) ) {
                        int LA29_5 = input.LA(4);

                        if ( (LA29_5==RULE_ID||LA29_5==27) ) {
                            alt29=2;
                        }
                        else if ( (LA29_5==RULE_NAT||LA29_5==39) ) {
                            alt29=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 29, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 27:
                    {
                    alt29=2;
                    }
                    break;
                case RULE_NAT:
                case 39:
                    {
                    alt29=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1261:5: this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl
                    {
                     
                            newCompositeNode(grammarAccess.getInvariantDeclAccess().getMultiplicityInvariantDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMultiplicityInvariantDecl_in_ruleInvariantDecl2706);
                    this_MultiplicityInvariantDecl_0=ruleMultiplicityInvariantDecl();

                    state._fsp--;

                     
                            current = this_MultiplicityInvariantDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1271:5: this_GeneralInvariantDecl_1= ruleGeneralInvariantDecl
                    {
                     
                            newCompositeNode(grammarAccess.getInvariantDeclAccess().getGeneralInvariantDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGeneralInvariantDecl_in_ruleInvariantDecl2733);
                    this_GeneralInvariantDecl_1=ruleGeneralInvariantDecl();

                    state._fsp--;

                     
                            current = this_GeneralInvariantDecl_1; 
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
    // $ANTLR end "ruleInvariantDecl"


    // $ANTLR start "entryRuleMultiplicityInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1287:1: entryRuleMultiplicityInvariantDecl returns [EObject current=null] : iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF ;
    public final EObject entryRuleMultiplicityInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1288:2: (iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1289:2: iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleMultiplicityInvariantDecl_in_entryRuleMultiplicityInvariantDecl2768);
            iv_ruleMultiplicityInvariantDecl=ruleMultiplicityInvariantDecl();

            state._fsp--;

             current =iv_ruleMultiplicityInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityInvariantDecl2778); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1296:1: ruleMultiplicityInvariantDecl returns [EObject current=null] : (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1299:28: ( (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1300:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1300:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1300:3: otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleMultiplicityInvariantDecl2815); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiplicityInvariantDeclAccess().getInvKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1304:1: ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1304:2: ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1304:2: ( (lv_invName_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1305:1: (lv_invName_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1305:1: (lv_invName_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1306:3: lv_invName_1_0= RULE_ID
                    {
                    lv_invName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl2833); 

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

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMultiplicityInvariantDecl2850); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1326:3: ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1326:4: ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1326:4: ( (lv_lo_3_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1327:1: (lv_lo_3_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1327:1: (lv_lo_3_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1328:3: lv_lo_3_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getLoConstraintNatParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl2874);
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

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleMultiplicityInvariantDecl2886); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiplicityInvariantDeclAccess().getFullStopFullStopKeyword_2_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1348:1: ( (lv_hi_5_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1349:1: (lv_hi_5_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1349:1: (lv_hi_5_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1350:3: lv_hi_5_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getHiConstraintNatParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl2907);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1366:3: ( (lv_match_6_0= ruleSubMemberMatch ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1367:1: (lv_match_6_0= ruleSubMemberMatch )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1367:1: (lv_match_6_0= ruleSubMemberMatch )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1368:3: lv_match_6_0= ruleSubMemberMatch
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchSubMemberMatchParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSubMemberMatch_in_ruleMultiplicityInvariantDecl2929);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1384:2: (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1384:4: otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleMultiplicityInvariantDecl2942); 

                        	newLeafNode(otherlv_7, grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1388:1: ( (otherlv_8= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1389:1: (otherlv_8= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1389:1: (otherlv_8= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1390:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityInvariantDeclRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl2962); 

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


    // $ANTLR start "entryRuleGeneralInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1409:1: entryRuleGeneralInvariantDecl returns [EObject current=null] : iv_ruleGeneralInvariantDecl= ruleGeneralInvariantDecl EOF ;
    public final EObject entryRuleGeneralInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1410:2: (iv_ruleGeneralInvariantDecl= ruleGeneralInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1411:2: iv_ruleGeneralInvariantDecl= ruleGeneralInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getGeneralInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleGeneralInvariantDecl_in_entryRuleGeneralInvariantDecl3000);
            iv_ruleGeneralInvariantDecl=ruleGeneralInvariantDecl();

            state._fsp--;

             current =iv_ruleGeneralInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralInvariantDecl3010); 

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
    // $ANTLR end "entryRuleGeneralInvariantDecl"


    // $ANTLR start "ruleGeneralInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1418:1: ruleGeneralInvariantDecl returns [EObject current=null] : (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleGeneralInvariantDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_invName_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1421:28: ( (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1422:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1422:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1422:3: otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleGeneralInvariantDecl3047); 

                	newLeafNode(otherlv_0, grammarAccess.getGeneralInvariantDeclAccess().getInvKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1426:1: ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==20) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1426:2: ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1426:2: ( (lv_invName_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1427:1: (lv_invName_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1427:1: (lv_invName_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1428:3: lv_invName_1_0= RULE_ID
                    {
                    lv_invName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralInvariantDecl3065); 

                    			newLeafNode(lv_invName_1_0, grammarAccess.getGeneralInvariantDeclAccess().getInvNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneralInvariantDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"invName",
                            		lv_invName_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleGeneralInvariantDecl3082); 

                        	newLeafNode(otherlv_2, grammarAccess.getGeneralInvariantDeclAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1448:3: ( (lv_exp_3_0= ruleExp ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1449:1: (lv_exp_3_0= ruleExp )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1449:1: (lv_exp_3_0= ruleExp )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1450:3: lv_exp_3_0= ruleExp
            {
             
            	        newCompositeNode(grammarAccess.getGeneralInvariantDeclAccess().getExpExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExp_in_ruleGeneralInvariantDecl3105);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneralInvariantDeclRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_3_0, 
                    		"Exp");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleGeneralInvariantDecl"


    // $ANTLR start "entryRuleSubMemberMatch"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1474:1: entryRuleSubMemberMatch returns [EObject current=null] : iv_ruleSubMemberMatch= ruleSubMemberMatch EOF ;
    public final EObject entryRuleSubMemberMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMemberMatch = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1475:2: (iv_ruleSubMemberMatch= ruleSubMemberMatch EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1476:2: iv_ruleSubMemberMatch= ruleSubMemberMatch EOF
            {
             newCompositeNode(grammarAccess.getSubMemberMatchRule()); 
            pushFollow(FOLLOW_ruleSubMemberMatch_in_entryRuleSubMemberMatch3141);
            iv_ruleSubMemberMatch=ruleSubMemberMatch();

            state._fsp--;

             current =iv_ruleSubMemberMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMemberMatch3151); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1483:1: ruleSubMemberMatch returns [EObject current=null] : ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) ) ;
    public final EObject ruleSubMemberMatch() throws RecognitionException {
        EObject current = null;

        Token lv_qNames_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_any_3_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1486:28: ( ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1487:1: ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1487:1: ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1487:2: ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1487:2: ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==38) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1487:3: ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.'
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1487:3: ( (lv_qNames_0_0= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1488:1: (lv_qNames_0_0= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1488:1: (lv_qNames_0_0= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1489:3: lv_qNames_0_0= RULE_ID
            	    {
            	    lv_qNames_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberMatch3194); 

            	    			newLeafNode(lv_qNames_0_0, grammarAccess.getSubMemberMatchAccess().getQNamesIDTerminalRuleCall_0_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubMemberMatchRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"qNames",
            	            		lv_qNames_0_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleSubMemberMatch3211); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSubMemberMatchAccess().getFullStopKeyword_0_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1509:3: ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==39) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1509:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1509:4: ( (lv_name_2_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1510:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1510:1: (lv_name_2_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1511:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberMatch3231); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getSubMemberMatchAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubMemberMatchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1528:6: ( (lv_any_3_0= '*' ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1528:6: ( (lv_any_3_0= '*' ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1529:1: (lv_any_3_0= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1529:1: (lv_any_3_0= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1530:3: lv_any_3_0= '*'
                    {
                    lv_any_3_0=(Token)match(input,39,FOLLOW_39_in_ruleSubMemberMatch3260); 

                            newLeafNode(lv_any_3_0, grammarAccess.getSubMemberMatchAccess().getAnyAsteriskKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubMemberMatchRule());
                    	        }
                           		setWithLastConsumed(current, "any", lv_any_3_0, "*");
                    	    

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1551:1: entryRuleConstraintNat returns [EObject current=null] : iv_ruleConstraintNat= ruleConstraintNat EOF ;
    public final EObject entryRuleConstraintNat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintNat = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1552:2: (iv_ruleConstraintNat= ruleConstraintNat EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1553:2: iv_ruleConstraintNat= ruleConstraintNat EOF
            {
             newCompositeNode(grammarAccess.getConstraintNatRule()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat3310);
            iv_ruleConstraintNat=ruleConstraintNat();

            state._fsp--;

             current =iv_ruleConstraintNat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintNat3320); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1560:1: ruleConstraintNat returns [EObject current=null] : ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) ;
    public final EObject ruleConstraintNat() throws RecognitionException {
        EObject current = null;

        Token lv_num_1_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1563:28: ( ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1564:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1564:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_NAT) ) {
                alt35=1;
            }
            else if ( (LA35_0==39) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1564:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1564:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1564:3: () ( (lv_num_1_0= RULE_NAT ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1564:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1565:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getNumNatConstraintAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1570:2: ( (lv_num_1_0= RULE_NAT ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1571:1: (lv_num_1_0= RULE_NAT )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1571:1: (lv_num_1_0= RULE_NAT )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1572:3: lv_num_1_0= RULE_NAT
                    {
                    lv_num_1_0=(Token)match(input,RULE_NAT,FOLLOW_RULE_NAT_in_ruleConstraintNat3372); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1589:6: ( () otherlv_3= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1589:6: ( () otherlv_3= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1589:7: () otherlv_3= '*'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1589:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1590:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getAnyNatConstraintAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleConstraintNat3406); 

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


    // $ANTLR start "entryRuleDevice"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1607:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1608:2: (iv_ruleDevice= ruleDevice EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1609:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_ruleDevice_in_entryRuleDevice3443);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevice3453); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1616:1: ruleDevice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_constraint_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1619:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1620:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1620:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1620:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1620:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1621:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1621:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1622:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice3495); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleDevice3512); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getColonKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1642:1: ( (otherlv_2= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1643:1: (otherlv_2= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1643:1: (otherlv_2= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1644:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice3532); 

            		newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getComponentsComponentDeclCrossReference_2_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1655:2: (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1655:4: otherlv_3= 'with' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDevice3545); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getWithKeyword_3_0());
            	        
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1659:1: ( (otherlv_4= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1660:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1660:1: (otherlv_4= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1661:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeviceRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice3565); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getComponentsComponentDeclCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1672:4: ( (lv_constraint_5_0= ruleConstraintExp ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1673:1: (lv_constraint_5_0= ruleConstraintExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1673:1: (lv_constraint_5_0= ruleConstraintExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1674:3: lv_constraint_5_0= ruleConstraintExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceAccess().getConstraintConstraintExpParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraintExp_in_ruleDevice3588);
                    lv_constraint_5_0=ruleConstraintExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeviceRule());
                    	        }
                           		set(
                           			current, 
                           			"constraint",
                            		lv_constraint_5_0, 
                            		"ConstraintExp");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleConstraintExp"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1698:1: entryRuleConstraintExp returns [EObject current=null] : iv_ruleConstraintExp= ruleConstraintExp EOF ;
    public final EObject entryRuleConstraintExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintExp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1699:2: (iv_ruleConstraintExp= ruleConstraintExp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1700:2: iv_ruleConstraintExp= ruleConstraintExp EOF
            {
             newCompositeNode(grammarAccess.getConstraintExpRule()); 
            pushFollow(FOLLOW_ruleConstraintExp_in_entryRuleConstraintExp3625);
            iv_ruleConstraintExp=ruleConstraintExp();

            state._fsp--;

             current =iv_ruleConstraintExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintExp3635); 

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
    // $ANTLR end "entryRuleConstraintExp"


    // $ANTLR start "ruleConstraintExp"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1707:1: ruleConstraintExp returns [EObject current=null] : (otherlv_0= 'constraint' this_Exp_1= ruleExp ) ;
    public final EObject ruleConstraintExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Exp_1 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1710:28: ( (otherlv_0= 'constraint' this_Exp_1= ruleExp ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1711:1: (otherlv_0= 'constraint' this_Exp_1= ruleExp )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1711:1: (otherlv_0= 'constraint' this_Exp_1= ruleExp )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1711:3: otherlv_0= 'constraint' this_Exp_1= ruleExp
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleConstraintExp3672); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintExpAccess().getConstraintKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getConstraintExpAccess().getExpParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExp_in_ruleConstraintExp3694);
            this_Exp_1=ruleExp();

            state._fsp--;

             
                    current = this_Exp_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleConstraintExp"


    // $ANTLR start "entryRuleReportDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1732:1: entryRuleReportDecl returns [EObject current=null] : iv_ruleReportDecl= ruleReportDecl EOF ;
    public final EObject entryRuleReportDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReportDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1733:2: (iv_ruleReportDecl= ruleReportDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1734:2: iv_ruleReportDecl= ruleReportDecl EOF
            {
             newCompositeNode(grammarAccess.getReportDeclRule()); 
            pushFollow(FOLLOW_ruleReportDecl_in_entryRuleReportDecl3729);
            iv_ruleReportDecl=ruleReportDecl();

            state._fsp--;

             current =iv_ruleReportDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReportDecl3739); 

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
    // $ANTLR end "entryRuleReportDecl"


    // $ANTLR start "ruleReportDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1741:1: ruleReportDecl returns [EObject current=null] : (otherlv_0= 'report' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_attrs_8_0= ruleReportMemberDecl ) )* otherlv_9= '}' ) ;
    public final EObject ruleReportDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_attrs_8_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1744:28: ( (otherlv_0= 'report' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_attrs_8_0= ruleReportMemberDecl ) )* otherlv_9= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1745:1: (otherlv_0= 'report' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_attrs_8_0= ruleReportMemberDecl ) )* otherlv_9= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1745:1: (otherlv_0= 'report' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_attrs_8_0= ruleReportMemberDecl ) )* otherlv_9= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1745:3: otherlv_0= 'report' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_attrs_8_0= ruleReportMemberDecl ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleReportDecl3776); 

                	newLeafNode(otherlv_0, grammarAccess.getReportDeclAccess().getReportKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1749:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1750:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1750:1: (lv_name_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1751:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReportDecl3793); 

            			newLeafNode(lv_name_1_0, grammarAccess.getReportDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReportDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleReportDecl3810); 

                	newLeafNode(otherlv_2, grammarAccess.getReportDeclAccess().getLeftParenthesisKeyword_2());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1771:1: ( (lv_params_3_0= ruleParam ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1772:1: (lv_params_3_0= ruleParam )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1772:1: (lv_params_3_0= ruleParam )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1773:3: lv_params_3_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getReportDeclAccess().getParamsParamParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleReportDecl3831);
            lv_params_3_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReportDeclRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_3_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1789:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==28) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1789:4: otherlv_4= ',' ( (lv_params_5_0= ruleParam ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleReportDecl3844); 

            	        	newLeafNode(otherlv_4, grammarAccess.getReportDeclAccess().getCommaKeyword_4_0());
            	        
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1793:1: ( (lv_params_5_0= ruleParam ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1794:1: (lv_params_5_0= ruleParam )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1794:1: (lv_params_5_0= ruleParam )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1795:3: lv_params_5_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReportDeclAccess().getParamsParamParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleReportDecl3865);
            	    lv_params_5_0=ruleParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReportDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_5_0, 
            	            		"Param");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleReportDecl3879); 

                	newLeafNode(otherlv_6, grammarAccess.getReportDeclAccess().getRightParenthesisKeyword_5());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleReportDecl3891); 

                	newLeafNode(otherlv_7, grammarAccess.getReportDeclAccess().getLeftCurlyBracketKeyword_6());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1819:1: ( (lv_attrs_8_0= ruleReportMemberDecl ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1820:1: (lv_attrs_8_0= ruleReportMemberDecl )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1820:1: (lv_attrs_8_0= ruleReportMemberDecl )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1821:3: lv_attrs_8_0= ruleReportMemberDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReportDeclAccess().getAttrsReportMemberDeclParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReportMemberDecl_in_ruleReportDecl3912);
            	    lv_attrs_8_0=ruleReportMemberDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReportDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attrs",
            	            		lv_attrs_8_0, 
            	            		"ReportMemberDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleReportDecl3925); 

                	newLeafNode(otherlv_9, grammarAccess.getReportDeclAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleReportDecl"


    // $ANTLR start "entryRuleParam"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1849:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1850:2: (iv_ruleParam= ruleParam EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1851:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam3961);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam3971); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1858:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBaseFeatureType ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1861:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBaseFeatureType ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1862:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBaseFeatureType ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1862:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBaseFeatureType ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1862:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBaseFeatureType ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1862:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1863:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1863:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1864:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParam4013); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleParam4030); 

                	newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1884:1: ( (lv_type_2_0= ruleBaseFeatureType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1885:1: (lv_type_2_0= ruleBaseFeatureType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1885:1: (lv_type_2_0= ruleBaseFeatureType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1886:3: lv_type_2_0= ruleBaseFeatureType
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getTypeBaseFeatureTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleParam4051);
            lv_type_2_0=ruleBaseFeatureType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"BaseFeatureType");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleReportMemberDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1910:1: entryRuleReportMemberDecl returns [EObject current=null] : iv_ruleReportMemberDecl= ruleReportMemberDecl EOF ;
    public final EObject entryRuleReportMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReportMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1911:2: (iv_ruleReportMemberDecl= ruleReportMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1912:2: iv_ruleReportMemberDecl= ruleReportMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getReportMemberDeclRule()); 
            pushFollow(FOLLOW_ruleReportMemberDecl_in_entryRuleReportMemberDecl4087);
            iv_ruleReportMemberDecl=ruleReportMemberDecl();

            state._fsp--;

             current =iv_ruleReportMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReportMemberDecl4097); 

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
    // $ANTLR end "entryRuleReportMemberDecl"


    // $ANTLR start "ruleReportMemberDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1919:1: ruleReportMemberDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' )+ ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleReportMemberDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1922:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' )+ ( (otherlv_4= RULE_ID ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1923:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' )+ ( (otherlv_4= RULE_ID ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1923:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' )+ ( (otherlv_4= RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1923:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' )+ ( (otherlv_4= RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1923:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1924:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1924:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1925:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReportMemberDecl4139); 

            			newLeafNode(lv_name_0_0, grammarAccess.getReportMemberDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReportMemberDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleReportMemberDecl4156); 

                	newLeafNode(otherlv_1, grammarAccess.getReportMemberDeclAccess().getEqualsSignKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1945:1: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==38) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1945:2: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.'
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1945:2: ( (otherlv_2= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1946:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1946:1: (otherlv_2= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1947:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getReportMemberDeclRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReportMemberDecl4177); 

            	    		newLeafNode(otherlv_2, grammarAccess.getReportMemberDeclAccess().getBindingNameAttrOrSubMemberCrossReference_2_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleReportMemberDecl4189); 

            	        	newLeafNode(otherlv_3, grammarAccess.getReportMemberDeclAccess().getFullStopKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1962:3: ( (otherlv_4= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1963:1: (otherlv_4= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1963:1: (otherlv_4= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1964:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReportMemberDeclRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReportMemberDecl4211); 

            		newLeafNode(otherlv_4, grammarAccess.getReportMemberDeclAccess().getBindingNameAttrOrSubMemberCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleReportMemberDecl"


    // $ANTLR start "entryRuleExp"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1985:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1986:2: (iv_ruleExp= ruleExp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1987:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_ruleExp_in_entryRuleExp4249);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp4259); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1994:1: ruleExp returns [EObject current=null] : ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_left_2_0 = null;

        AntlrDatatypeRuleToken lv_op_3_0 = null;

        EObject lv_right_4_0 = null;

        AntlrDatatypeRuleToken lv_op_8_0 = null;

        EObject lv_arg_9_0 = null;

        EObject lv_primary_12_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1997:28: ( ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1998:1: ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1998:1: ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_ID||LA42_1==27) ) {
                    alt42=1;
                }
                else if ( ((LA42_1>=52 && LA42_1<=53)||(LA42_1>=56 && LA42_1<=58)) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1998:2: (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1998:2: (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1998:4: otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleExp4297); 

                        	newLeafNode(otherlv_0, grammarAccess.getExpAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2002:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2003:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpAccess().getBinaryExpAction_0_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2008:2: ( (lv_left_2_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2009:1: (lv_left_2_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2009:1: (lv_left_2_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2010:3: lv_left_2_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getLeftExpParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleExp4327);
                    lv_left_2_0=ruleExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_2_0, 
                            		"Exp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2026:2: ( (lv_op_3_0= ruleBinaryOp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2027:1: (lv_op_3_0= ruleBinaryOp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2027:1: (lv_op_3_0= ruleBinaryOp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2028:3: lv_op_3_0= ruleBinaryOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getOpBinaryOpParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBinaryOp_in_ruleExp4348);
                    lv_op_3_0=ruleBinaryOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_3_0, 
                            		"BinaryOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2044:2: ( (lv_right_4_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2045:1: (lv_right_4_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2045:1: (lv_right_4_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2046:3: lv_right_4_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getRightExpParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleExp4369);
                    lv_right_4_0=ruleExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_4_0, 
                            		"Exp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleExp4381); 

                        	newLeafNode(otherlv_5, grammarAccess.getExpAccess().getRightParenthesisKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2067:6: (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2067:6: (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2067:8: otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleExp4401); 

                        	newLeafNode(otherlv_6, grammarAccess.getExpAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2071:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2072:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpAccess().getUnaryExpAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2077:2: ( (lv_op_8_0= ruleUnaryOp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2078:1: (lv_op_8_0= ruleUnaryOp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2078:1: (lv_op_8_0= ruleUnaryOp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2079:3: lv_op_8_0= ruleUnaryOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getOpUnaryOpParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryOp_in_ruleExp4431);
                    lv_op_8_0=ruleUnaryOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_8_0, 
                            		"UnaryOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2095:2: ( (lv_arg_9_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2096:1: (lv_arg_9_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2096:1: (lv_arg_9_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2097:3: lv_arg_9_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getArgExpParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleExp4452);
                    lv_arg_9_0=ruleExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpRule());
                    	        }
                           		set(
                           			current, 
                           			"arg",
                            		lv_arg_9_0, 
                            		"Exp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleExp4464); 

                        	newLeafNode(otherlv_10, grammarAccess.getExpAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2118:6: ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2118:6: ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2118:7: () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2118:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2119:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpAccess().getPrimaryExpAction_2_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2124:2: ( (lv_primary_12_0= rulePrimary ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2125:1: (lv_primary_12_0= rulePrimary )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2125:1: (lv_primary_12_0= rulePrimary )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2126:3: lv_primary_12_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getPrimaryPrimaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_ruleExp4502);
                    lv_primary_12_0=rulePrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpRule());
                    	        }
                           		set(
                           			current, 
                           			"primary",
                            		lv_primary_12_0, 
                            		"Primary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2142:2: (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==38) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2142:4: otherlv_13= '.' () ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,38,FOLLOW_38_in_ruleExp4515); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getExpAccess().getFullStopKeyword_2_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2146:1: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2147:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getExpAccess().getAccessExpBaseAction_2_2_1(),
                    	                current);
                    	        

                    	    }

                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2152:2: ( (otherlv_15= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2153:1: (otherlv_15= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2153:1: (otherlv_15= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2154:3: otherlv_15= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExpRule());
                    	    	        }
                    	            
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExp4544); 

                    	    		newLeafNode(otherlv_15, grammarAccess.getExpAccess().getNameAttrOrSubMemberCrossReference_2_2_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePrimary"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2173:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2174:2: (iv_rulePrimary= rulePrimary EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2175:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary4583);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary4593); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2182:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_lit_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2185:28: ( ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2186:1: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2186:1: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_LIT) ) {
                    alt43=2;
                }
                else if ( (LA43_1==EOF||LA43_1==RULE_ID||LA43_1==17||(LA43_1>=22 && LA43_1<=25)||(LA43_1>=27 && LA43_1<=29)||LA43_1==36||(LA43_1>=38 && LA43_1<=39)||(LA43_1>=42 && LA43_1<=55)) ) {
                    alt43=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2186:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2186:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2186:3: () ( (lv_id_1_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2186:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2187:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNameExpAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2192:2: ( (lv_id_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2193:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2193:1: (lv_id_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2194:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary4645); 

                    			newLeafNode(lv_id_1_0, grammarAccess.getPrimaryAccess().getIdIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2211:6: ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2211:6: ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2211:7: () ( (lv_lit_3_0= ruleBasicLiteral ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2211:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2212:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getLiteralExpAction_1_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2217:2: ( (lv_lit_3_0= ruleBasicLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2218:1: (lv_lit_3_0= ruleBasicLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2218:1: (lv_lit_3_0= ruleBasicLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2219:3: lv_lit_3_0= ruleBasicLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getLitBasicLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBasicLiteral_in_rulePrimary4688);
                    lv_lit_3_0=ruleBasicLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	        }
                           		set(
                           			current, 
                           			"lit",
                            		lv_lit_3_0, 
                            		"BasicLiteral");
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleBinaryOp"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2243:1: entryRuleBinaryOp returns [String current=null] : iv_ruleBinaryOp= ruleBinaryOp EOF ;
    public final String entryRuleBinaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2244:2: (iv_ruleBinaryOp= ruleBinaryOp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2245:2: iv_ruleBinaryOp= ruleBinaryOp EOF
            {
             newCompositeNode(grammarAccess.getBinaryOpRule()); 
            pushFollow(FOLLOW_ruleBinaryOp_in_entryRuleBinaryOp4726);
            iv_ruleBinaryOp=ruleBinaryOp();

            state._fsp--;

             current =iv_ruleBinaryOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOp4737); 

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
    // $ANTLR end "entryRuleBinaryOp"


    // $ANTLR start "ruleBinaryOp"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2252:1: ruleBinaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2255:28: ( (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2256:1: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2256:1: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            int alt44=15;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt44=1;
                }
                break;
            case 43:
                {
                alt44=2;
                }
                break;
            case 44:
                {
                alt44=3;
                }
                break;
            case 45:
                {
                alt44=4;
                }
                break;
            case 46:
                {
                alt44=5;
                }
                break;
            case 47:
                {
                alt44=6;
                }
                break;
            case 48:
                {
                alt44=7;
                }
                break;
            case 49:
                {
                alt44=8;
                }
                break;
            case 50:
                {
                alt44=9;
                }
                break;
            case 51:
                {
                alt44=10;
                }
                break;
            case 52:
                {
                alt44=11;
                }
                break;
            case 53:
                {
                alt44=12;
                }
                break;
            case 39:
                {
                alt44=13;
                }
                break;
            case 54:
                {
                alt44=14;
                }
                break;
            case 55:
                {
                alt44=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2257:2: kw= '=='
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleBinaryOp4775); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2264:2: kw= '!='
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleBinaryOp4794); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2271:2: kw= '>='
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleBinaryOp4813); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2278:2: kw= '<='
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleBinaryOp4832); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2285:2: kw= '>'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleBinaryOp4851); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getGreaterThanSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2292:2: kw= '<'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleBinaryOp4870); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getLessThanSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2299:2: kw= '&&'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleBinaryOp4889); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getAmpersandAmpersandKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2306:2: kw= '||'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleBinaryOp4908); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getVerticalLineVerticalLineKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2313:2: kw= '==>'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleBinaryOp4927); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2320:2: kw= '<=='
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleBinaryOp4946); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getLessThanSignEqualsSignEqualsSignKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2327:2: kw= '+'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleBinaryOp4965); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getPlusSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2334:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleBinaryOp4984); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getHyphenMinusKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2341:2: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleBinaryOp5003); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getAsteriskKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2348:2: kw= '/'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleBinaryOp5022); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getSolidusKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2355:2: kw= '%'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleBinaryOp5041); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getPercentSignKeyword_14()); 
                        

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
    // $ANTLR end "ruleBinaryOp"


    // $ANTLR start "entryRuleUnaryOp"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2368:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2369:2: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2370:2: iv_ruleUnaryOp= ruleUnaryOp EOF
            {
             newCompositeNode(grammarAccess.getUnaryOpRule()); 
            pushFollow(FOLLOW_ruleUnaryOp_in_entryRuleUnaryOp5082);
            iv_ruleUnaryOp=ruleUnaryOp();

            state._fsp--;

             current =iv_ruleUnaryOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOp5093); 

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
    // $ANTLR end "entryRuleUnaryOp"


    // $ANTLR start "ruleUnaryOp"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2377:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2380:28: ( (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2381:1: (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2381:1: (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt45=1;
                }
                break;
            case 53:
                {
                alt45=2;
                }
                break;
            case 56:
                {
                alt45=3;
                }
                break;
            case 57:
                {
                alt45=4;
                }
                break;
            case 58:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2382:2: kw= '+'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleUnaryOp5131); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2389:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleUnaryOp5150); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2396:2: kw= '!'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleUnaryOp5169); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getExclamationMarkKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2403:2: kw= '^'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleUnaryOp5188); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getCircumflexAccentKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2410:2: kw= '~'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleUnaryOp5207); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getTildeKeyword_4()); 
                        

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
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "entryRuleType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2423:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2424:2: (iv_ruleType= ruleType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2425:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType5247);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType5257); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2432:1: ruleType returns [EObject current=null] : ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_base_3_0 = null;

        EObject lv_base_8_0 = null;

        EObject this_BaseType_10 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2435:28: ( ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2436:1: ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2436:1: ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt46=1;
                }
                break;
            case 60:
                {
                alt46=2;
                }
                break;
            case RULE_ID:
            case 30:
            case 33:
            case 34:
            case 47:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2436:2: (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2436:2: (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2436:4: otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleType5295); 

                        	newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getSeqKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2440:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2441:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getSeqTypeAction_0_1(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleType5316); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2450:1: ( (lv_base_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2451:1: (lv_base_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2451:1: (lv_base_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2452:3: lv_base_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType5337);
                    lv_base_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleType5349); 

                        	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2473:6: (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2473:6: (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2473:8: otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_60_in_ruleType5369); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getSetKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2477:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2478:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getSetTypeAction_1_1(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleType5390); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2487:1: ( (lv_base_8_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2488:1: (lv_base_8_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2488:1: (lv_base_8_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2489:3: lv_base_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType5411);
                    lv_base_8_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_8_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleType5423); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2511:5: this_BaseType_10= ruleBaseType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBaseType_in_ruleType5452);
                    this_BaseType_10=ruleBaseType();

                    state._fsp--;

                     
                            current = this_BaseType_10; 
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


    // $ANTLR start "entryRuleBaseType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2527:1: entryRuleBaseType returns [EObject current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final EObject entryRuleBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2528:2: (iv_ruleBaseType= ruleBaseType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2529:2: iv_ruleBaseType= ruleBaseType EOF
            {
             newCompositeNode(grammarAccess.getBaseTypeRule()); 
            pushFollow(FOLLOW_ruleBaseType_in_entryRuleBaseType5487);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;

             current =iv_ruleBaseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseType5497); 

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
    // $ANTLR end "entryRuleBaseType"


    // $ANTLR start "ruleBaseType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2536:1: ruleBaseType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) ) ;
    public final EObject ruleBaseType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_elemTypes_3_0 = null;

        EObject lv_elemTypes_5_0 = null;

        EObject lv_base_10_0 = null;

        EObject lv_base_15_0 = null;

        EObject lv_base_20_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2539:28: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2540:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2540:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) )
            int alt48=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt48=1;
                }
                break;
            case 47:
                {
                alt48=2;
                }
                break;
            case 30:
                {
                alt48=3;
                }
                break;
            case 33:
                {
                alt48=4;
                }
                break;
            case 34:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2540:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2540:2: ( (otherlv_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2541:1: (otherlv_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2541:1: (otherlv_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2542:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseTypeRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseType5542); 

                    		newLeafNode(otherlv_0, grammarAccess.getBaseTypeAccess().getTypeTypeDeclCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2554:6: (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2554:6: (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2554:8: otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleBaseType5561); 

                        	newLeafNode(otherlv_1, grammarAccess.getBaseTypeAccess().getLessThanSignKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2558:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2559:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getTupleTypeAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2564:2: ( (lv_elemTypes_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2565:1: (lv_elemTypes_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2565:1: (lv_elemTypes_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2566:3: lv_elemTypes_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getElemTypesTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5591);
                    lv_elemTypes_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBaseTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"elemTypes",
                            		lv_elemTypes_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2582:2: (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==39) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2582:4: otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleBaseType5604); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getBaseTypeAccess().getAsteriskKeyword_1_3_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2586:1: ( (lv_elemTypes_5_0= ruleType ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2587:1: (lv_elemTypes_5_0= ruleType )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2587:1: (lv_elemTypes_5_0= ruleType )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2588:3: lv_elemTypes_5_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getElemTypesTypeParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleBaseType5625);
                    	    lv_elemTypes_5_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBaseTypeRule());
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
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);

                    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleBaseType5639); 

                        	newLeafNode(otherlv_6, grammarAccess.getBaseTypeAccess().getGreaterThanSignKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2609:6: (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2609:6: (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2609:8: otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleBaseType5659); 

                        	newLeafNode(otherlv_7, grammarAccess.getBaseTypeAccess().getOptionKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2613:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2614:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getOptionTypeAction_2_1(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleBaseType5680); 

                        	newLeafNode(otherlv_9, grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_2_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2623:1: ( (lv_base_10_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2624:1: (lv_base_10_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2624:1: (lv_base_10_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2625:3: lv_base_10_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getBaseTypeParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5701);
                    lv_base_10_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBaseTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_10_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,32,FOLLOW_32_in_ruleBaseType5713); 

                        	newLeafNode(otherlv_11, grammarAccess.getBaseTypeAccess().getRightSquareBracketKeyword_2_4());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2646:6: (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2646:6: (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2646:8: otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']'
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_33_in_ruleBaseType5733); 

                        	newLeafNode(otherlv_12, grammarAccess.getBaseTypeAccess().getSomeKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2650:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2651:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getSomeTypeAction_3_1(),
                                current);
                        

                    }

                    otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleBaseType5754); 

                        	newLeafNode(otherlv_14, grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_3_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2660:1: ( (lv_base_15_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2661:1: (lv_base_15_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2661:1: (lv_base_15_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2662:3: lv_base_15_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getBaseTypeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5775);
                    lv_base_15_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBaseTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_15_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,32,FOLLOW_32_in_ruleBaseType5787); 

                        	newLeafNode(otherlv_16, grammarAccess.getBaseTypeAccess().getRightSquareBracketKeyword_3_4());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2683:6: (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2683:6: (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2683:8: otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']'
                    {
                    otherlv_17=(Token)match(input,34,FOLLOW_34_in_ruleBaseType5807); 

                        	newLeafNode(otherlv_17, grammarAccess.getBaseTypeAccess().getNoneKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2687:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2688:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getNoneTypeAction_4_1(),
                                current);
                        

                    }

                    otherlv_19=(Token)match(input,31,FOLLOW_31_in_ruleBaseType5828); 

                        	newLeafNode(otherlv_19, grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_4_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2697:1: ( (lv_base_20_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2698:1: (lv_base_20_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2698:1: (lv_base_20_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2699:3: lv_base_20_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getBaseTypeParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5849);
                    lv_base_20_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBaseTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_20_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_21=(Token)match(input,32,FOLLOW_32_in_ruleBaseType5861); 

                        	newLeafNode(otherlv_21, grammarAccess.getBaseTypeAccess().getRightSquareBracketKeyword_4_4());
                        

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
    // $ANTLR end "ruleBaseType"


    // $ANTLR start "entryRuleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2727:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2728:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2729:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5898);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5908); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2736:1: ruleLiteral returns [EObject current=null] : (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BasicLiteral_0 = null;

        EObject this_TupleLiteral_1 = null;

        EObject this_OptionLiteral_2 = null;

        EObject this_SeqLiteral_3 = null;

        EObject this_SetLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2739:28: ( (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2740:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2740:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral )
            int alt49=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt49=1;
                }
                break;
            case 47:
                {
                alt49=2;
                }
                break;
            case 33:
            case 34:
                {
                alt49=3;
                }
                break;
            case 31:
                {
                alt49=4;
                }
                break;
            case 16:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2741:5: this_BasicLiteral_0= ruleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicLiteral_in_ruleLiteral5955);
                    this_BasicLiteral_0=ruleBasicLiteral();

                    state._fsp--;

                     
                            current = this_BasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2751:5: this_TupleLiteral_1= ruleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleLiteral_in_ruleLiteral5982);
                    this_TupleLiteral_1=ruleTupleLiteral();

                    state._fsp--;

                     
                            current = this_TupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2761:5: this_OptionLiteral_2= ruleOptionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getOptionLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleOptionLiteral_in_ruleLiteral6009);
                    this_OptionLiteral_2=ruleOptionLiteral();

                    state._fsp--;

                     
                            current = this_OptionLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2771:5: this_SeqLiteral_3= ruleSeqLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSeqLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSeqLiteral_in_ruleLiteral6036);
                    this_SeqLiteral_3=ruleSeqLiteral();

                    state._fsp--;

                     
                            current = this_SeqLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2781:5: this_SetLiteral_4= ruleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleLiteral6063);
                    this_SetLiteral_4=ruleSetLiteral();

                    state._fsp--;

                     
                            current = this_SetLiteral_4; 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2797:1: entryRuleBasicLiteral returns [EObject current=null] : iv_ruleBasicLiteral= ruleBasicLiteral EOF ;
    public final EObject entryRuleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2798:2: (iv_ruleBasicLiteral= ruleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2799:2: iv_ruleBasicLiteral= ruleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral6098);
            iv_ruleBasicLiteral=ruleBasicLiteral();

            state._fsp--;

             current =iv_ruleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicLiteral6108); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2806:1: ruleBasicLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) ;
    public final EObject ruleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lit_1_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2809:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2810:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2810:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2810:2: ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2810:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2811:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2811:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2812:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicLiteral6153); 

            		newLeafNode(otherlv_0, grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2823:2: ( (lv_lit_1_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2824:1: (lv_lit_1_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2824:1: (lv_lit_1_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2825:3: lv_lit_1_0= RULE_LIT
            {
            lv_lit_1_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleBasicLiteral6170); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2849:1: entryRuleTupleLiteral returns [EObject current=null] : iv_ruleTupleLiteral= ruleTupleLiteral EOF ;
    public final EObject entryRuleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2850:2: (iv_ruleTupleLiteral= ruleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2851:2: iv_ruleTupleLiteral= ruleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral6211);
            iv_ruleTupleLiteral=ruleTupleLiteral();

            state._fsp--;

             current =iv_ruleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteral6221); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2858:1: ruleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2861:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2862:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2862:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2862:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleTupleLiteral6258); 

                	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2866:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2867:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2872:2: ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==16||LA51_0==31||(LA51_0>=33 && LA51_0<=34)||LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2872:3: ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2872:3: ( (lv_elems_2_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2873:1: (lv_elems_2_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2873:1: (lv_elems_2_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2874:3: lv_elems_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral6289);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2890:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==28) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2890:4: otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleTupleLiteral6302); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2894:1: ( (lv_elems_4_0= ruleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2895:1: (lv_elems_4_0= ruleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2895:1: (lv_elems_4_0= ruleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2896:3: lv_elems_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral6323);
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleTupleLiteral6339); 

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


    // $ANTLR start "entryRuleSeqLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2924:1: entryRuleSeqLiteral returns [EObject current=null] : iv_ruleSeqLiteral= ruleSeqLiteral EOF ;
    public final EObject entryRuleSeqLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2925:2: (iv_ruleSeqLiteral= ruleSeqLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2926:2: iv_ruleSeqLiteral= ruleSeqLiteral EOF
            {
             newCompositeNode(grammarAccess.getSeqLiteralRule()); 
            pushFollow(FOLLOW_ruleSeqLiteral_in_entryRuleSeqLiteral6375);
            iv_ruleSeqLiteral=ruleSeqLiteral();

            state._fsp--;

             current =iv_ruleSeqLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeqLiteral6385); 

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
    // $ANTLR end "entryRuleSeqLiteral"


    // $ANTLR start "ruleSeqLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2933:1: ruleSeqLiteral returns [EObject current=null] : (otherlv_0= '[' ( (lv_basicType_1_0= ruleBaseType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleSeqLiteral() throws RecognitionException {
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2936:28: ( (otherlv_0= '[' ( (lv_basicType_1_0= ruleBaseType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2937:1: (otherlv_0= '[' ( (lv_basicType_1_0= ruleBaseType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2937:1: (otherlv_0= '[' ( (lv_basicType_1_0= ruleBaseType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2937:3: otherlv_0= '[' ( (lv_basicType_1_0= ruleBaseType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleSeqLiteral6422); 

                	newLeafNode(otherlv_0, grammarAccess.getSeqLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2941:1: ( (lv_basicType_1_0= ruleBaseType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2942:1: (lv_basicType_1_0= ruleBaseType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2942:1: (lv_basicType_1_0= ruleBaseType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2943:3: lv_basicType_1_0= ruleBaseType
            {
             
            	        newCompositeNode(grammarAccess.getSeqLiteralAccess().getBasicTypeBaseTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBaseType_in_ruleSeqLiteral6443);
            lv_basicType_1_0=ruleBaseType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSeqLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"basicType",
                    		lv_basicType_1_0, 
                    		"BaseType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleSeqLiteral6455); 

                	newLeafNode(otherlv_2, grammarAccess.getSeqLiteralAccess().getColonKeyword_2());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2963:1: ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_LIT||LA53_0==16||LA53_0==31||(LA53_0>=33 && LA53_0<=34)||LA53_0==47) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2963:2: ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2963:2: ( (lv_elems_3_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2964:1: (lv_elems_3_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2964:1: (lv_elems_3_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2965:3: lv_elems_3_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6477);
                    lv_elems_3_0=ruleSimpleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSeqLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"elems",
                            		lv_elems_3_0, 
                            		"SimpleLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2981:2: (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==28) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2981:4: otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSeqLiteral6490); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSeqLiteralAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2985:1: ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2986:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2986:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2987:3: lv_elems_5_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6511);
                    	    lv_elems_5_0=ruleSimpleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSeqLiteralRule());
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
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleSeqLiteral6527); 

                	newLeafNode(otherlv_6, grammarAccess.getSeqLiteralAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleSeqLiteral"


    // $ANTLR start "entryRuleSetLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3015:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3016:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3017:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral6563);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;

             current =iv_ruleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral6573); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3024:1: ruleSetLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_basicType_1_0= ruleBaseType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3027:28: ( (otherlv_0= '{' ( (lv_basicType_1_0= ruleBaseType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3028:1: (otherlv_0= '{' ( (lv_basicType_1_0= ruleBaseType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3028:1: (otherlv_0= '{' ( (lv_basicType_1_0= ruleBaseType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3028:3: otherlv_0= '{' ( (lv_basicType_1_0= ruleBaseType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSetLiteral6610); 

                	newLeafNode(otherlv_0, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3032:1: ( (lv_basicType_1_0= ruleBaseType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3033:1: (lv_basicType_1_0= ruleBaseType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3033:1: (lv_basicType_1_0= ruleBaseType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3034:3: lv_basicType_1_0= ruleBaseType
            {
             
            	        newCompositeNode(grammarAccess.getSetLiteralAccess().getBasicTypeBaseTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBaseType_in_ruleSetLiteral6631);
            lv_basicType_1_0=ruleBaseType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"basicType",
                    		lv_basicType_1_0, 
                    		"BaseType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleSetLiteral6643); 

                	newLeafNode(otherlv_2, grammarAccess.getSetLiteralAccess().getColonKeyword_2());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3054:1: ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_LIT||LA55_0==16||LA55_0==31||(LA55_0>=33 && LA55_0<=34)||LA55_0==47) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3054:2: ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3054:2: ( (lv_elems_3_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3055:1: (lv_elems_3_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3055:1: (lv_elems_3_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3056:3: lv_elems_3_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6665);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3072:2: (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==28) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3072:4: otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSetLiteral6678); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSetLiteralAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3076:1: ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3077:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3077:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3078:3: lv_elems_5_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6699);
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
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleSetLiteral6715); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3106:1: entryRuleOptionLiteral returns [EObject current=null] : iv_ruleOptionLiteral= ruleOptionLiteral EOF ;
    public final EObject entryRuleOptionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3107:2: (iv_ruleOptionLiteral= ruleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3108:2: iv_ruleOptionLiteral= ruleOptionLiteral EOF
            {
             newCompositeNode(grammarAccess.getOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral6751);
            iv_ruleOptionLiteral=ruleOptionLiteral();

            state._fsp--;

             current =iv_ruleOptionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionLiteral6761); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3115:1: ruleOptionLiteral returns [EObject current=null] : ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) ) ;
    public final EObject ruleOptionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_type_3_0 = null;

        EObject lv_lit_7_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3118:28: ( ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3119:1: ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3119:1: ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==34) ) {
                alt56=1;
            }
            else if ( (LA56_0==33) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3119:2: (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3119:2: (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3119:4: otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleOptionLiteral6799); 

                        	newLeafNode(otherlv_0, grammarAccess.getOptionLiteralAccess().getNoneKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3123:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3124:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionLiteralAccess().getNoneLiteralAction_0_1(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleOptionLiteral6820); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionLiteralAccess().getLeftSquareBracketKeyword_0_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3133:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3134:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3134:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3135:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionLiteralAccess().getTypeTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleOptionLiteral6841);
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

                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleOptionLiteral6853); 

                        	newLeafNode(otherlv_4, grammarAccess.getOptionLiteralAccess().getRightSquareBracketKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3156:6: (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3156:6: (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3156:8: otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleOptionLiteral6873); 

                        	newLeafNode(otherlv_5, grammarAccess.getOptionLiteralAccess().getSomeKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3160:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3161:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionLiteralAccess().getSomeLiteralAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3166:2: ( (lv_lit_7_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3167:1: (lv_lit_7_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3167:1: (lv_lit_7_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3168:3: lv_lit_7_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionLiteralAccess().getLitLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleOptionLiteral6903);
                    lv_lit_7_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"lit",
                            		lv_lit_7_0, 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3192:1: entryRuleSimpleLiteral returns [EObject current=null] : iv_ruleSimpleLiteral= ruleSimpleLiteral EOF ;
    public final EObject entryRuleSimpleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3193:2: (iv_ruleSimpleLiteral= ruleSimpleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3194:2: iv_ruleSimpleLiteral= ruleSimpleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleLiteral_in_entryRuleSimpleLiteral6940);
            iv_ruleSimpleLiteral=ruleSimpleLiteral();

            state._fsp--;

             current =iv_ruleSimpleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleLiteral6950); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3201:1: ruleSimpleLiteral returns [EObject current=null] : (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral ) ;
    public final EObject ruleSimpleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBasicLiteral_0 = null;

        EObject this_SimpleTupleLiteral_1 = null;

        EObject this_SimpleSeqLiteral_2 = null;

        EObject this_SimpleSetLiteral_3 = null;

        EObject this_SimpleOptionLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3204:28: ( (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3205:1: (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3205:1: (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral )
            int alt57=5;
            switch ( input.LA(1) ) {
            case RULE_LIT:
                {
                alt57=1;
                }
                break;
            case 47:
                {
                alt57=2;
                }
                break;
            case 31:
                {
                alt57=3;
                }
                break;
            case 16:
                {
                alt57=4;
                }
                break;
            case 33:
            case 34:
                {
                alt57=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3206:5: this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleBasicLiteral_in_ruleSimpleLiteral6997);
                    this_SimpleBasicLiteral_0=ruleSimpleBasicLiteral();

                    state._fsp--;

                     
                            current = this_SimpleBasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3216:5: this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleTupleLiteral_in_ruleSimpleLiteral7024);
                    this_SimpleTupleLiteral_1=ruleSimpleTupleLiteral();

                    state._fsp--;

                     
                            current = this_SimpleTupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3226:5: this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleSeqLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSimpleSeqLiteral_in_ruleSimpleLiteral7051);
                    this_SimpleSeqLiteral_2=ruleSimpleSeqLiteral();

                    state._fsp--;

                     
                            current = this_SimpleSeqLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3236:5: this_SimpleSetLiteral_3= ruleSimpleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleSetLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSimpleSetLiteral_in_ruleSimpleLiteral7078);
                    this_SimpleSetLiteral_3=ruleSimpleSetLiteral();

                    state._fsp--;

                     
                            current = this_SimpleSetLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3246:5: this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleOptionLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSimpleOptionLiteral_in_ruleSimpleLiteral7105);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3262:1: entryRuleSimpleBasicLiteral returns [EObject current=null] : iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF ;
    public final EObject entryRuleSimpleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3263:2: (iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3264:2: iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleBasicLiteral_in_entryRuleSimpleBasicLiteral7140);
            iv_ruleSimpleBasicLiteral=ruleSimpleBasicLiteral();

            state._fsp--;

             current =iv_ruleSimpleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBasicLiteral7150); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3271:1: ruleSimpleBasicLiteral returns [EObject current=null] : ( (lv_lit_0_0= RULE_LIT ) ) ;
    public final EObject ruleSimpleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3274:28: ( ( (lv_lit_0_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3275:1: ( (lv_lit_0_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3275:1: ( (lv_lit_0_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3276:1: (lv_lit_0_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3276:1: (lv_lit_0_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3277:3: lv_lit_0_0= RULE_LIT
            {
            lv_lit_0_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleSimpleBasicLiteral7191); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3301:1: entryRuleSimpleTupleLiteral returns [EObject current=null] : iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF ;
    public final EObject entryRuleSimpleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3302:2: (iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3303:2: iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleTupleLiteral_in_entryRuleSimpleTupleLiteral7231);
            iv_ruleSimpleTupleLiteral=ruleSimpleTupleLiteral();

            state._fsp--;

             current =iv_ruleSimpleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTupleLiteral7241); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3310:1: ruleSimpleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleSimpleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3313:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3314:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3314:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3314:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleSimpleTupleLiteral7278); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3318:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3319:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleTupleLiteralAccess().getSimpleTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3324:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_LIT||LA59_0==16||LA59_0==31||(LA59_0>=33 && LA59_0<=34)||LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3324:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3324:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3325:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3325:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3326:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleTupleLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral7309);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3342:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==28) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3342:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleSimpleTupleLiteral7322); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3346:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3347:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3347:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3348:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleTupleLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral7343);
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
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleSimpleTupleLiteral7359); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3376:1: entryRuleSimpleOptionLiteral returns [EObject current=null] : iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF ;
    public final EObject entryRuleSimpleOptionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOptionLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3377:2: (iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3378:2: iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleOptionLiteral_in_entryRuleSimpleOptionLiteral7395);
            iv_ruleSimpleOptionLiteral=ruleSimpleOptionLiteral();

            state._fsp--;

             current =iv_ruleSimpleOptionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOptionLiteral7405); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3385:1: ruleSimpleOptionLiteral returns [EObject current=null] : ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) ) ;
    public final EObject ruleSimpleOptionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lit_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3388:28: ( ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3389:1: ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3389:1: ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==34) ) {
                alt60=1;
            }
            else if ( (LA60_0==33) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3389:2: (otherlv_0= 'None' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3389:2: (otherlv_0= 'None' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3389:4: otherlv_0= 'None' ()
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleSimpleOptionLiteral7443); 

                        	newLeafNode(otherlv_0, grammarAccess.getSimpleOptionLiteralAccess().getNoneKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3393:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3394:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSimpleOptionLiteralAccess().getSimpleNoneLiteralAction_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3400:6: (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3400:6: (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3400:8: otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSimpleOptionLiteral7472); 

                        	newLeafNode(otherlv_2, grammarAccess.getSimpleOptionLiteralAccess().getSomeKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3404:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3405:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSimpleOptionLiteralAccess().getSimpleSomeLiteralAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3410:2: ( (lv_lit_4_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3411:1: (lv_lit_4_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3411:1: (lv_lit_4_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3412:3: lv_lit_4_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleOptionLiteralAccess().getLitSimpleLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleOptionLiteral7502);
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


    // $ANTLR start "entryRuleSimpleSeqLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3436:1: entryRuleSimpleSeqLiteral returns [EObject current=null] : iv_ruleSimpleSeqLiteral= ruleSimpleSeqLiteral EOF ;
    public final EObject entryRuleSimpleSeqLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSeqLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3437:2: (iv_ruleSimpleSeqLiteral= ruleSimpleSeqLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3438:2: iv_ruleSimpleSeqLiteral= ruleSimpleSeqLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleSeqLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleSeqLiteral_in_entryRuleSimpleSeqLiteral7539);
            iv_ruleSimpleSeqLiteral=ruleSimpleSeqLiteral();

            state._fsp--;

             current =iv_ruleSimpleSeqLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSeqLiteral7549); 

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
    // $ANTLR end "entryRuleSimpleSeqLiteral"


    // $ANTLR start "ruleSimpleSeqLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3445:1: ruleSimpleSeqLiteral returns [EObject current=null] : (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleSimpleSeqLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3448:28: ( (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3449:1: (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3449:1: (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3449:3: otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleSimpleSeqLiteral7586); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleSeqLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3453:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3454:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleSeqLiteralAccess().getSimpleSeqLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3459:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_LIT||LA62_0==16||LA62_0==31||(LA62_0>=33 && LA62_0<=34)||LA62_0==47) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3459:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3459:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3460:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3460:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3461:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7617);
                    lv_elems_2_0=ruleSimpleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleSeqLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"elems",
                            		lv_elems_2_0, 
                            		"SimpleLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3477:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==28) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3477:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleSimpleSeqLiteral7630); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleSeqLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3481:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3482:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3482:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3483:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7651);
                    	    lv_elems_4_0=ruleSimpleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleSeqLiteralRule());
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
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleSimpleSeqLiteral7667); 

                	newLeafNode(otherlv_5, grammarAccess.getSimpleSeqLiteralAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleSimpleSeqLiteral"


    // $ANTLR start "entryRuleSimpleSetLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3511:1: entryRuleSimpleSetLiteral returns [EObject current=null] : iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF ;
    public final EObject entryRuleSimpleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3512:2: (iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3513:2: iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleSetLiteral_in_entryRuleSimpleSetLiteral7703);
            iv_ruleSimpleSetLiteral=ruleSimpleSetLiteral();

            state._fsp--;

             current =iv_ruleSimpleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSetLiteral7713); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3520:1: ruleSimpleSetLiteral returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSimpleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3523:28: ( (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3524:1: (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3524:1: (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3524:3: otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSimpleSetLiteral7750); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleSetLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3528:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3529:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleSetLiteralAccess().getSimpleSetLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3534:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_LIT||LA64_0==16||LA64_0==31||(LA64_0>=33 && LA64_0<=34)||LA64_0==47) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3534:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3534:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3535:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3535:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3536:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral7781);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3552:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==28) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3552:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleSimpleSetLiteral7794); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleSetLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3556:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3557:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3557:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3558:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral7815);
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
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSimpleSetLiteral7831); 

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
    public static final BitSet FOLLOW_ruleDecl_in_ruleModel130 = new BitSet(new long[]{0x0000020000003C02L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleDecl223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDecl_in_ruleDecl250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReportDecl_in_ruleDecl277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleTypeDecl359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDecl_in_entryRuleComponentDecl417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDecl427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleComponentDecl466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12_in_ruleComponentDecl495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13_in_ruleComponentDecl524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl552 = new BitSet(new long[]{0x00000000000D4002L});
    public static final BitSet FOLLOW_14_in_ruleComponentDecl570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl590 = new BitSet(new long[]{0x00000000000D8002L});
    public static final BitSet FOLLOW_15_in_ruleComponentDecl603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl623 = new BitSet(new long[]{0x00000000000D8002L});
    public static final BitSet FOLLOW_16_in_ruleComponentDecl640 = new BitSet(new long[]{0x0000001003C20010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleComponentDecl661 = new BitSet(new long[]{0x0000001003C20010L});
    public static final BitSet FOLLOW_17_in_ruleComponentDecl674 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleComponentDecl689 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponentDecl701 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleDevice_in_ruleComponentDecl722 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComponentDecl744 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleComponentDecl766 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleComponentDecl778 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleComponentDecl793 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponentDecl805 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleReport_in_ruleComponentDecl826 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleComponentDecl839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_entryRuleMemberDecl877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDecl887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_ruleMemberDecl934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberDecl_in_ruleMemberDecl961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_ruleMemberDecl988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrDecl1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleAttrDecl1079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttrDecl1096 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleAttrDecl1115 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttrDecl1136 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAttrDecl1149 = new BitSet(new long[]{0x0000800688010010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAttrDecl1192 = new BitSet(new long[]{0x0000800688010010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier1252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleModifier1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleModifier1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleModifier1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleModifier1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberDecl_in_entryRuleSubMemberDecl1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMemberDecl1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberDecl1450 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleSubMemberDecl1469 = new BitSet(new long[]{0x0000000E40000010L});
    public static final BitSet FOLLOW_ruleFeatureType_in_ruleSubMemberDecl1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSubMemberDecl1510 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubMemberDecl1522 = new BitSet(new long[]{0x0000001003C20010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleSubMemberDecl1543 = new BitSet(new long[]{0x0000001003C20010L});
    public static final BitSet FOLLOW_17_in_ruleSubMemberDecl1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1646 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAssignment1663 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleAssignment1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReport_in_entryRuleReport1720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReport1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReport1772 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleReport1789 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleReport1810 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleReport1823 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleReport1844 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleReport1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_entryRuleFeatureType1894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureType1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFeatureType1969 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureType1990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2011 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFeatureType2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFeatureType2043 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureType2064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2085 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFeatureType2097 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleFeatureType2110 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureType2122 = new BitSet(new long[]{0x0000001003C20010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleFeatureType2143 = new BitSet(new long[]{0x0000001003C20010L});
    public static final BitSet FOLLOW_17_in_ruleFeatureType2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFeatureType2178 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureType2199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2220 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFeatureType2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFeatureType2252 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureType2273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2294 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFeatureType2307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2328 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_32_in_ruleFeatureType2342 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleFeatureType2355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NAT_in_ruleFeatureType2372 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureType2389 = new BitSet(new long[]{0x0000001003C20010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleFeatureType2410 = new BitSet(new long[]{0x0000001003C20010L});
    public static final BitSet FOLLOW_17_in_ruleFeatureType2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_entryRuleBaseFeatureType2462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseFeatureType2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseFeatureType2517 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_15_in_ruleBaseFeatureType2530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseFeatureType2550 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_21_in_ruleBaseFeatureType2565 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBaseFeatureType2577 = new BitSet(new long[]{0x0000001003C20010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleBaseFeatureType2598 = new BitSet(new long[]{0x0000001003C20010L});
    public static final BitSet FOLLOW_17_in_ruleBaseFeatureType2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl2649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariantDecl2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariantDecl_in_ruleInvariantDecl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralInvariantDecl_in_ruleInvariantDecl2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariantDecl_in_entryRuleMultiplicityInvariantDecl2768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityInvariantDecl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMultiplicityInvariantDecl2815 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl2833 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMultiplicityInvariantDecl2850 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl2874 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMultiplicityInvariantDecl2886 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl2907 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleSubMemberMatch_in_ruleMultiplicityInvariantDecl2929 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleMultiplicityInvariantDecl2942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralInvariantDecl_in_entryRuleGeneralInvariantDecl3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralInvariantDecl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleGeneralInvariantDecl3047 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralInvariantDecl3065 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGeneralInvariantDecl3082 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleGeneralInvariantDecl3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberMatch_in_entryRuleSubMemberMatch3141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMemberMatch3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberMatch3194 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSubMemberMatch3211 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberMatch3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSubMemberMatch3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat3310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintNat3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAT_in_ruleConstraintNat3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleConstraintNat3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevice_in_entryRuleDevice3443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevice3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice3495 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDevice3512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice3532 = new BitSet(new long[]{0x0000010000008002L});
    public static final BitSet FOLLOW_15_in_ruleDevice3545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice3565 = new BitSet(new long[]{0x0000010000008002L});
    public static final BitSet FOLLOW_ruleConstraintExp_in_ruleDevice3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExp_in_entryRuleConstraintExp3625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExp3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleConstraintExp3672 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleConstraintExp3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReportDecl_in_entryRuleReportDecl3729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReportDecl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleReportDecl3776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReportDecl3793 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleReportDecl3810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParam_in_ruleReportDecl3831 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleReportDecl3844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParam_in_ruleReportDecl3865 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleReportDecl3879 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleReportDecl3891 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleReportMemberDecl_in_ruleReportDecl3912 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleReportDecl3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam3961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParam4013 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleParam4030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleParam4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReportMemberDecl_in_entryRuleReportMemberDecl4087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReportMemberDecl4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReportMemberDecl4139 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleReportMemberDecl4156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReportMemberDecl4177 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleReportMemberDecl4189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReportMemberDecl4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_entryRuleExp4249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleExp4297 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp4327 = new BitSet(new long[]{0x00FFFC8000000000L});
    public static final BitSet FOLLOW_ruleBinaryOp_in_ruleExp4348 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp4369 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleExp4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleExp4401 = new BitSet(new long[]{0x0730000000000000L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleExp4431 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp4452 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleExp4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleExp4502 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleExp4515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExp4544 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary4583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_rulePrimary4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOp_in_entryRuleBinaryOp4726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOp4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBinaryOp4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBinaryOp4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBinaryOp4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBinaryOp4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBinaryOp4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleBinaryOp4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBinaryOp4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBinaryOp4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleBinaryOp4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBinaryOp4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBinaryOp4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBinaryOp4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBinaryOp5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBinaryOp5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBinaryOp5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_entryRuleUnaryOp5082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOp5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUnaryOp5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUnaryOp5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleUnaryOp5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleUnaryOp5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUnaryOp5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType5247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleType5295 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleType5316 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType5337 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleType5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleType5369 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleType5390 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType5411 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleType5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_ruleType5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_entryRuleBaseType5487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseType5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseType5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleBaseType5561 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5591 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleBaseType5604 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5625 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_46_in_ruleBaseType5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBaseType5659 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBaseType5680 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5701 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBaseType5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBaseType5733 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBaseType5754 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5775 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBaseType5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBaseType5807 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBaseType5828 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5849 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBaseType5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_ruleLiteral5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_ruleLiteral5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_ruleLiteral6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeqLiteral_in_ruleLiteral6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleLiteral6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral6098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicLiteral6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicLiteral6153 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleBasicLiteral6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral6211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteral6221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTupleLiteral6258 = new BitSet(new long[]{0x0000C00688010010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral6289 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_28_in_ruleTupleLiteral6302 = new BitSet(new long[]{0x0000800688010010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral6323 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_46_in_ruleTupleLiteral6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeqLiteral_in_entryRuleSeqLiteral6375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeqLiteral6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSeqLiteral6422 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleBaseType_in_ruleSeqLiteral6443 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSeqLiteral6455 = new BitSet(new long[]{0x0000800780010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6477 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_28_in_ruleSeqLiteral6490 = new BitSet(new long[]{0x0000800680010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6511 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_32_in_ruleSeqLiteral6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral6563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSetLiteral6610 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleBaseType_in_ruleSetLiteral6631 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSetLiteral6643 = new BitSet(new long[]{0x0000800680030040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6665 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleSetLiteral6678 = new BitSet(new long[]{0x0000800680010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6699 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleSetLiteral6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral6751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionLiteral6761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOptionLiteral6799 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOptionLiteral6820 = new BitSet(new long[]{0x1800800640000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleOptionLiteral6841 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOptionLiteral6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOptionLiteral6873 = new BitSet(new long[]{0x0000800688010010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleOptionLiteral6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_entryRuleSimpleLiteral6940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLiteral6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBasicLiteral_in_ruleSimpleLiteral6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTupleLiteral_in_ruleSimpleLiteral7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSeqLiteral_in_ruleSimpleLiteral7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSetLiteral_in_ruleSimpleLiteral7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOptionLiteral_in_ruleSimpleLiteral7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBasicLiteral_in_entryRuleSimpleBasicLiteral7140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBasicLiteral7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleSimpleBasicLiteral7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTupleLiteral_in_entryRuleSimpleTupleLiteral7231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTupleLiteral7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSimpleTupleLiteral7278 = new BitSet(new long[]{0x0000C00680010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral7309 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_28_in_ruleSimpleTupleLiteral7322 = new BitSet(new long[]{0x0000800680010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral7343 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_46_in_ruleSimpleTupleLiteral7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOptionLiteral_in_entryRuleSimpleOptionLiteral7395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOptionLiteral7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSimpleOptionLiteral7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSimpleOptionLiteral7472 = new BitSet(new long[]{0x0000800680010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleOptionLiteral7502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSeqLiteral_in_entryRuleSimpleSeqLiteral7539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSeqLiteral7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSimpleSeqLiteral7586 = new BitSet(new long[]{0x0000800780010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7617 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_28_in_ruleSimpleSeqLiteral7630 = new BitSet(new long[]{0x0000800680010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7651 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_32_in_ruleSimpleSeqLiteral7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSetLiteral_in_entryRuleSimpleSetLiteral7703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSetLiteral7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSimpleSetLiteral7750 = new BitSet(new long[]{0x0000800680030040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral7781 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleSimpleSetLiteral7794 = new BitSet(new long[]{0x0000800680010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral7815 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleSimpleSetLiteral7831 = new BitSet(new long[]{0x0000000000000002L});

}