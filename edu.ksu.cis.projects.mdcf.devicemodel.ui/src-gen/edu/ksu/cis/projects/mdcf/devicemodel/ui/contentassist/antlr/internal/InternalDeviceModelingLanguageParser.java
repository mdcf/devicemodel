package edu.ksu.cis.projects.mdcf.devicemodel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import edu.ksu.cis.projects.mdcf.devicemodel.services.DeviceModelingLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceModelingLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NAT", "RULE_LIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'const'", "'val'", "'var'", "'def'", "'type'", "'include'", "','", "'{'", "'}'", "'features'", "'inv'", "':'", "'..'", "'.'", "'*'", "'='", "'['", "']'", "'<'", "'>'", "'?'", "'none'", "'some'", "'complete'", "'distinct'"
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
    public String getGrammarFileName() { return "../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g"; }


     
     	private DeviceModelingLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DeviceModelingLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:61:1: ( ruleModel EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:69:1: ruleModel : ( ( rule__Model__DeclsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:73:2: ( ( ( rule__Model__DeclsAssignment )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:74:1: ( ( rule__Model__DeclsAssignment )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:74:1: ( ( rule__Model__DeclsAssignment )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:75:1: ( rule__Model__DeclsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDeclsAssignment()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:76:1: ( rule__Model__DeclsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==19||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:76:2: rule__Model__DeclsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclsAssignment_in_ruleModel94);
            	    rule__Model__DeclsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:88:1: entryRuleDecl : ruleDecl EOF ;
    public final void entryRuleDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:89:1: ( ruleDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:90:1: ruleDecl EOF
            {
             before(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl122);
            ruleDecl();

            state._fsp--;

             after(grammarAccess.getDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:97:1: ruleDecl : ( ( rule__Decl__Alternatives ) ) ;
    public final void ruleDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:101:2: ( ( ( rule__Decl__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:102:1: ( ( rule__Decl__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:102:1: ( ( rule__Decl__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:103:1: ( rule__Decl__Alternatives )
            {
             before(grammarAccess.getDeclAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:104:1: ( rule__Decl__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:104:2: rule__Decl__Alternatives
            {
            pushFollow(FOLLOW_rule__Decl__Alternatives_in_ruleDecl155);
            rule__Decl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleTypeDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:116:1: entryRuleTypeDecl : ruleTypeDecl EOF ;
    public final void entryRuleTypeDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:117:1: ( ruleTypeDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:118:1: ruleTypeDecl EOF
            {
             before(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl182);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getTypeDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:125:1: ruleTypeDecl : ( ( rule__TypeDecl__Group__0 ) ) ;
    public final void ruleTypeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:129:2: ( ( ( rule__TypeDecl__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:130:1: ( ( rule__TypeDecl__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:130:1: ( ( rule__TypeDecl__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:131:1: ( rule__TypeDecl__Group__0 )
            {
             before(grammarAccess.getTypeDeclAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:132:1: ( rule__TypeDecl__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:132:2: rule__TypeDecl__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__0_in_ruleTypeDecl215);
            rule__TypeDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleFeaturesDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:144:1: entryRuleFeaturesDecl : ruleFeaturesDecl EOF ;
    public final void entryRuleFeaturesDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:145:1: ( ruleFeaturesDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:146:1: ruleFeaturesDecl EOF
            {
             before(grammarAccess.getFeaturesDeclRule()); 
            pushFollow(FOLLOW_ruleFeaturesDecl_in_entryRuleFeaturesDecl242);
            ruleFeaturesDecl();

            state._fsp--;

             after(grammarAccess.getFeaturesDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeaturesDecl249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeaturesDecl"


    // $ANTLR start "ruleFeaturesDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:153:1: ruleFeaturesDecl : ( ( rule__FeaturesDecl__Group__0 ) ) ;
    public final void ruleFeaturesDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:157:2: ( ( ( rule__FeaturesDecl__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:158:1: ( ( rule__FeaturesDecl__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:158:1: ( ( rule__FeaturesDecl__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:159:1: ( rule__FeaturesDecl__Group__0 )
            {
             before(grammarAccess.getFeaturesDeclAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:160:1: ( rule__FeaturesDecl__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:160:2: rule__FeaturesDecl__Group__0
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__0_in_ruleFeaturesDecl275);
            rule__FeaturesDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturesDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeaturesDecl"


    // $ANTLR start "entryRuleFeaturesBody"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:172:1: entryRuleFeaturesBody : ruleFeaturesBody EOF ;
    public final void entryRuleFeaturesBody() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:173:1: ( ruleFeaturesBody EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:174:1: ruleFeaturesBody EOF
            {
             before(grammarAccess.getFeaturesBodyRule()); 
            pushFollow(FOLLOW_ruleFeaturesBody_in_entryRuleFeaturesBody302);
            ruleFeaturesBody();

            state._fsp--;

             after(grammarAccess.getFeaturesBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeaturesBody309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeaturesBody"


    // $ANTLR start "ruleFeaturesBody"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:181:1: ruleFeaturesBody : ( ( rule__FeaturesBody__Group__0 ) ) ;
    public final void ruleFeaturesBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:185:2: ( ( ( rule__FeaturesBody__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:186:1: ( ( rule__FeaturesBody__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:186:1: ( ( rule__FeaturesBody__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:187:1: ( rule__FeaturesBody__Group__0 )
            {
             before(grammarAccess.getFeaturesBodyAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:188:1: ( rule__FeaturesBody__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:188:2: rule__FeaturesBody__Group__0
            {
            pushFollow(FOLLOW_rule__FeaturesBody__Group__0_in_ruleFeaturesBody335);
            rule__FeaturesBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturesBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeaturesBody"


    // $ANTLR start "entryRuleFeatureDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:200:1: entryRuleFeatureDecl : ruleFeatureDecl EOF ;
    public final void entryRuleFeatureDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:201:1: ( ruleFeatureDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:202:1: ruleFeatureDecl EOF
            {
             before(grammarAccess.getFeatureDeclRule()); 
            pushFollow(FOLLOW_ruleFeatureDecl_in_entryRuleFeatureDecl362);
            ruleFeatureDecl();

            state._fsp--;

             after(grammarAccess.getFeatureDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureDecl369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureDecl"


    // $ANTLR start "ruleFeatureDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:209:1: ruleFeatureDecl : ( ( rule__FeatureDecl__Alternatives ) ) ;
    public final void ruleFeatureDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:213:2: ( ( ( rule__FeatureDecl__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:214:1: ( ( rule__FeatureDecl__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:214:1: ( ( rule__FeatureDecl__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:215:1: ( rule__FeatureDecl__Alternatives )
            {
             before(grammarAccess.getFeatureDeclAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:216:1: ( rule__FeatureDecl__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:216:2: rule__FeatureDecl__Alternatives
            {
            pushFollow(FOLLOW_rule__FeatureDecl__Alternatives_in_ruleFeatureDecl395);
            rule__FeatureDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureDecl"


    // $ANTLR start "entryRuleInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:228:1: entryRuleInvariantDecl : ruleInvariantDecl EOF ;
    public final void entryRuleInvariantDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:229:1: ( ruleInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:230:1: ruleInvariantDecl EOF
            {
             before(grammarAccess.getInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl422);
            ruleInvariantDecl();

            state._fsp--;

             after(grammarAccess.getInvariantDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariantDecl429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInvariantDecl"


    // $ANTLR start "ruleInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:237:1: ruleInvariantDecl : ( ruleMultiplicityInvariantDecl ) ;
    public final void ruleInvariantDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:241:2: ( ( ruleMultiplicityInvariantDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:242:1: ( ruleMultiplicityInvariantDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:242:1: ( ruleMultiplicityInvariantDecl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:243:1: ruleMultiplicityInvariantDecl
            {
             before(grammarAccess.getInvariantDeclAccess().getMultiplicityInvariantDeclParserRuleCall()); 
            pushFollow(FOLLOW_ruleMultiplicityInvariantDecl_in_ruleInvariantDecl455);
            ruleMultiplicityInvariantDecl();

            state._fsp--;

             after(grammarAccess.getInvariantDeclAccess().getMultiplicityInvariantDeclParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvariantDecl"


    // $ANTLR start "entryRuleMultiplicityInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:256:1: entryRuleMultiplicityInvariantDecl : ruleMultiplicityInvariantDecl EOF ;
    public final void entryRuleMultiplicityInvariantDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:257:1: ( ruleMultiplicityInvariantDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:258:1: ruleMultiplicityInvariantDecl EOF
            {
             before(grammarAccess.getMultiplicityInvariantDeclRule()); 
            pushFollow(FOLLOW_ruleMultiplicityInvariantDecl_in_entryRuleMultiplicityInvariantDecl481);
            ruleMultiplicityInvariantDecl();

            state._fsp--;

             after(grammarAccess.getMultiplicityInvariantDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityInvariantDecl488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicityInvariantDecl"


    // $ANTLR start "ruleMultiplicityInvariantDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:265:1: ruleMultiplicityInvariantDecl : ( ( rule__MultiplicityInvariantDecl__Group__0 ) ) ;
    public final void ruleMultiplicityInvariantDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:269:2: ( ( ( rule__MultiplicityInvariantDecl__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:270:1: ( ( rule__MultiplicityInvariantDecl__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:270:1: ( ( rule__MultiplicityInvariantDecl__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:271:1: ( rule__MultiplicityInvariantDecl__Group__0 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:272:1: ( rule__MultiplicityInvariantDecl__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:272:2: rule__MultiplicityInvariantDecl__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__0_in_ruleMultiplicityInvariantDecl514);
            rule__MultiplicityInvariantDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicityInvariantDecl"


    // $ANTLR start "entryRuleSubFeaturesMatch"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:284:1: entryRuleSubFeaturesMatch : ruleSubFeaturesMatch EOF ;
    public final void entryRuleSubFeaturesMatch() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:285:1: ( ruleSubFeaturesMatch EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:286:1: ruleSubFeaturesMatch EOF
            {
             before(grammarAccess.getSubFeaturesMatchRule()); 
            pushFollow(FOLLOW_ruleSubFeaturesMatch_in_entryRuleSubFeaturesMatch541);
            ruleSubFeaturesMatch();

            state._fsp--;

             after(grammarAccess.getSubFeaturesMatchRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubFeaturesMatch548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubFeaturesMatch"


    // $ANTLR start "ruleSubFeaturesMatch"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:293:1: ruleSubFeaturesMatch : ( ( rule__SubFeaturesMatch__Group__0 ) ) ;
    public final void ruleSubFeaturesMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:297:2: ( ( ( rule__SubFeaturesMatch__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:298:1: ( ( rule__SubFeaturesMatch__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:298:1: ( ( rule__SubFeaturesMatch__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:299:1: ( rule__SubFeaturesMatch__Group__0 )
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:300:1: ( rule__SubFeaturesMatch__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:300:2: rule__SubFeaturesMatch__Group__0
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__0_in_ruleSubFeaturesMatch574);
            rule__SubFeaturesMatch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesMatchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubFeaturesMatch"


    // $ANTLR start "entryRuleConstraintNat"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:312:1: entryRuleConstraintNat : ruleConstraintNat EOF ;
    public final void entryRuleConstraintNat() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:313:1: ( ruleConstraintNat EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:314:1: ruleConstraintNat EOF
            {
             before(grammarAccess.getConstraintNatRule()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat601);
            ruleConstraintNat();

            state._fsp--;

             after(grammarAccess.getConstraintNatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintNat608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintNat"


    // $ANTLR start "ruleConstraintNat"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:321:1: ruleConstraintNat : ( ( rule__ConstraintNat__Alternatives ) ) ;
    public final void ruleConstraintNat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:325:2: ( ( ( rule__ConstraintNat__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:326:1: ( ( rule__ConstraintNat__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:326:1: ( ( rule__ConstraintNat__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:327:1: ( rule__ConstraintNat__Alternatives )
            {
             before(grammarAccess.getConstraintNatAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:328:1: ( rule__ConstraintNat__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:328:2: rule__ConstraintNat__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstraintNat__Alternatives_in_ruleConstraintNat634);
            rule__ConstraintNat__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintNatAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintNat"


    // $ANTLR start "entryRuleAttrDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:340:1: entryRuleAttrDecl : ruleAttrDecl EOF ;
    public final void entryRuleAttrDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:341:1: ( ruleAttrDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:342:1: ruleAttrDecl EOF
            {
             before(grammarAccess.getAttrDeclRule()); 
            pushFollow(FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl661);
            ruleAttrDecl();

            state._fsp--;

             after(grammarAccess.getAttrDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrDecl668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttrDecl"


    // $ANTLR start "ruleAttrDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:349:1: ruleAttrDecl : ( ( rule__AttrDecl__Group__0 ) ) ;
    public final void ruleAttrDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:353:2: ( ( ( rule__AttrDecl__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:354:1: ( ( rule__AttrDecl__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:354:1: ( ( rule__AttrDecl__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:355:1: ( rule__AttrDecl__Group__0 )
            {
             before(grammarAccess.getAttrDeclAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:356:1: ( rule__AttrDecl__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:356:2: rule__AttrDecl__Group__0
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group__0_in_ruleAttrDecl694);
            rule__AttrDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttrDecl"


    // $ANTLR start "entryRuleModifier"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:368:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:369:1: ( ruleModifier EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:370:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier721);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:377:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:381:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:382:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:382:1: ( ( rule__Modifier__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:383:1: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:384:1: ( rule__Modifier__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:384:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier754);
            rule__Modifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:396:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:397:1: ( ruleType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:398:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType781);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:405:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:409:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:410:1: ( ( rule__Type__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:410:1: ( ( rule__Type__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:411:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:412:1: ( rule__Type__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:412:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType814);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:424:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:425:1: ( ruleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:426:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral841);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:433:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:437:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:438:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:438:1: ( ( rule__Literal__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:439:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:440:1: ( rule__Literal__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:440:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral874);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBasicLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:452:1: entryRuleBasicLiteral : ruleBasicLiteral EOF ;
    public final void entryRuleBasicLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:453:1: ( ruleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:454:1: ruleBasicLiteral EOF
            {
             before(grammarAccess.getBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral901);
            ruleBasicLiteral();

            state._fsp--;

             after(grammarAccess.getBasicLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicLiteral908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicLiteral"


    // $ANTLR start "ruleBasicLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:461:1: ruleBasicLiteral : ( ( rule__BasicLiteral__Group__0 ) ) ;
    public final void ruleBasicLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:465:2: ( ( ( rule__BasicLiteral__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:466:1: ( ( rule__BasicLiteral__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:466:1: ( ( rule__BasicLiteral__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:467:1: ( rule__BasicLiteral__Group__0 )
            {
             before(grammarAccess.getBasicLiteralAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:468:1: ( rule__BasicLiteral__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:468:2: rule__BasicLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BasicLiteral__Group__0_in_ruleBasicLiteral934);
            rule__BasicLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicLiteral"


    // $ANTLR start "entryRuleTupleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:480:1: entryRuleTupleLiteral : ruleTupleLiteral EOF ;
    public final void entryRuleTupleLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:481:1: ( ruleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:482:1: ruleTupleLiteral EOF
            {
             before(grammarAccess.getTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral961);
            ruleTupleLiteral();

            state._fsp--;

             after(grammarAccess.getTupleLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteral968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTupleLiteral"


    // $ANTLR start "ruleTupleLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:489:1: ruleTupleLiteral : ( ( rule__TupleLiteral__Group__0 ) ) ;
    public final void ruleTupleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:493:2: ( ( ( rule__TupleLiteral__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:494:1: ( ( rule__TupleLiteral__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:494:1: ( ( rule__TupleLiteral__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:495:1: ( rule__TupleLiteral__Group__0 )
            {
             before(grammarAccess.getTupleLiteralAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:496:1: ( rule__TupleLiteral__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:496:2: rule__TupleLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__0_in_ruleTupleLiteral994);
            rule__TupleLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTupleLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTupleLiteral"


    // $ANTLR start "entryRuleListLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:508:1: entryRuleListLiteral : ruleListLiteral EOF ;
    public final void entryRuleListLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:509:1: ( ruleListLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:510:1: ruleListLiteral EOF
            {
             before(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral1021);
            ruleListLiteral();

            state._fsp--;

             after(grammarAccess.getListLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListLiteral"


    // $ANTLR start "ruleListLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:517:1: ruleListLiteral : ( ( rule__ListLiteral__Group__0 ) ) ;
    public final void ruleListLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:521:2: ( ( ( rule__ListLiteral__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:522:1: ( ( rule__ListLiteral__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:522:1: ( ( rule__ListLiteral__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:523:1: ( rule__ListLiteral__Group__0 )
            {
             before(grammarAccess.getListLiteralAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:524:1: ( rule__ListLiteral__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:524:2: rule__ListLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1054);
            rule__ListLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListLiteral"


    // $ANTLR start "entryRuleSetLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:536:1: entryRuleSetLiteral : ruleSetLiteral EOF ;
    public final void entryRuleSetLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:537:1: ( ruleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:538:1: ruleSetLiteral EOF
            {
             before(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral1081);
            ruleSetLiteral();

            state._fsp--;

             after(grammarAccess.getSetLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetLiteral"


    // $ANTLR start "ruleSetLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:545:1: ruleSetLiteral : ( ( rule__SetLiteral__Group__0 ) ) ;
    public final void ruleSetLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:549:2: ( ( ( rule__SetLiteral__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:550:1: ( ( rule__SetLiteral__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:550:1: ( ( rule__SetLiteral__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:551:1: ( rule__SetLiteral__Group__0 )
            {
             before(grammarAccess.getSetLiteralAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:552:1: ( rule__SetLiteral__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:552:2: rule__SetLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__0_in_ruleSetLiteral1114);
            rule__SetLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleOptionLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:564:1: entryRuleOptionLiteral : ruleOptionLiteral EOF ;
    public final void entryRuleOptionLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:565:1: ( ruleOptionLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:566:1: ruleOptionLiteral EOF
            {
             before(grammarAccess.getOptionLiteralRule()); 
            pushFollow(FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral1141);
            ruleOptionLiteral();

            state._fsp--;

             after(grammarAccess.getOptionLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionLiteral1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionLiteral"


    // $ANTLR start "ruleOptionLiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:573:1: ruleOptionLiteral : ( ( rule__OptionLiteral__Alternatives ) ) ;
    public final void ruleOptionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:577:2: ( ( ( rule__OptionLiteral__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:578:1: ( ( rule__OptionLiteral__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:578:1: ( ( rule__OptionLiteral__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:579:1: ( rule__OptionLiteral__Alternatives )
            {
             before(grammarAccess.getOptionLiteralAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:580:1: ( rule__OptionLiteral__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:580:2: rule__OptionLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__OptionLiteral__Alternatives_in_ruleOptionLiteral1174);
            rule__OptionLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionLiteral"


    // $ANTLR start "entryRuleELiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:592:1: entryRuleELiteral : ruleELiteral EOF ;
    public final void entryRuleELiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:593:1: ( ruleELiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:594:1: ruleELiteral EOF
            {
             before(grammarAccess.getELiteralRule()); 
            pushFollow(FOLLOW_ruleELiteral_in_entryRuleELiteral1201);
            ruleELiteral();

            state._fsp--;

             after(grammarAccess.getELiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleELiteral1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleELiteral"


    // $ANTLR start "ruleELiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:601:1: ruleELiteral : ( ( rule__ELiteral__LitAssignment ) ) ;
    public final void ruleELiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:605:2: ( ( ( rule__ELiteral__LitAssignment ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:606:1: ( ( rule__ELiteral__LitAssignment ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:606:1: ( ( rule__ELiteral__LitAssignment ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:607:1: ( rule__ELiteral__LitAssignment )
            {
             before(grammarAccess.getELiteralAccess().getLitAssignment()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:608:1: ( rule__ELiteral__LitAssignment )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:608:2: rule__ELiteral__LitAssignment
            {
            pushFollow(FOLLOW_rule__ELiteral__LitAssignment_in_ruleELiteral1234);
            rule__ELiteral__LitAssignment();

            state._fsp--;


            }

             after(grammarAccess.getELiteralAccess().getLitAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleELiteral"


    // $ANTLR start "entryRuleSubFeaturesDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:620:1: entryRuleSubFeaturesDecl : ruleSubFeaturesDecl EOF ;
    public final void entryRuleSubFeaturesDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:621:1: ( ruleSubFeaturesDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:622:1: ruleSubFeaturesDecl EOF
            {
             before(grammarAccess.getSubFeaturesDeclRule()); 
            pushFollow(FOLLOW_ruleSubFeaturesDecl_in_entryRuleSubFeaturesDecl1261);
            ruleSubFeaturesDecl();

            state._fsp--;

             after(grammarAccess.getSubFeaturesDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubFeaturesDecl1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubFeaturesDecl"


    // $ANTLR start "ruleSubFeaturesDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:629:1: ruleSubFeaturesDecl : ( ( rule__SubFeaturesDecl__Group__0 ) ) ;
    public final void ruleSubFeaturesDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:633:2: ( ( ( rule__SubFeaturesDecl__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:634:1: ( ( rule__SubFeaturesDecl__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:634:1: ( ( rule__SubFeaturesDecl__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:635:1: ( rule__SubFeaturesDecl__Group__0 )
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:636:1: ( rule__SubFeaturesDecl__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:636:2: rule__SubFeaturesDecl__Group__0
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__0_in_ruleSubFeaturesDecl1294);
            rule__SubFeaturesDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubFeaturesDecl"


    // $ANTLR start "entryRuleSubFeaturesType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:648:1: entryRuleSubFeaturesType : ruleSubFeaturesType EOF ;
    public final void entryRuleSubFeaturesType() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:649:1: ( ruleSubFeaturesType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:650:1: ruleSubFeaturesType EOF
            {
             before(grammarAccess.getSubFeaturesTypeRule()); 
            pushFollow(FOLLOW_ruleSubFeaturesType_in_entryRuleSubFeaturesType1321);
            ruleSubFeaturesType();

            state._fsp--;

             after(grammarAccess.getSubFeaturesTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubFeaturesType1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubFeaturesType"


    // $ANTLR start "ruleSubFeaturesType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:657:1: ruleSubFeaturesType : ( ( rule__SubFeaturesType__Alternatives ) ) ;
    public final void ruleSubFeaturesType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:661:2: ( ( ( rule__SubFeaturesType__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:662:1: ( ( rule__SubFeaturesType__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:662:1: ( ( rule__SubFeaturesType__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:663:1: ( rule__SubFeaturesType__Alternatives )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:664:1: ( rule__SubFeaturesType__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:664:2: rule__SubFeaturesType__Alternatives
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Alternatives_in_ruleSubFeaturesType1354);
            rule__SubFeaturesType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubFeaturesType"


    // $ANTLR start "rule__Decl__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:676:1: rule__Decl__Alternatives : ( ( ruleTypeDecl ) | ( ruleFeaturesDecl ) );
    public final void rule__Decl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:680:1: ( ( ruleTypeDecl ) | ( ruleFeaturesDecl ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==19||LA2_0==33) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:681:1: ( ruleTypeDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:681:1: ( ruleTypeDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:682:1: ruleTypeDecl
                    {
                     before(grammarAccess.getDeclAccess().getTypeDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeDecl_in_rule__Decl__Alternatives1390);
                    ruleTypeDecl();

                    state._fsp--;

                     after(grammarAccess.getDeclAccess().getTypeDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:687:6: ( ruleFeaturesDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:687:6: ( ruleFeaturesDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:688:1: ruleFeaturesDecl
                    {
                     before(grammarAccess.getDeclAccess().getFeaturesDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFeaturesDecl_in_rule__Decl__Alternatives1407);
                    ruleFeaturesDecl();

                    state._fsp--;

                     after(grammarAccess.getDeclAccess().getFeaturesDeclParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Alternatives"


    // $ANTLR start "rule__FeatureDecl__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:698:1: rule__FeatureDecl__Alternatives : ( ( ruleInvariantDecl ) | ( ruleAttrDecl ) | ( ruleSubFeaturesDecl ) );
    public final void rule__FeatureDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:702:1: ( ( ruleInvariantDecl ) | ( ruleAttrDecl ) | ( ruleSubFeaturesDecl ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:703:1: ( ruleInvariantDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:703:1: ( ruleInvariantDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:704:1: ruleInvariantDecl
                    {
                     before(grammarAccess.getFeatureDeclAccess().getInvariantDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInvariantDecl_in_rule__FeatureDecl__Alternatives1439);
                    ruleInvariantDecl();

                    state._fsp--;

                     after(grammarAccess.getFeatureDeclAccess().getInvariantDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:709:6: ( ruleAttrDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:709:6: ( ruleAttrDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:710:1: ruleAttrDecl
                    {
                     before(grammarAccess.getFeatureDeclAccess().getAttrDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttrDecl_in_rule__FeatureDecl__Alternatives1456);
                    ruleAttrDecl();

                    state._fsp--;

                     after(grammarAccess.getFeatureDeclAccess().getAttrDeclParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:715:6: ( ruleSubFeaturesDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:715:6: ( ruleSubFeaturesDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:716:1: ruleSubFeaturesDecl
                    {
                     before(grammarAccess.getFeatureDeclAccess().getSubFeaturesDeclParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSubFeaturesDecl_in_rule__FeatureDecl__Alternatives1473);
                    ruleSubFeaturesDecl();

                    state._fsp--;

                     after(grammarAccess.getFeatureDeclAccess().getSubFeaturesDeclParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDecl__Alternatives"


    // $ANTLR start "rule__SubFeaturesMatch__Alternatives_3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:726:1: rule__SubFeaturesMatch__Alternatives_3 : ( ( ( rule__SubFeaturesMatch__NameAssignment_3_0 ) ) | ( ( rule__SubFeaturesMatch__AnyAssignment_3_1 ) ) );
    public final void rule__SubFeaturesMatch__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:730:1: ( ( ( rule__SubFeaturesMatch__NameAssignment_3_0 ) ) | ( ( rule__SubFeaturesMatch__AnyAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:731:1: ( ( rule__SubFeaturesMatch__NameAssignment_3_0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:731:1: ( ( rule__SubFeaturesMatch__NameAssignment_3_0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:732:1: ( rule__SubFeaturesMatch__NameAssignment_3_0 )
                    {
                     before(grammarAccess.getSubFeaturesMatchAccess().getNameAssignment_3_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:733:1: ( rule__SubFeaturesMatch__NameAssignment_3_0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:733:2: rule__SubFeaturesMatch__NameAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesMatch__NameAssignment_3_0_in_rule__SubFeaturesMatch__Alternatives_31505);
                    rule__SubFeaturesMatch__NameAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubFeaturesMatchAccess().getNameAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:737:6: ( ( rule__SubFeaturesMatch__AnyAssignment_3_1 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:737:6: ( ( rule__SubFeaturesMatch__AnyAssignment_3_1 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:738:1: ( rule__SubFeaturesMatch__AnyAssignment_3_1 )
                    {
                     before(grammarAccess.getSubFeaturesMatchAccess().getAnyAssignment_3_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:739:1: ( rule__SubFeaturesMatch__AnyAssignment_3_1 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:739:2: rule__SubFeaturesMatch__AnyAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesMatch__AnyAssignment_3_1_in_rule__SubFeaturesMatch__Alternatives_31523);
                    rule__SubFeaturesMatch__AnyAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubFeaturesMatchAccess().getAnyAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Alternatives_3"


    // $ANTLR start "rule__ConstraintNat__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:748:1: rule__ConstraintNat__Alternatives : ( ( ( rule__ConstraintNat__Group_0__0 ) ) | ( ( rule__ConstraintNat__Group_1__0 ) ) );
    public final void rule__ConstraintNat__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:752:1: ( ( ( rule__ConstraintNat__Group_0__0 ) ) | ( ( rule__ConstraintNat__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NAT) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:753:1: ( ( rule__ConstraintNat__Group_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:753:1: ( ( rule__ConstraintNat__Group_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:754:1: ( rule__ConstraintNat__Group_0__0 )
                    {
                     before(grammarAccess.getConstraintNatAccess().getGroup_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:755:1: ( rule__ConstraintNat__Group_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:755:2: rule__ConstraintNat__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintNat__Group_0__0_in_rule__ConstraintNat__Alternatives1556);
                    rule__ConstraintNat__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintNatAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:759:6: ( ( rule__ConstraintNat__Group_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:759:6: ( ( rule__ConstraintNat__Group_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:760:1: ( rule__ConstraintNat__Group_1__0 )
                    {
                     before(grammarAccess.getConstraintNatAccess().getGroup_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:761:1: ( rule__ConstraintNat__Group_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:761:2: rule__ConstraintNat__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintNat__Group_1__0_in_rule__ConstraintNat__Alternatives1574);
                    rule__ConstraintNat__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintNatAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintNat__Alternatives"


    // $ANTLR start "rule__AttrDecl__Alternatives_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:770:1: rule__AttrDecl__Alternatives_2 : ( ( ( rule__AttrDecl__Group_2_0__0 ) ) | ( ( rule__AttrDecl__Group_2_1__0 ) ) );
    public final void rule__AttrDecl__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:774:1: ( ( ( rule__AttrDecl__Group_2_0__0 ) ) | ( ( rule__AttrDecl__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:775:1: ( ( rule__AttrDecl__Group_2_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:775:1: ( ( rule__AttrDecl__Group_2_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:776:1: ( rule__AttrDecl__Group_2_0__0 )
                    {
                     before(grammarAccess.getAttrDeclAccess().getGroup_2_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:777:1: ( rule__AttrDecl__Group_2_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:777:2: rule__AttrDecl__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__AttrDecl__Group_2_0__0_in_rule__AttrDecl__Alternatives_21607);
                    rule__AttrDecl__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttrDeclAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:781:6: ( ( rule__AttrDecl__Group_2_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:781:6: ( ( rule__AttrDecl__Group_2_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:782:1: ( rule__AttrDecl__Group_2_1__0 )
                    {
                     before(grammarAccess.getAttrDeclAccess().getGroup_2_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:783:1: ( rule__AttrDecl__Group_2_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:783:2: rule__AttrDecl__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__AttrDecl__Group_2_1__0_in_rule__AttrDecl__Alternatives_21625);
                    rule__AttrDecl__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttrDeclAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Alternatives_2"


    // $ANTLR start "rule__Modifier__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:792:1: rule__Modifier__Alternatives : ( ( 'const' ) | ( 'val' ) | ( 'var' ) | ( 'def' ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:796:1: ( ( 'const' ) | ( 'val' ) | ( 'var' ) | ( 'def' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt7=1;
                }
                break;
            case 11:
                {
                alt7=2;
                }
                break;
            case 12:
                {
                alt7=3;
                }
                break;
            case 13:
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:797:1: ( 'const' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:797:1: ( 'const' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:798:1: 'const'
                    {
                     before(grammarAccess.getModifierAccess().getConstKeyword_0()); 
                    match(input,10,FOLLOW_10_in_rule__Modifier__Alternatives1659); 
                     after(grammarAccess.getModifierAccess().getConstKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:805:6: ( 'val' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:805:6: ( 'val' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:806:1: 'val'
                    {
                     before(grammarAccess.getModifierAccess().getValKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__Modifier__Alternatives1679); 
                     after(grammarAccess.getModifierAccess().getValKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:813:6: ( 'var' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:813:6: ( 'var' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:814:1: 'var'
                    {
                     before(grammarAccess.getModifierAccess().getVarKeyword_2()); 
                    match(input,12,FOLLOW_12_in_rule__Modifier__Alternatives1699); 
                     after(grammarAccess.getModifierAccess().getVarKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:821:6: ( 'def' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:821:6: ( 'def' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:822:1: 'def'
                    {
                     before(grammarAccess.getModifierAccess().getDefKeyword_3()); 
                    match(input,13,FOLLOW_13_in_rule__Modifier__Alternatives1719); 
                     after(grammarAccess.getModifierAccess().getDefKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Alternatives"


    // $ANTLR start "rule__Type__Alternatives_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:834:1: rule__Type__Alternatives_0 : ( ( ( rule__Type__Group_0_0__0 ) ) | ( ( rule__Type__Group_0_1__0 ) ) );
    public final void rule__Type__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:838:1: ( ( ( rule__Type__Group_0_0__0 ) ) | ( ( rule__Type__Group_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:839:1: ( ( rule__Type__Group_0_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:839:1: ( ( rule__Type__Group_0_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:840:1: ( rule__Type__Group_0_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:841:1: ( rule__Type__Group_0_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:841:2: rule__Type__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0_0__0_in_rule__Type__Alternatives_01753);
                    rule__Type__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:845:6: ( ( rule__Type__Group_0_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:845:6: ( ( rule__Type__Group_0_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:846:1: ( rule__Type__Group_0_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:847:1: ( rule__Type__Group_0_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:847:2: rule__Type__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0_1__0_in_rule__Type__Alternatives_01771);
                    rule__Type__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives_0"


    // $ANTLR start "rule__Type__Alternatives_0_0_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:856:1: rule__Type__Alternatives_0_0_2 : ( ( ( rule__Type__Group_0_0_2_0__0 ) ) | ( ( rule__Type__Group_0_0_2_1__0 ) ) );
    public final void rule__Type__Alternatives_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:860:1: ( ( ( rule__Type__Group_0_0_2_0__0 ) ) | ( ( rule__Type__Group_0_0_2_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:861:1: ( ( rule__Type__Group_0_0_2_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:861:1: ( ( rule__Type__Group_0_0_2_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:862:1: ( rule__Type__Group_0_0_2_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0_0_2_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:863:1: ( rule__Type__Group_0_0_2_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:863:2: rule__Type__Group_0_0_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0_0_2_0__0_in_rule__Type__Alternatives_0_0_21804);
                    rule__Type__Group_0_0_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:867:6: ( ( rule__Type__Group_0_0_2_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:867:6: ( ( rule__Type__Group_0_0_2_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:868:1: ( rule__Type__Group_0_0_2_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0_0_2_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:869:1: ( rule__Type__Group_0_0_2_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:869:2: rule__Type__Group_0_0_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0_0_2_1__0_in_rule__Type__Alternatives_0_0_21822);
                    rule__Type__Group_0_0_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0_0_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives_0_0_2"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:878:1: rule__Literal__Alternatives : ( ( ruleBasicLiteral ) | ( ruleTupleLiteral ) | ( ruleListLiteral ) | ( ruleSetLiteral ) | ( ruleOptionLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:882:1: ( ( ruleBasicLiteral ) | ( ruleTupleLiteral ) | ( ruleListLiteral ) | ( ruleSetLiteral ) | ( ruleOptionLiteral ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt10=3;
                    }
                    break;
                case RULE_LIT:
                    {
                    alt10=1;
                    }
                    break;
                case 17:
                    {
                    alt10=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 31:
            case 32:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:883:1: ( ruleBasicLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:883:1: ( ruleBasicLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:884:1: ruleBasicLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBasicLiteral_in_rule__Literal__Alternatives1855);
                    ruleBasicLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:889:6: ( ruleTupleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:889:6: ( ruleTupleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:890:1: ruleTupleLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTupleLiteral_in_rule__Literal__Alternatives1872);
                    ruleTupleLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:895:6: ( ruleListLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:895:6: ( ruleListLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:896:1: ruleListLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleListLiteral_in_rule__Literal__Alternatives1889);
                    ruleListLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:901:6: ( ruleSetLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:901:6: ( ruleSetLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:902:1: ruleSetLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSetLiteral_in_rule__Literal__Alternatives1906);
                    ruleSetLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:907:6: ( ruleOptionLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:907:6: ( ruleOptionLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:908:1: ruleOptionLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getOptionLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleOptionLiteral_in_rule__Literal__Alternatives1923);
                    ruleOptionLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getOptionLiteralParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__OptionLiteral__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:918:1: rule__OptionLiteral__Alternatives : ( ( ( rule__OptionLiteral__Group_0__0 ) ) | ( ( rule__OptionLiteral__Group_1__0 ) ) );
    public final void rule__OptionLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:922:1: ( ( ( rule__OptionLiteral__Group_0__0 ) ) | ( ( rule__OptionLiteral__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==32) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:923:1: ( ( rule__OptionLiteral__Group_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:923:1: ( ( rule__OptionLiteral__Group_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:924:1: ( rule__OptionLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getOptionLiteralAccess().getGroup_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:925:1: ( rule__OptionLiteral__Group_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:925:2: rule__OptionLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__OptionLiteral__Group_0__0_in_rule__OptionLiteral__Alternatives1955);
                    rule__OptionLiteral__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:929:6: ( ( rule__OptionLiteral__Group_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:929:6: ( ( rule__OptionLiteral__Group_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:930:1: ( rule__OptionLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getOptionLiteralAccess().getGroup_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:931:1: ( rule__OptionLiteral__Group_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:931:2: rule__OptionLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__OptionLiteral__Group_1__0_in_rule__OptionLiteral__Alternatives1973);
                    rule__OptionLiteral__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Alternatives"


    // $ANTLR start "rule__SubFeaturesType__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:940:1: rule__SubFeaturesType__Alternatives : ( ( ( rule__SubFeaturesType__Group_0__0 ) ) | ( ( rule__SubFeaturesType__Group_1__0 ) ) );
    public final void rule__SubFeaturesType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:944:1: ( ( ( rule__SubFeaturesType__Group_0__0 ) ) | ( ( rule__SubFeaturesType__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==15||LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:945:1: ( ( rule__SubFeaturesType__Group_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:945:1: ( ( rule__SubFeaturesType__Group_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:946:1: ( rule__SubFeaturesType__Group_0__0 )
                    {
                     before(grammarAccess.getSubFeaturesTypeAccess().getGroup_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:947:1: ( rule__SubFeaturesType__Group_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:947:2: rule__SubFeaturesType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__0_in_rule__SubFeaturesType__Alternatives2006);
                    rule__SubFeaturesType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubFeaturesTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:951:6: ( ( rule__SubFeaturesType__Group_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:951:6: ( ( rule__SubFeaturesType__Group_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:952:1: ( rule__SubFeaturesType__Group_1__0 )
                    {
                     before(grammarAccess.getSubFeaturesTypeAccess().getGroup_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:953:1: ( rule__SubFeaturesType__Group_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:953:2: rule__SubFeaturesType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__0_in_rule__SubFeaturesType__Alternatives2024);
                    rule__SubFeaturesType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubFeaturesTypeAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Alternatives"


    // $ANTLR start "rule__TypeDecl__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:964:1: rule__TypeDecl__Group__0 : rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 ;
    public final void rule__TypeDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:968:1: ( rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:969:2: rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__02055);
            rule__TypeDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__02058);
            rule__TypeDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__0"


    // $ANTLR start "rule__TypeDecl__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:976:1: rule__TypeDecl__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:980:1: ( ( 'type' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:981:1: ( 'type' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:981:1: ( 'type' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:982:1: 'type'
            {
             before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__TypeDecl__Group__0__Impl2086); 
             after(grammarAccess.getTypeDeclAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:995:1: rule__TypeDecl__Group__1 : rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 ;
    public final void rule__TypeDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:999:1: ( rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1000:2: rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__12117);
            rule__TypeDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__12120);
            rule__TypeDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__1"


    // $ANTLR start "rule__TypeDecl__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1007:1: rule__TypeDecl__Group__1__Impl : ( ( rule__TypeDecl__NameAssignment_1 ) ) ;
    public final void rule__TypeDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1011:1: ( ( ( rule__TypeDecl__NameAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1012:1: ( ( rule__TypeDecl__NameAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1012:1: ( ( rule__TypeDecl__NameAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1013:1: ( rule__TypeDecl__NameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getNameAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1014:1: ( rule__TypeDecl__NameAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1014:2: rule__TypeDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__NameAssignment_1_in_rule__TypeDecl__Group__1__Impl2147);
            rule__TypeDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1024:1: rule__TypeDecl__Group__2 : rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 ;
    public final void rule__TypeDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1028:1: ( rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1029:2: rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__22177);
            rule__TypeDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__22180);
            rule__TypeDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__2"


    // $ANTLR start "rule__TypeDecl__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1036:1: rule__TypeDecl__Group__2__Impl : ( ( rule__TypeDecl__Group_2__0 )? ) ;
    public final void rule__TypeDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1040:1: ( ( ( rule__TypeDecl__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1041:1: ( ( rule__TypeDecl__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1041:1: ( ( rule__TypeDecl__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1042:1: ( rule__TypeDecl__Group_2__0 )?
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1043:1: ( rule__TypeDecl__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1043:2: rule__TypeDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_2__0_in_rule__TypeDecl__Group__2__Impl2207);
                    rule__TypeDecl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDeclAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__2__Impl"


    // $ANTLR start "rule__TypeDecl__Group__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1053:1: rule__TypeDecl__Group__3 : rule__TypeDecl__Group__3__Impl ;
    public final void rule__TypeDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1057:1: ( rule__TypeDecl__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1058:2: rule__TypeDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__32238);
            rule__TypeDecl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__3"


    // $ANTLR start "rule__TypeDecl__Group__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1064:1: rule__TypeDecl__Group__3__Impl : ( ( rule__TypeDecl__Group_3__0 )? ) ;
    public final void rule__TypeDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1068:1: ( ( ( rule__TypeDecl__Group_3__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1069:1: ( ( rule__TypeDecl__Group_3__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1069:1: ( ( rule__TypeDecl__Group_3__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1070:1: ( rule__TypeDecl__Group_3__0 )?
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1071:1: ( rule__TypeDecl__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1071:2: rule__TypeDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_3__0_in_rule__TypeDecl__Group__3__Impl2265);
                    rule__TypeDecl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDeclAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__3__Impl"


    // $ANTLR start "rule__TypeDecl__Group_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1089:1: rule__TypeDecl__Group_2__0 : rule__TypeDecl__Group_2__0__Impl rule__TypeDecl__Group_2__1 ;
    public final void rule__TypeDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1093:1: ( rule__TypeDecl__Group_2__0__Impl rule__TypeDecl__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1094:2: rule__TypeDecl__Group_2__0__Impl rule__TypeDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_2__0__Impl_in_rule__TypeDecl__Group_2__02304);
            rule__TypeDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_2__1_in_rule__TypeDecl__Group_2__02307);
            rule__TypeDecl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_2__0"


    // $ANTLR start "rule__TypeDecl__Group_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1101:1: rule__TypeDecl__Group_2__0__Impl : ( 'include' ) ;
    public final void rule__TypeDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1105:1: ( ( 'include' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1106:1: ( 'include' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1106:1: ( 'include' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1107:1: 'include'
            {
             before(grammarAccess.getTypeDeclAccess().getIncludeKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__TypeDecl__Group_2__0__Impl2335); 
             after(grammarAccess.getTypeDeclAccess().getIncludeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_2__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1120:1: rule__TypeDecl__Group_2__1 : rule__TypeDecl__Group_2__1__Impl rule__TypeDecl__Group_2__2 ;
    public final void rule__TypeDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1124:1: ( rule__TypeDecl__Group_2__1__Impl rule__TypeDecl__Group_2__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1125:2: rule__TypeDecl__Group_2__1__Impl rule__TypeDecl__Group_2__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_2__1__Impl_in_rule__TypeDecl__Group_2__12366);
            rule__TypeDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_2__2_in_rule__TypeDecl__Group_2__12369);
            rule__TypeDecl__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_2__1"


    // $ANTLR start "rule__TypeDecl__Group_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1132:1: rule__TypeDecl__Group_2__1__Impl : ( ( rule__TypeDecl__SupersAssignment_2_1 ) ) ;
    public final void rule__TypeDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1136:1: ( ( ( rule__TypeDecl__SupersAssignment_2_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1137:1: ( ( rule__TypeDecl__SupersAssignment_2_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1137:1: ( ( rule__TypeDecl__SupersAssignment_2_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1138:1: ( rule__TypeDecl__SupersAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getSupersAssignment_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1139:1: ( rule__TypeDecl__SupersAssignment_2_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1139:2: rule__TypeDecl__SupersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__SupersAssignment_2_1_in_rule__TypeDecl__Group_2__1__Impl2396);
            rule__TypeDecl__SupersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getSupersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_2__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group_2__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1149:1: rule__TypeDecl__Group_2__2 : rule__TypeDecl__Group_2__2__Impl ;
    public final void rule__TypeDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1153:1: ( rule__TypeDecl__Group_2__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1154:2: rule__TypeDecl__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_2__2__Impl_in_rule__TypeDecl__Group_2__22426);
            rule__TypeDecl__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_2__2"


    // $ANTLR start "rule__TypeDecl__Group_2__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1160:1: rule__TypeDecl__Group_2__2__Impl : ( ( rule__TypeDecl__Group_2_2__0 )* ) ;
    public final void rule__TypeDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1164:1: ( ( ( rule__TypeDecl__Group_2_2__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1165:1: ( ( rule__TypeDecl__Group_2_2__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1165:1: ( ( rule__TypeDecl__Group_2_2__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1166:1: ( rule__TypeDecl__Group_2_2__0 )*
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_2_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1167:1: ( rule__TypeDecl__Group_2_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1167:2: rule__TypeDecl__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TypeDecl__Group_2_2__0_in_rule__TypeDecl__Group_2__2__Impl2453);
            	    rule__TypeDecl__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTypeDeclAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_2__2__Impl"


    // $ANTLR start "rule__TypeDecl__Group_2_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1183:1: rule__TypeDecl__Group_2_2__0 : rule__TypeDecl__Group_2_2__0__Impl rule__TypeDecl__Group_2_2__1 ;
    public final void rule__TypeDecl__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1187:1: ( rule__TypeDecl__Group_2_2__0__Impl rule__TypeDecl__Group_2_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1188:2: rule__TypeDecl__Group_2_2__0__Impl rule__TypeDecl__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_2_2__0__Impl_in_rule__TypeDecl__Group_2_2__02490);
            rule__TypeDecl__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_2_2__1_in_rule__TypeDecl__Group_2_2__02493);
            rule__TypeDecl__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_2_2__0"


    // $ANTLR start "rule__TypeDecl__Group_2_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1195:1: rule__TypeDecl__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDecl__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1199:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1200:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1200:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1201:1: ','
            {
             before(grammarAccess.getTypeDeclAccess().getCommaKeyword_2_2_0()); 
            match(input,16,FOLLOW_16_in_rule__TypeDecl__Group_2_2__0__Impl2521); 
             after(grammarAccess.getTypeDeclAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_2_2__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group_2_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1214:1: rule__TypeDecl__Group_2_2__1 : rule__TypeDecl__Group_2_2__1__Impl ;
    public final void rule__TypeDecl__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1218:1: ( rule__TypeDecl__Group_2_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1219:2: rule__TypeDecl__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_2_2__1__Impl_in_rule__TypeDecl__Group_2_2__12552);
            rule__TypeDecl__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_2_2__1"


    // $ANTLR start "rule__TypeDecl__Group_2_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1225:1: rule__TypeDecl__Group_2_2__1__Impl : ( ( rule__TypeDecl__SupersAssignment_2_2_1 ) ) ;
    public final void rule__TypeDecl__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1229:1: ( ( ( rule__TypeDecl__SupersAssignment_2_2_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1230:1: ( ( rule__TypeDecl__SupersAssignment_2_2_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1230:1: ( ( rule__TypeDecl__SupersAssignment_2_2_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1231:1: ( rule__TypeDecl__SupersAssignment_2_2_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getSupersAssignment_2_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1232:1: ( rule__TypeDecl__SupersAssignment_2_2_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1232:2: rule__TypeDecl__SupersAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__SupersAssignment_2_2_1_in_rule__TypeDecl__Group_2_2__1__Impl2579);
            rule__TypeDecl__SupersAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getSupersAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_2_2__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group_3__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1246:1: rule__TypeDecl__Group_3__0 : rule__TypeDecl__Group_3__0__Impl rule__TypeDecl__Group_3__1 ;
    public final void rule__TypeDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1250:1: ( rule__TypeDecl__Group_3__0__Impl rule__TypeDecl__Group_3__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1251:2: rule__TypeDecl__Group_3__0__Impl rule__TypeDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3__0__Impl_in_rule__TypeDecl__Group_3__02613);
            rule__TypeDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_3__1_in_rule__TypeDecl__Group_3__02616);
            rule__TypeDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3__0"


    // $ANTLR start "rule__TypeDecl__Group_3__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1258:1: rule__TypeDecl__Group_3__0__Impl : ( '{' ) ;
    public final void rule__TypeDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1262:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1263:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1263:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1264:1: '{'
            {
             before(grammarAccess.getTypeDeclAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__TypeDecl__Group_3__0__Impl2644); 
             after(grammarAccess.getTypeDeclAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group_3__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1277:1: rule__TypeDecl__Group_3__1 : rule__TypeDecl__Group_3__1__Impl rule__TypeDecl__Group_3__2 ;
    public final void rule__TypeDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1281:1: ( rule__TypeDecl__Group_3__1__Impl rule__TypeDecl__Group_3__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1282:2: rule__TypeDecl__Group_3__1__Impl rule__TypeDecl__Group_3__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3__1__Impl_in_rule__TypeDecl__Group_3__12675);
            rule__TypeDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_3__2_in_rule__TypeDecl__Group_3__12678);
            rule__TypeDecl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3__1"


    // $ANTLR start "rule__TypeDecl__Group_3__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1289:1: rule__TypeDecl__Group_3__1__Impl : ( ( rule__TypeDecl__Group_3_1__0 )? ) ;
    public final void rule__TypeDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1293:1: ( ( ( rule__TypeDecl__Group_3_1__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1294:1: ( ( rule__TypeDecl__Group_3_1__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1294:1: ( ( rule__TypeDecl__Group_3_1__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1295:1: ( rule__TypeDecl__Group_3_1__0 )?
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_3_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1296:1: ( rule__TypeDecl__Group_3_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_LIT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1296:2: rule__TypeDecl__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_3_1__0_in_rule__TypeDecl__Group_3__1__Impl2705);
                    rule__TypeDecl__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDeclAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group_3__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1306:1: rule__TypeDecl__Group_3__2 : rule__TypeDecl__Group_3__2__Impl ;
    public final void rule__TypeDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1310:1: ( rule__TypeDecl__Group_3__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1311:2: rule__TypeDecl__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3__2__Impl_in_rule__TypeDecl__Group_3__22736);
            rule__TypeDecl__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3__2"


    // $ANTLR start "rule__TypeDecl__Group_3__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1317:1: rule__TypeDecl__Group_3__2__Impl : ( '}' ) ;
    public final void rule__TypeDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1321:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1322:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1322:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1323:1: '}'
            {
             before(grammarAccess.getTypeDeclAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,18,FOLLOW_18_in_rule__TypeDecl__Group_3__2__Impl2764); 
             after(grammarAccess.getTypeDeclAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3__2__Impl"


    // $ANTLR start "rule__TypeDecl__Group_3_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1342:1: rule__TypeDecl__Group_3_1__0 : rule__TypeDecl__Group_3_1__0__Impl rule__TypeDecl__Group_3_1__1 ;
    public final void rule__TypeDecl__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1346:1: ( rule__TypeDecl__Group_3_1__0__Impl rule__TypeDecl__Group_3_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1347:2: rule__TypeDecl__Group_3_1__0__Impl rule__TypeDecl__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1__0__Impl_in_rule__TypeDecl__Group_3_1__02801);
            rule__TypeDecl__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1__1_in_rule__TypeDecl__Group_3_1__02804);
            rule__TypeDecl__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3_1__0"


    // $ANTLR start "rule__TypeDecl__Group_3_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1354:1: rule__TypeDecl__Group_3_1__0__Impl : ( ( rule__TypeDecl__ElemsAssignment_3_1_0 ) ) ;
    public final void rule__TypeDecl__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1358:1: ( ( ( rule__TypeDecl__ElemsAssignment_3_1_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1359:1: ( ( rule__TypeDecl__ElemsAssignment_3_1_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1359:1: ( ( rule__TypeDecl__ElemsAssignment_3_1_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1360:1: ( rule__TypeDecl__ElemsAssignment_3_1_0 )
            {
             before(grammarAccess.getTypeDeclAccess().getElemsAssignment_3_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1361:1: ( rule__TypeDecl__ElemsAssignment_3_1_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1361:2: rule__TypeDecl__ElemsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__TypeDecl__ElemsAssignment_3_1_0_in_rule__TypeDecl__Group_3_1__0__Impl2831);
            rule__TypeDecl__ElemsAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getElemsAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3_1__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group_3_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1371:1: rule__TypeDecl__Group_3_1__1 : rule__TypeDecl__Group_3_1__1__Impl ;
    public final void rule__TypeDecl__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1375:1: ( rule__TypeDecl__Group_3_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1376:2: rule__TypeDecl__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1__1__Impl_in_rule__TypeDecl__Group_3_1__12861);
            rule__TypeDecl__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3_1__1"


    // $ANTLR start "rule__TypeDecl__Group_3_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1382:1: rule__TypeDecl__Group_3_1__1__Impl : ( ( rule__TypeDecl__Group_3_1_1__0 )* ) ;
    public final void rule__TypeDecl__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1386:1: ( ( ( rule__TypeDecl__Group_3_1_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1387:1: ( ( rule__TypeDecl__Group_3_1_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1387:1: ( ( rule__TypeDecl__Group_3_1_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1388:1: ( rule__TypeDecl__Group_3_1_1__0 )*
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_3_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1389:1: ( rule__TypeDecl__Group_3_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1389:2: rule__TypeDecl__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TypeDecl__Group_3_1_1__0_in_rule__TypeDecl__Group_3_1__1__Impl2888);
            	    rule__TypeDecl__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTypeDeclAccess().getGroup_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3_1__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group_3_1_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1403:1: rule__TypeDecl__Group_3_1_1__0 : rule__TypeDecl__Group_3_1_1__0__Impl rule__TypeDecl__Group_3_1_1__1 ;
    public final void rule__TypeDecl__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1407:1: ( rule__TypeDecl__Group_3_1_1__0__Impl rule__TypeDecl__Group_3_1_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1408:2: rule__TypeDecl__Group_3_1_1__0__Impl rule__TypeDecl__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1_1__0__Impl_in_rule__TypeDecl__Group_3_1_1__02923);
            rule__TypeDecl__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1_1__1_in_rule__TypeDecl__Group_3_1_1__02926);
            rule__TypeDecl__Group_3_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3_1_1__0"


    // $ANTLR start "rule__TypeDecl__Group_3_1_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1415:1: rule__TypeDecl__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__TypeDecl__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1419:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1420:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1420:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1421:1: ','
            {
             before(grammarAccess.getTypeDeclAccess().getCommaKeyword_3_1_1_0()); 
            match(input,16,FOLLOW_16_in_rule__TypeDecl__Group_3_1_1__0__Impl2954); 
             after(grammarAccess.getTypeDeclAccess().getCommaKeyword_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group_3_1_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1434:1: rule__TypeDecl__Group_3_1_1__1 : rule__TypeDecl__Group_3_1_1__1__Impl ;
    public final void rule__TypeDecl__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1438:1: ( rule__TypeDecl__Group_3_1_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1439:2: rule__TypeDecl__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1_1__1__Impl_in_rule__TypeDecl__Group_3_1_1__12985);
            rule__TypeDecl__Group_3_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3_1_1__1"


    // $ANTLR start "rule__TypeDecl__Group_3_1_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1445:1: rule__TypeDecl__Group_3_1_1__1__Impl : ( ( rule__TypeDecl__ElemsAssignment_3_1_1_1 ) ) ;
    public final void rule__TypeDecl__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1449:1: ( ( ( rule__TypeDecl__ElemsAssignment_3_1_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1450:1: ( ( rule__TypeDecl__ElemsAssignment_3_1_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1450:1: ( ( rule__TypeDecl__ElemsAssignment_3_1_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1451:1: ( rule__TypeDecl__ElemsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getElemsAssignment_3_1_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1452:1: ( rule__TypeDecl__ElemsAssignment_3_1_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1452:2: rule__TypeDecl__ElemsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__ElemsAssignment_3_1_1_1_in_rule__TypeDecl__Group_3_1_1__1__Impl3012);
            rule__TypeDecl__ElemsAssignment_3_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getElemsAssignment_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__FeaturesDecl__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1466:1: rule__FeaturesDecl__Group__0 : rule__FeaturesDecl__Group__0__Impl rule__FeaturesDecl__Group__1 ;
    public final void rule__FeaturesDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1470:1: ( rule__FeaturesDecl__Group__0__Impl rule__FeaturesDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1471:2: rule__FeaturesDecl__Group__0__Impl rule__FeaturesDecl__Group__1
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__0__Impl_in_rule__FeaturesDecl__Group__03046);
            rule__FeaturesDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group__1_in_rule__FeaturesDecl__Group__03049);
            rule__FeaturesDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group__0"


    // $ANTLR start "rule__FeaturesDecl__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1478:1: rule__FeaturesDecl__Group__0__Impl : ( ( rule__FeaturesDecl__CompleteAssignment_0 )? ) ;
    public final void rule__FeaturesDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1482:1: ( ( ( rule__FeaturesDecl__CompleteAssignment_0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1483:1: ( ( rule__FeaturesDecl__CompleteAssignment_0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1483:1: ( ( rule__FeaturesDecl__CompleteAssignment_0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1484:1: ( rule__FeaturesDecl__CompleteAssignment_0 )?
            {
             before(grammarAccess.getFeaturesDeclAccess().getCompleteAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1485:1: ( rule__FeaturesDecl__CompleteAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1485:2: rule__FeaturesDecl__CompleteAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FeaturesDecl__CompleteAssignment_0_in_rule__FeaturesDecl__Group__0__Impl3076);
                    rule__FeaturesDecl__CompleteAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeaturesDeclAccess().getCompleteAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group__0__Impl"


    // $ANTLR start "rule__FeaturesDecl__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1495:1: rule__FeaturesDecl__Group__1 : rule__FeaturesDecl__Group__1__Impl rule__FeaturesDecl__Group__2 ;
    public final void rule__FeaturesDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1499:1: ( rule__FeaturesDecl__Group__1__Impl rule__FeaturesDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1500:2: rule__FeaturesDecl__Group__1__Impl rule__FeaturesDecl__Group__2
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__1__Impl_in_rule__FeaturesDecl__Group__13107);
            rule__FeaturesDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group__2_in_rule__FeaturesDecl__Group__13110);
            rule__FeaturesDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group__1"


    // $ANTLR start "rule__FeaturesDecl__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1507:1: rule__FeaturesDecl__Group__1__Impl : ( 'features' ) ;
    public final void rule__FeaturesDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1511:1: ( ( 'features' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1512:1: ( 'features' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1512:1: ( 'features' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1513:1: 'features'
            {
             before(grammarAccess.getFeaturesDeclAccess().getFeaturesKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__FeaturesDecl__Group__1__Impl3138); 
             after(grammarAccess.getFeaturesDeclAccess().getFeaturesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group__1__Impl"


    // $ANTLR start "rule__FeaturesDecl__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1526:1: rule__FeaturesDecl__Group__2 : rule__FeaturesDecl__Group__2__Impl rule__FeaturesDecl__Group__3 ;
    public final void rule__FeaturesDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1530:1: ( rule__FeaturesDecl__Group__2__Impl rule__FeaturesDecl__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1531:2: rule__FeaturesDecl__Group__2__Impl rule__FeaturesDecl__Group__3
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__2__Impl_in_rule__FeaturesDecl__Group__23169);
            rule__FeaturesDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group__3_in_rule__FeaturesDecl__Group__23172);
            rule__FeaturesDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group__2"


    // $ANTLR start "rule__FeaturesDecl__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1538:1: rule__FeaturesDecl__Group__2__Impl : ( ( rule__FeaturesDecl__NameAssignment_2 ) ) ;
    public final void rule__FeaturesDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1542:1: ( ( ( rule__FeaturesDecl__NameAssignment_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1543:1: ( ( rule__FeaturesDecl__NameAssignment_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1543:1: ( ( rule__FeaturesDecl__NameAssignment_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1544:1: ( rule__FeaturesDecl__NameAssignment_2 )
            {
             before(grammarAccess.getFeaturesDeclAccess().getNameAssignment_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1545:1: ( rule__FeaturesDecl__NameAssignment_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1545:2: rule__FeaturesDecl__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__NameAssignment_2_in_rule__FeaturesDecl__Group__2__Impl3199);
            rule__FeaturesDecl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeaturesDeclAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group__2__Impl"


    // $ANTLR start "rule__FeaturesDecl__Group__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1555:1: rule__FeaturesDecl__Group__3 : rule__FeaturesDecl__Group__3__Impl rule__FeaturesDecl__Group__4 ;
    public final void rule__FeaturesDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1559:1: ( rule__FeaturesDecl__Group__3__Impl rule__FeaturesDecl__Group__4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1560:2: rule__FeaturesDecl__Group__3__Impl rule__FeaturesDecl__Group__4
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__3__Impl_in_rule__FeaturesDecl__Group__33229);
            rule__FeaturesDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group__4_in_rule__FeaturesDecl__Group__33232);
            rule__FeaturesDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group__3"


    // $ANTLR start "rule__FeaturesDecl__Group__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1567:1: rule__FeaturesDecl__Group__3__Impl : ( ( rule__FeaturesDecl__Group_3__0 )? ) ;
    public final void rule__FeaturesDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1571:1: ( ( ( rule__FeaturesDecl__Group_3__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1572:1: ( ( rule__FeaturesDecl__Group_3__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1572:1: ( ( rule__FeaturesDecl__Group_3__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1573:1: ( rule__FeaturesDecl__Group_3__0 )?
            {
             before(grammarAccess.getFeaturesDeclAccess().getGroup_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1574:1: ( rule__FeaturesDecl__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1574:2: rule__FeaturesDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__0_in_rule__FeaturesDecl__Group__3__Impl3259);
                    rule__FeaturesDecl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeaturesDeclAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group__3__Impl"


    // $ANTLR start "rule__FeaturesDecl__Group__4"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1584:1: rule__FeaturesDecl__Group__4 : rule__FeaturesDecl__Group__4__Impl ;
    public final void rule__FeaturesDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1588:1: ( rule__FeaturesDecl__Group__4__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1589:2: rule__FeaturesDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__4__Impl_in_rule__FeaturesDecl__Group__43290);
            rule__FeaturesDecl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group__4"


    // $ANTLR start "rule__FeaturesDecl__Group__4__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1595:1: rule__FeaturesDecl__Group__4__Impl : ( ( rule__FeaturesDecl__BodyAssignment_4 ) ) ;
    public final void rule__FeaturesDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1599:1: ( ( ( rule__FeaturesDecl__BodyAssignment_4 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1600:1: ( ( rule__FeaturesDecl__BodyAssignment_4 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1600:1: ( ( rule__FeaturesDecl__BodyAssignment_4 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1601:1: ( rule__FeaturesDecl__BodyAssignment_4 )
            {
             before(grammarAccess.getFeaturesDeclAccess().getBodyAssignment_4()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1602:1: ( rule__FeaturesDecl__BodyAssignment_4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1602:2: rule__FeaturesDecl__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__BodyAssignment_4_in_rule__FeaturesDecl__Group__4__Impl3317);
            rule__FeaturesDecl__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeaturesDeclAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group__4__Impl"


    // $ANTLR start "rule__FeaturesDecl__Group_3__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1622:1: rule__FeaturesDecl__Group_3__0 : rule__FeaturesDecl__Group_3__0__Impl rule__FeaturesDecl__Group_3__1 ;
    public final void rule__FeaturesDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1626:1: ( rule__FeaturesDecl__Group_3__0__Impl rule__FeaturesDecl__Group_3__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1627:2: rule__FeaturesDecl__Group_3__0__Impl rule__FeaturesDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__0__Impl_in_rule__FeaturesDecl__Group_3__03357);
            rule__FeaturesDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__1_in_rule__FeaturesDecl__Group_3__03360);
            rule__FeaturesDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group_3__0"


    // $ANTLR start "rule__FeaturesDecl__Group_3__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1634:1: rule__FeaturesDecl__Group_3__0__Impl : ( 'include' ) ;
    public final void rule__FeaturesDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1638:1: ( ( 'include' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1639:1: ( 'include' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1639:1: ( 'include' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1640:1: 'include'
            {
             before(grammarAccess.getFeaturesDeclAccess().getIncludeKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__FeaturesDecl__Group_3__0__Impl3388); 
             after(grammarAccess.getFeaturesDeclAccess().getIncludeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group_3__0__Impl"


    // $ANTLR start "rule__FeaturesDecl__Group_3__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1653:1: rule__FeaturesDecl__Group_3__1 : rule__FeaturesDecl__Group_3__1__Impl rule__FeaturesDecl__Group_3__2 ;
    public final void rule__FeaturesDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1657:1: ( rule__FeaturesDecl__Group_3__1__Impl rule__FeaturesDecl__Group_3__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1658:2: rule__FeaturesDecl__Group_3__1__Impl rule__FeaturesDecl__Group_3__2
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__1__Impl_in_rule__FeaturesDecl__Group_3__13419);
            rule__FeaturesDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__2_in_rule__FeaturesDecl__Group_3__13422);
            rule__FeaturesDecl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group_3__1"


    // $ANTLR start "rule__FeaturesDecl__Group_3__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1665:1: rule__FeaturesDecl__Group_3__1__Impl : ( ( rule__FeaturesDecl__SupersAssignment_3_1 ) ) ;
    public final void rule__FeaturesDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1669:1: ( ( ( rule__FeaturesDecl__SupersAssignment_3_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1670:1: ( ( rule__FeaturesDecl__SupersAssignment_3_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1670:1: ( ( rule__FeaturesDecl__SupersAssignment_3_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1671:1: ( rule__FeaturesDecl__SupersAssignment_3_1 )
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersAssignment_3_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1672:1: ( rule__FeaturesDecl__SupersAssignment_3_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1672:2: rule__FeaturesDecl__SupersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__SupersAssignment_3_1_in_rule__FeaturesDecl__Group_3__1__Impl3449);
            rule__FeaturesDecl__SupersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeaturesDeclAccess().getSupersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group_3__1__Impl"


    // $ANTLR start "rule__FeaturesDecl__Group_3__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1682:1: rule__FeaturesDecl__Group_3__2 : rule__FeaturesDecl__Group_3__2__Impl ;
    public final void rule__FeaturesDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1686:1: ( rule__FeaturesDecl__Group_3__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1687:2: rule__FeaturesDecl__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__2__Impl_in_rule__FeaturesDecl__Group_3__23479);
            rule__FeaturesDecl__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group_3__2"


    // $ANTLR start "rule__FeaturesDecl__Group_3__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1693:1: rule__FeaturesDecl__Group_3__2__Impl : ( ( rule__FeaturesDecl__Group_3_2__0 )* ) ;
    public final void rule__FeaturesDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1697:1: ( ( ( rule__FeaturesDecl__Group_3_2__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1698:1: ( ( rule__FeaturesDecl__Group_3_2__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1698:1: ( ( rule__FeaturesDecl__Group_3_2__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1699:1: ( rule__FeaturesDecl__Group_3_2__0 )*
            {
             before(grammarAccess.getFeaturesDeclAccess().getGroup_3_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1700:1: ( rule__FeaturesDecl__Group_3_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1700:2: rule__FeaturesDecl__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FeaturesDecl__Group_3_2__0_in_rule__FeaturesDecl__Group_3__2__Impl3506);
            	    rule__FeaturesDecl__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFeaturesDeclAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group_3__2__Impl"


    // $ANTLR start "rule__FeaturesDecl__Group_3_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1716:1: rule__FeaturesDecl__Group_3_2__0 : rule__FeaturesDecl__Group_3_2__0__Impl rule__FeaturesDecl__Group_3_2__1 ;
    public final void rule__FeaturesDecl__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1720:1: ( rule__FeaturesDecl__Group_3_2__0__Impl rule__FeaturesDecl__Group_3_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1721:2: rule__FeaturesDecl__Group_3_2__0__Impl rule__FeaturesDecl__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3_2__0__Impl_in_rule__FeaturesDecl__Group_3_2__03543);
            rule__FeaturesDecl__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3_2__1_in_rule__FeaturesDecl__Group_3_2__03546);
            rule__FeaturesDecl__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group_3_2__0"


    // $ANTLR start "rule__FeaturesDecl__Group_3_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1728:1: rule__FeaturesDecl__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FeaturesDecl__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1732:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1733:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1733:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1734:1: ','
            {
             before(grammarAccess.getFeaturesDeclAccess().getCommaKeyword_3_2_0()); 
            match(input,16,FOLLOW_16_in_rule__FeaturesDecl__Group_3_2__0__Impl3574); 
             after(grammarAccess.getFeaturesDeclAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group_3_2__0__Impl"


    // $ANTLR start "rule__FeaturesDecl__Group_3_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1747:1: rule__FeaturesDecl__Group_3_2__1 : rule__FeaturesDecl__Group_3_2__1__Impl ;
    public final void rule__FeaturesDecl__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1751:1: ( rule__FeaturesDecl__Group_3_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1752:2: rule__FeaturesDecl__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3_2__1__Impl_in_rule__FeaturesDecl__Group_3_2__13605);
            rule__FeaturesDecl__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group_3_2__1"


    // $ANTLR start "rule__FeaturesDecl__Group_3_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1758:1: rule__FeaturesDecl__Group_3_2__1__Impl : ( ( rule__FeaturesDecl__SupersAssignment_3_2_1 ) ) ;
    public final void rule__FeaturesDecl__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1762:1: ( ( ( rule__FeaturesDecl__SupersAssignment_3_2_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1763:1: ( ( rule__FeaturesDecl__SupersAssignment_3_2_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1763:1: ( ( rule__FeaturesDecl__SupersAssignment_3_2_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1764:1: ( rule__FeaturesDecl__SupersAssignment_3_2_1 )
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersAssignment_3_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1765:1: ( rule__FeaturesDecl__SupersAssignment_3_2_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1765:2: rule__FeaturesDecl__SupersAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__SupersAssignment_3_2_1_in_rule__FeaturesDecl__Group_3_2__1__Impl3632);
            rule__FeaturesDecl__SupersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeaturesDeclAccess().getSupersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__Group_3_2__1__Impl"


    // $ANTLR start "rule__FeaturesBody__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1779:1: rule__FeaturesBody__Group__0 : rule__FeaturesBody__Group__0__Impl rule__FeaturesBody__Group__1 ;
    public final void rule__FeaturesBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1783:1: ( rule__FeaturesBody__Group__0__Impl rule__FeaturesBody__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1784:2: rule__FeaturesBody__Group__0__Impl rule__FeaturesBody__Group__1
            {
            pushFollow(FOLLOW_rule__FeaturesBody__Group__0__Impl_in_rule__FeaturesBody__Group__03666);
            rule__FeaturesBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesBody__Group__1_in_rule__FeaturesBody__Group__03669);
            rule__FeaturesBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group__0"


    // $ANTLR start "rule__FeaturesBody__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1791:1: rule__FeaturesBody__Group__0__Impl : ( () ) ;
    public final void rule__FeaturesBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1795:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1796:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1796:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1797:1: ()
            {
             before(grammarAccess.getFeaturesBodyAccess().getFeaturesBodyAction_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1798:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1800:1: 
            {
            }

             after(grammarAccess.getFeaturesBodyAccess().getFeaturesBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group__0__Impl"


    // $ANTLR start "rule__FeaturesBody__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1810:1: rule__FeaturesBody__Group__1 : rule__FeaturesBody__Group__1__Impl ;
    public final void rule__FeaturesBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1814:1: ( rule__FeaturesBody__Group__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1815:2: rule__FeaturesBody__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FeaturesBody__Group__1__Impl_in_rule__FeaturesBody__Group__13727);
            rule__FeaturesBody__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group__1"


    // $ANTLR start "rule__FeaturesBody__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1821:1: rule__FeaturesBody__Group__1__Impl : ( ( rule__FeaturesBody__Group_1__0 )? ) ;
    public final void rule__FeaturesBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1825:1: ( ( ( rule__FeaturesBody__Group_1__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1826:1: ( ( rule__FeaturesBody__Group_1__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1826:1: ( ( rule__FeaturesBody__Group_1__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1827:1: ( rule__FeaturesBody__Group_1__0 )?
            {
             before(grammarAccess.getFeaturesBodyAccess().getGroup_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1828:1: ( rule__FeaturesBody__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1828:2: rule__FeaturesBody__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FeaturesBody__Group_1__0_in_rule__FeaturesBody__Group__1__Impl3754);
                    rule__FeaturesBody__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeaturesBodyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group__1__Impl"


    // $ANTLR start "rule__FeaturesBody__Group_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1842:1: rule__FeaturesBody__Group_1__0 : rule__FeaturesBody__Group_1__0__Impl rule__FeaturesBody__Group_1__1 ;
    public final void rule__FeaturesBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1846:1: ( rule__FeaturesBody__Group_1__0__Impl rule__FeaturesBody__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1847:2: rule__FeaturesBody__Group_1__0__Impl rule__FeaturesBody__Group_1__1
            {
            pushFollow(FOLLOW_rule__FeaturesBody__Group_1__0__Impl_in_rule__FeaturesBody__Group_1__03789);
            rule__FeaturesBody__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesBody__Group_1__1_in_rule__FeaturesBody__Group_1__03792);
            rule__FeaturesBody__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group_1__0"


    // $ANTLR start "rule__FeaturesBody__Group_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1854:1: rule__FeaturesBody__Group_1__0__Impl : ( '{' ) ;
    public final void rule__FeaturesBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1858:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1859:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1859:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1860:1: '{'
            {
             before(grammarAccess.getFeaturesBodyAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__FeaturesBody__Group_1__0__Impl3820); 
             after(grammarAccess.getFeaturesBodyAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group_1__0__Impl"


    // $ANTLR start "rule__FeaturesBody__Group_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1873:1: rule__FeaturesBody__Group_1__1 : rule__FeaturesBody__Group_1__1__Impl rule__FeaturesBody__Group_1__2 ;
    public final void rule__FeaturesBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1877:1: ( rule__FeaturesBody__Group_1__1__Impl rule__FeaturesBody__Group_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1878:2: rule__FeaturesBody__Group_1__1__Impl rule__FeaturesBody__Group_1__2
            {
            pushFollow(FOLLOW_rule__FeaturesBody__Group_1__1__Impl_in_rule__FeaturesBody__Group_1__13851);
            rule__FeaturesBody__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesBody__Group_1__2_in_rule__FeaturesBody__Group_1__13854);
            rule__FeaturesBody__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group_1__1"


    // $ANTLR start "rule__FeaturesBody__Group_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1885:1: rule__FeaturesBody__Group_1__1__Impl : ( ( rule__FeaturesBody__FeaturesAssignment_1_1 )* ) ;
    public final void rule__FeaturesBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1889:1: ( ( ( rule__FeaturesBody__FeaturesAssignment_1_1 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1890:1: ( ( rule__FeaturesBody__FeaturesAssignment_1_1 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1890:1: ( ( rule__FeaturesBody__FeaturesAssignment_1_1 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1891:1: ( rule__FeaturesBody__FeaturesAssignment_1_1 )*
            {
             before(grammarAccess.getFeaturesBodyAccess().getFeaturesAssignment_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1892:1: ( rule__FeaturesBody__FeaturesAssignment_1_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=10 && LA22_0<=13)||LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1892:2: rule__FeaturesBody__FeaturesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__FeaturesBody__FeaturesAssignment_1_1_in_rule__FeaturesBody__Group_1__1__Impl3881);
            	    rule__FeaturesBody__FeaturesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getFeaturesBodyAccess().getFeaturesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group_1__1__Impl"


    // $ANTLR start "rule__FeaturesBody__Group_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1902:1: rule__FeaturesBody__Group_1__2 : rule__FeaturesBody__Group_1__2__Impl ;
    public final void rule__FeaturesBody__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1906:1: ( rule__FeaturesBody__Group_1__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1907:2: rule__FeaturesBody__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FeaturesBody__Group_1__2__Impl_in_rule__FeaturesBody__Group_1__23912);
            rule__FeaturesBody__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group_1__2"


    // $ANTLR start "rule__FeaturesBody__Group_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1913:1: rule__FeaturesBody__Group_1__2__Impl : ( '}' ) ;
    public final void rule__FeaturesBody__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1917:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1918:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1918:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1919:1: '}'
            {
             before(grammarAccess.getFeaturesBodyAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,18,FOLLOW_18_in_rule__FeaturesBody__Group_1__2__Impl3940); 
             after(grammarAccess.getFeaturesBodyAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1938:1: rule__MultiplicityInvariantDecl__Group__0 : rule__MultiplicityInvariantDecl__Group__0__Impl rule__MultiplicityInvariantDecl__Group__1 ;
    public final void rule__MultiplicityInvariantDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1942:1: ( rule__MultiplicityInvariantDecl__Group__0__Impl rule__MultiplicityInvariantDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1943:2: rule__MultiplicityInvariantDecl__Group__0__Impl rule__MultiplicityInvariantDecl__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__0__Impl_in_rule__MultiplicityInvariantDecl__Group__03977);
            rule__MultiplicityInvariantDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__1_in_rule__MultiplicityInvariantDecl__Group__03980);
            rule__MultiplicityInvariantDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group__0"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1950:1: rule__MultiplicityInvariantDecl__Group__0__Impl : ( 'inv' ) ;
    public final void rule__MultiplicityInvariantDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1954:1: ( ( 'inv' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1955:1: ( 'inv' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1955:1: ( 'inv' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1956:1: 'inv'
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getInvKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__MultiplicityInvariantDecl__Group__0__Impl4008); 
             after(grammarAccess.getMultiplicityInvariantDeclAccess().getInvKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group__0__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1969:1: rule__MultiplicityInvariantDecl__Group__1 : rule__MultiplicityInvariantDecl__Group__1__Impl rule__MultiplicityInvariantDecl__Group__2 ;
    public final void rule__MultiplicityInvariantDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1973:1: ( rule__MultiplicityInvariantDecl__Group__1__Impl rule__MultiplicityInvariantDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1974:2: rule__MultiplicityInvariantDecl__Group__1__Impl rule__MultiplicityInvariantDecl__Group__2
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__1__Impl_in_rule__MultiplicityInvariantDecl__Group__14039);
            rule__MultiplicityInvariantDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__2_in_rule__MultiplicityInvariantDecl__Group__14042);
            rule__MultiplicityInvariantDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group__1"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1981:1: rule__MultiplicityInvariantDecl__Group__1__Impl : ( ( rule__MultiplicityInvariantDecl__Group_1__0 )? ) ;
    public final void rule__MultiplicityInvariantDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1985:1: ( ( ( rule__MultiplicityInvariantDecl__Group_1__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1986:1: ( ( rule__MultiplicityInvariantDecl__Group_1__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1986:1: ( ( rule__MultiplicityInvariantDecl__Group_1__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1987:1: ( rule__MultiplicityInvariantDecl__Group_1__0 )?
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1988:1: ( rule__MultiplicityInvariantDecl__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1988:2: rule__MultiplicityInvariantDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_1__0_in_rule__MultiplicityInvariantDecl__Group__1__Impl4069);
                    rule__MultiplicityInvariantDecl__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group__1__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1998:1: rule__MultiplicityInvariantDecl__Group__2 : rule__MultiplicityInvariantDecl__Group__2__Impl rule__MultiplicityInvariantDecl__Group__3 ;
    public final void rule__MultiplicityInvariantDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2002:1: ( rule__MultiplicityInvariantDecl__Group__2__Impl rule__MultiplicityInvariantDecl__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2003:2: rule__MultiplicityInvariantDecl__Group__2__Impl rule__MultiplicityInvariantDecl__Group__3
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__2__Impl_in_rule__MultiplicityInvariantDecl__Group__24100);
            rule__MultiplicityInvariantDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__3_in_rule__MultiplicityInvariantDecl__Group__24103);
            rule__MultiplicityInvariantDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group__2"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2010:1: rule__MultiplicityInvariantDecl__Group__2__Impl : ( ( rule__MultiplicityInvariantDecl__Group_2__0 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2014:1: ( ( ( rule__MultiplicityInvariantDecl__Group_2__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2015:1: ( ( rule__MultiplicityInvariantDecl__Group_2__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2015:1: ( ( rule__MultiplicityInvariantDecl__Group_2__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2016:1: ( rule__MultiplicityInvariantDecl__Group_2__0 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2017:1: ( rule__MultiplicityInvariantDecl__Group_2__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2017:2: rule__MultiplicityInvariantDecl__Group_2__0
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__0_in_rule__MultiplicityInvariantDecl__Group__2__Impl4130);
            rule__MultiplicityInvariantDecl__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group__2__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2027:1: rule__MultiplicityInvariantDecl__Group__3 : rule__MultiplicityInvariantDecl__Group__3__Impl rule__MultiplicityInvariantDecl__Group__4 ;
    public final void rule__MultiplicityInvariantDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2031:1: ( rule__MultiplicityInvariantDecl__Group__3__Impl rule__MultiplicityInvariantDecl__Group__4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2032:2: rule__MultiplicityInvariantDecl__Group__3__Impl rule__MultiplicityInvariantDecl__Group__4
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__3__Impl_in_rule__MultiplicityInvariantDecl__Group__34160);
            rule__MultiplicityInvariantDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__4_in_rule__MultiplicityInvariantDecl__Group__34163);
            rule__MultiplicityInvariantDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group__3"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2039:1: rule__MultiplicityInvariantDecl__Group__3__Impl : ( ( rule__MultiplicityInvariantDecl__MatchAssignment_3 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2043:1: ( ( ( rule__MultiplicityInvariantDecl__MatchAssignment_3 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2044:1: ( ( rule__MultiplicityInvariantDecl__MatchAssignment_3 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2044:1: ( ( rule__MultiplicityInvariantDecl__MatchAssignment_3 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2045:1: ( rule__MultiplicityInvariantDecl__MatchAssignment_3 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchAssignment_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2046:1: ( rule__MultiplicityInvariantDecl__MatchAssignment_3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2046:2: rule__MultiplicityInvariantDecl__MatchAssignment_3
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__MatchAssignment_3_in_rule__MultiplicityInvariantDecl__Group__3__Impl4190);
            rule__MultiplicityInvariantDecl__MatchAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group__3__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__4"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2056:1: rule__MultiplicityInvariantDecl__Group__4 : rule__MultiplicityInvariantDecl__Group__4__Impl ;
    public final void rule__MultiplicityInvariantDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2060:1: ( rule__MultiplicityInvariantDecl__Group__4__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2061:2: rule__MultiplicityInvariantDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__4__Impl_in_rule__MultiplicityInvariantDecl__Group__44220);
            rule__MultiplicityInvariantDecl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group__4"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__4__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2067:1: rule__MultiplicityInvariantDecl__Group__4__Impl : ( ( rule__MultiplicityInvariantDecl__Group_4__0 )? ) ;
    public final void rule__MultiplicityInvariantDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2071:1: ( ( ( rule__MultiplicityInvariantDecl__Group_4__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2072:1: ( ( rule__MultiplicityInvariantDecl__Group_4__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2072:1: ( ( rule__MultiplicityInvariantDecl__Group_4__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2073:1: ( rule__MultiplicityInvariantDecl__Group_4__0 )?
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_4()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2074:1: ( rule__MultiplicityInvariantDecl__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2074:2: rule__MultiplicityInvariantDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_4__0_in_rule__MultiplicityInvariantDecl__Group__4__Impl4247);
                    rule__MultiplicityInvariantDecl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group__4__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2094:1: rule__MultiplicityInvariantDecl__Group_1__0 : rule__MultiplicityInvariantDecl__Group_1__0__Impl rule__MultiplicityInvariantDecl__Group_1__1 ;
    public final void rule__MultiplicityInvariantDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2098:1: ( rule__MultiplicityInvariantDecl__Group_1__0__Impl rule__MultiplicityInvariantDecl__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2099:2: rule__MultiplicityInvariantDecl__Group_1__0__Impl rule__MultiplicityInvariantDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_1__0__Impl_in_rule__MultiplicityInvariantDecl__Group_1__04288);
            rule__MultiplicityInvariantDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_1__1_in_rule__MultiplicityInvariantDecl__Group_1__04291);
            rule__MultiplicityInvariantDecl__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_1__0"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2106:1: rule__MultiplicityInvariantDecl__Group_1__0__Impl : ( ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2110:1: ( ( ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2111:1: ( ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2111:1: ( ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2112:1: ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getInvNameAssignment_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2113:1: ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2113:2: rule__MultiplicityInvariantDecl__InvNameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__InvNameAssignment_1_0_in_rule__MultiplicityInvariantDecl__Group_1__0__Impl4318);
            rule__MultiplicityInvariantDecl__InvNameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getInvNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2123:1: rule__MultiplicityInvariantDecl__Group_1__1 : rule__MultiplicityInvariantDecl__Group_1__1__Impl ;
    public final void rule__MultiplicityInvariantDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2127:1: ( rule__MultiplicityInvariantDecl__Group_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2128:2: rule__MultiplicityInvariantDecl__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_1__1__Impl_in_rule__MultiplicityInvariantDecl__Group_1__14348);
            rule__MultiplicityInvariantDecl__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_1__1"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2134:1: rule__MultiplicityInvariantDecl__Group_1__1__Impl : ( ':' ) ;
    public final void rule__MultiplicityInvariantDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2138:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2139:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2139:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2140:1: ':'
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__MultiplicityInvariantDecl__Group_1__1__Impl4376); 
             after(grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2157:1: rule__MultiplicityInvariantDecl__Group_2__0 : rule__MultiplicityInvariantDecl__Group_2__0__Impl rule__MultiplicityInvariantDecl__Group_2__1 ;
    public final void rule__MultiplicityInvariantDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2161:1: ( rule__MultiplicityInvariantDecl__Group_2__0__Impl rule__MultiplicityInvariantDecl__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2162:2: rule__MultiplicityInvariantDecl__Group_2__0__Impl rule__MultiplicityInvariantDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__0__Impl_in_rule__MultiplicityInvariantDecl__Group_2__04411);
            rule__MultiplicityInvariantDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__1_in_rule__MultiplicityInvariantDecl__Group_2__04414);
            rule__MultiplicityInvariantDecl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_2__0"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2169:1: rule__MultiplicityInvariantDecl__Group_2__0__Impl : ( ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2173:1: ( ( ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2174:1: ( ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2174:1: ( ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2175:1: ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getLoAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2176:1: ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2176:2: rule__MultiplicityInvariantDecl__LoAssignment_2_0
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__LoAssignment_2_0_in_rule__MultiplicityInvariantDecl__Group_2__0__Impl4441);
            rule__MultiplicityInvariantDecl__LoAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getLoAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_2__0__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2186:1: rule__MultiplicityInvariantDecl__Group_2__1 : rule__MultiplicityInvariantDecl__Group_2__1__Impl rule__MultiplicityInvariantDecl__Group_2__2 ;
    public final void rule__MultiplicityInvariantDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2190:1: ( rule__MultiplicityInvariantDecl__Group_2__1__Impl rule__MultiplicityInvariantDecl__Group_2__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2191:2: rule__MultiplicityInvariantDecl__Group_2__1__Impl rule__MultiplicityInvariantDecl__Group_2__2
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__1__Impl_in_rule__MultiplicityInvariantDecl__Group_2__14471);
            rule__MultiplicityInvariantDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__2_in_rule__MultiplicityInvariantDecl__Group_2__14474);
            rule__MultiplicityInvariantDecl__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_2__1"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2198:1: rule__MultiplicityInvariantDecl__Group_2__1__Impl : ( '..' ) ;
    public final void rule__MultiplicityInvariantDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2202:1: ( ( '..' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2203:1: ( '..' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2203:1: ( '..' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2204:1: '..'
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getFullStopFullStopKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__MultiplicityInvariantDecl__Group_2__1__Impl4502); 
             after(grammarAccess.getMultiplicityInvariantDeclAccess().getFullStopFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_2__1__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_2__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2217:1: rule__MultiplicityInvariantDecl__Group_2__2 : rule__MultiplicityInvariantDecl__Group_2__2__Impl ;
    public final void rule__MultiplicityInvariantDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2221:1: ( rule__MultiplicityInvariantDecl__Group_2__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2222:2: rule__MultiplicityInvariantDecl__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__2__Impl_in_rule__MultiplicityInvariantDecl__Group_2__24533);
            rule__MultiplicityInvariantDecl__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_2__2"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_2__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2228:1: rule__MultiplicityInvariantDecl__Group_2__2__Impl : ( ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2232:1: ( ( ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2233:1: ( ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2233:1: ( ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2234:1: ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getHiAssignment_2_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2235:1: ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2235:2: rule__MultiplicityInvariantDecl__HiAssignment_2_2
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__HiAssignment_2_2_in_rule__MultiplicityInvariantDecl__Group_2__2__Impl4560);
            rule__MultiplicityInvariantDecl__HiAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getHiAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_2__2__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_4__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2251:1: rule__MultiplicityInvariantDecl__Group_4__0 : rule__MultiplicityInvariantDecl__Group_4__0__Impl rule__MultiplicityInvariantDecl__Group_4__1 ;
    public final void rule__MultiplicityInvariantDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2255:1: ( rule__MultiplicityInvariantDecl__Group_4__0__Impl rule__MultiplicityInvariantDecl__Group_4__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2256:2: rule__MultiplicityInvariantDecl__Group_4__0__Impl rule__MultiplicityInvariantDecl__Group_4__1
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_4__0__Impl_in_rule__MultiplicityInvariantDecl__Group_4__04596);
            rule__MultiplicityInvariantDecl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_4__1_in_rule__MultiplicityInvariantDecl__Group_4__04599);
            rule__MultiplicityInvariantDecl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_4__0"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_4__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2263:1: rule__MultiplicityInvariantDecl__Group_4__0__Impl : ( ':' ) ;
    public final void rule__MultiplicityInvariantDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2267:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2268:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2268:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2269:1: ':'
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__MultiplicityInvariantDecl__Group_4__0__Impl4627); 
             after(grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_4__0__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_4__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2282:1: rule__MultiplicityInvariantDecl__Group_4__1 : rule__MultiplicityInvariantDecl__Group_4__1__Impl ;
    public final void rule__MultiplicityInvariantDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2286:1: ( rule__MultiplicityInvariantDecl__Group_4__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2287:2: rule__MultiplicityInvariantDecl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_4__1__Impl_in_rule__MultiplicityInvariantDecl__Group_4__14658);
            rule__MultiplicityInvariantDecl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_4__1"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group_4__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2293:1: rule__MultiplicityInvariantDecl__Group_4__1__Impl : ( ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2297:1: ( ( ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2298:1: ( ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2298:1: ( ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2299:1: ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeAssignment_4_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2300:1: ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2300:2: rule__MultiplicityInvariantDecl__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__TypeAssignment_4_1_in_rule__MultiplicityInvariantDecl__Group_4__1__Impl4685);
            rule__MultiplicityInvariantDecl__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__Group_4__1__Impl"


    // $ANTLR start "rule__SubFeaturesMatch__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2314:1: rule__SubFeaturesMatch__Group__0 : rule__SubFeaturesMatch__Group__0__Impl rule__SubFeaturesMatch__Group__1 ;
    public final void rule__SubFeaturesMatch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2318:1: ( rule__SubFeaturesMatch__Group__0__Impl rule__SubFeaturesMatch__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2319:2: rule__SubFeaturesMatch__Group__0__Impl rule__SubFeaturesMatch__Group__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__0__Impl_in_rule__SubFeaturesMatch__Group__04719);
            rule__SubFeaturesMatch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__1_in_rule__SubFeaturesMatch__Group__04722);
            rule__SubFeaturesMatch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group__0"


    // $ANTLR start "rule__SubFeaturesMatch__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2326:1: rule__SubFeaturesMatch__Group__0__Impl : ( () ) ;
    public final void rule__SubFeaturesMatch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2330:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2331:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2331:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2332:1: ()
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getSubFeaturesMatchAction_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2333:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2335:1: 
            {
            }

             after(grammarAccess.getSubFeaturesMatchAccess().getSubFeaturesMatchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group__0__Impl"


    // $ANTLR start "rule__SubFeaturesMatch__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2345:1: rule__SubFeaturesMatch__Group__1 : rule__SubFeaturesMatch__Group__1__Impl rule__SubFeaturesMatch__Group__2 ;
    public final void rule__SubFeaturesMatch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2349:1: ( rule__SubFeaturesMatch__Group__1__Impl rule__SubFeaturesMatch__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2350:2: rule__SubFeaturesMatch__Group__1__Impl rule__SubFeaturesMatch__Group__2
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__1__Impl_in_rule__SubFeaturesMatch__Group__14780);
            rule__SubFeaturesMatch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__2_in_rule__SubFeaturesMatch__Group__14783);
            rule__SubFeaturesMatch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group__1"


    // $ANTLR start "rule__SubFeaturesMatch__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2357:1: rule__SubFeaturesMatch__Group__1__Impl : ( ( rule__SubFeaturesMatch__DistinctAssignment_1 )? ) ;
    public final void rule__SubFeaturesMatch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2361:1: ( ( ( rule__SubFeaturesMatch__DistinctAssignment_1 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2362:1: ( ( rule__SubFeaturesMatch__DistinctAssignment_1 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2362:1: ( ( rule__SubFeaturesMatch__DistinctAssignment_1 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2363:1: ( rule__SubFeaturesMatch__DistinctAssignment_1 )?
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getDistinctAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2364:1: ( rule__SubFeaturesMatch__DistinctAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2364:2: rule__SubFeaturesMatch__DistinctAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesMatch__DistinctAssignment_1_in_rule__SubFeaturesMatch__Group__1__Impl4810);
                    rule__SubFeaturesMatch__DistinctAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubFeaturesMatchAccess().getDistinctAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group__1__Impl"


    // $ANTLR start "rule__SubFeaturesMatch__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2374:1: rule__SubFeaturesMatch__Group__2 : rule__SubFeaturesMatch__Group__2__Impl rule__SubFeaturesMatch__Group__3 ;
    public final void rule__SubFeaturesMatch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2378:1: ( rule__SubFeaturesMatch__Group__2__Impl rule__SubFeaturesMatch__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2379:2: rule__SubFeaturesMatch__Group__2__Impl rule__SubFeaturesMatch__Group__3
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__2__Impl_in_rule__SubFeaturesMatch__Group__24841);
            rule__SubFeaturesMatch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__3_in_rule__SubFeaturesMatch__Group__24844);
            rule__SubFeaturesMatch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group__2"


    // $ANTLR start "rule__SubFeaturesMatch__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2386:1: rule__SubFeaturesMatch__Group__2__Impl : ( ( rule__SubFeaturesMatch__Group_2__0 )* ) ;
    public final void rule__SubFeaturesMatch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2390:1: ( ( ( rule__SubFeaturesMatch__Group_2__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2391:1: ( ( rule__SubFeaturesMatch__Group_2__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2391:1: ( ( rule__SubFeaturesMatch__Group_2__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2392:1: ( rule__SubFeaturesMatch__Group_2__0 )*
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2393:1: ( rule__SubFeaturesMatch__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==23) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2393:2: rule__SubFeaturesMatch__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__SubFeaturesMatch__Group_2__0_in_rule__SubFeaturesMatch__Group__2__Impl4871);
            	    rule__SubFeaturesMatch__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSubFeaturesMatchAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group__2__Impl"


    // $ANTLR start "rule__SubFeaturesMatch__Group__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2403:1: rule__SubFeaturesMatch__Group__3 : rule__SubFeaturesMatch__Group__3__Impl ;
    public final void rule__SubFeaturesMatch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2407:1: ( rule__SubFeaturesMatch__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2408:2: rule__SubFeaturesMatch__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__3__Impl_in_rule__SubFeaturesMatch__Group__34902);
            rule__SubFeaturesMatch__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group__3"


    // $ANTLR start "rule__SubFeaturesMatch__Group__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2414:1: rule__SubFeaturesMatch__Group__3__Impl : ( ( rule__SubFeaturesMatch__Alternatives_3 ) ) ;
    public final void rule__SubFeaturesMatch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2418:1: ( ( ( rule__SubFeaturesMatch__Alternatives_3 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2419:1: ( ( rule__SubFeaturesMatch__Alternatives_3 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2419:1: ( ( rule__SubFeaturesMatch__Alternatives_3 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2420:1: ( rule__SubFeaturesMatch__Alternatives_3 )
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getAlternatives_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2421:1: ( rule__SubFeaturesMatch__Alternatives_3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2421:2: rule__SubFeaturesMatch__Alternatives_3
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Alternatives_3_in_rule__SubFeaturesMatch__Group__3__Impl4929);
            rule__SubFeaturesMatch__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesMatchAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group__3__Impl"


    // $ANTLR start "rule__SubFeaturesMatch__Group_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2439:1: rule__SubFeaturesMatch__Group_2__0 : rule__SubFeaturesMatch__Group_2__0__Impl rule__SubFeaturesMatch__Group_2__1 ;
    public final void rule__SubFeaturesMatch__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2443:1: ( rule__SubFeaturesMatch__Group_2__0__Impl rule__SubFeaturesMatch__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2444:2: rule__SubFeaturesMatch__Group_2__0__Impl rule__SubFeaturesMatch__Group_2__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group_2__0__Impl_in_rule__SubFeaturesMatch__Group_2__04967);
            rule__SubFeaturesMatch__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group_2__1_in_rule__SubFeaturesMatch__Group_2__04970);
            rule__SubFeaturesMatch__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group_2__0"


    // $ANTLR start "rule__SubFeaturesMatch__Group_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2451:1: rule__SubFeaturesMatch__Group_2__0__Impl : ( ( rule__SubFeaturesMatch__CategoryNamesAssignment_2_0 ) ) ;
    public final void rule__SubFeaturesMatch__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2455:1: ( ( ( rule__SubFeaturesMatch__CategoryNamesAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2456:1: ( ( rule__SubFeaturesMatch__CategoryNamesAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2456:1: ( ( rule__SubFeaturesMatch__CategoryNamesAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2457:1: ( rule__SubFeaturesMatch__CategoryNamesAssignment_2_0 )
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getCategoryNamesAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2458:1: ( rule__SubFeaturesMatch__CategoryNamesAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2458:2: rule__SubFeaturesMatch__CategoryNamesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__CategoryNamesAssignment_2_0_in_rule__SubFeaturesMatch__Group_2__0__Impl4997);
            rule__SubFeaturesMatch__CategoryNamesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesMatchAccess().getCategoryNamesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group_2__0__Impl"


    // $ANTLR start "rule__SubFeaturesMatch__Group_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2468:1: rule__SubFeaturesMatch__Group_2__1 : rule__SubFeaturesMatch__Group_2__1__Impl ;
    public final void rule__SubFeaturesMatch__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2472:1: ( rule__SubFeaturesMatch__Group_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2473:2: rule__SubFeaturesMatch__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group_2__1__Impl_in_rule__SubFeaturesMatch__Group_2__15027);
            rule__SubFeaturesMatch__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group_2__1"


    // $ANTLR start "rule__SubFeaturesMatch__Group_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2479:1: rule__SubFeaturesMatch__Group_2__1__Impl : ( '.' ) ;
    public final void rule__SubFeaturesMatch__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2483:1: ( ( '.' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2484:1: ( '.' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2484:1: ( '.' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2485:1: '.'
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getFullStopKeyword_2_1()); 
            match(input,23,FOLLOW_23_in_rule__SubFeaturesMatch__Group_2__1__Impl5055); 
             after(grammarAccess.getSubFeaturesMatchAccess().getFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__Group_2__1__Impl"


    // $ANTLR start "rule__ConstraintNat__Group_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2502:1: rule__ConstraintNat__Group_0__0 : rule__ConstraintNat__Group_0__0__Impl rule__ConstraintNat__Group_0__1 ;
    public final void rule__ConstraintNat__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2506:1: ( rule__ConstraintNat__Group_0__0__Impl rule__ConstraintNat__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2507:2: rule__ConstraintNat__Group_0__0__Impl rule__ConstraintNat__Group_0__1
            {
            pushFollow(FOLLOW_rule__ConstraintNat__Group_0__0__Impl_in_rule__ConstraintNat__Group_0__05090);
            rule__ConstraintNat__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintNat__Group_0__1_in_rule__ConstraintNat__Group_0__05093);
            rule__ConstraintNat__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintNat__Group_0__0"


    // $ANTLR start "rule__ConstraintNat__Group_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2514:1: rule__ConstraintNat__Group_0__0__Impl : ( () ) ;
    public final void rule__ConstraintNat__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2518:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2519:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2519:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2520:1: ()
            {
             before(grammarAccess.getConstraintNatAccess().getNumNatConstraintAction_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2521:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2523:1: 
            {
            }

             after(grammarAccess.getConstraintNatAccess().getNumNatConstraintAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintNat__Group_0__0__Impl"


    // $ANTLR start "rule__ConstraintNat__Group_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2533:1: rule__ConstraintNat__Group_0__1 : rule__ConstraintNat__Group_0__1__Impl ;
    public final void rule__ConstraintNat__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2537:1: ( rule__ConstraintNat__Group_0__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2538:2: rule__ConstraintNat__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintNat__Group_0__1__Impl_in_rule__ConstraintNat__Group_0__15151);
            rule__ConstraintNat__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintNat__Group_0__1"


    // $ANTLR start "rule__ConstraintNat__Group_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2544:1: rule__ConstraintNat__Group_0__1__Impl : ( ( rule__ConstraintNat__NumAssignment_0_1 ) ) ;
    public final void rule__ConstraintNat__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2548:1: ( ( ( rule__ConstraintNat__NumAssignment_0_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2549:1: ( ( rule__ConstraintNat__NumAssignment_0_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2549:1: ( ( rule__ConstraintNat__NumAssignment_0_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2550:1: ( rule__ConstraintNat__NumAssignment_0_1 )
            {
             before(grammarAccess.getConstraintNatAccess().getNumAssignment_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2551:1: ( rule__ConstraintNat__NumAssignment_0_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2551:2: rule__ConstraintNat__NumAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ConstraintNat__NumAssignment_0_1_in_rule__ConstraintNat__Group_0__1__Impl5178);
            rule__ConstraintNat__NumAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintNatAccess().getNumAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintNat__Group_0__1__Impl"


    // $ANTLR start "rule__ConstraintNat__Group_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2565:1: rule__ConstraintNat__Group_1__0 : rule__ConstraintNat__Group_1__0__Impl rule__ConstraintNat__Group_1__1 ;
    public final void rule__ConstraintNat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2569:1: ( rule__ConstraintNat__Group_1__0__Impl rule__ConstraintNat__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2570:2: rule__ConstraintNat__Group_1__0__Impl rule__ConstraintNat__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintNat__Group_1__0__Impl_in_rule__ConstraintNat__Group_1__05212);
            rule__ConstraintNat__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintNat__Group_1__1_in_rule__ConstraintNat__Group_1__05215);
            rule__ConstraintNat__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintNat__Group_1__0"


    // $ANTLR start "rule__ConstraintNat__Group_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2577:1: rule__ConstraintNat__Group_1__0__Impl : ( () ) ;
    public final void rule__ConstraintNat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2581:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2582:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2582:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2583:1: ()
            {
             before(grammarAccess.getConstraintNatAccess().getAnyNatConstraintAction_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2584:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2586:1: 
            {
            }

             after(grammarAccess.getConstraintNatAccess().getAnyNatConstraintAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintNat__Group_1__0__Impl"


    // $ANTLR start "rule__ConstraintNat__Group_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2596:1: rule__ConstraintNat__Group_1__1 : rule__ConstraintNat__Group_1__1__Impl ;
    public final void rule__ConstraintNat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2600:1: ( rule__ConstraintNat__Group_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2601:2: rule__ConstraintNat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintNat__Group_1__1__Impl_in_rule__ConstraintNat__Group_1__15273);
            rule__ConstraintNat__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintNat__Group_1__1"


    // $ANTLR start "rule__ConstraintNat__Group_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2607:1: rule__ConstraintNat__Group_1__1__Impl : ( '*' ) ;
    public final void rule__ConstraintNat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2611:1: ( ( '*' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2612:1: ( '*' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2612:1: ( '*' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2613:1: '*'
            {
             before(grammarAccess.getConstraintNatAccess().getAsteriskKeyword_1_1()); 
            match(input,24,FOLLOW_24_in_rule__ConstraintNat__Group_1__1__Impl5301); 
             after(grammarAccess.getConstraintNatAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintNat__Group_1__1__Impl"


    // $ANTLR start "rule__AttrDecl__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2630:1: rule__AttrDecl__Group__0 : rule__AttrDecl__Group__0__Impl rule__AttrDecl__Group__1 ;
    public final void rule__AttrDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2634:1: ( rule__AttrDecl__Group__0__Impl rule__AttrDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2635:2: rule__AttrDecl__Group__0__Impl rule__AttrDecl__Group__1
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group__0__Impl_in_rule__AttrDecl__Group__05336);
            rule__AttrDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrDecl__Group__1_in_rule__AttrDecl__Group__05339);
            rule__AttrDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group__0"


    // $ANTLR start "rule__AttrDecl__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2642:1: rule__AttrDecl__Group__0__Impl : ( ( rule__AttrDecl__ModifierAssignment_0 ) ) ;
    public final void rule__AttrDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2646:1: ( ( ( rule__AttrDecl__ModifierAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2647:1: ( ( rule__AttrDecl__ModifierAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2647:1: ( ( rule__AttrDecl__ModifierAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2648:1: ( rule__AttrDecl__ModifierAssignment_0 )
            {
             before(grammarAccess.getAttrDeclAccess().getModifierAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2649:1: ( rule__AttrDecl__ModifierAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2649:2: rule__AttrDecl__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrDecl__ModifierAssignment_0_in_rule__AttrDecl__Group__0__Impl5366);
            rule__AttrDecl__ModifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttrDeclAccess().getModifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group__0__Impl"


    // $ANTLR start "rule__AttrDecl__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2659:1: rule__AttrDecl__Group__1 : rule__AttrDecl__Group__1__Impl rule__AttrDecl__Group__2 ;
    public final void rule__AttrDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2663:1: ( rule__AttrDecl__Group__1__Impl rule__AttrDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2664:2: rule__AttrDecl__Group__1__Impl rule__AttrDecl__Group__2
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group__1__Impl_in_rule__AttrDecl__Group__15396);
            rule__AttrDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrDecl__Group__2_in_rule__AttrDecl__Group__15399);
            rule__AttrDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group__1"


    // $ANTLR start "rule__AttrDecl__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2671:1: rule__AttrDecl__Group__1__Impl : ( ( rule__AttrDecl__AttributeNameAssignment_1 ) ) ;
    public final void rule__AttrDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2675:1: ( ( ( rule__AttrDecl__AttributeNameAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2676:1: ( ( rule__AttrDecl__AttributeNameAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2676:1: ( ( rule__AttrDecl__AttributeNameAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2677:1: ( rule__AttrDecl__AttributeNameAssignment_1 )
            {
             before(grammarAccess.getAttrDeclAccess().getAttributeNameAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2678:1: ( rule__AttrDecl__AttributeNameAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2678:2: rule__AttrDecl__AttributeNameAssignment_1
            {
            pushFollow(FOLLOW_rule__AttrDecl__AttributeNameAssignment_1_in_rule__AttrDecl__Group__1__Impl5426);
            rule__AttrDecl__AttributeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrDeclAccess().getAttributeNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group__1__Impl"


    // $ANTLR start "rule__AttrDecl__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2688:1: rule__AttrDecl__Group__2 : rule__AttrDecl__Group__2__Impl ;
    public final void rule__AttrDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2692:1: ( rule__AttrDecl__Group__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2693:2: rule__AttrDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group__2__Impl_in_rule__AttrDecl__Group__25456);
            rule__AttrDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group__2"


    // $ANTLR start "rule__AttrDecl__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2699:1: rule__AttrDecl__Group__2__Impl : ( ( rule__AttrDecl__Alternatives_2 ) ) ;
    public final void rule__AttrDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2703:1: ( ( ( rule__AttrDecl__Alternatives_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2704:1: ( ( rule__AttrDecl__Alternatives_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2704:1: ( ( rule__AttrDecl__Alternatives_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2705:1: ( rule__AttrDecl__Alternatives_2 )
            {
             before(grammarAccess.getAttrDeclAccess().getAlternatives_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2706:1: ( rule__AttrDecl__Alternatives_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2706:2: rule__AttrDecl__Alternatives_2
            {
            pushFollow(FOLLOW_rule__AttrDecl__Alternatives_2_in_rule__AttrDecl__Group__2__Impl5483);
            rule__AttrDecl__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAttrDeclAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group__2__Impl"


    // $ANTLR start "rule__AttrDecl__Group_2_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2722:1: rule__AttrDecl__Group_2_0__0 : rule__AttrDecl__Group_2_0__0__Impl rule__AttrDecl__Group_2_0__1 ;
    public final void rule__AttrDecl__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2726:1: ( rule__AttrDecl__Group_2_0__0__Impl rule__AttrDecl__Group_2_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2727:2: rule__AttrDecl__Group_2_0__0__Impl rule__AttrDecl__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group_2_0__0__Impl_in_rule__AttrDecl__Group_2_0__05519);
            rule__AttrDecl__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrDecl__Group_2_0__1_in_rule__AttrDecl__Group_2_0__05522);
            rule__AttrDecl__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group_2_0__0"


    // $ANTLR start "rule__AttrDecl__Group_2_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2734:1: rule__AttrDecl__Group_2_0__0__Impl : ( ':' ) ;
    public final void rule__AttrDecl__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2738:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2739:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2739:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2740:1: ':'
            {
             before(grammarAccess.getAttrDeclAccess().getColonKeyword_2_0_0()); 
            match(input,21,FOLLOW_21_in_rule__AttrDecl__Group_2_0__0__Impl5550); 
             after(grammarAccess.getAttrDeclAccess().getColonKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group_2_0__0__Impl"


    // $ANTLR start "rule__AttrDecl__Group_2_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2753:1: rule__AttrDecl__Group_2_0__1 : rule__AttrDecl__Group_2_0__1__Impl ;
    public final void rule__AttrDecl__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2757:1: ( rule__AttrDecl__Group_2_0__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2758:2: rule__AttrDecl__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group_2_0__1__Impl_in_rule__AttrDecl__Group_2_0__15581);
            rule__AttrDecl__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group_2_0__1"


    // $ANTLR start "rule__AttrDecl__Group_2_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2764:1: rule__AttrDecl__Group_2_0__1__Impl : ( ( rule__AttrDecl__TypeAssignment_2_0_1 ) ) ;
    public final void rule__AttrDecl__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2768:1: ( ( ( rule__AttrDecl__TypeAssignment_2_0_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2769:1: ( ( rule__AttrDecl__TypeAssignment_2_0_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2769:1: ( ( rule__AttrDecl__TypeAssignment_2_0_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2770:1: ( rule__AttrDecl__TypeAssignment_2_0_1 )
            {
             before(grammarAccess.getAttrDeclAccess().getTypeAssignment_2_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2771:1: ( rule__AttrDecl__TypeAssignment_2_0_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2771:2: rule__AttrDecl__TypeAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__AttrDecl__TypeAssignment_2_0_1_in_rule__AttrDecl__Group_2_0__1__Impl5608);
            rule__AttrDecl__TypeAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrDeclAccess().getTypeAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group_2_0__1__Impl"


    // $ANTLR start "rule__AttrDecl__Group_2_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2785:1: rule__AttrDecl__Group_2_1__0 : rule__AttrDecl__Group_2_1__0__Impl rule__AttrDecl__Group_2_1__1 ;
    public final void rule__AttrDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2789:1: ( rule__AttrDecl__Group_2_1__0__Impl rule__AttrDecl__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2790:2: rule__AttrDecl__Group_2_1__0__Impl rule__AttrDecl__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group_2_1__0__Impl_in_rule__AttrDecl__Group_2_1__05642);
            rule__AttrDecl__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrDecl__Group_2_1__1_in_rule__AttrDecl__Group_2_1__05645);
            rule__AttrDecl__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group_2_1__0"


    // $ANTLR start "rule__AttrDecl__Group_2_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2797:1: rule__AttrDecl__Group_2_1__0__Impl : ( '=' ) ;
    public final void rule__AttrDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2801:1: ( ( '=' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2802:1: ( '=' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2802:1: ( '=' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2803:1: '='
            {
             before(grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_1_0()); 
            match(input,25,FOLLOW_25_in_rule__AttrDecl__Group_2_1__0__Impl5673); 
             after(grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group_2_1__0__Impl"


    // $ANTLR start "rule__AttrDecl__Group_2_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2816:1: rule__AttrDecl__Group_2_1__1 : rule__AttrDecl__Group_2_1__1__Impl ;
    public final void rule__AttrDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2820:1: ( rule__AttrDecl__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2821:2: rule__AttrDecl__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group_2_1__1__Impl_in_rule__AttrDecl__Group_2_1__15704);
            rule__AttrDecl__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group_2_1__1"


    // $ANTLR start "rule__AttrDecl__Group_2_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2827:1: rule__AttrDecl__Group_2_1__1__Impl : ( ( rule__AttrDecl__LiteralAssignment_2_1_1 ) ) ;
    public final void rule__AttrDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2831:1: ( ( ( rule__AttrDecl__LiteralAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2832:1: ( ( rule__AttrDecl__LiteralAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2832:1: ( ( rule__AttrDecl__LiteralAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2833:1: ( rule__AttrDecl__LiteralAssignment_2_1_1 )
            {
             before(grammarAccess.getAttrDeclAccess().getLiteralAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2834:1: ( rule__AttrDecl__LiteralAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2834:2: rule__AttrDecl__LiteralAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__AttrDecl__LiteralAssignment_2_1_1_in_rule__AttrDecl__Group_2_1__1__Impl5731);
            rule__AttrDecl__LiteralAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrDeclAccess().getLiteralAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__Group_2_1__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2848:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2852:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2853:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__05765);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__05768);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2860:1: rule__Type__Group__0__Impl : ( ( rule__Type__Alternatives_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2864:1: ( ( ( rule__Type__Alternatives_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2865:1: ( ( rule__Type__Alternatives_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2865:1: ( ( rule__Type__Alternatives_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2866:1: ( rule__Type__Alternatives_0 )
            {
             before(grammarAccess.getTypeAccess().getAlternatives_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2867:1: ( rule__Type__Alternatives_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2867:2: rule__Type__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_0_in_rule__Type__Group__0__Impl5795);
            rule__Type__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2877:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2881:1: ( rule__Type__Group__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2882:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__15825);
            rule__Type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2888:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2892:1: ( ( ( rule__Type__Group_1__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2893:1: ( ( rule__Type__Group_1__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2893:1: ( ( rule__Type__Group_1__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2894:1: ( rule__Type__Group_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2895:1: ( rule__Type__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2895:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl5852);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group_0_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2909:1: rule__Type__Group_0_0__0 : rule__Type__Group_0_0__0__Impl rule__Type__Group_0_0__1 ;
    public final void rule__Type__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2913:1: ( rule__Type__Group_0_0__0__Impl rule__Type__Group_0_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2914:2: rule__Type__Group_0_0__0__Impl rule__Type__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0_0__0__Impl_in_rule__Type__Group_0_0__05887);
            rule__Type__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_0__1_in_rule__Type__Group_0_0__05890);
            rule__Type__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0__0"


    // $ANTLR start "rule__Type__Group_0_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2921:1: rule__Type__Group_0_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2925:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2926:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2926:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2927:1: ()
            {
             before(grammarAccess.getTypeAccess().getBasicTypeAction_0_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2928:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2930:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getBasicTypeAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2940:1: rule__Type__Group_0_0__1 : rule__Type__Group_0_0__1__Impl rule__Type__Group_0_0__2 ;
    public final void rule__Type__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2944:1: ( rule__Type__Group_0_0__1__Impl rule__Type__Group_0_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2945:2: rule__Type__Group_0_0__1__Impl rule__Type__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Type__Group_0_0__1__Impl_in_rule__Type__Group_0_0__15948);
            rule__Type__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_0__2_in_rule__Type__Group_0_0__15951);
            rule__Type__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0__1"


    // $ANTLR start "rule__Type__Group_0_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2952:1: rule__Type__Group_0_0__1__Impl : ( ( rule__Type__BaseTypeAssignment_0_0_1 ) ) ;
    public final void rule__Type__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2956:1: ( ( ( rule__Type__BaseTypeAssignment_0_0_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2957:1: ( ( rule__Type__BaseTypeAssignment_0_0_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2957:1: ( ( rule__Type__BaseTypeAssignment_0_0_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2958:1: ( rule__Type__BaseTypeAssignment_0_0_1 )
            {
             before(grammarAccess.getTypeAccess().getBaseTypeAssignment_0_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2959:1: ( rule__Type__BaseTypeAssignment_0_0_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2959:2: rule__Type__BaseTypeAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Type__BaseTypeAssignment_0_0_1_in_rule__Type__Group_0_0__1__Impl5978);
            rule__Type__BaseTypeAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getBaseTypeAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0__1__Impl"


    // $ANTLR start "rule__Type__Group_0_0__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2969:1: rule__Type__Group_0_0__2 : rule__Type__Group_0_0__2__Impl ;
    public final void rule__Type__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2973:1: ( rule__Type__Group_0_0__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2974:2: rule__Type__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0_0__2__Impl_in_rule__Type__Group_0_0__26008);
            rule__Type__Group_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0__2"


    // $ANTLR start "rule__Type__Group_0_0__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2980:1: rule__Type__Group_0_0__2__Impl : ( ( rule__Type__Alternatives_0_0_2 )* ) ;
    public final void rule__Type__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2984:1: ( ( ( rule__Type__Alternatives_0_0_2 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2985:1: ( ( rule__Type__Alternatives_0_0_2 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2985:1: ( ( rule__Type__Alternatives_0_0_2 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2986:1: ( rule__Type__Alternatives_0_0_2 )*
            {
             before(grammarAccess.getTypeAccess().getAlternatives_0_0_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2987:1: ( rule__Type__Alternatives_0_0_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==17||LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2987:2: rule__Type__Alternatives_0_0_2
            	    {
            	    pushFollow(FOLLOW_rule__Type__Alternatives_0_0_2_in_rule__Type__Group_0_0__2__Impl6035);
            	    rule__Type__Alternatives_0_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getAlternatives_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0__2__Impl"


    // $ANTLR start "rule__Type__Group_0_0_2_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3003:1: rule__Type__Group_0_0_2_0__0 : rule__Type__Group_0_0_2_0__0__Impl rule__Type__Group_0_0_2_0__1 ;
    public final void rule__Type__Group_0_0_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3007:1: ( rule__Type__Group_0_0_2_0__0__Impl rule__Type__Group_0_0_2_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3008:2: rule__Type__Group_0_0_2_0__0__Impl rule__Type__Group_0_0_2_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0_0_2_0__0__Impl_in_rule__Type__Group_0_0_2_0__06072);
            rule__Type__Group_0_0_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_0_2_0__1_in_rule__Type__Group_0_0_2_0__06075);
            rule__Type__Group_0_0_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_0__0"


    // $ANTLR start "rule__Type__Group_0_0_2_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3015:1: rule__Type__Group_0_0_2_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0_0_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3019:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3020:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3020:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3021:1: ()
            {
             before(grammarAccess.getTypeAccess().getListTypeBaseAction_0_0_2_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3022:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3024:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getListTypeBaseAction_0_0_2_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0_0_2_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3034:1: rule__Type__Group_0_0_2_0__1 : rule__Type__Group_0_0_2_0__1__Impl rule__Type__Group_0_0_2_0__2 ;
    public final void rule__Type__Group_0_0_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3038:1: ( rule__Type__Group_0_0_2_0__1__Impl rule__Type__Group_0_0_2_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3039:2: rule__Type__Group_0_0_2_0__1__Impl rule__Type__Group_0_0_2_0__2
            {
            pushFollow(FOLLOW_rule__Type__Group_0_0_2_0__1__Impl_in_rule__Type__Group_0_0_2_0__16133);
            rule__Type__Group_0_0_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_0_2_0__2_in_rule__Type__Group_0_0_2_0__16136);
            rule__Type__Group_0_0_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_0__1"


    // $ANTLR start "rule__Type__Group_0_0_2_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3046:1: rule__Type__Group_0_0_2_0__1__Impl : ( '[' ) ;
    public final void rule__Type__Group_0_0_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3050:1: ( ( '[' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3051:1: ( '[' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3051:1: ( '[' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3052:1: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_0_2_0_1()); 
            match(input,26,FOLLOW_26_in_rule__Type__Group_0_0_2_0__1__Impl6164); 
             after(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_0_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_0__1__Impl"


    // $ANTLR start "rule__Type__Group_0_0_2_0__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3065:1: rule__Type__Group_0_0_2_0__2 : rule__Type__Group_0_0_2_0__2__Impl ;
    public final void rule__Type__Group_0_0_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3069:1: ( rule__Type__Group_0_0_2_0__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3070:2: rule__Type__Group_0_0_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0_0_2_0__2__Impl_in_rule__Type__Group_0_0_2_0__26195);
            rule__Type__Group_0_0_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_0__2"


    // $ANTLR start "rule__Type__Group_0_0_2_0__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3076:1: rule__Type__Group_0_0_2_0__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_0_0_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3080:1: ( ( ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3081:1: ( ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3081:1: ( ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3082:1: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_0_2_0_2()); 
            match(input,27,FOLLOW_27_in_rule__Type__Group_0_0_2_0__2__Impl6223); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_0_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_0__2__Impl"


    // $ANTLR start "rule__Type__Group_0_0_2_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3101:1: rule__Type__Group_0_0_2_1__0 : rule__Type__Group_0_0_2_1__0__Impl rule__Type__Group_0_0_2_1__1 ;
    public final void rule__Type__Group_0_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3105:1: ( rule__Type__Group_0_0_2_1__0__Impl rule__Type__Group_0_0_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3106:2: rule__Type__Group_0_0_2_1__0__Impl rule__Type__Group_0_0_2_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0_0_2_1__0__Impl_in_rule__Type__Group_0_0_2_1__06260);
            rule__Type__Group_0_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_0_2_1__1_in_rule__Type__Group_0_0_2_1__06263);
            rule__Type__Group_0_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_1__0"


    // $ANTLR start "rule__Type__Group_0_0_2_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3113:1: rule__Type__Group_0_0_2_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_0_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3117:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3118:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3118:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3119:1: ()
            {
             before(grammarAccess.getTypeAccess().getSetTypeBaseAction_0_0_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3120:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3122:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getSetTypeBaseAction_0_0_2_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_1__0__Impl"


    // $ANTLR start "rule__Type__Group_0_0_2_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3132:1: rule__Type__Group_0_0_2_1__1 : rule__Type__Group_0_0_2_1__1__Impl rule__Type__Group_0_0_2_1__2 ;
    public final void rule__Type__Group_0_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3136:1: ( rule__Type__Group_0_0_2_1__1__Impl rule__Type__Group_0_0_2_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3137:2: rule__Type__Group_0_0_2_1__1__Impl rule__Type__Group_0_0_2_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_0_0_2_1__1__Impl_in_rule__Type__Group_0_0_2_1__16321);
            rule__Type__Group_0_0_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_0_2_1__2_in_rule__Type__Group_0_0_2_1__16324);
            rule__Type__Group_0_0_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_1__1"


    // $ANTLR start "rule__Type__Group_0_0_2_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3144:1: rule__Type__Group_0_0_2_1__1__Impl : ( '{' ) ;
    public final void rule__Type__Group_0_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3148:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3149:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3149:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3150:1: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_0_0_2_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Type__Group_0_0_2_1__1__Impl6352); 
             after(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_0_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_1__1__Impl"


    // $ANTLR start "rule__Type__Group_0_0_2_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3163:1: rule__Type__Group_0_0_2_1__2 : rule__Type__Group_0_0_2_1__2__Impl ;
    public final void rule__Type__Group_0_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3167:1: ( rule__Type__Group_0_0_2_1__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3168:2: rule__Type__Group_0_0_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0_0_2_1__2__Impl_in_rule__Type__Group_0_0_2_1__26383);
            rule__Type__Group_0_0_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_1__2"


    // $ANTLR start "rule__Type__Group_0_0_2_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3174:1: rule__Type__Group_0_0_2_1__2__Impl : ( '}' ) ;
    public final void rule__Type__Group_0_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3178:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3179:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3179:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3180:1: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_0_0_2_1_2()); 
            match(input,18,FOLLOW_18_in_rule__Type__Group_0_0_2_1__2__Impl6411); 
             after(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_0_0_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_0_2_1__2__Impl"


    // $ANTLR start "rule__Type__Group_0_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3199:1: rule__Type__Group_0_1__0 : rule__Type__Group_0_1__0__Impl rule__Type__Group_0_1__1 ;
    public final void rule__Type__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3203:1: ( rule__Type__Group_0_1__0__Impl rule__Type__Group_0_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3204:2: rule__Type__Group_0_1__0__Impl rule__Type__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0_1__0__Impl_in_rule__Type__Group_0_1__06448);
            rule__Type__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_1__1_in_rule__Type__Group_0_1__06451);
            rule__Type__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__0"


    // $ANTLR start "rule__Type__Group_0_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3211:1: rule__Type__Group_0_1__0__Impl : ( '<' ) ;
    public final void rule__Type__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3215:1: ( ( '<' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3216:1: ( '<' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3216:1: ( '<' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3217:1: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Type__Group_0_1__0__Impl6479); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__0__Impl"


    // $ANTLR start "rule__Type__Group_0_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3230:1: rule__Type__Group_0_1__1 : rule__Type__Group_0_1__1__Impl rule__Type__Group_0_1__2 ;
    public final void rule__Type__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3234:1: ( rule__Type__Group_0_1__1__Impl rule__Type__Group_0_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3235:2: rule__Type__Group_0_1__1__Impl rule__Type__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_0_1__1__Impl_in_rule__Type__Group_0_1__16510);
            rule__Type__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_1__2_in_rule__Type__Group_0_1__16513);
            rule__Type__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__1"


    // $ANTLR start "rule__Type__Group_0_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3242:1: rule__Type__Group_0_1__1__Impl : ( () ) ;
    public final void rule__Type__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3246:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3247:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3247:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3248:1: ()
            {
             before(grammarAccess.getTypeAccess().getTupleTypeAction_0_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3249:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3251:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getTupleTypeAction_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__1__Impl"


    // $ANTLR start "rule__Type__Group_0_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3261:1: rule__Type__Group_0_1__2 : rule__Type__Group_0_1__2__Impl rule__Type__Group_0_1__3 ;
    public final void rule__Type__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3265:1: ( rule__Type__Group_0_1__2__Impl rule__Type__Group_0_1__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3266:2: rule__Type__Group_0_1__2__Impl rule__Type__Group_0_1__3
            {
            pushFollow(FOLLOW_rule__Type__Group_0_1__2__Impl_in_rule__Type__Group_0_1__26571);
            rule__Type__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_1__3_in_rule__Type__Group_0_1__26574);
            rule__Type__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__2"


    // $ANTLR start "rule__Type__Group_0_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3273:1: rule__Type__Group_0_1__2__Impl : ( ( rule__Type__ElemTypesAssignment_0_1_2 ) ) ;
    public final void rule__Type__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3277:1: ( ( ( rule__Type__ElemTypesAssignment_0_1_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3278:1: ( ( rule__Type__ElemTypesAssignment_0_1_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3278:1: ( ( rule__Type__ElemTypesAssignment_0_1_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3279:1: ( rule__Type__ElemTypesAssignment_0_1_2 )
            {
             before(grammarAccess.getTypeAccess().getElemTypesAssignment_0_1_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3280:1: ( rule__Type__ElemTypesAssignment_0_1_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3280:2: rule__Type__ElemTypesAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__Type__ElemTypesAssignment_0_1_2_in_rule__Type__Group_0_1__2__Impl6601);
            rule__Type__ElemTypesAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getElemTypesAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__2__Impl"


    // $ANTLR start "rule__Type__Group_0_1__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3290:1: rule__Type__Group_0_1__3 : rule__Type__Group_0_1__3__Impl rule__Type__Group_0_1__4 ;
    public final void rule__Type__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3294:1: ( rule__Type__Group_0_1__3__Impl rule__Type__Group_0_1__4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3295:2: rule__Type__Group_0_1__3__Impl rule__Type__Group_0_1__4
            {
            pushFollow(FOLLOW_rule__Type__Group_0_1__3__Impl_in_rule__Type__Group_0_1__36631);
            rule__Type__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_1__4_in_rule__Type__Group_0_1__36634);
            rule__Type__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__3"


    // $ANTLR start "rule__Type__Group_0_1__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3302:1: rule__Type__Group_0_1__3__Impl : ( ( ( rule__Type__Group_0_1_3__0 ) ) ( ( rule__Type__Group_0_1_3__0 )* ) ) ;
    public final void rule__Type__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3306:1: ( ( ( ( rule__Type__Group_0_1_3__0 ) ) ( ( rule__Type__Group_0_1_3__0 )* ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3307:1: ( ( ( rule__Type__Group_0_1_3__0 ) ) ( ( rule__Type__Group_0_1_3__0 )* ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3307:1: ( ( ( rule__Type__Group_0_1_3__0 ) ) ( ( rule__Type__Group_0_1_3__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3308:1: ( ( rule__Type__Group_0_1_3__0 ) ) ( ( rule__Type__Group_0_1_3__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3308:1: ( ( rule__Type__Group_0_1_3__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3309:1: ( rule__Type__Group_0_1_3__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup_0_1_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3310:1: ( rule__Type__Group_0_1_3__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3310:2: rule__Type__Group_0_1_3__0
            {
            pushFollow(FOLLOW_rule__Type__Group_0_1_3__0_in_rule__Type__Group_0_1__3__Impl6663);
            rule__Type__Group_0_1_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup_0_1_3()); 

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3313:1: ( ( rule__Type__Group_0_1_3__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3314:1: ( rule__Type__Group_0_1_3__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_0_1_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3315:1: ( rule__Type__Group_0_1_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==24) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3315:2: rule__Type__Group_0_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Type__Group_0_1_3__0_in_rule__Type__Group_0_1__3__Impl6675);
            	    rule__Type__Group_0_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getGroup_0_1_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__3__Impl"


    // $ANTLR start "rule__Type__Group_0_1__4"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3326:1: rule__Type__Group_0_1__4 : rule__Type__Group_0_1__4__Impl ;
    public final void rule__Type__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3330:1: ( rule__Type__Group_0_1__4__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3331:2: rule__Type__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0_1__4__Impl_in_rule__Type__Group_0_1__46708);
            rule__Type__Group_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__4"


    // $ANTLR start "rule__Type__Group_0_1__4__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3337:1: rule__Type__Group_0_1__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3341:1: ( ( '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3342:1: ( '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3342:1: ( '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3343:1: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_0_1_4()); 
            match(input,29,FOLLOW_29_in_rule__Type__Group_0_1__4__Impl6736); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__4__Impl"


    // $ANTLR start "rule__Type__Group_0_1_3__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3366:1: rule__Type__Group_0_1_3__0 : rule__Type__Group_0_1_3__0__Impl rule__Type__Group_0_1_3__1 ;
    public final void rule__Type__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3370:1: ( rule__Type__Group_0_1_3__0__Impl rule__Type__Group_0_1_3__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3371:2: rule__Type__Group_0_1_3__0__Impl rule__Type__Group_0_1_3__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0_1_3__0__Impl_in_rule__Type__Group_0_1_3__06777);
            rule__Type__Group_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_1_3__1_in_rule__Type__Group_0_1_3__06780);
            rule__Type__Group_0_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1_3__0"


    // $ANTLR start "rule__Type__Group_0_1_3__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3378:1: rule__Type__Group_0_1_3__0__Impl : ( '*' ) ;
    public final void rule__Type__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3382:1: ( ( '*' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3383:1: ( '*' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3383:1: ( '*' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3384:1: '*'
            {
             before(grammarAccess.getTypeAccess().getAsteriskKeyword_0_1_3_0()); 
            match(input,24,FOLLOW_24_in_rule__Type__Group_0_1_3__0__Impl6808); 
             after(grammarAccess.getTypeAccess().getAsteriskKeyword_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1_3__0__Impl"


    // $ANTLR start "rule__Type__Group_0_1_3__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3397:1: rule__Type__Group_0_1_3__1 : rule__Type__Group_0_1_3__1__Impl ;
    public final void rule__Type__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3401:1: ( rule__Type__Group_0_1_3__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3402:2: rule__Type__Group_0_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0_1_3__1__Impl_in_rule__Type__Group_0_1_3__16839);
            rule__Type__Group_0_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1_3__1"


    // $ANTLR start "rule__Type__Group_0_1_3__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3408:1: rule__Type__Group_0_1_3__1__Impl : ( ( rule__Type__ElemTypesAssignment_0_1_3_1 ) ) ;
    public final void rule__Type__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3412:1: ( ( ( rule__Type__ElemTypesAssignment_0_1_3_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3413:1: ( ( rule__Type__ElemTypesAssignment_0_1_3_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3413:1: ( ( rule__Type__ElemTypesAssignment_0_1_3_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3414:1: ( rule__Type__ElemTypesAssignment_0_1_3_1 )
            {
             before(grammarAccess.getTypeAccess().getElemTypesAssignment_0_1_3_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3415:1: ( rule__Type__ElemTypesAssignment_0_1_3_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3415:2: rule__Type__ElemTypesAssignment_0_1_3_1
            {
            pushFollow(FOLLOW_rule__Type__ElemTypesAssignment_0_1_3_1_in_rule__Type__Group_0_1_3__1__Impl6866);
            rule__Type__ElemTypesAssignment_0_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getElemTypesAssignment_0_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1_3__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3429:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3433:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3434:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__06900);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__06903);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3441:1: rule__Type__Group_1__0__Impl : ( '?' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3445:1: ( ( '?' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3446:1: ( '?' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3446:1: ( '?' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3447:1: '?'
            {
             before(grammarAccess.getTypeAccess().getQuestionMarkKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Type__Group_1__0__Impl6931); 
             after(grammarAccess.getTypeAccess().getQuestionMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3460:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3464:1: ( rule__Type__Group_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3465:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__16962);
            rule__Type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3471:1: rule__Type__Group_1__1__Impl : ( () ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3475:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3476:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3476:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3477:1: ()
            {
             before(grammarAccess.getTypeAccess().getOptionTypeBaseAction_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3478:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3480:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getOptionTypeBaseAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__BasicLiteral__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3494:1: rule__BasicLiteral__Group__0 : rule__BasicLiteral__Group__0__Impl rule__BasicLiteral__Group__1 ;
    public final void rule__BasicLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3498:1: ( rule__BasicLiteral__Group__0__Impl rule__BasicLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3499:2: rule__BasicLiteral__Group__0__Impl rule__BasicLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BasicLiteral__Group__0__Impl_in_rule__BasicLiteral__Group__07024);
            rule__BasicLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicLiteral__Group__1_in_rule__BasicLiteral__Group__07027);
            rule__BasicLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicLiteral__Group__0"


    // $ANTLR start "rule__BasicLiteral__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3506:1: rule__BasicLiteral__Group__0__Impl : ( ( rule__BasicLiteral__TypeConsAssignment_0 ) ) ;
    public final void rule__BasicLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3510:1: ( ( ( rule__BasicLiteral__TypeConsAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3511:1: ( ( rule__BasicLiteral__TypeConsAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3511:1: ( ( rule__BasicLiteral__TypeConsAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3512:1: ( rule__BasicLiteral__TypeConsAssignment_0 )
            {
             before(grammarAccess.getBasicLiteralAccess().getTypeConsAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3513:1: ( rule__BasicLiteral__TypeConsAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3513:2: rule__BasicLiteral__TypeConsAssignment_0
            {
            pushFollow(FOLLOW_rule__BasicLiteral__TypeConsAssignment_0_in_rule__BasicLiteral__Group__0__Impl7054);
            rule__BasicLiteral__TypeConsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicLiteralAccess().getTypeConsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicLiteral__Group__0__Impl"


    // $ANTLR start "rule__BasicLiteral__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3523:1: rule__BasicLiteral__Group__1 : rule__BasicLiteral__Group__1__Impl ;
    public final void rule__BasicLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3527:1: ( rule__BasicLiteral__Group__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3528:2: rule__BasicLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicLiteral__Group__1__Impl_in_rule__BasicLiteral__Group__17084);
            rule__BasicLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicLiteral__Group__1"


    // $ANTLR start "rule__BasicLiteral__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3534:1: rule__BasicLiteral__Group__1__Impl : ( ( rule__BasicLiteral__LitAssignment_1 ) ) ;
    public final void rule__BasicLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3538:1: ( ( ( rule__BasicLiteral__LitAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3539:1: ( ( rule__BasicLiteral__LitAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3539:1: ( ( rule__BasicLiteral__LitAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3540:1: ( rule__BasicLiteral__LitAssignment_1 )
            {
             before(grammarAccess.getBasicLiteralAccess().getLitAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3541:1: ( rule__BasicLiteral__LitAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3541:2: rule__BasicLiteral__LitAssignment_1
            {
            pushFollow(FOLLOW_rule__BasicLiteral__LitAssignment_1_in_rule__BasicLiteral__Group__1__Impl7111);
            rule__BasicLiteral__LitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicLiteralAccess().getLitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicLiteral__Group__1__Impl"


    // $ANTLR start "rule__TupleLiteral__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3555:1: rule__TupleLiteral__Group__0 : rule__TupleLiteral__Group__0__Impl rule__TupleLiteral__Group__1 ;
    public final void rule__TupleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3559:1: ( rule__TupleLiteral__Group__0__Impl rule__TupleLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3560:2: rule__TupleLiteral__Group__0__Impl rule__TupleLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__0__Impl_in_rule__TupleLiteral__Group__07145);
            rule__TupleLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group__1_in_rule__TupleLiteral__Group__07148);
            rule__TupleLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group__0"


    // $ANTLR start "rule__TupleLiteral__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3567:1: rule__TupleLiteral__Group__0__Impl : ( '<' ) ;
    public final void rule__TupleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3571:1: ( ( '<' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3572:1: ( '<' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3572:1: ( '<' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3573:1: '<'
            {
             before(grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__TupleLiteral__Group__0__Impl7176); 
             after(grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group__0__Impl"


    // $ANTLR start "rule__TupleLiteral__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3586:1: rule__TupleLiteral__Group__1 : rule__TupleLiteral__Group__1__Impl rule__TupleLiteral__Group__2 ;
    public final void rule__TupleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3590:1: ( rule__TupleLiteral__Group__1__Impl rule__TupleLiteral__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3591:2: rule__TupleLiteral__Group__1__Impl rule__TupleLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__1__Impl_in_rule__TupleLiteral__Group__17207);
            rule__TupleLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group__2_in_rule__TupleLiteral__Group__17210);
            rule__TupleLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group__1"


    // $ANTLR start "rule__TupleLiteral__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3598:1: rule__TupleLiteral__Group__1__Impl : ( () ) ;
    public final void rule__TupleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3602:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3603:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3603:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3604:1: ()
            {
             before(grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3605:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3607:1: 
            {
            }

             after(grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group__1__Impl"


    // $ANTLR start "rule__TupleLiteral__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3617:1: rule__TupleLiteral__Group__2 : rule__TupleLiteral__Group__2__Impl rule__TupleLiteral__Group__3 ;
    public final void rule__TupleLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3621:1: ( rule__TupleLiteral__Group__2__Impl rule__TupleLiteral__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3622:2: rule__TupleLiteral__Group__2__Impl rule__TupleLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__2__Impl_in_rule__TupleLiteral__Group__27268);
            rule__TupleLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group__3_in_rule__TupleLiteral__Group__27271);
            rule__TupleLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group__2"


    // $ANTLR start "rule__TupleLiteral__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3629:1: rule__TupleLiteral__Group__2__Impl : ( ( rule__TupleLiteral__Group_2__0 )? ) ;
    public final void rule__TupleLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3633:1: ( ( ( rule__TupleLiteral__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3634:1: ( ( rule__TupleLiteral__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3634:1: ( ( rule__TupleLiteral__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3635:1: ( rule__TupleLiteral__Group_2__0 )?
            {
             before(grammarAccess.getTupleLiteralAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3636:1: ( rule__TupleLiteral__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==28||(LA30_0>=31 && LA30_0<=32)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3636:2: rule__TupleLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TupleLiteral__Group_2__0_in_rule__TupleLiteral__Group__2__Impl7298);
                    rule__TupleLiteral__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTupleLiteralAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group__2__Impl"


    // $ANTLR start "rule__TupleLiteral__Group__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3646:1: rule__TupleLiteral__Group__3 : rule__TupleLiteral__Group__3__Impl ;
    public final void rule__TupleLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3650:1: ( rule__TupleLiteral__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3651:2: rule__TupleLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__3__Impl_in_rule__TupleLiteral__Group__37329);
            rule__TupleLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group__3"


    // $ANTLR start "rule__TupleLiteral__Group__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3657:1: rule__TupleLiteral__Group__3__Impl : ( '>' ) ;
    public final void rule__TupleLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3661:1: ( ( '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3662:1: ( '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3662:1: ( '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3663:1: '>'
            {
             before(grammarAccess.getTupleLiteralAccess().getGreaterThanSignKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__TupleLiteral__Group__3__Impl7357); 
             after(grammarAccess.getTupleLiteralAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group__3__Impl"


    // $ANTLR start "rule__TupleLiteral__Group_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3684:1: rule__TupleLiteral__Group_2__0 : rule__TupleLiteral__Group_2__0__Impl rule__TupleLiteral__Group_2__1 ;
    public final void rule__TupleLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3688:1: ( rule__TupleLiteral__Group_2__0__Impl rule__TupleLiteral__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3689:2: rule__TupleLiteral__Group_2__0__Impl rule__TupleLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2__0__Impl_in_rule__TupleLiteral__Group_2__07396);
            rule__TupleLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group_2__1_in_rule__TupleLiteral__Group_2__07399);
            rule__TupleLiteral__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group_2__0"


    // $ANTLR start "rule__TupleLiteral__Group_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3696:1: rule__TupleLiteral__Group_2__0__Impl : ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) ) ;
    public final void rule__TupleLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3700:1: ( ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3701:1: ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3701:1: ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3702:1: ( rule__TupleLiteral__ElemsAssignment_2_0 )
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3703:1: ( rule__TupleLiteral__ElemsAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3703:2: rule__TupleLiteral__ElemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__TupleLiteral__ElemsAssignment_2_0_in_rule__TupleLiteral__Group_2__0__Impl7426);
            rule__TupleLiteral__ElemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__TupleLiteral__Group_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3713:1: rule__TupleLiteral__Group_2__1 : rule__TupleLiteral__Group_2__1__Impl ;
    public final void rule__TupleLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3717:1: ( rule__TupleLiteral__Group_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3718:2: rule__TupleLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2__1__Impl_in_rule__TupleLiteral__Group_2__17456);
            rule__TupleLiteral__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group_2__1"


    // $ANTLR start "rule__TupleLiteral__Group_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3724:1: rule__TupleLiteral__Group_2__1__Impl : ( ( rule__TupleLiteral__Group_2_1__0 )* ) ;
    public final void rule__TupleLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3728:1: ( ( ( rule__TupleLiteral__Group_2_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3729:1: ( ( rule__TupleLiteral__Group_2_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3729:1: ( ( rule__TupleLiteral__Group_2_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3730:1: ( rule__TupleLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getTupleLiteralAccess().getGroup_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3731:1: ( rule__TupleLiteral__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==16) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3731:2: rule__TupleLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__0_in_rule__TupleLiteral__Group_2__1__Impl7483);
            	    rule__TupleLiteral__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getTupleLiteralAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__TupleLiteral__Group_2_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3745:1: rule__TupleLiteral__Group_2_1__0 : rule__TupleLiteral__Group_2_1__0__Impl rule__TupleLiteral__Group_2_1__1 ;
    public final void rule__TupleLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3749:1: ( rule__TupleLiteral__Group_2_1__0__Impl rule__TupleLiteral__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3750:2: rule__TupleLiteral__Group_2_1__0__Impl rule__TupleLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__0__Impl_in_rule__TupleLiteral__Group_2_1__07518);
            rule__TupleLiteral__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__1_in_rule__TupleLiteral__Group_2_1__07521);
            rule__TupleLiteral__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group_2_1__0"


    // $ANTLR start "rule__TupleLiteral__Group_2_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3757:1: rule__TupleLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__TupleLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3761:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3762:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3762:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3763:1: ','
            {
             before(grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_16_in_rule__TupleLiteral__Group_2_1__0__Impl7549); 
             after(grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group_2_1__0__Impl"


    // $ANTLR start "rule__TupleLiteral__Group_2_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3776:1: rule__TupleLiteral__Group_2_1__1 : rule__TupleLiteral__Group_2_1__1__Impl ;
    public final void rule__TupleLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3780:1: ( rule__TupleLiteral__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3781:2: rule__TupleLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__1__Impl_in_rule__TupleLiteral__Group_2_1__17580);
            rule__TupleLiteral__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group_2_1__1"


    // $ANTLR start "rule__TupleLiteral__Group_2_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3787:1: rule__TupleLiteral__Group_2_1__1__Impl : ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) ) ;
    public final void rule__TupleLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3791:1: ( ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3792:1: ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3792:1: ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3793:1: ( rule__TupleLiteral__ElemsAssignment_2_1_1 )
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3794:1: ( rule__TupleLiteral__ElemsAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3794:2: rule__TupleLiteral__ElemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__ElemsAssignment_2_1_1_in_rule__TupleLiteral__Group_2_1__1__Impl7607);
            rule__TupleLiteral__ElemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__Group_2_1__1__Impl"


    // $ANTLR start "rule__ListLiteral__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3808:1: rule__ListLiteral__Group__0 : rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 ;
    public final void rule__ListLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3812:1: ( rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3813:2: rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__07641);
            rule__ListLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__07644);
            rule__ListLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__0"


    // $ANTLR start "rule__ListLiteral__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3820:1: rule__ListLiteral__Group__0__Impl : ( ( rule__ListLiteral__TypeConsAssignment_0 ) ) ;
    public final void rule__ListLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3824:1: ( ( ( rule__ListLiteral__TypeConsAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3825:1: ( ( rule__ListLiteral__TypeConsAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3825:1: ( ( rule__ListLiteral__TypeConsAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3826:1: ( rule__ListLiteral__TypeConsAssignment_0 )
            {
             before(grammarAccess.getListLiteralAccess().getTypeConsAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3827:1: ( rule__ListLiteral__TypeConsAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3827:2: rule__ListLiteral__TypeConsAssignment_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__TypeConsAssignment_0_in_rule__ListLiteral__Group__0__Impl7671);
            rule__ListLiteral__TypeConsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListLiteralAccess().getTypeConsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__0__Impl"


    // $ANTLR start "rule__ListLiteral__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3837:1: rule__ListLiteral__Group__1 : rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 ;
    public final void rule__ListLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3841:1: ( rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3842:2: rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__17701);
            rule__ListLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__17704);
            rule__ListLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__1"


    // $ANTLR start "rule__ListLiteral__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3849:1: rule__ListLiteral__Group__1__Impl : ( '[' ) ;
    public final void rule__ListLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3853:1: ( ( '[' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3854:1: ( '[' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3854:1: ( '[' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3855:1: '['
            {
             before(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__ListLiteral__Group__1__Impl7732); 
             after(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__1__Impl"


    // $ANTLR start "rule__ListLiteral__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3868:1: rule__ListLiteral__Group__2 : rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 ;
    public final void rule__ListLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3872:1: ( rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3873:2: rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__27763);
            rule__ListLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__3_in_rule__ListLiteral__Group__27766);
            rule__ListLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__2"


    // $ANTLR start "rule__ListLiteral__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3880:1: rule__ListLiteral__Group__2__Impl : ( ( rule__ListLiteral__Group_2__0 )? ) ;
    public final void rule__ListLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3884:1: ( ( ( rule__ListLiteral__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3885:1: ( ( rule__ListLiteral__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3885:1: ( ( rule__ListLiteral__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3886:1: ( rule__ListLiteral__Group_2__0 )?
            {
             before(grammarAccess.getListLiteralAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3887:1: ( rule__ListLiteral__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_LIT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3887:2: rule__ListLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ListLiteral__Group_2__0_in_rule__ListLiteral__Group__2__Impl7793);
                    rule__ListLiteral__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListLiteralAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__2__Impl"


    // $ANTLR start "rule__ListLiteral__Group__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3897:1: rule__ListLiteral__Group__3 : rule__ListLiteral__Group__3__Impl ;
    public final void rule__ListLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3901:1: ( rule__ListLiteral__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3902:2: rule__ListLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__3__Impl_in_rule__ListLiteral__Group__37824);
            rule__ListLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__3"


    // $ANTLR start "rule__ListLiteral__Group__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3908:1: rule__ListLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__ListLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3912:1: ( ( ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3913:1: ( ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3913:1: ( ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3914:1: ']'
            {
             before(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__ListLiteral__Group__3__Impl7852); 
             after(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__3__Impl"


    // $ANTLR start "rule__ListLiteral__Group_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3935:1: rule__ListLiteral__Group_2__0 : rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 ;
    public final void rule__ListLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3939:1: ( rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3940:2: rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2__0__Impl_in_rule__ListLiteral__Group_2__07891);
            rule__ListLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_2__1_in_rule__ListLiteral__Group_2__07894);
            rule__ListLiteral__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2__0"


    // $ANTLR start "rule__ListLiteral__Group_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3947:1: rule__ListLiteral__Group_2__0__Impl : ( ( rule__ListLiteral__ElemsAssignment_2_0 ) ) ;
    public final void rule__ListLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3951:1: ( ( ( rule__ListLiteral__ElemsAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3952:1: ( ( rule__ListLiteral__ElemsAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3952:1: ( ( rule__ListLiteral__ElemsAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3953:1: ( rule__ListLiteral__ElemsAssignment_2_0 )
            {
             before(grammarAccess.getListLiteralAccess().getElemsAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3954:1: ( rule__ListLiteral__ElemsAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3954:2: rule__ListLiteral__ElemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__ElemsAssignment_2_0_in_rule__ListLiteral__Group_2__0__Impl7921);
            rule__ListLiteral__ElemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getListLiteralAccess().getElemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__ListLiteral__Group_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3964:1: rule__ListLiteral__Group_2__1 : rule__ListLiteral__Group_2__1__Impl ;
    public final void rule__ListLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3968:1: ( rule__ListLiteral__Group_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3969:2: rule__ListLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2__1__Impl_in_rule__ListLiteral__Group_2__17951);
            rule__ListLiteral__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2__1"


    // $ANTLR start "rule__ListLiteral__Group_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3975:1: rule__ListLiteral__Group_2__1__Impl : ( ( rule__ListLiteral__Group_2_1__0 )* ) ;
    public final void rule__ListLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3979:1: ( ( ( rule__ListLiteral__Group_2_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3980:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3980:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3981:1: ( rule__ListLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getListLiteralAccess().getGroup_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3982:1: ( rule__ListLiteral__Group_2_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==16) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3982:2: rule__ListLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__0_in_rule__ListLiteral__Group_2__1__Impl7978);
            	    rule__ListLiteral__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getListLiteralAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__ListLiteral__Group_2_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3996:1: rule__ListLiteral__Group_2_1__0 : rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 ;
    public final void rule__ListLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4000:1: ( rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4001:2: rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__0__Impl_in_rule__ListLiteral__Group_2_1__08013);
            rule__ListLiteral__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__1_in_rule__ListLiteral__Group_2_1__08016);
            rule__ListLiteral__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2_1__0"


    // $ANTLR start "rule__ListLiteral__Group_2_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4008:1: rule__ListLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ListLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4012:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4013:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4013:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4014:1: ','
            {
             before(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_16_in_rule__ListLiteral__Group_2_1__0__Impl8044); 
             after(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2_1__0__Impl"


    // $ANTLR start "rule__ListLiteral__Group_2_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4027:1: rule__ListLiteral__Group_2_1__1 : rule__ListLiteral__Group_2_1__1__Impl ;
    public final void rule__ListLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4031:1: ( rule__ListLiteral__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4032:2: rule__ListLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__1__Impl_in_rule__ListLiteral__Group_2_1__18075);
            rule__ListLiteral__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2_1__1"


    // $ANTLR start "rule__ListLiteral__Group_2_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4038:1: rule__ListLiteral__Group_2_1__1__Impl : ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) ) ;
    public final void rule__ListLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4042:1: ( ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4043:1: ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4043:1: ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4044:1: ( rule__ListLiteral__ElemsAssignment_2_1_1 )
            {
             before(grammarAccess.getListLiteralAccess().getElemsAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4045:1: ( rule__ListLiteral__ElemsAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4045:2: rule__ListLiteral__ElemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ListLiteral__ElemsAssignment_2_1_1_in_rule__ListLiteral__Group_2_1__1__Impl8102);
            rule__ListLiteral__ElemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListLiteralAccess().getElemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2_1__1__Impl"


    // $ANTLR start "rule__SetLiteral__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4059:1: rule__SetLiteral__Group__0 : rule__SetLiteral__Group__0__Impl rule__SetLiteral__Group__1 ;
    public final void rule__SetLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4063:1: ( rule__SetLiteral__Group__0__Impl rule__SetLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4064:2: rule__SetLiteral__Group__0__Impl rule__SetLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__0__Impl_in_rule__SetLiteral__Group__08136);
            rule__SetLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group__1_in_rule__SetLiteral__Group__08139);
            rule__SetLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group__0"


    // $ANTLR start "rule__SetLiteral__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4071:1: rule__SetLiteral__Group__0__Impl : ( ( rule__SetLiteral__TypeConsAssignment_0 ) ) ;
    public final void rule__SetLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4075:1: ( ( ( rule__SetLiteral__TypeConsAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4076:1: ( ( rule__SetLiteral__TypeConsAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4076:1: ( ( rule__SetLiteral__TypeConsAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4077:1: ( rule__SetLiteral__TypeConsAssignment_0 )
            {
             before(grammarAccess.getSetLiteralAccess().getTypeConsAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4078:1: ( rule__SetLiteral__TypeConsAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4078:2: rule__SetLiteral__TypeConsAssignment_0
            {
            pushFollow(FOLLOW_rule__SetLiteral__TypeConsAssignment_0_in_rule__SetLiteral__Group__0__Impl8166);
            rule__SetLiteral__TypeConsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetLiteralAccess().getTypeConsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group__0__Impl"


    // $ANTLR start "rule__SetLiteral__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4088:1: rule__SetLiteral__Group__1 : rule__SetLiteral__Group__1__Impl rule__SetLiteral__Group__2 ;
    public final void rule__SetLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4092:1: ( rule__SetLiteral__Group__1__Impl rule__SetLiteral__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4093:2: rule__SetLiteral__Group__1__Impl rule__SetLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__1__Impl_in_rule__SetLiteral__Group__18196);
            rule__SetLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group__2_in_rule__SetLiteral__Group__18199);
            rule__SetLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group__1"


    // $ANTLR start "rule__SetLiteral__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4100:1: rule__SetLiteral__Group__1__Impl : ( '{' ) ;
    public final void rule__SetLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4104:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4105:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4105:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4106:1: '{'
            {
             before(grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__SetLiteral__Group__1__Impl8227); 
             after(grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group__1__Impl"


    // $ANTLR start "rule__SetLiteral__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4119:1: rule__SetLiteral__Group__2 : rule__SetLiteral__Group__2__Impl rule__SetLiteral__Group__3 ;
    public final void rule__SetLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4123:1: ( rule__SetLiteral__Group__2__Impl rule__SetLiteral__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4124:2: rule__SetLiteral__Group__2__Impl rule__SetLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__2__Impl_in_rule__SetLiteral__Group__28258);
            rule__SetLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group__3_in_rule__SetLiteral__Group__28261);
            rule__SetLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group__2"


    // $ANTLR start "rule__SetLiteral__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4131:1: rule__SetLiteral__Group__2__Impl : ( ( rule__SetLiteral__Group_2__0 )? ) ;
    public final void rule__SetLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4135:1: ( ( ( rule__SetLiteral__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4136:1: ( ( rule__SetLiteral__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4136:1: ( ( rule__SetLiteral__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4137:1: ( rule__SetLiteral__Group_2__0 )?
            {
             before(grammarAccess.getSetLiteralAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4138:1: ( rule__SetLiteral__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_LIT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4138:2: rule__SetLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SetLiteral__Group_2__0_in_rule__SetLiteral__Group__2__Impl8288);
                    rule__SetLiteral__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetLiteralAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group__2__Impl"


    // $ANTLR start "rule__SetLiteral__Group__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4148:1: rule__SetLiteral__Group__3 : rule__SetLiteral__Group__3__Impl ;
    public final void rule__SetLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4152:1: ( rule__SetLiteral__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4153:2: rule__SetLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__3__Impl_in_rule__SetLiteral__Group__38319);
            rule__SetLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group__3"


    // $ANTLR start "rule__SetLiteral__Group__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4159:1: rule__SetLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__SetLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4163:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4164:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4164:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4165:1: '}'
            {
             before(grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__SetLiteral__Group__3__Impl8347); 
             after(grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group__3__Impl"


    // $ANTLR start "rule__SetLiteral__Group_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4186:1: rule__SetLiteral__Group_2__0 : rule__SetLiteral__Group_2__0__Impl rule__SetLiteral__Group_2__1 ;
    public final void rule__SetLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4190:1: ( rule__SetLiteral__Group_2__0__Impl rule__SetLiteral__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4191:2: rule__SetLiteral__Group_2__0__Impl rule__SetLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2__0__Impl_in_rule__SetLiteral__Group_2__08386);
            rule__SetLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group_2__1_in_rule__SetLiteral__Group_2__08389);
            rule__SetLiteral__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group_2__0"


    // $ANTLR start "rule__SetLiteral__Group_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4198:1: rule__SetLiteral__Group_2__0__Impl : ( ( rule__SetLiteral__ElemsAssignment_2_0 ) ) ;
    public final void rule__SetLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4202:1: ( ( ( rule__SetLiteral__ElemsAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4203:1: ( ( rule__SetLiteral__ElemsAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4203:1: ( ( rule__SetLiteral__ElemsAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4204:1: ( rule__SetLiteral__ElemsAssignment_2_0 )
            {
             before(grammarAccess.getSetLiteralAccess().getElemsAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4205:1: ( rule__SetLiteral__ElemsAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4205:2: rule__SetLiteral__ElemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__SetLiteral__ElemsAssignment_2_0_in_rule__SetLiteral__Group_2__0__Impl8416);
            rule__SetLiteral__ElemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSetLiteralAccess().getElemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__SetLiteral__Group_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4215:1: rule__SetLiteral__Group_2__1 : rule__SetLiteral__Group_2__1__Impl ;
    public final void rule__SetLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4219:1: ( rule__SetLiteral__Group_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4220:2: rule__SetLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2__1__Impl_in_rule__SetLiteral__Group_2__18446);
            rule__SetLiteral__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group_2__1"


    // $ANTLR start "rule__SetLiteral__Group_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4226:1: rule__SetLiteral__Group_2__1__Impl : ( ( rule__SetLiteral__Group_2_1__0 )* ) ;
    public final void rule__SetLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4230:1: ( ( ( rule__SetLiteral__Group_2_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4231:1: ( ( rule__SetLiteral__Group_2_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4231:1: ( ( rule__SetLiteral__Group_2_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4232:1: ( rule__SetLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getSetLiteralAccess().getGroup_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4233:1: ( rule__SetLiteral__Group_2_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==16) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4233:2: rule__SetLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__0_in_rule__SetLiteral__Group_2__1__Impl8473);
            	    rule__SetLiteral__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getSetLiteralAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__SetLiteral__Group_2_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4247:1: rule__SetLiteral__Group_2_1__0 : rule__SetLiteral__Group_2_1__0__Impl rule__SetLiteral__Group_2_1__1 ;
    public final void rule__SetLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4251:1: ( rule__SetLiteral__Group_2_1__0__Impl rule__SetLiteral__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4252:2: rule__SetLiteral__Group_2_1__0__Impl rule__SetLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__0__Impl_in_rule__SetLiteral__Group_2_1__08508);
            rule__SetLiteral__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__1_in_rule__SetLiteral__Group_2_1__08511);
            rule__SetLiteral__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group_2_1__0"


    // $ANTLR start "rule__SetLiteral__Group_2_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4259:1: rule__SetLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SetLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4263:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4264:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4264:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4265:1: ','
            {
             before(grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_16_in_rule__SetLiteral__Group_2_1__0__Impl8539); 
             after(grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group_2_1__0__Impl"


    // $ANTLR start "rule__SetLiteral__Group_2_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4278:1: rule__SetLiteral__Group_2_1__1 : rule__SetLiteral__Group_2_1__1__Impl ;
    public final void rule__SetLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4282:1: ( rule__SetLiteral__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4283:2: rule__SetLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__1__Impl_in_rule__SetLiteral__Group_2_1__18570);
            rule__SetLiteral__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group_2_1__1"


    // $ANTLR start "rule__SetLiteral__Group_2_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4289:1: rule__SetLiteral__Group_2_1__1__Impl : ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) ) ;
    public final void rule__SetLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4293:1: ( ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4294:1: ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4294:1: ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4295:1: ( rule__SetLiteral__ElemsAssignment_2_1_1 )
            {
             before(grammarAccess.getSetLiteralAccess().getElemsAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4296:1: ( rule__SetLiteral__ElemsAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4296:2: rule__SetLiteral__ElemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__SetLiteral__ElemsAssignment_2_1_1_in_rule__SetLiteral__Group_2_1__1__Impl8597);
            rule__SetLiteral__ElemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetLiteralAccess().getElemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__Group_2_1__1__Impl"


    // $ANTLR start "rule__OptionLiteral__Group_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4310:1: rule__OptionLiteral__Group_0__0 : rule__OptionLiteral__Group_0__0__Impl rule__OptionLiteral__Group_0__1 ;
    public final void rule__OptionLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4314:1: ( rule__OptionLiteral__Group_0__0__Impl rule__OptionLiteral__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4315:2: rule__OptionLiteral__Group_0__0__Impl rule__OptionLiteral__Group_0__1
            {
            pushFollow(FOLLOW_rule__OptionLiteral__Group_0__0__Impl_in_rule__OptionLiteral__Group_0__08631);
            rule__OptionLiteral__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionLiteral__Group_0__1_in_rule__OptionLiteral__Group_0__08634);
            rule__OptionLiteral__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_0__0"


    // $ANTLR start "rule__OptionLiteral__Group_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4322:1: rule__OptionLiteral__Group_0__0__Impl : ( 'none' ) ;
    public final void rule__OptionLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4326:1: ( ( 'none' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4327:1: ( 'none' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4327:1: ( 'none' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4328:1: 'none'
            {
             before(grammarAccess.getOptionLiteralAccess().getNoneKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__OptionLiteral__Group_0__0__Impl8662); 
             after(grammarAccess.getOptionLiteralAccess().getNoneKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__OptionLiteral__Group_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4341:1: rule__OptionLiteral__Group_0__1 : rule__OptionLiteral__Group_0__1__Impl rule__OptionLiteral__Group_0__2 ;
    public final void rule__OptionLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4345:1: ( rule__OptionLiteral__Group_0__1__Impl rule__OptionLiteral__Group_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4346:2: rule__OptionLiteral__Group_0__1__Impl rule__OptionLiteral__Group_0__2
            {
            pushFollow(FOLLOW_rule__OptionLiteral__Group_0__1__Impl_in_rule__OptionLiteral__Group_0__18693);
            rule__OptionLiteral__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionLiteral__Group_0__2_in_rule__OptionLiteral__Group_0__18696);
            rule__OptionLiteral__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_0__1"


    // $ANTLR start "rule__OptionLiteral__Group_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4353:1: rule__OptionLiteral__Group_0__1__Impl : ( () ) ;
    public final void rule__OptionLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4357:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4358:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4358:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4359:1: ()
            {
             before(grammarAccess.getOptionLiteralAccess().getNoneLiteralAction_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4360:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4362:1: 
            {
            }

             after(grammarAccess.getOptionLiteralAccess().getNoneLiteralAction_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__OptionLiteral__Group_0__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4372:1: rule__OptionLiteral__Group_0__2 : rule__OptionLiteral__Group_0__2__Impl rule__OptionLiteral__Group_0__3 ;
    public final void rule__OptionLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4376:1: ( rule__OptionLiteral__Group_0__2__Impl rule__OptionLiteral__Group_0__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4377:2: rule__OptionLiteral__Group_0__2__Impl rule__OptionLiteral__Group_0__3
            {
            pushFollow(FOLLOW_rule__OptionLiteral__Group_0__2__Impl_in_rule__OptionLiteral__Group_0__28754);
            rule__OptionLiteral__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionLiteral__Group_0__3_in_rule__OptionLiteral__Group_0__28757);
            rule__OptionLiteral__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_0__2"


    // $ANTLR start "rule__OptionLiteral__Group_0__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4384:1: rule__OptionLiteral__Group_0__2__Impl : ( ':' ) ;
    public final void rule__OptionLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4388:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4389:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4389:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4390:1: ':'
            {
             before(grammarAccess.getOptionLiteralAccess().getColonKeyword_0_2()); 
            match(input,21,FOLLOW_21_in_rule__OptionLiteral__Group_0__2__Impl8785); 
             after(grammarAccess.getOptionLiteralAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_0__2__Impl"


    // $ANTLR start "rule__OptionLiteral__Group_0__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4403:1: rule__OptionLiteral__Group_0__3 : rule__OptionLiteral__Group_0__3__Impl ;
    public final void rule__OptionLiteral__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4407:1: ( rule__OptionLiteral__Group_0__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4408:2: rule__OptionLiteral__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__OptionLiteral__Group_0__3__Impl_in_rule__OptionLiteral__Group_0__38816);
            rule__OptionLiteral__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_0__3"


    // $ANTLR start "rule__OptionLiteral__Group_0__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4414:1: rule__OptionLiteral__Group_0__3__Impl : ( ( rule__OptionLiteral__TypeAssignment_0_3 ) ) ;
    public final void rule__OptionLiteral__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4418:1: ( ( ( rule__OptionLiteral__TypeAssignment_0_3 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4419:1: ( ( rule__OptionLiteral__TypeAssignment_0_3 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4419:1: ( ( rule__OptionLiteral__TypeAssignment_0_3 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4420:1: ( rule__OptionLiteral__TypeAssignment_0_3 )
            {
             before(grammarAccess.getOptionLiteralAccess().getTypeAssignment_0_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4421:1: ( rule__OptionLiteral__TypeAssignment_0_3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4421:2: rule__OptionLiteral__TypeAssignment_0_3
            {
            pushFollow(FOLLOW_rule__OptionLiteral__TypeAssignment_0_3_in_rule__OptionLiteral__Group_0__3__Impl8843);
            rule__OptionLiteral__TypeAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionLiteralAccess().getTypeAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_0__3__Impl"


    // $ANTLR start "rule__OptionLiteral__Group_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4439:1: rule__OptionLiteral__Group_1__0 : rule__OptionLiteral__Group_1__0__Impl rule__OptionLiteral__Group_1__1 ;
    public final void rule__OptionLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4443:1: ( rule__OptionLiteral__Group_1__0__Impl rule__OptionLiteral__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4444:2: rule__OptionLiteral__Group_1__0__Impl rule__OptionLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__OptionLiteral__Group_1__0__Impl_in_rule__OptionLiteral__Group_1__08881);
            rule__OptionLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionLiteral__Group_1__1_in_rule__OptionLiteral__Group_1__08884);
            rule__OptionLiteral__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_1__0"


    // $ANTLR start "rule__OptionLiteral__Group_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4451:1: rule__OptionLiteral__Group_1__0__Impl : ( 'some' ) ;
    public final void rule__OptionLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4455:1: ( ( 'some' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4456:1: ( 'some' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4456:1: ( 'some' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4457:1: 'some'
            {
             before(grammarAccess.getOptionLiteralAccess().getSomeKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__OptionLiteral__Group_1__0__Impl8912); 
             after(grammarAccess.getOptionLiteralAccess().getSomeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__OptionLiteral__Group_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4470:1: rule__OptionLiteral__Group_1__1 : rule__OptionLiteral__Group_1__1__Impl rule__OptionLiteral__Group_1__2 ;
    public final void rule__OptionLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4474:1: ( rule__OptionLiteral__Group_1__1__Impl rule__OptionLiteral__Group_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4475:2: rule__OptionLiteral__Group_1__1__Impl rule__OptionLiteral__Group_1__2
            {
            pushFollow(FOLLOW_rule__OptionLiteral__Group_1__1__Impl_in_rule__OptionLiteral__Group_1__18943);
            rule__OptionLiteral__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionLiteral__Group_1__2_in_rule__OptionLiteral__Group_1__18946);
            rule__OptionLiteral__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_1__1"


    // $ANTLR start "rule__OptionLiteral__Group_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4482:1: rule__OptionLiteral__Group_1__1__Impl : ( () ) ;
    public final void rule__OptionLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4486:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4487:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4487:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4488:1: ()
            {
             before(grammarAccess.getOptionLiteralAccess().getSomeLiteralAction_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4489:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4491:1: 
            {
            }

             after(grammarAccess.getOptionLiteralAccess().getSomeLiteralAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__OptionLiteral__Group_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4501:1: rule__OptionLiteral__Group_1__2 : rule__OptionLiteral__Group_1__2__Impl ;
    public final void rule__OptionLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4505:1: ( rule__OptionLiteral__Group_1__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4506:2: rule__OptionLiteral__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OptionLiteral__Group_1__2__Impl_in_rule__OptionLiteral__Group_1__29004);
            rule__OptionLiteral__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_1__2"


    // $ANTLR start "rule__OptionLiteral__Group_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4512:1: rule__OptionLiteral__Group_1__2__Impl : ( ( rule__OptionLiteral__LitAssignment_1_2 ) ) ;
    public final void rule__OptionLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4516:1: ( ( ( rule__OptionLiteral__LitAssignment_1_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4517:1: ( ( rule__OptionLiteral__LitAssignment_1_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4517:1: ( ( rule__OptionLiteral__LitAssignment_1_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4518:1: ( rule__OptionLiteral__LitAssignment_1_2 )
            {
             before(grammarAccess.getOptionLiteralAccess().getLitAssignment_1_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4519:1: ( rule__OptionLiteral__LitAssignment_1_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4519:2: rule__OptionLiteral__LitAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OptionLiteral__LitAssignment_1_2_in_rule__OptionLiteral__Group_1__2__Impl9031);
            rule__OptionLiteral__LitAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOptionLiteralAccess().getLitAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__SubFeaturesDecl__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4535:1: rule__SubFeaturesDecl__Group__0 : rule__SubFeaturesDecl__Group__0__Impl rule__SubFeaturesDecl__Group__1 ;
    public final void rule__SubFeaturesDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4539:1: ( rule__SubFeaturesDecl__Group__0__Impl rule__SubFeaturesDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4540:2: rule__SubFeaturesDecl__Group__0__Impl rule__SubFeaturesDecl__Group__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__0__Impl_in_rule__SubFeaturesDecl__Group__09067);
            rule__SubFeaturesDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__1_in_rule__SubFeaturesDecl__Group__09070);
            rule__SubFeaturesDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__Group__0"


    // $ANTLR start "rule__SubFeaturesDecl__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4547:1: rule__SubFeaturesDecl__Group__0__Impl : ( ( rule__SubFeaturesDecl__Group_0__0 )* ) ;
    public final void rule__SubFeaturesDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4551:1: ( ( ( rule__SubFeaturesDecl__Group_0__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4552:1: ( ( rule__SubFeaturesDecl__Group_0__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4552:1: ( ( rule__SubFeaturesDecl__Group_0__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4553:1: ( rule__SubFeaturesDecl__Group_0__0 )*
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getGroup_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4554:1: ( rule__SubFeaturesDecl__Group_0__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1==23) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4554:2: rule__SubFeaturesDecl__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__SubFeaturesDecl__Group_0__0_in_rule__SubFeaturesDecl__Group__0__Impl9097);
            	    rule__SubFeaturesDecl__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getSubFeaturesDeclAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__Group__0__Impl"


    // $ANTLR start "rule__SubFeaturesDecl__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4564:1: rule__SubFeaturesDecl__Group__1 : rule__SubFeaturesDecl__Group__1__Impl rule__SubFeaturesDecl__Group__2 ;
    public final void rule__SubFeaturesDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4568:1: ( rule__SubFeaturesDecl__Group__1__Impl rule__SubFeaturesDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4569:2: rule__SubFeaturesDecl__Group__1__Impl rule__SubFeaturesDecl__Group__2
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__1__Impl_in_rule__SubFeaturesDecl__Group__19128);
            rule__SubFeaturesDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__2_in_rule__SubFeaturesDecl__Group__19131);
            rule__SubFeaturesDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__Group__1"


    // $ANTLR start "rule__SubFeaturesDecl__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4576:1: rule__SubFeaturesDecl__Group__1__Impl : ( ( rule__SubFeaturesDecl__NameAssignment_1 ) ) ;
    public final void rule__SubFeaturesDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4580:1: ( ( ( rule__SubFeaturesDecl__NameAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4581:1: ( ( rule__SubFeaturesDecl__NameAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4581:1: ( ( rule__SubFeaturesDecl__NameAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4582:1: ( rule__SubFeaturesDecl__NameAssignment_1 )
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getNameAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4583:1: ( rule__SubFeaturesDecl__NameAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4583:2: rule__SubFeaturesDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__NameAssignment_1_in_rule__SubFeaturesDecl__Group__1__Impl9158);
            rule__SubFeaturesDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__Group__1__Impl"


    // $ANTLR start "rule__SubFeaturesDecl__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4593:1: rule__SubFeaturesDecl__Group__2 : rule__SubFeaturesDecl__Group__2__Impl ;
    public final void rule__SubFeaturesDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4597:1: ( rule__SubFeaturesDecl__Group__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4598:2: rule__SubFeaturesDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__2__Impl_in_rule__SubFeaturesDecl__Group__29188);
            rule__SubFeaturesDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__Group__2"


    // $ANTLR start "rule__SubFeaturesDecl__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4604:1: rule__SubFeaturesDecl__Group__2__Impl : ( ( rule__SubFeaturesDecl__TypeAssignment_2 ) ) ;
    public final void rule__SubFeaturesDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4608:1: ( ( ( rule__SubFeaturesDecl__TypeAssignment_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4609:1: ( ( rule__SubFeaturesDecl__TypeAssignment_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4609:1: ( ( rule__SubFeaturesDecl__TypeAssignment_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4610:1: ( rule__SubFeaturesDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getTypeAssignment_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4611:1: ( rule__SubFeaturesDecl__TypeAssignment_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4611:2: rule__SubFeaturesDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__TypeAssignment_2_in_rule__SubFeaturesDecl__Group__2__Impl9215);
            rule__SubFeaturesDecl__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesDeclAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__Group__2__Impl"


    // $ANTLR start "rule__SubFeaturesDecl__Group_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4627:1: rule__SubFeaturesDecl__Group_0__0 : rule__SubFeaturesDecl__Group_0__0__Impl rule__SubFeaturesDecl__Group_0__1 ;
    public final void rule__SubFeaturesDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4631:1: ( rule__SubFeaturesDecl__Group_0__0__Impl rule__SubFeaturesDecl__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4632:2: rule__SubFeaturesDecl__Group_0__0__Impl rule__SubFeaturesDecl__Group_0__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group_0__0__Impl_in_rule__SubFeaturesDecl__Group_0__09251);
            rule__SubFeaturesDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group_0__1_in_rule__SubFeaturesDecl__Group_0__09254);
            rule__SubFeaturesDecl__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__Group_0__0"


    // $ANTLR start "rule__SubFeaturesDecl__Group_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4639:1: rule__SubFeaturesDecl__Group_0__0__Impl : ( ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 ) ) ;
    public final void rule__SubFeaturesDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4643:1: ( ( ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4644:1: ( ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4644:1: ( ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4645:1: ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 )
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getCategoryNamesAssignment_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4646:1: ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4646:2: rule__SubFeaturesDecl__CategoryNamesAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__CategoryNamesAssignment_0_0_in_rule__SubFeaturesDecl__Group_0__0__Impl9281);
            rule__SubFeaturesDecl__CategoryNamesAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesDeclAccess().getCategoryNamesAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__Group_0__0__Impl"


    // $ANTLR start "rule__SubFeaturesDecl__Group_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4656:1: rule__SubFeaturesDecl__Group_0__1 : rule__SubFeaturesDecl__Group_0__1__Impl ;
    public final void rule__SubFeaturesDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4660:1: ( rule__SubFeaturesDecl__Group_0__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4661:2: rule__SubFeaturesDecl__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group_0__1__Impl_in_rule__SubFeaturesDecl__Group_0__19311);
            rule__SubFeaturesDecl__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__Group_0__1"


    // $ANTLR start "rule__SubFeaturesDecl__Group_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4667:1: rule__SubFeaturesDecl__Group_0__1__Impl : ( '.' ) ;
    public final void rule__SubFeaturesDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4671:1: ( ( '.' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4672:1: ( '.' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4672:1: ( '.' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4673:1: '.'
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getFullStopKeyword_0_1()); 
            match(input,23,FOLLOW_23_in_rule__SubFeaturesDecl__Group_0__1__Impl9339); 
             after(grammarAccess.getSubFeaturesDeclAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__Group_0__1__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4690:1: rule__SubFeaturesType__Group_0__0 : rule__SubFeaturesType__Group_0__0__Impl rule__SubFeaturesType__Group_0__1 ;
    public final void rule__SubFeaturesType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4694:1: ( rule__SubFeaturesType__Group_0__0__Impl rule__SubFeaturesType__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4695:2: rule__SubFeaturesType__Group_0__0__Impl rule__SubFeaturesType__Group_0__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__0__Impl_in_rule__SubFeaturesType__Group_0__09374);
            rule__SubFeaturesType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__1_in_rule__SubFeaturesType__Group_0__09377);
            rule__SubFeaturesType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_0__0"


    // $ANTLR start "rule__SubFeaturesType__Group_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4702:1: rule__SubFeaturesType__Group_0__0__Impl : ( ':' ) ;
    public final void rule__SubFeaturesType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4706:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4707:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4707:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4708:1: ':'
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getColonKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__SubFeaturesType__Group_0__0__Impl9405); 
             after(grammarAccess.getSubFeaturesTypeAccess().getColonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_0__0__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4721:1: rule__SubFeaturesType__Group_0__1 : rule__SubFeaturesType__Group_0__1__Impl rule__SubFeaturesType__Group_0__2 ;
    public final void rule__SubFeaturesType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4725:1: ( rule__SubFeaturesType__Group_0__1__Impl rule__SubFeaturesType__Group_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4726:2: rule__SubFeaturesType__Group_0__1__Impl rule__SubFeaturesType__Group_0__2
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__1__Impl_in_rule__SubFeaturesType__Group_0__19436);
            rule__SubFeaturesType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__2_in_rule__SubFeaturesType__Group_0__19439);
            rule__SubFeaturesType__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_0__1"


    // $ANTLR start "rule__SubFeaturesType__Group_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4733:1: rule__SubFeaturesType__Group_0__1__Impl : ( () ) ;
    public final void rule__SubFeaturesType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4737:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4738:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4738:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4739:1: ()
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSubGroupTypeRefAction_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4740:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4742:1: 
            {
            }

             after(grammarAccess.getSubFeaturesTypeAccess().getSubGroupTypeRefAction_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_0__1__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_0__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4752:1: rule__SubFeaturesType__Group_0__2 : rule__SubFeaturesType__Group_0__2__Impl ;
    public final void rule__SubFeaturesType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4756:1: ( rule__SubFeaturesType__Group_0__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4757:2: rule__SubFeaturesType__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__2__Impl_in_rule__SubFeaturesType__Group_0__29497);
            rule__SubFeaturesType__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_0__2"


    // $ANTLR start "rule__SubFeaturesType__Group_0__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4763:1: rule__SubFeaturesType__Group_0__2__Impl : ( ( rule__SubFeaturesType__TypeAssignment_0_2 ) ) ;
    public final void rule__SubFeaturesType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4767:1: ( ( ( rule__SubFeaturesType__TypeAssignment_0_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4768:1: ( ( rule__SubFeaturesType__TypeAssignment_0_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4768:1: ( ( rule__SubFeaturesType__TypeAssignment_0_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4769:1: ( rule__SubFeaturesType__TypeAssignment_0_2 )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getTypeAssignment_0_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4770:1: ( rule__SubFeaturesType__TypeAssignment_0_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4770:2: rule__SubFeaturesType__TypeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__TypeAssignment_0_2_in_rule__SubFeaturesType__Group_0__2__Impl9524);
            rule__SubFeaturesType__TypeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesTypeAccess().getTypeAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_0__2__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4786:1: rule__SubFeaturesType__Group_1__0 : rule__SubFeaturesType__Group_1__0__Impl rule__SubFeaturesType__Group_1__1 ;
    public final void rule__SubFeaturesType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4790:1: ( rule__SubFeaturesType__Group_1__0__Impl rule__SubFeaturesType__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4791:2: rule__SubFeaturesType__Group_1__0__Impl rule__SubFeaturesType__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__0__Impl_in_rule__SubFeaturesType__Group_1__09560);
            rule__SubFeaturesType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__1_in_rule__SubFeaturesType__Group_1__09563);
            rule__SubFeaturesType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1__0"


    // $ANTLR start "rule__SubFeaturesType__Group_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4798:1: rule__SubFeaturesType__Group_1__0__Impl : ( () ) ;
    public final void rule__SubFeaturesType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4802:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4803:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4803:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4804:1: ()
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSubGroupTypeAnonAction_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4805:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4807:1: 
            {
            }

             after(grammarAccess.getSubFeaturesTypeAccess().getSubGroupTypeAnonAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1__0__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4817:1: rule__SubFeaturesType__Group_1__1 : rule__SubFeaturesType__Group_1__1__Impl rule__SubFeaturesType__Group_1__2 ;
    public final void rule__SubFeaturesType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4821:1: ( rule__SubFeaturesType__Group_1__1__Impl rule__SubFeaturesType__Group_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4822:2: rule__SubFeaturesType__Group_1__1__Impl rule__SubFeaturesType__Group_1__2
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__1__Impl_in_rule__SubFeaturesType__Group_1__19621);
            rule__SubFeaturesType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__2_in_rule__SubFeaturesType__Group_1__19624);
            rule__SubFeaturesType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1__1"


    // $ANTLR start "rule__SubFeaturesType__Group_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4829:1: rule__SubFeaturesType__Group_1__1__Impl : ( ( rule__SubFeaturesType__Group_1_1__0 )? ) ;
    public final void rule__SubFeaturesType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4833:1: ( ( ( rule__SubFeaturesType__Group_1_1__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4834:1: ( ( rule__SubFeaturesType__Group_1_1__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4834:1: ( ( rule__SubFeaturesType__Group_1_1__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4835:1: ( rule__SubFeaturesType__Group_1_1__0 )?
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getGroup_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4836:1: ( rule__SubFeaturesType__Group_1_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4836:2: rule__SubFeaturesType__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__0_in_rule__SubFeaturesType__Group_1__1__Impl9651);
                    rule__SubFeaturesType__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubFeaturesTypeAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1__1__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4846:1: rule__SubFeaturesType__Group_1__2 : rule__SubFeaturesType__Group_1__2__Impl rule__SubFeaturesType__Group_1__3 ;
    public final void rule__SubFeaturesType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4850:1: ( rule__SubFeaturesType__Group_1__2__Impl rule__SubFeaturesType__Group_1__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4851:2: rule__SubFeaturesType__Group_1__2__Impl rule__SubFeaturesType__Group_1__3
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__2__Impl_in_rule__SubFeaturesType__Group_1__29682);
            rule__SubFeaturesType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__3_in_rule__SubFeaturesType__Group_1__29685);
            rule__SubFeaturesType__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1__2"


    // $ANTLR start "rule__SubFeaturesType__Group_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4858:1: rule__SubFeaturesType__Group_1__2__Impl : ( '=' ) ;
    public final void rule__SubFeaturesType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4862:1: ( ( '=' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4863:1: ( '=' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4863:1: ( '=' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4864:1: '='
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getEqualsSignKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__SubFeaturesType__Group_1__2__Impl9713); 
             after(grammarAccess.getSubFeaturesTypeAccess().getEqualsSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1__2__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_1__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4877:1: rule__SubFeaturesType__Group_1__3 : rule__SubFeaturesType__Group_1__3__Impl ;
    public final void rule__SubFeaturesType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4881:1: ( rule__SubFeaturesType__Group_1__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4882:2: rule__SubFeaturesType__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__3__Impl_in_rule__SubFeaturesType__Group_1__39744);
            rule__SubFeaturesType__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1__3"


    // $ANTLR start "rule__SubFeaturesType__Group_1__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4888:1: rule__SubFeaturesType__Group_1__3__Impl : ( ( rule__SubFeaturesType__BodyAssignment_1_3 ) ) ;
    public final void rule__SubFeaturesType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4892:1: ( ( ( rule__SubFeaturesType__BodyAssignment_1_3 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4893:1: ( ( rule__SubFeaturesType__BodyAssignment_1_3 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4893:1: ( ( rule__SubFeaturesType__BodyAssignment_1_3 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4894:1: ( rule__SubFeaturesType__BodyAssignment_1_3 )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getBodyAssignment_1_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4895:1: ( rule__SubFeaturesType__BodyAssignment_1_3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4895:2: rule__SubFeaturesType__BodyAssignment_1_3
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__BodyAssignment_1_3_in_rule__SubFeaturesType__Group_1__3__Impl9771);
            rule__SubFeaturesType__BodyAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesTypeAccess().getBodyAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1__3__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_1_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4913:1: rule__SubFeaturesType__Group_1_1__0 : rule__SubFeaturesType__Group_1_1__0__Impl rule__SubFeaturesType__Group_1_1__1 ;
    public final void rule__SubFeaturesType__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4917:1: ( rule__SubFeaturesType__Group_1_1__0__Impl rule__SubFeaturesType__Group_1_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4918:2: rule__SubFeaturesType__Group_1_1__0__Impl rule__SubFeaturesType__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__0__Impl_in_rule__SubFeaturesType__Group_1_1__09809);
            rule__SubFeaturesType__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__1_in_rule__SubFeaturesType__Group_1_1__09812);
            rule__SubFeaturesType__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1_1__0"


    // $ANTLR start "rule__SubFeaturesType__Group_1_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4925:1: rule__SubFeaturesType__Group_1_1__0__Impl : ( 'include' ) ;
    public final void rule__SubFeaturesType__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4929:1: ( ( 'include' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4930:1: ( 'include' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4930:1: ( 'include' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4931:1: 'include'
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getIncludeKeyword_1_1_0()); 
            match(input,15,FOLLOW_15_in_rule__SubFeaturesType__Group_1_1__0__Impl9840); 
             after(grammarAccess.getSubFeaturesTypeAccess().getIncludeKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1_1__0__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_1_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4944:1: rule__SubFeaturesType__Group_1_1__1 : rule__SubFeaturesType__Group_1_1__1__Impl rule__SubFeaturesType__Group_1_1__2 ;
    public final void rule__SubFeaturesType__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4948:1: ( rule__SubFeaturesType__Group_1_1__1__Impl rule__SubFeaturesType__Group_1_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4949:2: rule__SubFeaturesType__Group_1_1__1__Impl rule__SubFeaturesType__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__1__Impl_in_rule__SubFeaturesType__Group_1_1__19871);
            rule__SubFeaturesType__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__2_in_rule__SubFeaturesType__Group_1_1__19874);
            rule__SubFeaturesType__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1_1__1"


    // $ANTLR start "rule__SubFeaturesType__Group_1_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4956:1: rule__SubFeaturesType__Group_1_1__1__Impl : ( ( rule__SubFeaturesType__SupersAssignment_1_1_1 ) ) ;
    public final void rule__SubFeaturesType__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4960:1: ( ( ( rule__SubFeaturesType__SupersAssignment_1_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4961:1: ( ( rule__SubFeaturesType__SupersAssignment_1_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4961:1: ( ( rule__SubFeaturesType__SupersAssignment_1_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4962:1: ( rule__SubFeaturesType__SupersAssignment_1_1_1 )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersAssignment_1_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4963:1: ( rule__SubFeaturesType__SupersAssignment_1_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4963:2: rule__SubFeaturesType__SupersAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__SupersAssignment_1_1_1_in_rule__SubFeaturesType__Group_1_1__1__Impl9901);
            rule__SubFeaturesType__SupersAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesTypeAccess().getSupersAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1_1__1__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_1_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4973:1: rule__SubFeaturesType__Group_1_1__2 : rule__SubFeaturesType__Group_1_1__2__Impl ;
    public final void rule__SubFeaturesType__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4977:1: ( rule__SubFeaturesType__Group_1_1__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4978:2: rule__SubFeaturesType__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__2__Impl_in_rule__SubFeaturesType__Group_1_1__29931);
            rule__SubFeaturesType__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1_1__2"


    // $ANTLR start "rule__SubFeaturesType__Group_1_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4984:1: rule__SubFeaturesType__Group_1_1__2__Impl : ( ( rule__SubFeaturesType__Group_1_1_2__0 )* ) ;
    public final void rule__SubFeaturesType__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4988:1: ( ( ( rule__SubFeaturesType__Group_1_1_2__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4989:1: ( ( rule__SubFeaturesType__Group_1_1_2__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4989:1: ( ( rule__SubFeaturesType__Group_1_1_2__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4990:1: ( rule__SubFeaturesType__Group_1_1_2__0 )*
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getGroup_1_1_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4991:1: ( rule__SubFeaturesType__Group_1_1_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==16) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4991:2: rule__SubFeaturesType__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1_2__0_in_rule__SubFeaturesType__Group_1_1__2__Impl9958);
            	    rule__SubFeaturesType__Group_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getSubFeaturesTypeAccess().getGroup_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1_1__2__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_1_1_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5007:1: rule__SubFeaturesType__Group_1_1_2__0 : rule__SubFeaturesType__Group_1_1_2__0__Impl rule__SubFeaturesType__Group_1_1_2__1 ;
    public final void rule__SubFeaturesType__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5011:1: ( rule__SubFeaturesType__Group_1_1_2__0__Impl rule__SubFeaturesType__Group_1_1_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5012:2: rule__SubFeaturesType__Group_1_1_2__0__Impl rule__SubFeaturesType__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1_2__0__Impl_in_rule__SubFeaturesType__Group_1_1_2__09995);
            rule__SubFeaturesType__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1_2__1_in_rule__SubFeaturesType__Group_1_1_2__09998);
            rule__SubFeaturesType__Group_1_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1_1_2__0"


    // $ANTLR start "rule__SubFeaturesType__Group_1_1_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5019:1: rule__SubFeaturesType__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__SubFeaturesType__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5023:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5024:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5024:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5025:1: ','
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getCommaKeyword_1_1_2_0()); 
            match(input,16,FOLLOW_16_in_rule__SubFeaturesType__Group_1_1_2__0__Impl10026); 
             after(grammarAccess.getSubFeaturesTypeAccess().getCommaKeyword_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__SubFeaturesType__Group_1_1_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5038:1: rule__SubFeaturesType__Group_1_1_2__1 : rule__SubFeaturesType__Group_1_1_2__1__Impl ;
    public final void rule__SubFeaturesType__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5042:1: ( rule__SubFeaturesType__Group_1_1_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5043:2: rule__SubFeaturesType__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1_2__1__Impl_in_rule__SubFeaturesType__Group_1_1_2__110057);
            rule__SubFeaturesType__Group_1_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1_1_2__1"


    // $ANTLR start "rule__SubFeaturesType__Group_1_1_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5049:1: rule__SubFeaturesType__Group_1_1_2__1__Impl : ( ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 ) ) ;
    public final void rule__SubFeaturesType__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5053:1: ( ( ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5054:1: ( ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5054:1: ( ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5055:1: ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersAssignment_1_1_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5056:1: ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5056:2: rule__SubFeaturesType__SupersAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__SupersAssignment_1_1_2_1_in_rule__SubFeaturesType__Group_1_1_2__1__Impl10084);
            rule__SubFeaturesType__SupersAssignment_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesTypeAccess().getSupersAssignment_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__Model__DeclsAssignment"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5071:1: rule__Model__DeclsAssignment : ( ruleDecl ) ;
    public final void rule__Model__DeclsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5075:1: ( ( ruleDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5076:1: ( ruleDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5076:1: ( ruleDecl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5077:1: ruleDecl
            {
             before(grammarAccess.getModelAccess().getDeclsDeclParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDecl_in_rule__Model__DeclsAssignment10123);
            ruleDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclsDeclParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclsAssignment"


    // $ANTLR start "rule__TypeDecl__NameAssignment_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5086:1: rule__TypeDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5090:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5091:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5091:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5092:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__NameAssignment_110154); 
             after(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__NameAssignment_1"


    // $ANTLR start "rule__TypeDecl__SupersAssignment_2_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5101:1: rule__TypeDecl__SupersAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDecl__SupersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5105:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5106:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5106:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5107:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeDeclAccess().getSupersTypeDeclCrossReference_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5108:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5109:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getSupersTypeDeclIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__SupersAssignment_2_110189); 
             after(grammarAccess.getTypeDeclAccess().getSupersTypeDeclIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTypeDeclAccess().getSupersTypeDeclCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__SupersAssignment_2_1"


    // $ANTLR start "rule__TypeDecl__SupersAssignment_2_2_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5120:1: rule__TypeDecl__SupersAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDecl__SupersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5124:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5125:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5125:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5126:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeDeclAccess().getSupersTypeDeclCrossReference_2_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5127:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5128:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getSupersTypeDeclIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__SupersAssignment_2_2_110228); 
             after(grammarAccess.getTypeDeclAccess().getSupersTypeDeclIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getTypeDeclAccess().getSupersTypeDeclCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__SupersAssignment_2_2_1"


    // $ANTLR start "rule__TypeDecl__ElemsAssignment_3_1_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5139:1: rule__TypeDecl__ElemsAssignment_3_1_0 : ( ruleELiteral ) ;
    public final void rule__TypeDecl__ElemsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5143:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5144:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5144:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5145:1: ruleELiteral
            {
             before(grammarAccess.getTypeDeclAccess().getElemsELiteralParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__TypeDecl__ElemsAssignment_3_1_010263);
            ruleELiteral();

            state._fsp--;

             after(grammarAccess.getTypeDeclAccess().getElemsELiteralParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__ElemsAssignment_3_1_0"


    // $ANTLR start "rule__TypeDecl__ElemsAssignment_3_1_1_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5154:1: rule__TypeDecl__ElemsAssignment_3_1_1_1 : ( ruleELiteral ) ;
    public final void rule__TypeDecl__ElemsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5158:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5159:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5159:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5160:1: ruleELiteral
            {
             before(grammarAccess.getTypeDeclAccess().getElemsELiteralParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__TypeDecl__ElemsAssignment_3_1_1_110294);
            ruleELiteral();

            state._fsp--;

             after(grammarAccess.getTypeDeclAccess().getElemsELiteralParserRuleCall_3_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__ElemsAssignment_3_1_1_1"


    // $ANTLR start "rule__FeaturesDecl__CompleteAssignment_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5169:1: rule__FeaturesDecl__CompleteAssignment_0 : ( ( 'complete' ) ) ;
    public final void rule__FeaturesDecl__CompleteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5173:1: ( ( ( 'complete' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5174:1: ( ( 'complete' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5174:1: ( ( 'complete' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5175:1: ( 'complete' )
            {
             before(grammarAccess.getFeaturesDeclAccess().getCompleteCompleteKeyword_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5176:1: ( 'complete' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5177:1: 'complete'
            {
             before(grammarAccess.getFeaturesDeclAccess().getCompleteCompleteKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__FeaturesDecl__CompleteAssignment_010330); 
             after(grammarAccess.getFeaturesDeclAccess().getCompleteCompleteKeyword_0_0()); 

            }

             after(grammarAccess.getFeaturesDeclAccess().getCompleteCompleteKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__CompleteAssignment_0"


    // $ANTLR start "rule__FeaturesDecl__NameAssignment_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5192:1: rule__FeaturesDecl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FeaturesDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5196:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5197:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5197:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5198:1: RULE_ID
            {
             before(grammarAccess.getFeaturesDeclAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeaturesDecl__NameAssignment_210369); 
             after(grammarAccess.getFeaturesDeclAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__NameAssignment_2"


    // $ANTLR start "rule__FeaturesDecl__SupersAssignment_3_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5207:1: rule__FeaturesDecl__SupersAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeaturesDecl__SupersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5211:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5212:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5212:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5213:1: ( RULE_ID )
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclCrossReference_3_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5214:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5215:1: RULE_ID
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeaturesDecl__SupersAssignment_3_110404); 
             after(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__SupersAssignment_3_1"


    // $ANTLR start "rule__FeaturesDecl__SupersAssignment_3_2_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5226:1: rule__FeaturesDecl__SupersAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeaturesDecl__SupersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5230:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5231:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5231:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5232:1: ( RULE_ID )
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclCrossReference_3_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5233:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5234:1: RULE_ID
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeaturesDecl__SupersAssignment_3_2_110443); 
             after(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__SupersAssignment_3_2_1"


    // $ANTLR start "rule__FeaturesDecl__BodyAssignment_4"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5245:1: rule__FeaturesDecl__BodyAssignment_4 : ( ruleFeaturesBody ) ;
    public final void rule__FeaturesDecl__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5249:1: ( ( ruleFeaturesBody ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5250:1: ( ruleFeaturesBody )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5250:1: ( ruleFeaturesBody )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5251:1: ruleFeaturesBody
            {
             before(grammarAccess.getFeaturesDeclAccess().getBodyFeaturesBodyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeaturesBody_in_rule__FeaturesDecl__BodyAssignment_410478);
            ruleFeaturesBody();

            state._fsp--;

             after(grammarAccess.getFeaturesDeclAccess().getBodyFeaturesBodyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesDecl__BodyAssignment_4"


    // $ANTLR start "rule__FeaturesBody__FeaturesAssignment_1_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5260:1: rule__FeaturesBody__FeaturesAssignment_1_1 : ( ruleFeatureDecl ) ;
    public final void rule__FeaturesBody__FeaturesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5264:1: ( ( ruleFeatureDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5265:1: ( ruleFeatureDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5265:1: ( ruleFeatureDecl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5266:1: ruleFeatureDecl
            {
             before(grammarAccess.getFeaturesBodyAccess().getFeaturesFeatureDeclParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFeatureDecl_in_rule__FeaturesBody__FeaturesAssignment_1_110509);
            ruleFeatureDecl();

            state._fsp--;

             after(grammarAccess.getFeaturesBodyAccess().getFeaturesFeatureDeclParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__FeaturesAssignment_1_1"


    // $ANTLR start "rule__MultiplicityInvariantDecl__InvNameAssignment_1_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5275:1: rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__MultiplicityInvariantDecl__InvNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5279:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5280:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5280:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5281:1: RULE_ID
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getInvNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultiplicityInvariantDecl__InvNameAssignment_1_010540); 
             after(grammarAccess.getMultiplicityInvariantDeclAccess().getInvNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__InvNameAssignment_1_0"


    // $ANTLR start "rule__MultiplicityInvariantDecl__LoAssignment_2_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5290:1: rule__MultiplicityInvariantDecl__LoAssignment_2_0 : ( ruleConstraintNat ) ;
    public final void rule__MultiplicityInvariantDecl__LoAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5294:1: ( ( ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5295:1: ( ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5295:1: ( ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5296:1: ruleConstraintNat
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getLoConstraintNatParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_rule__MultiplicityInvariantDecl__LoAssignment_2_010571);
            ruleConstraintNat();

            state._fsp--;

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getLoConstraintNatParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__LoAssignment_2_0"


    // $ANTLR start "rule__MultiplicityInvariantDecl__HiAssignment_2_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5305:1: rule__MultiplicityInvariantDecl__HiAssignment_2_2 : ( ruleConstraintNat ) ;
    public final void rule__MultiplicityInvariantDecl__HiAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5309:1: ( ( ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5310:1: ( ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5310:1: ( ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5311:1: ruleConstraintNat
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getHiConstraintNatParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_rule__MultiplicityInvariantDecl__HiAssignment_2_210602);
            ruleConstraintNat();

            state._fsp--;

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getHiConstraintNatParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__HiAssignment_2_2"


    // $ANTLR start "rule__MultiplicityInvariantDecl__MatchAssignment_3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5320:1: rule__MultiplicityInvariantDecl__MatchAssignment_3 : ( ruleSubFeaturesMatch ) ;
    public final void rule__MultiplicityInvariantDecl__MatchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5324:1: ( ( ruleSubFeaturesMatch ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5325:1: ( ruleSubFeaturesMatch )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5325:1: ( ruleSubFeaturesMatch )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5326:1: ruleSubFeaturesMatch
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchSubFeaturesMatchParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSubFeaturesMatch_in_rule__MultiplicityInvariantDecl__MatchAssignment_310633);
            ruleSubFeaturesMatch();

            state._fsp--;

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchSubFeaturesMatchParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__MatchAssignment_3"


    // $ANTLR start "rule__MultiplicityInvariantDecl__TypeAssignment_4_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5335:1: rule__MultiplicityInvariantDecl__TypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__MultiplicityInvariantDecl__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5339:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5340:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5340:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5341:1: ( RULE_ID )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeFeaturesDeclCrossReference_4_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5342:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5343:1: RULE_ID
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeFeaturesDeclIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultiplicityInvariantDecl__TypeAssignment_4_110668); 
             after(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeFeaturesDeclIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeFeaturesDeclCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityInvariantDecl__TypeAssignment_4_1"


    // $ANTLR start "rule__SubFeaturesMatch__DistinctAssignment_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5354:1: rule__SubFeaturesMatch__DistinctAssignment_1 : ( ( 'distinct' ) ) ;
    public final void rule__SubFeaturesMatch__DistinctAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5358:1: ( ( ( 'distinct' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5359:1: ( ( 'distinct' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5359:1: ( ( 'distinct' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5360:1: ( 'distinct' )
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getDistinctDistinctKeyword_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5361:1: ( 'distinct' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5362:1: 'distinct'
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getDistinctDistinctKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__SubFeaturesMatch__DistinctAssignment_110708); 
             after(grammarAccess.getSubFeaturesMatchAccess().getDistinctDistinctKeyword_1_0()); 

            }

             after(grammarAccess.getSubFeaturesMatchAccess().getDistinctDistinctKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__DistinctAssignment_1"


    // $ANTLR start "rule__SubFeaturesMatch__CategoryNamesAssignment_2_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5377:1: rule__SubFeaturesMatch__CategoryNamesAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__SubFeaturesMatch__CategoryNamesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5381:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5382:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5382:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5383:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getCategoryNamesIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesMatch__CategoryNamesAssignment_2_010747); 
             after(grammarAccess.getSubFeaturesMatchAccess().getCategoryNamesIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__CategoryNamesAssignment_2_0"


    // $ANTLR start "rule__SubFeaturesMatch__NameAssignment_3_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5392:1: rule__SubFeaturesMatch__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__SubFeaturesMatch__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5396:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5397:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5397:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5398:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesMatch__NameAssignment_3_010778); 
             after(grammarAccess.getSubFeaturesMatchAccess().getNameIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__NameAssignment_3_0"


    // $ANTLR start "rule__SubFeaturesMatch__AnyAssignment_3_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5407:1: rule__SubFeaturesMatch__AnyAssignment_3_1 : ( ( '*' ) ) ;
    public final void rule__SubFeaturesMatch__AnyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5411:1: ( ( ( '*' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5412:1: ( ( '*' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5412:1: ( ( '*' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5413:1: ( '*' )
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getAnyAsteriskKeyword_3_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5414:1: ( '*' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5415:1: '*'
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getAnyAsteriskKeyword_3_1_0()); 
            match(input,24,FOLLOW_24_in_rule__SubFeaturesMatch__AnyAssignment_3_110814); 
             after(grammarAccess.getSubFeaturesMatchAccess().getAnyAsteriskKeyword_3_1_0()); 

            }

             after(grammarAccess.getSubFeaturesMatchAccess().getAnyAsteriskKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesMatch__AnyAssignment_3_1"


    // $ANTLR start "rule__ConstraintNat__NumAssignment_0_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5430:1: rule__ConstraintNat__NumAssignment_0_1 : ( RULE_NAT ) ;
    public final void rule__ConstraintNat__NumAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5434:1: ( ( RULE_NAT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5435:1: ( RULE_NAT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5435:1: ( RULE_NAT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5436:1: RULE_NAT
            {
             before(grammarAccess.getConstraintNatAccess().getNumNATTerminalRuleCall_0_1_0()); 
            match(input,RULE_NAT,FOLLOW_RULE_NAT_in_rule__ConstraintNat__NumAssignment_0_110853); 
             after(grammarAccess.getConstraintNatAccess().getNumNATTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintNat__NumAssignment_0_1"


    // $ANTLR start "rule__AttrDecl__ModifierAssignment_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5445:1: rule__AttrDecl__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__AttrDecl__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5449:1: ( ( ruleModifier ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5450:1: ( ruleModifier )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5450:1: ( ruleModifier )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5451:1: ruleModifier
            {
             before(grammarAccess.getAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__AttrDecl__ModifierAssignment_010884);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__ModifierAssignment_0"


    // $ANTLR start "rule__AttrDecl__AttributeNameAssignment_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5460:1: rule__AttrDecl__AttributeNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttrDecl__AttributeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5464:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5465:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5465:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5466:1: RULE_ID
            {
             before(grammarAccess.getAttrDeclAccess().getAttributeNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttrDecl__AttributeNameAssignment_110915); 
             after(grammarAccess.getAttrDeclAccess().getAttributeNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__AttributeNameAssignment_1"


    // $ANTLR start "rule__AttrDecl__TypeAssignment_2_0_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5475:1: rule__AttrDecl__TypeAssignment_2_0_1 : ( ruleType ) ;
    public final void rule__AttrDecl__TypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5479:1: ( ( ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5480:1: ( ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5480:1: ( ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5481:1: ruleType
            {
             before(grammarAccess.getAttrDeclAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__AttrDecl__TypeAssignment_2_0_110946);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttrDeclAccess().getTypeTypeParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__TypeAssignment_2_0_1"


    // $ANTLR start "rule__AttrDecl__LiteralAssignment_2_1_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5490:1: rule__AttrDecl__LiteralAssignment_2_1_1 : ( ruleLiteral ) ;
    public final void rule__AttrDecl__LiteralAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5494:1: ( ( ruleLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5495:1: ( ruleLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5495:1: ( ruleLiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5496:1: ruleLiteral
            {
             before(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__AttrDecl__LiteralAssignment_2_1_110977);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrDecl__LiteralAssignment_2_1_1"


    // $ANTLR start "rule__Type__BaseTypeAssignment_0_0_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5505:1: rule__Type__BaseTypeAssignment_0_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__BaseTypeAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5509:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5510:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5510:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5511:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getBaseTypeTypeDeclCrossReference_0_0_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5512:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5513:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__BaseTypeAssignment_0_0_111012); 
             after(grammarAccess.getTypeAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_0_1_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getBaseTypeTypeDeclCrossReference_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__BaseTypeAssignment_0_0_1"


    // $ANTLR start "rule__Type__ElemTypesAssignment_0_1_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5524:1: rule__Type__ElemTypesAssignment_0_1_2 : ( ruleType ) ;
    public final void rule__Type__ElemTypesAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5528:1: ( ( ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5529:1: ( ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5529:1: ( ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5530:1: ruleType
            {
             before(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_0_1_211047);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ElemTypesAssignment_0_1_2"


    // $ANTLR start "rule__Type__ElemTypesAssignment_0_1_3_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5539:1: rule__Type__ElemTypesAssignment_0_1_3_1 : ( ruleType ) ;
    public final void rule__Type__ElemTypesAssignment_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5543:1: ( ( ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5544:1: ( ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5544:1: ( ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5545:1: ruleType
            {
             before(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_0_1_3_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_0_1_3_111078);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_0_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ElemTypesAssignment_0_1_3_1"


    // $ANTLR start "rule__BasicLiteral__TypeConsAssignment_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5554:1: rule__BasicLiteral__TypeConsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BasicLiteral__TypeConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5558:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5559:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5559:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5560:1: ( RULE_ID )
            {
             before(grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5561:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5562:1: RULE_ID
            {
             before(grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BasicLiteral__TypeConsAssignment_011113); 
             after(grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicLiteral__TypeConsAssignment_0"


    // $ANTLR start "rule__BasicLiteral__LitAssignment_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5573:1: rule__BasicLiteral__LitAssignment_1 : ( RULE_LIT ) ;
    public final void rule__BasicLiteral__LitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5577:1: ( ( RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5578:1: ( RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5578:1: ( RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5579:1: RULE_LIT
            {
             before(grammarAccess.getBasicLiteralAccess().getLitLITTerminalRuleCall_1_0()); 
            match(input,RULE_LIT,FOLLOW_RULE_LIT_in_rule__BasicLiteral__LitAssignment_111148); 
             after(grammarAccess.getBasicLiteralAccess().getLitLITTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicLiteral__LitAssignment_1"


    // $ANTLR start "rule__TupleLiteral__ElemsAssignment_2_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5588:1: rule__TupleLiteral__ElemsAssignment_2_0 : ( ruleLiteral ) ;
    public final void rule__TupleLiteral__ElemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5592:1: ( ( ruleLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5593:1: ( ruleLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5593:1: ( ruleLiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5594:1: ruleLiteral
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_011179);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__ElemsAssignment_2_0"


    // $ANTLR start "rule__TupleLiteral__ElemsAssignment_2_1_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5603:1: rule__TupleLiteral__ElemsAssignment_2_1_1 : ( ruleLiteral ) ;
    public final void rule__TupleLiteral__ElemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5607:1: ( ( ruleLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5608:1: ( ruleLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5608:1: ( ruleLiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5609:1: ruleLiteral
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_1_111210);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteral__ElemsAssignment_2_1_1"


    // $ANTLR start "rule__ListLiteral__TypeConsAssignment_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5618:1: rule__ListLiteral__TypeConsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ListLiteral__TypeConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5622:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5623:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5623:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5624:1: ( RULE_ID )
            {
             before(grammarAccess.getListLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5625:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5626:1: RULE_ID
            {
             before(grammarAccess.getListLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListLiteral__TypeConsAssignment_011245); 
             after(grammarAccess.getListLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getListLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__TypeConsAssignment_0"


    // $ANTLR start "rule__ListLiteral__ElemsAssignment_2_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5637:1: rule__ListLiteral__ElemsAssignment_2_0 : ( ruleELiteral ) ;
    public final void rule__ListLiteral__ElemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5641:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5642:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5642:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5643:1: ruleELiteral
            {
             before(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_011280);
            ruleELiteral();

            state._fsp--;

             after(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__ElemsAssignment_2_0"


    // $ANTLR start "rule__ListLiteral__ElemsAssignment_2_1_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5652:1: rule__ListLiteral__ElemsAssignment_2_1_1 : ( ruleELiteral ) ;
    public final void rule__ListLiteral__ElemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5656:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5657:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5657:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5658:1: ruleELiteral
            {
             before(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_1_111311);
            ruleELiteral();

            state._fsp--;

             after(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__ElemsAssignment_2_1_1"


    // $ANTLR start "rule__SetLiteral__TypeConsAssignment_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5667:1: rule__SetLiteral__TypeConsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SetLiteral__TypeConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5671:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5672:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5672:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5673:1: ( RULE_ID )
            {
             before(grammarAccess.getSetLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5674:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5675:1: RULE_ID
            {
             before(grammarAccess.getSetLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SetLiteral__TypeConsAssignment_011346); 
             after(grammarAccess.getSetLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSetLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__TypeConsAssignment_0"


    // $ANTLR start "rule__SetLiteral__ElemsAssignment_2_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5686:1: rule__SetLiteral__ElemsAssignment_2_0 : ( ruleELiteral ) ;
    public final void rule__SetLiteral__ElemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5690:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5691:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5691:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5692:1: ruleELiteral
            {
             before(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_011381);
            ruleELiteral();

            state._fsp--;

             after(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__ElemsAssignment_2_0"


    // $ANTLR start "rule__SetLiteral__ElemsAssignment_2_1_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5701:1: rule__SetLiteral__ElemsAssignment_2_1_1 : ( ruleELiteral ) ;
    public final void rule__SetLiteral__ElemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5705:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5706:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5706:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5707:1: ruleELiteral
            {
             before(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_1_111412);
            ruleELiteral();

            state._fsp--;

             after(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLiteral__ElemsAssignment_2_1_1"


    // $ANTLR start "rule__OptionLiteral__TypeAssignment_0_3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5716:1: rule__OptionLiteral__TypeAssignment_0_3 : ( ruleType ) ;
    public final void rule__OptionLiteral__TypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5720:1: ( ( ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5721:1: ( ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5721:1: ( ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5722:1: ruleType
            {
             before(grammarAccess.getOptionLiteralAccess().getTypeTypeParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__OptionLiteral__TypeAssignment_0_311443);
            ruleType();

            state._fsp--;

             after(grammarAccess.getOptionLiteralAccess().getTypeTypeParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__TypeAssignment_0_3"


    // $ANTLR start "rule__OptionLiteral__LitAssignment_1_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5731:1: rule__OptionLiteral__LitAssignment_1_2 : ( ruleLiteral ) ;
    public final void rule__OptionLiteral__LitAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5735:1: ( ( ruleLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5736:1: ( ruleLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5736:1: ( ruleLiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5737:1: ruleLiteral
            {
             before(grammarAccess.getOptionLiteralAccess().getLitLiteralParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__OptionLiteral__LitAssignment_1_211474);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getOptionLiteralAccess().getLitLiteralParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionLiteral__LitAssignment_1_2"


    // $ANTLR start "rule__ELiteral__LitAssignment"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5746:1: rule__ELiteral__LitAssignment : ( RULE_LIT ) ;
    public final void rule__ELiteral__LitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5750:1: ( ( RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5751:1: ( RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5751:1: ( RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5752:1: RULE_LIT
            {
             before(grammarAccess.getELiteralAccess().getLitLITTerminalRuleCall_0()); 
            match(input,RULE_LIT,FOLLOW_RULE_LIT_in_rule__ELiteral__LitAssignment11505); 
             after(grammarAccess.getELiteralAccess().getLitLITTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELiteral__LitAssignment"


    // $ANTLR start "rule__SubFeaturesDecl__CategoryNamesAssignment_0_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5761:1: rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__SubFeaturesDecl__CategoryNamesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5765:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5766:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5766:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5767:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getCategoryNamesIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesDecl__CategoryNamesAssignment_0_011536); 
             after(grammarAccess.getSubFeaturesDeclAccess().getCategoryNamesIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__CategoryNamesAssignment_0_0"


    // $ANTLR start "rule__SubFeaturesDecl__NameAssignment_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5776:1: rule__SubFeaturesDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubFeaturesDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5780:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5781:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5781:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5782:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesDecl__NameAssignment_111567); 
             after(grammarAccess.getSubFeaturesDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__NameAssignment_1"


    // $ANTLR start "rule__SubFeaturesDecl__TypeAssignment_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5791:1: rule__SubFeaturesDecl__TypeAssignment_2 : ( ruleSubFeaturesType ) ;
    public final void rule__SubFeaturesDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5795:1: ( ( ruleSubFeaturesType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5796:1: ( ruleSubFeaturesType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5796:1: ( ruleSubFeaturesType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5797:1: ruleSubFeaturesType
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getTypeSubFeaturesTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSubFeaturesType_in_rule__SubFeaturesDecl__TypeAssignment_211598);
            ruleSubFeaturesType();

            state._fsp--;

             after(grammarAccess.getSubFeaturesDeclAccess().getTypeSubFeaturesTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesDecl__TypeAssignment_2"


    // $ANTLR start "rule__SubFeaturesType__TypeAssignment_0_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5806:1: rule__SubFeaturesType__TypeAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__SubFeaturesType__TypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5810:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5811:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5811:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5812:1: ( RULE_ID )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getTypeFeaturesDeclCrossReference_0_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5813:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5814:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getTypeFeaturesDeclIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesType__TypeAssignment_0_211633); 
             after(grammarAccess.getSubFeaturesTypeAccess().getTypeFeaturesDeclIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getSubFeaturesTypeAccess().getTypeFeaturesDeclCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__TypeAssignment_0_2"


    // $ANTLR start "rule__SubFeaturesType__SupersAssignment_1_1_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5825:1: rule__SubFeaturesType__SupersAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__SubFeaturesType__SupersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5829:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5830:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5830:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5831:1: ( RULE_ID )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclCrossReference_1_1_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5832:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5833:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesType__SupersAssignment_1_1_111672); 
             after(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__SupersAssignment_1_1_1"


    // $ANTLR start "rule__SubFeaturesType__SupersAssignment_1_1_2_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5844:1: rule__SubFeaturesType__SupersAssignment_1_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SubFeaturesType__SupersAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5848:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5849:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5849:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5850:1: ( RULE_ID )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclCrossReference_1_1_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5851:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5852:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclIDTerminalRuleCall_1_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesType__SupersAssignment_1_1_2_111711); 
             after(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclIDTerminalRuleCall_1_1_2_1_0_1()); 

            }

             after(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclCrossReference_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__SupersAssignment_1_1_2_1"


    // $ANTLR start "rule__SubFeaturesType__BodyAssignment_1_3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5863:1: rule__SubFeaturesType__BodyAssignment_1_3 : ( ruleFeaturesBody ) ;
    public final void rule__SubFeaturesType__BodyAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5867:1: ( ( ruleFeaturesBody ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5868:1: ( ruleFeaturesBody )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5868:1: ( ruleFeaturesBody )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5869:1: ruleFeaturesBody
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getBodyFeaturesBodyParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleFeaturesBody_in_rule__SubFeaturesType__BodyAssignment_1_311746);
            ruleFeaturesBody();

            state._fsp--;

             after(grammarAccess.getSubFeaturesTypeAccess().getBodyFeaturesBodyParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFeaturesType__BodyAssignment_1_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000200084002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Alternatives_in_ruleDecl155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__0_in_ruleTypeDecl215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesDecl_in_entryRuleFeaturesDecl242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeaturesDecl249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__0_in_ruleFeaturesDecl275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesBody_in_entryRuleFeaturesBody302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeaturesBody309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__0_in_ruleFeaturesBody335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureDecl_in_entryRuleFeatureDecl362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureDecl369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureDecl__Alternatives_in_ruleFeatureDecl395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_entryRuleInvariantDecl422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariantDecl429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariantDecl_in_ruleInvariantDecl455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityInvariantDecl_in_entryRuleMultiplicityInvariantDecl481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityInvariantDecl488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__0_in_ruleMultiplicityInvariantDecl514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesMatch_in_entryRuleSubFeaturesMatch541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubFeaturesMatch548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__0_in_ruleSubFeaturesMatch574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_entryRuleConstraintNat601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintNat608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Alternatives_in_ruleConstraintNat634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_entryRuleAttrDecl661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrDecl668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__0_in_ruleAttrDecl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicLiteral908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__0_in_ruleBasicLiteral934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteral968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__0_in_ruleTupleLiteral994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__0_in_ruleSetLiteral1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_entryRuleOptionLiteral1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionLiteral1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Alternatives_in_ruleOptionLiteral1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_entryRuleELiteral1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleELiteral1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ELiteral__LitAssignment_in_ruleELiteral1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesDecl_in_entryRuleSubFeaturesDecl1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubFeaturesDecl1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__0_in_ruleSubFeaturesDecl1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesType_in_entryRuleSubFeaturesType1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubFeaturesType1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Alternatives_in_ruleSubFeaturesType1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_rule__Decl__Alternatives1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesDecl_in_rule__Decl__Alternatives1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_rule__FeatureDecl__Alternatives1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_rule__FeatureDecl__Alternatives1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesDecl_in_rule__FeatureDecl__Alternatives1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__NameAssignment_3_0_in_rule__SubFeaturesMatch__Alternatives_31505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__AnyAssignment_3_1_in_rule__SubFeaturesMatch__Alternatives_31523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_0__0_in_rule__ConstraintNat__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_1__0_in_rule__ConstraintNat__Alternatives1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_0__0_in_rule__AttrDecl__Alternatives_21607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_1__0_in_rule__AttrDecl__Alternatives_21625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Modifier__Alternatives1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Modifier__Alternatives1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Modifier__Alternatives1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Modifier__Alternatives1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0__0_in_rule__Type__Alternatives_01753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1__0_in_rule__Type__Alternatives_01771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_0__0_in_rule__Type__Alternatives_0_0_21804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_1__0_in_rule__Type__Alternatives_0_0_21822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_rule__Literal__Alternatives1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_rule__Literal__Alternatives1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rule__Literal__Alternatives1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_rule__Literal__Alternatives1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionLiteral_in_rule__Literal__Alternatives1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_0__0_in_rule__OptionLiteral__Alternatives1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_1__0_in_rule__OptionLiteral__Alternatives1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__0_in_rule__SubFeaturesType__Alternatives2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__0_in_rule__SubFeaturesType__Alternatives2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__02055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__02058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeDecl__Group__0__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__12117 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__12120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__NameAssignment_1_in_rule__TypeDecl__Group__1__Impl2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__22177 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__22180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__0_in_rule__TypeDecl__Group__2__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__32238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__0_in_rule__TypeDecl__Group__3__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__0__Impl_in_rule__TypeDecl__Group_2__02304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__1_in_rule__TypeDecl__Group_2__02307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeDecl__Group_2__0__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__1__Impl_in_rule__TypeDecl__Group_2__12366 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__2_in_rule__TypeDecl__Group_2__12369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__SupersAssignment_2_1_in_rule__TypeDecl__Group_2__1__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__2__Impl_in_rule__TypeDecl__Group_2__22426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2_2__0_in_rule__TypeDecl__Group_2__2__Impl2453 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2_2__0__Impl_in_rule__TypeDecl__Group_2_2__02490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2_2__1_in_rule__TypeDecl__Group_2_2__02493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDecl__Group_2_2__0__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2_2__1__Impl_in_rule__TypeDecl__Group_2_2__12552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__SupersAssignment_2_2_1_in_rule__TypeDecl__Group_2_2__1__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__0__Impl_in_rule__TypeDecl__Group_3__02613 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__1_in_rule__TypeDecl__Group_3__02616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeDecl__Group_3__0__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__1__Impl_in_rule__TypeDecl__Group_3__12675 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__2_in_rule__TypeDecl__Group_3__12678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1__0_in_rule__TypeDecl__Group_3__1__Impl2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__2__Impl_in_rule__TypeDecl__Group_3__22736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeDecl__Group_3__2__Impl2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1__0__Impl_in_rule__TypeDecl__Group_3_1__02801 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1__1_in_rule__TypeDecl__Group_3_1__02804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__ElemsAssignment_3_1_0_in_rule__TypeDecl__Group_3_1__0__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1__1__Impl_in_rule__TypeDecl__Group_3_1__12861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1_1__0_in_rule__TypeDecl__Group_3_1__1__Impl2888 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1_1__0__Impl_in_rule__TypeDecl__Group_3_1_1__02923 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1_1__1_in_rule__TypeDecl__Group_3_1_1__02926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDecl__Group_3_1_1__0__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1_1__1__Impl_in_rule__TypeDecl__Group_3_1_1__12985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__ElemsAssignment_3_1_1_1_in_rule__TypeDecl__Group_3_1_1__1__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__0__Impl_in_rule__FeaturesDecl__Group__03046 = new BitSet(new long[]{0x0000000200084000L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__1_in_rule__FeaturesDecl__Group__03049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__CompleteAssignment_0_in_rule__FeaturesDecl__Group__0__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__1__Impl_in_rule__FeaturesDecl__Group__13107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__2_in_rule__FeaturesDecl__Group__13110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FeaturesDecl__Group__1__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__2__Impl_in_rule__FeaturesDecl__Group__23169 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__3_in_rule__FeaturesDecl__Group__23172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__NameAssignment_2_in_rule__FeaturesDecl__Group__2__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__3__Impl_in_rule__FeaturesDecl__Group__33229 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__4_in_rule__FeaturesDecl__Group__33232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__0_in_rule__FeaturesDecl__Group__3__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__4__Impl_in_rule__FeaturesDecl__Group__43290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__BodyAssignment_4_in_rule__FeaturesDecl__Group__4__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__0__Impl_in_rule__FeaturesDecl__Group_3__03357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__1_in_rule__FeaturesDecl__Group_3__03360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FeaturesDecl__Group_3__0__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__1__Impl_in_rule__FeaturesDecl__Group_3__13419 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__2_in_rule__FeaturesDecl__Group_3__13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__SupersAssignment_3_1_in_rule__FeaturesDecl__Group_3__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__2__Impl_in_rule__FeaturesDecl__Group_3__23479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3_2__0_in_rule__FeaturesDecl__Group_3__2__Impl3506 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3_2__0__Impl_in_rule__FeaturesDecl__Group_3_2__03543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3_2__1_in_rule__FeaturesDecl__Group_3_2__03546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FeaturesDecl__Group_3_2__0__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3_2__1__Impl_in_rule__FeaturesDecl__Group_3_2__13605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__SupersAssignment_3_2_1_in_rule__FeaturesDecl__Group_3_2__1__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__0__Impl_in_rule__FeaturesBody__Group__03666 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__1_in_rule__FeaturesBody__Group__03669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__1__Impl_in_rule__FeaturesBody__Group__13727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group_1__0_in_rule__FeaturesBody__Group__1__Impl3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group_1__0__Impl_in_rule__FeaturesBody__Group_1__03789 = new BitSet(new long[]{0x0000000000143C10L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group_1__1_in_rule__FeaturesBody__Group_1__03792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FeaturesBody__Group_1__0__Impl3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group_1__1__Impl_in_rule__FeaturesBody__Group_1__13851 = new BitSet(new long[]{0x0000000000143C10L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group_1__2_in_rule__FeaturesBody__Group_1__13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__FeaturesAssignment_1_1_in_rule__FeaturesBody__Group_1__1__Impl3881 = new BitSet(new long[]{0x0000000000103C12L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group_1__2__Impl_in_rule__FeaturesBody__Group_1__23912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FeaturesBody__Group_1__2__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__0__Impl_in_rule__MultiplicityInvariantDecl__Group__03977 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__1_in_rule__MultiplicityInvariantDecl__Group__03980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MultiplicityInvariantDecl__Group__0__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__1__Impl_in_rule__MultiplicityInvariantDecl__Group__14039 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__2_in_rule__MultiplicityInvariantDecl__Group__14042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_1__0_in_rule__MultiplicityInvariantDecl__Group__1__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__2__Impl_in_rule__MultiplicityInvariantDecl__Group__24100 = new BitSet(new long[]{0x0000000401000010L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__3_in_rule__MultiplicityInvariantDecl__Group__24103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__0_in_rule__MultiplicityInvariantDecl__Group__2__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__3__Impl_in_rule__MultiplicityInvariantDecl__Group__34160 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__4_in_rule__MultiplicityInvariantDecl__Group__34163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__MatchAssignment_3_in_rule__MultiplicityInvariantDecl__Group__3__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__4__Impl_in_rule__MultiplicityInvariantDecl__Group__44220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_4__0_in_rule__MultiplicityInvariantDecl__Group__4__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_1__0__Impl_in_rule__MultiplicityInvariantDecl__Group_1__04288 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_1__1_in_rule__MultiplicityInvariantDecl__Group_1__04291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__InvNameAssignment_1_0_in_rule__MultiplicityInvariantDecl__Group_1__0__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_1__1__Impl_in_rule__MultiplicityInvariantDecl__Group_1__14348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MultiplicityInvariantDecl__Group_1__1__Impl4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__0__Impl_in_rule__MultiplicityInvariantDecl__Group_2__04411 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__1_in_rule__MultiplicityInvariantDecl__Group_2__04414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__LoAssignment_2_0_in_rule__MultiplicityInvariantDecl__Group_2__0__Impl4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__1__Impl_in_rule__MultiplicityInvariantDecl__Group_2__14471 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__2_in_rule__MultiplicityInvariantDecl__Group_2__14474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MultiplicityInvariantDecl__Group_2__1__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__2__Impl_in_rule__MultiplicityInvariantDecl__Group_2__24533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__HiAssignment_2_2_in_rule__MultiplicityInvariantDecl__Group_2__2__Impl4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_4__0__Impl_in_rule__MultiplicityInvariantDecl__Group_4__04596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_4__1_in_rule__MultiplicityInvariantDecl__Group_4__04599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MultiplicityInvariantDecl__Group_4__0__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_4__1__Impl_in_rule__MultiplicityInvariantDecl__Group_4__14658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__TypeAssignment_4_1_in_rule__MultiplicityInvariantDecl__Group_4__1__Impl4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__0__Impl_in_rule__SubFeaturesMatch__Group__04719 = new BitSet(new long[]{0x0000000401000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__1_in_rule__SubFeaturesMatch__Group__04722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__1__Impl_in_rule__SubFeaturesMatch__Group__14780 = new BitSet(new long[]{0x0000000401000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__2_in_rule__SubFeaturesMatch__Group__14783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__DistinctAssignment_1_in_rule__SubFeaturesMatch__Group__1__Impl4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__2__Impl_in_rule__SubFeaturesMatch__Group__24841 = new BitSet(new long[]{0x0000000401000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__3_in_rule__SubFeaturesMatch__Group__24844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group_2__0_in_rule__SubFeaturesMatch__Group__2__Impl4871 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__3__Impl_in_rule__SubFeaturesMatch__Group__34902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Alternatives_3_in_rule__SubFeaturesMatch__Group__3__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group_2__0__Impl_in_rule__SubFeaturesMatch__Group_2__04967 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group_2__1_in_rule__SubFeaturesMatch__Group_2__04970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__CategoryNamesAssignment_2_0_in_rule__SubFeaturesMatch__Group_2__0__Impl4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group_2__1__Impl_in_rule__SubFeaturesMatch__Group_2__15027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SubFeaturesMatch__Group_2__1__Impl5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_0__0__Impl_in_rule__ConstraintNat__Group_0__05090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_0__1_in_rule__ConstraintNat__Group_0__05093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_0__1__Impl_in_rule__ConstraintNat__Group_0__15151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__NumAssignment_0_1_in_rule__ConstraintNat__Group_0__1__Impl5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_1__0__Impl_in_rule__ConstraintNat__Group_1__05212 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_1__1_in_rule__ConstraintNat__Group_1__05215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_1__1__Impl_in_rule__ConstraintNat__Group_1__15273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ConstraintNat__Group_1__1__Impl5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__0__Impl_in_rule__AttrDecl__Group__05336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__1_in_rule__AttrDecl__Group__05339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__ModifierAssignment_0_in_rule__AttrDecl__Group__0__Impl5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__1__Impl_in_rule__AttrDecl__Group__15396 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__2_in_rule__AttrDecl__Group__15399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__AttributeNameAssignment_1_in_rule__AttrDecl__Group__1__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__2__Impl_in_rule__AttrDecl__Group__25456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Alternatives_2_in_rule__AttrDecl__Group__2__Impl5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_0__0__Impl_in_rule__AttrDecl__Group_2_0__05519 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_0__1_in_rule__AttrDecl__Group_2_0__05522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AttrDecl__Group_2_0__0__Impl5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_0__1__Impl_in_rule__AttrDecl__Group_2_0__15581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__TypeAssignment_2_0_1_in_rule__AttrDecl__Group_2_0__1__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_1__0__Impl_in_rule__AttrDecl__Group_2_1__05642 = new BitSet(new long[]{0x0000000190000010L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_1__1_in_rule__AttrDecl__Group_2_1__05645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AttrDecl__Group_2_1__0__Impl5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_1__1__Impl_in_rule__AttrDecl__Group_2_1__15704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__LiteralAssignment_2_1_1_in_rule__AttrDecl__Group_2_1__1__Impl5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__05765 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__05768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_0_in_rule__Type__Group__0__Impl5795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__15825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0__0__Impl_in_rule__Type__Group_0_0__05887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0__1_in_rule__Type__Group_0_0__05890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0__1__Impl_in_rule__Type__Group_0_0__15948 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0__2_in_rule__Type__Group_0_0__15951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__BaseTypeAssignment_0_0_1_in_rule__Type__Group_0_0__1__Impl5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0__2__Impl_in_rule__Type__Group_0_0__26008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_0_0_2_in_rule__Type__Group_0_0__2__Impl6035 = new BitSet(new long[]{0x0000000004020002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_0__0__Impl_in_rule__Type__Group_0_0_2_0__06072 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_0__1_in_rule__Type__Group_0_0_2_0__06075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_0__1__Impl_in_rule__Type__Group_0_0_2_0__16133 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_0__2_in_rule__Type__Group_0_0_2_0__16136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Type__Group_0_0_2_0__1__Impl6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_0__2__Impl_in_rule__Type__Group_0_0_2_0__26195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Type__Group_0_0_2_0__2__Impl6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_1__0__Impl_in_rule__Type__Group_0_0_2_1__06260 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_1__1_in_rule__Type__Group_0_0_2_1__06263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_1__1__Impl_in_rule__Type__Group_0_0_2_1__16321 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_1__2_in_rule__Type__Group_0_0_2_1__16324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Group_0_0_2_1__1__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_0_2_1__2__Impl_in_rule__Type__Group_0_0_2_1__26383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Group_0_0_2_1__2__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1__0__Impl_in_rule__Type__Group_0_1__06448 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1__1_in_rule__Type__Group_0_1__06451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__Group_0_1__0__Impl6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1__1__Impl_in_rule__Type__Group_0_1__16510 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1__2_in_rule__Type__Group_0_1__16513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1__2__Impl_in_rule__Type__Group_0_1__26571 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1__3_in_rule__Type__Group_0_1__26574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ElemTypesAssignment_0_1_2_in_rule__Type__Group_0_1__2__Impl6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1__3__Impl_in_rule__Type__Group_0_1__36631 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1__4_in_rule__Type__Group_0_1__36634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1_3__0_in_rule__Type__Group_0_1__3__Impl6663 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1_3__0_in_rule__Type__Group_0_1__3__Impl6675 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1__4__Impl_in_rule__Type__Group_0_1__46708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Group_0_1__4__Impl6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1_3__0__Impl_in_rule__Type__Group_0_1_3__06777 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1_3__1_in_rule__Type__Group_0_1_3__06780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__Group_0_1_3__0__Impl6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_1_3__1__Impl_in_rule__Type__Group_0_1_3__16839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ElemTypesAssignment_0_1_3_1_in_rule__Type__Group_0_1_3__1__Impl6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__06900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__06903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Type__Group_1__0__Impl6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__16962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__0__Impl_in_rule__BasicLiteral__Group__07024 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__1_in_rule__BasicLiteral__Group__07027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__TypeConsAssignment_0_in_rule__BasicLiteral__Group__0__Impl7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__1__Impl_in_rule__BasicLiteral__Group__17084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__LitAssignment_1_in_rule__BasicLiteral__Group__1__Impl7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__0__Impl_in_rule__TupleLiteral__Group__07145 = new BitSet(new long[]{0x00000001B0000010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__1_in_rule__TupleLiteral__Group__07148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TupleLiteral__Group__0__Impl7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__1__Impl_in_rule__TupleLiteral__Group__17207 = new BitSet(new long[]{0x00000001B0000010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__2_in_rule__TupleLiteral__Group__17210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__2__Impl_in_rule__TupleLiteral__Group__27268 = new BitSet(new long[]{0x00000001B0000010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__3_in_rule__TupleLiteral__Group__27271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__0_in_rule__TupleLiteral__Group__2__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__3__Impl_in_rule__TupleLiteral__Group__37329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TupleLiteral__Group__3__Impl7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__0__Impl_in_rule__TupleLiteral__Group_2__07396 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__1_in_rule__TupleLiteral__Group_2__07399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__ElemsAssignment_2_0_in_rule__TupleLiteral__Group_2__0__Impl7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__1__Impl_in_rule__TupleLiteral__Group_2__17456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__0_in_rule__TupleLiteral__Group_2__1__Impl7483 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__0__Impl_in_rule__TupleLiteral__Group_2_1__07518 = new BitSet(new long[]{0x0000000190000010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__1_in_rule__TupleLiteral__Group_2_1__07521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TupleLiteral__Group_2_1__0__Impl7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__1__Impl_in_rule__TupleLiteral__Group_2_1__17580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__ElemsAssignment_2_1_1_in_rule__TupleLiteral__Group_2_1__1__Impl7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__07641 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__07644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__TypeConsAssignment_0_in_rule__ListLiteral__Group__0__Impl7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__17701 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__17704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ListLiteral__Group__1__Impl7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__27763 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__3_in_rule__ListLiteral__Group__27766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__0_in_rule__ListLiteral__Group__2__Impl7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__3__Impl_in_rule__ListLiteral__Group__37824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ListLiteral__Group__3__Impl7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__0__Impl_in_rule__ListLiteral__Group_2__07891 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__1_in_rule__ListLiteral__Group_2__07894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ElemsAssignment_2_0_in_rule__ListLiteral__Group_2__0__Impl7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__1__Impl_in_rule__ListLiteral__Group_2__17951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__0_in_rule__ListLiteral__Group_2__1__Impl7978 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__0__Impl_in_rule__ListLiteral__Group_2_1__08013 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__1_in_rule__ListLiteral__Group_2_1__08016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ListLiteral__Group_2_1__0__Impl8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__1__Impl_in_rule__ListLiteral__Group_2_1__18075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ElemsAssignment_2_1_1_in_rule__ListLiteral__Group_2_1__1__Impl8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__0__Impl_in_rule__SetLiteral__Group__08136 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__1_in_rule__SetLiteral__Group__08139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__TypeConsAssignment_0_in_rule__SetLiteral__Group__0__Impl8166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__1__Impl_in_rule__SetLiteral__Group__18196 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__2_in_rule__SetLiteral__Group__18199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SetLiteral__Group__1__Impl8227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__2__Impl_in_rule__SetLiteral__Group__28258 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__3_in_rule__SetLiteral__Group__28261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__0_in_rule__SetLiteral__Group__2__Impl8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__3__Impl_in_rule__SetLiteral__Group__38319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SetLiteral__Group__3__Impl8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__0__Impl_in_rule__SetLiteral__Group_2__08386 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__1_in_rule__SetLiteral__Group_2__08389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__ElemsAssignment_2_0_in_rule__SetLiteral__Group_2__0__Impl8416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__1__Impl_in_rule__SetLiteral__Group_2__18446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__0_in_rule__SetLiteral__Group_2__1__Impl8473 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__0__Impl_in_rule__SetLiteral__Group_2_1__08508 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__1_in_rule__SetLiteral__Group_2_1__08511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SetLiteral__Group_2_1__0__Impl8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__1__Impl_in_rule__SetLiteral__Group_2_1__18570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__ElemsAssignment_2_1_1_in_rule__SetLiteral__Group_2_1__1__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_0__0__Impl_in_rule__OptionLiteral__Group_0__08631 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_0__1_in_rule__OptionLiteral__Group_0__08634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__OptionLiteral__Group_0__0__Impl8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_0__1__Impl_in_rule__OptionLiteral__Group_0__18693 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_0__2_in_rule__OptionLiteral__Group_0__18696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_0__2__Impl_in_rule__OptionLiteral__Group_0__28754 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_0__3_in_rule__OptionLiteral__Group_0__28757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__OptionLiteral__Group_0__2__Impl8785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_0__3__Impl_in_rule__OptionLiteral__Group_0__38816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__TypeAssignment_0_3_in_rule__OptionLiteral__Group_0__3__Impl8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_1__0__Impl_in_rule__OptionLiteral__Group_1__08881 = new BitSet(new long[]{0x0000000190000010L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_1__1_in_rule__OptionLiteral__Group_1__08884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__OptionLiteral__Group_1__0__Impl8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_1__1__Impl_in_rule__OptionLiteral__Group_1__18943 = new BitSet(new long[]{0x0000000190000010L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_1__2_in_rule__OptionLiteral__Group_1__18946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__Group_1__2__Impl_in_rule__OptionLiteral__Group_1__29004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionLiteral__LitAssignment_1_2_in_rule__OptionLiteral__Group_1__2__Impl9031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__0__Impl_in_rule__SubFeaturesDecl__Group__09067 = new BitSet(new long[]{0x0000000000103C10L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__1_in_rule__SubFeaturesDecl__Group__09070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group_0__0_in_rule__SubFeaturesDecl__Group__0__Impl9097 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__1__Impl_in_rule__SubFeaturesDecl__Group__19128 = new BitSet(new long[]{0x0000000002208000L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__2_in_rule__SubFeaturesDecl__Group__19131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__NameAssignment_1_in_rule__SubFeaturesDecl__Group__1__Impl9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__2__Impl_in_rule__SubFeaturesDecl__Group__29188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__TypeAssignment_2_in_rule__SubFeaturesDecl__Group__2__Impl9215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group_0__0__Impl_in_rule__SubFeaturesDecl__Group_0__09251 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group_0__1_in_rule__SubFeaturesDecl__Group_0__09254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__CategoryNamesAssignment_0_0_in_rule__SubFeaturesDecl__Group_0__0__Impl9281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group_0__1__Impl_in_rule__SubFeaturesDecl__Group_0__19311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SubFeaturesDecl__Group_0__1__Impl9339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__0__Impl_in_rule__SubFeaturesType__Group_0__09374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__1_in_rule__SubFeaturesType__Group_0__09377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SubFeaturesType__Group_0__0__Impl9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__1__Impl_in_rule__SubFeaturesType__Group_0__19436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__2_in_rule__SubFeaturesType__Group_0__19439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__2__Impl_in_rule__SubFeaturesType__Group_0__29497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__TypeAssignment_0_2_in_rule__SubFeaturesType__Group_0__2__Impl9524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__0__Impl_in_rule__SubFeaturesType__Group_1__09560 = new BitSet(new long[]{0x0000000002208000L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__1_in_rule__SubFeaturesType__Group_1__09563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__1__Impl_in_rule__SubFeaturesType__Group_1__19621 = new BitSet(new long[]{0x0000000002208000L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__2_in_rule__SubFeaturesType__Group_1__19624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__0_in_rule__SubFeaturesType__Group_1__1__Impl9651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__2__Impl_in_rule__SubFeaturesType__Group_1__29682 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__3_in_rule__SubFeaturesType__Group_1__29685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SubFeaturesType__Group_1__2__Impl9713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__3__Impl_in_rule__SubFeaturesType__Group_1__39744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__BodyAssignment_1_3_in_rule__SubFeaturesType__Group_1__3__Impl9771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__0__Impl_in_rule__SubFeaturesType__Group_1_1__09809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__1_in_rule__SubFeaturesType__Group_1_1__09812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SubFeaturesType__Group_1_1__0__Impl9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__1__Impl_in_rule__SubFeaturesType__Group_1_1__19871 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__2_in_rule__SubFeaturesType__Group_1_1__19874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__SupersAssignment_1_1_1_in_rule__SubFeaturesType__Group_1_1__1__Impl9901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__2__Impl_in_rule__SubFeaturesType__Group_1_1__29931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1_2__0_in_rule__SubFeaturesType__Group_1_1__2__Impl9958 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1_2__0__Impl_in_rule__SubFeaturesType__Group_1_1_2__09995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1_2__1_in_rule__SubFeaturesType__Group_1_1_2__09998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SubFeaturesType__Group_1_1_2__0__Impl10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1_2__1__Impl_in_rule__SubFeaturesType__Group_1_1_2__110057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__SupersAssignment_1_1_2_1_in_rule__SubFeaturesType__Group_1_1_2__1__Impl10084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_rule__Model__DeclsAssignment10123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__NameAssignment_110154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__SupersAssignment_2_110189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__SupersAssignment_2_2_110228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__TypeDecl__ElemsAssignment_3_1_010263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__TypeDecl__ElemsAssignment_3_1_1_110294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FeaturesDecl__CompleteAssignment_010330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeaturesDecl__NameAssignment_210369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeaturesDecl__SupersAssignment_3_110404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeaturesDecl__SupersAssignment_3_2_110443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesBody_in_rule__FeaturesDecl__BodyAssignment_410478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureDecl_in_rule__FeaturesBody__FeaturesAssignment_1_110509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultiplicityInvariantDecl__InvNameAssignment_1_010540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_rule__MultiplicityInvariantDecl__LoAssignment_2_010571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_rule__MultiplicityInvariantDecl__HiAssignment_2_210602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesMatch_in_rule__MultiplicityInvariantDecl__MatchAssignment_310633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultiplicityInvariantDecl__TypeAssignment_4_110668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SubFeaturesMatch__DistinctAssignment_110708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesMatch__CategoryNamesAssignment_2_010747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesMatch__NameAssignment_3_010778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SubFeaturesMatch__AnyAssignment_3_110814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAT_in_rule__ConstraintNat__NumAssignment_0_110853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__AttrDecl__ModifierAssignment_010884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttrDecl__AttributeNameAssignment_110915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AttrDecl__TypeAssignment_2_0_110946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__AttrDecl__LiteralAssignment_2_1_110977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__BaseTypeAssignment_0_0_111012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_0_1_211047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_0_1_3_111078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BasicLiteral__TypeConsAssignment_011113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_rule__BasicLiteral__LitAssignment_111148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_011179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_1_111210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListLiteral__TypeConsAssignment_011245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_011280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_1_111311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SetLiteral__TypeConsAssignment_011346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_011381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_1_111412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__OptionLiteral__TypeAssignment_0_311443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__OptionLiteral__LitAssignment_1_211474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_rule__ELiteral__LitAssignment11505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesDecl__CategoryNamesAssignment_0_011536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesDecl__NameAssignment_111567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesType_in_rule__SubFeaturesDecl__TypeAssignment_211598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesType__TypeAssignment_0_211633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesType__SupersAssignment_1_1_111672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesType__SupersAssignment_1_1_2_111711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesBody_in_rule__SubFeaturesType__BodyAssignment_1_311746 = new BitSet(new long[]{0x0000000000000002L});

}