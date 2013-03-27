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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NAT", "RULE_LIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'type'", "'extends'", "'with'", "'component'", "'device'", "'app'", "'{'", "'}'", "'requires'", "':'", "'='", "'const'", "'val'", "'var'", "'override'", "'Option'", "'['", "']'", "'None'", "'Some'", "'Either'", "','", "'Seq'", "'Set'", "'inv'", "'..'", "'.'", "'*'", "'constraint'", "'('", "')'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'&&'", "'||'", "'==>'", "'<=='", "'+'", "'-'", "'/'", "'%'", "'!'", "'^'", "'~'"
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
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
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

                if ( (LA1_0==10||(LA1_0>=13 && LA1_0<=15)) ) {
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
            else if ( ((LA2_0>=13 && LA2_0<=15)) ) {
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:155:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )? ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:158:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:159:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )?
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:181:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:181:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleTypeDecl367); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getExtendsKeyword_2_0());
                        
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:198:2: (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:198:4: otherlv_4= 'with' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleTypeDecl400); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getWithKeyword_2_2_0());
                    	        
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:223:1: entryRuleComponentDecl returns [EObject current=null] : iv_ruleComponentDecl= ruleComponentDecl EOF ;
    public final EObject entryRuleComponentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:224:2: (iv_ruleComponentDecl= ruleComponentDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:225:2: iv_ruleComponentDecl= ruleComponentDecl EOF
            {
             newCompositeNode(grammarAccess.getComponentDeclRule()); 
            pushFollow(FOLLOW_ruleComponentDecl_in_entryRuleComponentDecl460);
            iv_ruleComponentDecl=ruleComponentDecl();

            state._fsp--;

             current =iv_ruleComponentDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDecl470); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:232:1: ruleComponentDecl returns [EObject current=null] : ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )? ) ;
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
        EObject lv_members_12_0 = null;

        EObject lv_devices_16_0 = null;

        EObject lv_assigns_17_0 = null;

        EObject lv_exp_18_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:235:28: ( ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:236:1: ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:236:1: ( ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:236:2: ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )? (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:236:2: ( (otherlv_0= 'component' () ) | (otherlv_2= 'device' () ) | (otherlv_4= 'app' () ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:236:3: (otherlv_0= 'component' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:236:3: (otherlv_0= 'component' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:236:5: otherlv_0= 'component' ()
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleComponentDecl509); 

                        	newLeafNode(otherlv_0, grammarAccess.getComponentDeclAccess().getComponentKeyword_0_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:240:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:241:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentDeclAccess().getComponentAction_0_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:247:6: (otherlv_2= 'device' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:247:6: (otherlv_2= 'device' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:247:8: otherlv_2= 'device' ()
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleComponentDecl538); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentDeclAccess().getDeviceKeyword_0_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:251:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:252:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentDeclAccess().getDeviceAction_0_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:258:6: (otherlv_4= 'app' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:258:6: (otherlv_4= 'app' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:258:8: otherlv_4= 'app' ()
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleComponentDecl567); 

                        	newLeafNode(otherlv_4, grammarAccess.getComponentDeclAccess().getAppKeyword_0_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:262:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:263:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComponentDeclAccess().getAppAction_0_2_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:268:4: ( (lv_name_6_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:269:1: (lv_name_6_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:269:1: (lv_name_6_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:270:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl595); 

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:286:2: (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:286:4: otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleComponentDecl613); 

                        	newLeafNode(otherlv_7, grammarAccess.getComponentDeclAccess().getExtendsKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:290:1: ( (otherlv_8= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:291:1: (otherlv_8= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:291:1: (otherlv_8= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:292:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentDeclRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl633); 

                    		newLeafNode(otherlv_8, grammarAccess.getComponentDeclAccess().getSupersComponentDeclCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:303:2: (otherlv_9= 'with' ( (otherlv_10= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==12) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:303:4: otherlv_9= 'with' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleComponentDecl646); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getComponentDeclAccess().getWithKeyword_2_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:307:1: ( (otherlv_10= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:308:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:308:1: (otherlv_10= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:309:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getComponentDeclRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDecl666); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getComponentDeclAccess().getSupersComponentDeclCrossReference_2_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:320:6: (otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:320:8: otherlv_11= '{' ( (lv_members_12_0= ruleMemberDecl ) )* otherlv_13= '}'
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleComponentDecl683); 

                        	newLeafNode(otherlv_11, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:324:1: ( (lv_members_12_0= ruleMemberDecl ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID||(LA8_0>=21 && LA8_0<=24)||LA8_0==34) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:325:1: (lv_members_12_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:325:1: (lv_members_12_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:326:3: lv_members_12_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getMembersMemberDeclParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleComponentDecl704);
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleComponentDecl717); 

                        	newLeafNode(otherlv_13, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:346:3: (otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:346:5: otherlv_14= 'requires' otherlv_15= '{' ( (lv_devices_16_0= ruleDevice ) )* ( (lv_assigns_17_0= ruleAssignment ) )* ( (lv_exp_18_0= ruleExp ) ) otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleComponentDecl732); 

                        	newLeafNode(otherlv_14, grammarAccess.getComponentDeclAccess().getRequiresKeyword_4_0());
                        
                    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleComponentDecl744); 

                        	newLeafNode(otherlv_15, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:354:1: ( (lv_devices_16_0= ruleDevice ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1==19) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:355:1: (lv_devices_16_0= ruleDevice )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:355:1: (lv_devices_16_0= ruleDevice )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:356:3: lv_devices_16_0= ruleDevice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getDevicesDeviceParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDevice_in_ruleComponentDecl765);
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
                    	    break loop10;
                        }
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:372:3: ( (lv_assigns_17_0= ruleAssignment ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==20) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:373:1: (lv_assigns_17_0= ruleAssignment )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:373:1: (lv_assigns_17_0= ruleAssignment )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:374:3: lv_assigns_17_0= ruleAssignment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getAssignsAssignmentParserRuleCall_4_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAssignment_in_ruleComponentDecl787);
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
                    	    break loop11;
                        }
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:390:3: ( (lv_exp_18_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:391:1: (lv_exp_18_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:391:1: (lv_exp_18_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:392:3: lv_exp_18_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentDeclAccess().getExpExpParserRuleCall_4_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleComponentDecl809);
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

                    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleComponentDecl821); 

                        	newLeafNode(otherlv_19, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_4_5());
                        

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:420:1: entryRuleMemberDecl returns [EObject current=null] : iv_ruleMemberDecl= ruleMemberDecl EOF ;
    public final EObject entryRuleMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:421:2: (iv_ruleMemberDecl= ruleMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:422:2: iv_ruleMemberDecl= ruleMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getMemberDeclRule()); 
            pushFollow(FOLLOW_ruleMemberDecl_in_entryRuleMemberDecl859);
            iv_ruleMemberDecl=ruleMemberDecl();

            state._fsp--;

             current =iv_ruleMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDecl869); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:429:1: ruleMemberDecl returns [EObject current=null] : (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl ) ;
    public final EObject ruleMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject this_AttrDecl_0 = null;

        EObject this_SubMemberDecl_1 = null;

        EObject this_InvariantDecl_2 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:432:28: ( (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:433:1: (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:433:1: (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 34:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:434:5: this_AttrDecl_0= ruleAttrDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getAttrDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAttrDecl_in_ruleMemberDecl916);
                    this_AttrDecl_0=ruleAttrDecl();

                    state._fsp--;

                     
                            current = this_AttrDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:444:5: this_SubMemberDecl_1= ruleSubMemberDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getSubMemberDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSubMemberDecl_in_ruleMemberDecl943);
                    this_SubMemberDecl_1=ruleSubMemberDecl();

                    state._fsp--;

                     
                            current = this_SubMemberDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:454:5: this_InvariantDecl_2= ruleInvariantDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getInvariantDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInvariantDecl_in_ruleMemberDecl970);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:470:1: entryRuleAttrDecl returns [EObject current=null] : iv_ruleAttrDecl= ruleAttrDecl EOF ;
    public final EObject entryRuleAttrDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:471:2: (iv_ruleAttrDecl= ruleAttrDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:472:2: iv_ruleAttrDecl= ruleAttrDecl EOF
            {
             newCompositeNode(grammarAccess.getAttrDeclRule()); 
            pushFollow(FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl1005);
            iv_ruleAttrDecl=ruleAttrDecl();

            state._fsp--;

             current =iv_ruleAttrDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrDecl1015); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:479:1: ruleAttrDecl returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:482:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:483:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:483:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:483:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:483:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:484:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:484:1: (lv_modifier_0_0= ruleModifier )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:485:3: lv_modifier_0_0= ruleModifier
            {
             
            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModifier_in_ruleAttrDecl1061);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:501:2: ( (lv_attributeName_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:502:1: (lv_attributeName_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:502:1: (lv_attributeName_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:503:3: lv_attributeName_1_0= RULE_ID
            {
            lv_attributeName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttrDecl1078); 

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:519:2: ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            else if ( (LA15_0==20) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:519:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:519:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:519:5: otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )?
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAttrDecl1097); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttrDeclAccess().getColonKeyword_2_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:523:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:524:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:524:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:525:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAttrDecl1118);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:541:2: (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==20) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:541:4: otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) )
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleAttrDecl1131); 

                                	newLeafNode(otherlv_4, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_0_2_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:545:1: ( (lv_literal_5_0= ruleLiteral ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:546:1: (lv_literal_5_0= ruleLiteral )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:546:1: (lv_literal_5_0= ruleLiteral )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:547:3: lv_literal_5_0= ruleLiteral
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl1152);
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:564:6: (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:564:6: (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:564:8: otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleAttrDecl1174); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:568:1: ( (lv_literal_7_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:569:1: (lv_literal_7_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:569:1: (lv_literal_7_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:570:3: lv_literal_7_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl1195);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:594:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:595:2: (iv_ruleModifier= ruleModifier EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:596:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier1234);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier1245); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:603:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'override' ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:606:28: ( (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'override' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:607:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'override' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:607:1: (kw= 'const' | kw= 'val' | kw= 'var' | kw= 'override' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt16=1;
                }
                break;
            case 22:
                {
                alt16=2;
                }
                break;
            case 23:
                {
                alt16=3;
                }
                break;
            case 24:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:608:2: kw= 'const'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleModifier1283); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getConstKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:615:2: kw= 'val'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleModifier1302); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getValKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:622:2: kw= 'var'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleModifier1321); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getVarKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:629:2: kw= 'override'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleModifier1340); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getOverrideKeyword_3()); 
                        

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:642:1: entryRuleSubMemberDecl returns [EObject current=null] : iv_ruleSubMemberDecl= ruleSubMemberDecl EOF ;
    public final EObject entryRuleSubMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:643:2: (iv_ruleSubMemberDecl= ruleSubMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:644:2: iv_ruleSubMemberDecl= ruleSubMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getSubMemberDeclRule()); 
            pushFollow(FOLLOW_ruleSubMemberDecl_in_entryRuleSubMemberDecl1380);
            iv_ruleSubMemberDecl=ruleSubMemberDecl();

            state._fsp--;

             current =iv_ruleSubMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMemberDecl1390); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:651:1: ruleSubMemberDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) ) ;
    public final EObject ruleSubMemberDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:654:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:655:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:655:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:655:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleFeatureType ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:655:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:656:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:656:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:657:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberDecl1432); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSubMemberDecl1449); 

                	newLeafNode(otherlv_1, grammarAccess.getSubMemberDeclAccess().getColonKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:677:1: ( (lv_type_2_0= ruleFeatureType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:678:1: (lv_type_2_0= ruleFeatureType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:678:1: (lv_type_2_0= ruleFeatureType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:679:3: lv_type_2_0= ruleFeatureType
            {
             
            	        newCompositeNode(grammarAccess.getSubMemberDeclAccess().getTypeFeatureTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFeatureType_in_ruleSubMemberDecl1470);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:703:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:704:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:705:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1506);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1516); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:712:1: ruleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:715:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExp ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:716:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:716:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExp ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:716:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExp ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:716:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:717:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:717:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:718:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1558); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAssignment1575); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:738:1: ( (lv_exp_2_0= ruleExp ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:739:1: (lv_exp_2_0= ruleExp )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:739:1: (lv_exp_2_0= ruleExp )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:740:3: lv_exp_2_0= ruleExp
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExp_in_ruleAssignment1596);
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


    // $ANTLR start "entryRuleFeatureType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:766:1: entryRuleFeatureType returns [EObject current=null] : iv_ruleFeatureType= ruleFeatureType EOF ;
    public final EObject entryRuleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:767:2: (iv_ruleFeatureType= ruleFeatureType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:768:2: iv_ruleFeatureType= ruleFeatureType EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_ruleFeatureType_in_entryRuleFeatureType1634);
            iv_ruleFeatureType=ruleFeatureType();

            state._fsp--;

             current =iv_ruleFeatureType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureType1644); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:775:1: ruleFeatureType returns [EObject current=null] : (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? ) | (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? ) | (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? ) | (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? ) | (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? ) ) ;
    public final EObject ruleFeatureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_none_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_choice_25_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        EObject this_BaseFeatureType_0 = null;

        EObject lv_base_4_0 = null;

        EObject lv_base_11_0 = null;

        EObject lv_members_15_0 = null;

        EObject lv_bases_20_0 = null;

        EObject lv_bases_22_0 = null;

        EObject lv_members_27_0 = null;

        EObject lv_base_32_0 = null;

        EObject lv_elements_36_0 = null;

        EObject lv_elements_38_0 = null;

        EObject lv_base_43_0 = null;

        EObject lv_elements_47_0 = null;

        EObject lv_elements_49_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:778:28: ( (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? ) | (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? ) | (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? ) | (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? ) | (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:779:1: (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? ) | (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? ) | (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? ) | (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? ) | (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:779:1: (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? ) | (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? ) | (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? ) | (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? ) | (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? ) )
            int alt29=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt29=1;
                }
                break;
            case 25:
                {
                alt29=2;
                }
                break;
            case 29:
                {
                alt29=3;
                }
                break;
            case 30:
                {
                alt29=4;
                }
                break;
            case 32:
                {
                alt29=5;
                }
                break;
            case 33:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:780:5: this_BaseFeatureType_0= ruleBaseFeatureType
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseFeatureTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType1691);
                    this_BaseFeatureType_0=ruleBaseFeatureType();

                    state._fsp--;

                     
                            current = this_BaseFeatureType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:789:6: (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:789:6: (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:789:8: otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )?
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleFeatureType1709); 

                        	newLeafNode(otherlv_1, grammarAccess.getFeatureTypeAccess().getOptionKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:793:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:794:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getOptionFeatureTypeAction_1_1(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType1730); 

                        	newLeafNode(otherlv_3, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:803:1: ( (lv_base_4_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:804:1: (lv_base_4_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:804:1: (lv_base_4_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:805:3: lv_base_4_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType1751);
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

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleFeatureType1763); 

                        	newLeafNode(otherlv_5, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_1_4());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:825:1: (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==20) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:825:3: otherlv_6= '=' ( (lv_none_7_0= 'None' ) )
                            {
                            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleFeatureType1776); 

                                	newLeafNode(otherlv_6, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_1_5_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:829:1: ( (lv_none_7_0= 'None' ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:830:1: (lv_none_7_0= 'None' )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:830:1: (lv_none_7_0= 'None' )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:831:3: lv_none_7_0= 'None'
                            {
                            lv_none_7_0=(Token)match(input,28,FOLLOW_28_in_ruleFeatureType1794); 

                                    newLeafNode(lv_none_7_0, grammarAccess.getFeatureTypeAccess().getNoneNoneKeyword_1_5_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFeatureTypeRule());
                            	        }
                                   		setWithLastConsumed(current, "none", true, "None");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:845:6: (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:845:6: (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:845:8: otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )?
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleFeatureType1829); 

                        	newLeafNode(otherlv_8, grammarAccess.getFeatureTypeAccess().getSomeKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:849:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:850:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getSomeFeatureTypeAction_2_1(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType1850); 

                        	newLeafNode(otherlv_10, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_2_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:859:1: ( (lv_base_11_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:860:1: (lv_base_11_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:860:1: (lv_base_11_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:861:3: lv_base_11_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType1871);
                    lv_base_11_0=ruleBaseFeatureType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_11_0, 
                            		"BaseFeatureType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleFeatureType1883); 

                        	newLeafNode(otherlv_12, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_2_4());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:881:1: (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==20) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:881:3: otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}'
                            {
                            otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleFeatureType1896); 

                                	newLeafNode(otherlv_13, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_2_5_0());
                                
                            otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleFeatureType1908); 

                                	newLeafNode(otherlv_14, grammarAccess.getFeatureTypeAccess().getLeftCurlyBracketKeyword_2_5_1());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:889:1: ( (lv_members_15_0= ruleMemberDecl ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_ID||(LA18_0>=21 && LA18_0<=24)||LA18_0==34) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:890:1: (lv_members_15_0= ruleMemberDecl )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:890:1: (lv_members_15_0= ruleMemberDecl )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:891:3: lv_members_15_0= ruleMemberDecl
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getMembersMemberDeclParserRuleCall_2_5_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleFeatureType1929);
                            	    lv_members_15_0=ruleMemberDecl();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"members",
                            	            		lv_members_15_0, 
                            	            		"MemberDecl");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleFeatureType1942); 

                                	newLeafNode(otherlv_16, grammarAccess.getFeatureTypeAccess().getRightCurlyBracketKeyword_2_5_3());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:912:6: (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:912:6: (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:912:8: otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )?
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_30_in_ruleFeatureType1964); 

                        	newLeafNode(otherlv_17, grammarAccess.getFeatureTypeAccess().getEitherKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:916:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:917:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getEitherFeatureTypeAction_3_1(),
                                current);
                        

                    }

                    otherlv_19=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType1985); 

                        	newLeafNode(otherlv_19, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_3_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:926:1: ( (lv_bases_20_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:927:1: (lv_bases_20_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:927:1: (lv_bases_20_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:928:3: lv_bases_20_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBasesBaseFeatureTypeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2006);
                    lv_bases_20_0=ruleBaseFeatureType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"bases",
                            		lv_bases_20_0, 
                            		"BaseFeatureType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:944:2: (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==31) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:944:4: otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) )
                    	    {
                    	    otherlv_21=(Token)match(input,31,FOLLOW_31_in_ruleFeatureType2019); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getFeatureTypeAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:948:1: ( (lv_bases_22_0= ruleBaseFeatureType ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:949:1: (lv_bases_22_0= ruleBaseFeatureType )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:949:1: (lv_bases_22_0= ruleBaseFeatureType )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:950:3: lv_bases_22_0= ruleBaseFeatureType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBasesBaseFeatureTypeParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2040);
                    	    lv_bases_22_0=ruleBaseFeatureType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"bases",
                    	            		lv_bases_22_0, 
                    	            		"BaseFeatureType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    otherlv_23=(Token)match(input,27,FOLLOW_27_in_ruleFeatureType2054); 

                        	newLeafNode(otherlv_23, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_3_5());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:970:1: (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==20) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:970:3: otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}'
                            {
                            otherlv_24=(Token)match(input,20,FOLLOW_20_in_ruleFeatureType2067); 

                                	newLeafNode(otherlv_24, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_3_6_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:974:1: ( (lv_choice_25_0= RULE_NAT ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:975:1: (lv_choice_25_0= RULE_NAT )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:975:1: (lv_choice_25_0= RULE_NAT )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:976:3: lv_choice_25_0= RULE_NAT
                            {
                            lv_choice_25_0=(Token)match(input,RULE_NAT,FOLLOW_RULE_NAT_in_ruleFeatureType2084); 

                            			newLeafNode(lv_choice_25_0, grammarAccess.getFeatureTypeAccess().getChoiceNATTerminalRuleCall_3_6_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFeatureTypeRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"choice",
                                    		lv_choice_25_0, 
                                    		"NAT");
                            	    

                            }


                            }

                            otherlv_26=(Token)match(input,16,FOLLOW_16_in_ruleFeatureType2101); 

                                	newLeafNode(otherlv_26, grammarAccess.getFeatureTypeAccess().getLeftCurlyBracketKeyword_3_6_2());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:996:1: ( (lv_members_27_0= ruleMemberDecl ) )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==RULE_ID||(LA21_0>=21 && LA21_0<=24)||LA21_0==34) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:997:1: (lv_members_27_0= ruleMemberDecl )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:997:1: (lv_members_27_0= ruleMemberDecl )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:998:3: lv_members_27_0= ruleMemberDecl
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getMembersMemberDeclParserRuleCall_3_6_3_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleFeatureType2122);
                            	    lv_members_27_0=ruleMemberDecl();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"members",
                            	            		lv_members_27_0, 
                            	            		"MemberDecl");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);

                            otherlv_28=(Token)match(input,17,FOLLOW_17_in_ruleFeatureType2135); 

                                	newLeafNode(otherlv_28, grammarAccess.getFeatureTypeAccess().getRightCurlyBracketKeyword_3_6_4());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1019:6: (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1019:6: (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1019:8: otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )?
                    {
                    otherlv_29=(Token)match(input,32,FOLLOW_32_in_ruleFeatureType2157); 

                        	newLeafNode(otherlv_29, grammarAccess.getFeatureTypeAccess().getSeqKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1023:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1024:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getSeqFeatureTypeAction_4_1(),
                                current);
                        

                    }

                    otherlv_31=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType2178); 

                        	newLeafNode(otherlv_31, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_4_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1033:1: ( (lv_base_32_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1034:1: (lv_base_32_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1034:1: (lv_base_32_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1035:3: lv_base_32_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2199);
                    lv_base_32_0=ruleBaseFeatureType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_32_0, 
                            		"BaseFeatureType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_33=(Token)match(input,27,FOLLOW_27_in_ruleFeatureType2211); 

                        	newLeafNode(otherlv_33, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_4_4());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1055:1: (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==20) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1055:3: otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']'
                            {
                            otherlv_34=(Token)match(input,20,FOLLOW_20_in_ruleFeatureType2224); 

                                	newLeafNode(otherlv_34, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_4_5_0());
                                
                            otherlv_35=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType2236); 

                                	newLeafNode(otherlv_35, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_4_5_1());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1063:1: ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==RULE_ID) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1063:2: ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )*
                                    {
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1063:2: ( (lv_elements_36_0= ruleBaseFeatureType ) )
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1064:1: (lv_elements_36_0= ruleBaseFeatureType )
                                    {
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1064:1: (lv_elements_36_0= ruleBaseFeatureType )
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1065:3: lv_elements_36_0= ruleBaseFeatureType
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getElementsBaseFeatureTypeParserRuleCall_4_5_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2258);
                                    lv_elements_36_0=ruleBaseFeatureType();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"elements",
                                            		lv_elements_36_0, 
                                            		"BaseFeatureType");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1081:2: (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )*
                                    loop23:
                                    do {
                                        int alt23=2;
                                        int LA23_0 = input.LA(1);

                                        if ( (LA23_0==31) ) {
                                            alt23=1;
                                        }


                                        switch (alt23) {
                                    	case 1 :
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1081:4: otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) )
                                    	    {
                                    	    otherlv_37=(Token)match(input,31,FOLLOW_31_in_ruleFeatureType2271); 

                                    	        	newLeafNode(otherlv_37, grammarAccess.getFeatureTypeAccess().getCommaKeyword_4_5_2_1_0());
                                    	        
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1085:1: ( (lv_elements_38_0= ruleBaseFeatureType ) )
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1086:1: (lv_elements_38_0= ruleBaseFeatureType )
                                    	    {
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1086:1: (lv_elements_38_0= ruleBaseFeatureType )
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1087:3: lv_elements_38_0= ruleBaseFeatureType
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getElementsBaseFeatureTypeParserRuleCall_4_5_2_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2292);
                                    	    lv_elements_38_0=ruleBaseFeatureType();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"elements",
                                    	            		lv_elements_38_0, 
                                    	            		"BaseFeatureType");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop23;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_39=(Token)match(input,27,FOLLOW_27_in_ruleFeatureType2308); 

                                	newLeafNode(otherlv_39, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_4_5_3());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1108:6: (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1108:6: (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1108:8: otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )?
                    {
                    otherlv_40=(Token)match(input,33,FOLLOW_33_in_ruleFeatureType2330); 

                        	newLeafNode(otherlv_40, grammarAccess.getFeatureTypeAccess().getSetKeyword_5_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1112:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1113:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getSetFeatureTypeAction_5_1(),
                                current);
                        

                    }

                    otherlv_42=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType2351); 

                        	newLeafNode(otherlv_42, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_5_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1122:1: ( (lv_base_43_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1123:1: (lv_base_43_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1123:1: (lv_base_43_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1124:3: lv_base_43_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2372);
                    lv_base_43_0=ruleBaseFeatureType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"base",
                            		lv_base_43_0, 
                            		"BaseFeatureType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_44=(Token)match(input,27,FOLLOW_27_in_ruleFeatureType2384); 

                        	newLeafNode(otherlv_44, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_5_4());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1144:1: (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==20) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1144:3: otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}'
                            {
                            otherlv_45=(Token)match(input,20,FOLLOW_20_in_ruleFeatureType2397); 

                                	newLeafNode(otherlv_45, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_5_5_0());
                                
                            otherlv_46=(Token)match(input,16,FOLLOW_16_in_ruleFeatureType2409); 

                                	newLeafNode(otherlv_46, grammarAccess.getFeatureTypeAccess().getLeftCurlyBracketKeyword_5_5_1());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1152:1: ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==RULE_ID) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1152:2: ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )*
                                    {
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1152:2: ( (lv_elements_47_0= ruleBaseFeatureType ) )
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1153:1: (lv_elements_47_0= ruleBaseFeatureType )
                                    {
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1153:1: (lv_elements_47_0= ruleBaseFeatureType )
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1154:3: lv_elements_47_0= ruleBaseFeatureType
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getElementsBaseFeatureTypeParserRuleCall_5_5_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2431);
                                    lv_elements_47_0=ruleBaseFeatureType();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"elements",
                                            		lv_elements_47_0, 
                                            		"BaseFeatureType");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1170:2: (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )*
                                    loop26:
                                    do {
                                        int alt26=2;
                                        int LA26_0 = input.LA(1);

                                        if ( (LA26_0==31) ) {
                                            alt26=1;
                                        }


                                        switch (alt26) {
                                    	case 1 :
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1170:4: otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) )
                                    	    {
                                    	    otherlv_48=(Token)match(input,31,FOLLOW_31_in_ruleFeatureType2444); 

                                    	        	newLeafNode(otherlv_48, grammarAccess.getFeatureTypeAccess().getCommaKeyword_5_5_2_1_0());
                                    	        
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1174:1: ( (lv_elements_49_0= ruleBaseFeatureType ) )
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1175:1: (lv_elements_49_0= ruleBaseFeatureType )
                                    	    {
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1175:1: (lv_elements_49_0= ruleBaseFeatureType )
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1176:3: lv_elements_49_0= ruleBaseFeatureType
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getElementsBaseFeatureTypeParserRuleCall_5_5_2_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2465);
                                    	    lv_elements_49_0=ruleBaseFeatureType();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"elements",
                                    	            		lv_elements_49_0, 
                                    	            		"BaseFeatureType");
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

                            otherlv_50=(Token)match(input,17,FOLLOW_17_in_ruleFeatureType2481); 

                                	newLeafNode(otherlv_50, grammarAccess.getFeatureTypeAccess().getRightCurlyBracketKeyword_5_5_3());
                                

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1204:1: entryRuleBaseFeatureType returns [EObject current=null] : iv_ruleBaseFeatureType= ruleBaseFeatureType EOF ;
    public final EObject entryRuleBaseFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseFeatureType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1205:2: (iv_ruleBaseFeatureType= ruleBaseFeatureType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1206:2: iv_ruleBaseFeatureType= ruleBaseFeatureType EOF
            {
             newCompositeNode(grammarAccess.getBaseFeatureTypeRule()); 
            pushFollow(FOLLOW_ruleBaseFeatureType_in_entryRuleBaseFeatureType2520);
            iv_ruleBaseFeatureType=ruleBaseFeatureType();

            state._fsp--;

             current =iv_ruleBaseFeatureType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseFeatureType2530); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1213:1: ruleBaseFeatureType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1216:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1217:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1217:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1217:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1217:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1218:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1218:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1219:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBaseFeatureTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseFeatureType2575); 

            		newLeafNode(otherlv_0, grammarAccess.getBaseFeatureTypeAccess().getComponentsComponentDeclCrossReference_0_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1230:2: (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==12) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1230:4: otherlv_1= 'with' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleBaseFeatureType2588); 

            	        	newLeafNode(otherlv_1, grammarAccess.getBaseFeatureTypeAccess().getWithKeyword_1_0());
            	        
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1234:1: ( (otherlv_2= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1235:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1235:1: (otherlv_2= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1236:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBaseFeatureTypeRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseFeatureType2608); 

            	    		newLeafNode(otherlv_2, grammarAccess.getBaseFeatureTypeAccess().getComponentsComponentDeclCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1247:4: (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1247:6: otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleBaseFeatureType2623); 

                        	newLeafNode(otherlv_3, grammarAccess.getBaseFeatureTypeAccess().getEqualsSignKeyword_2_0());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleBaseFeatureType2635); 

                        	newLeafNode(otherlv_4, grammarAccess.getBaseFeatureTypeAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1255:1: ( (lv_members_5_0= ruleMemberDecl ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID||(LA31_0>=21 && LA31_0<=24)||LA31_0==34) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1256:1: (lv_members_5_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1256:1: (lv_members_5_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1257:3: lv_members_5_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBaseFeatureTypeAccess().getMembersMemberDeclParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleBaseFeatureType2656);
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleBaseFeatureType2669); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1285:1: entryRuleInvariantDecl returns [EObject current=null] : iv_ruleInvariantDecl= ruleInvariantDecl EOF ;
    public final EObject entryRuleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1286:2: (iv_ruleInvariantDecl= ruleInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1287:2: iv_ruleInvariantDecl= ruleInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl2707);
            iv_ruleInvariantDecl=ruleInvariantDecl();

            state._fsp--;

             current =iv_ruleInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariantDecl2717); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1294:1: ruleInvariantDecl returns [EObject current=null] : (this_MultiplicityInvariant_0= ruleMultiplicityInvariant | this_GeneralInvariant_1= ruleGeneralInvariant ) ;
    public final EObject ruleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicityInvariant_0 = null;

        EObject this_GeneralInvariant_1 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1297:28: ( (this_MultiplicityInvariant_0= ruleMultiplicityInvariant | this_GeneralInvariant_1= ruleGeneralInvariant ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1298:1: (this_MultiplicityInvariant_0= ruleMultiplicityInvariant | this_GeneralInvariant_1= ruleGeneralInvariant )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1298:1: (this_MultiplicityInvariant_0= ruleMultiplicityInvariant | this_GeneralInvariant_1= ruleGeneralInvariant )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA33_2 = input.LA(3);

                    if ( (LA33_2==19) ) {
                        int LA33_5 = input.LA(4);

                        if ( (LA33_5==RULE_NAT||LA33_5==37) ) {
                            alt33=1;
                        }
                        else if ( (LA33_5==RULE_ID||LA33_5==39) ) {
                            alt33=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA33_2==EOF||LA33_2==RULE_ID||LA33_2==RULE_LIT||LA33_2==17||(LA33_2>=21 && LA33_2<=24)||LA33_2==34||LA33_2==36) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_NAT:
                case 37:
                    {
                    alt33=1;
                    }
                    break;
                case 39:
                    {
                    alt33=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1299:5: this_MultiplicityInvariant_0= ruleMultiplicityInvariant
                    {
                     
                            newCompositeNode(grammarAccess.getInvariantDeclAccess().getMultiplicityInvariantParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMultiplicityInvariant_in_ruleInvariantDecl2764);
                    this_MultiplicityInvariant_0=ruleMultiplicityInvariant();

                    state._fsp--;

                     
                            current = this_MultiplicityInvariant_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1309:5: this_GeneralInvariant_1= ruleGeneralInvariant
                    {
                     
                            newCompositeNode(grammarAccess.getInvariantDeclAccess().getGeneralInvariantParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGeneralInvariant_in_ruleInvariantDecl2791);
                    this_GeneralInvariant_1=ruleGeneralInvariant();

                    state._fsp--;

                     
                            current = this_GeneralInvariant_1; 
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


    // $ANTLR start "entryRuleMultiplicityInvariant"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1325:1: entryRuleMultiplicityInvariant returns [EObject current=null] : iv_ruleMultiplicityInvariant= ruleMultiplicityInvariant EOF ;
    public final EObject entryRuleMultiplicityInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityInvariant = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1326:2: (iv_ruleMultiplicityInvariant= ruleMultiplicityInvariant EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1327:2: iv_ruleMultiplicityInvariant= ruleMultiplicityInvariant EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityInvariantRule()); 
            pushFollow(FOLLOW_ruleMultiplicityInvariant_in_entryRuleMultiplicityInvariant2826);
            iv_ruleMultiplicityInvariant=ruleMultiplicityInvariant();

            state._fsp--;

             current =iv_ruleMultiplicityInvariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityInvariant2836); 

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
    // $ANTLR end "entryRuleMultiplicityInvariant"


    // $ANTLR start "ruleMultiplicityInvariant"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1334:1: ruleMultiplicityInvariant returns [EObject current=null] : (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) ;
    public final EObject ruleMultiplicityInvariant() throws RecognitionException {
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1337:28: ( (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1338:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1338:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1338:3: otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleMultiplicityInvariant2873); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiplicityInvariantAccess().getInvKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1342:1: ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1342:2: ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1342:2: ( (lv_invName_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1343:1: (lv_invName_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1343:1: (lv_invName_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1344:3: lv_invName_1_0= RULE_ID
                    {
                    lv_invName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariant2891); 

                    			newLeafNode(lv_invName_1_0, grammarAccess.getMultiplicityInvariantAccess().getInvNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityInvariantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"invName",
                            		lv_invName_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMultiplicityInvariant2908); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiplicityInvariantAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1364:3: ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1364:4: ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1364:4: ( (lv_lo_3_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1365:1: (lv_lo_3_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1365:1: (lv_lo_3_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1366:3: lv_lo_3_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantAccess().getLoConstraintNatParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariant2932);
            lv_lo_3_0=ruleConstraintNat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicityInvariantRule());
            	        }
                   		set(
                   			current, 
                   			"lo",
                    		lv_lo_3_0, 
                    		"ConstraintNat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleMultiplicityInvariant2944); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiplicityInvariantAccess().getFullStopFullStopKeyword_2_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1386:1: ( (lv_hi_5_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1387:1: (lv_hi_5_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1387:1: (lv_hi_5_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1388:3: lv_hi_5_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantAccess().getHiConstraintNatParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariant2965);
            lv_hi_5_0=ruleConstraintNat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicityInvariantRule());
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1404:3: ( (lv_match_6_0= ruleSubMemberMatch ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1405:1: (lv_match_6_0= ruleSubMemberMatch )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1405:1: (lv_match_6_0= ruleSubMemberMatch )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1406:3: lv_match_6_0= ruleSubMemberMatch
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantAccess().getMatchSubMemberMatchParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSubMemberMatch_in_ruleMultiplicityInvariant2987);
            lv_match_6_0=ruleSubMemberMatch();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicityInvariantRule());
            	        }
                   		set(
                   			current, 
                   			"match",
                    		lv_match_6_0, 
                    		"SubMemberMatch");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1422:2: (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==19) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1422:4: otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleMultiplicityInvariant3000); 

                        	newLeafNode(otherlv_7, grammarAccess.getMultiplicityInvariantAccess().getColonKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1426:1: ( (otherlv_8= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1427:1: (otherlv_8= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1427:1: (otherlv_8= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1428:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityInvariantRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariant3020); 

                    		newLeafNode(otherlv_8, grammarAccess.getMultiplicityInvariantAccess().getTypeComponentDeclCrossReference_4_1_0()); 
                    	

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
    // $ANTLR end "ruleMultiplicityInvariant"


    // $ANTLR start "entryRuleGeneralInvariant"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1447:1: entryRuleGeneralInvariant returns [EObject current=null] : iv_ruleGeneralInvariant= ruleGeneralInvariant EOF ;
    public final EObject entryRuleGeneralInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralInvariant = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1448:2: (iv_ruleGeneralInvariant= ruleGeneralInvariant EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1449:2: iv_ruleGeneralInvariant= ruleGeneralInvariant EOF
            {
             newCompositeNode(grammarAccess.getGeneralInvariantRule()); 
            pushFollow(FOLLOW_ruleGeneralInvariant_in_entryRuleGeneralInvariant3058);
            iv_ruleGeneralInvariant=ruleGeneralInvariant();

            state._fsp--;

             current =iv_ruleGeneralInvariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralInvariant3068); 

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
    // $ANTLR end "entryRuleGeneralInvariant"


    // $ANTLR start "ruleGeneralInvariant"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1456:1: ruleGeneralInvariant returns [EObject current=null] : (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleGeneralInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_invName_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1459:28: ( (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1460:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1460:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1460:3: otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleGeneralInvariant3105); 

                	newLeafNode(otherlv_0, grammarAccess.getGeneralInvariantAccess().getInvKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1464:1: ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==19) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1464:2: ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1464:2: ( (lv_invName_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1465:1: (lv_invName_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1465:1: (lv_invName_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1466:3: lv_invName_1_0= RULE_ID
                    {
                    lv_invName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralInvariant3123); 

                    			newLeafNode(lv_invName_1_0, grammarAccess.getGeneralInvariantAccess().getInvNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneralInvariantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"invName",
                            		lv_invName_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleGeneralInvariant3140); 

                        	newLeafNode(otherlv_2, grammarAccess.getGeneralInvariantAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1486:3: ( (lv_exp_3_0= ruleExp ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1487:1: (lv_exp_3_0= ruleExp )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1487:1: (lv_exp_3_0= ruleExp )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1488:3: lv_exp_3_0= ruleExp
            {
             
            	        newCompositeNode(grammarAccess.getGeneralInvariantAccess().getExpExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExp_in_ruleGeneralInvariant3163);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneralInvariantRule());
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
    // $ANTLR end "ruleGeneralInvariant"


    // $ANTLR start "entryRuleSubMemberMatch"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1512:1: entryRuleSubMemberMatch returns [EObject current=null] : iv_ruleSubMemberMatch= ruleSubMemberMatch EOF ;
    public final EObject entryRuleSubMemberMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMemberMatch = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1513:2: (iv_ruleSubMemberMatch= ruleSubMemberMatch EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1514:2: iv_ruleSubMemberMatch= ruleSubMemberMatch EOF
            {
             newCompositeNode(grammarAccess.getSubMemberMatchRule()); 
            pushFollow(FOLLOW_ruleSubMemberMatch_in_entryRuleSubMemberMatch3199);
            iv_ruleSubMemberMatch=ruleSubMemberMatch();

            state._fsp--;

             current =iv_ruleSubMemberMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMemberMatch3209); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1521:1: ruleSubMemberMatch returns [EObject current=null] : ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) ) ;
    public final EObject ruleSubMemberMatch() throws RecognitionException {
        EObject current = null;

        Token lv_qNames_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_any_3_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1524:28: ( ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1525:1: ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1525:1: ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1525:2: ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1525:2: ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==36) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1525:3: ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.'
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1525:3: ( (lv_qNames_0_0= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1526:1: (lv_qNames_0_0= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1526:1: (lv_qNames_0_0= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1527:3: lv_qNames_0_0= RULE_ID
            	    {
            	    lv_qNames_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberMatch3252); 

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

            	    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleSubMemberMatch3269); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSubMemberMatchAccess().getFullStopKeyword_0_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1547:3: ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==37) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1547:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1547:4: ( (lv_name_2_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1548:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1548:1: (lv_name_2_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1549:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberMatch3289); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1566:6: ( (lv_any_3_0= '*' ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1566:6: ( (lv_any_3_0= '*' ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1567:1: (lv_any_3_0= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1567:1: (lv_any_3_0= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1568:3: lv_any_3_0= '*'
                    {
                    lv_any_3_0=(Token)match(input,37,FOLLOW_37_in_ruleSubMemberMatch3318); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1589:1: entryRuleConstraintNat returns [EObject current=null] : iv_ruleConstraintNat= ruleConstraintNat EOF ;
    public final EObject entryRuleConstraintNat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintNat = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1590:2: (iv_ruleConstraintNat= ruleConstraintNat EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1591:2: iv_ruleConstraintNat= ruleConstraintNat EOF
            {
             newCompositeNode(grammarAccess.getConstraintNatRule()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat3368);
            iv_ruleConstraintNat=ruleConstraintNat();

            state._fsp--;

             current =iv_ruleConstraintNat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintNat3378); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1598:1: ruleConstraintNat returns [EObject current=null] : ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) ;
    public final EObject ruleConstraintNat() throws RecognitionException {
        EObject current = null;

        Token lv_num_1_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1601:28: ( ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_NAT) ) {
                alt39=1;
            }
            else if ( (LA39_0==37) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:3: () ( (lv_num_1_0= RULE_NAT ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1603:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getNumNatConstraintAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1608:2: ( (lv_num_1_0= RULE_NAT ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1609:1: (lv_num_1_0= RULE_NAT )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1609:1: (lv_num_1_0= RULE_NAT )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1610:3: lv_num_1_0= RULE_NAT
                    {
                    lv_num_1_0=(Token)match(input,RULE_NAT,FOLLOW_RULE_NAT_in_ruleConstraintNat3430); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1627:6: ( () otherlv_3= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1627:6: ( () otherlv_3= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1627:7: () otherlv_3= '*'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1627:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1628:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getAnyNatConstraintAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleConstraintNat3464); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1645:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1646:2: (iv_ruleDevice= ruleDevice EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1647:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_ruleDevice_in_entryRuleDevice3501);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevice3511); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1654:1: ruleDevice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1657:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1658:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1658:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1658:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1658:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1659:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1659:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1660:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice3553); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDevice3570); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getColonKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1680:1: ( (otherlv_2= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1681:1: (otherlv_2= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1681:1: (otherlv_2= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1682:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice3590); 

            		newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getComponentsComponentDeclCrossReference_2_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1693:2: (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==12) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1693:4: otherlv_3= 'with' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDevice3603); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getWithKeyword_3_0());
            	        
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1697:1: ( (otherlv_4= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1698:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1698:1: (otherlv_4= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1699:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeviceRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice3623); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getComponentsComponentDeclCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1710:4: ( (lv_constraint_5_0= ruleConstraintExp ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1711:1: (lv_constraint_5_0= ruleConstraintExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1711:1: (lv_constraint_5_0= ruleConstraintExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1712:3: lv_constraint_5_0= ruleConstraintExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceAccess().getConstraintConstraintExpParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraintExp_in_ruleDevice3646);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1736:1: entryRuleConstraintExp returns [EObject current=null] : iv_ruleConstraintExp= ruleConstraintExp EOF ;
    public final EObject entryRuleConstraintExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintExp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1737:2: (iv_ruleConstraintExp= ruleConstraintExp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1738:2: iv_ruleConstraintExp= ruleConstraintExp EOF
            {
             newCompositeNode(grammarAccess.getConstraintExpRule()); 
            pushFollow(FOLLOW_ruleConstraintExp_in_entryRuleConstraintExp3683);
            iv_ruleConstraintExp=ruleConstraintExp();

            state._fsp--;

             current =iv_ruleConstraintExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintExp3693); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1745:1: ruleConstraintExp returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_cond_1_0= ruleExp ) ) ) ;
    public final EObject ruleConstraintExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1748:28: ( (otherlv_0= 'constraint' ( (lv_cond_1_0= ruleExp ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1749:1: (otherlv_0= 'constraint' ( (lv_cond_1_0= ruleExp ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1749:1: (otherlv_0= 'constraint' ( (lv_cond_1_0= ruleExp ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1749:3: otherlv_0= 'constraint' ( (lv_cond_1_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleConstraintExp3730); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintExpAccess().getConstraintKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1753:1: ( (lv_cond_1_0= ruleExp ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1754:1: (lv_cond_1_0= ruleExp )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1754:1: (lv_cond_1_0= ruleExp )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1755:3: lv_cond_1_0= ruleExp
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpAccess().getCondExpParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExp_in_ruleConstraintExp3751);
            lv_cond_1_0=ruleExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintExpRule());
            	        }
                   		set(
                   			current, 
                   			"cond",
                    		lv_cond_1_0, 
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
    // $ANTLR end "ruleConstraintExp"


    // $ANTLR start "entryRuleExp"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1785:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1786:2: (iv_ruleExp= ruleExp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1787:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_ruleExp_in_entryRuleExp3793);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp3803); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1794:1: ruleExp returns [EObject current=null] : ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1797:28: ( ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1798:1: ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1798:1: ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_ID||LA43_1==39) ) {
                    alt43=1;
                }
                else if ( ((LA43_1>=51 && LA43_1<=52)||(LA43_1>=55 && LA43_1<=57)) ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==RULE_ID) ) {
                alt43=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1798:2: (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1798:2: (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1798:4: otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleExp3841); 

                        	newLeafNode(otherlv_0, grammarAccess.getExpAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1802:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1803:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpAccess().getBinaryExpAction_0_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1808:2: ( (lv_left_2_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1809:1: (lv_left_2_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1809:1: (lv_left_2_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1810:3: lv_left_2_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getLeftExpParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleExp3871);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1826:2: ( (lv_op_3_0= ruleBinaryOp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1827:1: (lv_op_3_0= ruleBinaryOp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1827:1: (lv_op_3_0= ruleBinaryOp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1828:3: lv_op_3_0= ruleBinaryOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getOpBinaryOpParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBinaryOp_in_ruleExp3892);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1844:2: ( (lv_right_4_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1845:1: (lv_right_4_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1845:1: (lv_right_4_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1846:3: lv_right_4_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getRightExpParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleExp3913);
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

                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleExp3925); 

                        	newLeafNode(otherlv_5, grammarAccess.getExpAccess().getRightParenthesisKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1867:6: (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1867:6: (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1867:8: otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleExp3945); 

                        	newLeafNode(otherlv_6, grammarAccess.getExpAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1871:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1872:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpAccess().getUnaryExpAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1877:2: ( (lv_op_8_0= ruleUnaryOp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1878:1: (lv_op_8_0= ruleUnaryOp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1878:1: (lv_op_8_0= ruleUnaryOp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1879:3: lv_op_8_0= ruleUnaryOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getOpUnaryOpParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryOp_in_ruleExp3975);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1895:2: ( (lv_arg_9_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1896:1: (lv_arg_9_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1896:1: (lv_arg_9_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1897:3: lv_arg_9_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getArgExpParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleExp3996);
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

                    otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleExp4008); 

                        	newLeafNode(otherlv_10, grammarAccess.getExpAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1918:6: ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1918:6: ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1918:7: () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1918:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1919:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpAccess().getPrimaryExpAction_2_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1924:2: ( (lv_primary_12_0= rulePrimary ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1925:1: (lv_primary_12_0= rulePrimary )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1925:1: (lv_primary_12_0= rulePrimary )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1926:3: lv_primary_12_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getPrimaryPrimaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_ruleExp4046);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1942:2: (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==36) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1942:4: otherlv_13= '.' () ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,36,FOLLOW_36_in_ruleExp4059); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getExpAccess().getFullStopKeyword_2_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1946:1: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1947:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getExpAccess().getAccessExpBaseAction_2_2_1(),
                    	                current);
                    	        

                    	    }

                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1952:2: ( (otherlv_15= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1953:1: (otherlv_15= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1953:1: (otherlv_15= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1954:3: otherlv_15= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExpRule());
                    	    	        }
                    	            
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExp4088); 

                    	    		newLeafNode(otherlv_15, grammarAccess.getExpAccess().getAccessorAccessorCrossReference_2_2_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1973:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1974:2: (iv_rulePrimary= rulePrimary EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1975:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary4127);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary4137); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1982:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_lit_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1985:28: ( ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1986:1: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1986:1: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==RULE_LIT) ) {
                    alt44=2;
                }
                else if ( (LA44_1==EOF||LA44_1==RULE_ID||LA44_1==17||(LA44_1>=21 && LA44_1<=24)||LA44_1==34||(LA44_1>=36 && LA44_1<=37)||(LA44_1>=39 && LA44_1<=54)) ) {
                    alt44=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1986:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1986:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1986:3: () ( (lv_id_1_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1986:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1987:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNameExpAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1992:2: ( (lv_id_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1993:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1993:1: (lv_id_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1994:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary4189); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2011:6: ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2011:6: ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2011:7: () ( (lv_lit_3_0= ruleBasicLiteral ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2011:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2012:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getLiteralExpAction_1_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2017:2: ( (lv_lit_3_0= ruleBasicLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2018:1: (lv_lit_3_0= ruleBasicLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2018:1: (lv_lit_3_0= ruleBasicLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2019:3: lv_lit_3_0= ruleBasicLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getLitBasicLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBasicLiteral_in_rulePrimary4232);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2043:1: entryRuleBinaryOp returns [String current=null] : iv_ruleBinaryOp= ruleBinaryOp EOF ;
    public final String entryRuleBinaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2044:2: (iv_ruleBinaryOp= ruleBinaryOp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2045:2: iv_ruleBinaryOp= ruleBinaryOp EOF
            {
             newCompositeNode(grammarAccess.getBinaryOpRule()); 
            pushFollow(FOLLOW_ruleBinaryOp_in_entryRuleBinaryOp4270);
            iv_ruleBinaryOp=ruleBinaryOp();

            state._fsp--;

             current =iv_ruleBinaryOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOp4281); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2052:1: ruleBinaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2055:28: ( (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2056:1: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2056:1: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            int alt45=15;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt45=1;
                }
                break;
            case 42:
                {
                alt45=2;
                }
                break;
            case 43:
                {
                alt45=3;
                }
                break;
            case 44:
                {
                alt45=4;
                }
                break;
            case 45:
                {
                alt45=5;
                }
                break;
            case 46:
                {
                alt45=6;
                }
                break;
            case 47:
                {
                alt45=7;
                }
                break;
            case 48:
                {
                alt45=8;
                }
                break;
            case 49:
                {
                alt45=9;
                }
                break;
            case 50:
                {
                alt45=10;
                }
                break;
            case 51:
                {
                alt45=11;
                }
                break;
            case 52:
                {
                alt45=12;
                }
                break;
            case 37:
                {
                alt45=13;
                }
                break;
            case 53:
                {
                alt45=14;
                }
                break;
            case 54:
                {
                alt45=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2057:2: kw= '=='
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleBinaryOp4319); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2064:2: kw= '!='
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleBinaryOp4338); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2071:2: kw= '>='
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleBinaryOp4357); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2078:2: kw= '<='
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleBinaryOp4376); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2085:2: kw= '>'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleBinaryOp4395); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getGreaterThanSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2092:2: kw= '<'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleBinaryOp4414); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getLessThanSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2099:2: kw= '&&'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleBinaryOp4433); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getAmpersandAmpersandKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2106:2: kw= '||'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleBinaryOp4452); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getVerticalLineVerticalLineKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2113:2: kw= '==>'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleBinaryOp4471); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2120:2: kw= '<=='
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleBinaryOp4490); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getLessThanSignEqualsSignEqualsSignKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2127:2: kw= '+'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleBinaryOp4509); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getPlusSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2134:2: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleBinaryOp4528); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getHyphenMinusKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2141:2: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleBinaryOp4547); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getAsteriskKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2148:2: kw= '/'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleBinaryOp4566); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getSolidusKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2155:2: kw= '%'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleBinaryOp4585); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2168:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2169:2: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2170:2: iv_ruleUnaryOp= ruleUnaryOp EOF
            {
             newCompositeNode(grammarAccess.getUnaryOpRule()); 
            pushFollow(FOLLOW_ruleUnaryOp_in_entryRuleUnaryOp4626);
            iv_ruleUnaryOp=ruleUnaryOp();

            state._fsp--;

             current =iv_ruleUnaryOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOp4637); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2177:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2180:28: ( (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2181:1: (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2181:1: (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt46=1;
                }
                break;
            case 52:
                {
                alt46=2;
                }
                break;
            case 55:
                {
                alt46=3;
                }
                break;
            case 56:
                {
                alt46=4;
                }
                break;
            case 57:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2182:2: kw= '+'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleUnaryOp4675); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2189:2: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleUnaryOp4694); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2196:2: kw= '!'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleUnaryOp4713); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getExclamationMarkKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2203:2: kw= '^'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleUnaryOp4732); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getCircumflexAccentKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2210:2: kw= '~'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleUnaryOp4751); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2223:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2224:2: (iv_ruleType= ruleType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2225:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType4791);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType4801); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2232:1: ruleType returns [EObject current=null] : ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2235:28: ( ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2236:1: ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2236:1: ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt47=1;
                }
                break;
            case 33:
                {
                alt47=2;
                }
                break;
            case RULE_ID:
            case 25:
            case 28:
            case 29:
            case 46:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2236:2: (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2236:2: (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2236:4: otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleType4839); 

                        	newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getSeqKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2240:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2241:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getSeqTypeAction_0_1(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleType4860); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2250:1: ( (lv_base_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2251:1: (lv_base_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2251:1: (lv_base_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2252:3: lv_base_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType4881);
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

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleType4893); 

                        	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2273:6: (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2273:6: (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2273:8: otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleType4913); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getSetKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2277:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2278:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getSetTypeAction_1_1(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleType4934); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2287:1: ( (lv_base_8_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2288:1: (lv_base_8_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2288:1: (lv_base_8_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2289:3: lv_base_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType4955);
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

                    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleType4967); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2311:5: this_BaseType_10= ruleBaseType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBaseType_in_ruleType4996);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2327:1: entryRuleBaseType returns [EObject current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final EObject entryRuleBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2328:2: (iv_ruleBaseType= ruleBaseType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2329:2: iv_ruleBaseType= ruleBaseType EOF
            {
             newCompositeNode(grammarAccess.getBaseTypeRule()); 
            pushFollow(FOLLOW_ruleBaseType_in_entryRuleBaseType5031);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;

             current =iv_ruleBaseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseType5041); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2336:1: ruleBaseType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2339:28: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2340:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2340:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) )
            int alt49=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt49=1;
                }
                break;
            case 46:
                {
                alt49=2;
                }
                break;
            case 25:
                {
                alt49=3;
                }
                break;
            case 29:
                {
                alt49=4;
                }
                break;
            case 28:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2340:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2340:2: ( (otherlv_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2341:1: (otherlv_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2341:1: (otherlv_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2342:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseTypeRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseType5086); 

                    		newLeafNode(otherlv_0, grammarAccess.getBaseTypeAccess().getTypeTypeDeclCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2354:6: (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2354:6: (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2354:8: otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleBaseType5105); 

                        	newLeafNode(otherlv_1, grammarAccess.getBaseTypeAccess().getLessThanSignKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2358:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2359:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getTupleTypeAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2364:2: ( (lv_elemTypes_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2365:1: (lv_elemTypes_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2365:1: (lv_elemTypes_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2366:3: lv_elemTypes_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getElemTypesTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5135);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2382:2: (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==37) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2382:4: otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleBaseType5148); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getBaseTypeAccess().getAsteriskKeyword_1_3_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2386:1: ( (lv_elemTypes_5_0= ruleType ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2387:1: (lv_elemTypes_5_0= ruleType )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2387:1: (lv_elemTypes_5_0= ruleType )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2388:3: lv_elemTypes_5_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getElemTypesTypeParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleBaseType5169);
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
                    	    if ( cnt48 >= 1 ) break loop48;
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleBaseType5183); 

                        	newLeafNode(otherlv_6, grammarAccess.getBaseTypeAccess().getGreaterThanSignKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2409:6: (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2409:6: (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2409:8: otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleBaseType5203); 

                        	newLeafNode(otherlv_7, grammarAccess.getBaseTypeAccess().getOptionKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2413:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2414:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getOptionTypeAction_2_1(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleBaseType5224); 

                        	newLeafNode(otherlv_9, grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_2_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2423:1: ( (lv_base_10_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2424:1: (lv_base_10_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2424:1: (lv_base_10_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2425:3: lv_base_10_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getBaseTypeParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5245);
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

                    otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleBaseType5257); 

                        	newLeafNode(otherlv_11, grammarAccess.getBaseTypeAccess().getRightSquareBracketKeyword_2_4());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2446:6: (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2446:6: (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2446:8: otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleBaseType5277); 

                        	newLeafNode(otherlv_12, grammarAccess.getBaseTypeAccess().getSomeKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2450:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2451:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getSomeTypeAction_3_1(),
                                current);
                        

                    }

                    otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleBaseType5298); 

                        	newLeafNode(otherlv_14, grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_3_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2460:1: ( (lv_base_15_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2461:1: (lv_base_15_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2461:1: (lv_base_15_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2462:3: lv_base_15_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getBaseTypeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5319);
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

                    otherlv_16=(Token)match(input,27,FOLLOW_27_in_ruleBaseType5331); 

                        	newLeafNode(otherlv_16, grammarAccess.getBaseTypeAccess().getRightSquareBracketKeyword_3_4());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2483:6: (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2483:6: (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2483:8: otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']'
                    {
                    otherlv_17=(Token)match(input,28,FOLLOW_28_in_ruleBaseType5351); 

                        	newLeafNode(otherlv_17, grammarAccess.getBaseTypeAccess().getNoneKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2487:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2488:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getNoneTypeAction_4_1(),
                                current);
                        

                    }

                    otherlv_19=(Token)match(input,26,FOLLOW_26_in_ruleBaseType5372); 

                        	newLeafNode(otherlv_19, grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_4_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2497:1: ( (lv_base_20_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2498:1: (lv_base_20_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2498:1: (lv_base_20_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2499:3: lv_base_20_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getBaseTypeParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5393);
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

                    otherlv_21=(Token)match(input,27,FOLLOW_27_in_ruleBaseType5405); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2527:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2528:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2529:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5442);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5452); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2536:1: ruleLiteral returns [EObject current=null] : (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BasicLiteral_0 = null;

        EObject this_TupleLiteral_1 = null;

        EObject this_OptionLiteral_2 = null;

        EObject this_SeqLiteral_3 = null;

        EObject this_SetLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2539:28: ( (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2540:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2540:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral )
            int alt50=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt50=1;
                }
                break;
            case 46:
                {
                alt50=2;
                }
                break;
            case 28:
            case 29:
                {
                alt50=3;
                }
                break;
            case 32:
                {
                alt50=4;
                }
                break;
            case 33:
                {
                alt50=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2541:5: this_BasicLiteral_0= ruleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicLiteral_in_ruleLiteral5499);
                    this_BasicLiteral_0=ruleBasicLiteral();

                    state._fsp--;

                     
                            current = this_BasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2551:5: this_TupleLiteral_1= ruleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleLiteral_in_ruleLiteral5526);
                    this_TupleLiteral_1=ruleTupleLiteral();

                    state._fsp--;

                     
                            current = this_TupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2561:5: this_OptionLiteral_2= ruleOptionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getOptionLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleOptionLiteral_in_ruleLiteral5553);
                    this_OptionLiteral_2=ruleOptionLiteral();

                    state._fsp--;

                     
                            current = this_OptionLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2571:5: this_SeqLiteral_3= ruleSeqLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSeqLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSeqLiteral_in_ruleLiteral5580);
                    this_SeqLiteral_3=ruleSeqLiteral();

                    state._fsp--;

                     
                            current = this_SeqLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2581:5: this_SetLiteral_4= ruleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleLiteral5607);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2597:1: entryRuleBasicLiteral returns [EObject current=null] : iv_ruleBasicLiteral= ruleBasicLiteral EOF ;
    public final EObject entryRuleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2598:2: (iv_ruleBasicLiteral= ruleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2599:2: iv_ruleBasicLiteral= ruleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral5642);
            iv_ruleBasicLiteral=ruleBasicLiteral();

            state._fsp--;

             current =iv_ruleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicLiteral5652); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2606:1: ruleBasicLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) ;
    public final EObject ruleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lit_1_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2609:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2610:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2610:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2610:2: ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2610:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2611:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2611:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2612:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicLiteral5697); 

            		newLeafNode(otherlv_0, grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2623:2: ( (lv_lit_1_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2624:1: (lv_lit_1_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2624:1: (lv_lit_1_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2625:3: lv_lit_1_0= RULE_LIT
            {
            lv_lit_1_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleBasicLiteral5714); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2649:1: entryRuleTupleLiteral returns [EObject current=null] : iv_ruleTupleLiteral= ruleTupleLiteral EOF ;
    public final EObject entryRuleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2650:2: (iv_ruleTupleLiteral= ruleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2651:2: iv_ruleTupleLiteral= ruleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral5755);
            iv_ruleTupleLiteral=ruleTupleLiteral();

            state._fsp--;

             current =iv_ruleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteral5765); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2658:1: ruleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2661:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2662:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2662:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2662:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleTupleLiteral5802); 

                	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2666:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2667:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2672:2: ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||(LA52_0>=28 && LA52_0<=29)||(LA52_0>=32 && LA52_0<=33)||LA52_0==46) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2672:3: ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2672:3: ( (lv_elems_2_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2673:1: (lv_elems_2_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2673:1: (lv_elems_2_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2674:3: lv_elems_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral5833);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2690:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==31) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2690:4: otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleTupleLiteral5846); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2694:1: ( (lv_elems_4_0= ruleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2695:1: (lv_elems_4_0= ruleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2695:1: (lv_elems_4_0= ruleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2696:3: lv_elems_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral5867);
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
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleTupleLiteral5883); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2724:1: entryRuleSeqLiteral returns [EObject current=null] : iv_ruleSeqLiteral= ruleSeqLiteral EOF ;
    public final EObject entryRuleSeqLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2725:2: (iv_ruleSeqLiteral= ruleSeqLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2726:2: iv_ruleSeqLiteral= ruleSeqLiteral EOF
            {
             newCompositeNode(grammarAccess.getSeqLiteralRule()); 
            pushFollow(FOLLOW_ruleSeqLiteral_in_entryRuleSeqLiteral5919);
            iv_ruleSeqLiteral=ruleSeqLiteral();

            state._fsp--;

             current =iv_ruleSeqLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeqLiteral5929); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2733:1: ruleSeqLiteral returns [EObject current=null] : (otherlv_0= 'Seq' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '[' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= ']' ) ;
    public final EObject ruleSeqLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_elementType_2_0 = null;

        EObject lv_elems_5_0 = null;

        EObject lv_elems_7_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2736:28: ( (otherlv_0= 'Seq' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '[' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2737:1: (otherlv_0= 'Seq' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '[' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2737:1: (otherlv_0= 'Seq' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '[' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2737:3: otherlv_0= 'Seq' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '[' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleSeqLiteral5966); 

                	newLeafNode(otherlv_0, grammarAccess.getSeqLiteralAccess().getSeqKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSeqLiteral5978); 

                	newLeafNode(otherlv_1, grammarAccess.getSeqLiteralAccess().getLeftSquareBracketKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2745:1: ( (lv_elementType_2_0= ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2746:1: (lv_elementType_2_0= ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2746:1: (lv_elementType_2_0= ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2747:3: lv_elementType_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSeqLiteralAccess().getElementTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSeqLiteral5999);
            lv_elementType_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSeqLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"elementType",
                    		lv_elementType_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleSeqLiteral6011); 

                	newLeafNode(otherlv_3, grammarAccess.getSeqLiteralAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleSeqLiteral6023); 

                	newLeafNode(otherlv_4, grammarAccess.getSeqLiteralAccess().getLeftSquareBracketKeyword_4());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2771:1: ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_LIT||LA54_0==16||LA54_0==26||(LA54_0>=28 && LA54_0<=29)||LA54_0==46) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2771:2: ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2771:2: ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2772:1: (lv_elems_5_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2772:1: (lv_elems_5_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2773:3: lv_elems_5_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6045);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2789:2: (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==31) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2789:4: otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleSeqLiteral6058); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSeqLiteralAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2793:1: ( (lv_elems_7_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2794:1: (lv_elems_7_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2794:1: (lv_elems_7_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2795:3: lv_elems_7_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6079);
                    	    lv_elems_7_0=ruleSimpleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSeqLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_7_0, 
                    	            		"SimpleLiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleSeqLiteral6095); 

                	newLeafNode(otherlv_8, grammarAccess.getSeqLiteralAccess().getRightSquareBracketKeyword_6());
                

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2823:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2824:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2825:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral6131);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;

             current =iv_ruleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral6141); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2832:1: ruleSetLiteral returns [EObject current=null] : (otherlv_0= 'Set' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '{' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_elementType_2_0 = null;

        EObject lv_elems_5_0 = null;

        EObject lv_elems_7_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2835:28: ( (otherlv_0= 'Set' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '{' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2836:1: (otherlv_0= 'Set' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '{' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2836:1: (otherlv_0= 'Set' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '{' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2836:3: otherlv_0= 'Set' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '{' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleSetLiteral6178); 

                	newLeafNode(otherlv_0, grammarAccess.getSetLiteralAccess().getSetKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSetLiteral6190); 

                	newLeafNode(otherlv_1, grammarAccess.getSetLiteralAccess().getLeftSquareBracketKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2844:1: ( (lv_elementType_2_0= ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2845:1: (lv_elementType_2_0= ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2845:1: (lv_elementType_2_0= ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2846:3: lv_elementType_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElementTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSetLiteral6211);
            lv_elementType_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"elementType",
                    		lv_elementType_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleSetLiteral6223); 

                	newLeafNode(otherlv_3, grammarAccess.getSetLiteralAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSetLiteral6235); 

                	newLeafNode(otherlv_4, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_4());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2870:1: ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_LIT||LA56_0==16||LA56_0==26||(LA56_0>=28 && LA56_0<=29)||LA56_0==46) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2870:2: ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2870:2: ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2871:1: (lv_elems_5_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2871:1: (lv_elems_5_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2872:3: lv_elems_5_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6257);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2888:2: (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==31) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2888:4: otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleSetLiteral6270); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSetLiteralAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2892:1: ( (lv_elems_7_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2893:1: (lv_elems_7_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2893:1: (lv_elems_7_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2894:3: lv_elems_7_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6291);
                    	    lv_elems_7_0=ruleSimpleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_7_0, 
                    	            		"SimpleLiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleSetLiteral6307); 

                	newLeafNode(otherlv_8, grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2922:1: entryRuleOptionLiteral returns [EObject current=null] : iv_ruleOptionLiteral= ruleOptionLiteral EOF ;
    public final EObject entryRuleOptionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2923:2: (iv_ruleOptionLiteral= ruleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2924:2: iv_ruleOptionLiteral= ruleOptionLiteral EOF
            {
             newCompositeNode(grammarAccess.getOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral6343);
            iv_ruleOptionLiteral=ruleOptionLiteral();

            state._fsp--;

             current =iv_ruleOptionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionLiteral6353); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2931:1: ruleOptionLiteral returns [EObject current=null] : ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2934:28: ( ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2935:1: ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2935:1: ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==28) ) {
                alt57=1;
            }
            else if ( (LA57_0==29) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2935:2: (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2935:2: (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2935:4: otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleOptionLiteral6391); 

                        	newLeafNode(otherlv_0, grammarAccess.getOptionLiteralAccess().getNoneKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2939:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2940:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionLiteralAccess().getNoneLiteralAction_0_1(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleOptionLiteral6412); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionLiteralAccess().getLeftSquareBracketKeyword_0_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2949:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2950:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2950:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2951:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionLiteralAccess().getTypeTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleOptionLiteral6433);
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

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleOptionLiteral6445); 

                        	newLeafNode(otherlv_4, grammarAccess.getOptionLiteralAccess().getRightSquareBracketKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2972:6: (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2972:6: (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2972:8: otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleOptionLiteral6465); 

                        	newLeafNode(otherlv_5, grammarAccess.getOptionLiteralAccess().getSomeKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2976:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2977:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionLiteralAccess().getSomeLiteralAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2982:2: ( (lv_lit_7_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2983:1: (lv_lit_7_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2983:1: (lv_lit_7_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2984:3: lv_lit_7_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionLiteralAccess().getLitLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleOptionLiteral6495);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3008:1: entryRuleSimpleLiteral returns [EObject current=null] : iv_ruleSimpleLiteral= ruleSimpleLiteral EOF ;
    public final EObject entryRuleSimpleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3009:2: (iv_ruleSimpleLiteral= ruleSimpleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3010:2: iv_ruleSimpleLiteral= ruleSimpleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleLiteral_in_entryRuleSimpleLiteral6532);
            iv_ruleSimpleLiteral=ruleSimpleLiteral();

            state._fsp--;

             current =iv_ruleSimpleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleLiteral6542); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3017:1: ruleSimpleLiteral returns [EObject current=null] : (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral ) ;
    public final EObject ruleSimpleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBasicLiteral_0 = null;

        EObject this_SimpleTupleLiteral_1 = null;

        EObject this_SimpleSeqLiteral_2 = null;

        EObject this_SimpleSetLiteral_3 = null;

        EObject this_SimpleOptionLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3020:28: ( (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3021:1: (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3021:1: (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral )
            int alt58=5;
            switch ( input.LA(1) ) {
            case RULE_LIT:
                {
                alt58=1;
                }
                break;
            case 46:
                {
                alt58=2;
                }
                break;
            case 26:
                {
                alt58=3;
                }
                break;
            case 16:
                {
                alt58=4;
                }
                break;
            case 28:
            case 29:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3022:5: this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleBasicLiteral_in_ruleSimpleLiteral6589);
                    this_SimpleBasicLiteral_0=ruleSimpleBasicLiteral();

                    state._fsp--;

                     
                            current = this_SimpleBasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3032:5: this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleTupleLiteral_in_ruleSimpleLiteral6616);
                    this_SimpleTupleLiteral_1=ruleSimpleTupleLiteral();

                    state._fsp--;

                     
                            current = this_SimpleTupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3042:5: this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleSeqLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSimpleSeqLiteral_in_ruleSimpleLiteral6643);
                    this_SimpleSeqLiteral_2=ruleSimpleSeqLiteral();

                    state._fsp--;

                     
                            current = this_SimpleSeqLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3052:5: this_SimpleSetLiteral_3= ruleSimpleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleSetLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSimpleSetLiteral_in_ruleSimpleLiteral6670);
                    this_SimpleSetLiteral_3=ruleSimpleSetLiteral();

                    state._fsp--;

                     
                            current = this_SimpleSetLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3062:5: this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleOptionLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSimpleOptionLiteral_in_ruleSimpleLiteral6697);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3078:1: entryRuleSimpleBasicLiteral returns [EObject current=null] : iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF ;
    public final EObject entryRuleSimpleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3079:2: (iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3080:2: iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleBasicLiteral_in_entryRuleSimpleBasicLiteral6732);
            iv_ruleSimpleBasicLiteral=ruleSimpleBasicLiteral();

            state._fsp--;

             current =iv_ruleSimpleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBasicLiteral6742); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3087:1: ruleSimpleBasicLiteral returns [EObject current=null] : ( (lv_lit_0_0= RULE_LIT ) ) ;
    public final EObject ruleSimpleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3090:28: ( ( (lv_lit_0_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3091:1: ( (lv_lit_0_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3091:1: ( (lv_lit_0_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3092:1: (lv_lit_0_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3092:1: (lv_lit_0_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3093:3: lv_lit_0_0= RULE_LIT
            {
            lv_lit_0_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleSimpleBasicLiteral6783); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3117:1: entryRuleSimpleTupleLiteral returns [EObject current=null] : iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF ;
    public final EObject entryRuleSimpleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3118:2: (iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3119:2: iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleTupleLiteral_in_entryRuleSimpleTupleLiteral6823);
            iv_ruleSimpleTupleLiteral=ruleSimpleTupleLiteral();

            state._fsp--;

             current =iv_ruleSimpleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTupleLiteral6833); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3126:1: ruleSimpleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleSimpleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3129:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3130:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3130:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3130:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSimpleTupleLiteral6870); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3134:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3135:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleTupleLiteralAccess().getSimpleTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3140:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_LIT||LA60_0==16||LA60_0==26||(LA60_0>=28 && LA60_0<=29)||LA60_0==46) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3140:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3140:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3141:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3141:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3142:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleTupleLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral6901);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3158:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==31) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3158:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleSimpleTupleLiteral6914); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3162:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3163:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3163:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3164:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleTupleLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral6935);
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
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleSimpleTupleLiteral6951); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3192:1: entryRuleSimpleOptionLiteral returns [EObject current=null] : iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF ;
    public final EObject entryRuleSimpleOptionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOptionLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3193:2: (iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3194:2: iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleOptionLiteral_in_entryRuleSimpleOptionLiteral6987);
            iv_ruleSimpleOptionLiteral=ruleSimpleOptionLiteral();

            state._fsp--;

             current =iv_ruleSimpleOptionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOptionLiteral6997); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3201:1: ruleSimpleOptionLiteral returns [EObject current=null] : ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) ) ;
    public final EObject ruleSimpleOptionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lit_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3204:28: ( ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3205:1: ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3205:1: ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==28) ) {
                alt61=1;
            }
            else if ( (LA61_0==29) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3205:2: (otherlv_0= 'None' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3205:2: (otherlv_0= 'None' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3205:4: otherlv_0= 'None' ()
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleSimpleOptionLiteral7035); 

                        	newLeafNode(otherlv_0, grammarAccess.getSimpleOptionLiteralAccess().getNoneKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3209:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3210:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSimpleOptionLiteralAccess().getSimpleNoneLiteralAction_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3216:6: (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3216:6: (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3216:8: otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleSimpleOptionLiteral7064); 

                        	newLeafNode(otherlv_2, grammarAccess.getSimpleOptionLiteralAccess().getSomeKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3220:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3221:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSimpleOptionLiteralAccess().getSimpleSomeLiteralAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3226:2: ( (lv_lit_4_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3227:1: (lv_lit_4_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3227:1: (lv_lit_4_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3228:3: lv_lit_4_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleOptionLiteralAccess().getLitSimpleLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleOptionLiteral7094);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3252:1: entryRuleSimpleSeqLiteral returns [EObject current=null] : iv_ruleSimpleSeqLiteral= ruleSimpleSeqLiteral EOF ;
    public final EObject entryRuleSimpleSeqLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSeqLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3253:2: (iv_ruleSimpleSeqLiteral= ruleSimpleSeqLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3254:2: iv_ruleSimpleSeqLiteral= ruleSimpleSeqLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleSeqLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleSeqLiteral_in_entryRuleSimpleSeqLiteral7131);
            iv_ruleSimpleSeqLiteral=ruleSimpleSeqLiteral();

            state._fsp--;

             current =iv_ruleSimpleSeqLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSeqLiteral7141); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3261:1: ruleSimpleSeqLiteral returns [EObject current=null] : (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleSimpleSeqLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3264:28: ( (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3265:1: (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3265:1: (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3265:3: otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSimpleSeqLiteral7178); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleSeqLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3269:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3270:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleSeqLiteralAccess().getSimpleSeqLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3275:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_LIT||LA63_0==16||LA63_0==26||(LA63_0>=28 && LA63_0<=29)||LA63_0==46) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3275:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3275:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3276:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3276:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3277:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7209);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3293:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==31) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3293:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleSimpleSeqLiteral7222); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleSeqLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3297:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3298:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3298:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3299:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7243);
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
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleSimpleSeqLiteral7259); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3327:1: entryRuleSimpleSetLiteral returns [EObject current=null] : iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF ;
    public final EObject entryRuleSimpleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3328:2: (iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3329:2: iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleSetLiteral_in_entryRuleSimpleSetLiteral7295);
            iv_ruleSimpleSetLiteral=ruleSimpleSetLiteral();

            state._fsp--;

             current =iv_ruleSimpleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSetLiteral7305); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3336:1: ruleSimpleSetLiteral returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSimpleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3339:28: ( (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3340:1: (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3340:1: (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3340:3: otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSimpleSetLiteral7342); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleSetLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3344:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3345:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleSetLiteralAccess().getSimpleSetLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3350:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_LIT||LA65_0==16||LA65_0==26||(LA65_0>=28 && LA65_0<=29)||LA65_0==46) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3350:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3350:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3351:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3351:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3352:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral7373);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3368:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==31) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3368:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleSimpleSetLiteral7386); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleSetLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3372:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3373:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3373:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3374:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral7407);
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
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSimpleSetLiteral7423); 

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
    public static final BitSet FOLLOW_ruleDecl_in_ruleModel130 = new BitSet(new long[]{0x000000000000E402L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleDecl223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDecl_in_ruleDecl250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleTypeDecl332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl349 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleTypeDecl367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl387 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleTypeDecl400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl420 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleComponentDecl_in_entryRuleComponentDecl460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDecl470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleComponentDecl509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14_in_ruleComponentDecl538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15_in_ruleComponentDecl567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl595 = new BitSet(new long[]{0x0000000000050802L});
    public static final BitSet FOLLOW_11_in_ruleComponentDecl613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl633 = new BitSet(new long[]{0x0000000000051002L});
    public static final BitSet FOLLOW_12_in_ruleComponentDecl646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDecl666 = new BitSet(new long[]{0x0000000000051002L});
    public static final BitSet FOLLOW_16_in_ruleComponentDecl683 = new BitSet(new long[]{0x0000000401E20010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleComponentDecl704 = new BitSet(new long[]{0x0000000401E20010L});
    public static final BitSet FOLLOW_17_in_ruleComponentDecl717 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleComponentDecl732 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponentDecl744 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleDevice_in_ruleComponentDecl765 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComponentDecl787 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleComponentDecl809 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleComponentDecl821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_entryRuleMemberDecl859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDecl869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_ruleMemberDecl916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberDecl_in_ruleMemberDecl943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_ruleMemberDecl970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl1005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrDecl1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleAttrDecl1061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttrDecl1078 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleAttrDecl1097 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttrDecl1118 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAttrDecl1131 = new BitSet(new long[]{0x0000408330000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAttrDecl1174 = new BitSet(new long[]{0x0000408330000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleModifier1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleModifier1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleModifier1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleModifier1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberDecl_in_entryRuleSubMemberDecl1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMemberDecl1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberDecl1432 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSubMemberDecl1449 = new BitSet(new long[]{0x0000000362000010L});
    public static final BitSet FOLLOW_ruleFeatureType_in_ruleSubMemberDecl1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1558 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAssignment1575 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleAssignment1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_entryRuleFeatureType1634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureType1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFeatureType1709 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType1730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType1751 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFeatureType1763 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFeatureType1776 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFeatureType1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFeatureType1829 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType1850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType1871 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFeatureType1883 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFeatureType1896 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureType1908 = new BitSet(new long[]{0x0000000401E20010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleFeatureType1929 = new BitSet(new long[]{0x0000000401E20010L});
    public static final BitSet FOLLOW_17_in_ruleFeatureType1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFeatureType1964 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType1985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2006 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureType2019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2040 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_27_in_ruleFeatureType2054 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFeatureType2067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NAT_in_ruleFeatureType2084 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureType2101 = new BitSet(new long[]{0x0000000401E20010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleFeatureType2122 = new BitSet(new long[]{0x0000000401E20010L});
    public static final BitSet FOLLOW_17_in_ruleFeatureType2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFeatureType2157 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType2178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2199 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFeatureType2211 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFeatureType2224 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType2236 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2258 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureType2271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2292 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_27_in_ruleFeatureType2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFeatureType2330 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType2351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2372 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFeatureType2384 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFeatureType2397 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureType2409 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2431 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureType2444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2465 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleFeatureType2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_entryRuleBaseFeatureType2520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseFeatureType2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseFeatureType2575 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_12_in_ruleBaseFeatureType2588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseFeatureType2608 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_20_in_ruleBaseFeatureType2623 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBaseFeatureType2635 = new BitSet(new long[]{0x0000000401E20010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleBaseFeatureType2656 = new BitSet(new long[]{0x0000000401E20010L});
    public static final BitSet FOLLOW_17_in_ruleBaseFeatureType2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl2707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariantDecl2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariant_in_ruleInvariantDecl2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralInvariant_in_ruleInvariantDecl2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariant_in_entryRuleMultiplicityInvariant2826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityInvariant2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMultiplicityInvariant2873 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariant2891 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMultiplicityInvariant2908 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariant2932 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleMultiplicityInvariant2944 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariant2965 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_ruleSubMemberMatch_in_ruleMultiplicityInvariant2987 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleMultiplicityInvariant3000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariant3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralInvariant_in_entryRuleGeneralInvariant3058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralInvariant3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGeneralInvariant3105 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralInvariant3123 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGeneralInvariant3140 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleGeneralInvariant3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberMatch_in_entryRuleSubMemberMatch3199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMemberMatch3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberMatch3252 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSubMemberMatch3269 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberMatch3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSubMemberMatch3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat3368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintNat3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAT_in_ruleConstraintNat3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleConstraintNat3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevice_in_entryRuleDevice3501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevice3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice3553 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDevice3570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice3590 = new BitSet(new long[]{0x0000004000001002L});
    public static final BitSet FOLLOW_12_in_ruleDevice3603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice3623 = new BitSet(new long[]{0x0000004000001002L});
    public static final BitSet FOLLOW_ruleConstraintExp_in_ruleDevice3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExp_in_entryRuleConstraintExp3683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExp3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleConstraintExp3730 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleConstraintExp3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_entryRuleExp3793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExp3841 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp3871 = new BitSet(new long[]{0x007FFE2000000000L});
    public static final BitSet FOLLOW_ruleBinaryOp_in_ruleExp3892 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp3913 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleExp3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExp3945 = new BitSet(new long[]{0x0398000000000000L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleExp3975 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp3996 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleExp4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleExp4046 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleExp4059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExp4088 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary4127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_rulePrimary4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOp_in_entryRuleBinaryOp4270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOp4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBinaryOp4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBinaryOp4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBinaryOp4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBinaryOp4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBinaryOp4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBinaryOp4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleBinaryOp4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBinaryOp4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBinaryOp4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleBinaryOp4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBinaryOp4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBinaryOp4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBinaryOp4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBinaryOp4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBinaryOp4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_entryRuleUnaryOp4626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOp4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleUnaryOp4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUnaryOp4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleUnaryOp4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleUnaryOp4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleUnaryOp4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType4791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleType4839 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleType4860 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType4881 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleType4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType4913 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleType4934 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType4955 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleType4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_ruleType4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_entryRuleBaseType5031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseType5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseType5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBaseType5105 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5135 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBaseType5148 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5169 = new BitSet(new long[]{0x0000202000000000L});
    public static final BitSet FOLLOW_45_in_ruleBaseType5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBaseType5203 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBaseType5224 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5245 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBaseType5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBaseType5277 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBaseType5298 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5319 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBaseType5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBaseType5351 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBaseType5372 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5393 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBaseType5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_ruleLiteral5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_ruleLiteral5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_ruleLiteral5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeqLiteral_in_ruleLiteral5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleLiteral5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral5642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicLiteral5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicLiteral5697 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleBasicLiteral5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral5755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteral5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTupleLiteral5802 = new BitSet(new long[]{0x0000608330000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral5833 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_31_in_ruleTupleLiteral5846 = new BitSet(new long[]{0x0000408330000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral5867 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_45_in_ruleTupleLiteral5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeqLiteral_in_entryRuleSeqLiteral5919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeqLiteral5929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSeqLiteral5966 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSeqLiteral5978 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleSeqLiteral5999 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSeqLiteral6011 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSeqLiteral6023 = new BitSet(new long[]{0x000040003C010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6045 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_31_in_ruleSeqLiteral6058 = new BitSet(new long[]{0x0000400034010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6079 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_27_in_ruleSeqLiteral6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral6131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSetLiteral6178 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSetLiteral6190 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleSetLiteral6211 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSetLiteral6223 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSetLiteral6235 = new BitSet(new long[]{0x0000400034030040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6257 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleSetLiteral6270 = new BitSet(new long[]{0x0000400034010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6291 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleSetLiteral6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral6343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionLiteral6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOptionLiteral6391 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOptionLiteral6412 = new BitSet(new long[]{0x0000400332000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleOptionLiteral6433 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOptionLiteral6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOptionLiteral6465 = new BitSet(new long[]{0x0000408330000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleOptionLiteral6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_entryRuleSimpleLiteral6532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLiteral6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBasicLiteral_in_ruleSimpleLiteral6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTupleLiteral_in_ruleSimpleLiteral6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSeqLiteral_in_ruleSimpleLiteral6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSetLiteral_in_ruleSimpleLiteral6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOptionLiteral_in_ruleSimpleLiteral6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBasicLiteral_in_entryRuleSimpleBasicLiteral6732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBasicLiteral6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleSimpleBasicLiteral6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTupleLiteral_in_entryRuleSimpleTupleLiteral6823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTupleLiteral6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSimpleTupleLiteral6870 = new BitSet(new long[]{0x0000600034010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral6901 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_31_in_ruleSimpleTupleLiteral6914 = new BitSet(new long[]{0x0000400034010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral6935 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_45_in_ruleSimpleTupleLiteral6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOptionLiteral_in_entryRuleSimpleOptionLiteral6987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOptionLiteral6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSimpleOptionLiteral7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSimpleOptionLiteral7064 = new BitSet(new long[]{0x0000400034010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleOptionLiteral7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSeqLiteral_in_entryRuleSimpleSeqLiteral7131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSeqLiteral7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSimpleSeqLiteral7178 = new BitSet(new long[]{0x000040003C010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7209 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_31_in_ruleSimpleSeqLiteral7222 = new BitSet(new long[]{0x0000400034010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7243 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_27_in_ruleSimpleSeqLiteral7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSetLiteral_in_entryRuleSimpleSetLiteral7295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSetLiteral7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSimpleSetLiteral7342 = new BitSet(new long[]{0x0000400034030040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral7373 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleSimpleSetLiteral7386 = new BitSet(new long[]{0x0000400034010040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral7407 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleSimpleSetLiteral7423 = new BitSet(new long[]{0x0000000000000002L});

}