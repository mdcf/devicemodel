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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NAT", "RULE_LIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'const'", "'val'", "'var'", "'def'", "'type'", "'<:'", "','", "'{'", "'}'", "'features'", "'inv'", "':'", "'..'", "'.'", "'*'", "'='", "'['", "']'", "'<'", "'>'", "'complete'"
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

                if ( (LA1_0==14||LA1_0==19||LA1_0==30) ) {
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:405:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:409:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:410:1: ( ( rule__Type__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:410:1: ( ( rule__Type__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:411:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:412:1: ( rule__Type__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:412:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType814);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleELiteral"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:564:1: entryRuleELiteral : ruleELiteral EOF ;
    public final void entryRuleELiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:565:1: ( ruleELiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:566:1: ruleELiteral EOF
            {
             before(grammarAccess.getELiteralRule()); 
            pushFollow(FOLLOW_ruleELiteral_in_entryRuleELiteral1141);
            ruleELiteral();

            state._fsp--;

             after(grammarAccess.getELiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleELiteral1148); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:573:1: ruleELiteral : ( ( rule__ELiteral__LitAssignment ) ) ;
    public final void ruleELiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:577:2: ( ( ( rule__ELiteral__LitAssignment ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:578:1: ( ( rule__ELiteral__LitAssignment ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:578:1: ( ( rule__ELiteral__LitAssignment ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:579:1: ( rule__ELiteral__LitAssignment )
            {
             before(grammarAccess.getELiteralAccess().getLitAssignment()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:580:1: ( rule__ELiteral__LitAssignment )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:580:2: rule__ELiteral__LitAssignment
            {
            pushFollow(FOLLOW_rule__ELiteral__LitAssignment_in_ruleELiteral1174);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:592:1: entryRuleSubFeaturesDecl : ruleSubFeaturesDecl EOF ;
    public final void entryRuleSubFeaturesDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:593:1: ( ruleSubFeaturesDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:594:1: ruleSubFeaturesDecl EOF
            {
             before(grammarAccess.getSubFeaturesDeclRule()); 
            pushFollow(FOLLOW_ruleSubFeaturesDecl_in_entryRuleSubFeaturesDecl1201);
            ruleSubFeaturesDecl();

            state._fsp--;

             after(grammarAccess.getSubFeaturesDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubFeaturesDecl1208); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:601:1: ruleSubFeaturesDecl : ( ( rule__SubFeaturesDecl__Group__0 ) ) ;
    public final void ruleSubFeaturesDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:605:2: ( ( ( rule__SubFeaturesDecl__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:606:1: ( ( rule__SubFeaturesDecl__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:606:1: ( ( rule__SubFeaturesDecl__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:607:1: ( rule__SubFeaturesDecl__Group__0 )
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:608:1: ( rule__SubFeaturesDecl__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:608:2: rule__SubFeaturesDecl__Group__0
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__0_in_ruleSubFeaturesDecl1234);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:620:1: entryRuleSubFeaturesType : ruleSubFeaturesType EOF ;
    public final void entryRuleSubFeaturesType() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:621:1: ( ruleSubFeaturesType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:622:1: ruleSubFeaturesType EOF
            {
             before(grammarAccess.getSubFeaturesTypeRule()); 
            pushFollow(FOLLOW_ruleSubFeaturesType_in_entryRuleSubFeaturesType1261);
            ruleSubFeaturesType();

            state._fsp--;

             after(grammarAccess.getSubFeaturesTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubFeaturesType1268); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:629:1: ruleSubFeaturesType : ( ( rule__SubFeaturesType__Alternatives ) ) ;
    public final void ruleSubFeaturesType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:633:2: ( ( ( rule__SubFeaturesType__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:634:1: ( ( rule__SubFeaturesType__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:634:1: ( ( rule__SubFeaturesType__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:635:1: ( rule__SubFeaturesType__Alternatives )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:636:1: ( rule__SubFeaturesType__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:636:2: rule__SubFeaturesType__Alternatives
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Alternatives_in_ruleSubFeaturesType1294);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:648:1: rule__Decl__Alternatives : ( ( ruleTypeDecl ) | ( ruleFeaturesDecl ) );
    public final void rule__Decl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:652:1: ( ( ruleTypeDecl ) | ( ruleFeaturesDecl ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==19||LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:653:1: ( ruleTypeDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:653:1: ( ruleTypeDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:654:1: ruleTypeDecl
                    {
                     before(grammarAccess.getDeclAccess().getTypeDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeDecl_in_rule__Decl__Alternatives1330);
                    ruleTypeDecl();

                    state._fsp--;

                     after(grammarAccess.getDeclAccess().getTypeDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:659:6: ( ruleFeaturesDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:659:6: ( ruleFeaturesDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:660:1: ruleFeaturesDecl
                    {
                     before(grammarAccess.getDeclAccess().getFeaturesDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFeaturesDecl_in_rule__Decl__Alternatives1347);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:670:1: rule__FeatureDecl__Alternatives : ( ( ruleInvariantDecl ) | ( ruleAttrDecl ) | ( ruleSubFeaturesDecl ) );
    public final void rule__FeatureDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:674:1: ( ( ruleInvariantDecl ) | ( ruleAttrDecl ) | ( ruleSubFeaturesDecl ) )
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:675:1: ( ruleInvariantDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:675:1: ( ruleInvariantDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:676:1: ruleInvariantDecl
                    {
                     before(grammarAccess.getFeatureDeclAccess().getInvariantDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInvariantDecl_in_rule__FeatureDecl__Alternatives1379);
                    ruleInvariantDecl();

                    state._fsp--;

                     after(grammarAccess.getFeatureDeclAccess().getInvariantDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:681:6: ( ruleAttrDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:681:6: ( ruleAttrDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:682:1: ruleAttrDecl
                    {
                     before(grammarAccess.getFeatureDeclAccess().getAttrDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttrDecl_in_rule__FeatureDecl__Alternatives1396);
                    ruleAttrDecl();

                    state._fsp--;

                     after(grammarAccess.getFeatureDeclAccess().getAttrDeclParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:687:6: ( ruleSubFeaturesDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:687:6: ( ruleSubFeaturesDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:688:1: ruleSubFeaturesDecl
                    {
                     before(grammarAccess.getFeatureDeclAccess().getSubFeaturesDeclParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSubFeaturesDecl_in_rule__FeatureDecl__Alternatives1413);
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


    // $ANTLR start "rule__SubFeaturesMatch__Alternatives_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:698:1: rule__SubFeaturesMatch__Alternatives_2 : ( ( ( rule__SubFeaturesMatch__NameAssignment_2_0 ) ) | ( ( rule__SubFeaturesMatch__AnyAssignment_2_1 ) ) );
    public final void rule__SubFeaturesMatch__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:702:1: ( ( ( rule__SubFeaturesMatch__NameAssignment_2_0 ) ) | ( ( rule__SubFeaturesMatch__AnyAssignment_2_1 ) ) )
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:703:1: ( ( rule__SubFeaturesMatch__NameAssignment_2_0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:703:1: ( ( rule__SubFeaturesMatch__NameAssignment_2_0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:704:1: ( rule__SubFeaturesMatch__NameAssignment_2_0 )
                    {
                     before(grammarAccess.getSubFeaturesMatchAccess().getNameAssignment_2_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:705:1: ( rule__SubFeaturesMatch__NameAssignment_2_0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:705:2: rule__SubFeaturesMatch__NameAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesMatch__NameAssignment_2_0_in_rule__SubFeaturesMatch__Alternatives_21445);
                    rule__SubFeaturesMatch__NameAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubFeaturesMatchAccess().getNameAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:709:6: ( ( rule__SubFeaturesMatch__AnyAssignment_2_1 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:709:6: ( ( rule__SubFeaturesMatch__AnyAssignment_2_1 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:710:1: ( rule__SubFeaturesMatch__AnyAssignment_2_1 )
                    {
                     before(grammarAccess.getSubFeaturesMatchAccess().getAnyAssignment_2_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:711:1: ( rule__SubFeaturesMatch__AnyAssignment_2_1 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:711:2: rule__SubFeaturesMatch__AnyAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesMatch__AnyAssignment_2_1_in_rule__SubFeaturesMatch__Alternatives_21463);
                    rule__SubFeaturesMatch__AnyAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubFeaturesMatchAccess().getAnyAssignment_2_1()); 

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
    // $ANTLR end "rule__SubFeaturesMatch__Alternatives_2"


    // $ANTLR start "rule__ConstraintNat__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:720:1: rule__ConstraintNat__Alternatives : ( ( ( rule__ConstraintNat__Group_0__0 ) ) | ( ( rule__ConstraintNat__Group_1__0 ) ) );
    public final void rule__ConstraintNat__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:724:1: ( ( ( rule__ConstraintNat__Group_0__0 ) ) | ( ( rule__ConstraintNat__Group_1__0 ) ) )
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:725:1: ( ( rule__ConstraintNat__Group_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:725:1: ( ( rule__ConstraintNat__Group_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:726:1: ( rule__ConstraintNat__Group_0__0 )
                    {
                     before(grammarAccess.getConstraintNatAccess().getGroup_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:727:1: ( rule__ConstraintNat__Group_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:727:2: rule__ConstraintNat__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintNat__Group_0__0_in_rule__ConstraintNat__Alternatives1496);
                    rule__ConstraintNat__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintNatAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:731:6: ( ( rule__ConstraintNat__Group_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:731:6: ( ( rule__ConstraintNat__Group_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:732:1: ( rule__ConstraintNat__Group_1__0 )
                    {
                     before(grammarAccess.getConstraintNatAccess().getGroup_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:733:1: ( rule__ConstraintNat__Group_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:733:2: rule__ConstraintNat__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintNat__Group_1__0_in_rule__ConstraintNat__Alternatives1514);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:742:1: rule__AttrDecl__Alternatives_2 : ( ( ( rule__AttrDecl__Group_2_0__0 ) ) | ( ( rule__AttrDecl__Group_2_1__0 ) ) );
    public final void rule__AttrDecl__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:746:1: ( ( ( rule__AttrDecl__Group_2_0__0 ) ) | ( ( rule__AttrDecl__Group_2_1__0 ) ) )
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:747:1: ( ( rule__AttrDecl__Group_2_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:747:1: ( ( rule__AttrDecl__Group_2_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:748:1: ( rule__AttrDecl__Group_2_0__0 )
                    {
                     before(grammarAccess.getAttrDeclAccess().getGroup_2_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:749:1: ( rule__AttrDecl__Group_2_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:749:2: rule__AttrDecl__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__AttrDecl__Group_2_0__0_in_rule__AttrDecl__Alternatives_21547);
                    rule__AttrDecl__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttrDeclAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:753:6: ( ( rule__AttrDecl__Group_2_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:753:6: ( ( rule__AttrDecl__Group_2_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:754:1: ( rule__AttrDecl__Group_2_1__0 )
                    {
                     before(grammarAccess.getAttrDeclAccess().getGroup_2_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:755:1: ( rule__AttrDecl__Group_2_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:755:2: rule__AttrDecl__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__AttrDecl__Group_2_1__0_in_rule__AttrDecl__Alternatives_21565);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:764:1: rule__Modifier__Alternatives : ( ( 'const' ) | ( 'val' ) | ( 'var' ) | ( 'def' ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:768:1: ( ( 'const' ) | ( 'val' ) | ( 'var' ) | ( 'def' ) )
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:769:1: ( 'const' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:769:1: ( 'const' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:770:1: 'const'
                    {
                     before(grammarAccess.getModifierAccess().getConstKeyword_0()); 
                    match(input,10,FOLLOW_10_in_rule__Modifier__Alternatives1599); 
                     after(grammarAccess.getModifierAccess().getConstKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:777:6: ( 'val' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:777:6: ( 'val' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:778:1: 'val'
                    {
                     before(grammarAccess.getModifierAccess().getValKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__Modifier__Alternatives1619); 
                     after(grammarAccess.getModifierAccess().getValKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:785:6: ( 'var' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:785:6: ( 'var' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:786:1: 'var'
                    {
                     before(grammarAccess.getModifierAccess().getVarKeyword_2()); 
                    match(input,12,FOLLOW_12_in_rule__Modifier__Alternatives1639); 
                     after(grammarAccess.getModifierAccess().getVarKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:793:6: ( 'def' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:793:6: ( 'def' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:794:1: 'def'
                    {
                     before(grammarAccess.getModifierAccess().getDefKeyword_3()); 
                    match(input,13,FOLLOW_13_in_rule__Modifier__Alternatives1659); 
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:806:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:810:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) )
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:811:1: ( ( rule__Type__Group_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:811:1: ( ( rule__Type__Group_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:812:1: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:813:1: ( rule__Type__Group_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:813:2: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1693);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:817:6: ( ( rule__Type__Group_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:817:6: ( ( rule__Type__Group_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:818:1: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:819:1: ( rule__Type__Group_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:819:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1711);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Type__Alternatives_0_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:828:1: rule__Type__Alternatives_0_2 : ( ( ( rule__Type__Group_0_2_0__0 ) ) | ( ( rule__Type__Group_0_2_1__0 ) ) );
    public final void rule__Type__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:832:1: ( ( ( rule__Type__Group_0_2_0__0 ) ) | ( ( rule__Type__Group_0_2_1__0 ) ) )
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
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:833:1: ( ( rule__Type__Group_0_2_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:833:1: ( ( rule__Type__Group_0_2_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:834:1: ( rule__Type__Group_0_2_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0_2_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:835:1: ( rule__Type__Group_0_2_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:835:2: rule__Type__Group_0_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0_2_0__0_in_rule__Type__Alternatives_0_21744);
                    rule__Type__Group_0_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:839:6: ( ( rule__Type__Group_0_2_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:839:6: ( ( rule__Type__Group_0_2_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:840:1: ( rule__Type__Group_0_2_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0_2_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:841:1: ( rule__Type__Group_0_2_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:841:2: rule__Type__Group_0_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0_2_1__0_in_rule__Type__Alternatives_0_21762);
                    rule__Type__Group_0_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0_2_1()); 

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
    // $ANTLR end "rule__Type__Alternatives_0_2"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:850:1: rule__Literal__Alternatives : ( ( ruleBasicLiteral ) | ( ruleTupleLiteral ) | ( ruleListLiteral ) | ( ruleSetLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:854:1: ( ( ruleBasicLiteral ) | ( ruleTupleLiteral ) | ( ruleListLiteral ) | ( ruleSetLiteral ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt10=4;
                    }
                    break;
                case RULE_LIT:
                    {
                    alt10=1;
                    }
                    break;
                case 26:
                    {
                    alt10=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:855:1: ( ruleBasicLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:855:1: ( ruleBasicLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:856:1: ruleBasicLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBasicLiteral_in_rule__Literal__Alternatives1795);
                    ruleBasicLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:861:6: ( ruleTupleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:861:6: ( ruleTupleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:862:1: ruleTupleLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTupleLiteral_in_rule__Literal__Alternatives1812);
                    ruleTupleLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:867:6: ( ruleListLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:867:6: ( ruleListLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:868:1: ruleListLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleListLiteral_in_rule__Literal__Alternatives1829);
                    ruleListLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:873:6: ( ruleSetLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:873:6: ( ruleSetLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:874:1: ruleSetLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSetLiteral_in_rule__Literal__Alternatives1846);
                    ruleSetLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_3()); 

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


    // $ANTLR start "rule__SubFeaturesType__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:884:1: rule__SubFeaturesType__Alternatives : ( ( ( rule__SubFeaturesType__Group_0__0 ) ) | ( ( rule__SubFeaturesType__Group_1__0 ) ) );
    public final void rule__SubFeaturesType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:888:1: ( ( ( rule__SubFeaturesType__Group_0__0 ) ) | ( ( rule__SubFeaturesType__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==15||LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:889:1: ( ( rule__SubFeaturesType__Group_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:889:1: ( ( rule__SubFeaturesType__Group_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:890:1: ( rule__SubFeaturesType__Group_0__0 )
                    {
                     before(grammarAccess.getSubFeaturesTypeAccess().getGroup_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:891:1: ( rule__SubFeaturesType__Group_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:891:2: rule__SubFeaturesType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__0_in_rule__SubFeaturesType__Alternatives1878);
                    rule__SubFeaturesType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubFeaturesTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:895:6: ( ( rule__SubFeaturesType__Group_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:895:6: ( ( rule__SubFeaturesType__Group_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:896:1: ( rule__SubFeaturesType__Group_1__0 )
                    {
                     before(grammarAccess.getSubFeaturesTypeAccess().getGroup_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:897:1: ( rule__SubFeaturesType__Group_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:897:2: rule__SubFeaturesType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__0_in_rule__SubFeaturesType__Alternatives1896);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:908:1: rule__TypeDecl__Group__0 : rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 ;
    public final void rule__TypeDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:912:1: ( rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:913:2: rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__01927);
            rule__TypeDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__01930);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:920:1: rule__TypeDecl__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:924:1: ( ( 'type' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:925:1: ( 'type' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:925:1: ( 'type' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:926:1: 'type'
            {
             before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__TypeDecl__Group__0__Impl1958); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:939:1: rule__TypeDecl__Group__1 : rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 ;
    public final void rule__TypeDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:943:1: ( rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:944:2: rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__11989);
            rule__TypeDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__11992);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:951:1: rule__TypeDecl__Group__1__Impl : ( ( rule__TypeDecl__NameAssignment_1 ) ) ;
    public final void rule__TypeDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:955:1: ( ( ( rule__TypeDecl__NameAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:956:1: ( ( rule__TypeDecl__NameAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:956:1: ( ( rule__TypeDecl__NameAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:957:1: ( rule__TypeDecl__NameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getNameAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:958:1: ( rule__TypeDecl__NameAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:958:2: rule__TypeDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__NameAssignment_1_in_rule__TypeDecl__Group__1__Impl2019);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:968:1: rule__TypeDecl__Group__2 : rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 ;
    public final void rule__TypeDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:972:1: ( rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:973:2: rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__22049);
            rule__TypeDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__22052);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:980:1: rule__TypeDecl__Group__2__Impl : ( ( rule__TypeDecl__Group_2__0 )? ) ;
    public final void rule__TypeDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:984:1: ( ( ( rule__TypeDecl__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:985:1: ( ( rule__TypeDecl__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:985:1: ( ( rule__TypeDecl__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:986:1: ( rule__TypeDecl__Group_2__0 )?
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:987:1: ( rule__TypeDecl__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:987:2: rule__TypeDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_2__0_in_rule__TypeDecl__Group__2__Impl2079);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:997:1: rule__TypeDecl__Group__3 : rule__TypeDecl__Group__3__Impl ;
    public final void rule__TypeDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1001:1: ( rule__TypeDecl__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1002:2: rule__TypeDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__32110);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1008:1: rule__TypeDecl__Group__3__Impl : ( ( rule__TypeDecl__Group_3__0 )? ) ;
    public final void rule__TypeDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1012:1: ( ( ( rule__TypeDecl__Group_3__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1013:1: ( ( rule__TypeDecl__Group_3__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1013:1: ( ( rule__TypeDecl__Group_3__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1014:1: ( rule__TypeDecl__Group_3__0 )?
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1015:1: ( rule__TypeDecl__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1015:2: rule__TypeDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_3__0_in_rule__TypeDecl__Group__3__Impl2137);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1033:1: rule__TypeDecl__Group_2__0 : rule__TypeDecl__Group_2__0__Impl rule__TypeDecl__Group_2__1 ;
    public final void rule__TypeDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1037:1: ( rule__TypeDecl__Group_2__0__Impl rule__TypeDecl__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1038:2: rule__TypeDecl__Group_2__0__Impl rule__TypeDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_2__0__Impl_in_rule__TypeDecl__Group_2__02176);
            rule__TypeDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_2__1_in_rule__TypeDecl__Group_2__02179);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1045:1: rule__TypeDecl__Group_2__0__Impl : ( '<:' ) ;
    public final void rule__TypeDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1049:1: ( ( '<:' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1050:1: ( '<:' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1050:1: ( '<:' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1051:1: '<:'
            {
             before(grammarAccess.getTypeDeclAccess().getLessThanSignColonKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__TypeDecl__Group_2__0__Impl2207); 
             after(grammarAccess.getTypeDeclAccess().getLessThanSignColonKeyword_2_0()); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1064:1: rule__TypeDecl__Group_2__1 : rule__TypeDecl__Group_2__1__Impl rule__TypeDecl__Group_2__2 ;
    public final void rule__TypeDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1068:1: ( rule__TypeDecl__Group_2__1__Impl rule__TypeDecl__Group_2__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1069:2: rule__TypeDecl__Group_2__1__Impl rule__TypeDecl__Group_2__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_2__1__Impl_in_rule__TypeDecl__Group_2__12238);
            rule__TypeDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_2__2_in_rule__TypeDecl__Group_2__12241);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1076:1: rule__TypeDecl__Group_2__1__Impl : ( ( rule__TypeDecl__SupersAssignment_2_1 ) ) ;
    public final void rule__TypeDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1080:1: ( ( ( rule__TypeDecl__SupersAssignment_2_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1081:1: ( ( rule__TypeDecl__SupersAssignment_2_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1081:1: ( ( rule__TypeDecl__SupersAssignment_2_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1082:1: ( rule__TypeDecl__SupersAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getSupersAssignment_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1083:1: ( rule__TypeDecl__SupersAssignment_2_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1083:2: rule__TypeDecl__SupersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__SupersAssignment_2_1_in_rule__TypeDecl__Group_2__1__Impl2268);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1093:1: rule__TypeDecl__Group_2__2 : rule__TypeDecl__Group_2__2__Impl ;
    public final void rule__TypeDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1097:1: ( rule__TypeDecl__Group_2__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1098:2: rule__TypeDecl__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_2__2__Impl_in_rule__TypeDecl__Group_2__22298);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1104:1: rule__TypeDecl__Group_2__2__Impl : ( ( rule__TypeDecl__Group_2_2__0 )* ) ;
    public final void rule__TypeDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1108:1: ( ( ( rule__TypeDecl__Group_2_2__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1109:1: ( ( rule__TypeDecl__Group_2_2__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1109:1: ( ( rule__TypeDecl__Group_2_2__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1110:1: ( rule__TypeDecl__Group_2_2__0 )*
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_2_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1111:1: ( rule__TypeDecl__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1111:2: rule__TypeDecl__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TypeDecl__Group_2_2__0_in_rule__TypeDecl__Group_2__2__Impl2325);
            	    rule__TypeDecl__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1127:1: rule__TypeDecl__Group_2_2__0 : rule__TypeDecl__Group_2_2__0__Impl rule__TypeDecl__Group_2_2__1 ;
    public final void rule__TypeDecl__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1131:1: ( rule__TypeDecl__Group_2_2__0__Impl rule__TypeDecl__Group_2_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1132:2: rule__TypeDecl__Group_2_2__0__Impl rule__TypeDecl__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_2_2__0__Impl_in_rule__TypeDecl__Group_2_2__02362);
            rule__TypeDecl__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_2_2__1_in_rule__TypeDecl__Group_2_2__02365);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1139:1: rule__TypeDecl__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDecl__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1143:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1144:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1144:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1145:1: ','
            {
             before(grammarAccess.getTypeDeclAccess().getCommaKeyword_2_2_0()); 
            match(input,16,FOLLOW_16_in_rule__TypeDecl__Group_2_2__0__Impl2393); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1158:1: rule__TypeDecl__Group_2_2__1 : rule__TypeDecl__Group_2_2__1__Impl ;
    public final void rule__TypeDecl__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1162:1: ( rule__TypeDecl__Group_2_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1163:2: rule__TypeDecl__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_2_2__1__Impl_in_rule__TypeDecl__Group_2_2__12424);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1169:1: rule__TypeDecl__Group_2_2__1__Impl : ( ( rule__TypeDecl__SupersAssignment_2_2_1 ) ) ;
    public final void rule__TypeDecl__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1173:1: ( ( ( rule__TypeDecl__SupersAssignment_2_2_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1174:1: ( ( rule__TypeDecl__SupersAssignment_2_2_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1174:1: ( ( rule__TypeDecl__SupersAssignment_2_2_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1175:1: ( rule__TypeDecl__SupersAssignment_2_2_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getSupersAssignment_2_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1176:1: ( rule__TypeDecl__SupersAssignment_2_2_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1176:2: rule__TypeDecl__SupersAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__SupersAssignment_2_2_1_in_rule__TypeDecl__Group_2_2__1__Impl2451);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1190:1: rule__TypeDecl__Group_3__0 : rule__TypeDecl__Group_3__0__Impl rule__TypeDecl__Group_3__1 ;
    public final void rule__TypeDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1194:1: ( rule__TypeDecl__Group_3__0__Impl rule__TypeDecl__Group_3__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1195:2: rule__TypeDecl__Group_3__0__Impl rule__TypeDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3__0__Impl_in_rule__TypeDecl__Group_3__02485);
            rule__TypeDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_3__1_in_rule__TypeDecl__Group_3__02488);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1202:1: rule__TypeDecl__Group_3__0__Impl : ( '{' ) ;
    public final void rule__TypeDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1206:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1207:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1207:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1208:1: '{'
            {
             before(grammarAccess.getTypeDeclAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__TypeDecl__Group_3__0__Impl2516); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1221:1: rule__TypeDecl__Group_3__1 : rule__TypeDecl__Group_3__1__Impl rule__TypeDecl__Group_3__2 ;
    public final void rule__TypeDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1225:1: ( rule__TypeDecl__Group_3__1__Impl rule__TypeDecl__Group_3__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1226:2: rule__TypeDecl__Group_3__1__Impl rule__TypeDecl__Group_3__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3__1__Impl_in_rule__TypeDecl__Group_3__12547);
            rule__TypeDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_3__2_in_rule__TypeDecl__Group_3__12550);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1233:1: rule__TypeDecl__Group_3__1__Impl : ( ( rule__TypeDecl__Group_3_1__0 )? ) ;
    public final void rule__TypeDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1237:1: ( ( ( rule__TypeDecl__Group_3_1__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1238:1: ( ( rule__TypeDecl__Group_3_1__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1238:1: ( ( rule__TypeDecl__Group_3_1__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1239:1: ( rule__TypeDecl__Group_3_1__0 )?
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_3_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1240:1: ( rule__TypeDecl__Group_3_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LIT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1240:2: rule__TypeDecl__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_3_1__0_in_rule__TypeDecl__Group_3__1__Impl2577);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1250:1: rule__TypeDecl__Group_3__2 : rule__TypeDecl__Group_3__2__Impl ;
    public final void rule__TypeDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1254:1: ( rule__TypeDecl__Group_3__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1255:2: rule__TypeDecl__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3__2__Impl_in_rule__TypeDecl__Group_3__22608);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1261:1: rule__TypeDecl__Group_3__2__Impl : ( '}' ) ;
    public final void rule__TypeDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1265:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1266:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1266:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1267:1: '}'
            {
             before(grammarAccess.getTypeDeclAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,18,FOLLOW_18_in_rule__TypeDecl__Group_3__2__Impl2636); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1286:1: rule__TypeDecl__Group_3_1__0 : rule__TypeDecl__Group_3_1__0__Impl rule__TypeDecl__Group_3_1__1 ;
    public final void rule__TypeDecl__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1290:1: ( rule__TypeDecl__Group_3_1__0__Impl rule__TypeDecl__Group_3_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1291:2: rule__TypeDecl__Group_3_1__0__Impl rule__TypeDecl__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1__0__Impl_in_rule__TypeDecl__Group_3_1__02673);
            rule__TypeDecl__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1__1_in_rule__TypeDecl__Group_3_1__02676);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1298:1: rule__TypeDecl__Group_3_1__0__Impl : ( ( rule__TypeDecl__ElemsAssignment_3_1_0 ) ) ;
    public final void rule__TypeDecl__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1302:1: ( ( ( rule__TypeDecl__ElemsAssignment_3_1_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1303:1: ( ( rule__TypeDecl__ElemsAssignment_3_1_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1303:1: ( ( rule__TypeDecl__ElemsAssignment_3_1_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1304:1: ( rule__TypeDecl__ElemsAssignment_3_1_0 )
            {
             before(grammarAccess.getTypeDeclAccess().getElemsAssignment_3_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1305:1: ( rule__TypeDecl__ElemsAssignment_3_1_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1305:2: rule__TypeDecl__ElemsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__TypeDecl__ElemsAssignment_3_1_0_in_rule__TypeDecl__Group_3_1__0__Impl2703);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1315:1: rule__TypeDecl__Group_3_1__1 : rule__TypeDecl__Group_3_1__1__Impl ;
    public final void rule__TypeDecl__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1319:1: ( rule__TypeDecl__Group_3_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1320:2: rule__TypeDecl__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1__1__Impl_in_rule__TypeDecl__Group_3_1__12733);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1326:1: rule__TypeDecl__Group_3_1__1__Impl : ( ( rule__TypeDecl__Group_3_1_1__0 )* ) ;
    public final void rule__TypeDecl__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1330:1: ( ( ( rule__TypeDecl__Group_3_1_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1331:1: ( ( rule__TypeDecl__Group_3_1_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1331:1: ( ( rule__TypeDecl__Group_3_1_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1332:1: ( rule__TypeDecl__Group_3_1_1__0 )*
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_3_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1333:1: ( rule__TypeDecl__Group_3_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1333:2: rule__TypeDecl__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TypeDecl__Group_3_1_1__0_in_rule__TypeDecl__Group_3_1__1__Impl2760);
            	    rule__TypeDecl__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1347:1: rule__TypeDecl__Group_3_1_1__0 : rule__TypeDecl__Group_3_1_1__0__Impl rule__TypeDecl__Group_3_1_1__1 ;
    public final void rule__TypeDecl__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1351:1: ( rule__TypeDecl__Group_3_1_1__0__Impl rule__TypeDecl__Group_3_1_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1352:2: rule__TypeDecl__Group_3_1_1__0__Impl rule__TypeDecl__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1_1__0__Impl_in_rule__TypeDecl__Group_3_1_1__02795);
            rule__TypeDecl__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1_1__1_in_rule__TypeDecl__Group_3_1_1__02798);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1359:1: rule__TypeDecl__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__TypeDecl__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1363:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1364:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1364:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1365:1: ','
            {
             before(grammarAccess.getTypeDeclAccess().getCommaKeyword_3_1_1_0()); 
            match(input,16,FOLLOW_16_in_rule__TypeDecl__Group_3_1_1__0__Impl2826); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1378:1: rule__TypeDecl__Group_3_1_1__1 : rule__TypeDecl__Group_3_1_1__1__Impl ;
    public final void rule__TypeDecl__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1382:1: ( rule__TypeDecl__Group_3_1_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1383:2: rule__TypeDecl__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_3_1_1__1__Impl_in_rule__TypeDecl__Group_3_1_1__12857);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1389:1: rule__TypeDecl__Group_3_1_1__1__Impl : ( ( rule__TypeDecl__ElemsAssignment_3_1_1_1 ) ) ;
    public final void rule__TypeDecl__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1393:1: ( ( ( rule__TypeDecl__ElemsAssignment_3_1_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1394:1: ( ( rule__TypeDecl__ElemsAssignment_3_1_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1394:1: ( ( rule__TypeDecl__ElemsAssignment_3_1_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1395:1: ( rule__TypeDecl__ElemsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getElemsAssignment_3_1_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1396:1: ( rule__TypeDecl__ElemsAssignment_3_1_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1396:2: rule__TypeDecl__ElemsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__ElemsAssignment_3_1_1_1_in_rule__TypeDecl__Group_3_1_1__1__Impl2884);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1410:1: rule__FeaturesDecl__Group__0 : rule__FeaturesDecl__Group__0__Impl rule__FeaturesDecl__Group__1 ;
    public final void rule__FeaturesDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1414:1: ( rule__FeaturesDecl__Group__0__Impl rule__FeaturesDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1415:2: rule__FeaturesDecl__Group__0__Impl rule__FeaturesDecl__Group__1
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__0__Impl_in_rule__FeaturesDecl__Group__02918);
            rule__FeaturesDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group__1_in_rule__FeaturesDecl__Group__02921);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1422:1: rule__FeaturesDecl__Group__0__Impl : ( ( rule__FeaturesDecl__CompleteAssignment_0 )? ) ;
    public final void rule__FeaturesDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1426:1: ( ( ( rule__FeaturesDecl__CompleteAssignment_0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1427:1: ( ( rule__FeaturesDecl__CompleteAssignment_0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1427:1: ( ( rule__FeaturesDecl__CompleteAssignment_0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1428:1: ( rule__FeaturesDecl__CompleteAssignment_0 )?
            {
             before(grammarAccess.getFeaturesDeclAccess().getCompleteAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1429:1: ( rule__FeaturesDecl__CompleteAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1429:2: rule__FeaturesDecl__CompleteAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FeaturesDecl__CompleteAssignment_0_in_rule__FeaturesDecl__Group__0__Impl2948);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1439:1: rule__FeaturesDecl__Group__1 : rule__FeaturesDecl__Group__1__Impl rule__FeaturesDecl__Group__2 ;
    public final void rule__FeaturesDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1443:1: ( rule__FeaturesDecl__Group__1__Impl rule__FeaturesDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1444:2: rule__FeaturesDecl__Group__1__Impl rule__FeaturesDecl__Group__2
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__1__Impl_in_rule__FeaturesDecl__Group__12979);
            rule__FeaturesDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group__2_in_rule__FeaturesDecl__Group__12982);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1451:1: rule__FeaturesDecl__Group__1__Impl : ( 'features' ) ;
    public final void rule__FeaturesDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1455:1: ( ( 'features' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1456:1: ( 'features' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1456:1: ( 'features' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1457:1: 'features'
            {
             before(grammarAccess.getFeaturesDeclAccess().getFeaturesKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__FeaturesDecl__Group__1__Impl3010); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1470:1: rule__FeaturesDecl__Group__2 : rule__FeaturesDecl__Group__2__Impl rule__FeaturesDecl__Group__3 ;
    public final void rule__FeaturesDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1474:1: ( rule__FeaturesDecl__Group__2__Impl rule__FeaturesDecl__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1475:2: rule__FeaturesDecl__Group__2__Impl rule__FeaturesDecl__Group__3
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__2__Impl_in_rule__FeaturesDecl__Group__23041);
            rule__FeaturesDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group__3_in_rule__FeaturesDecl__Group__23044);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1482:1: rule__FeaturesDecl__Group__2__Impl : ( ( rule__FeaturesDecl__NameAssignment_2 ) ) ;
    public final void rule__FeaturesDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1486:1: ( ( ( rule__FeaturesDecl__NameAssignment_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1487:1: ( ( rule__FeaturesDecl__NameAssignment_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1487:1: ( ( rule__FeaturesDecl__NameAssignment_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1488:1: ( rule__FeaturesDecl__NameAssignment_2 )
            {
             before(grammarAccess.getFeaturesDeclAccess().getNameAssignment_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1489:1: ( rule__FeaturesDecl__NameAssignment_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1489:2: rule__FeaturesDecl__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__NameAssignment_2_in_rule__FeaturesDecl__Group__2__Impl3071);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1499:1: rule__FeaturesDecl__Group__3 : rule__FeaturesDecl__Group__3__Impl rule__FeaturesDecl__Group__4 ;
    public final void rule__FeaturesDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1503:1: ( rule__FeaturesDecl__Group__3__Impl rule__FeaturesDecl__Group__4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1504:2: rule__FeaturesDecl__Group__3__Impl rule__FeaturesDecl__Group__4
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__3__Impl_in_rule__FeaturesDecl__Group__33101);
            rule__FeaturesDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group__4_in_rule__FeaturesDecl__Group__33104);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1511:1: rule__FeaturesDecl__Group__3__Impl : ( ( rule__FeaturesDecl__Group_3__0 )? ) ;
    public final void rule__FeaturesDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1515:1: ( ( ( rule__FeaturesDecl__Group_3__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1516:1: ( ( rule__FeaturesDecl__Group_3__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1516:1: ( ( rule__FeaturesDecl__Group_3__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1517:1: ( rule__FeaturesDecl__Group_3__0 )?
            {
             before(grammarAccess.getFeaturesDeclAccess().getGroup_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1518:1: ( rule__FeaturesDecl__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1518:2: rule__FeaturesDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__0_in_rule__FeaturesDecl__Group__3__Impl3131);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1528:1: rule__FeaturesDecl__Group__4 : rule__FeaturesDecl__Group__4__Impl ;
    public final void rule__FeaturesDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1532:1: ( rule__FeaturesDecl__Group__4__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1533:2: rule__FeaturesDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group__4__Impl_in_rule__FeaturesDecl__Group__43162);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1539:1: rule__FeaturesDecl__Group__4__Impl : ( ( rule__FeaturesDecl__BodyAssignment_4 ) ) ;
    public final void rule__FeaturesDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1543:1: ( ( ( rule__FeaturesDecl__BodyAssignment_4 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1544:1: ( ( rule__FeaturesDecl__BodyAssignment_4 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1544:1: ( ( rule__FeaturesDecl__BodyAssignment_4 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1545:1: ( rule__FeaturesDecl__BodyAssignment_4 )
            {
             before(grammarAccess.getFeaturesDeclAccess().getBodyAssignment_4()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1546:1: ( rule__FeaturesDecl__BodyAssignment_4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1546:2: rule__FeaturesDecl__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__BodyAssignment_4_in_rule__FeaturesDecl__Group__4__Impl3189);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1566:1: rule__FeaturesDecl__Group_3__0 : rule__FeaturesDecl__Group_3__0__Impl rule__FeaturesDecl__Group_3__1 ;
    public final void rule__FeaturesDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1570:1: ( rule__FeaturesDecl__Group_3__0__Impl rule__FeaturesDecl__Group_3__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1571:2: rule__FeaturesDecl__Group_3__0__Impl rule__FeaturesDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__0__Impl_in_rule__FeaturesDecl__Group_3__03229);
            rule__FeaturesDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__1_in_rule__FeaturesDecl__Group_3__03232);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1578:1: rule__FeaturesDecl__Group_3__0__Impl : ( '<:' ) ;
    public final void rule__FeaturesDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1582:1: ( ( '<:' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1583:1: ( '<:' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1583:1: ( '<:' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1584:1: '<:'
            {
             before(grammarAccess.getFeaturesDeclAccess().getLessThanSignColonKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__FeaturesDecl__Group_3__0__Impl3260); 
             after(grammarAccess.getFeaturesDeclAccess().getLessThanSignColonKeyword_3_0()); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1597:1: rule__FeaturesDecl__Group_3__1 : rule__FeaturesDecl__Group_3__1__Impl rule__FeaturesDecl__Group_3__2 ;
    public final void rule__FeaturesDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1601:1: ( rule__FeaturesDecl__Group_3__1__Impl rule__FeaturesDecl__Group_3__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1602:2: rule__FeaturesDecl__Group_3__1__Impl rule__FeaturesDecl__Group_3__2
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__1__Impl_in_rule__FeaturesDecl__Group_3__13291);
            rule__FeaturesDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__2_in_rule__FeaturesDecl__Group_3__13294);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1609:1: rule__FeaturesDecl__Group_3__1__Impl : ( ( rule__FeaturesDecl__SupersAssignment_3_1 ) ) ;
    public final void rule__FeaturesDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1613:1: ( ( ( rule__FeaturesDecl__SupersAssignment_3_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1614:1: ( ( rule__FeaturesDecl__SupersAssignment_3_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1614:1: ( ( rule__FeaturesDecl__SupersAssignment_3_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1615:1: ( rule__FeaturesDecl__SupersAssignment_3_1 )
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersAssignment_3_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1616:1: ( rule__FeaturesDecl__SupersAssignment_3_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1616:2: rule__FeaturesDecl__SupersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__SupersAssignment_3_1_in_rule__FeaturesDecl__Group_3__1__Impl3321);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1626:1: rule__FeaturesDecl__Group_3__2 : rule__FeaturesDecl__Group_3__2__Impl ;
    public final void rule__FeaturesDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1630:1: ( rule__FeaturesDecl__Group_3__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1631:2: rule__FeaturesDecl__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3__2__Impl_in_rule__FeaturesDecl__Group_3__23351);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1637:1: rule__FeaturesDecl__Group_3__2__Impl : ( ( rule__FeaturesDecl__Group_3_2__0 )* ) ;
    public final void rule__FeaturesDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1641:1: ( ( ( rule__FeaturesDecl__Group_3_2__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1642:1: ( ( rule__FeaturesDecl__Group_3_2__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1642:1: ( ( rule__FeaturesDecl__Group_3_2__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1643:1: ( rule__FeaturesDecl__Group_3_2__0 )*
            {
             before(grammarAccess.getFeaturesDeclAccess().getGroup_3_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1644:1: ( rule__FeaturesDecl__Group_3_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1644:2: rule__FeaturesDecl__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FeaturesDecl__Group_3_2__0_in_rule__FeaturesDecl__Group_3__2__Impl3378);
            	    rule__FeaturesDecl__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1660:1: rule__FeaturesDecl__Group_3_2__0 : rule__FeaturesDecl__Group_3_2__0__Impl rule__FeaturesDecl__Group_3_2__1 ;
    public final void rule__FeaturesDecl__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1664:1: ( rule__FeaturesDecl__Group_3_2__0__Impl rule__FeaturesDecl__Group_3_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1665:2: rule__FeaturesDecl__Group_3_2__0__Impl rule__FeaturesDecl__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3_2__0__Impl_in_rule__FeaturesDecl__Group_3_2__03415);
            rule__FeaturesDecl__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3_2__1_in_rule__FeaturesDecl__Group_3_2__03418);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1672:1: rule__FeaturesDecl__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FeaturesDecl__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1676:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1677:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1677:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1678:1: ','
            {
             before(grammarAccess.getFeaturesDeclAccess().getCommaKeyword_3_2_0()); 
            match(input,16,FOLLOW_16_in_rule__FeaturesDecl__Group_3_2__0__Impl3446); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1691:1: rule__FeaturesDecl__Group_3_2__1 : rule__FeaturesDecl__Group_3_2__1__Impl ;
    public final void rule__FeaturesDecl__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1695:1: ( rule__FeaturesDecl__Group_3_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1696:2: rule__FeaturesDecl__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__Group_3_2__1__Impl_in_rule__FeaturesDecl__Group_3_2__13477);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1702:1: rule__FeaturesDecl__Group_3_2__1__Impl : ( ( rule__FeaturesDecl__SupersAssignment_3_2_1 ) ) ;
    public final void rule__FeaturesDecl__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1706:1: ( ( ( rule__FeaturesDecl__SupersAssignment_3_2_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1707:1: ( ( rule__FeaturesDecl__SupersAssignment_3_2_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1707:1: ( ( rule__FeaturesDecl__SupersAssignment_3_2_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1708:1: ( rule__FeaturesDecl__SupersAssignment_3_2_1 )
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersAssignment_3_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1709:1: ( rule__FeaturesDecl__SupersAssignment_3_2_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1709:2: rule__FeaturesDecl__SupersAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__FeaturesDecl__SupersAssignment_3_2_1_in_rule__FeaturesDecl__Group_3_2__1__Impl3504);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1723:1: rule__FeaturesBody__Group__0 : rule__FeaturesBody__Group__0__Impl rule__FeaturesBody__Group__1 ;
    public final void rule__FeaturesBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1727:1: ( rule__FeaturesBody__Group__0__Impl rule__FeaturesBody__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1728:2: rule__FeaturesBody__Group__0__Impl rule__FeaturesBody__Group__1
            {
            pushFollow(FOLLOW_rule__FeaturesBody__Group__0__Impl_in_rule__FeaturesBody__Group__03538);
            rule__FeaturesBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesBody__Group__1_in_rule__FeaturesBody__Group__03541);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1735:1: rule__FeaturesBody__Group__0__Impl : ( '{' ) ;
    public final void rule__FeaturesBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1739:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1740:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1740:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1741:1: '{'
            {
             before(grammarAccess.getFeaturesBodyAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__FeaturesBody__Group__0__Impl3569); 
             after(grammarAccess.getFeaturesBodyAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__FeaturesBody__Group__0__Impl"


    // $ANTLR start "rule__FeaturesBody__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1754:1: rule__FeaturesBody__Group__1 : rule__FeaturesBody__Group__1__Impl rule__FeaturesBody__Group__2 ;
    public final void rule__FeaturesBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1758:1: ( rule__FeaturesBody__Group__1__Impl rule__FeaturesBody__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1759:2: rule__FeaturesBody__Group__1__Impl rule__FeaturesBody__Group__2
            {
            pushFollow(FOLLOW_rule__FeaturesBody__Group__1__Impl_in_rule__FeaturesBody__Group__13600);
            rule__FeaturesBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesBody__Group__2_in_rule__FeaturesBody__Group__13603);
            rule__FeaturesBody__Group__2();

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1766:1: rule__FeaturesBody__Group__1__Impl : ( () ) ;
    public final void rule__FeaturesBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1770:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1771:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1771:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1772:1: ()
            {
             before(grammarAccess.getFeaturesBodyAccess().getFeaturesBodyAction_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1773:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1775:1: 
            {
            }

             after(grammarAccess.getFeaturesBodyAccess().getFeaturesBodyAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturesBody__Group__1__Impl"


    // $ANTLR start "rule__FeaturesBody__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1785:1: rule__FeaturesBody__Group__2 : rule__FeaturesBody__Group__2__Impl rule__FeaturesBody__Group__3 ;
    public final void rule__FeaturesBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1789:1: ( rule__FeaturesBody__Group__2__Impl rule__FeaturesBody__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1790:2: rule__FeaturesBody__Group__2__Impl rule__FeaturesBody__Group__3
            {
            pushFollow(FOLLOW_rule__FeaturesBody__Group__2__Impl_in_rule__FeaturesBody__Group__23661);
            rule__FeaturesBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturesBody__Group__3_in_rule__FeaturesBody__Group__23664);
            rule__FeaturesBody__Group__3();

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
    // $ANTLR end "rule__FeaturesBody__Group__2"


    // $ANTLR start "rule__FeaturesBody__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1797:1: rule__FeaturesBody__Group__2__Impl : ( ( rule__FeaturesBody__FeaturesAssignment_2 )* ) ;
    public final void rule__FeaturesBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1801:1: ( ( ( rule__FeaturesBody__FeaturesAssignment_2 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1802:1: ( ( rule__FeaturesBody__FeaturesAssignment_2 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1802:1: ( ( rule__FeaturesBody__FeaturesAssignment_2 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1803:1: ( rule__FeaturesBody__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getFeaturesBodyAccess().getFeaturesAssignment_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1804:1: ( rule__FeaturesBody__FeaturesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=10 && LA20_0<=13)||LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1804:2: rule__FeaturesBody__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__FeaturesBody__FeaturesAssignment_2_in_rule__FeaturesBody__Group__2__Impl3691);
            	    rule__FeaturesBody__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFeaturesBodyAccess().getFeaturesAssignment_2()); 

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
    // $ANTLR end "rule__FeaturesBody__Group__2__Impl"


    // $ANTLR start "rule__FeaturesBody__Group__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1814:1: rule__FeaturesBody__Group__3 : rule__FeaturesBody__Group__3__Impl ;
    public final void rule__FeaturesBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1818:1: ( rule__FeaturesBody__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1819:2: rule__FeaturesBody__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FeaturesBody__Group__3__Impl_in_rule__FeaturesBody__Group__33722);
            rule__FeaturesBody__Group__3__Impl();

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
    // $ANTLR end "rule__FeaturesBody__Group__3"


    // $ANTLR start "rule__FeaturesBody__Group__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1825:1: rule__FeaturesBody__Group__3__Impl : ( '}' ) ;
    public final void rule__FeaturesBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1829:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1830:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1830:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1831:1: '}'
            {
             before(grammarAccess.getFeaturesBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__FeaturesBody__Group__3__Impl3750); 
             after(grammarAccess.getFeaturesBodyAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__FeaturesBody__Group__3__Impl"


    // $ANTLR start "rule__MultiplicityInvariantDecl__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1852:1: rule__MultiplicityInvariantDecl__Group__0 : rule__MultiplicityInvariantDecl__Group__0__Impl rule__MultiplicityInvariantDecl__Group__1 ;
    public final void rule__MultiplicityInvariantDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1856:1: ( rule__MultiplicityInvariantDecl__Group__0__Impl rule__MultiplicityInvariantDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1857:2: rule__MultiplicityInvariantDecl__Group__0__Impl rule__MultiplicityInvariantDecl__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__0__Impl_in_rule__MultiplicityInvariantDecl__Group__03789);
            rule__MultiplicityInvariantDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__1_in_rule__MultiplicityInvariantDecl__Group__03792);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1864:1: rule__MultiplicityInvariantDecl__Group__0__Impl : ( 'inv' ) ;
    public final void rule__MultiplicityInvariantDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1868:1: ( ( 'inv' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1869:1: ( 'inv' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1869:1: ( 'inv' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1870:1: 'inv'
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getInvKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__MultiplicityInvariantDecl__Group__0__Impl3820); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1883:1: rule__MultiplicityInvariantDecl__Group__1 : rule__MultiplicityInvariantDecl__Group__1__Impl rule__MultiplicityInvariantDecl__Group__2 ;
    public final void rule__MultiplicityInvariantDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1887:1: ( rule__MultiplicityInvariantDecl__Group__1__Impl rule__MultiplicityInvariantDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1888:2: rule__MultiplicityInvariantDecl__Group__1__Impl rule__MultiplicityInvariantDecl__Group__2
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__1__Impl_in_rule__MultiplicityInvariantDecl__Group__13851);
            rule__MultiplicityInvariantDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__2_in_rule__MultiplicityInvariantDecl__Group__13854);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1895:1: rule__MultiplicityInvariantDecl__Group__1__Impl : ( ( rule__MultiplicityInvariantDecl__Group_1__0 )? ) ;
    public final void rule__MultiplicityInvariantDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1899:1: ( ( ( rule__MultiplicityInvariantDecl__Group_1__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1900:1: ( ( rule__MultiplicityInvariantDecl__Group_1__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1900:1: ( ( rule__MultiplicityInvariantDecl__Group_1__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1901:1: ( rule__MultiplicityInvariantDecl__Group_1__0 )?
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1902:1: ( rule__MultiplicityInvariantDecl__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1902:2: rule__MultiplicityInvariantDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_1__0_in_rule__MultiplicityInvariantDecl__Group__1__Impl3881);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1912:1: rule__MultiplicityInvariantDecl__Group__2 : rule__MultiplicityInvariantDecl__Group__2__Impl rule__MultiplicityInvariantDecl__Group__3 ;
    public final void rule__MultiplicityInvariantDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1916:1: ( rule__MultiplicityInvariantDecl__Group__2__Impl rule__MultiplicityInvariantDecl__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1917:2: rule__MultiplicityInvariantDecl__Group__2__Impl rule__MultiplicityInvariantDecl__Group__3
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__2__Impl_in_rule__MultiplicityInvariantDecl__Group__23912);
            rule__MultiplicityInvariantDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__3_in_rule__MultiplicityInvariantDecl__Group__23915);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1924:1: rule__MultiplicityInvariantDecl__Group__2__Impl : ( ( rule__MultiplicityInvariantDecl__Group_2__0 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1928:1: ( ( ( rule__MultiplicityInvariantDecl__Group_2__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1929:1: ( ( rule__MultiplicityInvariantDecl__Group_2__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1929:1: ( ( rule__MultiplicityInvariantDecl__Group_2__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1930:1: ( rule__MultiplicityInvariantDecl__Group_2__0 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1931:1: ( rule__MultiplicityInvariantDecl__Group_2__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1931:2: rule__MultiplicityInvariantDecl__Group_2__0
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__0_in_rule__MultiplicityInvariantDecl__Group__2__Impl3942);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1941:1: rule__MultiplicityInvariantDecl__Group__3 : rule__MultiplicityInvariantDecl__Group__3__Impl rule__MultiplicityInvariantDecl__Group__4 ;
    public final void rule__MultiplicityInvariantDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1945:1: ( rule__MultiplicityInvariantDecl__Group__3__Impl rule__MultiplicityInvariantDecl__Group__4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1946:2: rule__MultiplicityInvariantDecl__Group__3__Impl rule__MultiplicityInvariantDecl__Group__4
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__3__Impl_in_rule__MultiplicityInvariantDecl__Group__33972);
            rule__MultiplicityInvariantDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__4_in_rule__MultiplicityInvariantDecl__Group__33975);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1953:1: rule__MultiplicityInvariantDecl__Group__3__Impl : ( ( rule__MultiplicityInvariantDecl__MatchAssignment_3 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1957:1: ( ( ( rule__MultiplicityInvariantDecl__MatchAssignment_3 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1958:1: ( ( rule__MultiplicityInvariantDecl__MatchAssignment_3 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1958:1: ( ( rule__MultiplicityInvariantDecl__MatchAssignment_3 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1959:1: ( rule__MultiplicityInvariantDecl__MatchAssignment_3 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchAssignment_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1960:1: ( rule__MultiplicityInvariantDecl__MatchAssignment_3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1960:2: rule__MultiplicityInvariantDecl__MatchAssignment_3
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__MatchAssignment_3_in_rule__MultiplicityInvariantDecl__Group__3__Impl4002);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1970:1: rule__MultiplicityInvariantDecl__Group__4 : rule__MultiplicityInvariantDecl__Group__4__Impl ;
    public final void rule__MultiplicityInvariantDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1974:1: ( rule__MultiplicityInvariantDecl__Group__4__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1975:2: rule__MultiplicityInvariantDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group__4__Impl_in_rule__MultiplicityInvariantDecl__Group__44032);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1981:1: rule__MultiplicityInvariantDecl__Group__4__Impl : ( ( rule__MultiplicityInvariantDecl__Group_4__0 )? ) ;
    public final void rule__MultiplicityInvariantDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1985:1: ( ( ( rule__MultiplicityInvariantDecl__Group_4__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1986:1: ( ( rule__MultiplicityInvariantDecl__Group_4__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1986:1: ( ( rule__MultiplicityInvariantDecl__Group_4__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1987:1: ( rule__MultiplicityInvariantDecl__Group_4__0 )?
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_4()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1988:1: ( rule__MultiplicityInvariantDecl__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1988:2: rule__MultiplicityInvariantDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_4__0_in_rule__MultiplicityInvariantDecl__Group__4__Impl4059);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2008:1: rule__MultiplicityInvariantDecl__Group_1__0 : rule__MultiplicityInvariantDecl__Group_1__0__Impl rule__MultiplicityInvariantDecl__Group_1__1 ;
    public final void rule__MultiplicityInvariantDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2012:1: ( rule__MultiplicityInvariantDecl__Group_1__0__Impl rule__MultiplicityInvariantDecl__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2013:2: rule__MultiplicityInvariantDecl__Group_1__0__Impl rule__MultiplicityInvariantDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_1__0__Impl_in_rule__MultiplicityInvariantDecl__Group_1__04100);
            rule__MultiplicityInvariantDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_1__1_in_rule__MultiplicityInvariantDecl__Group_1__04103);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2020:1: rule__MultiplicityInvariantDecl__Group_1__0__Impl : ( ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2024:1: ( ( ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2025:1: ( ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2025:1: ( ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2026:1: ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getInvNameAssignment_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2027:1: ( rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2027:2: rule__MultiplicityInvariantDecl__InvNameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__InvNameAssignment_1_0_in_rule__MultiplicityInvariantDecl__Group_1__0__Impl4130);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2037:1: rule__MultiplicityInvariantDecl__Group_1__1 : rule__MultiplicityInvariantDecl__Group_1__1__Impl ;
    public final void rule__MultiplicityInvariantDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2041:1: ( rule__MultiplicityInvariantDecl__Group_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2042:2: rule__MultiplicityInvariantDecl__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_1__1__Impl_in_rule__MultiplicityInvariantDecl__Group_1__14160);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2048:1: rule__MultiplicityInvariantDecl__Group_1__1__Impl : ( ':' ) ;
    public final void rule__MultiplicityInvariantDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2052:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2053:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2053:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2054:1: ':'
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__MultiplicityInvariantDecl__Group_1__1__Impl4188); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2071:1: rule__MultiplicityInvariantDecl__Group_2__0 : rule__MultiplicityInvariantDecl__Group_2__0__Impl rule__MultiplicityInvariantDecl__Group_2__1 ;
    public final void rule__MultiplicityInvariantDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2075:1: ( rule__MultiplicityInvariantDecl__Group_2__0__Impl rule__MultiplicityInvariantDecl__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2076:2: rule__MultiplicityInvariantDecl__Group_2__0__Impl rule__MultiplicityInvariantDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__0__Impl_in_rule__MultiplicityInvariantDecl__Group_2__04223);
            rule__MultiplicityInvariantDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__1_in_rule__MultiplicityInvariantDecl__Group_2__04226);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2083:1: rule__MultiplicityInvariantDecl__Group_2__0__Impl : ( ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2087:1: ( ( ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2088:1: ( ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2088:1: ( ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2089:1: ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getLoAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2090:1: ( rule__MultiplicityInvariantDecl__LoAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2090:2: rule__MultiplicityInvariantDecl__LoAssignment_2_0
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__LoAssignment_2_0_in_rule__MultiplicityInvariantDecl__Group_2__0__Impl4253);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2100:1: rule__MultiplicityInvariantDecl__Group_2__1 : rule__MultiplicityInvariantDecl__Group_2__1__Impl rule__MultiplicityInvariantDecl__Group_2__2 ;
    public final void rule__MultiplicityInvariantDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2104:1: ( rule__MultiplicityInvariantDecl__Group_2__1__Impl rule__MultiplicityInvariantDecl__Group_2__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2105:2: rule__MultiplicityInvariantDecl__Group_2__1__Impl rule__MultiplicityInvariantDecl__Group_2__2
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__1__Impl_in_rule__MultiplicityInvariantDecl__Group_2__14283);
            rule__MultiplicityInvariantDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__2_in_rule__MultiplicityInvariantDecl__Group_2__14286);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2112:1: rule__MultiplicityInvariantDecl__Group_2__1__Impl : ( '..' ) ;
    public final void rule__MultiplicityInvariantDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2116:1: ( ( '..' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2117:1: ( '..' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2117:1: ( '..' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2118:1: '..'
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getFullStopFullStopKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__MultiplicityInvariantDecl__Group_2__1__Impl4314); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2131:1: rule__MultiplicityInvariantDecl__Group_2__2 : rule__MultiplicityInvariantDecl__Group_2__2__Impl ;
    public final void rule__MultiplicityInvariantDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2135:1: ( rule__MultiplicityInvariantDecl__Group_2__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2136:2: rule__MultiplicityInvariantDecl__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_2__2__Impl_in_rule__MultiplicityInvariantDecl__Group_2__24345);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2142:1: rule__MultiplicityInvariantDecl__Group_2__2__Impl : ( ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2146:1: ( ( ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2147:1: ( ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2147:1: ( ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2148:1: ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getHiAssignment_2_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2149:1: ( rule__MultiplicityInvariantDecl__HiAssignment_2_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2149:2: rule__MultiplicityInvariantDecl__HiAssignment_2_2
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__HiAssignment_2_2_in_rule__MultiplicityInvariantDecl__Group_2__2__Impl4372);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2165:1: rule__MultiplicityInvariantDecl__Group_4__0 : rule__MultiplicityInvariantDecl__Group_4__0__Impl rule__MultiplicityInvariantDecl__Group_4__1 ;
    public final void rule__MultiplicityInvariantDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2169:1: ( rule__MultiplicityInvariantDecl__Group_4__0__Impl rule__MultiplicityInvariantDecl__Group_4__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2170:2: rule__MultiplicityInvariantDecl__Group_4__0__Impl rule__MultiplicityInvariantDecl__Group_4__1
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_4__0__Impl_in_rule__MultiplicityInvariantDecl__Group_4__04408);
            rule__MultiplicityInvariantDecl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_4__1_in_rule__MultiplicityInvariantDecl__Group_4__04411);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2177:1: rule__MultiplicityInvariantDecl__Group_4__0__Impl : ( ':' ) ;
    public final void rule__MultiplicityInvariantDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2181:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2182:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2182:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2183:1: ':'
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getColonKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__MultiplicityInvariantDecl__Group_4__0__Impl4439); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2196:1: rule__MultiplicityInvariantDecl__Group_4__1 : rule__MultiplicityInvariantDecl__Group_4__1__Impl ;
    public final void rule__MultiplicityInvariantDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2200:1: ( rule__MultiplicityInvariantDecl__Group_4__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2201:2: rule__MultiplicityInvariantDecl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__Group_4__1__Impl_in_rule__MultiplicityInvariantDecl__Group_4__14470);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2207:1: rule__MultiplicityInvariantDecl__Group_4__1__Impl : ( ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 ) ) ;
    public final void rule__MultiplicityInvariantDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2211:1: ( ( ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2212:1: ( ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2212:1: ( ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2213:1: ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeAssignment_4_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2214:1: ( rule__MultiplicityInvariantDecl__TypeAssignment_4_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2214:2: rule__MultiplicityInvariantDecl__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MultiplicityInvariantDecl__TypeAssignment_4_1_in_rule__MultiplicityInvariantDecl__Group_4__1__Impl4497);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2228:1: rule__SubFeaturesMatch__Group__0 : rule__SubFeaturesMatch__Group__0__Impl rule__SubFeaturesMatch__Group__1 ;
    public final void rule__SubFeaturesMatch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2232:1: ( rule__SubFeaturesMatch__Group__0__Impl rule__SubFeaturesMatch__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2233:2: rule__SubFeaturesMatch__Group__0__Impl rule__SubFeaturesMatch__Group__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__0__Impl_in_rule__SubFeaturesMatch__Group__04531);
            rule__SubFeaturesMatch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__1_in_rule__SubFeaturesMatch__Group__04534);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2240:1: rule__SubFeaturesMatch__Group__0__Impl : ( () ) ;
    public final void rule__SubFeaturesMatch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2244:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2245:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2245:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2246:1: ()
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getSubFeaturesMatchAction_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2247:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2249:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2259:1: rule__SubFeaturesMatch__Group__1 : rule__SubFeaturesMatch__Group__1__Impl rule__SubFeaturesMatch__Group__2 ;
    public final void rule__SubFeaturesMatch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2263:1: ( rule__SubFeaturesMatch__Group__1__Impl rule__SubFeaturesMatch__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2264:2: rule__SubFeaturesMatch__Group__1__Impl rule__SubFeaturesMatch__Group__2
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__1__Impl_in_rule__SubFeaturesMatch__Group__14592);
            rule__SubFeaturesMatch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__2_in_rule__SubFeaturesMatch__Group__14595);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2271:1: rule__SubFeaturesMatch__Group__1__Impl : ( ( rule__SubFeaturesMatch__Group_1__0 )* ) ;
    public final void rule__SubFeaturesMatch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2275:1: ( ( ( rule__SubFeaturesMatch__Group_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2276:1: ( ( rule__SubFeaturesMatch__Group_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2276:1: ( ( rule__SubFeaturesMatch__Group_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2277:1: ( rule__SubFeaturesMatch__Group_1__0 )*
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getGroup_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2278:1: ( rule__SubFeaturesMatch__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==23) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2278:2: rule__SubFeaturesMatch__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SubFeaturesMatch__Group_1__0_in_rule__SubFeaturesMatch__Group__1__Impl4622);
            	    rule__SubFeaturesMatch__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSubFeaturesMatchAccess().getGroup_1()); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2288:1: rule__SubFeaturesMatch__Group__2 : rule__SubFeaturesMatch__Group__2__Impl ;
    public final void rule__SubFeaturesMatch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2292:1: ( rule__SubFeaturesMatch__Group__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2293:2: rule__SubFeaturesMatch__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group__2__Impl_in_rule__SubFeaturesMatch__Group__24653);
            rule__SubFeaturesMatch__Group__2__Impl();

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2299:1: rule__SubFeaturesMatch__Group__2__Impl : ( ( rule__SubFeaturesMatch__Alternatives_2 ) ) ;
    public final void rule__SubFeaturesMatch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2303:1: ( ( ( rule__SubFeaturesMatch__Alternatives_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2304:1: ( ( rule__SubFeaturesMatch__Alternatives_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2304:1: ( ( rule__SubFeaturesMatch__Alternatives_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2305:1: ( rule__SubFeaturesMatch__Alternatives_2 )
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getAlternatives_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2306:1: ( rule__SubFeaturesMatch__Alternatives_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2306:2: rule__SubFeaturesMatch__Alternatives_2
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Alternatives_2_in_rule__SubFeaturesMatch__Group__2__Impl4680);
            rule__SubFeaturesMatch__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesMatchAccess().getAlternatives_2()); 

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


    // $ANTLR start "rule__SubFeaturesMatch__Group_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2322:1: rule__SubFeaturesMatch__Group_1__0 : rule__SubFeaturesMatch__Group_1__0__Impl rule__SubFeaturesMatch__Group_1__1 ;
    public final void rule__SubFeaturesMatch__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2326:1: ( rule__SubFeaturesMatch__Group_1__0__Impl rule__SubFeaturesMatch__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2327:2: rule__SubFeaturesMatch__Group_1__0__Impl rule__SubFeaturesMatch__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group_1__0__Impl_in_rule__SubFeaturesMatch__Group_1__04716);
            rule__SubFeaturesMatch__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group_1__1_in_rule__SubFeaturesMatch__Group_1__04719);
            rule__SubFeaturesMatch__Group_1__1();

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
    // $ANTLR end "rule__SubFeaturesMatch__Group_1__0"


    // $ANTLR start "rule__SubFeaturesMatch__Group_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2334:1: rule__SubFeaturesMatch__Group_1__0__Impl : ( ( rule__SubFeaturesMatch__CategoryNamesAssignment_1_0 ) ) ;
    public final void rule__SubFeaturesMatch__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2338:1: ( ( ( rule__SubFeaturesMatch__CategoryNamesAssignment_1_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2339:1: ( ( rule__SubFeaturesMatch__CategoryNamesAssignment_1_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2339:1: ( ( rule__SubFeaturesMatch__CategoryNamesAssignment_1_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2340:1: ( rule__SubFeaturesMatch__CategoryNamesAssignment_1_0 )
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getCategoryNamesAssignment_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2341:1: ( rule__SubFeaturesMatch__CategoryNamesAssignment_1_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2341:2: rule__SubFeaturesMatch__CategoryNamesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__CategoryNamesAssignment_1_0_in_rule__SubFeaturesMatch__Group_1__0__Impl4746);
            rule__SubFeaturesMatch__CategoryNamesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSubFeaturesMatchAccess().getCategoryNamesAssignment_1_0()); 

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
    // $ANTLR end "rule__SubFeaturesMatch__Group_1__0__Impl"


    // $ANTLR start "rule__SubFeaturesMatch__Group_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2351:1: rule__SubFeaturesMatch__Group_1__1 : rule__SubFeaturesMatch__Group_1__1__Impl ;
    public final void rule__SubFeaturesMatch__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2355:1: ( rule__SubFeaturesMatch__Group_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2356:2: rule__SubFeaturesMatch__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesMatch__Group_1__1__Impl_in_rule__SubFeaturesMatch__Group_1__14776);
            rule__SubFeaturesMatch__Group_1__1__Impl();

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
    // $ANTLR end "rule__SubFeaturesMatch__Group_1__1"


    // $ANTLR start "rule__SubFeaturesMatch__Group_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2362:1: rule__SubFeaturesMatch__Group_1__1__Impl : ( '.' ) ;
    public final void rule__SubFeaturesMatch__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2366:1: ( ( '.' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2367:1: ( '.' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2367:1: ( '.' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2368:1: '.'
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getFullStopKeyword_1_1()); 
            match(input,23,FOLLOW_23_in_rule__SubFeaturesMatch__Group_1__1__Impl4804); 
             after(grammarAccess.getSubFeaturesMatchAccess().getFullStopKeyword_1_1()); 

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
    // $ANTLR end "rule__SubFeaturesMatch__Group_1__1__Impl"


    // $ANTLR start "rule__ConstraintNat__Group_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2385:1: rule__ConstraintNat__Group_0__0 : rule__ConstraintNat__Group_0__0__Impl rule__ConstraintNat__Group_0__1 ;
    public final void rule__ConstraintNat__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2389:1: ( rule__ConstraintNat__Group_0__0__Impl rule__ConstraintNat__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2390:2: rule__ConstraintNat__Group_0__0__Impl rule__ConstraintNat__Group_0__1
            {
            pushFollow(FOLLOW_rule__ConstraintNat__Group_0__0__Impl_in_rule__ConstraintNat__Group_0__04839);
            rule__ConstraintNat__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintNat__Group_0__1_in_rule__ConstraintNat__Group_0__04842);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2397:1: rule__ConstraintNat__Group_0__0__Impl : ( () ) ;
    public final void rule__ConstraintNat__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2401:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2402:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2402:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2403:1: ()
            {
             before(grammarAccess.getConstraintNatAccess().getNumNatConstraintAction_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2404:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2406:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2416:1: rule__ConstraintNat__Group_0__1 : rule__ConstraintNat__Group_0__1__Impl ;
    public final void rule__ConstraintNat__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2420:1: ( rule__ConstraintNat__Group_0__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2421:2: rule__ConstraintNat__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintNat__Group_0__1__Impl_in_rule__ConstraintNat__Group_0__14900);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2427:1: rule__ConstraintNat__Group_0__1__Impl : ( ( rule__ConstraintNat__NumAssignment_0_1 ) ) ;
    public final void rule__ConstraintNat__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2431:1: ( ( ( rule__ConstraintNat__NumAssignment_0_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2432:1: ( ( rule__ConstraintNat__NumAssignment_0_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2432:1: ( ( rule__ConstraintNat__NumAssignment_0_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2433:1: ( rule__ConstraintNat__NumAssignment_0_1 )
            {
             before(grammarAccess.getConstraintNatAccess().getNumAssignment_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2434:1: ( rule__ConstraintNat__NumAssignment_0_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2434:2: rule__ConstraintNat__NumAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ConstraintNat__NumAssignment_0_1_in_rule__ConstraintNat__Group_0__1__Impl4927);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2448:1: rule__ConstraintNat__Group_1__0 : rule__ConstraintNat__Group_1__0__Impl rule__ConstraintNat__Group_1__1 ;
    public final void rule__ConstraintNat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2452:1: ( rule__ConstraintNat__Group_1__0__Impl rule__ConstraintNat__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2453:2: rule__ConstraintNat__Group_1__0__Impl rule__ConstraintNat__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintNat__Group_1__0__Impl_in_rule__ConstraintNat__Group_1__04961);
            rule__ConstraintNat__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintNat__Group_1__1_in_rule__ConstraintNat__Group_1__04964);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2460:1: rule__ConstraintNat__Group_1__0__Impl : ( () ) ;
    public final void rule__ConstraintNat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2464:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2465:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2465:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2466:1: ()
            {
             before(grammarAccess.getConstraintNatAccess().getAnyNatConstraintAction_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2467:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2469:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2479:1: rule__ConstraintNat__Group_1__1 : rule__ConstraintNat__Group_1__1__Impl ;
    public final void rule__ConstraintNat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2483:1: ( rule__ConstraintNat__Group_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2484:2: rule__ConstraintNat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintNat__Group_1__1__Impl_in_rule__ConstraintNat__Group_1__15022);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2490:1: rule__ConstraintNat__Group_1__1__Impl : ( '*' ) ;
    public final void rule__ConstraintNat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2494:1: ( ( '*' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2495:1: ( '*' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2495:1: ( '*' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2496:1: '*'
            {
             before(grammarAccess.getConstraintNatAccess().getAsteriskKeyword_1_1()); 
            match(input,24,FOLLOW_24_in_rule__ConstraintNat__Group_1__1__Impl5050); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2513:1: rule__AttrDecl__Group__0 : rule__AttrDecl__Group__0__Impl rule__AttrDecl__Group__1 ;
    public final void rule__AttrDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2517:1: ( rule__AttrDecl__Group__0__Impl rule__AttrDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2518:2: rule__AttrDecl__Group__0__Impl rule__AttrDecl__Group__1
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group__0__Impl_in_rule__AttrDecl__Group__05085);
            rule__AttrDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrDecl__Group__1_in_rule__AttrDecl__Group__05088);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2525:1: rule__AttrDecl__Group__0__Impl : ( ( rule__AttrDecl__ModifierAssignment_0 ) ) ;
    public final void rule__AttrDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2529:1: ( ( ( rule__AttrDecl__ModifierAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2530:1: ( ( rule__AttrDecl__ModifierAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2530:1: ( ( rule__AttrDecl__ModifierAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2531:1: ( rule__AttrDecl__ModifierAssignment_0 )
            {
             before(grammarAccess.getAttrDeclAccess().getModifierAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2532:1: ( rule__AttrDecl__ModifierAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2532:2: rule__AttrDecl__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrDecl__ModifierAssignment_0_in_rule__AttrDecl__Group__0__Impl5115);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2542:1: rule__AttrDecl__Group__1 : rule__AttrDecl__Group__1__Impl rule__AttrDecl__Group__2 ;
    public final void rule__AttrDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2546:1: ( rule__AttrDecl__Group__1__Impl rule__AttrDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2547:2: rule__AttrDecl__Group__1__Impl rule__AttrDecl__Group__2
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group__1__Impl_in_rule__AttrDecl__Group__15145);
            rule__AttrDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrDecl__Group__2_in_rule__AttrDecl__Group__15148);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2554:1: rule__AttrDecl__Group__1__Impl : ( ( rule__AttrDecl__AttributeNameAssignment_1 ) ) ;
    public final void rule__AttrDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2558:1: ( ( ( rule__AttrDecl__AttributeNameAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2559:1: ( ( rule__AttrDecl__AttributeNameAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2559:1: ( ( rule__AttrDecl__AttributeNameAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2560:1: ( rule__AttrDecl__AttributeNameAssignment_1 )
            {
             before(grammarAccess.getAttrDeclAccess().getAttributeNameAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2561:1: ( rule__AttrDecl__AttributeNameAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2561:2: rule__AttrDecl__AttributeNameAssignment_1
            {
            pushFollow(FOLLOW_rule__AttrDecl__AttributeNameAssignment_1_in_rule__AttrDecl__Group__1__Impl5175);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2571:1: rule__AttrDecl__Group__2 : rule__AttrDecl__Group__2__Impl ;
    public final void rule__AttrDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2575:1: ( rule__AttrDecl__Group__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2576:2: rule__AttrDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group__2__Impl_in_rule__AttrDecl__Group__25205);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2582:1: rule__AttrDecl__Group__2__Impl : ( ( rule__AttrDecl__Alternatives_2 ) ) ;
    public final void rule__AttrDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2586:1: ( ( ( rule__AttrDecl__Alternatives_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2587:1: ( ( rule__AttrDecl__Alternatives_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2587:1: ( ( rule__AttrDecl__Alternatives_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2588:1: ( rule__AttrDecl__Alternatives_2 )
            {
             before(grammarAccess.getAttrDeclAccess().getAlternatives_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2589:1: ( rule__AttrDecl__Alternatives_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2589:2: rule__AttrDecl__Alternatives_2
            {
            pushFollow(FOLLOW_rule__AttrDecl__Alternatives_2_in_rule__AttrDecl__Group__2__Impl5232);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2605:1: rule__AttrDecl__Group_2_0__0 : rule__AttrDecl__Group_2_0__0__Impl rule__AttrDecl__Group_2_0__1 ;
    public final void rule__AttrDecl__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2609:1: ( rule__AttrDecl__Group_2_0__0__Impl rule__AttrDecl__Group_2_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2610:2: rule__AttrDecl__Group_2_0__0__Impl rule__AttrDecl__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group_2_0__0__Impl_in_rule__AttrDecl__Group_2_0__05268);
            rule__AttrDecl__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrDecl__Group_2_0__1_in_rule__AttrDecl__Group_2_0__05271);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2617:1: rule__AttrDecl__Group_2_0__0__Impl : ( ':' ) ;
    public final void rule__AttrDecl__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2621:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2622:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2622:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2623:1: ':'
            {
             before(grammarAccess.getAttrDeclAccess().getColonKeyword_2_0_0()); 
            match(input,21,FOLLOW_21_in_rule__AttrDecl__Group_2_0__0__Impl5299); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2636:1: rule__AttrDecl__Group_2_0__1 : rule__AttrDecl__Group_2_0__1__Impl ;
    public final void rule__AttrDecl__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2640:1: ( rule__AttrDecl__Group_2_0__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2641:2: rule__AttrDecl__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group_2_0__1__Impl_in_rule__AttrDecl__Group_2_0__15330);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2647:1: rule__AttrDecl__Group_2_0__1__Impl : ( ( rule__AttrDecl__TypeAssignment_2_0_1 ) ) ;
    public final void rule__AttrDecl__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2651:1: ( ( ( rule__AttrDecl__TypeAssignment_2_0_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2652:1: ( ( rule__AttrDecl__TypeAssignment_2_0_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2652:1: ( ( rule__AttrDecl__TypeAssignment_2_0_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2653:1: ( rule__AttrDecl__TypeAssignment_2_0_1 )
            {
             before(grammarAccess.getAttrDeclAccess().getTypeAssignment_2_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2654:1: ( rule__AttrDecl__TypeAssignment_2_0_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2654:2: rule__AttrDecl__TypeAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__AttrDecl__TypeAssignment_2_0_1_in_rule__AttrDecl__Group_2_0__1__Impl5357);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2668:1: rule__AttrDecl__Group_2_1__0 : rule__AttrDecl__Group_2_1__0__Impl rule__AttrDecl__Group_2_1__1 ;
    public final void rule__AttrDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2672:1: ( rule__AttrDecl__Group_2_1__0__Impl rule__AttrDecl__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2673:2: rule__AttrDecl__Group_2_1__0__Impl rule__AttrDecl__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group_2_1__0__Impl_in_rule__AttrDecl__Group_2_1__05391);
            rule__AttrDecl__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrDecl__Group_2_1__1_in_rule__AttrDecl__Group_2_1__05394);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2680:1: rule__AttrDecl__Group_2_1__0__Impl : ( '=' ) ;
    public final void rule__AttrDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2684:1: ( ( '=' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2685:1: ( '=' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2685:1: ( '=' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2686:1: '='
            {
             before(grammarAccess.getAttrDeclAccess().getEqualsSignKeyword_2_1_0()); 
            match(input,25,FOLLOW_25_in_rule__AttrDecl__Group_2_1__0__Impl5422); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2699:1: rule__AttrDecl__Group_2_1__1 : rule__AttrDecl__Group_2_1__1__Impl ;
    public final void rule__AttrDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2703:1: ( rule__AttrDecl__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2704:2: rule__AttrDecl__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrDecl__Group_2_1__1__Impl_in_rule__AttrDecl__Group_2_1__15453);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2710:1: rule__AttrDecl__Group_2_1__1__Impl : ( ( rule__AttrDecl__LiteralAssignment_2_1_1 ) ) ;
    public final void rule__AttrDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2714:1: ( ( ( rule__AttrDecl__LiteralAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2715:1: ( ( rule__AttrDecl__LiteralAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2715:1: ( ( rule__AttrDecl__LiteralAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2716:1: ( rule__AttrDecl__LiteralAssignment_2_1_1 )
            {
             before(grammarAccess.getAttrDeclAccess().getLiteralAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2717:1: ( rule__AttrDecl__LiteralAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2717:2: rule__AttrDecl__LiteralAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__AttrDecl__LiteralAssignment_2_1_1_in_rule__AttrDecl__Group_2_1__1__Impl5480);
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


    // $ANTLR start "rule__Type__Group_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2731:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2735:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2736:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__05514);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__05517);
            rule__Type__Group_0__1();

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
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2743:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2747:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2748:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2748:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2749:1: ()
            {
             before(grammarAccess.getTypeAccess().getBasicTypeAction_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2750:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2752:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getBasicTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2762:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl rule__Type__Group_0__2 ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2766:1: ( rule__Type__Group_0__1__Impl rule__Type__Group_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2767:2: rule__Type__Group_0__1__Impl rule__Type__Group_0__2
            {
            pushFollow(FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__15575);
            rule__Type__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0__2_in_rule__Type__Group_0__15578);
            rule__Type__Group_0__2();

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
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2774:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__BaseTypeAssignment_0_1 ) ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2778:1: ( ( ( rule__Type__BaseTypeAssignment_0_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2779:1: ( ( rule__Type__BaseTypeAssignment_0_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2779:1: ( ( rule__Type__BaseTypeAssignment_0_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2780:1: ( rule__Type__BaseTypeAssignment_0_1 )
            {
             before(grammarAccess.getTypeAccess().getBaseTypeAssignment_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2781:1: ( rule__Type__BaseTypeAssignment_0_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2781:2: rule__Type__BaseTypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Type__BaseTypeAssignment_0_1_in_rule__Type__Group_0__1__Impl5605);
            rule__Type__BaseTypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getBaseTypeAssignment_0_1()); 

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
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_0__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2791:1: rule__Type__Group_0__2 : rule__Type__Group_0__2__Impl ;
    public final void rule__Type__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2795:1: ( rule__Type__Group_0__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2796:2: rule__Type__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0__2__Impl_in_rule__Type__Group_0__25635);
            rule__Type__Group_0__2__Impl();

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
    // $ANTLR end "rule__Type__Group_0__2"


    // $ANTLR start "rule__Type__Group_0__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2802:1: rule__Type__Group_0__2__Impl : ( ( rule__Type__Alternatives_0_2 )* ) ;
    public final void rule__Type__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2806:1: ( ( ( rule__Type__Alternatives_0_2 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2807:1: ( ( rule__Type__Alternatives_0_2 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2807:1: ( ( rule__Type__Alternatives_0_2 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2808:1: ( rule__Type__Alternatives_0_2 )*
            {
             before(grammarAccess.getTypeAccess().getAlternatives_0_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2809:1: ( rule__Type__Alternatives_0_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17||LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2809:2: rule__Type__Alternatives_0_2
            	    {
            	    pushFollow(FOLLOW_rule__Type__Alternatives_0_2_in_rule__Type__Group_0__2__Impl5662);
            	    rule__Type__Alternatives_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getAlternatives_0_2()); 

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
    // $ANTLR end "rule__Type__Group_0__2__Impl"


    // $ANTLR start "rule__Type__Group_0_2_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2825:1: rule__Type__Group_0_2_0__0 : rule__Type__Group_0_2_0__0__Impl rule__Type__Group_0_2_0__1 ;
    public final void rule__Type__Group_0_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2829:1: ( rule__Type__Group_0_2_0__0__Impl rule__Type__Group_0_2_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2830:2: rule__Type__Group_0_2_0__0__Impl rule__Type__Group_0_2_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_0__0__Impl_in_rule__Type__Group_0_2_0__05699);
            rule__Type__Group_0_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_2_0__1_in_rule__Type__Group_0_2_0__05702);
            rule__Type__Group_0_2_0__1();

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
    // $ANTLR end "rule__Type__Group_0_2_0__0"


    // $ANTLR start "rule__Type__Group_0_2_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2837:1: rule__Type__Group_0_2_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2841:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2842:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2842:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2843:1: ()
            {
             before(grammarAccess.getTypeAccess().getListTypeBaseAction_0_2_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2844:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2846:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getListTypeBaseAction_0_2_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_2_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0_2_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2856:1: rule__Type__Group_0_2_0__1 : rule__Type__Group_0_2_0__1__Impl rule__Type__Group_0_2_0__2 ;
    public final void rule__Type__Group_0_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2860:1: ( rule__Type__Group_0_2_0__1__Impl rule__Type__Group_0_2_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2861:2: rule__Type__Group_0_2_0__1__Impl rule__Type__Group_0_2_0__2
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_0__1__Impl_in_rule__Type__Group_0_2_0__15760);
            rule__Type__Group_0_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_2_0__2_in_rule__Type__Group_0_2_0__15763);
            rule__Type__Group_0_2_0__2();

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
    // $ANTLR end "rule__Type__Group_0_2_0__1"


    // $ANTLR start "rule__Type__Group_0_2_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2868:1: rule__Type__Group_0_2_0__1__Impl : ( '[' ) ;
    public final void rule__Type__Group_0_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2872:1: ( ( '[' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2873:1: ( '[' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2873:1: ( '[' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2874:1: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_2_0_1()); 
            match(input,26,FOLLOW_26_in_rule__Type__Group_0_2_0__1__Impl5791); 
             after(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_2_0_1()); 

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
    // $ANTLR end "rule__Type__Group_0_2_0__1__Impl"


    // $ANTLR start "rule__Type__Group_0_2_0__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2887:1: rule__Type__Group_0_2_0__2 : rule__Type__Group_0_2_0__2__Impl ;
    public final void rule__Type__Group_0_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2891:1: ( rule__Type__Group_0_2_0__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2892:2: rule__Type__Group_0_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_0__2__Impl_in_rule__Type__Group_0_2_0__25822);
            rule__Type__Group_0_2_0__2__Impl();

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
    // $ANTLR end "rule__Type__Group_0_2_0__2"


    // $ANTLR start "rule__Type__Group_0_2_0__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2898:1: rule__Type__Group_0_2_0__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_0_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2902:1: ( ( ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2903:1: ( ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2903:1: ( ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2904:1: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2_0_2()); 
            match(input,27,FOLLOW_27_in_rule__Type__Group_0_2_0__2__Impl5850); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2_0_2()); 

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
    // $ANTLR end "rule__Type__Group_0_2_0__2__Impl"


    // $ANTLR start "rule__Type__Group_0_2_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2923:1: rule__Type__Group_0_2_1__0 : rule__Type__Group_0_2_1__0__Impl rule__Type__Group_0_2_1__1 ;
    public final void rule__Type__Group_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2927:1: ( rule__Type__Group_0_2_1__0__Impl rule__Type__Group_0_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2928:2: rule__Type__Group_0_2_1__0__Impl rule__Type__Group_0_2_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_1__0__Impl_in_rule__Type__Group_0_2_1__05887);
            rule__Type__Group_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_2_1__1_in_rule__Type__Group_0_2_1__05890);
            rule__Type__Group_0_2_1__1();

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
    // $ANTLR end "rule__Type__Group_0_2_1__0"


    // $ANTLR start "rule__Type__Group_0_2_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2935:1: rule__Type__Group_0_2_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2939:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2940:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2940:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2941:1: ()
            {
             before(grammarAccess.getTypeAccess().getSetTypeBaseAction_0_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2942:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2944:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getSetTypeBaseAction_0_2_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_2_1__0__Impl"


    // $ANTLR start "rule__Type__Group_0_2_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2954:1: rule__Type__Group_0_2_1__1 : rule__Type__Group_0_2_1__1__Impl rule__Type__Group_0_2_1__2 ;
    public final void rule__Type__Group_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2958:1: ( rule__Type__Group_0_2_1__1__Impl rule__Type__Group_0_2_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2959:2: rule__Type__Group_0_2_1__1__Impl rule__Type__Group_0_2_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_1__1__Impl_in_rule__Type__Group_0_2_1__15948);
            rule__Type__Group_0_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_2_1__2_in_rule__Type__Group_0_2_1__15951);
            rule__Type__Group_0_2_1__2();

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
    // $ANTLR end "rule__Type__Group_0_2_1__1"


    // $ANTLR start "rule__Type__Group_0_2_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2966:1: rule__Type__Group_0_2_1__1__Impl : ( '{' ) ;
    public final void rule__Type__Group_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2970:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2971:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2971:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2972:1: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_0_2_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Type__Group_0_2_1__1__Impl5979); 
             after(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_0_2_1_1()); 

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
    // $ANTLR end "rule__Type__Group_0_2_1__1__Impl"


    // $ANTLR start "rule__Type__Group_0_2_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2985:1: rule__Type__Group_0_2_1__2 : rule__Type__Group_0_2_1__2__Impl ;
    public final void rule__Type__Group_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2989:1: ( rule__Type__Group_0_2_1__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2990:2: rule__Type__Group_0_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_1__2__Impl_in_rule__Type__Group_0_2_1__26010);
            rule__Type__Group_0_2_1__2__Impl();

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
    // $ANTLR end "rule__Type__Group_0_2_1__2"


    // $ANTLR start "rule__Type__Group_0_2_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2996:1: rule__Type__Group_0_2_1__2__Impl : ( '}' ) ;
    public final void rule__Type__Group_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3000:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3001:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3001:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3002:1: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_0_2_1_2()); 
            match(input,18,FOLLOW_18_in_rule__Type__Group_0_2_1__2__Impl6038); 
             after(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_0_2_1_2()); 

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
    // $ANTLR end "rule__Type__Group_0_2_1__2__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3021:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3025:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3026:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__06075);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__06078);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3033:1: rule__Type__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3037:1: ( ( '<' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3038:1: ( '<' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3038:1: ( '<' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3039:1: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Type__Group_1__0__Impl6106); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0()); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3052:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3056:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3057:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__16137);
            rule__Type__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__16140);
            rule__Type__Group_1__2();

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3064:1: rule__Type__Group_1__1__Impl : ( () ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3068:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3069:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3069:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3070:1: ()
            {
             before(grammarAccess.getTypeAccess().getTupleTypeAction_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3071:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3073:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getTupleTypeAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3083:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl rule__Type__Group_1__3 ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3087:1: ( rule__Type__Group_1__2__Impl rule__Type__Group_1__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3088:2: rule__Type__Group_1__2__Impl rule__Type__Group_1__3
            {
            pushFollow(FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__26198);
            rule__Type__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__3_in_rule__Type__Group_1__26201);
            rule__Type__Group_1__3();

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
    // $ANTLR end "rule__Type__Group_1__2"


    // $ANTLR start "rule__Type__Group_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3095:1: rule__Type__Group_1__2__Impl : ( ( rule__Type__ElemTypesAssignment_1_2 ) ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3099:1: ( ( ( rule__Type__ElemTypesAssignment_1_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3100:1: ( ( rule__Type__ElemTypesAssignment_1_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3100:1: ( ( rule__Type__ElemTypesAssignment_1_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3101:1: ( rule__Type__ElemTypesAssignment_1_2 )
            {
             before(grammarAccess.getTypeAccess().getElemTypesAssignment_1_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3102:1: ( rule__Type__ElemTypesAssignment_1_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3102:2: rule__Type__ElemTypesAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Type__ElemTypesAssignment_1_2_in_rule__Type__Group_1__2__Impl6228);
            rule__Type__ElemTypesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getElemTypesAssignment_1_2()); 

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
    // $ANTLR end "rule__Type__Group_1__2__Impl"


    // $ANTLR start "rule__Type__Group_1__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3112:1: rule__Type__Group_1__3 : rule__Type__Group_1__3__Impl rule__Type__Group_1__4 ;
    public final void rule__Type__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3116:1: ( rule__Type__Group_1__3__Impl rule__Type__Group_1__4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3117:2: rule__Type__Group_1__3__Impl rule__Type__Group_1__4
            {
            pushFollow(FOLLOW_rule__Type__Group_1__3__Impl_in_rule__Type__Group_1__36258);
            rule__Type__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__4_in_rule__Type__Group_1__36261);
            rule__Type__Group_1__4();

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
    // $ANTLR end "rule__Type__Group_1__3"


    // $ANTLR start "rule__Type__Group_1__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3124:1: rule__Type__Group_1__3__Impl : ( ( ( rule__Type__Group_1_3__0 ) ) ( ( rule__Type__Group_1_3__0 )* ) ) ;
    public final void rule__Type__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3128:1: ( ( ( ( rule__Type__Group_1_3__0 ) ) ( ( rule__Type__Group_1_3__0 )* ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3129:1: ( ( ( rule__Type__Group_1_3__0 ) ) ( ( rule__Type__Group_1_3__0 )* ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3129:1: ( ( ( rule__Type__Group_1_3__0 ) ) ( ( rule__Type__Group_1_3__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3130:1: ( ( rule__Type__Group_1_3__0 ) ) ( ( rule__Type__Group_1_3__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3130:1: ( ( rule__Type__Group_1_3__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3131:1: ( rule__Type__Group_1_3__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup_1_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3132:1: ( rule__Type__Group_1_3__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3132:2: rule__Type__Group_1_3__0
            {
            pushFollow(FOLLOW_rule__Type__Group_1_3__0_in_rule__Type__Group_1__3__Impl6290);
            rule__Type__Group_1_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup_1_3()); 

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3135:1: ( ( rule__Type__Group_1_3__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3136:1: ( rule__Type__Group_1_3__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_1_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3137:1: ( rule__Type__Group_1_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3137:2: rule__Type__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Type__Group_1_3__0_in_rule__Type__Group_1__3__Impl6302);
            	    rule__Type__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__Type__Group_1__3__Impl"


    // $ANTLR start "rule__Type__Group_1__4"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3148:1: rule__Type__Group_1__4 : rule__Type__Group_1__4__Impl ;
    public final void rule__Type__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3152:1: ( rule__Type__Group_1__4__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3153:2: rule__Type__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__4__Impl_in_rule__Type__Group_1__46335);
            rule__Type__Group_1__4__Impl();

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
    // $ANTLR end "rule__Type__Group_1__4"


    // $ANTLR start "rule__Type__Group_1__4__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3159:1: rule__Type__Group_1__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3163:1: ( ( '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3164:1: ( '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3164:1: ( '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3165:1: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_4()); 
            match(input,29,FOLLOW_29_in_rule__Type__Group_1__4__Impl6363); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_4()); 

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
    // $ANTLR end "rule__Type__Group_1__4__Impl"


    // $ANTLR start "rule__Type__Group_1_3__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3188:1: rule__Type__Group_1_3__0 : rule__Type__Group_1_3__0__Impl rule__Type__Group_1_3__1 ;
    public final void rule__Type__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3192:1: ( rule__Type__Group_1_3__0__Impl rule__Type__Group_1_3__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3193:2: rule__Type__Group_1_3__0__Impl rule__Type__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1_3__0__Impl_in_rule__Type__Group_1_3__06404);
            rule__Type__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1_3__1_in_rule__Type__Group_1_3__06407);
            rule__Type__Group_1_3__1();

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
    // $ANTLR end "rule__Type__Group_1_3__0"


    // $ANTLR start "rule__Type__Group_1_3__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3200:1: rule__Type__Group_1_3__0__Impl : ( '*' ) ;
    public final void rule__Type__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3204:1: ( ( '*' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3205:1: ( '*' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3205:1: ( '*' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3206:1: '*'
            {
             before(grammarAccess.getTypeAccess().getAsteriskKeyword_1_3_0()); 
            match(input,24,FOLLOW_24_in_rule__Type__Group_1_3__0__Impl6435); 
             after(grammarAccess.getTypeAccess().getAsteriskKeyword_1_3_0()); 

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
    // $ANTLR end "rule__Type__Group_1_3__0__Impl"


    // $ANTLR start "rule__Type__Group_1_3__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3219:1: rule__Type__Group_1_3__1 : rule__Type__Group_1_3__1__Impl ;
    public final void rule__Type__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3223:1: ( rule__Type__Group_1_3__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3224:2: rule__Type__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1_3__1__Impl_in_rule__Type__Group_1_3__16466);
            rule__Type__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__Type__Group_1_3__1"


    // $ANTLR start "rule__Type__Group_1_3__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3230:1: rule__Type__Group_1_3__1__Impl : ( ( rule__Type__ElemTypesAssignment_1_3_1 ) ) ;
    public final void rule__Type__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3234:1: ( ( ( rule__Type__ElemTypesAssignment_1_3_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3235:1: ( ( rule__Type__ElemTypesAssignment_1_3_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3235:1: ( ( rule__Type__ElemTypesAssignment_1_3_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3236:1: ( rule__Type__ElemTypesAssignment_1_3_1 )
            {
             before(grammarAccess.getTypeAccess().getElemTypesAssignment_1_3_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3237:1: ( rule__Type__ElemTypesAssignment_1_3_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3237:2: rule__Type__ElemTypesAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Type__ElemTypesAssignment_1_3_1_in_rule__Type__Group_1_3__1__Impl6493);
            rule__Type__ElemTypesAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getElemTypesAssignment_1_3_1()); 

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
    // $ANTLR end "rule__Type__Group_1_3__1__Impl"


    // $ANTLR start "rule__BasicLiteral__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3251:1: rule__BasicLiteral__Group__0 : rule__BasicLiteral__Group__0__Impl rule__BasicLiteral__Group__1 ;
    public final void rule__BasicLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3255:1: ( rule__BasicLiteral__Group__0__Impl rule__BasicLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3256:2: rule__BasicLiteral__Group__0__Impl rule__BasicLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BasicLiteral__Group__0__Impl_in_rule__BasicLiteral__Group__06527);
            rule__BasicLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicLiteral__Group__1_in_rule__BasicLiteral__Group__06530);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3263:1: rule__BasicLiteral__Group__0__Impl : ( ( rule__BasicLiteral__TypeConsAssignment_0 ) ) ;
    public final void rule__BasicLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3267:1: ( ( ( rule__BasicLiteral__TypeConsAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3268:1: ( ( rule__BasicLiteral__TypeConsAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3268:1: ( ( rule__BasicLiteral__TypeConsAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3269:1: ( rule__BasicLiteral__TypeConsAssignment_0 )
            {
             before(grammarAccess.getBasicLiteralAccess().getTypeConsAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3270:1: ( rule__BasicLiteral__TypeConsAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3270:2: rule__BasicLiteral__TypeConsAssignment_0
            {
            pushFollow(FOLLOW_rule__BasicLiteral__TypeConsAssignment_0_in_rule__BasicLiteral__Group__0__Impl6557);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3280:1: rule__BasicLiteral__Group__1 : rule__BasicLiteral__Group__1__Impl ;
    public final void rule__BasicLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3284:1: ( rule__BasicLiteral__Group__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3285:2: rule__BasicLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicLiteral__Group__1__Impl_in_rule__BasicLiteral__Group__16587);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3291:1: rule__BasicLiteral__Group__1__Impl : ( ( rule__BasicLiteral__LitAssignment_1 ) ) ;
    public final void rule__BasicLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3295:1: ( ( ( rule__BasicLiteral__LitAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3296:1: ( ( rule__BasicLiteral__LitAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3296:1: ( ( rule__BasicLiteral__LitAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3297:1: ( rule__BasicLiteral__LitAssignment_1 )
            {
             before(grammarAccess.getBasicLiteralAccess().getLitAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3298:1: ( rule__BasicLiteral__LitAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3298:2: rule__BasicLiteral__LitAssignment_1
            {
            pushFollow(FOLLOW_rule__BasicLiteral__LitAssignment_1_in_rule__BasicLiteral__Group__1__Impl6614);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3312:1: rule__TupleLiteral__Group__0 : rule__TupleLiteral__Group__0__Impl rule__TupleLiteral__Group__1 ;
    public final void rule__TupleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3316:1: ( rule__TupleLiteral__Group__0__Impl rule__TupleLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3317:2: rule__TupleLiteral__Group__0__Impl rule__TupleLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__0__Impl_in_rule__TupleLiteral__Group__06648);
            rule__TupleLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group__1_in_rule__TupleLiteral__Group__06651);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3324:1: rule__TupleLiteral__Group__0__Impl : ( '<' ) ;
    public final void rule__TupleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3328:1: ( ( '<' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3329:1: ( '<' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3329:1: ( '<' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3330:1: '<'
            {
             before(grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__TupleLiteral__Group__0__Impl6679); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3343:1: rule__TupleLiteral__Group__1 : rule__TupleLiteral__Group__1__Impl rule__TupleLiteral__Group__2 ;
    public final void rule__TupleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3347:1: ( rule__TupleLiteral__Group__1__Impl rule__TupleLiteral__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3348:2: rule__TupleLiteral__Group__1__Impl rule__TupleLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__1__Impl_in_rule__TupleLiteral__Group__16710);
            rule__TupleLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group__2_in_rule__TupleLiteral__Group__16713);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3355:1: rule__TupleLiteral__Group__1__Impl : ( () ) ;
    public final void rule__TupleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3359:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3360:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3360:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3361:1: ()
            {
             before(grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3362:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3364:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3374:1: rule__TupleLiteral__Group__2 : rule__TupleLiteral__Group__2__Impl rule__TupleLiteral__Group__3 ;
    public final void rule__TupleLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3378:1: ( rule__TupleLiteral__Group__2__Impl rule__TupleLiteral__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3379:2: rule__TupleLiteral__Group__2__Impl rule__TupleLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__2__Impl_in_rule__TupleLiteral__Group__26771);
            rule__TupleLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group__3_in_rule__TupleLiteral__Group__26774);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3386:1: rule__TupleLiteral__Group__2__Impl : ( ( rule__TupleLiteral__Group_2__0 )? ) ;
    public final void rule__TupleLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3390:1: ( ( ( rule__TupleLiteral__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3391:1: ( ( rule__TupleLiteral__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3391:1: ( ( rule__TupleLiteral__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3392:1: ( rule__TupleLiteral__Group_2__0 )?
            {
             before(grammarAccess.getTupleLiteralAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3393:1: ( rule__TupleLiteral__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3393:2: rule__TupleLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TupleLiteral__Group_2__0_in_rule__TupleLiteral__Group__2__Impl6801);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3403:1: rule__TupleLiteral__Group__3 : rule__TupleLiteral__Group__3__Impl ;
    public final void rule__TupleLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3407:1: ( rule__TupleLiteral__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3408:2: rule__TupleLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__3__Impl_in_rule__TupleLiteral__Group__36832);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3414:1: rule__TupleLiteral__Group__3__Impl : ( '>' ) ;
    public final void rule__TupleLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3418:1: ( ( '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3419:1: ( '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3419:1: ( '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3420:1: '>'
            {
             before(grammarAccess.getTupleLiteralAccess().getGreaterThanSignKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__TupleLiteral__Group__3__Impl6860); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3441:1: rule__TupleLiteral__Group_2__0 : rule__TupleLiteral__Group_2__0__Impl rule__TupleLiteral__Group_2__1 ;
    public final void rule__TupleLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3445:1: ( rule__TupleLiteral__Group_2__0__Impl rule__TupleLiteral__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3446:2: rule__TupleLiteral__Group_2__0__Impl rule__TupleLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2__0__Impl_in_rule__TupleLiteral__Group_2__06899);
            rule__TupleLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group_2__1_in_rule__TupleLiteral__Group_2__06902);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3453:1: rule__TupleLiteral__Group_2__0__Impl : ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) ) ;
    public final void rule__TupleLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3457:1: ( ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3458:1: ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3458:1: ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3459:1: ( rule__TupleLiteral__ElemsAssignment_2_0 )
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3460:1: ( rule__TupleLiteral__ElemsAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3460:2: rule__TupleLiteral__ElemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__TupleLiteral__ElemsAssignment_2_0_in_rule__TupleLiteral__Group_2__0__Impl6929);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3470:1: rule__TupleLiteral__Group_2__1 : rule__TupleLiteral__Group_2__1__Impl ;
    public final void rule__TupleLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3474:1: ( rule__TupleLiteral__Group_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3475:2: rule__TupleLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2__1__Impl_in_rule__TupleLiteral__Group_2__16959);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3481:1: rule__TupleLiteral__Group_2__1__Impl : ( ( rule__TupleLiteral__Group_2_1__0 )* ) ;
    public final void rule__TupleLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3485:1: ( ( ( rule__TupleLiteral__Group_2_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3486:1: ( ( rule__TupleLiteral__Group_2_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3486:1: ( ( rule__TupleLiteral__Group_2_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3487:1: ( rule__TupleLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getTupleLiteralAccess().getGroup_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3488:1: ( rule__TupleLiteral__Group_2_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3488:2: rule__TupleLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__0_in_rule__TupleLiteral__Group_2__1__Impl6986);
            	    rule__TupleLiteral__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3502:1: rule__TupleLiteral__Group_2_1__0 : rule__TupleLiteral__Group_2_1__0__Impl rule__TupleLiteral__Group_2_1__1 ;
    public final void rule__TupleLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3506:1: ( rule__TupleLiteral__Group_2_1__0__Impl rule__TupleLiteral__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3507:2: rule__TupleLiteral__Group_2_1__0__Impl rule__TupleLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__0__Impl_in_rule__TupleLiteral__Group_2_1__07021);
            rule__TupleLiteral__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__1_in_rule__TupleLiteral__Group_2_1__07024);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3514:1: rule__TupleLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__TupleLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3518:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3519:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3519:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3520:1: ','
            {
             before(grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_16_in_rule__TupleLiteral__Group_2_1__0__Impl7052); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3533:1: rule__TupleLiteral__Group_2_1__1 : rule__TupleLiteral__Group_2_1__1__Impl ;
    public final void rule__TupleLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3537:1: ( rule__TupleLiteral__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3538:2: rule__TupleLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__1__Impl_in_rule__TupleLiteral__Group_2_1__17083);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3544:1: rule__TupleLiteral__Group_2_1__1__Impl : ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) ) ;
    public final void rule__TupleLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3548:1: ( ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3549:1: ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3549:1: ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3550:1: ( rule__TupleLiteral__ElemsAssignment_2_1_1 )
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3551:1: ( rule__TupleLiteral__ElemsAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3551:2: rule__TupleLiteral__ElemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__ElemsAssignment_2_1_1_in_rule__TupleLiteral__Group_2_1__1__Impl7110);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3565:1: rule__ListLiteral__Group__0 : rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 ;
    public final void rule__ListLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3569:1: ( rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3570:2: rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__07144);
            rule__ListLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__07147);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3577:1: rule__ListLiteral__Group__0__Impl : ( ( rule__ListLiteral__TypeConsAssignment_0 ) ) ;
    public final void rule__ListLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3581:1: ( ( ( rule__ListLiteral__TypeConsAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3582:1: ( ( rule__ListLiteral__TypeConsAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3582:1: ( ( rule__ListLiteral__TypeConsAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3583:1: ( rule__ListLiteral__TypeConsAssignment_0 )
            {
             before(grammarAccess.getListLiteralAccess().getTypeConsAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3584:1: ( rule__ListLiteral__TypeConsAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3584:2: rule__ListLiteral__TypeConsAssignment_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__TypeConsAssignment_0_in_rule__ListLiteral__Group__0__Impl7174);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3594:1: rule__ListLiteral__Group__1 : rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 ;
    public final void rule__ListLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3598:1: ( rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3599:2: rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__17204);
            rule__ListLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__17207);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3606:1: rule__ListLiteral__Group__1__Impl : ( '[' ) ;
    public final void rule__ListLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3610:1: ( ( '[' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3611:1: ( '[' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3611:1: ( '[' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3612:1: '['
            {
             before(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__ListLiteral__Group__1__Impl7235); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3625:1: rule__ListLiteral__Group__2 : rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 ;
    public final void rule__ListLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3629:1: ( rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3630:2: rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__27266);
            rule__ListLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__3_in_rule__ListLiteral__Group__27269);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3637:1: rule__ListLiteral__Group__2__Impl : ( ( rule__ListLiteral__Group_2__0 )? ) ;
    public final void rule__ListLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3641:1: ( ( ( rule__ListLiteral__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3642:1: ( ( rule__ListLiteral__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3642:1: ( ( rule__ListLiteral__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3643:1: ( rule__ListLiteral__Group_2__0 )?
            {
             before(grammarAccess.getListLiteralAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3644:1: ( rule__ListLiteral__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LIT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3644:2: rule__ListLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ListLiteral__Group_2__0_in_rule__ListLiteral__Group__2__Impl7296);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3654:1: rule__ListLiteral__Group__3 : rule__ListLiteral__Group__3__Impl ;
    public final void rule__ListLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3658:1: ( rule__ListLiteral__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3659:2: rule__ListLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__3__Impl_in_rule__ListLiteral__Group__37327);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3665:1: rule__ListLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__ListLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3669:1: ( ( ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3670:1: ( ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3670:1: ( ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3671:1: ']'
            {
             before(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__ListLiteral__Group__3__Impl7355); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3692:1: rule__ListLiteral__Group_2__0 : rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 ;
    public final void rule__ListLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3696:1: ( rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3697:2: rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2__0__Impl_in_rule__ListLiteral__Group_2__07394);
            rule__ListLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_2__1_in_rule__ListLiteral__Group_2__07397);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3704:1: rule__ListLiteral__Group_2__0__Impl : ( ( rule__ListLiteral__ElemsAssignment_2_0 ) ) ;
    public final void rule__ListLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3708:1: ( ( ( rule__ListLiteral__ElemsAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3709:1: ( ( rule__ListLiteral__ElemsAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3709:1: ( ( rule__ListLiteral__ElemsAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3710:1: ( rule__ListLiteral__ElemsAssignment_2_0 )
            {
             before(grammarAccess.getListLiteralAccess().getElemsAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3711:1: ( rule__ListLiteral__ElemsAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3711:2: rule__ListLiteral__ElemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__ElemsAssignment_2_0_in_rule__ListLiteral__Group_2__0__Impl7424);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3721:1: rule__ListLiteral__Group_2__1 : rule__ListLiteral__Group_2__1__Impl ;
    public final void rule__ListLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3725:1: ( rule__ListLiteral__Group_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3726:2: rule__ListLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2__1__Impl_in_rule__ListLiteral__Group_2__17454);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3732:1: rule__ListLiteral__Group_2__1__Impl : ( ( rule__ListLiteral__Group_2_1__0 )* ) ;
    public final void rule__ListLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3736:1: ( ( ( rule__ListLiteral__Group_2_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3737:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3737:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3738:1: ( rule__ListLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getListLiteralAccess().getGroup_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3739:1: ( rule__ListLiteral__Group_2_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3739:2: rule__ListLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__0_in_rule__ListLiteral__Group_2__1__Impl7481);
            	    rule__ListLiteral__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3753:1: rule__ListLiteral__Group_2_1__0 : rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 ;
    public final void rule__ListLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3757:1: ( rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3758:2: rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__0__Impl_in_rule__ListLiteral__Group_2_1__07516);
            rule__ListLiteral__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__1_in_rule__ListLiteral__Group_2_1__07519);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3765:1: rule__ListLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ListLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3769:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3770:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3770:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3771:1: ','
            {
             before(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_16_in_rule__ListLiteral__Group_2_1__0__Impl7547); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3784:1: rule__ListLiteral__Group_2_1__1 : rule__ListLiteral__Group_2_1__1__Impl ;
    public final void rule__ListLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3788:1: ( rule__ListLiteral__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3789:2: rule__ListLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__1__Impl_in_rule__ListLiteral__Group_2_1__17578);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3795:1: rule__ListLiteral__Group_2_1__1__Impl : ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) ) ;
    public final void rule__ListLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3799:1: ( ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3800:1: ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3800:1: ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3801:1: ( rule__ListLiteral__ElemsAssignment_2_1_1 )
            {
             before(grammarAccess.getListLiteralAccess().getElemsAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3802:1: ( rule__ListLiteral__ElemsAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3802:2: rule__ListLiteral__ElemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ListLiteral__ElemsAssignment_2_1_1_in_rule__ListLiteral__Group_2_1__1__Impl7605);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3816:1: rule__SetLiteral__Group__0 : rule__SetLiteral__Group__0__Impl rule__SetLiteral__Group__1 ;
    public final void rule__SetLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3820:1: ( rule__SetLiteral__Group__0__Impl rule__SetLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3821:2: rule__SetLiteral__Group__0__Impl rule__SetLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__0__Impl_in_rule__SetLiteral__Group__07639);
            rule__SetLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group__1_in_rule__SetLiteral__Group__07642);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3828:1: rule__SetLiteral__Group__0__Impl : ( ( rule__SetLiteral__TypeConsAssignment_0 ) ) ;
    public final void rule__SetLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3832:1: ( ( ( rule__SetLiteral__TypeConsAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3833:1: ( ( rule__SetLiteral__TypeConsAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3833:1: ( ( rule__SetLiteral__TypeConsAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3834:1: ( rule__SetLiteral__TypeConsAssignment_0 )
            {
             before(grammarAccess.getSetLiteralAccess().getTypeConsAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3835:1: ( rule__SetLiteral__TypeConsAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3835:2: rule__SetLiteral__TypeConsAssignment_0
            {
            pushFollow(FOLLOW_rule__SetLiteral__TypeConsAssignment_0_in_rule__SetLiteral__Group__0__Impl7669);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3845:1: rule__SetLiteral__Group__1 : rule__SetLiteral__Group__1__Impl rule__SetLiteral__Group__2 ;
    public final void rule__SetLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3849:1: ( rule__SetLiteral__Group__1__Impl rule__SetLiteral__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3850:2: rule__SetLiteral__Group__1__Impl rule__SetLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__1__Impl_in_rule__SetLiteral__Group__17699);
            rule__SetLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group__2_in_rule__SetLiteral__Group__17702);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3857:1: rule__SetLiteral__Group__1__Impl : ( '{' ) ;
    public final void rule__SetLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3861:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3862:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3862:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3863:1: '{'
            {
             before(grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__SetLiteral__Group__1__Impl7730); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3876:1: rule__SetLiteral__Group__2 : rule__SetLiteral__Group__2__Impl rule__SetLiteral__Group__3 ;
    public final void rule__SetLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3880:1: ( rule__SetLiteral__Group__2__Impl rule__SetLiteral__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3881:2: rule__SetLiteral__Group__2__Impl rule__SetLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__2__Impl_in_rule__SetLiteral__Group__27761);
            rule__SetLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group__3_in_rule__SetLiteral__Group__27764);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3888:1: rule__SetLiteral__Group__2__Impl : ( ( rule__SetLiteral__Group_2__0 )? ) ;
    public final void rule__SetLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3892:1: ( ( ( rule__SetLiteral__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3893:1: ( ( rule__SetLiteral__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3893:1: ( ( rule__SetLiteral__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3894:1: ( rule__SetLiteral__Group_2__0 )?
            {
             before(grammarAccess.getSetLiteralAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3895:1: ( rule__SetLiteral__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_LIT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3895:2: rule__SetLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SetLiteral__Group_2__0_in_rule__SetLiteral__Group__2__Impl7791);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3905:1: rule__SetLiteral__Group__3 : rule__SetLiteral__Group__3__Impl ;
    public final void rule__SetLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3909:1: ( rule__SetLiteral__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3910:2: rule__SetLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__3__Impl_in_rule__SetLiteral__Group__37822);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3916:1: rule__SetLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__SetLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3920:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3921:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3921:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3922:1: '}'
            {
             before(grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__SetLiteral__Group__3__Impl7850); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3943:1: rule__SetLiteral__Group_2__0 : rule__SetLiteral__Group_2__0__Impl rule__SetLiteral__Group_2__1 ;
    public final void rule__SetLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3947:1: ( rule__SetLiteral__Group_2__0__Impl rule__SetLiteral__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3948:2: rule__SetLiteral__Group_2__0__Impl rule__SetLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2__0__Impl_in_rule__SetLiteral__Group_2__07889);
            rule__SetLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group_2__1_in_rule__SetLiteral__Group_2__07892);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3955:1: rule__SetLiteral__Group_2__0__Impl : ( ( rule__SetLiteral__ElemsAssignment_2_0 ) ) ;
    public final void rule__SetLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3959:1: ( ( ( rule__SetLiteral__ElemsAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3960:1: ( ( rule__SetLiteral__ElemsAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3960:1: ( ( rule__SetLiteral__ElemsAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3961:1: ( rule__SetLiteral__ElemsAssignment_2_0 )
            {
             before(grammarAccess.getSetLiteralAccess().getElemsAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3962:1: ( rule__SetLiteral__ElemsAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3962:2: rule__SetLiteral__ElemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__SetLiteral__ElemsAssignment_2_0_in_rule__SetLiteral__Group_2__0__Impl7919);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3972:1: rule__SetLiteral__Group_2__1 : rule__SetLiteral__Group_2__1__Impl ;
    public final void rule__SetLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3976:1: ( rule__SetLiteral__Group_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3977:2: rule__SetLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2__1__Impl_in_rule__SetLiteral__Group_2__17949);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3983:1: rule__SetLiteral__Group_2__1__Impl : ( ( rule__SetLiteral__Group_2_1__0 )* ) ;
    public final void rule__SetLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3987:1: ( ( ( rule__SetLiteral__Group_2_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3988:1: ( ( rule__SetLiteral__Group_2_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3988:1: ( ( rule__SetLiteral__Group_2_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3989:1: ( rule__SetLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getSetLiteralAccess().getGroup_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3990:1: ( rule__SetLiteral__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==16) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3990:2: rule__SetLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__0_in_rule__SetLiteral__Group_2__1__Impl7976);
            	    rule__SetLiteral__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4004:1: rule__SetLiteral__Group_2_1__0 : rule__SetLiteral__Group_2_1__0__Impl rule__SetLiteral__Group_2_1__1 ;
    public final void rule__SetLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4008:1: ( rule__SetLiteral__Group_2_1__0__Impl rule__SetLiteral__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4009:2: rule__SetLiteral__Group_2_1__0__Impl rule__SetLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__0__Impl_in_rule__SetLiteral__Group_2_1__08011);
            rule__SetLiteral__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__1_in_rule__SetLiteral__Group_2_1__08014);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4016:1: rule__SetLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SetLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4020:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4021:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4021:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4022:1: ','
            {
             before(grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_16_in_rule__SetLiteral__Group_2_1__0__Impl8042); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4035:1: rule__SetLiteral__Group_2_1__1 : rule__SetLiteral__Group_2_1__1__Impl ;
    public final void rule__SetLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4039:1: ( rule__SetLiteral__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4040:2: rule__SetLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__1__Impl_in_rule__SetLiteral__Group_2_1__18073);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4046:1: rule__SetLiteral__Group_2_1__1__Impl : ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) ) ;
    public final void rule__SetLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4050:1: ( ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4051:1: ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4051:1: ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4052:1: ( rule__SetLiteral__ElemsAssignment_2_1_1 )
            {
             before(grammarAccess.getSetLiteralAccess().getElemsAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4053:1: ( rule__SetLiteral__ElemsAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4053:2: rule__SetLiteral__ElemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__SetLiteral__ElemsAssignment_2_1_1_in_rule__SetLiteral__Group_2_1__1__Impl8100);
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


    // $ANTLR start "rule__SubFeaturesDecl__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4067:1: rule__SubFeaturesDecl__Group__0 : rule__SubFeaturesDecl__Group__0__Impl rule__SubFeaturesDecl__Group__1 ;
    public final void rule__SubFeaturesDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4071:1: ( rule__SubFeaturesDecl__Group__0__Impl rule__SubFeaturesDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4072:2: rule__SubFeaturesDecl__Group__0__Impl rule__SubFeaturesDecl__Group__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__0__Impl_in_rule__SubFeaturesDecl__Group__08134);
            rule__SubFeaturesDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__1_in_rule__SubFeaturesDecl__Group__08137);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4079:1: rule__SubFeaturesDecl__Group__0__Impl : ( ( rule__SubFeaturesDecl__Group_0__0 )* ) ;
    public final void rule__SubFeaturesDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4083:1: ( ( ( rule__SubFeaturesDecl__Group_0__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4084:1: ( ( rule__SubFeaturesDecl__Group_0__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4084:1: ( ( rule__SubFeaturesDecl__Group_0__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4085:1: ( rule__SubFeaturesDecl__Group_0__0 )*
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getGroup_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4086:1: ( rule__SubFeaturesDecl__Group_0__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==23) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4086:2: rule__SubFeaturesDecl__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__SubFeaturesDecl__Group_0__0_in_rule__SubFeaturesDecl__Group__0__Impl8164);
            	    rule__SubFeaturesDecl__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4096:1: rule__SubFeaturesDecl__Group__1 : rule__SubFeaturesDecl__Group__1__Impl rule__SubFeaturesDecl__Group__2 ;
    public final void rule__SubFeaturesDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4100:1: ( rule__SubFeaturesDecl__Group__1__Impl rule__SubFeaturesDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4101:2: rule__SubFeaturesDecl__Group__1__Impl rule__SubFeaturesDecl__Group__2
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__1__Impl_in_rule__SubFeaturesDecl__Group__18195);
            rule__SubFeaturesDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__2_in_rule__SubFeaturesDecl__Group__18198);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4108:1: rule__SubFeaturesDecl__Group__1__Impl : ( ( rule__SubFeaturesDecl__NameAssignment_1 ) ) ;
    public final void rule__SubFeaturesDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4112:1: ( ( ( rule__SubFeaturesDecl__NameAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4113:1: ( ( rule__SubFeaturesDecl__NameAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4113:1: ( ( rule__SubFeaturesDecl__NameAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4114:1: ( rule__SubFeaturesDecl__NameAssignment_1 )
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getNameAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4115:1: ( rule__SubFeaturesDecl__NameAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4115:2: rule__SubFeaturesDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__NameAssignment_1_in_rule__SubFeaturesDecl__Group__1__Impl8225);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4125:1: rule__SubFeaturesDecl__Group__2 : rule__SubFeaturesDecl__Group__2__Impl ;
    public final void rule__SubFeaturesDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4129:1: ( rule__SubFeaturesDecl__Group__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4130:2: rule__SubFeaturesDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group__2__Impl_in_rule__SubFeaturesDecl__Group__28255);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4136:1: rule__SubFeaturesDecl__Group__2__Impl : ( ( rule__SubFeaturesDecl__TypeAssignment_2 ) ) ;
    public final void rule__SubFeaturesDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4140:1: ( ( ( rule__SubFeaturesDecl__TypeAssignment_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4141:1: ( ( rule__SubFeaturesDecl__TypeAssignment_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4141:1: ( ( rule__SubFeaturesDecl__TypeAssignment_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4142:1: ( rule__SubFeaturesDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getTypeAssignment_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4143:1: ( rule__SubFeaturesDecl__TypeAssignment_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4143:2: rule__SubFeaturesDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__TypeAssignment_2_in_rule__SubFeaturesDecl__Group__2__Impl8282);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4159:1: rule__SubFeaturesDecl__Group_0__0 : rule__SubFeaturesDecl__Group_0__0__Impl rule__SubFeaturesDecl__Group_0__1 ;
    public final void rule__SubFeaturesDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4163:1: ( rule__SubFeaturesDecl__Group_0__0__Impl rule__SubFeaturesDecl__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4164:2: rule__SubFeaturesDecl__Group_0__0__Impl rule__SubFeaturesDecl__Group_0__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group_0__0__Impl_in_rule__SubFeaturesDecl__Group_0__08318);
            rule__SubFeaturesDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group_0__1_in_rule__SubFeaturesDecl__Group_0__08321);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4171:1: rule__SubFeaturesDecl__Group_0__0__Impl : ( ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 ) ) ;
    public final void rule__SubFeaturesDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4175:1: ( ( ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4176:1: ( ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4176:1: ( ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4177:1: ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 )
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getCategoryNamesAssignment_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4178:1: ( rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4178:2: rule__SubFeaturesDecl__CategoryNamesAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__CategoryNamesAssignment_0_0_in_rule__SubFeaturesDecl__Group_0__0__Impl8348);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4188:1: rule__SubFeaturesDecl__Group_0__1 : rule__SubFeaturesDecl__Group_0__1__Impl ;
    public final void rule__SubFeaturesDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4192:1: ( rule__SubFeaturesDecl__Group_0__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4193:2: rule__SubFeaturesDecl__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesDecl__Group_0__1__Impl_in_rule__SubFeaturesDecl__Group_0__18378);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4199:1: rule__SubFeaturesDecl__Group_0__1__Impl : ( '.' ) ;
    public final void rule__SubFeaturesDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4203:1: ( ( '.' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4204:1: ( '.' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4204:1: ( '.' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4205:1: '.'
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getFullStopKeyword_0_1()); 
            match(input,23,FOLLOW_23_in_rule__SubFeaturesDecl__Group_0__1__Impl8406); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4222:1: rule__SubFeaturesType__Group_0__0 : rule__SubFeaturesType__Group_0__0__Impl rule__SubFeaturesType__Group_0__1 ;
    public final void rule__SubFeaturesType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4226:1: ( rule__SubFeaturesType__Group_0__0__Impl rule__SubFeaturesType__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4227:2: rule__SubFeaturesType__Group_0__0__Impl rule__SubFeaturesType__Group_0__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__0__Impl_in_rule__SubFeaturesType__Group_0__08441);
            rule__SubFeaturesType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__1_in_rule__SubFeaturesType__Group_0__08444);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4234:1: rule__SubFeaturesType__Group_0__0__Impl : ( ':' ) ;
    public final void rule__SubFeaturesType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4238:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4239:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4239:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4240:1: ':'
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getColonKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__SubFeaturesType__Group_0__0__Impl8472); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4253:1: rule__SubFeaturesType__Group_0__1 : rule__SubFeaturesType__Group_0__1__Impl rule__SubFeaturesType__Group_0__2 ;
    public final void rule__SubFeaturesType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4257:1: ( rule__SubFeaturesType__Group_0__1__Impl rule__SubFeaturesType__Group_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4258:2: rule__SubFeaturesType__Group_0__1__Impl rule__SubFeaturesType__Group_0__2
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__1__Impl_in_rule__SubFeaturesType__Group_0__18503);
            rule__SubFeaturesType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__2_in_rule__SubFeaturesType__Group_0__18506);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4265:1: rule__SubFeaturesType__Group_0__1__Impl : ( () ) ;
    public final void rule__SubFeaturesType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4269:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4270:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4270:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4271:1: ()
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSubGroupTypeRefAction_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4272:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4274:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4284:1: rule__SubFeaturesType__Group_0__2 : rule__SubFeaturesType__Group_0__2__Impl ;
    public final void rule__SubFeaturesType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4288:1: ( rule__SubFeaturesType__Group_0__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4289:2: rule__SubFeaturesType__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_0__2__Impl_in_rule__SubFeaturesType__Group_0__28564);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4295:1: rule__SubFeaturesType__Group_0__2__Impl : ( ( rule__SubFeaturesType__TypeAssignment_0_2 ) ) ;
    public final void rule__SubFeaturesType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4299:1: ( ( ( rule__SubFeaturesType__TypeAssignment_0_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4300:1: ( ( rule__SubFeaturesType__TypeAssignment_0_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4300:1: ( ( rule__SubFeaturesType__TypeAssignment_0_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4301:1: ( rule__SubFeaturesType__TypeAssignment_0_2 )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getTypeAssignment_0_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4302:1: ( rule__SubFeaturesType__TypeAssignment_0_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4302:2: rule__SubFeaturesType__TypeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__TypeAssignment_0_2_in_rule__SubFeaturesType__Group_0__2__Impl8591);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4318:1: rule__SubFeaturesType__Group_1__0 : rule__SubFeaturesType__Group_1__0__Impl rule__SubFeaturesType__Group_1__1 ;
    public final void rule__SubFeaturesType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4322:1: ( rule__SubFeaturesType__Group_1__0__Impl rule__SubFeaturesType__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4323:2: rule__SubFeaturesType__Group_1__0__Impl rule__SubFeaturesType__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__0__Impl_in_rule__SubFeaturesType__Group_1__08627);
            rule__SubFeaturesType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__1_in_rule__SubFeaturesType__Group_1__08630);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4330:1: rule__SubFeaturesType__Group_1__0__Impl : ( () ) ;
    public final void rule__SubFeaturesType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4334:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4335:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4335:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4336:1: ()
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSubGroupTypeAnonAction_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4337:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4339:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4349:1: rule__SubFeaturesType__Group_1__1 : rule__SubFeaturesType__Group_1__1__Impl rule__SubFeaturesType__Group_1__2 ;
    public final void rule__SubFeaturesType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4353:1: ( rule__SubFeaturesType__Group_1__1__Impl rule__SubFeaturesType__Group_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4354:2: rule__SubFeaturesType__Group_1__1__Impl rule__SubFeaturesType__Group_1__2
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__1__Impl_in_rule__SubFeaturesType__Group_1__18688);
            rule__SubFeaturesType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__2_in_rule__SubFeaturesType__Group_1__18691);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4361:1: rule__SubFeaturesType__Group_1__1__Impl : ( ( rule__SubFeaturesType__Group_1_1__0 )? ) ;
    public final void rule__SubFeaturesType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4365:1: ( ( ( rule__SubFeaturesType__Group_1_1__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4366:1: ( ( rule__SubFeaturesType__Group_1_1__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4366:1: ( ( rule__SubFeaturesType__Group_1_1__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4367:1: ( rule__SubFeaturesType__Group_1_1__0 )?
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getGroup_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4368:1: ( rule__SubFeaturesType__Group_1_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==15) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4368:2: rule__SubFeaturesType__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__0_in_rule__SubFeaturesType__Group_1__1__Impl8718);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4378:1: rule__SubFeaturesType__Group_1__2 : rule__SubFeaturesType__Group_1__2__Impl rule__SubFeaturesType__Group_1__3 ;
    public final void rule__SubFeaturesType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4382:1: ( rule__SubFeaturesType__Group_1__2__Impl rule__SubFeaturesType__Group_1__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4383:2: rule__SubFeaturesType__Group_1__2__Impl rule__SubFeaturesType__Group_1__3
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__2__Impl_in_rule__SubFeaturesType__Group_1__28749);
            rule__SubFeaturesType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__3_in_rule__SubFeaturesType__Group_1__28752);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4390:1: rule__SubFeaturesType__Group_1__2__Impl : ( '=' ) ;
    public final void rule__SubFeaturesType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4394:1: ( ( '=' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4395:1: ( '=' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4395:1: ( '=' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4396:1: '='
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getEqualsSignKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__SubFeaturesType__Group_1__2__Impl8780); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4409:1: rule__SubFeaturesType__Group_1__3 : rule__SubFeaturesType__Group_1__3__Impl ;
    public final void rule__SubFeaturesType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4413:1: ( rule__SubFeaturesType__Group_1__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4414:2: rule__SubFeaturesType__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1__3__Impl_in_rule__SubFeaturesType__Group_1__38811);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4420:1: rule__SubFeaturesType__Group_1__3__Impl : ( ( rule__SubFeaturesType__BodyAssignment_1_3 ) ) ;
    public final void rule__SubFeaturesType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4424:1: ( ( ( rule__SubFeaturesType__BodyAssignment_1_3 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4425:1: ( ( rule__SubFeaturesType__BodyAssignment_1_3 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4425:1: ( ( rule__SubFeaturesType__BodyAssignment_1_3 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4426:1: ( rule__SubFeaturesType__BodyAssignment_1_3 )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getBodyAssignment_1_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4427:1: ( rule__SubFeaturesType__BodyAssignment_1_3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4427:2: rule__SubFeaturesType__BodyAssignment_1_3
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__BodyAssignment_1_3_in_rule__SubFeaturesType__Group_1__3__Impl8838);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4445:1: rule__SubFeaturesType__Group_1_1__0 : rule__SubFeaturesType__Group_1_1__0__Impl rule__SubFeaturesType__Group_1_1__1 ;
    public final void rule__SubFeaturesType__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4449:1: ( rule__SubFeaturesType__Group_1_1__0__Impl rule__SubFeaturesType__Group_1_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4450:2: rule__SubFeaturesType__Group_1_1__0__Impl rule__SubFeaturesType__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__0__Impl_in_rule__SubFeaturesType__Group_1_1__08876);
            rule__SubFeaturesType__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__1_in_rule__SubFeaturesType__Group_1_1__08879);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4457:1: rule__SubFeaturesType__Group_1_1__0__Impl : ( '<:' ) ;
    public final void rule__SubFeaturesType__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4461:1: ( ( '<:' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4462:1: ( '<:' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4462:1: ( '<:' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4463:1: '<:'
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getLessThanSignColonKeyword_1_1_0()); 
            match(input,15,FOLLOW_15_in_rule__SubFeaturesType__Group_1_1__0__Impl8907); 
             after(grammarAccess.getSubFeaturesTypeAccess().getLessThanSignColonKeyword_1_1_0()); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4476:1: rule__SubFeaturesType__Group_1_1__1 : rule__SubFeaturesType__Group_1_1__1__Impl rule__SubFeaturesType__Group_1_1__2 ;
    public final void rule__SubFeaturesType__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4480:1: ( rule__SubFeaturesType__Group_1_1__1__Impl rule__SubFeaturesType__Group_1_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4481:2: rule__SubFeaturesType__Group_1_1__1__Impl rule__SubFeaturesType__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__1__Impl_in_rule__SubFeaturesType__Group_1_1__18938);
            rule__SubFeaturesType__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__2_in_rule__SubFeaturesType__Group_1_1__18941);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4488:1: rule__SubFeaturesType__Group_1_1__1__Impl : ( ( rule__SubFeaturesType__SupersAssignment_1_1_1 ) ) ;
    public final void rule__SubFeaturesType__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4492:1: ( ( ( rule__SubFeaturesType__SupersAssignment_1_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4493:1: ( ( rule__SubFeaturesType__SupersAssignment_1_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4493:1: ( ( rule__SubFeaturesType__SupersAssignment_1_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4494:1: ( rule__SubFeaturesType__SupersAssignment_1_1_1 )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersAssignment_1_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4495:1: ( rule__SubFeaturesType__SupersAssignment_1_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4495:2: rule__SubFeaturesType__SupersAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__SupersAssignment_1_1_1_in_rule__SubFeaturesType__Group_1_1__1__Impl8968);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4505:1: rule__SubFeaturesType__Group_1_1__2 : rule__SubFeaturesType__Group_1_1__2__Impl ;
    public final void rule__SubFeaturesType__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4509:1: ( rule__SubFeaturesType__Group_1_1__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4510:2: rule__SubFeaturesType__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1__2__Impl_in_rule__SubFeaturesType__Group_1_1__28998);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4516:1: rule__SubFeaturesType__Group_1_1__2__Impl : ( ( rule__SubFeaturesType__Group_1_1_2__0 )* ) ;
    public final void rule__SubFeaturesType__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4520:1: ( ( ( rule__SubFeaturesType__Group_1_1_2__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4521:1: ( ( rule__SubFeaturesType__Group_1_1_2__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4521:1: ( ( rule__SubFeaturesType__Group_1_1_2__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4522:1: ( rule__SubFeaturesType__Group_1_1_2__0 )*
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getGroup_1_1_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4523:1: ( rule__SubFeaturesType__Group_1_1_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==16) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4523:2: rule__SubFeaturesType__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1_2__0_in_rule__SubFeaturesType__Group_1_1__2__Impl9025);
            	    rule__SubFeaturesType__Group_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4539:1: rule__SubFeaturesType__Group_1_1_2__0 : rule__SubFeaturesType__Group_1_1_2__0__Impl rule__SubFeaturesType__Group_1_1_2__1 ;
    public final void rule__SubFeaturesType__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4543:1: ( rule__SubFeaturesType__Group_1_1_2__0__Impl rule__SubFeaturesType__Group_1_1_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4544:2: rule__SubFeaturesType__Group_1_1_2__0__Impl rule__SubFeaturesType__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1_2__0__Impl_in_rule__SubFeaturesType__Group_1_1_2__09062);
            rule__SubFeaturesType__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1_2__1_in_rule__SubFeaturesType__Group_1_1_2__09065);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4551:1: rule__SubFeaturesType__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__SubFeaturesType__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4555:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4556:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4556:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4557:1: ','
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getCommaKeyword_1_1_2_0()); 
            match(input,16,FOLLOW_16_in_rule__SubFeaturesType__Group_1_1_2__0__Impl9093); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4570:1: rule__SubFeaturesType__Group_1_1_2__1 : rule__SubFeaturesType__Group_1_1_2__1__Impl ;
    public final void rule__SubFeaturesType__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4574:1: ( rule__SubFeaturesType__Group_1_1_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4575:2: rule__SubFeaturesType__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__Group_1_1_2__1__Impl_in_rule__SubFeaturesType__Group_1_1_2__19124);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4581:1: rule__SubFeaturesType__Group_1_1_2__1__Impl : ( ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 ) ) ;
    public final void rule__SubFeaturesType__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4585:1: ( ( ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4586:1: ( ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4586:1: ( ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4587:1: ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersAssignment_1_1_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4588:1: ( rule__SubFeaturesType__SupersAssignment_1_1_2_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4588:2: rule__SubFeaturesType__SupersAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__SubFeaturesType__SupersAssignment_1_1_2_1_in_rule__SubFeaturesType__Group_1_1_2__1__Impl9151);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4603:1: rule__Model__DeclsAssignment : ( ruleDecl ) ;
    public final void rule__Model__DeclsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4607:1: ( ( ruleDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4608:1: ( ruleDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4608:1: ( ruleDecl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4609:1: ruleDecl
            {
             before(grammarAccess.getModelAccess().getDeclsDeclParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDecl_in_rule__Model__DeclsAssignment9190);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4618:1: rule__TypeDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4622:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4623:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4623:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4624:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__NameAssignment_19221); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4633:1: rule__TypeDecl__SupersAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDecl__SupersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4637:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4638:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4638:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4639:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeDeclAccess().getSupersTypeDeclCrossReference_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4640:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4641:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getSupersTypeDeclIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__SupersAssignment_2_19256); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4652:1: rule__TypeDecl__SupersAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDecl__SupersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4656:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4657:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4657:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4658:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeDeclAccess().getSupersTypeDeclCrossReference_2_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4659:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4660:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getSupersTypeDeclIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__SupersAssignment_2_2_19295); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4671:1: rule__TypeDecl__ElemsAssignment_3_1_0 : ( ruleELiteral ) ;
    public final void rule__TypeDecl__ElemsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4675:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4676:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4676:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4677:1: ruleELiteral
            {
             before(grammarAccess.getTypeDeclAccess().getElemsELiteralParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__TypeDecl__ElemsAssignment_3_1_09330);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4686:1: rule__TypeDecl__ElemsAssignment_3_1_1_1 : ( ruleELiteral ) ;
    public final void rule__TypeDecl__ElemsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4690:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4691:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4691:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4692:1: ruleELiteral
            {
             before(grammarAccess.getTypeDeclAccess().getElemsELiteralParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__TypeDecl__ElemsAssignment_3_1_1_19361);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4701:1: rule__FeaturesDecl__CompleteAssignment_0 : ( ( 'complete' ) ) ;
    public final void rule__FeaturesDecl__CompleteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4705:1: ( ( ( 'complete' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4706:1: ( ( 'complete' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4706:1: ( ( 'complete' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4707:1: ( 'complete' )
            {
             before(grammarAccess.getFeaturesDeclAccess().getCompleteCompleteKeyword_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4708:1: ( 'complete' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4709:1: 'complete'
            {
             before(grammarAccess.getFeaturesDeclAccess().getCompleteCompleteKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__FeaturesDecl__CompleteAssignment_09397); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4724:1: rule__FeaturesDecl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FeaturesDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4728:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4729:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4729:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4730:1: RULE_ID
            {
             before(grammarAccess.getFeaturesDeclAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeaturesDecl__NameAssignment_29436); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4739:1: rule__FeaturesDecl__SupersAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeaturesDecl__SupersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4743:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4744:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4744:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4745:1: ( RULE_ID )
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclCrossReference_3_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4746:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4747:1: RULE_ID
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeaturesDecl__SupersAssignment_3_19471); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4758:1: rule__FeaturesDecl__SupersAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeaturesDecl__SupersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4762:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4763:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4763:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4764:1: ( RULE_ID )
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclCrossReference_3_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4765:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4766:1: RULE_ID
            {
             before(grammarAccess.getFeaturesDeclAccess().getSupersFeaturesDeclIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeaturesDecl__SupersAssignment_3_2_19510); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4777:1: rule__FeaturesDecl__BodyAssignment_4 : ( ruleFeaturesBody ) ;
    public final void rule__FeaturesDecl__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4781:1: ( ( ruleFeaturesBody ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4782:1: ( ruleFeaturesBody )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4782:1: ( ruleFeaturesBody )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4783:1: ruleFeaturesBody
            {
             before(grammarAccess.getFeaturesDeclAccess().getBodyFeaturesBodyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeaturesBody_in_rule__FeaturesDecl__BodyAssignment_49545);
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


    // $ANTLR start "rule__FeaturesBody__FeaturesAssignment_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4792:1: rule__FeaturesBody__FeaturesAssignment_2 : ( ruleFeatureDecl ) ;
    public final void rule__FeaturesBody__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4796:1: ( ( ruleFeatureDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4797:1: ( ruleFeatureDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4797:1: ( ruleFeatureDecl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4798:1: ruleFeatureDecl
            {
             before(grammarAccess.getFeaturesBodyAccess().getFeaturesFeatureDeclParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFeatureDecl_in_rule__FeaturesBody__FeaturesAssignment_29576);
            ruleFeatureDecl();

            state._fsp--;

             after(grammarAccess.getFeaturesBodyAccess().getFeaturesFeatureDeclParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FeaturesBody__FeaturesAssignment_2"


    // $ANTLR start "rule__MultiplicityInvariantDecl__InvNameAssignment_1_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4807:1: rule__MultiplicityInvariantDecl__InvNameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__MultiplicityInvariantDecl__InvNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4811:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4812:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4812:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4813:1: RULE_ID
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getInvNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultiplicityInvariantDecl__InvNameAssignment_1_09607); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4822:1: rule__MultiplicityInvariantDecl__LoAssignment_2_0 : ( ruleConstraintNat ) ;
    public final void rule__MultiplicityInvariantDecl__LoAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4826:1: ( ( ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4827:1: ( ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4827:1: ( ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4828:1: ruleConstraintNat
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getLoConstraintNatParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_rule__MultiplicityInvariantDecl__LoAssignment_2_09638);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4837:1: rule__MultiplicityInvariantDecl__HiAssignment_2_2 : ( ruleConstraintNat ) ;
    public final void rule__MultiplicityInvariantDecl__HiAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4841:1: ( ( ruleConstraintNat ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4842:1: ( ruleConstraintNat )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4842:1: ( ruleConstraintNat )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4843:1: ruleConstraintNat
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getHiConstraintNatParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleConstraintNat_in_rule__MultiplicityInvariantDecl__HiAssignment_2_29669);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4852:1: rule__MultiplicityInvariantDecl__MatchAssignment_3 : ( ruleSubFeaturesMatch ) ;
    public final void rule__MultiplicityInvariantDecl__MatchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4856:1: ( ( ruleSubFeaturesMatch ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4857:1: ( ruleSubFeaturesMatch )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4857:1: ( ruleSubFeaturesMatch )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4858:1: ruleSubFeaturesMatch
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchSubFeaturesMatchParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSubFeaturesMatch_in_rule__MultiplicityInvariantDecl__MatchAssignment_39700);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4867:1: rule__MultiplicityInvariantDecl__TypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__MultiplicityInvariantDecl__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4871:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4872:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4872:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4873:1: ( RULE_ID )
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeFeaturesDeclCrossReference_4_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4874:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4875:1: RULE_ID
            {
             before(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeFeaturesDeclIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultiplicityInvariantDecl__TypeAssignment_4_19735); 
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


    // $ANTLR start "rule__SubFeaturesMatch__CategoryNamesAssignment_1_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4886:1: rule__SubFeaturesMatch__CategoryNamesAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__SubFeaturesMatch__CategoryNamesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4890:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4891:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4891:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4892:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getCategoryNamesIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesMatch__CategoryNamesAssignment_1_09770); 
             after(grammarAccess.getSubFeaturesMatchAccess().getCategoryNamesIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__SubFeaturesMatch__CategoryNamesAssignment_1_0"


    // $ANTLR start "rule__SubFeaturesMatch__NameAssignment_2_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4901:1: rule__SubFeaturesMatch__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__SubFeaturesMatch__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4905:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4906:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4906:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4907:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesMatch__NameAssignment_2_09801); 
             after(grammarAccess.getSubFeaturesMatchAccess().getNameIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__SubFeaturesMatch__NameAssignment_2_0"


    // $ANTLR start "rule__SubFeaturesMatch__AnyAssignment_2_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4916:1: rule__SubFeaturesMatch__AnyAssignment_2_1 : ( ( '*' ) ) ;
    public final void rule__SubFeaturesMatch__AnyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4920:1: ( ( ( '*' ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4921:1: ( ( '*' ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4921:1: ( ( '*' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4922:1: ( '*' )
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getAnyAsteriskKeyword_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4923:1: ( '*' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4924:1: '*'
            {
             before(grammarAccess.getSubFeaturesMatchAccess().getAnyAsteriskKeyword_2_1_0()); 
            match(input,24,FOLLOW_24_in_rule__SubFeaturesMatch__AnyAssignment_2_19837); 
             after(grammarAccess.getSubFeaturesMatchAccess().getAnyAsteriskKeyword_2_1_0()); 

            }

             after(grammarAccess.getSubFeaturesMatchAccess().getAnyAsteriskKeyword_2_1_0()); 

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
    // $ANTLR end "rule__SubFeaturesMatch__AnyAssignment_2_1"


    // $ANTLR start "rule__ConstraintNat__NumAssignment_0_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4939:1: rule__ConstraintNat__NumAssignment_0_1 : ( RULE_NAT ) ;
    public final void rule__ConstraintNat__NumAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4943:1: ( ( RULE_NAT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4944:1: ( RULE_NAT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4944:1: ( RULE_NAT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4945:1: RULE_NAT
            {
             before(grammarAccess.getConstraintNatAccess().getNumNATTerminalRuleCall_0_1_0()); 
            match(input,RULE_NAT,FOLLOW_RULE_NAT_in_rule__ConstraintNat__NumAssignment_0_19876); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4954:1: rule__AttrDecl__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__AttrDecl__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4958:1: ( ( ruleModifier ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4959:1: ( ruleModifier )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4959:1: ( ruleModifier )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4960:1: ruleModifier
            {
             before(grammarAccess.getAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__AttrDecl__ModifierAssignment_09907);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4969:1: rule__AttrDecl__AttributeNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttrDecl__AttributeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4973:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4974:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4974:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4975:1: RULE_ID
            {
             before(grammarAccess.getAttrDeclAccess().getAttributeNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttrDecl__AttributeNameAssignment_19938); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4984:1: rule__AttrDecl__TypeAssignment_2_0_1 : ( ruleType ) ;
    public final void rule__AttrDecl__TypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4988:1: ( ( ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4989:1: ( ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4989:1: ( ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4990:1: ruleType
            {
             before(grammarAccess.getAttrDeclAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__AttrDecl__TypeAssignment_2_0_19969);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:4999:1: rule__AttrDecl__LiteralAssignment_2_1_1 : ( ruleLiteral ) ;
    public final void rule__AttrDecl__LiteralAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5003:1: ( ( ruleLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5004:1: ( ruleLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5004:1: ( ruleLiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5005:1: ruleLiteral
            {
             before(grammarAccess.getAttrDeclAccess().getLiteralLiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__AttrDecl__LiteralAssignment_2_1_110000);
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


    // $ANTLR start "rule__Type__BaseTypeAssignment_0_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5014:1: rule__Type__BaseTypeAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__BaseTypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5018:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5019:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5019:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5020:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getBaseTypeTypeDeclCrossReference_0_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5021:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5022:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__BaseTypeAssignment_0_110035); 
             after(grammarAccess.getTypeAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getBaseTypeTypeDeclCrossReference_0_1_0()); 

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
    // $ANTLR end "rule__Type__BaseTypeAssignment_0_1"


    // $ANTLR start "rule__Type__ElemTypesAssignment_1_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5033:1: rule__Type__ElemTypesAssignment_1_2 : ( ruleType ) ;
    public final void rule__Type__ElemTypesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5037:1: ( ( ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5038:1: ( ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5038:1: ( ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5039:1: ruleType
            {
             before(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_1_210070);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Type__ElemTypesAssignment_1_2"


    // $ANTLR start "rule__Type__ElemTypesAssignment_1_3_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5048:1: rule__Type__ElemTypesAssignment_1_3_1 : ( ruleType ) ;
    public final void rule__Type__ElemTypesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5052:1: ( ( ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5053:1: ( ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5053:1: ( ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5054:1: ruleType
            {
             before(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_1_3_110101);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__Type__ElemTypesAssignment_1_3_1"


    // $ANTLR start "rule__BasicLiteral__TypeConsAssignment_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5063:1: rule__BasicLiteral__TypeConsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BasicLiteral__TypeConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5067:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5068:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5068:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5069:1: ( RULE_ID )
            {
             before(grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5070:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5071:1: RULE_ID
            {
             before(grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BasicLiteral__TypeConsAssignment_010136); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5082:1: rule__BasicLiteral__LitAssignment_1 : ( RULE_LIT ) ;
    public final void rule__BasicLiteral__LitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5086:1: ( ( RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5087:1: ( RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5087:1: ( RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5088:1: RULE_LIT
            {
             before(grammarAccess.getBasicLiteralAccess().getLitLITTerminalRuleCall_1_0()); 
            match(input,RULE_LIT,FOLLOW_RULE_LIT_in_rule__BasicLiteral__LitAssignment_110171); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5097:1: rule__TupleLiteral__ElemsAssignment_2_0 : ( ruleLiteral ) ;
    public final void rule__TupleLiteral__ElemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5101:1: ( ( ruleLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5102:1: ( ruleLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5102:1: ( ruleLiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5103:1: ruleLiteral
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_010202);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5112:1: rule__TupleLiteral__ElemsAssignment_2_1_1 : ( ruleLiteral ) ;
    public final void rule__TupleLiteral__ElemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5116:1: ( ( ruleLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5117:1: ( ruleLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5117:1: ( ruleLiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5118:1: ruleLiteral
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_1_110233);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5127:1: rule__ListLiteral__TypeConsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ListLiteral__TypeConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5131:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5132:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5132:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5133:1: ( RULE_ID )
            {
             before(grammarAccess.getListLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5134:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5135:1: RULE_ID
            {
             before(grammarAccess.getListLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListLiteral__TypeConsAssignment_010268); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5146:1: rule__ListLiteral__ElemsAssignment_2_0 : ( ruleELiteral ) ;
    public final void rule__ListLiteral__ElemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5150:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5151:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5151:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5152:1: ruleELiteral
            {
             before(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_010303);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5161:1: rule__ListLiteral__ElemsAssignment_2_1_1 : ( ruleELiteral ) ;
    public final void rule__ListLiteral__ElemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5165:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5166:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5166:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5167:1: ruleELiteral
            {
             before(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_1_110334);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5176:1: rule__SetLiteral__TypeConsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SetLiteral__TypeConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5180:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5181:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5181:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5182:1: ( RULE_ID )
            {
             before(grammarAccess.getSetLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5183:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5184:1: RULE_ID
            {
             before(grammarAccess.getSetLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SetLiteral__TypeConsAssignment_010369); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5195:1: rule__SetLiteral__ElemsAssignment_2_0 : ( ruleELiteral ) ;
    public final void rule__SetLiteral__ElemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5199:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5200:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5200:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5201:1: ruleELiteral
            {
             before(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_010404);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5210:1: rule__SetLiteral__ElemsAssignment_2_1_1 : ( ruleELiteral ) ;
    public final void rule__SetLiteral__ElemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5214:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5215:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5215:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5216:1: ruleELiteral
            {
             before(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_1_110435);
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


    // $ANTLR start "rule__ELiteral__LitAssignment"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5225:1: rule__ELiteral__LitAssignment : ( RULE_LIT ) ;
    public final void rule__ELiteral__LitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5229:1: ( ( RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5230:1: ( RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5230:1: ( RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5231:1: RULE_LIT
            {
             before(grammarAccess.getELiteralAccess().getLitLITTerminalRuleCall_0()); 
            match(input,RULE_LIT,FOLLOW_RULE_LIT_in_rule__ELiteral__LitAssignment10466); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5240:1: rule__SubFeaturesDecl__CategoryNamesAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__SubFeaturesDecl__CategoryNamesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5244:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5245:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5245:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5246:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getCategoryNamesIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesDecl__CategoryNamesAssignment_0_010497); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5255:1: rule__SubFeaturesDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubFeaturesDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5259:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5260:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5260:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5261:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesDecl__NameAssignment_110528); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5270:1: rule__SubFeaturesDecl__TypeAssignment_2 : ( ruleSubFeaturesType ) ;
    public final void rule__SubFeaturesDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5274:1: ( ( ruleSubFeaturesType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5275:1: ( ruleSubFeaturesType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5275:1: ( ruleSubFeaturesType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5276:1: ruleSubFeaturesType
            {
             before(grammarAccess.getSubFeaturesDeclAccess().getTypeSubFeaturesTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSubFeaturesType_in_rule__SubFeaturesDecl__TypeAssignment_210559);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5285:1: rule__SubFeaturesType__TypeAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__SubFeaturesType__TypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5289:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5290:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5290:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5291:1: ( RULE_ID )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getTypeFeaturesDeclCrossReference_0_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5292:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5293:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getTypeFeaturesDeclIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesType__TypeAssignment_0_210594); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5304:1: rule__SubFeaturesType__SupersAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__SubFeaturesType__SupersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5308:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5309:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5309:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5310:1: ( RULE_ID )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclCrossReference_1_1_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5311:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5312:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesType__SupersAssignment_1_1_110633); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5323:1: rule__SubFeaturesType__SupersAssignment_1_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SubFeaturesType__SupersAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5327:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5328:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5328:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5329:1: ( RULE_ID )
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclCrossReference_1_1_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5330:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5331:1: RULE_ID
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getSupersFeaturesDeclIDTerminalRuleCall_1_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubFeaturesType__SupersAssignment_1_1_2_110672); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5342:1: rule__SubFeaturesType__BodyAssignment_1_3 : ( ruleFeaturesBody ) ;
    public final void rule__SubFeaturesType__BodyAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5346:1: ( ( ruleFeaturesBody ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5347:1: ( ruleFeaturesBody )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5347:1: ( ruleFeaturesBody )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:5348:1: ruleFeaturesBody
            {
             before(grammarAccess.getSubFeaturesTypeAccess().getBodyFeaturesBodyParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleFeaturesBody_in_rule__SubFeaturesType__BodyAssignment_1_310707);
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
    public static final BitSet FOLLOW_rule__Model__DeclsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000040084002L});
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
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType814 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleELiteral_in_entryRuleELiteral1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleELiteral1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ELiteral__LitAssignment_in_ruleELiteral1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesDecl_in_entryRuleSubFeaturesDecl1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubFeaturesDecl1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__0_in_ruleSubFeaturesDecl1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesType_in_entryRuleSubFeaturesType1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubFeaturesType1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Alternatives_in_ruleSubFeaturesType1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_rule__Decl__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesDecl_in_rule__Decl__Alternatives1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantDecl_in_rule__FeatureDecl__Alternatives1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrDecl_in_rule__FeatureDecl__Alternatives1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesDecl_in_rule__FeatureDecl__Alternatives1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__NameAssignment_2_0_in_rule__SubFeaturesMatch__Alternatives_21445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__AnyAssignment_2_1_in_rule__SubFeaturesMatch__Alternatives_21463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_0__0_in_rule__ConstraintNat__Alternatives1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_1__0_in_rule__ConstraintNat__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_0__0_in_rule__AttrDecl__Alternatives_21547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_1__0_in_rule__AttrDecl__Alternatives_21565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Modifier__Alternatives1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Modifier__Alternatives1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Modifier__Alternatives1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Modifier__Alternatives1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__0_in_rule__Type__Alternatives_0_21744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__0_in_rule__Type__Alternatives_0_21762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_rule__Literal__Alternatives1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_rule__Literal__Alternatives1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rule__Literal__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_rule__Literal__Alternatives1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__0_in_rule__SubFeaturesType__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__0_in_rule__SubFeaturesType__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__01927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__01930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeDecl__Group__0__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__11989 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__11992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__NameAssignment_1_in_rule__TypeDecl__Group__1__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__22049 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__22052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__0_in_rule__TypeDecl__Group__2__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__32110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__0_in_rule__TypeDecl__Group__3__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__0__Impl_in_rule__TypeDecl__Group_2__02176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__1_in_rule__TypeDecl__Group_2__02179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeDecl__Group_2__0__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__1__Impl_in_rule__TypeDecl__Group_2__12238 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__2_in_rule__TypeDecl__Group_2__12241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__SupersAssignment_2_1_in_rule__TypeDecl__Group_2__1__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2__2__Impl_in_rule__TypeDecl__Group_2__22298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2_2__0_in_rule__TypeDecl__Group_2__2__Impl2325 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2_2__0__Impl_in_rule__TypeDecl__Group_2_2__02362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2_2__1_in_rule__TypeDecl__Group_2_2__02365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDecl__Group_2_2__0__Impl2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_2_2__1__Impl_in_rule__TypeDecl__Group_2_2__12424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__SupersAssignment_2_2_1_in_rule__TypeDecl__Group_2_2__1__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__0__Impl_in_rule__TypeDecl__Group_3__02485 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__1_in_rule__TypeDecl__Group_3__02488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeDecl__Group_3__0__Impl2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__1__Impl_in_rule__TypeDecl__Group_3__12547 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__2_in_rule__TypeDecl__Group_3__12550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1__0_in_rule__TypeDecl__Group_3__1__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3__2__Impl_in_rule__TypeDecl__Group_3__22608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeDecl__Group_3__2__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1__0__Impl_in_rule__TypeDecl__Group_3_1__02673 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1__1_in_rule__TypeDecl__Group_3_1__02676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__ElemsAssignment_3_1_0_in_rule__TypeDecl__Group_3_1__0__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1__1__Impl_in_rule__TypeDecl__Group_3_1__12733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1_1__0_in_rule__TypeDecl__Group_3_1__1__Impl2760 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1_1__0__Impl_in_rule__TypeDecl__Group_3_1_1__02795 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1_1__1_in_rule__TypeDecl__Group_3_1_1__02798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDecl__Group_3_1_1__0__Impl2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_3_1_1__1__Impl_in_rule__TypeDecl__Group_3_1_1__12857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__ElemsAssignment_3_1_1_1_in_rule__TypeDecl__Group_3_1_1__1__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__0__Impl_in_rule__FeaturesDecl__Group__02918 = new BitSet(new long[]{0x0000000040084000L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__1_in_rule__FeaturesDecl__Group__02921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__CompleteAssignment_0_in_rule__FeaturesDecl__Group__0__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__1__Impl_in_rule__FeaturesDecl__Group__12979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__2_in_rule__FeaturesDecl__Group__12982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FeaturesDecl__Group__1__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__2__Impl_in_rule__FeaturesDecl__Group__23041 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__3_in_rule__FeaturesDecl__Group__23044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__NameAssignment_2_in_rule__FeaturesDecl__Group__2__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__3__Impl_in_rule__FeaturesDecl__Group__33101 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__4_in_rule__FeaturesDecl__Group__33104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__0_in_rule__FeaturesDecl__Group__3__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group__4__Impl_in_rule__FeaturesDecl__Group__43162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__BodyAssignment_4_in_rule__FeaturesDecl__Group__4__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__0__Impl_in_rule__FeaturesDecl__Group_3__03229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__1_in_rule__FeaturesDecl__Group_3__03232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FeaturesDecl__Group_3__0__Impl3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__1__Impl_in_rule__FeaturesDecl__Group_3__13291 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__2_in_rule__FeaturesDecl__Group_3__13294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__SupersAssignment_3_1_in_rule__FeaturesDecl__Group_3__1__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3__2__Impl_in_rule__FeaturesDecl__Group_3__23351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3_2__0_in_rule__FeaturesDecl__Group_3__2__Impl3378 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3_2__0__Impl_in_rule__FeaturesDecl__Group_3_2__03415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3_2__1_in_rule__FeaturesDecl__Group_3_2__03418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FeaturesDecl__Group_3_2__0__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__Group_3_2__1__Impl_in_rule__FeaturesDecl__Group_3_2__13477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesDecl__SupersAssignment_3_2_1_in_rule__FeaturesDecl__Group_3_2__1__Impl3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__0__Impl_in_rule__FeaturesBody__Group__03538 = new BitSet(new long[]{0x0000000000143C10L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__1_in_rule__FeaturesBody__Group__03541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FeaturesBody__Group__0__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__1__Impl_in_rule__FeaturesBody__Group__13600 = new BitSet(new long[]{0x0000000000143C10L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__2_in_rule__FeaturesBody__Group__13603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__2__Impl_in_rule__FeaturesBody__Group__23661 = new BitSet(new long[]{0x0000000000143C10L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__3_in_rule__FeaturesBody__Group__23664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturesBody__FeaturesAssignment_2_in_rule__FeaturesBody__Group__2__Impl3691 = new BitSet(new long[]{0x0000000000103C12L});
    public static final BitSet FOLLOW_rule__FeaturesBody__Group__3__Impl_in_rule__FeaturesBody__Group__33722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FeaturesBody__Group__3__Impl3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__0__Impl_in_rule__MultiplicityInvariantDecl__Group__03789 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__1_in_rule__MultiplicityInvariantDecl__Group__03792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MultiplicityInvariantDecl__Group__0__Impl3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__1__Impl_in_rule__MultiplicityInvariantDecl__Group__13851 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__2_in_rule__MultiplicityInvariantDecl__Group__13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_1__0_in_rule__MultiplicityInvariantDecl__Group__1__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__2__Impl_in_rule__MultiplicityInvariantDecl__Group__23912 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__3_in_rule__MultiplicityInvariantDecl__Group__23915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__0_in_rule__MultiplicityInvariantDecl__Group__2__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__3__Impl_in_rule__MultiplicityInvariantDecl__Group__33972 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__4_in_rule__MultiplicityInvariantDecl__Group__33975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__MatchAssignment_3_in_rule__MultiplicityInvariantDecl__Group__3__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group__4__Impl_in_rule__MultiplicityInvariantDecl__Group__44032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_4__0_in_rule__MultiplicityInvariantDecl__Group__4__Impl4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_1__0__Impl_in_rule__MultiplicityInvariantDecl__Group_1__04100 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_1__1_in_rule__MultiplicityInvariantDecl__Group_1__04103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__InvNameAssignment_1_0_in_rule__MultiplicityInvariantDecl__Group_1__0__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_1__1__Impl_in_rule__MultiplicityInvariantDecl__Group_1__14160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MultiplicityInvariantDecl__Group_1__1__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__0__Impl_in_rule__MultiplicityInvariantDecl__Group_2__04223 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__1_in_rule__MultiplicityInvariantDecl__Group_2__04226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__LoAssignment_2_0_in_rule__MultiplicityInvariantDecl__Group_2__0__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__1__Impl_in_rule__MultiplicityInvariantDecl__Group_2__14283 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__2_in_rule__MultiplicityInvariantDecl__Group_2__14286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MultiplicityInvariantDecl__Group_2__1__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_2__2__Impl_in_rule__MultiplicityInvariantDecl__Group_2__24345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__HiAssignment_2_2_in_rule__MultiplicityInvariantDecl__Group_2__2__Impl4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_4__0__Impl_in_rule__MultiplicityInvariantDecl__Group_4__04408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_4__1_in_rule__MultiplicityInvariantDecl__Group_4__04411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MultiplicityInvariantDecl__Group_4__0__Impl4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__Group_4__1__Impl_in_rule__MultiplicityInvariantDecl__Group_4__14470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityInvariantDecl__TypeAssignment_4_1_in_rule__MultiplicityInvariantDecl__Group_4__1__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__0__Impl_in_rule__SubFeaturesMatch__Group__04531 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__1_in_rule__SubFeaturesMatch__Group__04534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__1__Impl_in_rule__SubFeaturesMatch__Group__14592 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__2_in_rule__SubFeaturesMatch__Group__14595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group_1__0_in_rule__SubFeaturesMatch__Group__1__Impl4622 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group__2__Impl_in_rule__SubFeaturesMatch__Group__24653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Alternatives_2_in_rule__SubFeaturesMatch__Group__2__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group_1__0__Impl_in_rule__SubFeaturesMatch__Group_1__04716 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group_1__1_in_rule__SubFeaturesMatch__Group_1__04719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__CategoryNamesAssignment_1_0_in_rule__SubFeaturesMatch__Group_1__0__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesMatch__Group_1__1__Impl_in_rule__SubFeaturesMatch__Group_1__14776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SubFeaturesMatch__Group_1__1__Impl4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_0__0__Impl_in_rule__ConstraintNat__Group_0__04839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_0__1_in_rule__ConstraintNat__Group_0__04842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_0__1__Impl_in_rule__ConstraintNat__Group_0__14900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__NumAssignment_0_1_in_rule__ConstraintNat__Group_0__1__Impl4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_1__0__Impl_in_rule__ConstraintNat__Group_1__04961 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_1__1_in_rule__ConstraintNat__Group_1__04964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintNat__Group_1__1__Impl_in_rule__ConstraintNat__Group_1__15022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ConstraintNat__Group_1__1__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__0__Impl_in_rule__AttrDecl__Group__05085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__1_in_rule__AttrDecl__Group__05088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__ModifierAssignment_0_in_rule__AttrDecl__Group__0__Impl5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__1__Impl_in_rule__AttrDecl__Group__15145 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__2_in_rule__AttrDecl__Group__15148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__AttributeNameAssignment_1_in_rule__AttrDecl__Group__1__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group__2__Impl_in_rule__AttrDecl__Group__25205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Alternatives_2_in_rule__AttrDecl__Group__2__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_0__0__Impl_in_rule__AttrDecl__Group_2_0__05268 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_0__1_in_rule__AttrDecl__Group_2_0__05271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AttrDecl__Group_2_0__0__Impl5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_0__1__Impl_in_rule__AttrDecl__Group_2_0__15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__TypeAssignment_2_0_1_in_rule__AttrDecl__Group_2_0__1__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_1__0__Impl_in_rule__AttrDecl__Group_2_1__05391 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_1__1_in_rule__AttrDecl__Group_2_1__05394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AttrDecl__Group_2_1__0__Impl5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__Group_2_1__1__Impl_in_rule__AttrDecl__Group_2_1__15453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrDecl__LiteralAssignment_2_1_1_in_rule__AttrDecl__Group_2_1__1__Impl5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__05514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__05517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__15575 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Type__Group_0__2_in_rule__Type__Group_0__15578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__BaseTypeAssignment_0_1_in_rule__Type__Group_0__1__Impl5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__2__Impl_in_rule__Type__Group_0__25635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_0_2_in_rule__Type__Group_0__2__Impl5662 = new BitSet(new long[]{0x0000000004020002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__0__Impl_in_rule__Type__Group_0_2_0__05699 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__1_in_rule__Type__Group_0_2_0__05702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__1__Impl_in_rule__Type__Group_0_2_0__15760 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__2_in_rule__Type__Group_0_2_0__15763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Type__Group_0_2_0__1__Impl5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__2__Impl_in_rule__Type__Group_0_2_0__25822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Type__Group_0_2_0__2__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__0__Impl_in_rule__Type__Group_0_2_1__05887 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__1_in_rule__Type__Group_0_2_1__05890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__1__Impl_in_rule__Type__Group_0_2_1__15948 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__2_in_rule__Type__Group_0_2_1__15951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Group_0_2_1__1__Impl5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__2__Impl_in_rule__Type__Group_0_2_1__26010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Group_0_2_1__2__Impl6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__06075 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__06078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__Group_1__0__Impl6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__16137 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__16140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__26198 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__3_in_rule__Type__Group_1__26201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ElemTypesAssignment_1_2_in_rule__Type__Group_1__2__Impl6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__3__Impl_in_rule__Type__Group_1__36258 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__4_in_rule__Type__Group_1__36261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_3__0_in_rule__Type__Group_1__3__Impl6290 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_3__0_in_rule__Type__Group_1__3__Impl6302 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__4__Impl_in_rule__Type__Group_1__46335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Group_1__4__Impl6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_3__0__Impl_in_rule__Type__Group_1_3__06404 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Type__Group_1_3__1_in_rule__Type__Group_1_3__06407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__Group_1_3__0__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_3__1__Impl_in_rule__Type__Group_1_3__16466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ElemTypesAssignment_1_3_1_in_rule__Type__Group_1_3__1__Impl6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__0__Impl_in_rule__BasicLiteral__Group__06527 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__1_in_rule__BasicLiteral__Group__06530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__TypeConsAssignment_0_in_rule__BasicLiteral__Group__0__Impl6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__1__Impl_in_rule__BasicLiteral__Group__16587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__LitAssignment_1_in_rule__BasicLiteral__Group__1__Impl6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__0__Impl_in_rule__TupleLiteral__Group__06648 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__1_in_rule__TupleLiteral__Group__06651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TupleLiteral__Group__0__Impl6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__1__Impl_in_rule__TupleLiteral__Group__16710 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__2_in_rule__TupleLiteral__Group__16713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__2__Impl_in_rule__TupleLiteral__Group__26771 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__3_in_rule__TupleLiteral__Group__26774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__0_in_rule__TupleLiteral__Group__2__Impl6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__3__Impl_in_rule__TupleLiteral__Group__36832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TupleLiteral__Group__3__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__0__Impl_in_rule__TupleLiteral__Group_2__06899 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__1_in_rule__TupleLiteral__Group_2__06902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__ElemsAssignment_2_0_in_rule__TupleLiteral__Group_2__0__Impl6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__1__Impl_in_rule__TupleLiteral__Group_2__16959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__0_in_rule__TupleLiteral__Group_2__1__Impl6986 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__0__Impl_in_rule__TupleLiteral__Group_2_1__07021 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__1_in_rule__TupleLiteral__Group_2_1__07024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TupleLiteral__Group_2_1__0__Impl7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__1__Impl_in_rule__TupleLiteral__Group_2_1__17083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__ElemsAssignment_2_1_1_in_rule__TupleLiteral__Group_2_1__1__Impl7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__07144 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__07147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__TypeConsAssignment_0_in_rule__ListLiteral__Group__0__Impl7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__17204 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__17207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ListLiteral__Group__1__Impl7235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__27266 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__3_in_rule__ListLiteral__Group__27269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__0_in_rule__ListLiteral__Group__2__Impl7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__3__Impl_in_rule__ListLiteral__Group__37327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ListLiteral__Group__3__Impl7355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__0__Impl_in_rule__ListLiteral__Group_2__07394 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__1_in_rule__ListLiteral__Group_2__07397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ElemsAssignment_2_0_in_rule__ListLiteral__Group_2__0__Impl7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__1__Impl_in_rule__ListLiteral__Group_2__17454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__0_in_rule__ListLiteral__Group_2__1__Impl7481 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__0__Impl_in_rule__ListLiteral__Group_2_1__07516 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__1_in_rule__ListLiteral__Group_2_1__07519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ListLiteral__Group_2_1__0__Impl7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__1__Impl_in_rule__ListLiteral__Group_2_1__17578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ElemsAssignment_2_1_1_in_rule__ListLiteral__Group_2_1__1__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__0__Impl_in_rule__SetLiteral__Group__07639 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__1_in_rule__SetLiteral__Group__07642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__TypeConsAssignment_0_in_rule__SetLiteral__Group__0__Impl7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__1__Impl_in_rule__SetLiteral__Group__17699 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__2_in_rule__SetLiteral__Group__17702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SetLiteral__Group__1__Impl7730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__2__Impl_in_rule__SetLiteral__Group__27761 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__3_in_rule__SetLiteral__Group__27764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__0_in_rule__SetLiteral__Group__2__Impl7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__3__Impl_in_rule__SetLiteral__Group__37822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SetLiteral__Group__3__Impl7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__0__Impl_in_rule__SetLiteral__Group_2__07889 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__1_in_rule__SetLiteral__Group_2__07892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__ElemsAssignment_2_0_in_rule__SetLiteral__Group_2__0__Impl7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__1__Impl_in_rule__SetLiteral__Group_2__17949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__0_in_rule__SetLiteral__Group_2__1__Impl7976 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__0__Impl_in_rule__SetLiteral__Group_2_1__08011 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__1_in_rule__SetLiteral__Group_2_1__08014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SetLiteral__Group_2_1__0__Impl8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__1__Impl_in_rule__SetLiteral__Group_2_1__18073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__ElemsAssignment_2_1_1_in_rule__SetLiteral__Group_2_1__1__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__0__Impl_in_rule__SubFeaturesDecl__Group__08134 = new BitSet(new long[]{0x0000000000103C10L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__1_in_rule__SubFeaturesDecl__Group__08137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group_0__0_in_rule__SubFeaturesDecl__Group__0__Impl8164 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__1__Impl_in_rule__SubFeaturesDecl__Group__18195 = new BitSet(new long[]{0x0000000002208000L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__2_in_rule__SubFeaturesDecl__Group__18198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__NameAssignment_1_in_rule__SubFeaturesDecl__Group__1__Impl8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group__2__Impl_in_rule__SubFeaturesDecl__Group__28255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__TypeAssignment_2_in_rule__SubFeaturesDecl__Group__2__Impl8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group_0__0__Impl_in_rule__SubFeaturesDecl__Group_0__08318 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group_0__1_in_rule__SubFeaturesDecl__Group_0__08321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__CategoryNamesAssignment_0_0_in_rule__SubFeaturesDecl__Group_0__0__Impl8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesDecl__Group_0__1__Impl_in_rule__SubFeaturesDecl__Group_0__18378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SubFeaturesDecl__Group_0__1__Impl8406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__0__Impl_in_rule__SubFeaturesType__Group_0__08441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__1_in_rule__SubFeaturesType__Group_0__08444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SubFeaturesType__Group_0__0__Impl8472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__1__Impl_in_rule__SubFeaturesType__Group_0__18503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__2_in_rule__SubFeaturesType__Group_0__18506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_0__2__Impl_in_rule__SubFeaturesType__Group_0__28564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__TypeAssignment_0_2_in_rule__SubFeaturesType__Group_0__2__Impl8591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__0__Impl_in_rule__SubFeaturesType__Group_1__08627 = new BitSet(new long[]{0x0000000002208000L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__1_in_rule__SubFeaturesType__Group_1__08630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__1__Impl_in_rule__SubFeaturesType__Group_1__18688 = new BitSet(new long[]{0x0000000002208000L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__2_in_rule__SubFeaturesType__Group_1__18691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__0_in_rule__SubFeaturesType__Group_1__1__Impl8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__2__Impl_in_rule__SubFeaturesType__Group_1__28749 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__3_in_rule__SubFeaturesType__Group_1__28752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SubFeaturesType__Group_1__2__Impl8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1__3__Impl_in_rule__SubFeaturesType__Group_1__38811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__BodyAssignment_1_3_in_rule__SubFeaturesType__Group_1__3__Impl8838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__0__Impl_in_rule__SubFeaturesType__Group_1_1__08876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__1_in_rule__SubFeaturesType__Group_1_1__08879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SubFeaturesType__Group_1_1__0__Impl8907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__1__Impl_in_rule__SubFeaturesType__Group_1_1__18938 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__2_in_rule__SubFeaturesType__Group_1_1__18941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__SupersAssignment_1_1_1_in_rule__SubFeaturesType__Group_1_1__1__Impl8968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1__2__Impl_in_rule__SubFeaturesType__Group_1_1__28998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1_2__0_in_rule__SubFeaturesType__Group_1_1__2__Impl9025 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1_2__0__Impl_in_rule__SubFeaturesType__Group_1_1_2__09062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1_2__1_in_rule__SubFeaturesType__Group_1_1_2__09065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SubFeaturesType__Group_1_1_2__0__Impl9093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__Group_1_1_2__1__Impl_in_rule__SubFeaturesType__Group_1_1_2__19124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubFeaturesType__SupersAssignment_1_1_2_1_in_rule__SubFeaturesType__Group_1_1_2__1__Impl9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_rule__Model__DeclsAssignment9190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__NameAssignment_19221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__SupersAssignment_2_19256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__SupersAssignment_2_2_19295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__TypeDecl__ElemsAssignment_3_1_09330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__TypeDecl__ElemsAssignment_3_1_1_19361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FeaturesDecl__CompleteAssignment_09397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeaturesDecl__NameAssignment_29436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeaturesDecl__SupersAssignment_3_19471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeaturesDecl__SupersAssignment_3_2_19510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesBody_in_rule__FeaturesDecl__BodyAssignment_49545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureDecl_in_rule__FeaturesBody__FeaturesAssignment_29576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultiplicityInvariantDecl__InvNameAssignment_1_09607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_rule__MultiplicityInvariantDecl__LoAssignment_2_09638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintNat_in_rule__MultiplicityInvariantDecl__HiAssignment_2_29669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesMatch_in_rule__MultiplicityInvariantDecl__MatchAssignment_39700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultiplicityInvariantDecl__TypeAssignment_4_19735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesMatch__CategoryNamesAssignment_1_09770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesMatch__NameAssignment_2_09801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SubFeaturesMatch__AnyAssignment_2_19837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAT_in_rule__ConstraintNat__NumAssignment_0_19876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__AttrDecl__ModifierAssignment_09907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttrDecl__AttributeNameAssignment_19938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AttrDecl__TypeAssignment_2_0_19969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__AttrDecl__LiteralAssignment_2_1_110000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__BaseTypeAssignment_0_110035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_1_210070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_1_3_110101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BasicLiteral__TypeConsAssignment_010136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_rule__BasicLiteral__LitAssignment_110171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_010202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_1_110233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListLiteral__TypeConsAssignment_010268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_010303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_1_110334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SetLiteral__TypeConsAssignment_010369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_010404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_1_110435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_rule__ELiteral__LitAssignment10466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesDecl__CategoryNamesAssignment_0_010497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesDecl__NameAssignment_110528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubFeaturesType_in_rule__SubFeaturesDecl__TypeAssignment_210559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesType__TypeAssignment_0_210594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesType__SupersAssignment_1_1_110633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubFeaturesType__SupersAssignment_1_1_2_110672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturesBody_in_rule__SubFeaturesType__BodyAssignment_1_310707 = new BitSet(new long[]{0x0000000000000002L});

}