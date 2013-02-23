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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NAT", "RULE_LIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'type'", "'<:'", "','", "'{'", "'}'", "'complete'", "'features'", "'inv'", "':'", "'..'", "'distinct'", "'.'", "'*'", "'='", "'const'", "'val'", "'var'", "'def'", "'['", "']'", "'<'", "'>'"
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
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
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

                if ( (LA1_0==10||(LA1_0>=15 && LA1_0<=16)) ) {
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:115:1: ruleDecl returns [EObject current=null] : (this_TypeDecl_0= ruleTypeDecl | this_FeaturesDecl_1= ruleFeaturesDecl ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDecl_0 = null;

        EObject this_FeaturesDecl_1 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:118:28: ( (this_TypeDecl_0= ruleTypeDecl | this_FeaturesDecl_1= ruleFeaturesDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:1: (this_TypeDecl_0= ruleTypeDecl | this_FeaturesDecl_1= ruleFeaturesDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:1: (this_TypeDecl_0= ruleTypeDecl | this_FeaturesDecl_1= ruleFeaturesDecl )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                alt2=2;
            }
            else {
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:130:5: this_FeaturesDecl_1= ruleFeaturesDecl
                    {
                     
                            newCompositeNode(grammarAccess.getDeclAccess().getFeaturesDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFeaturesDecl_in_ruleDecl250);
                    this_FeaturesDecl_1=ruleFeaturesDecl();

                    state._fsp--;

                     
                            current = this_FeaturesDecl_1; 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:146:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:147:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:148:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl285);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl295); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:155:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= '{' ( ( (lv_elems_7_0= ruleELiteral ) ) (otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) ) )* )? otherlv_10= '}' )? ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_elems_7_0 = null;

        EObject lv_elems_9_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:158:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= '{' ( ( (lv_elems_7_0= ruleELiteral ) ) (otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) ) )* )? otherlv_10= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= '{' ( ( (lv_elems_7_0= ruleELiteral ) ) (otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) ) )* )? otherlv_10= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= '{' ( ( (lv_elems_7_0= ruleELiteral ) ) (otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) ) )* )? otherlv_10= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= '{' ( ( (lv_elems_7_0= ruleELiteral ) ) (otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) ) )* )? otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleTypeDecl332); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:163:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:164:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:164:1: (lv_name_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:165:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl349); 

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:181:2: (otherlv_2= '<:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:181:4: otherlv_2= '<:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleTypeDecl367); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getLessThanSignColonKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:185:1: ( (otherlv_3= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:186:1: (otherlv_3= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:186:1: (otherlv_3= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:187:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDeclRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl387); 

                    		newLeafNode(otherlv_3, grammarAccess.getTypeDeclAccess().getSupersTypeDeclCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:198:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:198:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleTypeDecl400); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:202:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:203:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:203:1: (otherlv_5= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:204:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTypeDeclRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl420); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getTypeDeclAccess().getSupersTypeDeclCrossReference_2_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:215:6: (otherlv_6= '{' ( ( (lv_elems_7_0= ruleELiteral ) ) (otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) ) )* )? otherlv_10= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:215:8: otherlv_6= '{' ( ( (lv_elems_7_0= ruleELiteral ) ) (otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) ) )* )? otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleTypeDecl437); 

                        	newLeafNode(otherlv_6, grammarAccess.getTypeDeclAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:219:1: ( ( (lv_elems_7_0= ruleELiteral ) ) (otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_LIT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:219:2: ( (lv_elems_7_0= ruleELiteral ) ) (otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) ) )*
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:219:2: ( (lv_elems_7_0= ruleELiteral ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:220:1: (lv_elems_7_0= ruleELiteral )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:220:1: (lv_elems_7_0= ruleELiteral )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:221:3: lv_elems_7_0= ruleELiteral
                            {
                             
                            	        newCompositeNode(grammarAccess.getTypeDeclAccess().getElemsELiteralParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleELiteral_in_ruleTypeDecl459);
                            lv_elems_7_0=ruleELiteral();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTypeDeclRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"elems",
                                    		lv_elems_7_0, 
                                    		"ELiteral");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:237:2: (otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==12) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:237:4: otherlv_8= ',' ( (lv_elems_9_0= ruleELiteral ) )
                            	    {
                            	    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleTypeDecl472); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getTypeDeclAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:241:1: ( (lv_elems_9_0= ruleELiteral ) )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:242:1: (lv_elems_9_0= ruleELiteral )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:242:1: (lv_elems_9_0= ruleELiteral )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:243:3: lv_elems_9_0= ruleELiteral
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getTypeDeclAccess().getElemsELiteralParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleELiteral_in_ruleTypeDecl493);
                            	    lv_elems_9_0=ruleELiteral();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getTypeDeclRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"elems",
                            	            		lv_elems_9_0, 
                            	            		"ELiteral");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleTypeDecl509); 

                        	newLeafNode(otherlv_10, grammarAccess.getTypeDeclAccess().getRightCurlyBracketKeyword_3_2());
                        

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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleFeaturesDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:271:1: entryRuleFeaturesDecl returns [EObject current=null] : iv_ruleFeaturesDecl= ruleFeaturesDecl EOF ;
    public final EObject entryRuleFeaturesDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeaturesDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:272:2: (iv_ruleFeaturesDecl= ruleFeaturesDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:273:2: iv_ruleFeaturesDecl= ruleFeaturesDecl EOF
            {
             newCompositeNode(grammarAccess.getFeaturesDeclRule()); 
            pushFollow(FOLLOW_ruleFeaturesDecl_in_entryRuleFeaturesDecl547);
            iv_ruleFeaturesDecl=ruleFeaturesDecl();

            state._fsp--;

             current =iv_ruleFeaturesDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeaturesDecl557); 

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
    // $ANTLR end "entryRuleFeaturesDecl"


    // $ANTLR start "ruleFeaturesDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:280:1: ruleFeaturesDecl returns [EObject current=null] : ( ( (lv_complete_0_0= 'complete' ) )? otherlv_1= 'features' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ( (lv_body_7_0= ruleFeaturesBody ) ) ) ;
    public final EObject ruleFeaturesDecl() throws RecognitionException {
        EObject current = null;

        Token lv_complete_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:283:28: ( ( ( (lv_complete_0_0= 'complete' ) )? otherlv_1= 'features' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ( (lv_body_7_0= ruleFeaturesBody ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:1: ( ( (lv_complete_0_0= 'complete' ) )? otherlv_1= 'features' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ( (lv_body_7_0= ruleFeaturesBody ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:1: ( ( (lv_complete_0_0= 'complete' ) )? otherlv_1= 'features' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ( (lv_body_7_0= ruleFeaturesBody ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:2: ( (lv_complete_0_0= 'complete' ) )? otherlv_1= 'features' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ( (lv_body_7_0= ruleFeaturesBody ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:2: ( (lv_complete_0_0= 'complete' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:285:1: (lv_complete_0_0= 'complete' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:285:1: (lv_complete_0_0= 'complete' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:286:3: lv_complete_0_0= 'complete'
                    {
                    lv_complete_0_0=(Token)match(input,15,FOLLOW_15_in_ruleFeaturesDecl600); 

                            newLeafNode(lv_complete_0_0, grammarAccess.getFeaturesDeclAccess().getCompleteCompleteKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeaturesDeclRule());
                    	        }
                           		setWithLastConsumed(current, "complete", lv_complete_0_0, "complete");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleFeaturesDecl626); 

                	newLeafNode(otherlv_1, grammarAccess.getFeaturesDeclAccess().getFeaturesKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:303:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:304:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:304:1: (lv_name_2_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:305:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeaturesDecl643); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFeaturesDeclAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeaturesDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:321:2: (otherlv_3= '<:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:321:4: otherlv_3= '<:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleFeaturesDecl661); 

                        	newLeafNode(otherlv_3, grammarAccess.getFeaturesDeclAccess().getLessThanSignColonKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:325:1: ( (otherlv_4= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:326:1: (otherlv_4= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:326:1: (otherlv_4= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:327:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeaturesDeclRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeaturesDecl681); 

                    		newLeafNode(otherlv_4, grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclCrossReference_3_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:338:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==12) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:338:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleFeaturesDecl694); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFeaturesDeclAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:342:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:343:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:343:1: (otherlv_6= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:344:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFeaturesDeclRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeaturesDecl714); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclCrossReference_3_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:355:6: ( (lv_body_7_0= ruleFeaturesBody ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:356:1: (lv_body_7_0= ruleFeaturesBody )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:356:1: (lv_body_7_0= ruleFeaturesBody )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:357:3: lv_body_7_0= ruleFeaturesBody
            {
             
            	        newCompositeNode(grammarAccess.getFeaturesDeclAccess().getBodyFeaturesBodyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFeaturesBody_in_ruleFeaturesDecl739);
            lv_body_7_0=ruleFeaturesBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeaturesDeclRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_7_0, 
                    		"FeaturesBody");
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
    // $ANTLR end "ruleFeaturesDecl"


    // $ANTLR start "entryRuleFeaturesBody"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:381:1: entryRuleFeaturesBody returns [EObject current=null] : iv_ruleFeaturesBody= ruleFeaturesBody EOF ;
    public final EObject entryRuleFeaturesBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeaturesBody = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:382:2: (iv_ruleFeaturesBody= ruleFeaturesBody EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:383:2: iv_ruleFeaturesBody= ruleFeaturesBody EOF
            {
             newCompositeNode(grammarAccess.getFeaturesBodyRule()); 
            pushFollow(FOLLOW_ruleFeaturesBody_in_entryRuleFeaturesBody775);
            iv_ruleFeaturesBody=ruleFeaturesBody();

            state._fsp--;

             current =iv_ruleFeaturesBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeaturesBody785); 

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
    // $ANTLR end "entryRuleFeaturesBody"


    // $ANTLR start "ruleFeaturesBody"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:390:1: ruleFeaturesBody returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_features_2_0= ruleFeatureDecl ) )* otherlv_3= '}' )? ) ;
    public final EObject ruleFeaturesBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_features_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:393:28: ( ( () (otherlv_1= '{' ( (lv_features_2_0= ruleFeatureDecl ) )* otherlv_3= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:394:1: ( () (otherlv_1= '{' ( (lv_features_2_0= ruleFeatureDecl ) )* otherlv_3= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:394:1: ( () (otherlv_1= '{' ( (lv_features_2_0= ruleFeatureDecl ) )* otherlv_3= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:394:2: () (otherlv_1= '{' ( (lv_features_2_0= ruleFeatureDecl ) )* otherlv_3= '}' )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:394:2: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:395:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeaturesBodyAccess().getFeaturesBodyAction_0(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:400:2: (otherlv_1= '{' ( (lv_features_2_0= ruleFeatureDecl ) )* otherlv_3= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:400:4: otherlv_1= '{' ( (lv_features_2_0= ruleFeatureDecl ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleFeaturesBody832); 

                        	newLeafNode(otherlv_1, grammarAccess.getFeaturesBodyAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:404:1: ( (lv_features_2_0= ruleFeatureDecl ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==17||(LA11_0>=24 && LA11_0<=27)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:405:1: (lv_features_2_0= ruleFeatureDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:405:1: (lv_features_2_0= ruleFeatureDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:406:3: lv_features_2_0= ruleFeatureDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeaturesBodyAccess().getFeaturesFeatureDeclParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFeatureDecl_in_ruleFeaturesBody853);
                    	    lv_features_2_0=ruleFeatureDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeaturesBodyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_2_0, 
                    	            		"FeatureDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleFeaturesBody866); 

                        	newLeafNode(otherlv_3, grammarAccess.getFeaturesBodyAccess().getRightCurlyBracketKeyword_1_2());
                        

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
    // $ANTLR end "ruleFeaturesBody"


    // $ANTLR start "entryRuleFeatureDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:434:1: entryRuleFeatureDecl returns [EObject current=null] : iv_ruleFeatureDecl= ruleFeatureDecl EOF ;
    public final EObject entryRuleFeatureDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:435:2: (iv_ruleFeatureDecl= ruleFeatureDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:436:2: iv_ruleFeatureDecl= ruleFeatureDecl EOF
            {
             newCompositeNode(grammarAccess.getFeatureDeclRule()); 
            pushFollow(FOLLOW_ruleFeatureDecl_in_entryRuleFeatureDecl904);
            iv_ruleFeatureDecl=ruleFeatureDecl();

            state._fsp--;

             current =iv_ruleFeatureDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureDecl914); 

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
    // $ANTLR end "entryRuleFeatureDecl"


    // $ANTLR start "ruleFeatureDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:443:1: ruleFeatureDecl returns [EObject current=null] : (this_InvariantDecl_0= ruleInvariantDecl | this_AttrDecl_1= ruleAttrDecl | this_SubFeaturesDecl_2= ruleSubFeaturesDecl ) ;
    public final EObject ruleFeatureDecl() throws RecognitionException {
        EObject current = null;

        EObject this_InvariantDecl_0 = null;

        EObject this_AttrDecl_1 = null;

        EObject this_SubFeaturesDecl_2 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:446:28: ( (this_InvariantDecl_0= ruleInvariantDecl | this_AttrDecl_1= ruleAttrDecl | this_SubFeaturesDecl_2= ruleSubFeaturesDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:447:1: (this_InvariantDecl_0= ruleInvariantDecl | this_AttrDecl_1= ruleAttrDecl | this_SubFeaturesDecl_2= ruleSubFeaturesDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:447:1: (this_InvariantDecl_0= ruleInvariantDecl | this_AttrDecl_1= ruleAttrDecl | this_SubFeaturesDecl_2= ruleSubFeaturesDecl )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt13=1;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:448:5: this_InvariantDecl_0= ruleInvariantDecl
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureDeclAccess().getInvariantDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInvariantDecl_in_ruleFeatureDecl961);
                    this_InvariantDecl_0=ruleInvariantDecl();

                    state._fsp--;

                     
                            current = this_InvariantDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:458:5: this_AttrDecl_1= ruleAttrDecl
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureDeclAccess().getAttrDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttrDecl_in_ruleFeatureDecl988);
                    this_AttrDecl_1=ruleAttrDecl();

                    state._fsp--;

                     
                            current = this_AttrDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:468:5: this_SubFeaturesDecl_2= ruleSubFeaturesDecl
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureDeclAccess().getSubFeaturesDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSubFeaturesDecl_in_ruleFeatureDecl1015);
                    this_SubFeaturesDecl_2=ruleSubFeaturesDecl();

                    state._fsp--;

                     
                            current = this_SubFeaturesDecl_2; 
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
    // $ANTLR end "ruleFeatureDecl"


    // $ANTLR start "entryRuleInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:484:1: entryRuleInvariantDecl returns [EObject current=null] : iv_ruleInvariantDecl= ruleInvariantDecl EOF ;
    public final EObject entryRuleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:485:2: (iv_ruleInvariantDecl= ruleInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:486:2: iv_ruleInvariantDecl= ruleInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl1050);
            iv_ruleInvariantDecl=ruleInvariantDecl();

            state._fsp--;

             current =iv_ruleInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariantDecl1060); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:493:1: ruleInvariantDecl returns [EObject current=null] : this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl ;
    public final EObject ruleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicityInvariantDecl_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:496:28: (this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:498:5: this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl
            {
             
                    newCompositeNode(grammarAccess.getInvariantDeclAccess().getMultiplicityInvariantDeclParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMultiplicityInvariantDecl_in_ruleInvariantDecl1106);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:514:1: entryRuleMultiplicityInvariantDecl returns [EObject current=null] : iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF ;
    public final EObject entryRuleMultiplicityInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:515:2: (iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:516:2: iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleMultiplicityInvariantDecl_in_entryRuleMultiplicityInvariantDecl1140);
            iv_ruleMultiplicityInvariantDecl=ruleMultiplicityInvariantDecl();

            state._fsp--;

             current =iv_ruleMultiplicityInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityInvariantDecl1150); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:523:1: ruleMultiplicityInvariantDecl returns [EObject current=null] : (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubFeaturesMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:526:28: ( (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubFeaturesMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:527:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubFeaturesMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:527:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubFeaturesMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:527:3: otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubFeaturesMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleMultiplicityInvariantDecl1187); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiplicityInvariantDeclAccess().getInvKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:531:1: ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:531:2: ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:531:2: ( (lv_invName_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:532:1: (lv_invName_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:532:1: (lv_invName_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:533:3: lv_invName_1_0= RULE_ID
                    {
                    lv_invName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1205); 

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

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMultiplicityInvariantDecl1222); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:553:3: ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:553:4: ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:553:4: ( (lv_lo_3_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:554:1: (lv_lo_3_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:554:1: (lv_lo_3_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:555:3: lv_lo_3_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getLoConstraintNatParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1246);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMultiplicityInvariantDecl1258); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiplicityInvariantDeclAccess().getFullStopFullStopKeyword_2_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:575:1: ( (lv_hi_5_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:576:1: (lv_hi_5_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:576:1: (lv_hi_5_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:577:3: lv_hi_5_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getHiConstraintNatParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1279);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:593:3: ( (lv_match_6_0= ruleSubFeaturesMatch ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:594:1: (lv_match_6_0= ruleSubFeaturesMatch )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:594:1: (lv_match_6_0= ruleSubFeaturesMatch )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:595:3: lv_match_6_0= ruleSubFeaturesMatch
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchSubFeaturesMatchParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSubFeaturesMatch_in_ruleMultiplicityInvariantDecl1301);
            lv_match_6_0=ruleSubFeaturesMatch();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicityInvariantDeclRule());
            	        }
                   		set(
                   			current, 
                   			"match",
                    		lv_match_6_0, 
                    		"SubFeaturesMatch");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:611:2: (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:611:4: otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleMultiplicityInvariantDecl1314); 

                        	newLeafNode(otherlv_7, grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:615:1: ( (otherlv_8= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:616:1: (otherlv_8= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:616:1: (otherlv_8= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:617:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityInvariantDeclRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1334); 

                    		newLeafNode(otherlv_8, grammarAccess.getMultiplicityInvariantDeclAccess().getTypeFeaturesDeclCrossReference_4_1_0()); 
                    	

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


    // $ANTLR start "entryRuleSubFeaturesMatch"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:636:1: entryRuleSubFeaturesMatch returns [EObject current=null] : iv_ruleSubFeaturesMatch= ruleSubFeaturesMatch EOF ;
    public final EObject entryRuleSubFeaturesMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubFeaturesMatch = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:637:2: (iv_ruleSubFeaturesMatch= ruleSubFeaturesMatch EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:638:2: iv_ruleSubFeaturesMatch= ruleSubFeaturesMatch EOF
            {
             newCompositeNode(grammarAccess.getSubFeaturesMatchRule()); 
            pushFollow(FOLLOW_ruleSubFeaturesMatch_in_entryRuleSubFeaturesMatch1372);
            iv_ruleSubFeaturesMatch=ruleSubFeaturesMatch();

            state._fsp--;

             current =iv_ruleSubFeaturesMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubFeaturesMatch1382); 

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
    // $ANTLR end "entryRuleSubFeaturesMatch"


    // $ANTLR start "ruleSubFeaturesMatch"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:645:1: ruleSubFeaturesMatch returns [EObject current=null] : ( () ( (lv_distinct_1_0= 'distinct' ) )? ( ( (lv_categoryNames_2_0= RULE_ID ) ) otherlv_3= '.' )* ( ( (lv_name_4_0= RULE_ID ) ) | ( (lv_any_5_0= '*' ) ) ) ) ;
    public final EObject ruleSubFeaturesMatch() throws RecognitionException {
        EObject current = null;

        Token lv_distinct_1_0=null;
        Token lv_categoryNames_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_any_5_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:648:28: ( ( () ( (lv_distinct_1_0= 'distinct' ) )? ( ( (lv_categoryNames_2_0= RULE_ID ) ) otherlv_3= '.' )* ( ( (lv_name_4_0= RULE_ID ) ) | ( (lv_any_5_0= '*' ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:649:1: ( () ( (lv_distinct_1_0= 'distinct' ) )? ( ( (lv_categoryNames_2_0= RULE_ID ) ) otherlv_3= '.' )* ( ( (lv_name_4_0= RULE_ID ) ) | ( (lv_any_5_0= '*' ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:649:1: ( () ( (lv_distinct_1_0= 'distinct' ) )? ( ( (lv_categoryNames_2_0= RULE_ID ) ) otherlv_3= '.' )* ( ( (lv_name_4_0= RULE_ID ) ) | ( (lv_any_5_0= '*' ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:649:2: () ( (lv_distinct_1_0= 'distinct' ) )? ( ( (lv_categoryNames_2_0= RULE_ID ) ) otherlv_3= '.' )* ( ( (lv_name_4_0= RULE_ID ) ) | ( (lv_any_5_0= '*' ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:649:2: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:650:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubFeaturesMatchAccess().getSubFeaturesMatchAction_0(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:655:2: ( (lv_distinct_1_0= 'distinct' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:656:1: (lv_distinct_1_0= 'distinct' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:656:1: (lv_distinct_1_0= 'distinct' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:657:3: lv_distinct_1_0= 'distinct'
                    {
                    lv_distinct_1_0=(Token)match(input,20,FOLLOW_20_in_ruleSubFeaturesMatch1434); 

                            newLeafNode(lv_distinct_1_0, grammarAccess.getSubFeaturesMatchAccess().getDistinctDistinctKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubFeaturesMatchRule());
                    	        }
                           		setWithLastConsumed(current, "distinct", lv_distinct_1_0, "distinct");
                    	    

                    }


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:670:3: ( ( (lv_categoryNames_2_0= RULE_ID ) ) otherlv_3= '.' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==21) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:670:4: ( (lv_categoryNames_2_0= RULE_ID ) ) otherlv_3= '.'
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:670:4: ( (lv_categoryNames_2_0= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:671:1: (lv_categoryNames_2_0= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:671:1: (lv_categoryNames_2_0= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:672:3: lv_categoryNames_2_0= RULE_ID
            	    {
            	    lv_categoryNames_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubFeaturesMatch1466); 

            	    			newLeafNode(lv_categoryNames_2_0, grammarAccess.getSubFeaturesMatchAccess().getCategoryNamesIDTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubFeaturesMatchRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"categoryNames",
            	            		lv_categoryNames_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleSubFeaturesMatch1483); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSubFeaturesMatchAccess().getFullStopKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:692:3: ( ( (lv_name_4_0= RULE_ID ) ) | ( (lv_any_5_0= '*' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==22) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:692:4: ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:692:4: ( (lv_name_4_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:693:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:693:1: (lv_name_4_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:694:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubFeaturesMatch1503); 

                    			newLeafNode(lv_name_4_0, grammarAccess.getSubFeaturesMatchAccess().getNameIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubFeaturesMatchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_4_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:711:6: ( (lv_any_5_0= '*' ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:711:6: ( (lv_any_5_0= '*' ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:712:1: (lv_any_5_0= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:712:1: (lv_any_5_0= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:713:3: lv_any_5_0= '*'
                    {
                    lv_any_5_0=(Token)match(input,22,FOLLOW_22_in_ruleSubFeaturesMatch1532); 

                            newLeafNode(lv_any_5_0, grammarAccess.getSubFeaturesMatchAccess().getAnyAsteriskKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubFeaturesMatchRule());
                    	        }
                           		setWithLastConsumed(current, "any", lv_any_5_0, "*");
                    	    

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
    // $ANTLR end "ruleSubFeaturesMatch"


    // $ANTLR start "entryRuleConstraintNat"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:734:1: entryRuleConstraintNat returns [EObject current=null] : iv_ruleConstraintNat= ruleConstraintNat EOF ;
    public final EObject entryRuleConstraintNat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintNat = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:735:2: (iv_ruleConstraintNat= ruleConstraintNat EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:736:2: iv_ruleConstraintNat= ruleConstraintNat EOF
            {
             newCompositeNode(grammarAccess.getConstraintNatRule()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat1582);
            iv_ruleConstraintNat=ruleConstraintNat();

            state._fsp--;

             current =iv_ruleConstraintNat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintNat1592); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:743:1: ruleConstraintNat returns [EObject current=null] : ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) ;
    public final EObject ruleConstraintNat() throws RecognitionException {
        EObject current = null;

        Token lv_num_1_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:746:28: ( ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:747:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:747:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_NAT) ) {
                alt19=1;
            }
            else if ( (LA19_0==22) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:747:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:747:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:747:3: () ( (lv_num_1_0= RULE_NAT ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:747:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:748:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getNumNatConstraintAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:753:2: ( (lv_num_1_0= RULE_NAT ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:754:1: (lv_num_1_0= RULE_NAT )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:754:1: (lv_num_1_0= RULE_NAT )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:755:3: lv_num_1_0= RULE_NAT
                    {
                    lv_num_1_0=(Token)match(input,RULE_NAT,FOLLOW_RULE_NAT_in_ruleConstraintNat1644); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:772:6: ( () otherlv_3= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:772:6: ( () otherlv_3= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:772:7: () otherlv_3= '*'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:772:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:773:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getAnyNatConstraintAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleConstraintNat1678); 

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


    // $ANTLR start "entryRuleAttrDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:790:1: entryRuleAttrDecl returns [EObject current=null] : iv_ruleAttrDecl= ruleAttrDecl EOF ;
    public final EObject entryRuleAttrDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:791:2: (iv_ruleAttrDecl= ruleAttrDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:792:2: iv_ruleAttrDecl= ruleAttrDecl EOF
            {
             newCompositeNode(grammarAccess.getAttrDeclRule()); 
            pushFollow(FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl1715);
            iv_ruleAttrDecl=ruleAttrDecl();

            state._fsp--;

             current =iv_ruleAttrDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrDecl1725); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:799:1: ruleAttrDecl returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) ) ) ) ;
    public final EObject ruleAttrDecl() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_modifier_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_literal_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:802:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:803:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:803:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:803:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:803:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:804:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:804:1: (lv_modifier_0_0= ruleModifier )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:805:3: lv_modifier_0_0= ruleModifier
            {
             
            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModifier_in_ruleAttrDecl1771);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:821:2: ( (lv_attributeName_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:822:1: (lv_attributeName_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:822:1: (lv_attributeName_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:823:3: lv_attributeName_1_0= RULE_ID
            {
            lv_attributeName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttrDecl1788); 

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:839:2: ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            else if ( (LA20_0==23) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:839:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:839:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:839:5: otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAttrDecl1807); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttrDeclAccess().getColonKeyword_2_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:843:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:844:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:844:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:845:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAttrDecl1828);
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


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:862:6: (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:862:6: (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:862:8: otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleAttrDecl1848); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:866:1: ( (lv_literal_5_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:867:1: (lv_literal_5_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:867:1: (lv_literal_5_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:868:3: lv_literal_5_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl1869);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:892:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:893:2: (iv_ruleModifier= ruleModifier EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:894:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier1908);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier1919); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:901:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:904:28: ( (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:905:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:905:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt21=1;
                }
                break;
            case 25:
                {
                alt21=2;
                }
                break;
            case 26:
                {
                alt21=3;
                }
                break;
            case 27:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:906:2: kw= 'const'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleModifier1957); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getConstKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:913:2: kw= 'val'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleModifier1976); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getValKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:920:2: kw= 'var'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleModifier1995); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getVarKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:927:2: kw= 'def'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleModifier2014); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:940:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:941:2: (iv_ruleType= ruleType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:942:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2054);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2064); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:949:1: ruleType returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* ) | (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:952:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* ) | (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:953:1: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* ) | (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:953:1: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* ) | (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==30) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:953:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:953:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )* )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:953:3: () ( (otherlv_1= RULE_ID ) ) ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:953:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:954:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getBasicTypeAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:959:2: ( (otherlv_1= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:960:1: (otherlv_1= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:960:1: (otherlv_1= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:961:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType2119); 

                    		newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getBaseTypeTypeDeclCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:972:2: ( ( () otherlv_3= '[' otherlv_4= ']' ) | ( () otherlv_6= '{' otherlv_7= '}' ) )*
                    loop22:
                    do {
                        int alt22=3;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==28) ) {
                            alt22=1;
                        }
                        else if ( (LA22_0==13) ) {
                            alt22=2;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:972:3: ( () otherlv_3= '[' otherlv_4= ']' )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:972:3: ( () otherlv_3= '[' otherlv_4= ']' )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:972:4: () otherlv_3= '[' otherlv_4= ']'
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:972:4: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:973:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getTypeAccess().getListTypeBaseAction_0_2_0_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleType2142); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_2_0_1());
                    	        
                    	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleType2154); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2_0_2());
                    	        

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:987:6: ( () otherlv_6= '{' otherlv_7= '}' )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:987:6: ( () otherlv_6= '{' otherlv_7= '}' )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:987:7: () otherlv_6= '{' otherlv_7= '}'
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:987:7: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:988:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getTypeAccess().getSetTypeBaseAction_0_2_1_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleType2183); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_0_2_1_1());
                    	        
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleType2195); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_0_2_1_2());
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1002:6: (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1002:6: (otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1002:8: otherlv_8= '<' () ( (lv_elemTypes_10_0= ruleType ) ) (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+ otherlv_13= '>'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleType2218); 

                        	newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1006:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1007:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getTupleTypeAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1012:2: ( (lv_elemTypes_10_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1013:1: (lv_elemTypes_10_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1013:1: (lv_elemTypes_10_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1014:3: lv_elemTypes_10_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType2248);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1030:2: (otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==22) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1030:4: otherlv_11= '*' ( (lv_elemTypes_12_0= ruleType ) )
                    	    {
                    	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleType2261); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getTypeAccess().getAsteriskKeyword_1_3_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1034:1: ( (lv_elemTypes_12_0= ruleType ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1035:1: (lv_elemTypes_12_0= ruleType )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1035:1: (lv_elemTypes_12_0= ruleType )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1036:3: lv_elemTypes_12_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleType2282);
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
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    otherlv_13=(Token)match(input,31,FOLLOW_31_in_ruleType2296); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1064:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1065:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1066:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2333);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2343); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1073:1: ruleLiteral returns [EObject current=null] : (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BasicLiteral_0 = null;

        EObject this_TupleLiteral_1 = null;

        EObject this_ListLiteral_2 = null;

        EObject this_SetLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1076:28: ( (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1077:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1077:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral )
            int alt25=4;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt25=4;
                    }
                    break;
                case 28:
                    {
                    alt25=3;
                    }
                    break;
                case RULE_LIT:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA25_0==30) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1078:5: this_BasicLiteral_0= ruleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicLiteral_in_ruleLiteral2390);
                    this_BasicLiteral_0=ruleBasicLiteral();

                    state._fsp--;

                     
                            current = this_BasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1088:5: this_TupleLiteral_1= ruleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleLiteral_in_ruleLiteral2417);
                    this_TupleLiteral_1=ruleTupleLiteral();

                    state._fsp--;

                     
                            current = this_TupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1098:5: this_ListLiteral_2= ruleListLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleListLiteral_in_ruleLiteral2444);
                    this_ListLiteral_2=ruleListLiteral();

                    state._fsp--;

                     
                            current = this_ListLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1108:5: this_SetLiteral_3= ruleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleLiteral2471);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1124:1: entryRuleBasicLiteral returns [EObject current=null] : iv_ruleBasicLiteral= ruleBasicLiteral EOF ;
    public final EObject entryRuleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1125:2: (iv_ruleBasicLiteral= ruleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1126:2: iv_ruleBasicLiteral= ruleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral2506);
            iv_ruleBasicLiteral=ruleBasicLiteral();

            state._fsp--;

             current =iv_ruleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicLiteral2516); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1133:1: ruleBasicLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) ;
    public final EObject ruleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lit_1_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1136:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1137:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1137:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1137:2: ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1137:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1138:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1138:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1139:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicLiteral2561); 

            		newLeafNode(otherlv_0, grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1150:2: ( (lv_lit_1_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1151:1: (lv_lit_1_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1151:1: (lv_lit_1_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1152:3: lv_lit_1_0= RULE_LIT
            {
            lv_lit_1_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleBasicLiteral2578); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1176:1: entryRuleTupleLiteral returns [EObject current=null] : iv_ruleTupleLiteral= ruleTupleLiteral EOF ;
    public final EObject entryRuleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1177:2: (iv_ruleTupleLiteral= ruleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1178:2: iv_ruleTupleLiteral= ruleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral2619);
            iv_ruleTupleLiteral=ruleTupleLiteral();

            state._fsp--;

             current =iv_ruleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteral2629); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1185:1: ruleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1188:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1189:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1189:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1189:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleTupleLiteral2666); 

                	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1193:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1194:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1199:2: ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1199:3: ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1199:3: ( (lv_elems_2_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1200:1: (lv_elems_2_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1200:1: (lv_elems_2_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1201:3: lv_elems_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral2697);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1217:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==12) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1217:4: otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleTupleLiteral2710); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1221:1: ( (lv_elems_4_0= ruleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1222:1: (lv_elems_4_0= ruleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1222:1: (lv_elems_4_0= ruleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1223:3: lv_elems_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral2731);
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
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleTupleLiteral2747); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1251:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1252:2: (iv_ruleListLiteral= ruleListLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1253:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
             newCompositeNode(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral2783);
            iv_ruleListLiteral=ruleListLiteral();

            state._fsp--;

             current =iv_ruleListLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral2793); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1260:1: ruleListLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= ']' ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1263:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1264:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1264:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1264:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= ']'
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1264:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1265:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1265:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1266:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getListLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListLiteral2838); 

            		newLeafNode(otherlv_0, grammarAccess.getListLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleListLiteral2850); 

                	newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1281:1: ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_LIT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1281:2: ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1281:2: ( (lv_elems_2_0= ruleELiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1282:1: (lv_elems_2_0= ruleELiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1282:1: (lv_elems_2_0= ruleELiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1283:3: lv_elems_2_0= ruleELiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleELiteral_in_ruleListLiteral2872);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1299:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==12) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1299:4: otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleListLiteral2885); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1303:1: ( (lv_elems_4_0= ruleELiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1304:1: (lv_elems_4_0= ruleELiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1304:1: (lv_elems_4_0= ruleELiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1305:3: lv_elems_4_0= ruleELiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleELiteral_in_ruleListLiteral2906);
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
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleListLiteral2922); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1333:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1334:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1335:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral2958);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;

             current =iv_ruleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral2968); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1342:1: ruleSetLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= '}' ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1345:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1346:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1346:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1346:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )? otherlv_5= '}'
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1346:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1347:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1347:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1348:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSetLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetLiteral3013); 

            		newLeafNode(otherlv_0, grammarAccess.getSetLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleSetLiteral3025); 

                	newLeafNode(otherlv_1, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1363:1: ( ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_LIT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1363:2: ( (lv_elems_2_0= ruleELiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1363:2: ( (lv_elems_2_0= ruleELiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1364:1: (lv_elems_2_0= ruleELiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1364:1: (lv_elems_2_0= ruleELiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1365:3: lv_elems_2_0= ruleELiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleELiteral_in_ruleSetLiteral3047);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1381:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==12) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1381:4: otherlv_3= ',' ( (lv_elems_4_0= ruleELiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSetLiteral3060); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1385:1: ( (lv_elems_4_0= ruleELiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1386:1: (lv_elems_4_0= ruleELiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1386:1: (lv_elems_4_0= ruleELiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1387:3: lv_elems_4_0= ruleELiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleELiteral_in_ruleSetLiteral3081);
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
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSetLiteral3097); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1415:1: entryRuleELiteral returns [EObject current=null] : iv_ruleELiteral= ruleELiteral EOF ;
    public final EObject entryRuleELiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1416:2: (iv_ruleELiteral= ruleELiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1417:2: iv_ruleELiteral= ruleELiteral EOF
            {
             newCompositeNode(grammarAccess.getELiteralRule()); 
            pushFollow(FOLLOW_ruleELiteral_in_entryRuleELiteral3133);
            iv_ruleELiteral=ruleELiteral();

            state._fsp--;

             current =iv_ruleELiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleELiteral3143); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1424:1: ruleELiteral returns [EObject current=null] : ( (lv_lit_0_0= RULE_LIT ) ) ;
    public final EObject ruleELiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1427:28: ( ( (lv_lit_0_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1428:1: ( (lv_lit_0_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1428:1: ( (lv_lit_0_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1429:1: (lv_lit_0_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1429:1: (lv_lit_0_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1430:3: lv_lit_0_0= RULE_LIT
            {
            lv_lit_0_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleELiteral3184); 

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


    // $ANTLR start "entryRuleSubFeaturesDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1454:1: entryRuleSubFeaturesDecl returns [EObject current=null] : iv_ruleSubFeaturesDecl= ruleSubFeaturesDecl EOF ;
    public final EObject entryRuleSubFeaturesDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubFeaturesDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1455:2: (iv_ruleSubFeaturesDecl= ruleSubFeaturesDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1456:2: iv_ruleSubFeaturesDecl= ruleSubFeaturesDecl EOF
            {
             newCompositeNode(grammarAccess.getSubFeaturesDeclRule()); 
            pushFollow(FOLLOW_ruleSubFeaturesDecl_in_entryRuleSubFeaturesDecl3224);
            iv_ruleSubFeaturesDecl=ruleSubFeaturesDecl();

            state._fsp--;

             current =iv_ruleSubFeaturesDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubFeaturesDecl3234); 

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
    // $ANTLR end "entryRuleSubFeaturesDecl"


    // $ANTLR start "ruleSubFeaturesDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1463:1: ruleSubFeaturesDecl returns [EObject current=null] : ( ( ( (lv_categoryNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleSubFeaturesType ) ) ) ;
    public final EObject ruleSubFeaturesDecl() throws RecognitionException {
        EObject current = null;

        Token lv_categoryNames_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1466:28: ( ( ( ( (lv_categoryNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleSubFeaturesType ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1467:1: ( ( ( (lv_categoryNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleSubFeaturesType ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1467:1: ( ( ( (lv_categoryNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleSubFeaturesType ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1467:2: ( ( (lv_categoryNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleSubFeaturesType ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1467:2: ( ( (lv_categoryNames_0_0= RULE_ID ) ) otherlv_1= '.' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==21) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1467:3: ( (lv_categoryNames_0_0= RULE_ID ) ) otherlv_1= '.'
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1467:3: ( (lv_categoryNames_0_0= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1468:1: (lv_categoryNames_0_0= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1468:1: (lv_categoryNames_0_0= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1469:3: lv_categoryNames_0_0= RULE_ID
            	    {
            	    lv_categoryNames_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubFeaturesDecl3277); 

            	    			newLeafNode(lv_categoryNames_0_0, grammarAccess.getSubFeaturesDeclAccess().getCategoryNamesIDTerminalRuleCall_0_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubFeaturesDeclRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"categoryNames",
            	            		lv_categoryNames_0_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSubFeaturesDecl3294); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSubFeaturesDeclAccess().getFullStopKeyword_0_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1489:3: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1490:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1490:1: (lv_name_2_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1491:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubFeaturesDecl3313); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSubFeaturesDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubFeaturesDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1507:2: ( (lv_type_3_0= ruleSubFeaturesType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1508:1: (lv_type_3_0= ruleSubFeaturesType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1508:1: (lv_type_3_0= ruleSubFeaturesType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1509:3: lv_type_3_0= ruleSubFeaturesType
            {
             
            	        newCompositeNode(grammarAccess.getSubFeaturesDeclAccess().getTypeSubFeaturesTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSubFeaturesType_in_ruleSubFeaturesDecl3339);
            lv_type_3_0=ruleSubFeaturesType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubFeaturesDeclRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"SubFeaturesType");
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
    // $ANTLR end "ruleSubFeaturesDecl"


    // $ANTLR start "entryRuleSubFeaturesType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1533:1: entryRuleSubFeaturesType returns [EObject current=null] : iv_ruleSubFeaturesType= ruleSubFeaturesType EOF ;
    public final EObject entryRuleSubFeaturesType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubFeaturesType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1534:2: (iv_ruleSubFeaturesType= ruleSubFeaturesType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1535:2: iv_ruleSubFeaturesType= ruleSubFeaturesType EOF
            {
             newCompositeNode(grammarAccess.getSubFeaturesTypeRule()); 
            pushFollow(FOLLOW_ruleSubFeaturesType_in_entryRuleSubFeaturesType3375);
            iv_ruleSubFeaturesType=ruleSubFeaturesType();

            state._fsp--;

             current =iv_ruleSubFeaturesType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubFeaturesType3385); 

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
    // $ANTLR end "entryRuleSubFeaturesType"


    // $ANTLR start "ruleSubFeaturesType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1542:1: ruleSubFeaturesType returns [EObject current=null] : ( (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) ) | ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeaturesBody ) ) ) ) ;
    public final EObject ruleSubFeaturesType() throws RecognitionException {
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1545:28: ( ( (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) ) | ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeaturesBody ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1546:1: ( (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) ) | ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeaturesBody ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1546:1: ( (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) ) | ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeaturesBody ) ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            else if ( (LA35_0==11||LA35_0==23) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1546:2: (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1546:2: (otherlv_0= ':' () ( (otherlv_2= RULE_ID ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1546:4: otherlv_0= ':' () ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSubFeaturesType3423); 

                        	newLeafNode(otherlv_0, grammarAccess.getSubFeaturesTypeAccess().getColonKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1550:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1551:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSubFeaturesTypeAccess().getSubGroupTypeRefAction_0_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1556:2: ( (otherlv_2= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1557:1: (otherlv_2= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1557:1: (otherlv_2= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1558:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubFeaturesTypeRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubFeaturesType3452); 

                    		newLeafNode(otherlv_2, grammarAccess.getSubFeaturesTypeAccess().getTypeFeaturesDeclCrossReference_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1570:6: ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeaturesBody ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1570:6: ( () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeaturesBody ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1570:7: () (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '=' ( (lv_body_9_0= ruleFeaturesBody ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1570:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1571:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSubFeaturesTypeAccess().getSubGroupTypeAnonAction_1_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1576:2: (otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==11) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1576:4: otherlv_4= '<:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                            {
                            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleSubFeaturesType3482); 

                                	newLeafNode(otherlv_4, grammarAccess.getSubFeaturesTypeAccess().getLessThanSignColonKeyword_1_1_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1580:1: ( (otherlv_5= RULE_ID ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1581:1: (otherlv_5= RULE_ID )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1581:1: (otherlv_5= RULE_ID )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1582:3: otherlv_5= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getSubFeaturesTypeRule());
                            	        }
                                    
                            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubFeaturesType3502); 

                            		newLeafNode(otherlv_5, grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclCrossReference_1_1_1_0()); 
                            	

                            }


                            }

                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1593:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==12) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1593:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                            	    {
                            	    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleSubFeaturesType3515); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getSubFeaturesTypeAccess().getCommaKeyword_1_1_2_0());
                            	        
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1597:1: ( (otherlv_7= RULE_ID ) )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1598:1: (otherlv_7= RULE_ID )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1598:1: (otherlv_7= RULE_ID )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1599:3: otherlv_7= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getSubFeaturesTypeRule());
                            	    	        }
                            	            
                            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubFeaturesType3535); 

                            	    		newLeafNode(otherlv_7, grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclCrossReference_1_1_2_1_0()); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleSubFeaturesType3551); 

                        	newLeafNode(otherlv_8, grammarAccess.getSubFeaturesTypeAccess().getEqualsSignKeyword_1_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1614:1: ( (lv_body_9_0= ruleFeaturesBody ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1615:1: (lv_body_9_0= ruleFeaturesBody )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1615:1: (lv_body_9_0= ruleFeaturesBody )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1616:3: lv_body_9_0= ruleFeaturesBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubFeaturesTypeAccess().getBodyFeaturesBodyParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeaturesBody_in_ruleSubFeaturesType3572);
                    lv_body_9_0=ruleFeaturesBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubFeaturesTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_9_0, 
                            		"FeaturesBody");
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
    // $ANTLR end "ruleSubFeaturesType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleModel130 = new BitSet(new long[]{0x0000000000018402L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleDecl223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesDecl_in_ruleDecl250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleTypeDecl332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl349 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_11_in_ruleTypeDecl367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl387 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleTypeDecl400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl420 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_13_in_ruleTypeDecl437 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_ruleELiteral_in_ruleTypeDecl459 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDecl472 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleELiteral_in_ruleTypeDecl493 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleTypeDecl509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesDecl_in_entryRuleFeaturesDecl547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeaturesDecl557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFeaturesDecl600 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeaturesDecl626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeaturesDecl643 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_ruleFeaturesDecl661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeaturesDecl681 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleFeaturesDecl694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeaturesDecl714 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_ruleFeaturesBody_in_ruleFeaturesDecl739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesBody_in_entryRuleFeaturesBody775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeaturesBody785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFeaturesBody832 = new BitSet(new long[]{0x000000000F024010L});
    public static final BitSet FOLLOW_ruleFeatureDecl_in_ruleFeaturesBody853 = new BitSet(new long[]{0x000000000F024010L});
    public static final BitSet FOLLOW_14_in_ruleFeaturesBody866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureDecl_in_entryRuleFeatureDecl904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureDecl914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_ruleFeatureDecl961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_ruleFeatureDecl988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesDecl_in_ruleFeatureDecl1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl1050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariantDecl1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariantDecl_in_ruleInvariantDecl1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariantDecl_in_entryRuleMultiplicityInvariantDecl1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityInvariantDecl1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMultiplicityInvariantDecl1187 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1205 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMultiplicityInvariantDecl1222 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1246 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMultiplicityInvariantDecl1258 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1279 = new BitSet(new long[]{0x0000000000500010L});
    public static final BitSet FOLLOW_ruleSubFeaturesMatch_in_ruleMultiplicityInvariantDecl1301 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleMultiplicityInvariantDecl1314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesMatch_in_entryRuleSubFeaturesMatch1372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubFeaturesMatch1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSubFeaturesMatch1434 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubFeaturesMatch1466 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSubFeaturesMatch1483 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubFeaturesMatch1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSubFeaturesMatch1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat1582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintNat1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAT_in_ruleConstraintNat1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleConstraintNat1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl1715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrDecl1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleAttrDecl1771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttrDecl1788 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18_in_ruleAttrDecl1807 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttrDecl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAttrDecl1848 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier1908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleModifier1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleModifier1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleModifier1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleModifier2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType2119 = new BitSet(new long[]{0x0000000010002002L});
    public static final BitSet FOLLOW_28_in_ruleType2142 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleType2154 = new BitSet(new long[]{0x0000000010002002L});
    public static final BitSet FOLLOW_13_in_ruleType2183 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleType2195 = new BitSet(new long[]{0x0000000010002002L});
    public static final BitSet FOLLOW_30_in_ruleType2218 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType2248 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleType2261 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType2282 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleType2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_ruleLiteral2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_ruleLiteral2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_ruleLiteral2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleLiteral2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral2506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicLiteral2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicLiteral2561 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleBasicLiteral2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral2619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteral2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTupleLiteral2666 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral2697 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_12_in_ruleTupleLiteral2710 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral2731 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_31_in_ruleTupleLiteral2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral2783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListLiteral2838 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleListLiteral2850 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleELiteral_in_ruleListLiteral2872 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_12_in_ruleListLiteral2885 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleELiteral_in_ruleListLiteral2906 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_29_in_ruleListLiteral2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral2958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetLiteral3013 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSetLiteral3025 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_ruleELiteral_in_ruleSetLiteral3047 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleSetLiteral3060 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleELiteral_in_ruleSetLiteral3081 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleSetLiteral3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_entryRuleELiteral3133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleELiteral3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleELiteral3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesDecl_in_entryRuleSubFeaturesDecl3224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubFeaturesDecl3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubFeaturesDecl3277 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSubFeaturesDecl3294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubFeaturesDecl3313 = new BitSet(new long[]{0x0000000000840800L});
    public static final BitSet FOLLOW_ruleSubFeaturesType_in_ruleSubFeaturesDecl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesType_in_entryRuleSubFeaturesType3375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubFeaturesType3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSubFeaturesType3423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubFeaturesType3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSubFeaturesType3482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubFeaturesType3502 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_12_in_ruleSubFeaturesType3515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubFeaturesType3535 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_23_in_ruleSubFeaturesType3551 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleFeaturesBody_in_ruleSubFeaturesType3572 = new BitSet(new long[]{0x0000000000000002L});

}