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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LIT", "RULE_NAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'type'", "'includes'", "','", "'{'", "'}'", "'component'", "'device'", "'app'", "'and'", "'requires'", "':'", "'='", "'const'", "'val'", "'var'", "'def'", "'inv'", "'..'", "'.'", "'*'", "'['", "']'", "'?'", "'!'", "'_'", "'<'", "'>'", "'none'", "'some'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_LIT=5;
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
    public static final int RULE_NAT=6;
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

                if ( (LA1_0==10||(LA1_0>=15 && LA1_0<=17)) ) {
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:115:1: ruleDecl returns [EObject current=null] : (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDecl_0 = null;

        EObject this_ComponentDecl_1 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:118:28: ( (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:1: (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:119:1: (this_TypeDecl_0= ruleTypeDecl | this_ComponentDecl_1= ruleComponentDecl )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=17)) ) {
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:155:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= '{' ( ( (lv_elems_7_0= RULE_LIT ) ) (otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) ) )* )? otherlv_10= '}' )? ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_elems_7_0=null;
        Token otherlv_8=null;
        Token lv_elems_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:158:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= '{' ( ( (lv_elems_7_0= RULE_LIT ) ) (otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) ) )* )? otherlv_10= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= '{' ( ( (lv_elems_7_0= RULE_LIT ) ) (otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) ) )* )? otherlv_10= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= '{' ( ( (lv_elems_7_0= RULE_LIT ) ) (otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) ) )* )? otherlv_10= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= '{' ( ( (lv_elems_7_0= RULE_LIT ) ) (otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) ) )* )? otherlv_10= '}' )?
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:181:2: (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:181:4: otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleTypeDecl367); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getIncludesKeyword_2_0());
                        
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:215:6: (otherlv_6= '{' ( ( (lv_elems_7_0= RULE_LIT ) ) (otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) ) )* )? otherlv_10= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:215:8: otherlv_6= '{' ( ( (lv_elems_7_0= RULE_LIT ) ) (otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) ) )* )? otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleTypeDecl437); 

                        	newLeafNode(otherlv_6, grammarAccess.getTypeDeclAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:219:1: ( ( (lv_elems_7_0= RULE_LIT ) ) (otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_LIT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:219:2: ( (lv_elems_7_0= RULE_LIT ) ) (otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) ) )*
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:219:2: ( (lv_elems_7_0= RULE_LIT ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:220:1: (lv_elems_7_0= RULE_LIT )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:220:1: (lv_elems_7_0= RULE_LIT )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:221:3: lv_elems_7_0= RULE_LIT
                            {
                            lv_elems_7_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleTypeDecl455); 

                            			newLeafNode(lv_elems_7_0, grammarAccess.getTypeDeclAccess().getElemsLITTerminalRuleCall_3_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeDeclRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"elems",
                                    		lv_elems_7_0, 
                                    		"LIT");
                            	    

                            }


                            }

                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:237:2: (otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==12) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:237:4: otherlv_8= ',' ( (lv_elems_9_0= RULE_LIT ) )
                            	    {
                            	    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleTypeDecl473); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getTypeDeclAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:241:1: ( (lv_elems_9_0= RULE_LIT ) )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:242:1: (lv_elems_9_0= RULE_LIT )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:242:1: (lv_elems_9_0= RULE_LIT )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:243:3: lv_elems_9_0= RULE_LIT
                            	    {
                            	    lv_elems_9_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleTypeDecl490); 

                            	    			newLeafNode(lv_elems_9_0, grammarAccess.getTypeDeclAccess().getElemsLITTerminalRuleCall_3_1_1_1_0()); 
                            	    		

                            	    	        if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getTypeDeclRule());
                            	    	        }
                            	           		addWithLastConsumed(
                            	           			current, 
                            	           			"elems",
                            	            		lv_elems_9_0, 
                            	            		"LIT");
                            	    	    

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

                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleTypeDecl511); 

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


    // $ANTLR start "entryRuleComponentDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:271:1: entryRuleComponentDecl returns [EObject current=null] : iv_ruleComponentDecl= ruleComponentDecl EOF ;
    public final EObject entryRuleComponentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:272:2: (iv_ruleComponentDecl= ruleComponentDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:273:2: iv_ruleComponentDecl= ruleComponentDecl EOF
            {
             newCompositeNode(grammarAccess.getComponentDeclRule()); 
            pushFollow(FOLLOW_ruleComponentDecl_in_entryRuleComponentDecl549);
            iv_ruleComponentDecl=ruleComponentDecl();

            state._fsp--;

             current =iv_ruleComponentDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDecl559); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:280:1: ruleComponentDecl returns [EObject current=null] : ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'includes' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'and' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* otherlv_17= '}' )? ) ;
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
        Token otherlv_17=null;
        EObject lv_members_12_0 = null;

        EObject lv_devices_16_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:283:28: ( ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'includes' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'and' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* otherlv_17= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:1: ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'includes' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'and' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* otherlv_17= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:1: ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'includes' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'and' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* otherlv_17= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:2: ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'includes' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'and' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* otherlv_17= '}' )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:2: ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:3: (otherlv_0= 'component' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:3: (otherlv_0= 'component' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:284:5: otherlv_0= 'component' ()
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleComponentDecl598); 

                        	newLeafNode(otherlv_0, grammarAccess.getComponentDeclAccess().getComponentKeyword_0_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:288:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:289:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentDeclAccess().getComponentAction_0_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:295:6: (otherlv_2= 'device' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:295:6: (otherlv_2= 'device' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:295:8: otherlv_2= 'device' ()
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleComponentDecl627); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentDeclAccess().getDeviceKeyword_0_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:299:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:300:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentDeclAccess().getDeviceAction_0_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:306:6: (otherlv_4= 'app' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:306:6: (otherlv_4= 'app' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:306:8: otherlv_4= 'app' ()
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleComponentDecl656); 

                        	newLeafNode(otherlv_4, grammarAccess.getComponentDeclAccess().getAppKeyword_0_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:310:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:311:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentDeclAccess().getAppAction_0_2_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:316:4: ( (lv_name_6_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:317:1: (lv_name_6_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:317:1: (lv_name_6_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:318:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl684); 

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:334:2: (otherlv_7= 'includes' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'and' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:334:4: otherlv_7= 'includes' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'and' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleComponentDecl702); 

                        	newLeafNode(otherlv_7, grammarAccess.getComponentDeclAccess().getIncludesKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:338:1: ( (otherlv_8= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:339:1: (otherlv_8= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:339:1: (otherlv_8= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:340:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentDeclRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl722); 

                    		newLeafNode(otherlv_8, grammarAccess.getComponentDeclAccess().getSupersComponentDeclCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:351:2: (otherlv_9= 'and' ( (otherlv_10= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:351:4: otherlv_9= 'and' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleComponentDecl735); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getComponentDeclAccess().getAndKeyword_2_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:355:1: ( (otherlv_10= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:356:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:356:1: (otherlv_10= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:357:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getComponentDeclRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl755); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getComponentDeclAccess().getSupersComponentDeclCrossReference_2_2_1_0()); 
                    	    	

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:368:6: (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:368:8: otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}'
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleComponentDecl772); 

                        	newLeafNode(otherlv_11, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:372:1: ( (lv_members_12_0= ruleMemberDecl ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||(LA11_0>=22 && LA11_0<=26)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:373:1: (lv_members_12_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:373:1: (lv_members_12_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:374:3: lv_members_12_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getMembersMemberDeclParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleComponentDecl793);
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleComponentDecl806); 

                        	newLeafNode(otherlv_13, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:394:3: (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* otherlv_17= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:394:5: otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleComponentDecl821); 

                        	newLeafNode(otherlv_14, grammarAccess.getComponentDeclAccess().getRequiresKeyword_4_0());
                        
                    otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleComponentDecl833); 

                        	newLeafNode(otherlv_15, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:402:1: ( (lv_devices_16_0= ruleDevice ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:403:1: (lv_devices_16_0= ruleDevice )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:403:1: (lv_devices_16_0= ruleDevice )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:404:3: lv_devices_16_0= ruleDevice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getDevicesDeviceParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDevice_in_ruleComponentDecl854);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleComponentDecl867); 

                        	newLeafNode(otherlv_17, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_4_3());
                        

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:432:1: entryRuleMemberDecl returns [EObject current=null] : iv_ruleMemberDecl= ruleMemberDecl EOF ;
    public final EObject entryRuleMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:433:2: (iv_ruleMemberDecl= ruleMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:434:2: iv_ruleMemberDecl= ruleMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getMemberDeclRule()); 
            pushFollow(FOLLOW_ruleMemberDecl_in_entryRuleMemberDecl905);
            iv_ruleMemberDecl=ruleMemberDecl();

            state._fsp--;

             current =iv_ruleMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDecl915); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:441:1: ruleMemberDecl returns [EObject current=null] : (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl ) ;
    public final EObject ruleMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject this_AttrDecl_0 = null;

        EObject this_SubMemberDecl_1 = null;

        EObject this_InvariantDecl_2 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:444:28: ( (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:445:1: (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:445:1: (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:446:5: this_AttrDecl_0= ruleAttrDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getAttrDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAttrDecl_in_ruleMemberDecl962);
                    this_AttrDecl_0=ruleAttrDecl();

                    state._fsp--;

                     
                            current = this_AttrDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:456:5: this_SubMemberDecl_1= ruleSubMemberDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getSubMemberDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSubMemberDecl_in_ruleMemberDecl989);
                    this_SubMemberDecl_1=ruleSubMemberDecl();

                    state._fsp--;

                     
                            current = this_SubMemberDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:466:5: this_InvariantDecl_2= ruleInvariantDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getInvariantDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInvariantDecl_in_ruleMemberDecl1016);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:482:1: entryRuleAttrDecl returns [EObject current=null] : iv_ruleAttrDecl= ruleAttrDecl EOF ;
    public final EObject entryRuleAttrDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:483:2: (iv_ruleAttrDecl= ruleAttrDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:484:2: iv_ruleAttrDecl= ruleAttrDecl EOF
            {
             newCompositeNode(grammarAccess.getAttrDeclRule()); 
            pushFollow(FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl1051);
            iv_ruleAttrDecl=ruleAttrDecl();

            state._fsp--;

             current =iv_ruleAttrDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrDecl1061); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:491:1: ruleAttrDecl returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:494:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:495:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:495:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:495:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:495:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:496:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:496:1: (lv_modifier_0_0= ruleModifier )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:497:3: lv_modifier_0_0= ruleModifier
            {
             
            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModifier_in_ruleAttrDecl1107);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:513:2: ( (lv_attributeName_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:514:1: (lv_attributeName_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:514:1: (lv_attributeName_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:515:3: lv_attributeName_1_0= RULE_ID
            {
            lv_attributeName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttrDecl1124); 

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:531:2: ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            else if ( (LA17_0==21) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:531:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:531:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:531:5: otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )?
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAttrDecl1143); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttrDeclAccess().getColonKeyword_2_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:535:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:536:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:536:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:537:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAttrDecl1164);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:553:2: (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==21) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:553:4: otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) )
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAttrDecl1177); 

                                	newLeafNode(otherlv_4, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_0_2_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:557:1: ( (lv_literal_5_0= ruleLiteral ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:558:1: (lv_literal_5_0= ruleLiteral )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:558:1: (lv_literal_5_0= ruleLiteral )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:559:3: lv_literal_5_0= ruleLiteral
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl1198);
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:576:6: (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:576:6: (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:576:8: otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleAttrDecl1220); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:580:1: ( (lv_literal_7_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:581:1: (lv_literal_7_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:581:1: (lv_literal_7_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:582:3: lv_literal_7_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl1241);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:606:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:607:2: (iv_ruleModifier= ruleModifier EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:608:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier1280);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier1291); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:615:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:618:28: ( (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:619:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:619:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'def' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt18=1;
                }
                break;
            case 23:
                {
                alt18=2;
                }
                break;
            case 24:
                {
                alt18=3;
                }
                break;
            case 25:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:620:2: kw= 'const'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleModifier1329); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getConstKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:627:2: kw= 'val'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleModifier1348); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getValKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:634:2: kw= 'var'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleModifier1367); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getVarKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:641:2: kw= 'def'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleModifier1386); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:654:1: entryRuleSubMemberDecl returns [EObject current=null] : iv_ruleSubMemberDecl= ruleSubMemberDecl EOF ;
    public final EObject entryRuleSubMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:655:2: (iv_ruleSubMemberDecl= ruleSubMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:656:2: iv_ruleSubMemberDecl= ruleSubMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getSubMemberDeclRule()); 
            pushFollow(FOLLOW_ruleSubMemberDecl_in_entryRuleSubMemberDecl1426);
            iv_ruleSubMemberDecl=ruleSubMemberDecl();

            state._fsp--;

             current =iv_ruleSubMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMemberDecl1436); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:663:1: ruleSubMemberDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? ) | (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' ) ) ) ;
    public final EObject ruleSubMemberDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_members_6_0 = null;

        EObject lv_members_9_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:666:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? ) | (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:667:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? ) | (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:667:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? ) | (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:667:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? ) | (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:667:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:668:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:668:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:669:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberDecl1478); 

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:685:2: ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? ) | (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            else if ( (LA23_0==13) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:685:3: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:685:3: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:685:5: otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )?
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSubMemberDecl1497); 

                        	newLeafNode(otherlv_1, grammarAccess.getSubMemberDeclAccess().getColonKeyword_1_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:689:1: ( (otherlv_2= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:690:1: (otherlv_2= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:690:1: (otherlv_2= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:691:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubMemberDeclRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberDecl1517); 

                    		newLeafNode(otherlv_2, grammarAccess.getSubMemberDeclAccess().getSupersComponentDeclCrossReference_1_0_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:702:2: (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==18) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:702:4: otherlv_3= 'and' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleSubMemberDecl1530); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSubMemberDeclAccess().getAndKeyword_1_0_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:706:1: ( (otherlv_4= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:707:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:707:1: (otherlv_4= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:708:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSubMemberDeclRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberDecl1550); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getSubMemberDeclAccess().getSupersComponentDeclCrossReference_1_0_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:719:4: (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==13) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:719:6: otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}'
                            {
                            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleSubMemberDecl1565); 

                                	newLeafNode(otherlv_5, grammarAccess.getSubMemberDeclAccess().getLeftCurlyBracketKeyword_1_0_3_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:723:1: ( (lv_members_6_0= ruleMemberDecl ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_ID||(LA20_0>=22 && LA20_0<=26)) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:724:1: (lv_members_6_0= ruleMemberDecl )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:724:1: (lv_members_6_0= ruleMemberDecl )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:725:3: lv_members_6_0= ruleMemberDecl
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSubMemberDeclAccess().getMembersMemberDeclParserRuleCall_1_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleSubMemberDecl1586);
                            	    lv_members_6_0=ruleMemberDecl();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSubMemberDeclRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"members",
                            	            		lv_members_6_0, 
                            	            		"MemberDecl");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleSubMemberDecl1599); 

                                	newLeafNode(otherlv_7, grammarAccess.getSubMemberDeclAccess().getRightCurlyBracketKeyword_1_0_3_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:746:6: (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:746:6: (otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:746:8: otherlv_8= '{' ( (lv_members_9_0= ruleMemberDecl ) )* otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleSubMemberDecl1621); 

                        	newLeafNode(otherlv_8, grammarAccess.getSubMemberDeclAccess().getLeftCurlyBracketKeyword_1_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:750:1: ( (lv_members_9_0= ruleMemberDecl ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID||(LA22_0>=22 && LA22_0<=26)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:751:1: (lv_members_9_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:751:1: (lv_members_9_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:752:3: lv_members_9_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSubMemberDeclAccess().getMembersMemberDeclParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleSubMemberDecl1642);
                    	    lv_members_9_0=ruleMemberDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSubMemberDeclRule());
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleSubMemberDecl1655); 

                        	newLeafNode(otherlv_10, grammarAccess.getSubMemberDeclAccess().getRightCurlyBracketKeyword_1_1_2());
                        

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:780:1: entryRuleInvariantDecl returns [EObject current=null] : iv_ruleInvariantDecl= ruleInvariantDecl EOF ;
    public final EObject entryRuleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:781:2: (iv_ruleInvariantDecl= ruleInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:782:2: iv_ruleInvariantDecl= ruleInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl1693);
            iv_ruleInvariantDecl=ruleInvariantDecl();

            state._fsp--;

             current =iv_ruleInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariantDecl1703); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:789:1: ruleInvariantDecl returns [EObject current=null] : this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl ;
    public final EObject ruleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicityInvariantDecl_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:792:28: (this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:794:5: this_MultiplicityInvariantDecl_0= ruleMultiplicityInvariantDecl
            {
             
                    newCompositeNode(grammarAccess.getInvariantDeclAccess().getMultiplicityInvariantDeclParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMultiplicityInvariantDecl_in_ruleInvariantDecl1749);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:810:1: entryRuleMultiplicityInvariantDecl returns [EObject current=null] : iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF ;
    public final EObject entryRuleMultiplicityInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:811:2: (iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:812:2: iv_ruleMultiplicityInvariantDecl= ruleMultiplicityInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleMultiplicityInvariantDecl_in_entryRuleMultiplicityInvariantDecl1783);
            iv_ruleMultiplicityInvariantDecl=ruleMultiplicityInvariantDecl();

            state._fsp--;

             current =iv_ruleMultiplicityInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityInvariantDecl1793); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:819:1: ruleMultiplicityInvariantDecl returns [EObject current=null] : (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:822:28: ( (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:823:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:823:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:823:3: otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMultiplicityInvariantDecl1830); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiplicityInvariantDeclAccess().getInvKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:827:1: ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:827:2: ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:827:2: ( (lv_invName_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:828:1: (lv_invName_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:828:1: (lv_invName_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:829:3: lv_invName_1_0= RULE_ID
                    {
                    lv_invName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1848); 

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

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMultiplicityInvariantDecl1865); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:849:3: ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:849:4: ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:849:4: ( (lv_lo_3_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:850:1: (lv_lo_3_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:850:1: (lv_lo_3_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:851:3: lv_lo_3_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getLoConstraintNatParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1889);
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

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleMultiplicityInvariantDecl1901); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiplicityInvariantDeclAccess().getFullStopFullStopKeyword_2_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:871:1: ( (lv_hi_5_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:872:1: (lv_hi_5_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:872:1: (lv_hi_5_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:873:3: lv_hi_5_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getHiConstraintNatParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1922);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:889:3: ( (lv_match_6_0= ruleSubMemberMatch ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:890:1: (lv_match_6_0= ruleSubMemberMatch )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:890:1: (lv_match_6_0= ruleSubMemberMatch )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:891:3: lv_match_6_0= ruleSubMemberMatch
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchSubMemberMatchParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSubMemberMatch_in_ruleMultiplicityInvariantDecl1944);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:907:2: (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:907:4: otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleMultiplicityInvariantDecl1957); 

                        	newLeafNode(otherlv_7, grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:911:1: ( (otherlv_8= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:912:1: (otherlv_8= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:912:1: (otherlv_8= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:913:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityInvariantDeclRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1977); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:932:1: entryRuleSubMemberMatch returns [EObject current=null] : iv_ruleSubMemberMatch= ruleSubMemberMatch EOF ;
    public final EObject entryRuleSubMemberMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMemberMatch = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:933:2: (iv_ruleSubMemberMatch= ruleSubMemberMatch EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:934:2: iv_ruleSubMemberMatch= ruleSubMemberMatch EOF
            {
             newCompositeNode(grammarAccess.getSubMemberMatchRule()); 
            pushFollow(FOLLOW_ruleSubMemberMatch_in_entryRuleSubMemberMatch2015);
            iv_ruleSubMemberMatch=ruleSubMemberMatch();

            state._fsp--;

             current =iv_ruleSubMemberMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMemberMatch2025); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:941:1: ruleSubMemberMatch returns [EObject current=null] : ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) ) ;
    public final EObject ruleSubMemberMatch() throws RecognitionException {
        EObject current = null;

        Token lv_qNames_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_any_3_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:944:28: ( ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:945:1: ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:945:1: ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:945:2: ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:945:2: ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==28) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:945:3: ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.'
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:945:3: ( (lv_qNames_0_0= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:946:1: (lv_qNames_0_0= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:946:1: (lv_qNames_0_0= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:947:3: lv_qNames_0_0= RULE_ID
            	    {
            	    lv_qNames_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberMatch2068); 

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

            	    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleSubMemberMatch2085); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSubMemberMatchAccess().getFullStopKeyword_0_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:967:3: ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==29) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:967:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:967:4: ( (lv_name_2_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:968:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:968:1: (lv_name_2_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:969:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberMatch2105); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:986:6: ( (lv_any_3_0= '*' ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:986:6: ( (lv_any_3_0= '*' ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:987:1: (lv_any_3_0= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:987:1: (lv_any_3_0= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:988:3: lv_any_3_0= '*'
                    {
                    lv_any_3_0=(Token)match(input,29,FOLLOW_29_in_ruleSubMemberMatch2134); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1009:1: entryRuleConstraintNat returns [EObject current=null] : iv_ruleConstraintNat= ruleConstraintNat EOF ;
    public final EObject entryRuleConstraintNat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintNat = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1010:2: (iv_ruleConstraintNat= ruleConstraintNat EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1011:2: iv_ruleConstraintNat= ruleConstraintNat EOF
            {
             newCompositeNode(grammarAccess.getConstraintNatRule()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat2184);
            iv_ruleConstraintNat=ruleConstraintNat();

            state._fsp--;

             current =iv_ruleConstraintNat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintNat2194); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1018:1: ruleConstraintNat returns [EObject current=null] : ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) ;
    public final EObject ruleConstraintNat() throws RecognitionException {
        EObject current = null;

        Token lv_num_1_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1021:28: ( ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1022:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1022:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_NAT) ) {
                alt28=1;
            }
            else if ( (LA28_0==29) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1022:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1022:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1022:3: () ( (lv_num_1_0= RULE_NAT ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1022:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1023:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getNumNatConstraintAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1028:2: ( (lv_num_1_0= RULE_NAT ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1029:1: (lv_num_1_0= RULE_NAT )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1029:1: (lv_num_1_0= RULE_NAT )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1030:3: lv_num_1_0= RULE_NAT
                    {
                    lv_num_1_0=(Token)match(input,RULE_NAT,FOLLOW_RULE_NAT_in_ruleConstraintNat2246); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1047:6: ( () otherlv_3= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1047:6: ( () otherlv_3= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1047:7: () otherlv_3= '*'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1047:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1048:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getAnyNatConstraintAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleConstraintNat2280); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1065:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1066:2: (iv_ruleDevice= ruleDevice EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1067:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_ruleDevice_in_entryRuleDevice2317);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevice2327); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1074:1: ruleDevice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_members_6_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1077:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1078:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1078:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1078:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1078:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1079:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1079:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1080:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice2369); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleDevice2386); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getColonKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1100:1: ( (otherlv_2= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1101:1: (otherlv_2= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1101:1: (otherlv_2= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1102:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice2406); 

            		newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getSupersComponentDeclCrossReference_2_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1113:2: (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1113:4: otherlv_3= 'and' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleDevice2419); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getAndKeyword_3_0());
            	        
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1117:1: ( (otherlv_4= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1118:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1118:1: (otherlv_4= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1119:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeviceRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice2439); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getSupersComponentDeclCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1130:4: (otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1130:6: otherlv_5= '{' ( (lv_members_6_0= ruleMemberDecl ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDevice2454); 

                        	newLeafNode(otherlv_5, grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1134:1: ( (lv_members_6_0= ruleMemberDecl ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID||(LA30_0>=22 && LA30_0<=26)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1135:1: (lv_members_6_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1135:1: (lv_members_6_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1136:3: lv_members_6_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeviceAccess().getMembersMemberDeclParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleDevice2475);
                    	    lv_members_6_0=ruleMemberDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeviceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"members",
                    	            		lv_members_6_0, 
                    	            		"MemberDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleDevice2488); 

                        	newLeafNode(otherlv_7, grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_4_2());
                        

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


    // $ANTLR start "entryRuleType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1164:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1165:2: (iv_ruleType= ruleType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1166:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2526);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2536); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1173:1: ruleType returns [EObject current=null] : (this_BasicType_0= ruleBasicType ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1176:28: ( (this_BasicType_0= ruleBasicType ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1177:1: (this_BasicType_0= ruleBasicType ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1177:1: (this_BasicType_0= ruleBasicType ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1178:5: this_BasicType_0= ruleBasicType ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )?
            {
             
                    newCompositeNode(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBasicType_in_ruleType2583);
            this_BasicType_0=ruleBasicType();

            state._fsp--;

             
                    current = this_BasicType_0; 
                    afterParserOrEnumRuleCall();
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1186:1: ( ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==13||LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1186:2: ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+ ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )?
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1186:2: ( ( () otherlv_2= '[' otherlv_3= ']' ) | ( () otherlv_5= '{' otherlv_6= '}' ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=3;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==30) ) {
                            alt32=1;
                        }
                        else if ( (LA32_0==13) ) {
                            alt32=2;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1186:3: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1186:3: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1186:4: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1186:4: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1187:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getTypeAccess().getListTypeBaseAction_1_0_0_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleType2606); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0_0_1());
                    	        
                    	    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleType2618); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_0_0_2());
                    	        

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1201:6: ( () otherlv_5= '{' otherlv_6= '}' )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1201:6: ( () otherlv_5= '{' otherlv_6= '}' )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1201:7: () otherlv_5= '{' otherlv_6= '}'
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1201:7: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1202:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getTypeAccess().getSetTypeBaseAction_1_0_1_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleType2647); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_1_0_1_1());
                    	        
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleType2659); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_1_0_1_2());
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1215:4: ( (otherlv_7= '?' () ) | (otherlv_9= '!' () ) | (otherlv_11= '_' () ) )?
                    int alt33=4;
                    switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt33=1;
                            }
                            break;
                        case 33:
                            {
                            alt33=2;
                            }
                            break;
                        case 34:
                            {
                            alt33=3;
                            }
                            break;
                    }

                    switch (alt33) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1215:5: (otherlv_7= '?' () )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1215:5: (otherlv_7= '?' () )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1215:7: otherlv_7= '?' ()
                            {
                            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleType2676); 

                                	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getQuestionMarkKeyword_1_1_0_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1219:1: ()
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1220:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getTypeAccess().getOptionTypeBaseAction_1_1_0_1(),
                                        current);
                                

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1226:6: (otherlv_9= '!' () )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1226:6: (otherlv_9= '!' () )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1226:8: otherlv_9= '!' ()
                            {
                            otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleType2705); 

                                	newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getExclamationMarkKeyword_1_1_1_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1230:1: ()
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1231:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getTypeAccess().getSomeTypeBaseAction_1_1_1_1(),
                                        current);
                                

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1237:6: (otherlv_11= '_' () )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1237:6: (otherlv_11= '_' () )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1237:8: otherlv_11= '_' ()
                            {
                            otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleType2734); 

                                	newLeafNode(otherlv_11, grammarAccess.getTypeAccess().get_Keyword_1_1_2_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1241:1: ()
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1242:5: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1255:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1256:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1257:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType2784);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType2794); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1264:1: ruleBasicType returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) ) ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1267:28: ( ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) ) ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1268:1: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) ) ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1268:1: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) ) ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1268:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) ) ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1268:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==35) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1268:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1268:3: ( (otherlv_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1269:1: (otherlv_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1269:1: (otherlv_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1270:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicType2840); 

                    		newLeafNode(otherlv_0, grammarAccess.getBasicTypeAccess().getBaseTypeTypeDeclCrossReference_0_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1282:6: (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1282:6: (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1282:8: otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleBasicType2859); 

                        	newLeafNode(otherlv_1, grammarAccess.getBasicTypeAccess().getLessThanSignKeyword_0_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1286:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1287:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBasicTypeAccess().getTupleTypeAction_0_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1292:2: ( (lv_elemTypes_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1293:1: (lv_elemTypes_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1293:1: (lv_elemTypes_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1294:3: lv_elemTypes_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBasicTypeAccess().getElemTypesTypeParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBasicType2889);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1310:2: (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==29) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1310:4: otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleBasicType2902); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getBasicTypeAccess().getAsteriskKeyword_0_1_3_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1314:1: ( (lv_elemTypes_5_0= ruleType ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1315:1: (lv_elemTypes_5_0= ruleType )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1315:1: (lv_elemTypes_5_0= ruleType )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1316:3: lv_elemTypes_5_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBasicTypeAccess().getElemTypesTypeParserRuleCall_0_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleBasicType2923);
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
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleBasicType2937); 

                        	newLeafNode(otherlv_6, grammarAccess.getBasicTypeAccess().getGreaterThanSignKeyword_0_1_4());
                        

                    }


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1336:3: ( (otherlv_7= '?' () ) | (otherlv_9= '_' () ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            else if ( (LA37_0==34) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1336:4: (otherlv_7= '?' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1336:4: (otherlv_7= '?' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1336:6: otherlv_7= '?' ()
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleBasicType2953); 

                        	newLeafNode(otherlv_7, grammarAccess.getBasicTypeAccess().getQuestionMarkKeyword_1_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1340:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1341:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBasicTypeAccess().getOptionTypeBaseAction_1_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1347:6: (otherlv_9= '_' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1347:6: (otherlv_9= '_' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1347:8: otherlv_9= '_' ()
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleBasicType2982); 

                        	newLeafNode(otherlv_9, grammarAccess.getBasicTypeAccess().get_Keyword_1_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1351:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1352:5: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1365:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1366:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1367:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3030);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3040); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1374:1: ruleLiteral returns [EObject current=null] : (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral | this_OptionLiteral_4= ruleOptionLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BasicLiteral_0 = null;

        EObject this_TupleLiteral_1 = null;

        EObject this_ListLiteral_2 = null;

        EObject this_SetLiteral_3 = null;

        EObject this_OptionLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1377:28: ( (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral | this_OptionLiteral_4= ruleOptionLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1378:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral | this_OptionLiteral_4= ruleOptionLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1378:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_ListLiteral_2= ruleListLiteral | this_SetLiteral_3= ruleSetLiteral | this_OptionLiteral_4= ruleOptionLiteral )
            int alt38=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt38=1;
                }
                break;
            case 35:
                {
                alt38=2;
                }
                break;
            case 30:
                {
                alt38=3;
                }
                break;
            case 13:
                {
                alt38=4;
                }
                break;
            case 37:
            case 38:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1379:5: this_BasicLiteral_0= ruleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicLiteral_in_ruleLiteral3087);
                    this_BasicLiteral_0=ruleBasicLiteral();

                    state._fsp--;

                     
                            current = this_BasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1389:5: this_TupleLiteral_1= ruleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleLiteral_in_ruleLiteral3114);
                    this_TupleLiteral_1=ruleTupleLiteral();

                    state._fsp--;

                     
                            current = this_TupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1399:5: this_ListLiteral_2= ruleListLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleListLiteral_in_ruleLiteral3141);
                    this_ListLiteral_2=ruleListLiteral();

                    state._fsp--;

                     
                            current = this_ListLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1409:5: this_SetLiteral_3= ruleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleLiteral3168);
                    this_SetLiteral_3=ruleSetLiteral();

                    state._fsp--;

                     
                            current = this_SetLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1419:5: this_OptionLiteral_4= ruleOptionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getOptionLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleOptionLiteral_in_ruleLiteral3195);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1435:1: entryRuleBasicLiteral returns [EObject current=null] : iv_ruleBasicLiteral= ruleBasicLiteral EOF ;
    public final EObject entryRuleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1436:2: (iv_ruleBasicLiteral= ruleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1437:2: iv_ruleBasicLiteral= ruleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral3230);
            iv_ruleBasicLiteral=ruleBasicLiteral();

            state._fsp--;

             current =iv_ruleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicLiteral3240); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1444:1: ruleBasicLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) ;
    public final EObject ruleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lit_1_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1447:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1448:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1448:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1448:2: ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1448:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1449:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1449:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1450:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicLiteral3285); 

            		newLeafNode(otherlv_0, grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1461:2: ( (lv_lit_1_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1462:1: (lv_lit_1_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1462:1: (lv_lit_1_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1463:3: lv_lit_1_0= RULE_LIT
            {
            lv_lit_1_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleBasicLiteral3302); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1487:1: entryRuleTupleLiteral returns [EObject current=null] : iv_ruleTupleLiteral= ruleTupleLiteral EOF ;
    public final EObject entryRuleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1488:2: (iv_ruleTupleLiteral= ruleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1489:2: iv_ruleTupleLiteral= ruleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral3343);
            iv_ruleTupleLiteral=ruleTupleLiteral();

            state._fsp--;

             current =iv_ruleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteral3353); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1496:1: ruleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1499:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1500:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1500:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1500:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleTupleLiteral3390); 

                	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1504:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1505:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1510:2: ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==13||LA40_0==30||LA40_0==35||(LA40_0>=37 && LA40_0<=38)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1510:3: ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1510:3: ( (lv_elems_2_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1511:1: (lv_elems_2_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1511:1: (lv_elems_2_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1512:3: lv_elems_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral3421);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1528:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==12) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1528:4: otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleTupleLiteral3434); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1532:1: ( (lv_elems_4_0= ruleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1533:1: (lv_elems_4_0= ruleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1533:1: (lv_elems_4_0= ruleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1534:3: lv_elems_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral3455);
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
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleTupleLiteral3471); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1562:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1563:2: (iv_ruleListLiteral= ruleListLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1564:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
             newCompositeNode(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral3507);
            iv_ruleListLiteral=ruleListLiteral();

            state._fsp--;

             current =iv_ruleListLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral3517); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1571:1: ruleListLiteral returns [EObject current=null] : (otherlv_0= '[' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1574:28: ( (otherlv_0= '[' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1575:1: (otherlv_0= '[' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1575:1: (otherlv_0= '[' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1575:3: otherlv_0= '[' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleListLiteral3554); 

                	newLeafNode(otherlv_0, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1579:1: ( (lv_basicType_1_0= ruleBasicType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1580:1: (lv_basicType_1_0= ruleBasicType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1580:1: (lv_basicType_1_0= ruleBasicType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1581:3: lv_basicType_1_0= ruleBasicType
            {
             
            	        newCompositeNode(grammarAccess.getListLiteralAccess().getBasicTypeBasicTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBasicType_in_ruleListLiteral3575);
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleListLiteral3587); 

                	newLeafNode(otherlv_2, grammarAccess.getListLiteralAccess().getColonKeyword_2());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1601:1: ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_LIT||LA42_0==13||LA42_0==30||LA42_0==35||(LA42_0>=37 && LA42_0<=38)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1601:2: ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1601:2: ( (lv_elems_3_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:1: (lv_elems_3_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:1: (lv_elems_3_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1603:3: lv_elems_3_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getListLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleListLiteral3609);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1619:2: (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==12) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1619:4: otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleListLiteral3622); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getListLiteralAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1623:1: ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1624:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1624:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1625:3: lv_elems_5_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getListLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleListLiteral3643);
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
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleListLiteral3659); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1653:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1654:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1655:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral3695);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;

             current =iv_ruleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral3705); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1662:1: ruleSetLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1665:28: ( (otherlv_0= '{' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1666:1: (otherlv_0= '{' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1666:1: (otherlv_0= '{' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1666:3: otherlv_0= '{' ( (lv_basicType_1_0= ruleBasicType ) ) otherlv_2= ':' ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSetLiteral3742); 

                	newLeafNode(otherlv_0, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1670:1: ( (lv_basicType_1_0= ruleBasicType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1671:1: (lv_basicType_1_0= ruleBasicType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1671:1: (lv_basicType_1_0= ruleBasicType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1672:3: lv_basicType_1_0= ruleBasicType
            {
             
            	        newCompositeNode(grammarAccess.getSetLiteralAccess().getBasicTypeBasicTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBasicType_in_ruleSetLiteral3763);
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleSetLiteral3775); 

                	newLeafNode(otherlv_2, grammarAccess.getSetLiteralAccess().getColonKeyword_2());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1692:1: ( ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_LIT||LA44_0==13||LA44_0==30||LA44_0==35||(LA44_0>=37 && LA44_0<=38)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1692:2: ( (lv_elems_3_0= ruleSimpleLiteral ) ) (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1692:2: ( (lv_elems_3_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1693:1: (lv_elems_3_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1693:1: (lv_elems_3_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1694:3: lv_elems_3_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral3797);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1710:2: (otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==12) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1710:4: otherlv_4= ',' ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleSetLiteral3810); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSetLiteralAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1714:1: ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1715:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1715:1: (lv_elems_5_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1716:3: lv_elems_5_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral3831);
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
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSetLiteral3847); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1744:1: entryRuleOptionLiteral returns [EObject current=null] : iv_ruleOptionLiteral= ruleOptionLiteral EOF ;
    public final EObject entryRuleOptionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1745:2: (iv_ruleOptionLiteral= ruleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1746:2: iv_ruleOptionLiteral= ruleOptionLiteral EOF
            {
             newCompositeNode(grammarAccess.getOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral3883);
            iv_ruleOptionLiteral=ruleOptionLiteral();

            state._fsp--;

             current =iv_ruleOptionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionLiteral3893); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1753:1: ruleOptionLiteral returns [EObject current=null] : ( (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) ) ) ;
    public final EObject ruleOptionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_lit_6_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1756:28: ( ( (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1757:1: ( (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1757:1: ( (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) | (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) ) )
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1757:2: (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1757:2: (otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1757:4: otherlv_0= 'none' () otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleOptionLiteral3931); 

                        	newLeafNode(otherlv_0, grammarAccess.getOptionLiteralAccess().getNoneKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1761:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1762:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionLiteralAccess().getNoneLiteralAction_0_1(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleOptionLiteral3952); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionLiteralAccess().getColonKeyword_0_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1771:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1772:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1772:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1773:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionLiteralAccess().getTypeTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleOptionLiteral3973);
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1790:6: (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1790:6: (otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1790:8: otherlv_4= 'some' () ( (lv_lit_6_0= ruleLiteral ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleOptionLiteral3993); 

                        	newLeafNode(otherlv_4, grammarAccess.getOptionLiteralAccess().getSomeKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1794:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1795:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionLiteralAccess().getSomeLiteralAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1800:2: ( (lv_lit_6_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1801:1: (lv_lit_6_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1801:1: (lv_lit_6_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1802:3: lv_lit_6_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionLiteralAccess().getLitLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleOptionLiteral4023);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1826:1: entryRuleSimpleLiteral returns [EObject current=null] : iv_ruleSimpleLiteral= ruleSimpleLiteral EOF ;
    public final EObject entryRuleSimpleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1827:2: (iv_ruleSimpleLiteral= ruleSimpleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1828:2: iv_ruleSimpleLiteral= ruleSimpleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleLiteral_in_entryRuleSimpleLiteral4060);
            iv_ruleSimpleLiteral=ruleSimpleLiteral();

            state._fsp--;

             current =iv_ruleSimpleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleLiteral4070); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1835:1: ruleSimpleLiteral returns [EObject current=null] : (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleListLiteral_2= ruleSimpleListLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral ) ;
    public final EObject ruleSimpleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBasicLiteral_0 = null;

        EObject this_SimpleTupleLiteral_1 = null;

        EObject this_SimpleListLiteral_2 = null;

        EObject this_SimpleSetLiteral_3 = null;

        EObject this_SimpleOptionLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1838:28: ( (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleListLiteral_2= ruleSimpleListLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1839:1: (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleListLiteral_2= ruleSimpleListLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1839:1: (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleListLiteral_2= ruleSimpleListLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral )
            int alt46=5;
            switch ( input.LA(1) ) {
            case RULE_LIT:
                {
                alt46=1;
                }
                break;
            case 35:
                {
                alt46=2;
                }
                break;
            case 30:
                {
                alt46=3;
                }
                break;
            case 13:
                {
                alt46=4;
                }
                break;
            case 37:
            case 38:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1840:5: this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleBasicLiteral_in_ruleSimpleLiteral4117);
                    this_SimpleBasicLiteral_0=ruleSimpleBasicLiteral();

                    state._fsp--;

                     
                            current = this_SimpleBasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1850:5: this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleTupleLiteral_in_ruleSimpleLiteral4144);
                    this_SimpleTupleLiteral_1=ruleSimpleTupleLiteral();

                    state._fsp--;

                     
                            current = this_SimpleTupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1860:5: this_SimpleListLiteral_2= ruleSimpleListLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleListLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSimpleListLiteral_in_ruleSimpleLiteral4171);
                    this_SimpleListLiteral_2=ruleSimpleListLiteral();

                    state._fsp--;

                     
                            current = this_SimpleListLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1870:5: this_SimpleSetLiteral_3= ruleSimpleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleSetLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSimpleSetLiteral_in_ruleSimpleLiteral4198);
                    this_SimpleSetLiteral_3=ruleSimpleSetLiteral();

                    state._fsp--;

                     
                            current = this_SimpleSetLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1880:5: this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleOptionLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSimpleOptionLiteral_in_ruleSimpleLiteral4225);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1896:1: entryRuleSimpleBasicLiteral returns [EObject current=null] : iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF ;
    public final EObject entryRuleSimpleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1897:2: (iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1898:2: iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleBasicLiteral_in_entryRuleSimpleBasicLiteral4260);
            iv_ruleSimpleBasicLiteral=ruleSimpleBasicLiteral();

            state._fsp--;

             current =iv_ruleSimpleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBasicLiteral4270); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1905:1: ruleSimpleBasicLiteral returns [EObject current=null] : ( (lv_lit_0_0= RULE_LIT ) ) ;
    public final EObject ruleSimpleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1908:28: ( ( (lv_lit_0_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1909:1: ( (lv_lit_0_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1909:1: ( (lv_lit_0_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1910:1: (lv_lit_0_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1910:1: (lv_lit_0_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1911:3: lv_lit_0_0= RULE_LIT
            {
            lv_lit_0_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleSimpleBasicLiteral4311); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1935:1: entryRuleSimpleTupleLiteral returns [EObject current=null] : iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF ;
    public final EObject entryRuleSimpleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1936:2: (iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1937:2: iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleTupleLiteral_in_entryRuleSimpleTupleLiteral4351);
            iv_ruleSimpleTupleLiteral=ruleSimpleTupleLiteral();

            state._fsp--;

             current =iv_ruleSimpleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTupleLiteral4361); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1944:1: ruleSimpleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleSimpleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1947:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1948:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1948:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1948:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleSimpleTupleLiteral4398); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1952:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1953:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleTupleLiteralAccess().getSimpleTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1958:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_LIT||LA48_0==13||LA48_0==30||LA48_0==35||(LA48_0>=37 && LA48_0<=38)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1958:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1958:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1959:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1959:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1960:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleTupleLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral4429);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1976:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==12) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1976:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSimpleTupleLiteral4442); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1980:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1981:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1981:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1982:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleTupleLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral4463);
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
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleSimpleTupleLiteral4479); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2010:1: entryRuleSimpleOptionLiteral returns [EObject current=null] : iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF ;
    public final EObject entryRuleSimpleOptionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOptionLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2011:2: (iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2012:2: iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleOptionLiteral_in_entryRuleSimpleOptionLiteral4515);
            iv_ruleSimpleOptionLiteral=ruleSimpleOptionLiteral();

            state._fsp--;

             current =iv_ruleSimpleOptionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOptionLiteral4525); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2019:1: ruleSimpleOptionLiteral returns [EObject current=null] : ( (otherlv_0= 'none' () ) | (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) ) ;
    public final EObject ruleSimpleOptionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lit_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2022:28: ( ( (otherlv_0= 'none' () ) | (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2023:1: ( (otherlv_0= 'none' () ) | (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2023:1: ( (otherlv_0= 'none' () ) | (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==37) ) {
                alt49=1;
            }
            else if ( (LA49_0==38) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2023:2: (otherlv_0= 'none' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2023:2: (otherlv_0= 'none' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2023:4: otherlv_0= 'none' ()
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleSimpleOptionLiteral4563); 

                        	newLeafNode(otherlv_0, grammarAccess.getSimpleOptionLiteralAccess().getNoneKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2027:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2028:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSimpleOptionLiteralAccess().getSimpleNoneLiteralAction_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2034:6: (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2034:6: (otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2034:8: otherlv_2= 'some' () ( (lv_lit_4_0= ruleSimpleLiteral ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleSimpleOptionLiteral4592); 

                        	newLeafNode(otherlv_2, grammarAccess.getSimpleOptionLiteralAccess().getSomeKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2038:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2039:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSimpleOptionLiteralAccess().getSimpleSomeLiteralAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2044:2: ( (lv_lit_4_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2045:1: (lv_lit_4_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2045:1: (lv_lit_4_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2046:3: lv_lit_4_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleOptionLiteralAccess().getLitSimpleLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleOptionLiteral4622);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2070:1: entryRuleSimpleListLiteral returns [EObject current=null] : iv_ruleSimpleListLiteral= ruleSimpleListLiteral EOF ;
    public final EObject entryRuleSimpleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleListLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2071:2: (iv_ruleSimpleListLiteral= ruleSimpleListLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2072:2: iv_ruleSimpleListLiteral= ruleSimpleListLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleListLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleListLiteral_in_entryRuleSimpleListLiteral4659);
            iv_ruleSimpleListLiteral=ruleSimpleListLiteral();

            state._fsp--;

             current =iv_ruleSimpleListLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleListLiteral4669); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2079:1: ruleSimpleListLiteral returns [EObject current=null] : (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleSimpleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2082:28: ( (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2083:1: (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2083:1: (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2083:3: otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSimpleListLiteral4706); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleListLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2087:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2088:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleListLiteralAccess().getSimpleListLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2093:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_LIT||LA51_0==13||LA51_0==30||LA51_0==35||(LA51_0>=37 && LA51_0<=38)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2093:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2093:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2094:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2094:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2095:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleListLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleListLiteral4737);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2111:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==12) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2111:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSimpleListLiteral4750); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleListLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2115:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2116:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2116:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2117:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleListLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleListLiteral4771);
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleSimpleListLiteral4787); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2145:1: entryRuleSimpleSetLiteral returns [EObject current=null] : iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF ;
    public final EObject entryRuleSimpleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2146:2: (iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2147:2: iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleSetLiteral_in_entryRuleSimpleSetLiteral4823);
            iv_ruleSimpleSetLiteral=ruleSimpleSetLiteral();

            state._fsp--;

             current =iv_ruleSimpleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSetLiteral4833); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2154:1: ruleSimpleSetLiteral returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSimpleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2157:28: ( (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2158:1: (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2158:1: (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2158:3: otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSimpleSetLiteral4870); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleSetLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2162:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2163:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleSetLiteralAccess().getSimpleSetLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2168:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_LIT||LA53_0==13||LA53_0==30||LA53_0==35||(LA53_0>=37 && LA53_0<=38)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2168:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2168:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2169:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2169:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2170:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral4901);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2186:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==12) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2186:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSimpleSetLiteral4914); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleSetLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2190:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2191:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2191:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2192:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral4935);
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
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSimpleSetLiteral4951); 

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
    public static final BitSet FOLLOW_ruleDecl_in_ruleModel130 = new BitSet(new long[]{0x0000000000038402L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleDecl223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDecl_in_ruleDecl250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleTypeDecl332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl349 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_11_in_ruleTypeDecl367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl387 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleTypeDecl400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl420 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_13_in_ruleTypeDecl437 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleTypeDecl455 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDecl473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleTypeDecl490 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleTypeDecl511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDecl_in_entryRuleComponentDecl549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDecl559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleComponentDecl598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16_in_ruleComponentDecl627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17_in_ruleComponentDecl656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl684 = new BitSet(new long[]{0x0000000000082802L});
    public static final BitSet FOLLOW_11_in_ruleComponentDecl702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl722 = new BitSet(new long[]{0x00000000000C2002L});
    public static final BitSet FOLLOW_18_in_ruleComponentDecl735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl755 = new BitSet(new long[]{0x00000000000C2002L});
    public static final BitSet FOLLOW_13_in_ruleComponentDecl772 = new BitSet(new long[]{0x0000000007C04010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleComponentDecl793 = new BitSet(new long[]{0x0000000007C04010L});
    public static final BitSet FOLLOW_14_in_ruleComponentDecl806 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleComponentDecl821 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComponentDecl833 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleDevice_in_ruleComponentDecl854 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleComponentDecl867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_entryRuleMemberDecl905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDecl915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_ruleMemberDecl962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberDecl_in_ruleMemberDecl989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_ruleMemberDecl1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl1051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrDecl1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleAttrDecl1107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttrDecl1124 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleAttrDecl1143 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttrDecl1164 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAttrDecl1177 = new BitSet(new long[]{0x0000006840002010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAttrDecl1220 = new BitSet(new long[]{0x0000006840002010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleModifier1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleModifier1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleModifier1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleModifier1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberDecl_in_entryRuleSubMemberDecl1426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMemberDecl1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberDecl1478 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_20_in_ruleSubMemberDecl1497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberDecl1517 = new BitSet(new long[]{0x0000000000042002L});
    public static final BitSet FOLLOW_18_in_ruleSubMemberDecl1530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberDecl1550 = new BitSet(new long[]{0x0000000000042002L});
    public static final BitSet FOLLOW_13_in_ruleSubMemberDecl1565 = new BitSet(new long[]{0x0000000007C04010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleSubMemberDecl1586 = new BitSet(new long[]{0x0000000007C04010L});
    public static final BitSet FOLLOW_14_in_ruleSubMemberDecl1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSubMemberDecl1621 = new BitSet(new long[]{0x0000000007C04010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleSubMemberDecl1642 = new BitSet(new long[]{0x0000000007C04010L});
    public static final BitSet FOLLOW_14_in_ruleSubMemberDecl1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariantDecl1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariantDecl_in_ruleInvariantDecl1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariantDecl_in_entryRuleMultiplicityInvariantDecl1783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityInvariantDecl1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMultiplicityInvariantDecl1830 = new BitSet(new long[]{0x0000000020000050L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1848 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMultiplicityInvariantDecl1865 = new BitSet(new long[]{0x0000000020000050L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1889 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMultiplicityInvariantDecl1901 = new BitSet(new long[]{0x0000000020000050L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariantDecl1922 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleSubMemberMatch_in_ruleMultiplicityInvariantDecl1944 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleMultiplicityInvariantDecl1957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariantDecl1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberMatch_in_entryRuleSubMemberMatch2015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMemberMatch2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberMatch2068 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSubMemberMatch2085 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberMatch2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSubMemberMatch2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintNat2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAT_in_ruleConstraintNat2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleConstraintNat2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevice_in_entryRuleDevice2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevice2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice2369 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDevice2386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice2406 = new BitSet(new long[]{0x0000000000042002L});
    public static final BitSet FOLLOW_18_in_ruleDevice2419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice2439 = new BitSet(new long[]{0x0000000000042002L});
    public static final BitSet FOLLOW_13_in_ruleDevice2454 = new BitSet(new long[]{0x0000000007C04010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleDevice2475 = new BitSet(new long[]{0x0000000007C04010L});
    public static final BitSet FOLLOW_14_in_ruleDevice2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleType2583 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_30_in_ruleType2606 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleType2618 = new BitSet(new long[]{0x0000000740002002L});
    public static final BitSet FOLLOW_13_in_ruleType2647 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleType2659 = new BitSet(new long[]{0x0000000740002002L});
    public static final BitSet FOLLOW_32_in_ruleType2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleType2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType2784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicType2840 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_35_in_ruleBasicType2859 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBasicType2889 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBasicType2902 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBasicType2923 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_36_in_ruleBasicType2937 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_32_in_ruleBasicType2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBasicType2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_ruleLiteral3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_ruleLiteral3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_ruleLiteral3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleLiteral3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_ruleLiteral3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral3230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicLiteral3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicLiteral3285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleBasicLiteral3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral3343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteral3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTupleLiteral3390 = new BitSet(new long[]{0x0000007840002010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral3421 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_12_in_ruleTupleLiteral3434 = new BitSet(new long[]{0x0000006840002010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral3455 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_36_in_ruleTupleLiteral3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral3507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleListLiteral3554 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleListLiteral3575 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleListLiteral3587 = new BitSet(new long[]{0x00000068C0002020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleListLiteral3609 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_12_in_ruleListLiteral3622 = new BitSet(new long[]{0x0000006840002020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleListLiteral3643 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_31_in_ruleListLiteral3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral3695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSetLiteral3742 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleSetLiteral3763 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSetLiteral3775 = new BitSet(new long[]{0x0000006840006020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral3797 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleSetLiteral3810 = new BitSet(new long[]{0x0000006840002020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral3831 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleSetLiteral3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral3883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionLiteral3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOptionLiteral3931 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOptionLiteral3952 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleOptionLiteral3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOptionLiteral3993 = new BitSet(new long[]{0x0000006840002010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleOptionLiteral4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_entryRuleSimpleLiteral4060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLiteral4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBasicLiteral_in_ruleSimpleLiteral4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTupleLiteral_in_ruleSimpleLiteral4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleListLiteral_in_ruleSimpleLiteral4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSetLiteral_in_ruleSimpleLiteral4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOptionLiteral_in_ruleSimpleLiteral4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBasicLiteral_in_entryRuleSimpleBasicLiteral4260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBasicLiteral4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleSimpleBasicLiteral4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTupleLiteral_in_entryRuleSimpleTupleLiteral4351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTupleLiteral4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSimpleTupleLiteral4398 = new BitSet(new long[]{0x0000007840002020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral4429 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_12_in_ruleSimpleTupleLiteral4442 = new BitSet(new long[]{0x0000006840002020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral4463 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_36_in_ruleSimpleTupleLiteral4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOptionLiteral_in_entryRuleSimpleOptionLiteral4515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOptionLiteral4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSimpleOptionLiteral4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSimpleOptionLiteral4592 = new BitSet(new long[]{0x0000006840002020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleOptionLiteral4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleListLiteral_in_entryRuleSimpleListLiteral4659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleListLiteral4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSimpleListLiteral4706 = new BitSet(new long[]{0x00000068C0002020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleListLiteral4737 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_12_in_ruleSimpleListLiteral4750 = new BitSet(new long[]{0x0000006840002020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleListLiteral4771 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_31_in_ruleSimpleListLiteral4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSetLiteral_in_entryRuleSimpleSetLiteral4823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSetLiteral4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSimpleSetLiteral4870 = new BitSet(new long[]{0x0000006840006020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral4901 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleSimpleSetLiteral4914 = new BitSet(new long[]{0x0000006840002020L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral4935 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleSimpleSetLiteral4951 = new BitSet(new long[]{0x0000000000000002L});

}