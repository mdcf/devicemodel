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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'type'", "'featuregroup'", "'<:'", "','", "'{'", "'}'", "':'", "'='", "'const'", "'val'", "'var'", "'def'", "'['", "']'", "'<'", "'*'", "'>'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_LIT=5;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_WS=8;

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

                if ( ((LA1_0>=9 && LA1_0<=10)) ) {
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:115:1: ruleDecl returns [EObject current=null] : ( (otherlv_0= 'type' () ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= 'featuregroup' () ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '<:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ( (lv_body_10_0= ruleFeatureGroupBody ) ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_body_10_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:118:28: ( ( (otherlv_0= 'type' () ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= 'featuregroup' () ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '<:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ( (lv_body_10_0= ruleFeatureGroupBody ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:1: ( (otherlv_0= 'type' () ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= 'featuregroup' () ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '<:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ( (lv_body_10_0= ruleFeatureGroupBody ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:1: ( (otherlv_0= 'type' () ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= 'featuregroup' () ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '<:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ( (lv_body_10_0= ruleFeatureGroupBody ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==9) ) {
                alt4=1;
            }
            else if ( (LA4_0==10) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:2: (otherlv_0= 'type' () ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:2: (otherlv_0= 'type' () ( (lv_name_2_0= RULE_ID ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:4: otherlv_0= 'type' () ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleDecl214); 

                        	newLeafNode(otherlv_0, grammarAccess.getDeclAccess().getTypeKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:123:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:124:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDeclAccess().getTypeDeclAction_0_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:129:2: ( (lv_name_2_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:130:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:130:1: (lv_name_2_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:131:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecl240); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:148:6: (otherlv_3= 'featuregroup' () ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '<:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ( (lv_body_10_0= ruleFeatureGroupBody ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:148:6: (otherlv_3= 'featuregroup' () ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '<:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ( (lv_body_10_0= ruleFeatureGroupBody ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:148:8: otherlv_3= 'featuregroup' () ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '<:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ( (lv_body_10_0= ruleFeatureGroupBody ) )
                    {
                    otherlv_3=(Token)match(input,10,FOLLOW_10_in_ruleDecl265); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeclAccess().getFeaturegroupKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:152:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:153:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDeclAccess().getFeatureGroupDeclAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:158:2: ( (lv_name_5_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:1: (lv_name_5_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:160:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecl291); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:176:2: (otherlv_6= '<:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==11) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:176:4: otherlv_6= '<:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                            {
                            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleDecl309); 

                                	newLeafNode(otherlv_6, grammarAccess.getDeclAccess().getLessThanSignColonKeyword_1_3_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:180:1: ( (otherlv_7= RULE_ID ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:181:1: (otherlv_7= RULE_ID )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:181:1: (otherlv_7= RULE_ID )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:182:3: otherlv_7= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getDeclRule());
                            	        }
                                    
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecl329); 

                            		newLeafNode(otherlv_7, grammarAccess.getDeclAccess().getSupersFeatureGroupDeclCrossReference_1_3_1_0()); 
                            	

                            }


                            }

                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:193:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( (LA2_0==12) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:193:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                            	    {
                            	    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleDecl342); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getDeclAccess().getCommaKeyword_1_3_2_0());
                            	        
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:197:1: ( (otherlv_9= RULE_ID ) )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:198:1: (otherlv_9= RULE_ID )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:198:1: (otherlv_9= RULE_ID )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:199:3: otherlv_9= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getDeclRule());
                            	    	        }
                            	            
                            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecl362); 

                            	    		newLeafNode(otherlv_9, grammarAccess.getDeclAccess().getSupersFeatureGroupDeclCrossReference_1_3_2_1_0()); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:210:6: ( (lv_body_10_0= ruleFeatureGroupBody ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:211:1: (lv_body_10_0= ruleFeatureGroupBody )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:211:1: (lv_body_10_0= ruleFeatureGroupBody )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:3: lv_body_10_0= ruleFeatureGroupBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclAccess().getBodyFeatureGroupBodyParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureGroupBody_in_ruleDecl387);
                    lv_body_10_0=ruleFeatureGroupBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_10_0, 
                            		"FeatureGroupBody");
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
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleFeatureGroupBody"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:236:1: entryRuleFeatureGroupBody returns [EObject current=null] : iv_ruleFeatureGroupBody= ruleFeatureGroupBody EOF ;
    public final EObject entryRuleFeatureGroupBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureGroupBody = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:237:2: (iv_ruleFeatureGroupBody= ruleFeatureGroupBody EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:238:2: iv_ruleFeatureGroupBody= ruleFeatureGroupBody EOF
            {
             newCompositeNode(grammarAccess.getFeatureGroupBodyRule()); 
            pushFollow(FOLLOW_ruleFeatureGroupBody_in_entryRuleFeatureGroupBody424);
            iv_ruleFeatureGroupBody=ruleFeatureGroupBody();

            state._fsp--;

             current =iv_ruleFeatureGroupBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureGroupBody434); 

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
    // $ANTLR end "entryRuleFeatureGroupBody"


    // $ANTLR start "ruleFeatureGroupBody"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:245:1: ruleFeatureGroupBody returns [EObject current=null] : (otherlv_0= '{' () ( (lv_groupElements_2_0= ruleGroupElementDecl ) )* otherlv_3= '}' ) ;
    public final EObject ruleFeatureGroupBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_groupElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:248:28: ( (otherlv_0= '{' () ( (lv_groupElements_2_0= ruleGroupElementDecl ) )* otherlv_3= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:249:1: (otherlv_0= '{' () ( (lv_groupElements_2_0= ruleGroupElementDecl ) )* otherlv_3= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:249:1: (otherlv_0= '{' () ( (lv_groupElements_2_0= ruleGroupElementDecl ) )* otherlv_3= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:249:3: otherlv_0= '{' () ( (lv_groupElements_2_0= ruleGroupElementDecl ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFeatureGroupBody471); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureGroupBodyAccess().getLeftCurlyBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:253:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:254:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureGroupBodyAccess().getFeatureGroupBodyAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:259:2: ( (lv_groupElements_2_0= ruleGroupElementDecl ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=17 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:260:1: (lv_groupElements_2_0= ruleGroupElementDecl )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:260:1: (lv_groupElements_2_0= ruleGroupElementDecl )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:261:3: lv_groupElements_2_0= ruleGroupElementDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureGroupBodyAccess().getGroupElementsGroupElementDeclParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroupElementDecl_in_ruleFeatureGroupBody501);
            	    lv_groupElements_2_0=ruleGroupElementDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureGroupBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groupElements",
            	            		lv_groupElements_2_0, 
            	            		"GroupElementDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleFeatureGroupBody514); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureGroupBodyAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleFeatureGroupBody"


    // $ANTLR start "entryRuleGroupElementDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:289:1: entryRuleGroupElementDecl returns [EObject current=null] : iv_ruleGroupElementDecl= ruleGroupElementDecl EOF ;
    public final EObject entryRuleGroupElementDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupElementDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:290:2: (iv_ruleGroupElementDecl= ruleGroupElementDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:291:2: iv_ruleGroupElementDecl= ruleGroupElementDecl EOF
            {
             newCompositeNode(grammarAccess.getGroupElementDeclRule()); 
            pushFollow(FOLLOW_ruleGroupElementDecl_in_entryRuleGroupElementDecl550);
            iv_ruleGroupElementDecl=ruleGroupElementDecl();

            state._fsp--;

             current =iv_ruleGroupElementDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElementDecl560); 

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
    // $ANTLR end "entryRuleGroupElementDecl"


    // $ANTLR start "ruleGroupElementDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:298:1: ruleGroupElementDecl returns [EObject current=null] : (this_GroupAttrDecl_0= ruleGroupAttrDecl | this_SubGroupDecl_1= ruleSubGroupDecl ) ;
    public final EObject ruleGroupElementDecl() throws RecognitionException {
        EObject current = null;

        EObject this_GroupAttrDecl_0 = null;

        EObject this_SubGroupDecl_1 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:301:28: ( (this_GroupAttrDecl_0= ruleGroupAttrDecl | this_SubGroupDecl_1= ruleSubGroupDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:302:1: (this_GroupAttrDecl_0= ruleGroupAttrDecl | this_SubGroupDecl_1= ruleSubGroupDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:302:1: (this_GroupAttrDecl_0= ruleGroupAttrDecl | this_SubGroupDecl_1= ruleSubGroupDecl )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=17 && LA6_0<=20)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:303:5: this_GroupAttrDecl_0= ruleGroupAttrDecl
                    {
                     
                            newCompositeNode(grammarAccess.getGroupElementDeclAccess().getGroupAttrDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGroupAttrDecl_in_ruleGroupElementDecl607);
                    this_GroupAttrDecl_0=ruleGroupAttrDecl();

                    state._fsp--;

                     
                            current = this_GroupAttrDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:313:5: this_SubGroupDecl_1= ruleSubGroupDecl
                    {
                     
                            newCompositeNode(grammarAccess.getGroupElementDeclAccess().getSubGroupDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSubGroupDecl_in_ruleGroupElementDecl634);
                    this_SubGroupDecl_1=ruleSubGroupDecl();

                    state._fsp--;

                     
                            current = this_SubGroupDecl_1; 
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
    // $ANTLR end "ruleGroupElementDecl"


    // $ANTLR start "entryRuleGroupAttrDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:329:1: entryRuleGroupAttrDecl returns [EObject current=null] : iv_ruleGroupAttrDecl= ruleGroupAttrDecl EOF ;
    public final EObject entryRuleGroupAttrDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupAttrDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:330:2: (iv_ruleGroupAttrDecl= ruleGroupAttrDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:331:2: iv_ruleGroupAttrDecl= ruleGroupAttrDecl EOF
            {
             newCompositeNode(grammarAccess.getGroupAttrDeclRule()); 
            pushFollow(FOLLOW_ruleGroupAttrDecl_in_entryRuleGroupAttrDecl669);
            iv_ruleGroupAttrDecl=ruleGroupAttrDecl();

            state._fsp--;

             current =iv_ruleGroupAttrDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupAttrDecl679); 

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
    // $ANTLR end "entryRuleGroupAttrDecl"


    // $ANTLR start "ruleGroupAttrDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:338:1: ruleGroupAttrDecl returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_attributeType_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_attributeLiteral_5_0= ruleLiteral ) ) ) ) ) ;
    public final EObject ruleGroupAttrDecl() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_modifier_0_0 = null;

        EObject lv_attributeType_3_0 = null;

        EObject lv_attributeLiteral_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:341:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_attributeType_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_attributeLiteral_5_0= ruleLiteral ) ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:342:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_attributeType_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_attributeLiteral_5_0= ruleLiteral ) ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:342:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_attributeType_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_attributeLiteral_5_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:342:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_attributeType_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_attributeLiteral_5_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:342:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:343:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:343:1: (lv_modifier_0_0= ruleModifier )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:344:3: lv_modifier_0_0= ruleModifier
            {
             
            	        newCompositeNode(grammarAccess.getGroupAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModifier_in_ruleGroupAttrDecl725);
            lv_modifier_0_0=ruleModifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupAttrDeclRule());
            	        }
                   		set(
                   			current, 
                   			"modifier",
                    		lv_modifier_0_0, 
                    		"Modifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:360:2: ( (lv_attributeName_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:361:1: (lv_attributeName_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:361:1: (lv_attributeName_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:362:3: lv_attributeName_1_0= RULE_ID
            {
            lv_attributeName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGroupAttrDecl742); 

            			newLeafNode(lv_attributeName_1_0, grammarAccess.getGroupAttrDeclAccess().getAttributeNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupAttrDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributeName",
                    		lv_attributeName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:378:2: ( (otherlv_2= ':' ( (lv_attributeType_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_attributeLiteral_5_0= ruleLiteral ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:378:3: (otherlv_2= ':' ( (lv_attributeType_3_0= ruleType ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:378:3: (otherlv_2= ':' ( (lv_attributeType_3_0= ruleType ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:378:5: otherlv_2= ':' ( (lv_attributeType_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleGroupAttrDecl761); 

                        	newLeafNode(otherlv_2, grammarAccess.getGroupAttrDeclAccess().getColonKeyword_2_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:382:1: ( (lv_attributeType_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:383:1: (lv_attributeType_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:383:1: (lv_attributeType_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:384:3: lv_attributeType_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupAttrDeclAccess().getAttributeTypeTypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleGroupAttrDecl782);
                    lv_attributeType_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupAttrDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"attributeType",
                            		lv_attributeType_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:401:6: (otherlv_4= '=' ( (lv_attributeLiteral_5_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:401:6: (otherlv_4= '=' ( (lv_attributeLiteral_5_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:401:8: otherlv_4= '=' ( (lv_attributeLiteral_5_0= ruleLiteral ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleGroupAttrDecl802); 

                        	newLeafNode(otherlv_4, grammarAccess.getGroupAttrDeclAccess().getEqualsSignKeyword_2_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:405:1: ( (lv_attributeLiteral_5_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:406:1: (lv_attributeLiteral_5_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:406:1: (lv_attributeLiteral_5_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:407:3: lv_attributeLiteral_5_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupAttrDeclAccess().getAttributeLiteralLiteralParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleGroupAttrDecl823);
                    lv_attributeLiteral_5_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupAttrDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"attributeLiteral",
                            		lv_attributeLiteral_5_0, 
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
    // $ANTLR end "ruleGroupAttrDecl"


    // $ANTLR start "entryRuleModifier"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:431:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:432:2: (iv_ruleModifier= ruleModifier EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:433:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier862);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier873); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:440:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:443:28: ( (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:444:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:444:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:445:2: kw= 'const'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleModifier911); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getConstKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:452:2: kw= 'val'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleModifier930); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getValKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:459:2: kw= 'var'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleModifier949); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getVarKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:466:2: kw= 'def'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleModifier968); 

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


    // $ANTLR start "entryRuleType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:479:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:480:2: (iv_ruleType= ruleType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:481:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1008);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1018); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:488:1: ruleType returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* ) | (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_elemTypes_10_0 = null;

        EObject lv_elemTypes_12_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:491:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* ) | (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:492:1: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* ) | (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:492:1: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* ) | (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:492:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:492:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:492:3: () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:492:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:493:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getBasicTypeAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:498:2: ( (otherlv_1= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:499:1: (otherlv_1= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:499:1: (otherlv_1= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:500:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType1073); 

                    		newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getBaseTypeTypeDeclCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:511:2: ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }
                        else if ( (LA9_0==13) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:511:3: ( () otherlv_3= '[' otherlv_4= ']' )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:511:3: ( () otherlv_3= '[' otherlv_4= ']' )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:511:4: () otherlv_3= '[' otherlv_4= ']'
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:511:4: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:512:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getTypeAccess().getListTypeBaseAction_0_2_0_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleType1096); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_2_0_1());
                    	        
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleType1108); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2_0_2());
                    	        

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:526:6: ( () otherlv_6= '{' otherlv_7= '}' )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:526:6: ( () otherlv_6= '{' otherlv_7= '}' )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:526:7: () otherlv_6= '{' otherlv_7= '}'
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:526:7: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:527:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getTypeAccess().getSetTypeBaseAction_0_2_1_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleType1137); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_0_2_1_1());
                    	        
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleType1149); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_0_2_1_2());
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:541:6: (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:541:6: (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:541:8: otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>'
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleType1172); 

                        	newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:545:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:546:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getTupleTypeAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:551:2: ( (lv_elemTypes_10_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:552:1: (lv_elemTypes_10_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:552:1: (lv_elemTypes_10_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:553:3: lv_elemTypes_10_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType1202);
                    lv_elemTypes_10_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"elemTypes",
                            		lv_elemTypes_10_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:569:2: (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:569:4: otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleType1215); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getTypeAccess().getAsteriskKeyword_1_3_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:573:1: ( (lv_elemTypes_12_0= ruleType ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:574:1: (lv_elemTypes_12_0= ruleType )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:574:1: (lv_elemTypes_12_0= ruleType )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:575:3: lv_elemTypes_12_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleType1236);
                    	    lv_elemTypes_12_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elemTypes",
                    	            		lv_elemTypes_12_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleType1250); 

                        	newLeafNode(otherlv_13, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_4());
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:603:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:604:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:605:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1287);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1297); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:612:1: ruleLiteral returns [EObject current=null] : (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BasicLiteral_0 = null;

        EObject this_TupleLiteral_1 = null;

        EObject this_ListLiteral_2 = null;

        EObject this_SetLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:615:28: ( (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:616:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:616:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case RULE_LIT:
                    {
                    alt12=1;
                    }
                    break;
                case 21:
                    {
                    alt12=3;
                    }
                    break;
                case 13:
                    {
                    alt12=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:617:5: this_BasicLiteral_0= ruleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicLiteral_in_ruleLiteral1344);
                    this_BasicLiteral_0=ruleBasicLiteral();

                    state._fsp--;

                     
                            current = this_BasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:627:5: this_TupleLiteral_1= ruleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleLiteral_in_ruleLiteral1371);
                    this_TupleLiteral_1=ruleTupleLiteral();

                    state._fsp--;

                     
                            current = this_TupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:637:5: this_ListLiteral_2= ruleListLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleListLiteral_in_ruleLiteral1398);
                    this_ListLiteral_2=ruleListLiteral();

                    state._fsp--;

                     
                            current = this_ListLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:647:5: this_SetLiteral_3= ruleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleLiteral1425);
                    this_SetLiteral_3=ruleSetLiteral();

                    state._fsp--;

                     
                            current = this_SetLiteral_3; 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:663:1: entryRuleBasicLiteral returns [EObject current=null] : iv_ruleBasicLiteral= ruleBasicLiteral EOF ;
    public final EObject entryRuleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:664:2: (iv_ruleBasicLiteral= ruleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:665:2: iv_ruleBasicLiteral= ruleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral1460);
            iv_ruleBasicLiteral=ruleBasicLiteral();

            state._fsp--;

             current =iv_ruleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicLiteral1470); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:672:1: ruleBasicLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) ;
    public final EObject ruleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lit_1_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:675:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:676:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:676:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:676:2: ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:676:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:677:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:677:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:678:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicLiteral1515); 

            		newLeafNode(otherlv_0, grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:689:2: ( (lv_lit_1_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:690:1: (lv_lit_1_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:690:1: (lv_lit_1_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:691:3: lv_lit_1_0= RULE_LIT
            {
            lv_lit_1_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleBasicLiteral1532); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:715:1: entryRuleTupleLiteral returns [EObject current=null] : iv_ruleTupleLiteral= ruleTupleLiteral EOF ;
    public final EObject entryRuleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:716:2: (iv_ruleTupleLiteral= ruleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:717:2: iv_ruleTupleLiteral= ruleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral1573);
            iv_ruleTupleLiteral=ruleTupleLiteral();

            state._fsp--;

             current =iv_ruleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteral1583); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:724:1: ruleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:727:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:728:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:728:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:728:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleTupleLiteral1620); 

                	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:732:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:733:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:738:2: ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:738:3: ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:738:3: ( (lv_elems_2_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:739:1: (lv_elems_2_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:739:1: (lv_elems_2_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:740:3: lv_elems_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral1651);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:756:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==12) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:756:4: otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleTupleLiteral1664); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:760:1: ( (lv_elems_4_0= ruleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:761:1: (lv_elems_4_0= ruleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:761:1: (lv_elems_4_0= ruleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:762:3: lv_elems_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral1685);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleTupleLiteral1701); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:790:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:791:2: (iv_ruleListLiteral= ruleListLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:792:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
             newCompositeNode(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral1737);
            iv_ruleListLiteral=ruleListLiteral();

            state._fsp--;

             current =iv_ruleListLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral1747); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:799:1: ruleListLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:802:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:803:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:803:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:803:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= ']'
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:803:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:804:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:804:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:805:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getListLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListLiteral1792); 

            		newLeafNode(otherlv_0, grammarAccess.getListLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleListLiteral1804); 

                	newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:820:1: ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_LIT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:820:2: ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:820:2: ( (lv_elems_2_0= ruleELiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:821:1: (lv_elems_2_0= ruleELiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:821:1: (lv_elems_2_0= ruleELiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:822:3: lv_elems_2_0= ruleELiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleELiteral_in_ruleListLiteral1826);
                    lv_elems_2_0=ruleELiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"elems",
                            		lv_elems_2_0, 
                            		"ELiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:838:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==12) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:838:4: otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleListLiteral1839); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:842:1: ( (lv_elems_4_0= ruleELiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:843:1: (lv_elems_4_0= ruleELiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:843:1: (lv_elems_4_0= ruleELiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:844:3: lv_elems_4_0= ruleELiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleELiteral_in_ruleListLiteral1860);
                    	    lv_elems_4_0=ruleELiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getListLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_4_0, 
                    	            		"ELiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleListLiteral1876); 

                	newLeafNode(otherlv_5, grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3());
                

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:872:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:873:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:874:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral1912);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;

             current =iv_ruleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral1922); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:881:1: ruleSetLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:884:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:885:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:885:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:885:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= '}'
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:885:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:886:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:886:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:887:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSetLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetLiteral1967); 

            		newLeafNode(otherlv_0, grammarAccess.getSetLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleSetLiteral1979); 

                	newLeafNode(otherlv_1, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:902:1: ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_LIT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:902:2: ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:902:2: ( (lv_elems_2_0= ruleELiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:903:1: (lv_elems_2_0= ruleELiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:903:1: (lv_elems_2_0= ruleELiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:904:3: lv_elems_2_0= ruleELiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleELiteral_in_ruleSetLiteral2001);
                    lv_elems_2_0=ruleELiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"elems",
                            		lv_elems_2_0, 
                            		"ELiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:920:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==12) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:920:4: otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSetLiteral2014); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:924:1: ( (lv_elems_4_0= ruleELiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:925:1: (lv_elems_4_0= ruleELiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:925:1: (lv_elems_4_0= ruleELiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:926:3: lv_elems_4_0= ruleELiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleELiteral_in_ruleSetLiteral2035);
                    	    lv_elems_4_0=ruleELiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_4_0, 
                    	            		"ELiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSetLiteral2051); 

                	newLeafNode(otherlv_5, grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleELiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:954:1: entryRuleELiteral returns [EObject current=null] : iv_ruleELiteral= ruleELiteral EOF ;
    public final EObject entryRuleELiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:955:2: (iv_ruleELiteral= ruleELiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:956:2: iv_ruleELiteral= ruleELiteral EOF
            {
             newCompositeNode(grammarAccess.getELiteralRule()); 
            pushFollow(FOLLOW_ruleELiteral_in_entryRuleELiteral2087);
            iv_ruleELiteral=ruleELiteral();

            state._fsp--;

             current =iv_ruleELiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleELiteral2097); 

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
    // $ANTLR end "entryRuleELiteral"


    // $ANTLR start "ruleELiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:963:1: ruleELiteral returns [EObject current=null] : ( (lv_lit_0_0= RULE_LIT ) ) ;
    public final EObject ruleELiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:966:28: ( ( (lv_lit_0_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:967:1: ( (lv_lit_0_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:967:1: ( (lv_lit_0_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:968:1: (lv_lit_0_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:968:1: (lv_lit_0_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:969:3: lv_lit_0_0= RULE_LIT
            {
            lv_lit_0_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleELiteral2138); 

            			newLeafNode(lv_lit_0_0, grammarAccess.getELiteralAccess().getLitLITTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getELiteralRule());
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
    // $ANTLR end "ruleELiteral"


    // $ANTLR start "entryRuleSubGroupDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:993:1: entryRuleSubGroupDecl returns [EObject current=null] : iv_ruleSubGroupDecl= ruleSubGroupDecl EOF ;
    public final EObject entryRuleSubGroupDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubGroupDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:994:2: (iv_ruleSubGroupDecl= ruleSubGroupDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:995:2: iv_ruleSubGroupDecl= ruleSubGroupDecl EOF
            {
             newCompositeNode(grammarAccess.getSubGroupDeclRule()); 
            pushFollow(FOLLOW_ruleSubGroupDecl_in_entryRuleSubGroupDecl2178);
            iv_ruleSubGroupDecl=ruleSubGroupDecl();

            state._fsp--;

             current =iv_ruleSubGroupDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubGroupDecl2188); 

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
    // $ANTLR end "entryRuleSubGroupDecl"


    // $ANTLR start "ruleSubGroupDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1002:1: ruleSubGroupDecl returns [EObject current=null] : ( ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleSubGroupType ) ) ) ;
    public final EObject ruleSubGroupDecl() throws RecognitionException {
        EObject current = null;

        Token lv_categoryName_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1005:28: ( ( ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleSubGroupType ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1006:1: ( ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleSubGroupType ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1006:1: ( ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleSubGroupType ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1006:2: ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleSubGroupType ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1006:2: ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==15) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==RULE_ID) ) {
                        int LA19_4 = input.LA(4);

                        if ( (LA19_4==11||(LA19_4>=15 && LA19_4<=16)) ) {
                            alt19=1;
                        }
                    }
                }
            }
            switch (alt19) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1006:3: ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1006:3: ( (lv_categoryName_0_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1007:1: (lv_categoryName_0_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1007:1: (lv_categoryName_0_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1008:3: lv_categoryName_0_0= RULE_ID
                    {
                    lv_categoryName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubGroupDecl2231); 

                    			newLeafNode(lv_categoryName_0_0, grammarAccess.getSubGroupDeclAccess().getCategoryNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubGroupDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"categoryName",
                            		lv_categoryName_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleSubGroupDecl2248); 

                        	newLeafNode(otherlv_1, grammarAccess.getSubGroupDeclAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1028:3: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1029:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1029:1: (lv_name_2_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1030:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubGroupDecl2267); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSubGroupDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubGroupDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1046:2: ( (lv_type_3_0= ruleSubGroupType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1047:1: (lv_type_3_0= ruleSubGroupType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1047:1: (lv_type_3_0= ruleSubGroupType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1048:3: lv_type_3_0= ruleSubGroupType
            {
             
            	        newCompositeNode(grammarAccess.getSubGroupDeclAccess().getTypeSubGroupTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSubGroupType_in_ruleSubGroupDecl2293);
            lv_type_3_0=ruleSubGroupType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubGroupDeclRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"SubGroupType");
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
    // $ANTLR end "ruleSubGroupDecl"


    // $ANTLR start "entryRuleSubGroupType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1072:1: entryRuleSubGroupType returns [EObject current=null] : iv_ruleSubGroupType= ruleSubGroupType EOF ;
    public final EObject entryRuleSubGroupType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubGroupType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1073:2: (iv_ruleSubGroupType= ruleSubGroupType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1074:2: iv_ruleSubGroupType= ruleSubGroupType EOF
            {
             newCompositeNode(grammarAccess.getSubGroupTypeRule()); 
            pushFollow(FOLLOW_ruleSubGroupType_in_entryRuleSubGroupType2329);
            iv_ruleSubGroupType=ruleSubGroupType();

            state._fsp--;

             current =iv_ruleSubGroupType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubGroupType2339); 

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
    // $ANTLR end "entryRuleSubGroupType"


    // $ANTLR start "ruleSubGroupType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1081:1: ruleSubGroupType returns [EObject current=null] : ( (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) ) | ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeatureGroupBody ) ) ) ) ;
    public final EObject ruleSubGroupType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1084:28: ( ( (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) ) | ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeatureGroupBody ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1085:1: ( (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) ) | ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeatureGroupBody ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1085:1: ( (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) ) | ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeatureGroupBody ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                alt22=1;
            }
            else if ( (LA22_0==11||LA22_0==16) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1085:2: (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1085:2: (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1085:4: otherlv_0= ':' () ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSubGroupType2377); 

                        	newLeafNode(otherlv_0, grammarAccess.getSubGroupTypeAccess().getColonKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1089:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1090:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSubGroupTypeAccess().getSubGroupTypeRefAction_0_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1095:2: ( (otherlv_2= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1096:1: (otherlv_2= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1096:1: (otherlv_2= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1097:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubGroupTypeRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubGroupType2406); 

                    		newLeafNode(otherlv_2, grammarAccess.getSubGroupTypeAccess().getTypeFeatureGroupDeclCrossReference_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1109:6: ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeatureGroupBody ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1109:6: ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeatureGroupBody ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1109:7: () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeatureGroupBody ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1109:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1110:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSubGroupTypeAccess().getSubGroupTypeAnonAction_1_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1115:2: (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==11) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1115:4: otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                            {
                            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleSubGroupType2436); 

                                	newLeafNode(otherlv_4, grammarAccess.getSubGroupTypeAccess().getLessThanSignColonKeyword_1_1_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1119:1: ( (otherlv_5= RULE_ID ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1120:1: (otherlv_5= RULE_ID )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1120:1: (otherlv_5= RULE_ID )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1121:3: otherlv_5= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getSubGroupTypeRule());
                            	        }
                                    
                            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubGroupType2456); 

                            		newLeafNode(otherlv_5, grammarAccess.getSubGroupTypeAccess().getSupersFeatureGroupDeclCrossReference_1_1_1_0()); 
                            	

                            }


                            }

                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1132:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==12) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1132:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                            	    {
                            	    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleSubGroupType2469); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getSubGroupTypeAccess().getCommaKeyword_1_1_2_0());
                            	        
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1136:1: ( (otherlv_7= RULE_ID ) )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1137:1: (otherlv_7= RULE_ID )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1137:1: (otherlv_7= RULE_ID )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1138:3: otherlv_7= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getSubGroupTypeRule());
                            	    	        }
                            	            
                            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubGroupType2489); 

                            	    		newLeafNode(otherlv_7, grammarAccess.getSubGroupTypeAccess().getSupersFeatureGroupDeclCrossReference_1_1_2_1_0()); 
                            	    	

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

                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleSubGroupType2505); 

                        	newLeafNode(otherlv_8, grammarAccess.getSubGroupTypeAccess().getEqualsSignKeyword_1_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1153:1: ( (lv_body_9_0= ruleFeatureGroupBody ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1154:1: (lv_body_9_0= ruleFeatureGroupBody )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1154:1: (lv_body_9_0= ruleFeatureGroupBody )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1155:3: lv_body_9_0= ruleFeatureGroupBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubGroupTypeAccess().getBodyFeatureGroupBodyParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureGroupBody_in_ruleSubGroupType2526);
                    lv_body_9_0=ruleFeatureGroupBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubGroupTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_9_0, 
                            		"FeatureGroupBody");
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
    // $ANTLR end "ruleSubGroupType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleModel130 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleDecl214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecl240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDecl265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecl291 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_ruleDecl309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecl329 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_12_in_ruleDecl342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecl362 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_ruleFeatureGroupBody_in_ruleDecl387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureGroupBody_in_entryRuleFeatureGroupBody424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureGroupBody434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFeatureGroupBody471 = new BitSet(new long[]{0x00000000001E4010L});
    public static final BitSet FOLLOW_ruleGroupElementDecl_in_ruleFeatureGroupBody501 = new BitSet(new long[]{0x00000000001E4010L});
    public static final BitSet FOLLOW_14_in_ruleFeatureGroupBody514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElementDecl_in_entryRuleGroupElementDecl550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElementDecl560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupAttrDecl_in_ruleGroupElementDecl607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubGroupDecl_in_ruleGroupElementDecl634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupAttrDecl_in_entryRuleGroupAttrDecl669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupAttrDecl679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleGroupAttrDecl725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGroupAttrDecl742 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleGroupAttrDecl761 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleType_in_ruleGroupAttrDecl782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGroupAttrDecl802 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleGroupAttrDecl823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleModifier911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModifier930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModifier949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleModifier968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType1073 = new BitSet(new long[]{0x0000000000202002L});
    public static final BitSet FOLLOW_21_in_ruleType1096 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleType1108 = new BitSet(new long[]{0x0000000000202002L});
    public static final BitSet FOLLOW_13_in_ruleType1137 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleType1149 = new BitSet(new long[]{0x0000000000202002L});
    public static final BitSet FOLLOW_23_in_ruleType1172 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType1202 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleType1215 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType1236 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleType1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_ruleLiteral1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_ruleLiteral1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_ruleLiteral1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleLiteral1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicLiteral1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicLiteral1515 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleBasicLiteral1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteral1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTupleLiteral1620 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral1651 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_12_in_ruleTupleLiteral1664 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral1685 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_25_in_ruleTupleLiteral1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListLiteral1792 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleListLiteral1804 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleELiteral_in_ruleListLiteral1826 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12_in_ruleListLiteral1839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleELiteral_in_ruleListLiteral1860 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22_in_ruleListLiteral1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetLiteral1967 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSetLiteral1979 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleELiteral_in_ruleSetLiteral2001 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleSetLiteral2014 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleELiteral_in_ruleSetLiteral2035 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleSetLiteral2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_entryRuleELiteral2087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleELiteral2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleELiteral2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubGroupDecl_in_entryRuleSubGroupDecl2178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubGroupDecl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubGroupDecl2231 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSubGroupDecl2248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubGroupDecl2267 = new BitSet(new long[]{0x0000000000018800L});
    public static final BitSet FOLLOW_ruleSubGroupType_in_ruleSubGroupDecl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubGroupType_in_entryRuleSubGroupType2329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubGroupType2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSubGroupType2377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubGroupType2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSubGroupType2436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubGroupType2456 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleSubGroupType2469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubGroupType2489 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleSubGroupType2505 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ruleFeatureGroupBody_in_ruleSubGroupType2526 = new BitSet(new long[]{0x0000000000000002L});

}