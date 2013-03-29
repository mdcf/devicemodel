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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NAT", "RULE_LIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Schema'", "'Class'", "'Instance'", "'type'", "'extends'", "'with'", "'feature'", "'schema'", "'class'", "'data'", "'device'", "'app'", "'{'", "'}'", "'requires'", "':'", "'='", "'const'", "'val'", "'var'", "'override'", "'Const'", "'Val'", "'Var'", "'Override'", "'Data'", "'Option'", "'['", "']'", "'None'", "'Some'", "'Either'", "','", "'Seq'", "'Set'", "'inv'", "'..'", "'.'", "'*'", "'constraint'", "'('", "')'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'&&'", "'||'", "'==>'", "'<=='", "'+'", "'-'", "'/'", "'%'", "'!'", "'^'", "'~'"
    };
    public static final int T__68=68;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:76:1: ruleModel returns [EObject current=null] : ( ( ( (lv_schema_0_0= 'Schema' ) ) | ( (lv_class_1_0= 'Class' ) ) | ( (lv_instance_2_0= 'Instance' ) ) )? ( (lv_decls_3_0= ruleDecl ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_schema_0_0=null;
        Token lv_class_1_0=null;
        Token lv_instance_2_0=null;
        EObject lv_decls_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:79:28: ( ( ( ( (lv_schema_0_0= 'Schema' ) ) | ( (lv_class_1_0= 'Class' ) ) | ( (lv_instance_2_0= 'Instance' ) ) )? ( (lv_decls_3_0= ruleDecl ) )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:80:1: ( ( ( (lv_schema_0_0= 'Schema' ) ) | ( (lv_class_1_0= 'Class' ) ) | ( (lv_instance_2_0= 'Instance' ) ) )? ( (lv_decls_3_0= ruleDecl ) )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:80:1: ( ( ( (lv_schema_0_0= 'Schema' ) ) | ( (lv_class_1_0= 'Class' ) ) | ( (lv_instance_2_0= 'Instance' ) ) )? ( (lv_decls_3_0= ruleDecl ) )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:80:2: ( ( (lv_schema_0_0= 'Schema' ) ) | ( (lv_class_1_0= 'Class' ) ) | ( (lv_instance_2_0= 'Instance' ) ) )? ( (lv_decls_3_0= ruleDecl ) )*
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:80:2: ( ( (lv_schema_0_0= 'Schema' ) ) | ( (lv_class_1_0= 'Class' ) ) | ( (lv_instance_2_0= 'Instance' ) ) )?
            int alt1=4;
            switch ( input.LA(1) ) {
                case 10:
                    {
                    alt1=1;
                    }
                    break;
                case 11:
                    {
                    alt1=2;
                    }
                    break;
                case 12:
                    {
                    alt1=3;
                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:80:3: ( (lv_schema_0_0= 'Schema' ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:80:3: ( (lv_schema_0_0= 'Schema' ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:81:1: (lv_schema_0_0= 'Schema' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:81:1: (lv_schema_0_0= 'Schema' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:82:3: lv_schema_0_0= 'Schema'
                    {
                    lv_schema_0_0=(Token)match(input,10,FOLLOW_10_in_ruleModel129); 

                            newLeafNode(lv_schema_0_0, grammarAccess.getModelAccess().getSchemaSchemaKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(current, "schema", true, "Schema");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:96:6: ( (lv_class_1_0= 'Class' ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:96:6: ( (lv_class_1_0= 'Class' ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:97:1: (lv_class_1_0= 'Class' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:97:1: (lv_class_1_0= 'Class' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:98:3: lv_class_1_0= 'Class'
                    {
                    lv_class_1_0=(Token)match(input,11,FOLLOW_11_in_ruleModel166); 

                            newLeafNode(lv_class_1_0, grammarAccess.getModelAccess().getClassClassKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(current, "class", true, "Class");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:112:6: ( (lv_instance_2_0= 'Instance' ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:112:6: ( (lv_instance_2_0= 'Instance' ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:113:1: (lv_instance_2_0= 'Instance' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:113:1: (lv_instance_2_0= 'Instance' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:114:3: lv_instance_2_0= 'Instance'
                    {
                    lv_instance_2_0=(Token)match(input,12,FOLLOW_12_in_ruleModel203); 

                            newLeafNode(lv_instance_2_0, grammarAccess.getModelAccess().getInstanceInstanceKeyword_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(current, "instance", true, "Instance");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:127:4: ( (lv_decls_3_0= ruleDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==16||(LA2_0>=19 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:128:1: (lv_decls_3_0= ruleDecl )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:128:1: (lv_decls_3_0= ruleDecl )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:129:3: lv_decls_3_0= ruleDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclsDeclParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecl_in_ruleModel239);
            	    lv_decls_3_0=ruleDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decls",
            	            		lv_decls_3_0, 
            	            		"Decl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:153:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:154:2: (iv_ruleDecl= ruleDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:155:2: iv_ruleDecl= ruleDecl EOF
            {
             newCompositeNode(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl276);
            iv_ruleDecl=ruleDecl();

            state._fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl286); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:162:1: ruleDecl returns [EObject current=null] : (this_TypeDecl_0= ruleTypeDecl | this_FeatureDecl_1= ruleFeatureDecl ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDecl_0 = null;

        EObject this_FeatureDecl_1 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:165:28: ( (this_TypeDecl_0= ruleTypeDecl | this_FeatureDecl_1= ruleFeatureDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:166:1: (this_TypeDecl_0= ruleTypeDecl | this_FeatureDecl_1= ruleFeatureDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:166:1: (this_TypeDecl_0= ruleTypeDecl | this_FeatureDecl_1= ruleFeatureDecl )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==16||(LA3_0>=19 && LA3_0<=21)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:167:5: this_TypeDecl_0= ruleTypeDecl
                    {
                     
                            newCompositeNode(grammarAccess.getDeclAccess().getTypeDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeDecl_in_ruleDecl333);
                    this_TypeDecl_0=ruleTypeDecl();

                    state._fsp--;

                     
                            current = this_TypeDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:177:5: this_FeatureDecl_1= ruleFeatureDecl
                    {
                     
                            newCompositeNode(grammarAccess.getDeclAccess().getFeatureDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFeatureDecl_in_ruleDecl360);
                    this_FeatureDecl_1=ruleFeatureDecl();

                    state._fsp--;

                     
                            current = this_FeatureDecl_1; 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:193:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:194:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:195:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl395);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl405); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:202:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:205:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:206:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:206:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:206:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleTypeDecl442); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:210:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:211:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:211:1: (lv_name_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:212:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl459); 

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:228:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:228:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTypeDecl477); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getExtendsKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:232:1: ( (otherlv_3= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:233:1: (otherlv_3= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:233:1: (otherlv_3= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:234:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDeclRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl497); 

                    		newLeafNode(otherlv_3, grammarAccess.getTypeDeclAccess().getSupersTypeDeclCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:245:2: (otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:245:4: otherlv_4= 'with' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTypeDecl510); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getWithKeyword_2_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:249:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:250:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:250:1: (otherlv_5= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:251:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTypeDeclRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl530); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getTypeDeclAccess().getSupersTypeDeclCrossReference_2_2_1_0()); 
                    	    	

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


    // $ANTLR start "entryRuleFeatureDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:270:1: entryRuleFeatureDecl returns [EObject current=null] : iv_ruleFeatureDecl= ruleFeatureDecl EOF ;
    public final EObject entryRuleFeatureDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:271:2: (iv_ruleFeatureDecl= ruleFeatureDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:272:2: iv_ruleFeatureDecl= ruleFeatureDecl EOF
            {
             newCompositeNode(grammarAccess.getFeatureDeclRule()); 
            pushFollow(FOLLOW_ruleFeatureDecl_in_entryRuleFeatureDecl570);
            iv_ruleFeatureDecl=ruleFeatureDecl();

            state._fsp--;

             current =iv_ruleFeatureDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureDecl580); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:279:1: ruleFeatureDecl returns [EObject current=null] : ( ( (otherlv_0= 'feature' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? ) | (otherlv_4= 'data' () ) | (otherlv_6= 'device' () ) | (otherlv_8= 'app' () ) ) ( (lv_name_10_0= RULE_ID ) ) (otherlv_11= 'extends' ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'with' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= '{' ( (lv_members_16_0= ruleMemberDecl ) )* otherlv_17= '}' )? (otherlv_18= 'requires' otherlv_19= '{' ( (lv_devices_20_0= ruleDevice ) )* ( (lv_assigns_21_0= ruleAssignment ) )* ( (lv_exp_22_0= ruleExp ) ) otherlv_23= '}' )? ) ;
    public final EObject ruleFeatureDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_schema_2_0=null;
        Token lv_class_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_23=null;
        EObject lv_members_16_0 = null;

        EObject lv_devices_20_0 = null;

        EObject lv_assigns_21_0 = null;

        EObject lv_exp_22_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:282:28: ( ( ( (otherlv_0= 'feature' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? ) | (otherlv_4= 'data' () ) | (otherlv_6= 'device' () ) | (otherlv_8= 'app' () ) ) ( (lv_name_10_0= RULE_ID ) ) (otherlv_11= 'extends' ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'with' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= '{' ( (lv_members_16_0= ruleMemberDecl ) )* otherlv_17= '}' )? (otherlv_18= 'requires' otherlv_19= '{' ( (lv_devices_20_0= ruleDevice ) )* ( (lv_assigns_21_0= ruleAssignment ) )* ( (lv_exp_22_0= ruleExp ) ) otherlv_23= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:283:1: ( ( (otherlv_0= 'feature' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? ) | (otherlv_4= 'data' () ) | (otherlv_6= 'device' () ) | (otherlv_8= 'app' () ) ) ( (lv_name_10_0= RULE_ID ) ) (otherlv_11= 'extends' ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'with' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= '{' ( (lv_members_16_0= ruleMemberDecl ) )* otherlv_17= '}' )? (otherlv_18= 'requires' otherlv_19= '{' ( (lv_devices_20_0= ruleDevice ) )* ( (lv_assigns_21_0= ruleAssignment ) )* ( (lv_exp_22_0= ruleExp ) ) otherlv_23= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:283:1: ( ( (otherlv_0= 'feature' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? ) | (otherlv_4= 'data' () ) | (otherlv_6= 'device' () ) | (otherlv_8= 'app' () ) ) ( (lv_name_10_0= RULE_ID ) ) (otherlv_11= 'extends' ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'with' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= '{' ( (lv_members_16_0= ruleMemberDecl ) )* otherlv_17= '}' )? (otherlv_18= 'requires' otherlv_19= '{' ( (lv_devices_20_0= ruleDevice ) )* ( (lv_assigns_21_0= ruleAssignment ) )* ( (lv_exp_22_0= ruleExp ) ) otherlv_23= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:283:2: ( (otherlv_0= 'feature' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? ) | (otherlv_4= 'data' () ) | (otherlv_6= 'device' () ) | (otherlv_8= 'app' () ) ) ( (lv_name_10_0= RULE_ID ) ) (otherlv_11= 'extends' ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'with' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= '{' ( (lv_members_16_0= ruleMemberDecl ) )* otherlv_17= '}' )? (otherlv_18= 'requires' otherlv_19= '{' ( (lv_devices_20_0= ruleDevice ) )* ( (lv_assigns_21_0= ruleAssignment ) )* ( (lv_exp_22_0= ruleExp ) ) otherlv_23= '}' )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:283:2: ( (otherlv_0= 'feature' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? ) | (otherlv_4= 'data' () ) | (otherlv_6= 'device' () ) | (otherlv_8= 'app' () ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:283:3: (otherlv_0= 'feature' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:283:3: (otherlv_0= 'feature' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:283:5: otherlv_0= 'feature' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )?
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleFeatureDecl619); 

                        	newLeafNode(otherlv_0, grammarAccess.getFeatureDeclAccess().getFeatureKeyword_0_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:287:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:288:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureDeclAccess().getFeatureAction_0_0_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:293:2: ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )?
                    int alt6=3;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==18) ) {
                        alt6=2;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:293:3: ( (lv_schema_2_0= 'schema' ) )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:293:3: ( (lv_schema_2_0= 'schema' ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:294:1: (lv_schema_2_0= 'schema' )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:294:1: (lv_schema_2_0= 'schema' )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:295:3: lv_schema_2_0= 'schema'
                            {
                            lv_schema_2_0=(Token)match(input,17,FOLLOW_17_in_ruleFeatureDecl647); 

                                    newLeafNode(lv_schema_2_0, grammarAccess.getFeatureDeclAccess().getSchemaSchemaKeyword_0_0_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFeatureDeclRule());
                            	        }
                                   		setWithLastConsumed(current, "schema", true, "schema");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:309:6: ( (lv_class_3_0= 'class' ) )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:309:6: ( (lv_class_3_0= 'class' ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:310:1: (lv_class_3_0= 'class' )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:310:1: (lv_class_3_0= 'class' )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:311:3: lv_class_3_0= 'class'
                            {
                            lv_class_3_0=(Token)match(input,18,FOLLOW_18_in_ruleFeatureDecl684); 

                                    newLeafNode(lv_class_3_0, grammarAccess.getFeatureDeclAccess().getClassClassKeyword_0_0_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFeatureDeclRule());
                            	        }
                                   		setWithLastConsumed(current, "class", true, "class");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:325:6: (otherlv_4= 'data' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:325:6: (otherlv_4= 'data' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:325:8: otherlv_4= 'data' ()
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleFeatureDecl719); 

                        	newLeafNode(otherlv_4, grammarAccess.getFeatureDeclAccess().getDataKeyword_0_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:329:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:330:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureDeclAccess().getDataAction_0_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:336:6: (otherlv_6= 'device' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:336:6: (otherlv_6= 'device' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:336:8: otherlv_6= 'device' ()
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleFeatureDecl748); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeatureDeclAccess().getDeviceKeyword_0_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:340:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:341:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureDeclAccess().getDeviceAction_0_2_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:347:6: (otherlv_8= 'app' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:347:6: (otherlv_8= 'app' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:347:8: otherlv_8= 'app' ()
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleFeatureDecl777); 

                        	newLeafNode(otherlv_8, grammarAccess.getFeatureDeclAccess().getAppKeyword_0_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:351:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:352:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureDeclAccess().getAppAction_0_3_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:357:4: ( (lv_name_10_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:358:1: (lv_name_10_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:358:1: (lv_name_10_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:359:3: lv_name_10_0= RULE_ID
            {
            lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureDecl805); 

            			newLeafNode(lv_name_10_0, grammarAccess.getFeatureDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_10_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:375:2: (otherlv_11= 'extends' ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'with' ( (otherlv_14= RULE_ID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:375:4: otherlv_11= 'extends' ( (otherlv_12= RULE_ID ) ) (otherlv_13= 'with' ( (otherlv_14= RULE_ID ) ) )*
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleFeatureDecl823); 

                        	newLeafNode(otherlv_11, grammarAccess.getFeatureDeclAccess().getExtendsKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:379:1: ( (otherlv_12= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:380:1: (otherlv_12= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:380:1: (otherlv_12= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:381:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureDeclRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureDecl843); 

                    		newLeafNode(otherlv_12, grammarAccess.getFeatureDeclAccess().getSupersFeatureDeclCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:392:2: (otherlv_13= 'with' ( (otherlv_14= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:392:4: otherlv_13= 'with' ( (otherlv_14= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleFeatureDecl856); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getFeatureDeclAccess().getWithKeyword_2_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:396:1: ( (otherlv_14= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:397:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:397:1: (otherlv_14= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:398:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFeatureDeclRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureDecl876); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getFeatureDeclAccess().getSupersFeatureDeclCrossReference_2_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:409:6: (otherlv_15= '{' ( (lv_members_16_0= ruleMemberDecl ) )* otherlv_17= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:409:8: otherlv_15= '{' ( (lv_members_16_0= ruleMemberDecl ) )* otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleFeatureDecl893); 

                        	newLeafNode(otherlv_15, grammarAccess.getFeatureDeclAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:413:1: ( (lv_members_16_0= ruleMemberDecl ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||(LA10_0>=27 && LA10_0<=35)||LA10_0==45) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:414:1: (lv_members_16_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:414:1: (lv_members_16_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:415:3: lv_members_16_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureDeclAccess().getMembersMemberDeclParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleFeatureDecl914);
                    	    lv_members_16_0=ruleMemberDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"members",
                    	            		lv_members_16_0, 
                    	            		"MemberDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleFeatureDecl927); 

                        	newLeafNode(otherlv_17, grammarAccess.getFeatureDeclAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:435:3: (otherlv_18= 'requires' otherlv_19= '{' ( (lv_devices_20_0= ruleDevice ) )* ( (lv_assigns_21_0= ruleAssignment ) )* ( (lv_exp_22_0= ruleExp ) ) otherlv_23= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:435:5: otherlv_18= 'requires' otherlv_19= '{' ( (lv_devices_20_0= ruleDevice ) )* ( (lv_assigns_21_0= ruleAssignment ) )* ( (lv_exp_22_0= ruleExp ) ) otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,24,FOLLOW_24_in_ruleFeatureDecl942); 

                        	newLeafNode(otherlv_18, grammarAccess.getFeatureDeclAccess().getRequiresKeyword_4_0());
                        
                    otherlv_19=(Token)match(input,22,FOLLOW_22_in_ruleFeatureDecl954); 

                        	newLeafNode(otherlv_19, grammarAccess.getFeatureDeclAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:443:1: ( (lv_devices_20_0= ruleDevice ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1==25) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:444:1: (lv_devices_20_0= ruleDevice )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:444:1: (lv_devices_20_0= ruleDevice )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:445:3: lv_devices_20_0= ruleDevice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureDeclAccess().getDevicesDeviceParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDevice_in_ruleFeatureDecl975);
                    	    lv_devices_20_0=ruleDevice();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"devices",
                    	            		lv_devices_20_0, 
                    	            		"Device");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:461:3: ( (lv_assigns_21_0= ruleAssignment ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            int LA13_2 = input.LA(2);

                            if ( (LA13_2==26) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:462:1: (lv_assigns_21_0= ruleAssignment )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:462:1: (lv_assigns_21_0= ruleAssignment )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:463:3: lv_assigns_21_0= ruleAssignment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureDeclAccess().getAssignsAssignmentParserRuleCall_4_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAssignment_in_ruleFeatureDecl997);
                    	    lv_assigns_21_0=ruleAssignment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"assigns",
                    	            		lv_assigns_21_0, 
                    	            		"Assignment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:479:3: ( (lv_exp_22_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:480:1: (lv_exp_22_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:480:1: (lv_exp_22_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:481:3: lv_exp_22_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureDeclAccess().getExpExpParserRuleCall_4_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleFeatureDecl1019);
                    lv_exp_22_0=ruleExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"exp",
                            		lv_exp_22_0, 
                            		"Exp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_23=(Token)match(input,23,FOLLOW_23_in_ruleFeatureDecl1031); 

                        	newLeafNode(otherlv_23, grammarAccess.getFeatureDeclAccess().getRightCurlyBracketKeyword_4_5());
                        

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
    // $ANTLR end "ruleFeatureDecl"


    // $ANTLR start "entryRuleMemberDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:509:1: entryRuleMemberDecl returns [EObject current=null] : iv_ruleMemberDecl= ruleMemberDecl EOF ;
    public final EObject entryRuleMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:510:2: (iv_ruleMemberDecl= ruleMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:511:2: iv_ruleMemberDecl= ruleMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getMemberDeclRule()); 
            pushFollow(FOLLOW_ruleMemberDecl_in_entryRuleMemberDecl1069);
            iv_ruleMemberDecl=ruleMemberDecl();

            state._fsp--;

             current =iv_ruleMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDecl1079); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:518:1: ruleMemberDecl returns [EObject current=null] : (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl ) ;
    public final EObject ruleMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject this_AttrDecl_0 = null;

        EObject this_SubMemberDecl_1 = null;

        EObject this_InvariantDecl_2 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:521:28: ( (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:522:1: (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:522:1: (this_AttrDecl_0= ruleAttrDecl | this_SubMemberDecl_1= ruleSubMemberDecl | this_InvariantDecl_2= ruleInvariantDecl )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt15=2;
                }
                break;
            case 45:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:523:5: this_AttrDecl_0= ruleAttrDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getAttrDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAttrDecl_in_ruleMemberDecl1126);
                    this_AttrDecl_0=ruleAttrDecl();

                    state._fsp--;

                     
                            current = this_AttrDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:533:5: this_SubMemberDecl_1= ruleSubMemberDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getSubMemberDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSubMemberDecl_in_ruleMemberDecl1153);
                    this_SubMemberDecl_1=ruleSubMemberDecl();

                    state._fsp--;

                     
                            current = this_SubMemberDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:543:5: this_InvariantDecl_2= ruleInvariantDecl
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclAccess().getInvariantDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInvariantDecl_in_ruleMemberDecl1180);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:559:1: entryRuleAttrDecl returns [EObject current=null] : iv_ruleAttrDecl= ruleAttrDecl EOF ;
    public final EObject entryRuleAttrDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:560:2: (iv_ruleAttrDecl= ruleAttrDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:561:2: iv_ruleAttrDecl= ruleAttrDecl EOF
            {
             newCompositeNode(grammarAccess.getAttrDeclRule()); 
            pushFollow(FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl1215);
            iv_ruleAttrDecl=ruleAttrDecl();

            state._fsp--;

             current =iv_ruleAttrDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrDecl1225); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:568:1: ruleAttrDecl returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) ) ;
    public final EObject ruleAttrDecl() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_modifier_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_literal_5_0 = null;

        EObject lv_literal_7_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:571:28: ( ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:572:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:572:1: ( ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:572:2: ( (lv_modifier_0_0= ruleModifier ) ) ( (lv_attributeName_1_0= RULE_ID ) ) ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:572:2: ( (lv_modifier_0_0= ruleModifier ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:573:1: (lv_modifier_0_0= ruleModifier )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:573:1: (lv_modifier_0_0= ruleModifier )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:574:3: lv_modifier_0_0= ruleModifier
            {
             
            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModifier_in_ruleAttrDecl1271);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:590:2: ( (lv_attributeName_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:591:1: (lv_attributeName_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:591:1: (lv_attributeName_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:592:3: lv_attributeName_1_0= RULE_ID
            {
            lv_attributeName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttrDecl1288); 

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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:608:2: ( (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? ) | (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            else if ( (LA17_0==26) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:608:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:608:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:608:5: otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )?
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAttrDecl1307); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttrDeclAccess().getColonKeyword_2_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:612:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:613:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:613:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:614:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAttrDecl1328);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:630:2: (otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==26) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:630:4: otherlv_4= '=' ( (lv_literal_5_0= ruleLiteral ) )
                            {
                            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleAttrDecl1341); 

                                	newLeafNode(otherlv_4, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_0_2_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:634:1: ( (lv_literal_5_0= ruleLiteral ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:635:1: (lv_literal_5_0= ruleLiteral )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:635:1: (lv_literal_5_0= ruleLiteral )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:636:3: lv_literal_5_0= ruleLiteral
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl1362);
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:653:6: (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:653:6: (otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:653:8: otherlv_6= '=' ( (lv_literal_7_0= ruleLiteral ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleAttrDecl1384); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:657:1: ( (lv_literal_7_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:658:1: (lv_literal_7_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:658:1: (lv_literal_7_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:659:3: lv_literal_7_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttrDecl1405);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:683:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:684:2: (iv_ruleModifier= ruleModifier EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:685:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier1443);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier1453); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:692:1: ruleModifier returns [EObject current=null] : ( (otherlv_0= 'const' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? ) | (otherlv_4= 'val' () ) | (otherlv_6= 'var' () ) | (otherlv_8= 'override' () ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_schema_2_0=null;
        Token lv_class_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:695:28: ( ( (otherlv_0= 'const' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? ) | (otherlv_4= 'val' () ) | (otherlv_6= 'var' () ) | (otherlv_8= 'override' () ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:696:1: ( (otherlv_0= 'const' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? ) | (otherlv_4= 'val' () ) | (otherlv_6= 'var' () ) | (otherlv_8= 'override' () ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:696:1: ( (otherlv_0= 'const' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? ) | (otherlv_4= 'val' () ) | (otherlv_6= 'var' () ) | (otherlv_8= 'override' () ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt19=1;
                }
                break;
            case 28:
                {
                alt19=2;
                }
                break;
            case 29:
                {
                alt19=3;
                }
                break;
            case 30:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:696:2: (otherlv_0= 'const' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:696:2: (otherlv_0= 'const' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:696:4: otherlv_0= 'const' () ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )?
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleModifier1491); 

                        	newLeafNode(otherlv_0, grammarAccess.getModifierAccess().getConstKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:700:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:701:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getModifierAccess().getConstAction_0_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:706:2: ( ( (lv_schema_2_0= 'schema' ) ) | ( (lv_class_3_0= 'class' ) ) )?
                    int alt18=3;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==17) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==18) ) {
                        alt18=2;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:706:3: ( (lv_schema_2_0= 'schema' ) )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:706:3: ( (lv_schema_2_0= 'schema' ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:707:1: (lv_schema_2_0= 'schema' )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:707:1: (lv_schema_2_0= 'schema' )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:708:3: lv_schema_2_0= 'schema'
                            {
                            lv_schema_2_0=(Token)match(input,17,FOLLOW_17_in_ruleModifier1519); 

                                    newLeafNode(lv_schema_2_0, grammarAccess.getModifierAccess().getSchemaSchemaKeyword_0_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getModifierRule());
                            	        }
                                   		setWithLastConsumed(current, "schema", true, "schema");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:722:6: ( (lv_class_3_0= 'class' ) )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:722:6: ( (lv_class_3_0= 'class' ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:723:1: (lv_class_3_0= 'class' )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:723:1: (lv_class_3_0= 'class' )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:724:3: lv_class_3_0= 'class'
                            {
                            lv_class_3_0=(Token)match(input,18,FOLLOW_18_in_ruleModifier1556); 

                                    newLeafNode(lv_class_3_0, grammarAccess.getModifierAccess().getClassClassKeyword_0_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getModifierRule());
                            	        }
                                   		setWithLastConsumed(current, "class", true, "class");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:738:6: (otherlv_4= 'val' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:738:6: (otherlv_4= 'val' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:738:8: otherlv_4= 'val' ()
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleModifier1591); 

                        	newLeafNode(otherlv_4, grammarAccess.getModifierAccess().getValKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:742:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:743:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getModifierAccess().getValAction_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:749:6: (otherlv_6= 'var' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:749:6: (otherlv_6= 'var' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:749:8: otherlv_6= 'var' ()
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleModifier1620); 

                        	newLeafNode(otherlv_6, grammarAccess.getModifierAccess().getVarKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:753:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:754:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getModifierAccess().getVarAction_2_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:760:6: (otherlv_8= 'override' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:760:6: (otherlv_8= 'override' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:760:8: otherlv_8= 'override' ()
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleModifier1649); 

                        	newLeafNode(otherlv_8, grammarAccess.getModifierAccess().getOverrideKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:764:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:765:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getModifierAccess().getOverrideAction_3_1(),
                                current);
                        

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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleSubMemberDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:778:1: entryRuleSubMemberDecl returns [EObject current=null] : iv_ruleSubMemberDecl= ruleSubMemberDecl EOF ;
    public final EObject entryRuleSubMemberDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMemberDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:779:2: (iv_ruleSubMemberDecl= ruleSubMemberDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:780:2: iv_ruleSubMemberDecl= ruleSubMemberDecl EOF
            {
             newCompositeNode(grammarAccess.getSubMemberDeclRule()); 
            pushFollow(FOLLOW_ruleSubMemberDecl_in_entryRuleSubMemberDecl1695);
            iv_ruleSubMemberDecl=ruleSubMemberDecl();

            state._fsp--;

             current =iv_ruleSubMemberDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMemberDecl1705); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:787:1: ruleSubMemberDecl returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleMModifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) ) ;
    public final EObject ruleSubMemberDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_modifier_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:790:28: ( ( ( (lv_modifier_0_0= ruleMModifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:791:1: ( ( (lv_modifier_0_0= ruleMModifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:791:1: ( ( (lv_modifier_0_0= ruleMModifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:791:2: ( (lv_modifier_0_0= ruleMModifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:791:2: ( (lv_modifier_0_0= ruleMModifier ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=31 && LA20_0<=35)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:792:1: (lv_modifier_0_0= ruleMModifier )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:792:1: (lv_modifier_0_0= ruleMModifier )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:793:3: lv_modifier_0_0= ruleMModifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubMemberDeclAccess().getModifierMModifierParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMModifier_in_ruleSubMemberDecl1751);
                    lv_modifier_0_0=ruleMModifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubMemberDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"modifier",
                            		lv_modifier_0_0, 
                            		"MModifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:809:3: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:810:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:810:1: (lv_name_1_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:811:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberDecl1769); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleSubMemberDecl1786); 

                	newLeafNode(otherlv_2, grammarAccess.getSubMemberDeclAccess().getColonKeyword_2());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:831:1: ( (lv_type_3_0= ruleFeatureType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:832:1: (lv_type_3_0= ruleFeatureType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:832:1: (lv_type_3_0= ruleFeatureType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:833:3: lv_type_3_0= ruleFeatureType
            {
             
            	        newCompositeNode(grammarAccess.getSubMemberDeclAccess().getTypeFeatureTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFeatureType_in_ruleSubMemberDecl1807);
            lv_type_3_0=ruleFeatureType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubMemberDeclRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
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


    // $ANTLR start "entryRuleMModifier"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:857:1: entryRuleMModifier returns [EObject current=null] : iv_ruleMModifier= ruleMModifier EOF ;
    public final EObject entryRuleMModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMModifier = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:858:2: (iv_ruleMModifier= ruleMModifier EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:859:2: iv_ruleMModifier= ruleMModifier EOF
            {
             newCompositeNode(grammarAccess.getMModifierRule()); 
            pushFollow(FOLLOW_ruleMModifier_in_entryRuleMModifier1843);
            iv_ruleMModifier=ruleMModifier();

            state._fsp--;

             current =iv_ruleMModifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMModifier1853); 

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
    // $ANTLR end "entryRuleMModifier"


    // $ANTLR start "ruleMModifier"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:866:1: ruleMModifier returns [EObject current=null] : ( (otherlv_0= 'Const' () ( ( (lv_schema_2_0= 'Schema' ) ) | ( (lv_class_3_0= 'Class' ) ) )? ) | (otherlv_4= 'Val' () ) | (otherlv_6= 'Var' () ) | (otherlv_8= 'Override' () ) | (otherlv_10= 'Data' () ) ) ;
    public final EObject ruleMModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_schema_2_0=null;
        Token lv_class_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:869:28: ( ( (otherlv_0= 'Const' () ( ( (lv_schema_2_0= 'Schema' ) ) | ( (lv_class_3_0= 'Class' ) ) )? ) | (otherlv_4= 'Val' () ) | (otherlv_6= 'Var' () ) | (otherlv_8= 'Override' () ) | (otherlv_10= 'Data' () ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:870:1: ( (otherlv_0= 'Const' () ( ( (lv_schema_2_0= 'Schema' ) ) | ( (lv_class_3_0= 'Class' ) ) )? ) | (otherlv_4= 'Val' () ) | (otherlv_6= 'Var' () ) | (otherlv_8= 'Override' () ) | (otherlv_10= 'Data' () ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:870:1: ( (otherlv_0= 'Const' () ( ( (lv_schema_2_0= 'Schema' ) ) | ( (lv_class_3_0= 'Class' ) ) )? ) | (otherlv_4= 'Val' () ) | (otherlv_6= 'Var' () ) | (otherlv_8= 'Override' () ) | (otherlv_10= 'Data' () ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt22=1;
                }
                break;
            case 32:
                {
                alt22=2;
                }
                break;
            case 33:
                {
                alt22=3;
                }
                break;
            case 34:
                {
                alt22=4;
                }
                break;
            case 35:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:870:2: (otherlv_0= 'Const' () ( ( (lv_schema_2_0= 'Schema' ) ) | ( (lv_class_3_0= 'Class' ) ) )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:870:2: (otherlv_0= 'Const' () ( ( (lv_schema_2_0= 'Schema' ) ) | ( (lv_class_3_0= 'Class' ) ) )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:870:4: otherlv_0= 'Const' () ( ( (lv_schema_2_0= 'Schema' ) ) | ( (lv_class_3_0= 'Class' ) ) )?
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleMModifier1891); 

                        	newLeafNode(otherlv_0, grammarAccess.getMModifierAccess().getConstKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:874:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:875:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMModifierAccess().getConstAction_0_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:880:2: ( ( (lv_schema_2_0= 'Schema' ) ) | ( (lv_class_3_0= 'Class' ) ) )?
                    int alt21=3;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==10) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==11) ) {
                        alt21=2;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:880:3: ( (lv_schema_2_0= 'Schema' ) )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:880:3: ( (lv_schema_2_0= 'Schema' ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:881:1: (lv_schema_2_0= 'Schema' )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:881:1: (lv_schema_2_0= 'Schema' )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:882:3: lv_schema_2_0= 'Schema'
                            {
                            lv_schema_2_0=(Token)match(input,10,FOLLOW_10_in_ruleMModifier1919); 

                                    newLeafNode(lv_schema_2_0, grammarAccess.getMModifierAccess().getSchemaSchemaKeyword_0_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMModifierRule());
                            	        }
                                   		setWithLastConsumed(current, "schema", true, "Schema");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:896:6: ( (lv_class_3_0= 'Class' ) )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:896:6: ( (lv_class_3_0= 'Class' ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:897:1: (lv_class_3_0= 'Class' )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:897:1: (lv_class_3_0= 'Class' )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:898:3: lv_class_3_0= 'Class'
                            {
                            lv_class_3_0=(Token)match(input,11,FOLLOW_11_in_ruleMModifier1956); 

                                    newLeafNode(lv_class_3_0, grammarAccess.getMModifierAccess().getClassClassKeyword_0_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMModifierRule());
                            	        }
                                   		setWithLastConsumed(current, "class", true, "Class");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:912:6: (otherlv_4= 'Val' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:912:6: (otherlv_4= 'Val' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:912:8: otherlv_4= 'Val' ()
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleMModifier1991); 

                        	newLeafNode(otherlv_4, grammarAccess.getMModifierAccess().getValKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:916:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:917:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMModifierAccess().getValAction_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:923:6: (otherlv_6= 'Var' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:923:6: (otherlv_6= 'Var' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:923:8: otherlv_6= 'Var' ()
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleMModifier2020); 

                        	newLeafNode(otherlv_6, grammarAccess.getMModifierAccess().getVarKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:927:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:928:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMModifierAccess().getVarAction_2_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:934:6: (otherlv_8= 'Override' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:934:6: (otherlv_8= 'Override' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:934:8: otherlv_8= 'Override' ()
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleMModifier2049); 

                        	newLeafNode(otherlv_8, grammarAccess.getMModifierAccess().getOverrideKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:938:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:939:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMModifierAccess().getOverrideAction_3_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:945:6: (otherlv_10= 'Data' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:945:6: (otherlv_10= 'Data' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:945:8: otherlv_10= 'Data' ()
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleMModifier2078); 

                        	newLeafNode(otherlv_10, grammarAccess.getMModifierAccess().getDataKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:949:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:950:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMModifierAccess().getDataAction_4_1(),
                                current);
                        

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
    // $ANTLR end "ruleMModifier"


    // $ANTLR start "entryRuleAssignment"
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:963:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:964:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:965:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment2124);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment2134); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:972:1: ruleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:975:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExp ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:976:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:976:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExp ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:976:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExp ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:976:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:977:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:977:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:978:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment2176); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleAssignment2193); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:998:1: ( (lv_exp_2_0= ruleExp ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:999:1: (lv_exp_2_0= ruleExp )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:999:1: (lv_exp_2_0= ruleExp )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1000:3: lv_exp_2_0= ruleExp
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExp_in_ruleAssignment2214);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1026:1: entryRuleFeatureType returns [EObject current=null] : iv_ruleFeatureType= ruleFeatureType EOF ;
    public final EObject entryRuleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1027:2: (iv_ruleFeatureType= ruleFeatureType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1028:2: iv_ruleFeatureType= ruleFeatureType EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_ruleFeatureType_in_entryRuleFeatureType2252);
            iv_ruleFeatureType=ruleFeatureType();

            state._fsp--;

             current =iv_ruleFeatureType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureType2262); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1035:1: ruleFeatureType returns [EObject current=null] : (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? ) | (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? ) | (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? ) | (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? ) | (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1038:28: ( (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? ) | (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? ) | (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? ) | (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? ) | (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1039:1: (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? ) | (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? ) | (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? ) | (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? ) | (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1039:1: (this_BaseFeatureType_0= ruleBaseFeatureType | (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? ) | (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? ) | (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? ) | (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? ) | (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? ) )
            int alt35=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt35=1;
                }
                break;
            case 36:
                {
                alt35=2;
                }
                break;
            case 40:
                {
                alt35=3;
                }
                break;
            case 41:
                {
                alt35=4;
                }
                break;
            case 43:
                {
                alt35=5;
                }
                break;
            case 44:
                {
                alt35=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1040:5: this_BaseFeatureType_0= ruleBaseFeatureType
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseFeatureTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2309);
                    this_BaseFeatureType_0=ruleBaseFeatureType();

                    state._fsp--;

                     
                            current = this_BaseFeatureType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1049:6: (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1049:6: (otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1049:8: otherlv_1= 'Option' () otherlv_3= '[' ( (lv_base_4_0= ruleBaseFeatureType ) ) otherlv_5= ']' (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )?
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleFeatureType2327); 

                        	newLeafNode(otherlv_1, grammarAccess.getFeatureTypeAccess().getOptionKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1053:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1054:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getOptionFeatureTypeAction_1_1(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleFeatureType2348); 

                        	newLeafNode(otherlv_3, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1063:1: ( (lv_base_4_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1064:1: (lv_base_4_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1064:1: (lv_base_4_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1065:3: lv_base_4_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2369);
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

                    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleFeatureType2381); 

                        	newLeafNode(otherlv_5, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_1_4());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1085:1: (otherlv_6= '=' ( (lv_none_7_0= 'None' ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==26) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1085:3: otherlv_6= '=' ( (lv_none_7_0= 'None' ) )
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType2394); 

                                	newLeafNode(otherlv_6, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_1_5_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1089:1: ( (lv_none_7_0= 'None' ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1090:1: (lv_none_7_0= 'None' )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1090:1: (lv_none_7_0= 'None' )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1091:3: lv_none_7_0= 'None'
                            {
                            lv_none_7_0=(Token)match(input,39,FOLLOW_39_in_ruleFeatureType2412); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1105:6: (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1105:6: (otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1105:8: otherlv_8= 'Some' () otherlv_10= '[' ( (lv_base_11_0= ruleBaseFeatureType ) ) otherlv_12= ']' (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )?
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleFeatureType2447); 

                        	newLeafNode(otherlv_8, grammarAccess.getFeatureTypeAccess().getSomeKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1109:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1110:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getSomeFeatureTypeAction_2_1(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleFeatureType2468); 

                        	newLeafNode(otherlv_10, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_2_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1119:1: ( (lv_base_11_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1120:1: (lv_base_11_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1120:1: (lv_base_11_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1121:3: lv_base_11_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2489);
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

                    otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleFeatureType2501); 

                        	newLeafNode(otherlv_12, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_2_4());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1141:1: (otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==26) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1141:3: otherlv_13= '=' otherlv_14= '{' ( (lv_members_15_0= ruleMemberDecl ) )* otherlv_16= '}'
                            {
                            otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType2514); 

                                	newLeafNode(otherlv_13, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_2_5_0());
                                
                            otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleFeatureType2526); 

                                	newLeafNode(otherlv_14, grammarAccess.getFeatureTypeAccess().getLeftCurlyBracketKeyword_2_5_1());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1149:1: ( (lv_members_15_0= ruleMemberDecl ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==RULE_ID||(LA24_0>=27 && LA24_0<=35)||LA24_0==45) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1150:1: (lv_members_15_0= ruleMemberDecl )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1150:1: (lv_members_15_0= ruleMemberDecl )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1151:3: lv_members_15_0= ruleMemberDecl
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getMembersMemberDeclParserRuleCall_2_5_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleFeatureType2547);
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
                            	    break loop24;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleFeatureType2560); 

                                	newLeafNode(otherlv_16, grammarAccess.getFeatureTypeAccess().getRightCurlyBracketKeyword_2_5_3());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1172:6: (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1172:6: (otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1172:8: otherlv_17= 'Either' () otherlv_19= '[' ( (lv_bases_20_0= ruleBaseFeatureType ) ) (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+ otherlv_23= ']' (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )?
                    {
                    otherlv_17=(Token)match(input,41,FOLLOW_41_in_ruleFeatureType2582); 

                        	newLeafNode(otherlv_17, grammarAccess.getFeatureTypeAccess().getEitherKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1176:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1177:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getEitherFeatureTypeAction_3_1(),
                                current);
                        

                    }

                    otherlv_19=(Token)match(input,37,FOLLOW_37_in_ruleFeatureType2603); 

                        	newLeafNode(otherlv_19, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_3_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1186:1: ( (lv_bases_20_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1187:1: (lv_bases_20_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1187:1: (lv_bases_20_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1188:3: lv_bases_20_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBasesBaseFeatureTypeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2624);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1204:2: (otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==42) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1204:4: otherlv_21= ',' ( (lv_bases_22_0= ruleBaseFeatureType ) )
                    	    {
                    	    otherlv_21=(Token)match(input,42,FOLLOW_42_in_ruleFeatureType2637); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getFeatureTypeAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1208:1: ( (lv_bases_22_0= ruleBaseFeatureType ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1209:1: (lv_bases_22_0= ruleBaseFeatureType )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1209:1: (lv_bases_22_0= ruleBaseFeatureType )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1210:3: lv_bases_22_0= ruleBaseFeatureType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBasesBaseFeatureTypeParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2658);
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
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    otherlv_23=(Token)match(input,38,FOLLOW_38_in_ruleFeatureType2672); 

                        	newLeafNode(otherlv_23, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_3_5());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1230:1: (otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==26) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1230:3: otherlv_24= '=' ( (lv_choice_25_0= RULE_NAT ) ) otherlv_26= '{' ( (lv_members_27_0= ruleMemberDecl ) )* otherlv_28= '}'
                            {
                            otherlv_24=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType2685); 

                                	newLeafNode(otherlv_24, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_3_6_0());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1234:1: ( (lv_choice_25_0= RULE_NAT ) )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1235:1: (lv_choice_25_0= RULE_NAT )
                            {
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1235:1: (lv_choice_25_0= RULE_NAT )
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1236:3: lv_choice_25_0= RULE_NAT
                            {
                            lv_choice_25_0=(Token)match(input,RULE_NAT,FOLLOW_RULE_NAT_in_ruleFeatureType2702); 

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

                            otherlv_26=(Token)match(input,22,FOLLOW_22_in_ruleFeatureType2719); 

                                	newLeafNode(otherlv_26, grammarAccess.getFeatureTypeAccess().getLeftCurlyBracketKeyword_3_6_2());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1256:1: ( (lv_members_27_0= ruleMemberDecl ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==RULE_ID||(LA27_0>=27 && LA27_0<=35)||LA27_0==45) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1257:1: (lv_members_27_0= ruleMemberDecl )
                            	    {
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1257:1: (lv_members_27_0= ruleMemberDecl )
                            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1258:3: lv_members_27_0= ruleMemberDecl
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getMembersMemberDeclParserRuleCall_3_6_3_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleFeatureType2740);
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
                            	    break loop27;
                                }
                            } while (true);

                            otherlv_28=(Token)match(input,23,FOLLOW_23_in_ruleFeatureType2753); 

                                	newLeafNode(otherlv_28, grammarAccess.getFeatureTypeAccess().getRightCurlyBracketKeyword_3_6_4());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1279:6: (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1279:6: (otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1279:8: otherlv_29= 'Seq' () otherlv_31= '[' ( (lv_base_32_0= ruleBaseFeatureType ) ) otherlv_33= ']' (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )?
                    {
                    otherlv_29=(Token)match(input,43,FOLLOW_43_in_ruleFeatureType2775); 

                        	newLeafNode(otherlv_29, grammarAccess.getFeatureTypeAccess().getSeqKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1283:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1284:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getSeqFeatureTypeAction_4_1(),
                                current);
                        

                    }

                    otherlv_31=(Token)match(input,37,FOLLOW_37_in_ruleFeatureType2796); 

                        	newLeafNode(otherlv_31, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_4_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1293:1: ( (lv_base_32_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1294:1: (lv_base_32_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1294:1: (lv_base_32_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1295:3: lv_base_32_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2817);
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

                    otherlv_33=(Token)match(input,38,FOLLOW_38_in_ruleFeatureType2829); 

                        	newLeafNode(otherlv_33, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_4_4());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1315:1: (otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==26) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1315:3: otherlv_34= '=' otherlv_35= '[' ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )? otherlv_39= ']'
                            {
                            otherlv_34=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType2842); 

                                	newLeafNode(otherlv_34, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_4_5_0());
                                
                            otherlv_35=(Token)match(input,37,FOLLOW_37_in_ruleFeatureType2854); 

                                	newLeafNode(otherlv_35, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_4_5_1());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1323:1: ( ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )* )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==RULE_ID) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1323:2: ( (lv_elements_36_0= ruleBaseFeatureType ) ) (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )*
                                    {
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1323:2: ( (lv_elements_36_0= ruleBaseFeatureType ) )
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1324:1: (lv_elements_36_0= ruleBaseFeatureType )
                                    {
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1324:1: (lv_elements_36_0= ruleBaseFeatureType )
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1325:3: lv_elements_36_0= ruleBaseFeatureType
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getElementsBaseFeatureTypeParserRuleCall_4_5_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2876);
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

                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1341:2: (otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) ) )*
                                    loop29:
                                    do {
                                        int alt29=2;
                                        int LA29_0 = input.LA(1);

                                        if ( (LA29_0==42) ) {
                                            alt29=1;
                                        }


                                        switch (alt29) {
                                    	case 1 :
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1341:4: otherlv_37= ',' ( (lv_elements_38_0= ruleBaseFeatureType ) )
                                    	    {
                                    	    otherlv_37=(Token)match(input,42,FOLLOW_42_in_ruleFeatureType2889); 

                                    	        	newLeafNode(otherlv_37, grammarAccess.getFeatureTypeAccess().getCommaKeyword_4_5_2_1_0());
                                    	        
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1345:1: ( (lv_elements_38_0= ruleBaseFeatureType ) )
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1346:1: (lv_elements_38_0= ruleBaseFeatureType )
                                    	    {
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1346:1: (lv_elements_38_0= ruleBaseFeatureType )
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1347:3: lv_elements_38_0= ruleBaseFeatureType
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getElementsBaseFeatureTypeParserRuleCall_4_5_2_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2910);
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
                                    	    break loop29;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_39=(Token)match(input,38,FOLLOW_38_in_ruleFeatureType2926); 

                                	newLeafNode(otherlv_39, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_4_5_3());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1368:6: (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1368:6: (otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )? )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1368:8: otherlv_40= 'Set' () otherlv_42= '[' ( (lv_base_43_0= ruleBaseFeatureType ) ) otherlv_44= ']' (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )?
                    {
                    otherlv_40=(Token)match(input,44,FOLLOW_44_in_ruleFeatureType2948); 

                        	newLeafNode(otherlv_40, grammarAccess.getFeatureTypeAccess().getSetKeyword_5_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1372:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1373:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFeatureTypeAccess().getSetFeatureTypeAction_5_1(),
                                current);
                        

                    }

                    otherlv_42=(Token)match(input,37,FOLLOW_37_in_ruleFeatureType2969); 

                        	newLeafNode(otherlv_42, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_5_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1382:1: ( (lv_base_43_0= ruleBaseFeatureType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1383:1: (lv_base_43_0= ruleBaseFeatureType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1383:1: (lv_base_43_0= ruleBaseFeatureType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1384:3: lv_base_43_0= ruleBaseFeatureType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getBaseBaseFeatureTypeParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2990);
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

                    otherlv_44=(Token)match(input,38,FOLLOW_38_in_ruleFeatureType3002); 

                        	newLeafNode(otherlv_44, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_5_4());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1404:1: (otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==26) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1404:3: otherlv_45= '=' otherlv_46= '{' ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )? otherlv_50= '}'
                            {
                            otherlv_45=(Token)match(input,26,FOLLOW_26_in_ruleFeatureType3015); 

                                	newLeafNode(otherlv_45, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_5_5_0());
                                
                            otherlv_46=(Token)match(input,22,FOLLOW_22_in_ruleFeatureType3027); 

                                	newLeafNode(otherlv_46, grammarAccess.getFeatureTypeAccess().getLeftCurlyBracketKeyword_5_5_1());
                                
                            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1412:1: ( ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )* )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==RULE_ID) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1412:2: ( (lv_elements_47_0= ruleBaseFeatureType ) ) (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )*
                                    {
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1412:2: ( (lv_elements_47_0= ruleBaseFeatureType ) )
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1413:1: (lv_elements_47_0= ruleBaseFeatureType )
                                    {
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1413:1: (lv_elements_47_0= ruleBaseFeatureType )
                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1414:3: lv_elements_47_0= ruleBaseFeatureType
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getElementsBaseFeatureTypeParserRuleCall_5_5_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType3049);
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

                                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1430:2: (otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) ) )*
                                    loop32:
                                    do {
                                        int alt32=2;
                                        int LA32_0 = input.LA(1);

                                        if ( (LA32_0==42) ) {
                                            alt32=1;
                                        }


                                        switch (alt32) {
                                    	case 1 :
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1430:4: otherlv_48= ',' ( (lv_elements_49_0= ruleBaseFeatureType ) )
                                    	    {
                                    	    otherlv_48=(Token)match(input,42,FOLLOW_42_in_ruleFeatureType3062); 

                                    	        	newLeafNode(otherlv_48, grammarAccess.getFeatureTypeAccess().getCommaKeyword_5_5_2_1_0());
                                    	        
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1434:1: ( (lv_elements_49_0= ruleBaseFeatureType ) )
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1435:1: (lv_elements_49_0= ruleBaseFeatureType )
                                    	    {
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1435:1: (lv_elements_49_0= ruleBaseFeatureType )
                                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1436:3: lv_elements_49_0= ruleBaseFeatureType
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getFeatureTypeAccess().getElementsBaseFeatureTypeParserRuleCall_5_5_2_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleBaseFeatureType_in_ruleFeatureType3083);
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
                                    	    break loop32;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_50=(Token)match(input,23,FOLLOW_23_in_ruleFeatureType3099); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1464:1: entryRuleBaseFeatureType returns [EObject current=null] : iv_ruleBaseFeatureType= ruleBaseFeatureType EOF ;
    public final EObject entryRuleBaseFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseFeatureType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1465:2: (iv_ruleBaseFeatureType= ruleBaseFeatureType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1466:2: iv_ruleBaseFeatureType= ruleBaseFeatureType EOF
            {
             newCompositeNode(grammarAccess.getBaseFeatureTypeRule()); 
            pushFollow(FOLLOW_ruleBaseFeatureType_in_entryRuleBaseFeatureType3138);
            iv_ruleBaseFeatureType=ruleBaseFeatureType();

            state._fsp--;

             current =iv_ruleBaseFeatureType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseFeatureType3148); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1473:1: ruleBaseFeatureType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1476:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1477:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1477:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1477:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1477:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1478:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1478:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1479:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBaseFeatureTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseFeatureType3193); 

            		newLeafNode(otherlv_0, grammarAccess.getBaseFeatureTypeAccess().getComponentsFeatureDeclCrossReference_0_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1490:2: (otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1490:4: otherlv_1= 'with' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleBaseFeatureType3206); 

            	        	newLeafNode(otherlv_1, grammarAccess.getBaseFeatureTypeAccess().getWithKeyword_1_0());
            	        
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1494:1: ( (otherlv_2= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1495:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1495:1: (otherlv_2= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1496:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBaseFeatureTypeRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseFeatureType3226); 

            	    		newLeafNode(otherlv_2, grammarAccess.getBaseFeatureTypeAccess().getComponentsFeatureDeclCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1507:4: (otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1507:6: otherlv_3= '=' otherlv_4= '{' ( (lv_members_5_0= ruleMemberDecl ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleBaseFeatureType3241); 

                        	newLeafNode(otherlv_3, grammarAccess.getBaseFeatureTypeAccess().getEqualsSignKeyword_2_0());
                        
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleBaseFeatureType3253); 

                        	newLeafNode(otherlv_4, grammarAccess.getBaseFeatureTypeAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1515:1: ( (lv_members_5_0= ruleMemberDecl ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID||(LA37_0>=27 && LA37_0<=35)||LA37_0==45) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1516:1: (lv_members_5_0= ruleMemberDecl )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1516:1: (lv_members_5_0= ruleMemberDecl )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1517:3: lv_members_5_0= ruleMemberDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBaseFeatureTypeAccess().getMembersMemberDeclParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMemberDecl_in_ruleBaseFeatureType3274);
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleBaseFeatureType3287); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1545:1: entryRuleInvariantDecl returns [EObject current=null] : iv_ruleInvariantDecl= ruleInvariantDecl EOF ;
    public final EObject entryRuleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantDecl = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1546:2: (iv_ruleInvariantDecl= ruleInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1547:2: iv_ruleInvariantDecl= ruleInvariantDecl EOF
            {
             newCompositeNode(grammarAccess.getInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl3325);
            iv_ruleInvariantDecl=ruleInvariantDecl();

            state._fsp--;

             current =iv_ruleInvariantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariantDecl3335); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1554:1: ruleInvariantDecl returns [EObject current=null] : (this_MultiplicityInvariant_0= ruleMultiplicityInvariant | this_GeneralInvariant_1= ruleGeneralInvariant ) ;
    public final EObject ruleInvariantDecl() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicityInvariant_0 = null;

        EObject this_GeneralInvariant_1 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1557:28: ( (this_MultiplicityInvariant_0= ruleMultiplicityInvariant | this_GeneralInvariant_1= ruleGeneralInvariant ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1558:1: (this_MultiplicityInvariant_0= ruleMultiplicityInvariant | this_GeneralInvariant_1= ruleGeneralInvariant )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1558:1: (this_MultiplicityInvariant_0= ruleMultiplicityInvariant | this_GeneralInvariant_1= ruleGeneralInvariant )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA39_2 = input.LA(3);

                    if ( (LA39_2==25) ) {
                        int LA39_5 = input.LA(4);

                        if ( (LA39_5==RULE_ID||LA39_5==50) ) {
                            alt39=2;
                        }
                        else if ( (LA39_5==RULE_NAT||LA39_5==48) ) {
                            alt39=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 39, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA39_2==EOF||LA39_2==RULE_ID||LA39_2==RULE_LIT||LA39_2==23||(LA39_2>=27 && LA39_2<=35)||LA39_2==45||LA39_2==47) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 50:
                    {
                    alt39=2;
                    }
                    break;
                case RULE_NAT:
                case 48:
                    {
                    alt39=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1559:5: this_MultiplicityInvariant_0= ruleMultiplicityInvariant
                    {
                     
                            newCompositeNode(grammarAccess.getInvariantDeclAccess().getMultiplicityInvariantParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMultiplicityInvariant_in_ruleInvariantDecl3382);
                    this_MultiplicityInvariant_0=ruleMultiplicityInvariant();

                    state._fsp--;

                     
                            current = this_MultiplicityInvariant_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1569:5: this_GeneralInvariant_1= ruleGeneralInvariant
                    {
                     
                            newCompositeNode(grammarAccess.getInvariantDeclAccess().getGeneralInvariantParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGeneralInvariant_in_ruleInvariantDecl3409);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1585:1: entryRuleMultiplicityInvariant returns [EObject current=null] : iv_ruleMultiplicityInvariant= ruleMultiplicityInvariant EOF ;
    public final EObject entryRuleMultiplicityInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityInvariant = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1586:2: (iv_ruleMultiplicityInvariant= ruleMultiplicityInvariant EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1587:2: iv_ruleMultiplicityInvariant= ruleMultiplicityInvariant EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityInvariantRule()); 
            pushFollow(FOLLOW_ruleMultiplicityInvariant_in_entryRuleMultiplicityInvariant3444);
            iv_ruleMultiplicityInvariant=ruleMultiplicityInvariant();

            state._fsp--;

             current =iv_ruleMultiplicityInvariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityInvariant3454); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1594:1: ruleMultiplicityInvariant returns [EObject current=null] : (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1597:28: ( (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1598:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1598:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1598:3: otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) ) ( (lv_match_6_0= ruleSubMemberMatch ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleMultiplicityInvariant3491); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiplicityInvariantAccess().getInvKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:1: ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:2: ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1602:2: ( (lv_invName_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1603:1: (lv_invName_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1603:1: (lv_invName_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1604:3: lv_invName_1_0= RULE_ID
                    {
                    lv_invName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariant3509); 

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

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleMultiplicityInvariant3526); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiplicityInvariantAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1624:3: ( ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1624:4: ( (lv_lo_3_0= ruleConstraintNat ) ) otherlv_4= '..' ( (lv_hi_5_0= ruleConstraintNat ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1624:4: ( (lv_lo_3_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1625:1: (lv_lo_3_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1625:1: (lv_lo_3_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1626:3: lv_lo_3_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantAccess().getLoConstraintNatParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariant3550);
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

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleMultiplicityInvariant3562); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiplicityInvariantAccess().getFullStopFullStopKeyword_2_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1646:1: ( (lv_hi_5_0= ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1647:1: (lv_hi_5_0= ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1647:1: (lv_hi_5_0= ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1648:3: lv_hi_5_0= ruleConstraintNat
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantAccess().getHiConstraintNatParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariant3583);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1664:3: ( (lv_match_6_0= ruleSubMemberMatch ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1665:1: (lv_match_6_0= ruleSubMemberMatch )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1665:1: (lv_match_6_0= ruleSubMemberMatch )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1666:3: lv_match_6_0= ruleSubMemberMatch
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityInvariantAccess().getMatchSubMemberMatchParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSubMemberMatch_in_ruleMultiplicityInvariant3605);
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

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1682:2: (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1682:4: otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleMultiplicityInvariant3618); 

                        	newLeafNode(otherlv_7, grammarAccess.getMultiplicityInvariantAccess().getColonKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1686:1: ( (otherlv_8= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1687:1: (otherlv_8= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1687:1: (otherlv_8= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1688:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityInvariantRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiplicityInvariant3638); 

                    		newLeafNode(otherlv_8, grammarAccess.getMultiplicityInvariantAccess().getTypeFeatureDeclCrossReference_4_1_0()); 
                    	

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1707:1: entryRuleGeneralInvariant returns [EObject current=null] : iv_ruleGeneralInvariant= ruleGeneralInvariant EOF ;
    public final EObject entryRuleGeneralInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralInvariant = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1708:2: (iv_ruleGeneralInvariant= ruleGeneralInvariant EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1709:2: iv_ruleGeneralInvariant= ruleGeneralInvariant EOF
            {
             newCompositeNode(grammarAccess.getGeneralInvariantRule()); 
            pushFollow(FOLLOW_ruleGeneralInvariant_in_entryRuleGeneralInvariant3676);
            iv_ruleGeneralInvariant=ruleGeneralInvariant();

            state._fsp--;

             current =iv_ruleGeneralInvariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralInvariant3686); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1716:1: ruleGeneralInvariant returns [EObject current=null] : (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleGeneralInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_invName_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1719:28: ( (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1720:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1720:1: (otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1720:3: otherlv_0= 'inv' ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleGeneralInvariant3723); 

                	newLeafNode(otherlv_0, grammarAccess.getGeneralInvariantAccess().getInvKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1724:1: ( ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==25) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1724:2: ( (lv_invName_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1724:2: ( (lv_invName_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1725:1: (lv_invName_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1725:1: (lv_invName_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1726:3: lv_invName_1_0= RULE_ID
                    {
                    lv_invName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralInvariant3741); 

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

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleGeneralInvariant3758); 

                        	newLeafNode(otherlv_2, grammarAccess.getGeneralInvariantAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1746:3: ( (lv_exp_3_0= ruleExp ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1747:1: (lv_exp_3_0= ruleExp )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1747:1: (lv_exp_3_0= ruleExp )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1748:3: lv_exp_3_0= ruleExp
            {
             
            	        newCompositeNode(grammarAccess.getGeneralInvariantAccess().getExpExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExp_in_ruleGeneralInvariant3781);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1772:1: entryRuleSubMemberMatch returns [EObject current=null] : iv_ruleSubMemberMatch= ruleSubMemberMatch EOF ;
    public final EObject entryRuleSubMemberMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMemberMatch = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1773:2: (iv_ruleSubMemberMatch= ruleSubMemberMatch EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1774:2: iv_ruleSubMemberMatch= ruleSubMemberMatch EOF
            {
             newCompositeNode(grammarAccess.getSubMemberMatchRule()); 
            pushFollow(FOLLOW_ruleSubMemberMatch_in_entryRuleSubMemberMatch3817);
            iv_ruleSubMemberMatch=ruleSubMemberMatch();

            state._fsp--;

             current =iv_ruleSubMemberMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMemberMatch3827); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1781:1: ruleSubMemberMatch returns [EObject current=null] : ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) ) ;
    public final EObject ruleSubMemberMatch() throws RecognitionException {
        EObject current = null;

        Token lv_qNames_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_any_3_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1784:28: ( ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1785:1: ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1785:1: ( ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1785:2: ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )* ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1785:2: ( ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    int LA43_1 = input.LA(2);

                    if ( (LA43_1==47) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1785:3: ( (lv_qNames_0_0= RULE_ID ) ) otherlv_1= '.'
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1785:3: ( (lv_qNames_0_0= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1786:1: (lv_qNames_0_0= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1786:1: (lv_qNames_0_0= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1787:3: lv_qNames_0_0= RULE_ID
            	    {
            	    lv_qNames_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberMatch3870); 

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

            	    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleSubMemberMatch3887); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSubMemberMatchAccess().getFullStopKeyword_0_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1807:3: ( ( (lv_name_2_0= RULE_ID ) ) | ( (lv_any_3_0= '*' ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==48) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1807:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1807:4: ( (lv_name_2_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1808:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1808:1: (lv_name_2_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1809:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubMemberMatch3907); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1826:6: ( (lv_any_3_0= '*' ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1826:6: ( (lv_any_3_0= '*' ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1827:1: (lv_any_3_0= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1827:1: (lv_any_3_0= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1828:3: lv_any_3_0= '*'
                    {
                    lv_any_3_0=(Token)match(input,48,FOLLOW_48_in_ruleSubMemberMatch3936); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1849:1: entryRuleConstraintNat returns [EObject current=null] : iv_ruleConstraintNat= ruleConstraintNat EOF ;
    public final EObject entryRuleConstraintNat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintNat = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1850:2: (iv_ruleConstraintNat= ruleConstraintNat EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1851:2: iv_ruleConstraintNat= ruleConstraintNat EOF
            {
             newCompositeNode(grammarAccess.getConstraintNatRule()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat3986);
            iv_ruleConstraintNat=ruleConstraintNat();

            state._fsp--;

             current =iv_ruleConstraintNat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintNat3996); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1858:1: ruleConstraintNat returns [EObject current=null] : ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) ;
    public final EObject ruleConstraintNat() throws RecognitionException {
        EObject current = null;

        Token lv_num_1_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1861:28: ( ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1862:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1862:1: ( ( () ( (lv_num_1_0= RULE_NAT ) ) ) | ( () otherlv_3= '*' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_NAT) ) {
                alt45=1;
            }
            else if ( (LA45_0==48) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1862:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1862:2: ( () ( (lv_num_1_0= RULE_NAT ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1862:3: () ( (lv_num_1_0= RULE_NAT ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1862:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1863:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getNumNatConstraintAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1868:2: ( (lv_num_1_0= RULE_NAT ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1869:1: (lv_num_1_0= RULE_NAT )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1869:1: (lv_num_1_0= RULE_NAT )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1870:3: lv_num_1_0= RULE_NAT
                    {
                    lv_num_1_0=(Token)match(input,RULE_NAT,FOLLOW_RULE_NAT_in_ruleConstraintNat4048); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1887:6: ( () otherlv_3= '*' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1887:6: ( () otherlv_3= '*' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1887:7: () otherlv_3= '*'
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1887:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1888:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstraintNatAccess().getAnyNatConstraintAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleConstraintNat4082); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1905:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1906:2: (iv_ruleDevice= ruleDevice EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1907:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_ruleDevice_in_entryRuleDevice4119);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevice4129); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1914:1: ruleDevice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1917:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1918:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1918:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1918:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )* ( (lv_constraint_5_0= ruleConstraintExp ) )?
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1918:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1919:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1919:1: (lv_name_0_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1920:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice4171); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleDevice4188); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getColonKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1940:1: ( (otherlv_2= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1941:1: (otherlv_2= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1941:1: (otherlv_2= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1942:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice4208); 

            		newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getComponentsFeatureDeclCrossReference_2_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1953:2: (otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==15) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1953:4: otherlv_3= 'with' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDevice4221); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getWithKeyword_3_0());
            	        
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1957:1: ( (otherlv_4= RULE_ID ) )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1958:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1958:1: (otherlv_4= RULE_ID )
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1959:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeviceRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice4241); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getComponentsFeatureDeclCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1970:4: ( (lv_constraint_5_0= ruleConstraintExp ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1971:1: (lv_constraint_5_0= ruleConstraintExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1971:1: (lv_constraint_5_0= ruleConstraintExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1972:3: lv_constraint_5_0= ruleConstraintExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceAccess().getConstraintConstraintExpParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraintExp_in_ruleDevice4264);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1996:1: entryRuleConstraintExp returns [EObject current=null] : iv_ruleConstraintExp= ruleConstraintExp EOF ;
    public final EObject entryRuleConstraintExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintExp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1997:2: (iv_ruleConstraintExp= ruleConstraintExp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:1998:2: iv_ruleConstraintExp= ruleConstraintExp EOF
            {
             newCompositeNode(grammarAccess.getConstraintExpRule()); 
            pushFollow(FOLLOW_ruleConstraintExp_in_entryRuleConstraintExp4301);
            iv_ruleConstraintExp=ruleConstraintExp();

            state._fsp--;

             current =iv_ruleConstraintExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintExp4311); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2005:1: ruleConstraintExp returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_cond_1_0= ruleExp ) ) ) ;
    public final EObject ruleConstraintExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2008:28: ( (otherlv_0= 'constraint' ( (lv_cond_1_0= ruleExp ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2009:1: (otherlv_0= 'constraint' ( (lv_cond_1_0= ruleExp ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2009:1: (otherlv_0= 'constraint' ( (lv_cond_1_0= ruleExp ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2009:3: otherlv_0= 'constraint' ( (lv_cond_1_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleConstraintExp4348); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintExpAccess().getConstraintKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2013:1: ( (lv_cond_1_0= ruleExp ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2014:1: (lv_cond_1_0= ruleExp )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2014:1: (lv_cond_1_0= ruleExp )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2015:3: lv_cond_1_0= ruleExp
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpAccess().getCondExpParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExp_in_ruleConstraintExp4369);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2045:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2046:2: (iv_ruleExp= ruleExp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2047:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_ruleExp_in_entryRuleExp4411);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp4421); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2054:1: ruleExp returns [EObject current=null] : ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2057:28: ( ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2058:1: ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2058:1: ( (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' ) | (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' ) | ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* ) )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_ID||LA49_1==50) ) {
                    alt49=1;
                }
                else if ( ((LA49_1>=62 && LA49_1<=63)||(LA49_1>=66 && LA49_1<=68)) ) {
                    alt49=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==RULE_ID) ) {
                alt49=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2058:2: (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2058:2: (otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2058:4: otherlv_0= '(' () ( (lv_left_2_0= ruleExp ) ) ( (lv_op_3_0= ruleBinaryOp ) ) ( (lv_right_4_0= ruleExp ) ) otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleExp4459); 

                        	newLeafNode(otherlv_0, grammarAccess.getExpAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2062:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2063:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpAccess().getBinaryExpAction_0_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2068:2: ( (lv_left_2_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2069:1: (lv_left_2_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2069:1: (lv_left_2_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2070:3: lv_left_2_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getLeftExpParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleExp4489);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2086:2: ( (lv_op_3_0= ruleBinaryOp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2087:1: (lv_op_3_0= ruleBinaryOp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2087:1: (lv_op_3_0= ruleBinaryOp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2088:3: lv_op_3_0= ruleBinaryOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getOpBinaryOpParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBinaryOp_in_ruleExp4510);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2104:2: ( (lv_right_4_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2105:1: (lv_right_4_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2105:1: (lv_right_4_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2106:3: lv_right_4_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getRightExpParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleExp4531);
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

                    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleExp4543); 

                        	newLeafNode(otherlv_5, grammarAccess.getExpAccess().getRightParenthesisKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2127:6: (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2127:6: (otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2127:8: otherlv_6= '(' () ( (lv_op_8_0= ruleUnaryOp ) ) ( (lv_arg_9_0= ruleExp ) ) otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleExp4563); 

                        	newLeafNode(otherlv_6, grammarAccess.getExpAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2131:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2132:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpAccess().getUnaryExpAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2137:2: ( (lv_op_8_0= ruleUnaryOp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2138:1: (lv_op_8_0= ruleUnaryOp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2138:1: (lv_op_8_0= ruleUnaryOp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2139:3: lv_op_8_0= ruleUnaryOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getOpUnaryOpParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryOp_in_ruleExp4593);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2155:2: ( (lv_arg_9_0= ruleExp ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2156:1: (lv_arg_9_0= ruleExp )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2156:1: (lv_arg_9_0= ruleExp )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2157:3: lv_arg_9_0= ruleExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getArgExpParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp_in_ruleExp4614);
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

                    otherlv_10=(Token)match(input,51,FOLLOW_51_in_ruleExp4626); 

                        	newLeafNode(otherlv_10, grammarAccess.getExpAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2178:6: ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2178:6: ( () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )* )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2178:7: () ( (lv_primary_12_0= rulePrimary ) ) (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2178:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2179:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpAccess().getPrimaryExpAction_2_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2184:2: ( (lv_primary_12_0= rulePrimary ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2185:1: (lv_primary_12_0= rulePrimary )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2185:1: (lv_primary_12_0= rulePrimary )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2186:3: lv_primary_12_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpAccess().getPrimaryPrimaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_ruleExp4664);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2202:2: (otherlv_13= '.' () ( (otherlv_15= RULE_ID ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==47) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2202:4: otherlv_13= '.' () ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleExp4677); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getExpAccess().getFullStopKeyword_2_2_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2206:1: ()
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2207:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getExpAccess().getAccessExpBaseAction_2_2_1(),
                    	                current);
                    	        

                    	    }

                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2212:2: ( (otherlv_15= RULE_ID ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2213:1: (otherlv_15= RULE_ID )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2213:1: (otherlv_15= RULE_ID )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2214:3: otherlv_15= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExpRule());
                    	    	        }
                    	            
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExp4706); 

                    	    		newLeafNode(otherlv_15, grammarAccess.getExpAccess().getAccessorAccessorCrossReference_2_2_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2233:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2234:2: (iv_rulePrimary= rulePrimary EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2235:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary4745);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary4755); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2242:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_lit_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2245:28: ( ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2246:1: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2246:1: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) | ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==EOF||LA50_1==RULE_ID||LA50_1==23||(LA50_1>=27 && LA50_1<=35)||LA50_1==45||(LA50_1>=47 && LA50_1<=48)||(LA50_1>=50 && LA50_1<=65)) ) {
                    alt50=1;
                }
                else if ( (LA50_1==RULE_LIT) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2246:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2246:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2246:3: () ( (lv_id_1_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2246:3: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2247:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNameExpAction_0_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2252:2: ( (lv_id_1_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2253:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2253:1: (lv_id_1_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2254:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary4807); 

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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2271:6: ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2271:6: ( () ( (lv_lit_3_0= ruleBasicLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2271:7: () ( (lv_lit_3_0= ruleBasicLiteral ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2271:7: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2272:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getLiteralExpAction_1_0(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2277:2: ( (lv_lit_3_0= ruleBasicLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2278:1: (lv_lit_3_0= ruleBasicLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2278:1: (lv_lit_3_0= ruleBasicLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2279:3: lv_lit_3_0= ruleBasicLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getLitBasicLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBasicLiteral_in_rulePrimary4850);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2303:1: entryRuleBinaryOp returns [String current=null] : iv_ruleBinaryOp= ruleBinaryOp EOF ;
    public final String entryRuleBinaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2304:2: (iv_ruleBinaryOp= ruleBinaryOp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2305:2: iv_ruleBinaryOp= ruleBinaryOp EOF
            {
             newCompositeNode(grammarAccess.getBinaryOpRule()); 
            pushFollow(FOLLOW_ruleBinaryOp_in_entryRuleBinaryOp4888);
            iv_ruleBinaryOp=ruleBinaryOp();

            state._fsp--;

             current =iv_ruleBinaryOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOp4899); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2312:1: ruleBinaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2315:28: ( (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2316:1: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2316:1: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' | kw= '&&' | kw= '||' | kw= '==>' | kw= '<==' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            int alt51=15;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt51=1;
                }
                break;
            case 53:
                {
                alt51=2;
                }
                break;
            case 54:
                {
                alt51=3;
                }
                break;
            case 55:
                {
                alt51=4;
                }
                break;
            case 56:
                {
                alt51=5;
                }
                break;
            case 57:
                {
                alt51=6;
                }
                break;
            case 58:
                {
                alt51=7;
                }
                break;
            case 59:
                {
                alt51=8;
                }
                break;
            case 60:
                {
                alt51=9;
                }
                break;
            case 61:
                {
                alt51=10;
                }
                break;
            case 62:
                {
                alt51=11;
                }
                break;
            case 63:
                {
                alt51=12;
                }
                break;
            case 48:
                {
                alt51=13;
                }
                break;
            case 64:
                {
                alt51=14;
                }
                break;
            case 65:
                {
                alt51=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2317:2: kw= '=='
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleBinaryOp4937); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2324:2: kw= '!='
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleBinaryOp4956); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2331:2: kw= '>='
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleBinaryOp4975); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2338:2: kw= '<='
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleBinaryOp4994); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2345:2: kw= '>'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleBinaryOp5013); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getGreaterThanSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2352:2: kw= '<'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleBinaryOp5032); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getLessThanSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2359:2: kw= '&&'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleBinaryOp5051); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getAmpersandAmpersandKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2366:2: kw= '||'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleBinaryOp5070); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getVerticalLineVerticalLineKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2373:2: kw= '==>'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleBinaryOp5089); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2380:2: kw= '<=='
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleBinaryOp5108); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getLessThanSignEqualsSignEqualsSignKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2387:2: kw= '+'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleBinaryOp5127); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getPlusSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2394:2: kw= '-'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleBinaryOp5146); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getHyphenMinusKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2401:2: kw= '*'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleBinaryOp5165); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getAsteriskKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2408:2: kw= '/'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleBinaryOp5184); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOpAccess().getSolidusKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2415:2: kw= '%'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleBinaryOp5203); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2428:1: entryRuleUnaryOp returns [String current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final String entryRuleUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOp = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2429:2: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2430:2: iv_ruleUnaryOp= ruleUnaryOp EOF
            {
             newCompositeNode(grammarAccess.getUnaryOpRule()); 
            pushFollow(FOLLOW_ruleUnaryOp_in_entryRuleUnaryOp5244);
            iv_ruleUnaryOp=ruleUnaryOp();

            state._fsp--;

             current =iv_ruleUnaryOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOp5255); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2437:1: ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2440:28: ( (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2441:1: (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2441:1: (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '~' )
            int alt52=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt52=1;
                }
                break;
            case 63:
                {
                alt52=2;
                }
                break;
            case 66:
                {
                alt52=3;
                }
                break;
            case 67:
                {
                alt52=4;
                }
                break;
            case 68:
                {
                alt52=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2442:2: kw= '+'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleUnaryOp5293); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2449:2: kw= '-'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleUnaryOp5312); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2456:2: kw= '!'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleUnaryOp5331); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getExclamationMarkKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2463:2: kw= '^'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleUnaryOp5350); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryOpAccess().getCircumflexAccentKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2470:2: kw= '~'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleUnaryOp5369); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2483:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2484:2: (iv_ruleType= ruleType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2485:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType5409);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType5419); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2492:1: ruleType returns [EObject current=null] : ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2495:28: ( ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2496:1: ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2496:1: ( (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' ) | this_BaseType_10= ruleBaseType )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt53=1;
                }
                break;
            case 44:
                {
                alt53=2;
                }
                break;
            case RULE_ID:
            case 36:
            case 39:
            case 40:
            case 57:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2496:2: (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2496:2: (otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2496:4: otherlv_0= 'Seq' () otherlv_2= '[' ( (lv_base_3_0= ruleType ) ) otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleType5457); 

                        	newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getSeqKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2500:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2501:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getSeqTypeAction_0_1(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleType5478); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2510:1: ( (lv_base_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2511:1: (lv_base_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2511:1: (lv_base_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2512:3: lv_base_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType5499);
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

                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleType5511); 

                        	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2533:6: (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2533:6: (otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2533:8: otherlv_5= 'Set' () otherlv_7= '[' ( (lv_base_8_0= ruleType ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleType5531); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getSetKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2537:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2538:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeAccess().getSetTypeAction_1_1(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleType5552); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2547:1: ( (lv_base_8_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2548:1: (lv_base_8_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2548:1: (lv_base_8_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2549:3: lv_base_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType5573);
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

                    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleType5585); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2571:5: this_BaseType_10= ruleBaseType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBaseType_in_ruleType5614);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2587:1: entryRuleBaseType returns [EObject current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final EObject entryRuleBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseType = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2588:2: (iv_ruleBaseType= ruleBaseType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2589:2: iv_ruleBaseType= ruleBaseType EOF
            {
             newCompositeNode(grammarAccess.getBaseTypeRule()); 
            pushFollow(FOLLOW_ruleBaseType_in_entryRuleBaseType5649);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;

             current =iv_ruleBaseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseType5659); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2596:1: ruleBaseType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2599:28: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2600:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2600:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' ) | (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' ) | (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' ) | (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' ) )
            int alt55=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt55=1;
                }
                break;
            case 57:
                {
                alt55=2;
                }
                break;
            case 36:
                {
                alt55=3;
                }
                break;
            case 40:
                {
                alt55=4;
                }
                break;
            case 39:
                {
                alt55=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2600:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2600:2: ( (otherlv_0= RULE_ID ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2601:1: (otherlv_0= RULE_ID )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2601:1: (otherlv_0= RULE_ID )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2602:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseTypeRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseType5704); 

                    		newLeafNode(otherlv_0, grammarAccess.getBaseTypeAccess().getTypeTypeDeclCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2614:6: (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2614:6: (otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2614:8: otherlv_1= '<' () ( (lv_elemTypes_3_0= ruleType ) ) (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+ otherlv_6= '>'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleBaseType5723); 

                        	newLeafNode(otherlv_1, grammarAccess.getBaseTypeAccess().getLessThanSignKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2618:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2619:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getTupleTypeAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2624:2: ( (lv_elemTypes_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2625:1: (lv_elemTypes_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2625:1: (lv_elemTypes_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2626:3: lv_elemTypes_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getElemTypesTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5753);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2642:2: (otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) ) )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==48) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2642:4: otherlv_4= '*' ( (lv_elemTypes_5_0= ruleType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleBaseType5766); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getBaseTypeAccess().getAsteriskKeyword_1_3_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2646:1: ( (lv_elemTypes_5_0= ruleType ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2647:1: (lv_elemTypes_5_0= ruleType )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2647:1: (lv_elemTypes_5_0= ruleType )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2648:3: lv_elemTypes_5_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getElemTypesTypeParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleBaseType5787);
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
                    	    if ( cnt54 >= 1 ) break loop54;
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);

                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleBaseType5801); 

                        	newLeafNode(otherlv_6, grammarAccess.getBaseTypeAccess().getGreaterThanSignKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2669:6: (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2669:6: (otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2669:8: otherlv_7= 'Option' () otherlv_9= '[' ( (lv_base_10_0= ruleType ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleBaseType5821); 

                        	newLeafNode(otherlv_7, grammarAccess.getBaseTypeAccess().getOptionKeyword_2_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2673:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2674:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getOptionTypeAction_2_1(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleBaseType5842); 

                        	newLeafNode(otherlv_9, grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_2_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2683:1: ( (lv_base_10_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2684:1: (lv_base_10_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2684:1: (lv_base_10_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2685:3: lv_base_10_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getBaseTypeParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5863);
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

                    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleBaseType5875); 

                        	newLeafNode(otherlv_11, grammarAccess.getBaseTypeAccess().getRightSquareBracketKeyword_2_4());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2706:6: (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2706:6: (otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2706:8: otherlv_12= 'Some' () otherlv_14= '[' ( (lv_base_15_0= ruleType ) ) otherlv_16= ']'
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleBaseType5895); 

                        	newLeafNode(otherlv_12, grammarAccess.getBaseTypeAccess().getSomeKeyword_3_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2710:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2711:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getSomeTypeAction_3_1(),
                                current);
                        

                    }

                    otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleBaseType5916); 

                        	newLeafNode(otherlv_14, grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_3_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2720:1: ( (lv_base_15_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2721:1: (lv_base_15_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2721:1: (lv_base_15_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2722:3: lv_base_15_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getBaseTypeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType5937);
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

                    otherlv_16=(Token)match(input,38,FOLLOW_38_in_ruleBaseType5949); 

                        	newLeafNode(otherlv_16, grammarAccess.getBaseTypeAccess().getRightSquareBracketKeyword_3_4());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2743:6: (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2743:6: (otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2743:8: otherlv_17= 'None' () otherlv_19= '[' ( (lv_base_20_0= ruleType ) ) otherlv_21= ']'
                    {
                    otherlv_17=(Token)match(input,39,FOLLOW_39_in_ruleBaseType5969); 

                        	newLeafNode(otherlv_17, grammarAccess.getBaseTypeAccess().getNoneKeyword_4_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2747:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2748:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getNoneTypeAction_4_1(),
                                current);
                        

                    }

                    otherlv_19=(Token)match(input,37,FOLLOW_37_in_ruleBaseType5990); 

                        	newLeafNode(otherlv_19, grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_4_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2757:1: ( (lv_base_20_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2758:1: (lv_base_20_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2758:1: (lv_base_20_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2759:3: lv_base_20_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseTypeAccess().getBaseTypeParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType6011);
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

                    otherlv_21=(Token)match(input,38,FOLLOW_38_in_ruleBaseType6023); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2787:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2788:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2789:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6060);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6070); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2796:1: ruleLiteral returns [EObject current=null] : (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BasicLiteral_0 = null;

        EObject this_TupleLiteral_1 = null;

        EObject this_OptionLiteral_2 = null;

        EObject this_SeqLiteral_3 = null;

        EObject this_SetLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2799:28: ( (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2800:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2800:1: (this_BasicLiteral_0= ruleBasicLiteral | this_TupleLiteral_1= ruleTupleLiteral | this_OptionLiteral_2= ruleOptionLiteral | this_SeqLiteral_3= ruleSeqLiteral | this_SetLiteral_4= ruleSetLiteral )
            int alt56=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt56=1;
                }
                break;
            case 57:
                {
                alt56=2;
                }
                break;
            case 39:
            case 40:
                {
                alt56=3;
                }
                break;
            case 43:
                {
                alt56=4;
                }
                break;
            case 44:
                {
                alt56=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2801:5: this_BasicLiteral_0= ruleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicLiteral_in_ruleLiteral6117);
                    this_BasicLiteral_0=ruleBasicLiteral();

                    state._fsp--;

                     
                            current = this_BasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2811:5: this_TupleLiteral_1= ruleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleLiteral_in_ruleLiteral6144);
                    this_TupleLiteral_1=ruleTupleLiteral();

                    state._fsp--;

                     
                            current = this_TupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2821:5: this_OptionLiteral_2= ruleOptionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getOptionLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleOptionLiteral_in_ruleLiteral6171);
                    this_OptionLiteral_2=ruleOptionLiteral();

                    state._fsp--;

                     
                            current = this_OptionLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2831:5: this_SeqLiteral_3= ruleSeqLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSeqLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSeqLiteral_in_ruleLiteral6198);
                    this_SeqLiteral_3=ruleSeqLiteral();

                    state._fsp--;

                     
                            current = this_SeqLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2841:5: this_SetLiteral_4= ruleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleLiteral6225);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2857:1: entryRuleBasicLiteral returns [EObject current=null] : iv_ruleBasicLiteral= ruleBasicLiteral EOF ;
    public final EObject entryRuleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2858:2: (iv_ruleBasicLiteral= ruleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2859:2: iv_ruleBasicLiteral= ruleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral6260);
            iv_ruleBasicLiteral=ruleBasicLiteral();

            state._fsp--;

             current =iv_ruleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicLiteral6270); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2866:1: ruleBasicLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) ;
    public final EObject ruleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lit_1_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2869:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2870:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2870:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2870:2: ( (otherlv_0= RULE_ID ) ) ( (lv_lit_1_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2870:2: ( (otherlv_0= RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2871:1: (otherlv_0= RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2871:1: (otherlv_0= RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2872:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicLiteral6315); 

            		newLeafNode(otherlv_0, grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            	

            }


            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2883:2: ( (lv_lit_1_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2884:1: (lv_lit_1_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2884:1: (lv_lit_1_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2885:3: lv_lit_1_0= RULE_LIT
            {
            lv_lit_1_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleBasicLiteral6332); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2909:1: entryRuleTupleLiteral returns [EObject current=null] : iv_ruleTupleLiteral= ruleTupleLiteral EOF ;
    public final EObject entryRuleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2910:2: (iv_ruleTupleLiteral= ruleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2911:2: iv_ruleTupleLiteral= ruleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral6373);
            iv_ruleTupleLiteral=ruleTupleLiteral();

            state._fsp--;

             current =iv_ruleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteral6383); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2918:1: ruleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2921:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2922:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2922:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2922:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleTupleLiteral6420); 

                	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2926:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2927:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2932:2: ( ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID||(LA58_0>=39 && LA58_0<=40)||(LA58_0>=43 && LA58_0<=44)||LA58_0==57) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2932:3: ( (lv_elems_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2932:3: ( (lv_elems_2_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2933:1: (lv_elems_2_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2933:1: (lv_elems_2_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2934:3: lv_elems_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral6451);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2950:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==42) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2950:4: otherlv_3= ',' ( (lv_elems_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleTupleLiteral6464); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2954:1: ( (lv_elems_4_0= ruleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2955:1: (lv_elems_4_0= ruleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2955:1: (lv_elems_4_0= ruleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2956:3: lv_elems_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleTupleLiteral6485);
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,56,FOLLOW_56_in_ruleTupleLiteral6501); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2984:1: entryRuleSeqLiteral returns [EObject current=null] : iv_ruleSeqLiteral= ruleSeqLiteral EOF ;
    public final EObject entryRuleSeqLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2985:2: (iv_ruleSeqLiteral= ruleSeqLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2986:2: iv_ruleSeqLiteral= ruleSeqLiteral EOF
            {
             newCompositeNode(grammarAccess.getSeqLiteralRule()); 
            pushFollow(FOLLOW_ruleSeqLiteral_in_entryRuleSeqLiteral6537);
            iv_ruleSeqLiteral=ruleSeqLiteral();

            state._fsp--;

             current =iv_ruleSeqLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeqLiteral6547); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2993:1: ruleSeqLiteral returns [EObject current=null] : (otherlv_0= 'Seq' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '[' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= ']' ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2996:28: ( (otherlv_0= 'Seq' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '[' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2997:1: (otherlv_0= 'Seq' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '[' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2997:1: (otherlv_0= 'Seq' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '[' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:2997:3: otherlv_0= 'Seq' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '[' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleSeqLiteral6584); 

                	newLeafNode(otherlv_0, grammarAccess.getSeqLiteralAccess().getSeqKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleSeqLiteral6596); 

                	newLeafNode(otherlv_1, grammarAccess.getSeqLiteralAccess().getLeftSquareBracketKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3005:1: ( (lv_elementType_2_0= ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3006:1: (lv_elementType_2_0= ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3006:1: (lv_elementType_2_0= ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3007:3: lv_elementType_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSeqLiteralAccess().getElementTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSeqLiteral6617);
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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleSeqLiteral6629); 

                	newLeafNode(otherlv_3, grammarAccess.getSeqLiteralAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleSeqLiteral6641); 

                	newLeafNode(otherlv_4, grammarAccess.getSeqLiteralAccess().getLeftSquareBracketKeyword_4());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3031:1: ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_LIT||LA60_0==22||LA60_0==37||(LA60_0>=39 && LA60_0<=40)||LA60_0==57) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3031:2: ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3031:2: ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3032:1: (lv_elems_5_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3032:1: (lv_elems_5_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3033:3: lv_elems_5_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6663);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3049:2: (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==42) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3049:4: otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleSeqLiteral6676); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSeqLiteralAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3053:1: ( (lv_elems_7_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3054:1: (lv_elems_7_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3054:1: (lv_elems_7_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3055:3: lv_elems_7_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6697);
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
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleSeqLiteral6713); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3083:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3084:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3085:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral6749);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;

             current =iv_ruleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral6759); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3092:1: ruleSetLiteral returns [EObject current=null] : (otherlv_0= 'Set' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '{' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= '}' ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3095:28: ( (otherlv_0= 'Set' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '{' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3096:1: (otherlv_0= 'Set' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '{' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3096:1: (otherlv_0= 'Set' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '{' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3096:3: otherlv_0= 'Set' otherlv_1= '[' ( (lv_elementType_2_0= ruleType ) ) otherlv_3= ']' otherlv_4= '{' ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleSetLiteral6796); 

                	newLeafNode(otherlv_0, grammarAccess.getSetLiteralAccess().getSetKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleSetLiteral6808); 

                	newLeafNode(otherlv_1, grammarAccess.getSetLiteralAccess().getLeftSquareBracketKeyword_1());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3104:1: ( (lv_elementType_2_0= ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3105:1: (lv_elementType_2_0= ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3105:1: (lv_elementType_2_0= ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3106:3: lv_elementType_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElementTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSetLiteral6829);
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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleSetLiteral6841); 

                	newLeafNode(otherlv_3, grammarAccess.getSetLiteralAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleSetLiteral6853); 

                	newLeafNode(otherlv_4, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_4());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3130:1: ( ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_LIT||LA62_0==22||LA62_0==37||(LA62_0>=39 && LA62_0<=40)||LA62_0==57) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3130:2: ( (lv_elems_5_0= ruleSimpleLiteral ) ) (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3130:2: ( (lv_elems_5_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3131:1: (lv_elems_5_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3131:1: (lv_elems_5_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3132:3: lv_elems_5_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6875);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3148:2: (otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==42) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3148:4: otherlv_6= ',' ( (lv_elems_7_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleSetLiteral6888); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSetLiteralAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3152:1: ( (lv_elems_7_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3153:1: (lv_elems_7_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3153:1: (lv_elems_7_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3154:3: lv_elems_7_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6909);
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
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleSetLiteral6925); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3182:1: entryRuleOptionLiteral returns [EObject current=null] : iv_ruleOptionLiteral= ruleOptionLiteral EOF ;
    public final EObject entryRuleOptionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3183:2: (iv_ruleOptionLiteral= ruleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3184:2: iv_ruleOptionLiteral= ruleOptionLiteral EOF
            {
             newCompositeNode(grammarAccess.getOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral6961);
            iv_ruleOptionLiteral=ruleOptionLiteral();

            state._fsp--;

             current =iv_ruleOptionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionLiteral6971); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3191:1: ruleOptionLiteral returns [EObject current=null] : ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) ) ;
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
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3194:28: ( ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3195:1: ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3195:1: ( (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' ) | (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==39) ) {
                alt63=1;
            }
            else if ( (LA63_0==40) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3195:2: (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3195:2: (otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3195:4: otherlv_0= 'None' () otherlv_2= '[' ( (lv_type_3_0= ruleType ) ) otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleOptionLiteral7009); 

                        	newLeafNode(otherlv_0, grammarAccess.getOptionLiteralAccess().getNoneKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3199:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3200:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionLiteralAccess().getNoneLiteralAction_0_1(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleOptionLiteral7030); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionLiteralAccess().getLeftSquareBracketKeyword_0_2());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3209:1: ( (lv_type_3_0= ruleType ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3210:1: (lv_type_3_0= ruleType )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3210:1: (lv_type_3_0= ruleType )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3211:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionLiteralAccess().getTypeTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleOptionLiteral7051);
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

                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleOptionLiteral7063); 

                        	newLeafNode(otherlv_4, grammarAccess.getOptionLiteralAccess().getRightSquareBracketKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3232:6: (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3232:6: (otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3232:8: otherlv_5= 'Some' () ( (lv_lit_7_0= ruleLiteral ) )
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleOptionLiteral7083); 

                        	newLeafNode(otherlv_5, grammarAccess.getOptionLiteralAccess().getSomeKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3236:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3237:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionLiteralAccess().getSomeLiteralAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3242:2: ( (lv_lit_7_0= ruleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3243:1: (lv_lit_7_0= ruleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3243:1: (lv_lit_7_0= ruleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3244:3: lv_lit_7_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionLiteralAccess().getLitLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleOptionLiteral7113);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3268:1: entryRuleSimpleLiteral returns [EObject current=null] : iv_ruleSimpleLiteral= ruleSimpleLiteral EOF ;
    public final EObject entryRuleSimpleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3269:2: (iv_ruleSimpleLiteral= ruleSimpleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3270:2: iv_ruleSimpleLiteral= ruleSimpleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleLiteral_in_entryRuleSimpleLiteral7150);
            iv_ruleSimpleLiteral=ruleSimpleLiteral();

            state._fsp--;

             current =iv_ruleSimpleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleLiteral7160); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3277:1: ruleSimpleLiteral returns [EObject current=null] : (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral ) ;
    public final EObject ruleSimpleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBasicLiteral_0 = null;

        EObject this_SimpleTupleLiteral_1 = null;

        EObject this_SimpleSeqLiteral_2 = null;

        EObject this_SimpleSetLiteral_3 = null;

        EObject this_SimpleOptionLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3280:28: ( (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3281:1: (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3281:1: (this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral | this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral | this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral | this_SimpleSetLiteral_3= ruleSimpleSetLiteral | this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral )
            int alt64=5;
            switch ( input.LA(1) ) {
            case RULE_LIT:
                {
                alt64=1;
                }
                break;
            case 57:
                {
                alt64=2;
                }
                break;
            case 37:
                {
                alt64=3;
                }
                break;
            case 22:
                {
                alt64=4;
                }
                break;
            case 39:
            case 40:
                {
                alt64=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3282:5: this_SimpleBasicLiteral_0= ruleSimpleBasicLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleBasicLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleBasicLiteral_in_ruleSimpleLiteral7207);
                    this_SimpleBasicLiteral_0=ruleSimpleBasicLiteral();

                    state._fsp--;

                     
                            current = this_SimpleBasicLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3292:5: this_SimpleTupleLiteral_1= ruleSimpleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleTupleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleTupleLiteral_in_ruleSimpleLiteral7234);
                    this_SimpleTupleLiteral_1=ruleSimpleTupleLiteral();

                    state._fsp--;

                     
                            current = this_SimpleTupleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3302:5: this_SimpleSeqLiteral_2= ruleSimpleSeqLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleSeqLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSimpleSeqLiteral_in_ruleSimpleLiteral7261);
                    this_SimpleSeqLiteral_2=ruleSimpleSeqLiteral();

                    state._fsp--;

                     
                            current = this_SimpleSeqLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3312:5: this_SimpleSetLiteral_3= ruleSimpleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleSetLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSimpleSetLiteral_in_ruleSimpleLiteral7288);
                    this_SimpleSetLiteral_3=ruleSimpleSetLiteral();

                    state._fsp--;

                     
                            current = this_SimpleSetLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3322:5: this_SimpleOptionLiteral_4= ruleSimpleOptionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleLiteralAccess().getSimpleOptionLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSimpleOptionLiteral_in_ruleSimpleLiteral7315);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3338:1: entryRuleSimpleBasicLiteral returns [EObject current=null] : iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF ;
    public final EObject entryRuleSimpleBasicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBasicLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3339:2: (iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3340:2: iv_ruleSimpleBasicLiteral= ruleSimpleBasicLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleBasicLiteral_in_entryRuleSimpleBasicLiteral7350);
            iv_ruleSimpleBasicLiteral=ruleSimpleBasicLiteral();

            state._fsp--;

             current =iv_ruleSimpleBasicLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBasicLiteral7360); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3347:1: ruleSimpleBasicLiteral returns [EObject current=null] : ( (lv_lit_0_0= RULE_LIT ) ) ;
    public final EObject ruleSimpleBasicLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_0=null;

         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3350:28: ( ( (lv_lit_0_0= RULE_LIT ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3351:1: ( (lv_lit_0_0= RULE_LIT ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3351:1: ( (lv_lit_0_0= RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3352:1: (lv_lit_0_0= RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3352:1: (lv_lit_0_0= RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3353:3: lv_lit_0_0= RULE_LIT
            {
            lv_lit_0_0=(Token)match(input,RULE_LIT,FOLLOW_RULE_LIT_in_ruleSimpleBasicLiteral7401); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3377:1: entryRuleSimpleTupleLiteral returns [EObject current=null] : iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF ;
    public final EObject entryRuleSimpleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTupleLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3378:2: (iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3379:2: iv_ruleSimpleTupleLiteral= ruleSimpleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleTupleLiteral_in_entryRuleSimpleTupleLiteral7441);
            iv_ruleSimpleTupleLiteral=ruleSimpleTupleLiteral();

            state._fsp--;

             current =iv_ruleSimpleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTupleLiteral7451); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3386:1: ruleSimpleTupleLiteral returns [EObject current=null] : (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleSimpleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3389:28: ( (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3390:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3390:1: (otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3390:3: otherlv_0= '<' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleSimpleTupleLiteral7488); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTupleLiteralAccess().getLessThanSignKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3394:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3395:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleTupleLiteralAccess().getSimpleTupleLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3400:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_LIT||LA66_0==22||LA66_0==37||(LA66_0>=39 && LA66_0<=40)||LA66_0==57) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3400:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3400:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3401:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3401:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3402:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleTupleLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral7519);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3418:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==42) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3418:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleSimpleTupleLiteral7532); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3422:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3423:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3423:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3424:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleTupleLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral7553);
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
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,56,FOLLOW_56_in_ruleSimpleTupleLiteral7569); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3452:1: entryRuleSimpleOptionLiteral returns [EObject current=null] : iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF ;
    public final EObject entryRuleSimpleOptionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOptionLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3453:2: (iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3454:2: iv_ruleSimpleOptionLiteral= ruleSimpleOptionLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleOptionLiteral_in_entryRuleSimpleOptionLiteral7605);
            iv_ruleSimpleOptionLiteral=ruleSimpleOptionLiteral();

            state._fsp--;

             current =iv_ruleSimpleOptionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOptionLiteral7615); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3461:1: ruleSimpleOptionLiteral returns [EObject current=null] : ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) ) ;
    public final EObject ruleSimpleOptionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lit_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3464:28: ( ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3465:1: ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3465:1: ( (otherlv_0= 'None' () ) | (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==39) ) {
                alt67=1;
            }
            else if ( (LA67_0==40) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3465:2: (otherlv_0= 'None' () )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3465:2: (otherlv_0= 'None' () )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3465:4: otherlv_0= 'None' ()
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleSimpleOptionLiteral7653); 

                        	newLeafNode(otherlv_0, grammarAccess.getSimpleOptionLiteralAccess().getNoneKeyword_0_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3469:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3470:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSimpleOptionLiteralAccess().getSimpleNoneLiteralAction_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3476:6: (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3476:6: (otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3476:8: otherlv_2= 'Some' () ( (lv_lit_4_0= ruleSimpleLiteral ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleSimpleOptionLiteral7682); 

                        	newLeafNode(otherlv_2, grammarAccess.getSimpleOptionLiteralAccess().getSomeKeyword_1_0());
                        
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3480:1: ()
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3481:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSimpleOptionLiteralAccess().getSimpleSomeLiteralAction_1_1(),
                                current);
                        

                    }

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3486:2: ( (lv_lit_4_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3487:1: (lv_lit_4_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3487:1: (lv_lit_4_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3488:3: lv_lit_4_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleOptionLiteralAccess().getLitSimpleLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleOptionLiteral7712);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3512:1: entryRuleSimpleSeqLiteral returns [EObject current=null] : iv_ruleSimpleSeqLiteral= ruleSimpleSeqLiteral EOF ;
    public final EObject entryRuleSimpleSeqLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSeqLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3513:2: (iv_ruleSimpleSeqLiteral= ruleSimpleSeqLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3514:2: iv_ruleSimpleSeqLiteral= ruleSimpleSeqLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleSeqLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleSeqLiteral_in_entryRuleSimpleSeqLiteral7749);
            iv_ruleSimpleSeqLiteral=ruleSimpleSeqLiteral();

            state._fsp--;

             current =iv_ruleSimpleSeqLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSeqLiteral7759); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3521:1: ruleSimpleSeqLiteral returns [EObject current=null] : (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleSimpleSeqLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3524:28: ( (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3525:1: (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3525:1: (otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3525:3: otherlv_0= '[' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleSimpleSeqLiteral7796); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleSeqLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3529:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3530:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleSeqLiteralAccess().getSimpleSeqLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3535:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_LIT||LA69_0==22||LA69_0==37||(LA69_0>=39 && LA69_0<=40)||LA69_0==57) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3535:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3535:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3536:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3536:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3537:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7827);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3553:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==42) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3553:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleSimpleSeqLiteral7840); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleSeqLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3557:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3558:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3558:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3559:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleSeqLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7861);
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
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleSimpleSeqLiteral7877); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3587:1: entryRuleSimpleSetLiteral returns [EObject current=null] : iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF ;
    public final EObject entryRuleSimpleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSetLiteral = null;


        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3588:2: (iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3589:2: iv_ruleSimpleSetLiteral= ruleSimpleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSimpleSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSimpleSetLiteral_in_entryRuleSimpleSetLiteral7913);
            iv_ruleSimpleSetLiteral=ruleSimpleSetLiteral();

            state._fsp--;

             current =iv_ruleSimpleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSetLiteral7923); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3596:1: ruleSimpleSetLiteral returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSimpleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_2_0 = null;

        EObject lv_elems_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3599:28: ( (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3600:1: (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3600:1: (otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3600:3: otherlv_0= '{' () ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSimpleSetLiteral7960); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleSetLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3604:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3605:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleSetLiteralAccess().getSimpleSetLiteralAction_1(),
                        current);
                

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3610:2: ( ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_LIT||LA71_0==22||LA71_0==37||(LA71_0>=39 && LA71_0<=40)||LA71_0==57) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3610:3: ( (lv_elems_2_0= ruleSimpleLiteral ) ) (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3610:3: ( (lv_elems_2_0= ruleSimpleLiteral ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3611:1: (lv_elems_2_0= ruleSimpleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3611:1: (lv_elems_2_0= ruleSimpleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3612:3: lv_elems_2_0= ruleSimpleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral7991);
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

                    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3628:2: (otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==42) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3628:4: otherlv_3= ',' ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleSimpleSetLiteral8004); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSimpleSetLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3632:1: ( (lv_elems_4_0= ruleSimpleLiteral ) )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3633:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    {
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3633:1: (lv_elems_4_0= ruleSimpleLiteral )
                    	    // ../edu.ksu.cis.projects.mdcf.devicemodel/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/parser/antlr/internal/InternalDeviceModelingLanguage.g:3634:3: lv_elems_4_0= ruleSimpleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleSetLiteralAccess().getElemsSimpleLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral8025);
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
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleSimpleSetLiteral8041); 

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
    public static final BitSet FOLLOW_10_in_ruleModel129 = new BitSet(new long[]{0x0000000000392002L});
    public static final BitSet FOLLOW_11_in_ruleModel166 = new BitSet(new long[]{0x0000000000392002L});
    public static final BitSet FOLLOW_12_in_ruleModel203 = new BitSet(new long[]{0x0000000000392002L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleModel239 = new BitSet(new long[]{0x0000000000392002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleDecl333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureDecl_in_ruleDecl360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTypeDecl442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl459 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTypeDecl477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl497 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleTypeDecl510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl530 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleFeatureDecl_in_entryRuleFeatureDecl570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureDecl580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFeatureDecl619 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_17_in_ruleFeatureDecl647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18_in_ruleFeatureDecl684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19_in_ruleFeatureDecl719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20_in_ruleFeatureDecl748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_ruleFeatureDecl777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureDecl805 = new BitSet(new long[]{0x0000000001404002L});
    public static final BitSet FOLLOW_14_in_ruleFeatureDecl823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureDecl843 = new BitSet(new long[]{0x0000000001408002L});
    public static final BitSet FOLLOW_15_in_ruleFeatureDecl856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureDecl876 = new BitSet(new long[]{0x0000000001408002L});
    public static final BitSet FOLLOW_22_in_ruleFeatureDecl893 = new BitSet(new long[]{0x0000200FF8800010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleFeatureDecl914 = new BitSet(new long[]{0x0000200FF8800010L});
    public static final BitSet FOLLOW_23_in_ruleFeatureDecl927 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleFeatureDecl942 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFeatureDecl954 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleDevice_in_ruleFeatureDecl975 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleFeatureDecl997 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleFeatureDecl1019 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFeatureDecl1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_entryRuleMemberDecl1069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDecl1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_ruleMemberDecl1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberDecl_in_ruleMemberDecl1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_ruleMemberDecl1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl1215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrDecl1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleAttrDecl1271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttrDecl1288 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleAttrDecl1307 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttrDecl1328 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleAttrDecl1341 = new BitSet(new long[]{0x0204198000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAttrDecl1384 = new BitSet(new long[]{0x0204198000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttrDecl1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleModifier1491 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleModifier1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModifier1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleModifier1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleModifier1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleModifier1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberDecl_in_entryRuleSubMemberDecl1695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMemberDecl1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMModifier_in_ruleSubMemberDecl1751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberDecl1769 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSubMemberDecl1786 = new BitSet(new long[]{0x00001B1000000010L});
    public static final BitSet FOLLOW_ruleFeatureType_in_ruleSubMemberDecl1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMModifier_in_entryRuleMModifier1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMModifier1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMModifier1891 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_10_in_ruleMModifier1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMModifier1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMModifier1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMModifier2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMModifier2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMModifier2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment2124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment2176 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAssignment2193 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleAssignment2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_entryRuleFeatureType2252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureType2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFeatureType2327 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFeatureType2348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2369 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFeatureType2381 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType2394 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleFeatureType2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFeatureType2447 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFeatureType2468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2489 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFeatureType2501 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType2514 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFeatureType2526 = new BitSet(new long[]{0x0000200FF8800010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleFeatureType2547 = new BitSet(new long[]{0x0000200FF8800010L});
    public static final BitSet FOLLOW_23_in_ruleFeatureType2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleFeatureType2582 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFeatureType2603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2624 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleFeatureType2637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2658 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_38_in_ruleFeatureType2672 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType2685 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NAT_in_ruleFeatureType2702 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFeatureType2719 = new BitSet(new long[]{0x0000200FF8800010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleFeatureType2740 = new BitSet(new long[]{0x0000200FF8800010L});
    public static final BitSet FOLLOW_23_in_ruleFeatureType2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleFeatureType2775 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFeatureType2796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2817 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFeatureType2829 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType2842 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFeatureType2854 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2876 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_42_in_ruleFeatureType2889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2910 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_38_in_ruleFeatureType2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleFeatureType2948 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFeatureType2969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType2990 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFeatureType3002 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFeatureType3015 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFeatureType3027 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType3049 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_42_in_ruleFeatureType3062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_ruleFeatureType3083 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_23_in_ruleFeatureType3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseFeatureType_in_entryRuleBaseFeatureType3138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseFeatureType3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseFeatureType3193 = new BitSet(new long[]{0x0000000004008002L});
    public static final BitSet FOLLOW_15_in_ruleBaseFeatureType3206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseFeatureType3226 = new BitSet(new long[]{0x0000000004008002L});
    public static final BitSet FOLLOW_26_in_ruleBaseFeatureType3241 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBaseFeatureType3253 = new BitSet(new long[]{0x0000200FF8800010L});
    public static final BitSet FOLLOW_ruleMemberDecl_in_ruleBaseFeatureType3274 = new BitSet(new long[]{0x0000200FF8800010L});
    public static final BitSet FOLLOW_23_in_ruleBaseFeatureType3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl3325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariantDecl3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariant_in_ruleInvariantDecl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralInvariant_in_ruleInvariantDecl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariant_in_entryRuleMultiplicityInvariant3444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityInvariant3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMultiplicityInvariant3491 = new BitSet(new long[]{0x0001000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariant3509 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMultiplicityInvariant3526 = new BitSet(new long[]{0x0001000000000030L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariant3550 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleMultiplicityInvariant3562 = new BitSet(new long[]{0x0001000000000030L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_ruleMultiplicityInvariant3583 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_ruleSubMemberMatch_in_ruleMultiplicityInvariant3605 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiplicityInvariant3618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiplicityInvariant3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralInvariant_in_entryRuleGeneralInvariant3676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralInvariant3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleGeneralInvariant3723 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralInvariant3741 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGeneralInvariant3758 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleGeneralInvariant3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMemberMatch_in_entryRuleSubMemberMatch3817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMemberMatch3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberMatch3870 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleSubMemberMatch3887 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubMemberMatch3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSubMemberMatch3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat3986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintNat3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAT_in_ruleConstraintNat4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleConstraintNat4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevice_in_entryRuleDevice4119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevice4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice4171 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDevice4188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice4208 = new BitSet(new long[]{0x0002000000008002L});
    public static final BitSet FOLLOW_15_in_ruleDevice4221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDevice4241 = new BitSet(new long[]{0x0002000000008002L});
    public static final BitSet FOLLOW_ruleConstraintExp_in_ruleDevice4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExp_in_entryRuleConstraintExp4301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExp4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleConstraintExp4348 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleConstraintExp4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_entryRuleExp4411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleExp4459 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp4489 = new BitSet(new long[]{0xFFF1000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleBinaryOp_in_ruleExp4510 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp4531 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleExp4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleExp4563 = new BitSet(new long[]{0xC000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleExp4593 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp4614 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleExp4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleExp4664 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleExp4677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExp4706 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary4745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_rulePrimary4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOp_in_entryRuleBinaryOp4888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOp4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBinaryOp4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBinaryOp4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBinaryOp4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBinaryOp4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBinaryOp5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBinaryOp5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBinaryOp5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBinaryOp5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBinaryOp5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBinaryOp5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBinaryOp5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBinaryOp5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBinaryOp5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleBinaryOp5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBinaryOp5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_entryRuleUnaryOp5244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOp5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleUnaryOp5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleUnaryOp5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleUnaryOp5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleUnaryOp5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleUnaryOp5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType5409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleType5457 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleType5478 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType5499 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleType5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleType5531 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleType5552 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType5573 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleType5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_ruleType5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_entryRuleBaseType5649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseType5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseType5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBaseType5723 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5753 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleBaseType5766 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5787 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_ruleBaseType5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBaseType5821 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBaseType5842 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5863 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBaseType5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBaseType5895 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBaseType5916 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType5937 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBaseType5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBaseType5969 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBaseType5990 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType6011 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBaseType6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_ruleLiteral6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_ruleLiteral6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_ruleLiteral6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeqLiteral_in_ruleLiteral6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleLiteral6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral6260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicLiteral6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicLiteral6315 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleBasicLiteral6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral6373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteral6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTupleLiteral6420 = new BitSet(new long[]{0x0304198000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral6451 = new BitSet(new long[]{0x0100040000000000L});
    public static final BitSet FOLLOW_42_in_ruleTupleLiteral6464 = new BitSet(new long[]{0x0204198000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTupleLiteral6485 = new BitSet(new long[]{0x0100040000000000L});
    public static final BitSet FOLLOW_56_in_ruleTupleLiteral6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeqLiteral_in_entryRuleSeqLiteral6537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeqLiteral6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSeqLiteral6584 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSeqLiteral6596 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleSeqLiteral6617 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSeqLiteral6629 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSeqLiteral6641 = new BitSet(new long[]{0x020001E000400040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6663 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_42_in_ruleSeqLiteral6676 = new BitSet(new long[]{0x020001A000400040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSeqLiteral6697 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_38_in_ruleSeqLiteral6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral6749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSetLiteral6796 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSetLiteral6808 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleSetLiteral6829 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSetLiteral6841 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSetLiteral6853 = new BitSet(new long[]{0x020001A000C00040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6875 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_42_in_ruleSetLiteral6888 = new BitSet(new long[]{0x020001A000400040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSetLiteral6909 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_23_in_ruleSetLiteral6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral6961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionLiteral6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOptionLiteral7009 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleOptionLiteral7030 = new BitSet(new long[]{0x0200199000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleOptionLiteral7051 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleOptionLiteral7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOptionLiteral7083 = new BitSet(new long[]{0x0204198000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleOptionLiteral7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_entryRuleSimpleLiteral7150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLiteral7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBasicLiteral_in_ruleSimpleLiteral7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTupleLiteral_in_ruleSimpleLiteral7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSeqLiteral_in_ruleSimpleLiteral7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSetLiteral_in_ruleSimpleLiteral7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOptionLiteral_in_ruleSimpleLiteral7315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBasicLiteral_in_entryRuleSimpleBasicLiteral7350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBasicLiteral7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_ruleSimpleBasicLiteral7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTupleLiteral_in_entryRuleSimpleTupleLiteral7441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTupleLiteral7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSimpleTupleLiteral7488 = new BitSet(new long[]{0x030001A000400040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral7519 = new BitSet(new long[]{0x0100040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSimpleTupleLiteral7532 = new BitSet(new long[]{0x020001A000400040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleTupleLiteral7553 = new BitSet(new long[]{0x0100040000000000L});
    public static final BitSet FOLLOW_56_in_ruleSimpleTupleLiteral7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOptionLiteral_in_entryRuleSimpleOptionLiteral7605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOptionLiteral7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSimpleOptionLiteral7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSimpleOptionLiteral7682 = new BitSet(new long[]{0x020001A000400040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleOptionLiteral7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSeqLiteral_in_entryRuleSimpleSeqLiteral7749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSeqLiteral7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSimpleSeqLiteral7796 = new BitSet(new long[]{0x020001E000400040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7827 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_42_in_ruleSimpleSeqLiteral7840 = new BitSet(new long[]{0x020001A000400040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSeqLiteral7861 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_38_in_ruleSimpleSeqLiteral7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSetLiteral_in_entryRuleSimpleSetLiteral7913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSetLiteral7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSimpleSetLiteral7960 = new BitSet(new long[]{0x020001A000C00040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral7991 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_42_in_ruleSimpleSetLiteral8004 = new BitSet(new long[]{0x020001A000400040L});
    public static final BitSet FOLLOW_ruleSimpleLiteral_in_ruleSimpleSetLiteral8025 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_23_in_ruleSimpleSetLiteral8041 = new BitSet(new long[]{0x0000000000000002L});

}