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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'const'", "'val'", "'var'", "'def'", "'type'", "'featuregroup'", "'<:'", "','", "'{'", "'}'", "':'", "'='", "'['", "']'", "'<'", "'>'", "'*'"
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

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
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


    // $ANTLR start "entryRuleFeatureGroupBody"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:116:1: entryRuleFeatureGroupBody : ruleFeatureGroupBody EOF ;
    public final void entryRuleFeatureGroupBody() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:117:1: ( ruleFeatureGroupBody EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:118:1: ruleFeatureGroupBody EOF
            {
             before(grammarAccess.getFeatureGroupBodyRule()); 
            pushFollow(FOLLOW_ruleFeatureGroupBody_in_entryRuleFeatureGroupBody182);
            ruleFeatureGroupBody();

            state._fsp--;

             after(grammarAccess.getFeatureGroupBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureGroupBody189); 

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
    // $ANTLR end "entryRuleFeatureGroupBody"


    // $ANTLR start "ruleFeatureGroupBody"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:125:1: ruleFeatureGroupBody : ( ( rule__FeatureGroupBody__Group__0 ) ) ;
    public final void ruleFeatureGroupBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:129:2: ( ( ( rule__FeatureGroupBody__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:130:1: ( ( rule__FeatureGroupBody__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:130:1: ( ( rule__FeatureGroupBody__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:131:1: ( rule__FeatureGroupBody__Group__0 )
            {
             before(grammarAccess.getFeatureGroupBodyAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:132:1: ( rule__FeatureGroupBody__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:132:2: rule__FeatureGroupBody__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureGroupBody__Group__0_in_ruleFeatureGroupBody215);
            rule__FeatureGroupBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureGroupBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureGroupBody"


    // $ANTLR start "entryRuleGroupElementDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:144:1: entryRuleGroupElementDecl : ruleGroupElementDecl EOF ;
    public final void entryRuleGroupElementDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:145:1: ( ruleGroupElementDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:146:1: ruleGroupElementDecl EOF
            {
             before(grammarAccess.getGroupElementDeclRule()); 
            pushFollow(FOLLOW_ruleGroupElementDecl_in_entryRuleGroupElementDecl242);
            ruleGroupElementDecl();

            state._fsp--;

             after(grammarAccess.getGroupElementDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElementDecl249); 

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
    // $ANTLR end "entryRuleGroupElementDecl"


    // $ANTLR start "ruleGroupElementDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:153:1: ruleGroupElementDecl : ( ( rule__GroupElementDecl__Alternatives ) ) ;
    public final void ruleGroupElementDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:157:2: ( ( ( rule__GroupElementDecl__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:158:1: ( ( rule__GroupElementDecl__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:158:1: ( ( rule__GroupElementDecl__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:159:1: ( rule__GroupElementDecl__Alternatives )
            {
             before(grammarAccess.getGroupElementDeclAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:160:1: ( rule__GroupElementDecl__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:160:2: rule__GroupElementDecl__Alternatives
            {
            pushFollow(FOLLOW_rule__GroupElementDecl__Alternatives_in_ruleGroupElementDecl275);
            rule__GroupElementDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroupElementDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupElementDecl"


    // $ANTLR start "entryRuleGroupAttrDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:172:1: entryRuleGroupAttrDecl : ruleGroupAttrDecl EOF ;
    public final void entryRuleGroupAttrDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:173:1: ( ruleGroupAttrDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:174:1: ruleGroupAttrDecl EOF
            {
             before(grammarAccess.getGroupAttrDeclRule()); 
            pushFollow(FOLLOW_ruleGroupAttrDecl_in_entryRuleGroupAttrDecl302);
            ruleGroupAttrDecl();

            state._fsp--;

             after(grammarAccess.getGroupAttrDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupAttrDecl309); 

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
    // $ANTLR end "entryRuleGroupAttrDecl"


    // $ANTLR start "ruleGroupAttrDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:181:1: ruleGroupAttrDecl : ( ( rule__GroupAttrDecl__Group__0 ) ) ;
    public final void ruleGroupAttrDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:185:2: ( ( ( rule__GroupAttrDecl__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:186:1: ( ( rule__GroupAttrDecl__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:186:1: ( ( rule__GroupAttrDecl__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:187:1: ( rule__GroupAttrDecl__Group__0 )
            {
             before(grammarAccess.getGroupAttrDeclAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:188:1: ( rule__GroupAttrDecl__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:188:2: rule__GroupAttrDecl__Group__0
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__Group__0_in_ruleGroupAttrDecl335);
            rule__GroupAttrDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAttrDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupAttrDecl"


    // $ANTLR start "entryRuleModifier"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:200:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:201:1: ( ruleModifier EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:202:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier362);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier369); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:209:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:213:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:214:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:214:1: ( ( rule__Modifier__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:215:1: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:216:1: ( rule__Modifier__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:216:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier395);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:228:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:229:1: ( ruleType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:230:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType422);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType429); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:237:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:241:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:242:1: ( ( rule__Type__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:242:1: ( ( rule__Type__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:243:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:244:1: ( rule__Type__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:244:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType455);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:256:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:257:1: ( ruleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:258:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral482);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral489); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:265:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:269:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:270:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:270:1: ( ( rule__Literal__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:271:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:272:1: ( rule__Literal__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:272:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral515);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:284:1: entryRuleBasicLiteral : ruleBasicLiteral EOF ;
    public final void entryRuleBasicLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:285:1: ( ruleBasicLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:286:1: ruleBasicLiteral EOF
            {
             before(grammarAccess.getBasicLiteralRule()); 
            pushFollow(FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral542);
            ruleBasicLiteral();

            state._fsp--;

             after(grammarAccess.getBasicLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicLiteral549); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:293:1: ruleBasicLiteral : ( ( rule__BasicLiteral__Group__0 ) ) ;
    public final void ruleBasicLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:297:2: ( ( ( rule__BasicLiteral__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:298:1: ( ( rule__BasicLiteral__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:298:1: ( ( rule__BasicLiteral__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:299:1: ( rule__BasicLiteral__Group__0 )
            {
             before(grammarAccess.getBasicLiteralAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:300:1: ( rule__BasicLiteral__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:300:2: rule__BasicLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BasicLiteral__Group__0_in_ruleBasicLiteral575);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:312:1: entryRuleTupleLiteral : ruleTupleLiteral EOF ;
    public final void entryRuleTupleLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:313:1: ( ruleTupleLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:314:1: ruleTupleLiteral EOF
            {
             before(grammarAccess.getTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral602);
            ruleTupleLiteral();

            state._fsp--;

             after(grammarAccess.getTupleLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteral609); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:321:1: ruleTupleLiteral : ( ( rule__TupleLiteral__Group__0 ) ) ;
    public final void ruleTupleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:325:2: ( ( ( rule__TupleLiteral__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:326:1: ( ( rule__TupleLiteral__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:326:1: ( ( rule__TupleLiteral__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:327:1: ( rule__TupleLiteral__Group__0 )
            {
             before(grammarAccess.getTupleLiteralAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:328:1: ( rule__TupleLiteral__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:328:2: rule__TupleLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__0_in_ruleTupleLiteral635);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:340:1: entryRuleListLiteral : ruleListLiteral EOF ;
    public final void entryRuleListLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:341:1: ( ruleListLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:342:1: ruleListLiteral EOF
            {
             before(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral662);
            ruleListLiteral();

            state._fsp--;

             after(grammarAccess.getListLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral669); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:349:1: ruleListLiteral : ( ( rule__ListLiteral__Group__0 ) ) ;
    public final void ruleListLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:353:2: ( ( ( rule__ListLiteral__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:354:1: ( ( rule__ListLiteral__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:354:1: ( ( rule__ListLiteral__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:355:1: ( rule__ListLiteral__Group__0 )
            {
             before(grammarAccess.getListLiteralAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:356:1: ( rule__ListLiteral__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:356:2: rule__ListLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral695);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:368:1: entryRuleSetLiteral : ruleSetLiteral EOF ;
    public final void entryRuleSetLiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:369:1: ( ruleSetLiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:370:1: ruleSetLiteral EOF
            {
             before(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral722);
            ruleSetLiteral();

            state._fsp--;

             after(grammarAccess.getSetLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral729); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:377:1: ruleSetLiteral : ( ( rule__SetLiteral__Group__0 ) ) ;
    public final void ruleSetLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:381:2: ( ( ( rule__SetLiteral__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:382:1: ( ( rule__SetLiteral__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:382:1: ( ( rule__SetLiteral__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:383:1: ( rule__SetLiteral__Group__0 )
            {
             before(grammarAccess.getSetLiteralAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:384:1: ( rule__SetLiteral__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:384:2: rule__SetLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__0_in_ruleSetLiteral755);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:396:1: entryRuleELiteral : ruleELiteral EOF ;
    public final void entryRuleELiteral() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:397:1: ( ruleELiteral EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:398:1: ruleELiteral EOF
            {
             before(grammarAccess.getELiteralRule()); 
            pushFollow(FOLLOW_ruleELiteral_in_entryRuleELiteral782);
            ruleELiteral();

            state._fsp--;

             after(grammarAccess.getELiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleELiteral789); 

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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:405:1: ruleELiteral : ( ( rule__ELiteral__LitAssignment ) ) ;
    public final void ruleELiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:409:2: ( ( ( rule__ELiteral__LitAssignment ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:410:1: ( ( rule__ELiteral__LitAssignment ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:410:1: ( ( rule__ELiteral__LitAssignment ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:411:1: ( rule__ELiteral__LitAssignment )
            {
             before(grammarAccess.getELiteralAccess().getLitAssignment()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:412:1: ( rule__ELiteral__LitAssignment )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:412:2: rule__ELiteral__LitAssignment
            {
            pushFollow(FOLLOW_rule__ELiteral__LitAssignment_in_ruleELiteral815);
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


    // $ANTLR start "entryRuleSubGroupDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:424:1: entryRuleSubGroupDecl : ruleSubGroupDecl EOF ;
    public final void entryRuleSubGroupDecl() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:425:1: ( ruleSubGroupDecl EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:426:1: ruleSubGroupDecl EOF
            {
             before(grammarAccess.getSubGroupDeclRule()); 
            pushFollow(FOLLOW_ruleSubGroupDecl_in_entryRuleSubGroupDecl842);
            ruleSubGroupDecl();

            state._fsp--;

             after(grammarAccess.getSubGroupDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubGroupDecl849); 

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
    // $ANTLR end "entryRuleSubGroupDecl"


    // $ANTLR start "ruleSubGroupDecl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:433:1: ruleSubGroupDecl : ( ( rule__SubGroupDecl__Group__0 ) ) ;
    public final void ruleSubGroupDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:437:2: ( ( ( rule__SubGroupDecl__Group__0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:438:1: ( ( rule__SubGroupDecl__Group__0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:438:1: ( ( rule__SubGroupDecl__Group__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:439:1: ( rule__SubGroupDecl__Group__0 )
            {
             before(grammarAccess.getSubGroupDeclAccess().getGroup()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:440:1: ( rule__SubGroupDecl__Group__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:440:2: rule__SubGroupDecl__Group__0
            {
            pushFollow(FOLLOW_rule__SubGroupDecl__Group__0_in_ruleSubGroupDecl875);
            rule__SubGroupDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubGroupDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubGroupDecl"


    // $ANTLR start "entryRuleSubGroupType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:452:1: entryRuleSubGroupType : ruleSubGroupType EOF ;
    public final void entryRuleSubGroupType() throws RecognitionException {
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:453:1: ( ruleSubGroupType EOF )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:454:1: ruleSubGroupType EOF
            {
             before(grammarAccess.getSubGroupTypeRule()); 
            pushFollow(FOLLOW_ruleSubGroupType_in_entryRuleSubGroupType902);
            ruleSubGroupType();

            state._fsp--;

             after(grammarAccess.getSubGroupTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubGroupType909); 

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
    // $ANTLR end "entryRuleSubGroupType"


    // $ANTLR start "ruleSubGroupType"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:461:1: ruleSubGroupType : ( ( rule__SubGroupType__Alternatives ) ) ;
    public final void ruleSubGroupType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:465:2: ( ( ( rule__SubGroupType__Alternatives ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:466:1: ( ( rule__SubGroupType__Alternatives ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:466:1: ( ( rule__SubGroupType__Alternatives ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:467:1: ( rule__SubGroupType__Alternatives )
            {
             before(grammarAccess.getSubGroupTypeAccess().getAlternatives()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:468:1: ( rule__SubGroupType__Alternatives )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:468:2: rule__SubGroupType__Alternatives
            {
            pushFollow(FOLLOW_rule__SubGroupType__Alternatives_in_ruleSubGroupType935);
            rule__SubGroupType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubGroupTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubGroupType"


    // $ANTLR start "rule__Decl__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:480:1: rule__Decl__Alternatives : ( ( ( rule__Decl__Group_0__0 ) ) | ( ( rule__Decl__Group_1__0 ) ) );
    public final void rule__Decl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:484:1: ( ( ( rule__Decl__Group_0__0 ) ) | ( ( rule__Decl__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:485:1: ( ( rule__Decl__Group_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:485:1: ( ( rule__Decl__Group_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:486:1: ( rule__Decl__Group_0__0 )
                    {
                     before(grammarAccess.getDeclAccess().getGroup_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:487:1: ( rule__Decl__Group_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:487:2: rule__Decl__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Decl__Group_0__0_in_rule__Decl__Alternatives971);
                    rule__Decl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:491:6: ( ( rule__Decl__Group_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:491:6: ( ( rule__Decl__Group_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:492:1: ( rule__Decl__Group_1__0 )
                    {
                     before(grammarAccess.getDeclAccess().getGroup_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:493:1: ( rule__Decl__Group_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:493:2: rule__Decl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Decl__Group_1__0_in_rule__Decl__Alternatives989);
                    rule__Decl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclAccess().getGroup_1()); 

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


    // $ANTLR start "rule__GroupElementDecl__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:502:1: rule__GroupElementDecl__Alternatives : ( ( ruleGroupAttrDecl ) | ( ruleSubGroupDecl ) );
    public final void rule__GroupElementDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:506:1: ( ( ruleGroupAttrDecl ) | ( ruleSubGroupDecl ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=9 && LA3_0<=12)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:507:1: ( ruleGroupAttrDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:507:1: ( ruleGroupAttrDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:508:1: ruleGroupAttrDecl
                    {
                     before(grammarAccess.getGroupElementDeclAccess().getGroupAttrDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGroupAttrDecl_in_rule__GroupElementDecl__Alternatives1022);
                    ruleGroupAttrDecl();

                    state._fsp--;

                     after(grammarAccess.getGroupElementDeclAccess().getGroupAttrDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:513:6: ( ruleSubGroupDecl )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:513:6: ( ruleSubGroupDecl )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:514:1: ruleSubGroupDecl
                    {
                     before(grammarAccess.getGroupElementDeclAccess().getSubGroupDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSubGroupDecl_in_rule__GroupElementDecl__Alternatives1039);
                    ruleSubGroupDecl();

                    state._fsp--;

                     after(grammarAccess.getGroupElementDeclAccess().getSubGroupDeclParserRuleCall_1()); 

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
    // $ANTLR end "rule__GroupElementDecl__Alternatives"


    // $ANTLR start "rule__GroupAttrDecl__Alternatives_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:524:1: rule__GroupAttrDecl__Alternatives_2 : ( ( ( rule__GroupAttrDecl__Group_2_0__0 ) ) | ( ( rule__GroupAttrDecl__Group_2_1__0 ) ) );
    public final void rule__GroupAttrDecl__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:528:1: ( ( ( rule__GroupAttrDecl__Group_2_0__0 ) ) | ( ( rule__GroupAttrDecl__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:529:1: ( ( rule__GroupAttrDecl__Group_2_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:529:1: ( ( rule__GroupAttrDecl__Group_2_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:530:1: ( rule__GroupAttrDecl__Group_2_0__0 )
                    {
                     before(grammarAccess.getGroupAttrDeclAccess().getGroup_2_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:531:1: ( rule__GroupAttrDecl__Group_2_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:531:2: rule__GroupAttrDecl__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__GroupAttrDecl__Group_2_0__0_in_rule__GroupAttrDecl__Alternatives_21071);
                    rule__GroupAttrDecl__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupAttrDeclAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:535:6: ( ( rule__GroupAttrDecl__Group_2_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:535:6: ( ( rule__GroupAttrDecl__Group_2_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:536:1: ( rule__GroupAttrDecl__Group_2_1__0 )
                    {
                     before(grammarAccess.getGroupAttrDeclAccess().getGroup_2_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:537:1: ( rule__GroupAttrDecl__Group_2_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:537:2: rule__GroupAttrDecl__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__GroupAttrDecl__Group_2_1__0_in_rule__GroupAttrDecl__Alternatives_21089);
                    rule__GroupAttrDecl__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupAttrDeclAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__GroupAttrDecl__Alternatives_2"


    // $ANTLR start "rule__Modifier__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:546:1: rule__Modifier__Alternatives : ( ( 'const' ) | ( 'val' ) | ( 'var' ) | ( 'def' ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:550:1: ( ( 'const' ) | ( 'val' ) | ( 'var' ) | ( 'def' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt5=1;
                }
                break;
            case 10:
                {
                alt5=2;
                }
                break;
            case 11:
                {
                alt5=3;
                }
                break;
            case 12:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:551:1: ( 'const' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:551:1: ( 'const' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:552:1: 'const'
                    {
                     before(grammarAccess.getModifierAccess().getConstKeyword_0()); 
                    match(input,9,FOLLOW_9_in_rule__Modifier__Alternatives1123); 
                     after(grammarAccess.getModifierAccess().getConstKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:559:6: ( 'val' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:559:6: ( 'val' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:560:1: 'val'
                    {
                     before(grammarAccess.getModifierAccess().getValKeyword_1()); 
                    match(input,10,FOLLOW_10_in_rule__Modifier__Alternatives1143); 
                     after(grammarAccess.getModifierAccess().getValKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:567:6: ( 'var' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:567:6: ( 'var' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:568:1: 'var'
                    {
                     before(grammarAccess.getModifierAccess().getVarKeyword_2()); 
                    match(input,11,FOLLOW_11_in_rule__Modifier__Alternatives1163); 
                     after(grammarAccess.getModifierAccess().getVarKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:575:6: ( 'def' )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:575:6: ( 'def' )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:576:1: 'def'
                    {
                     before(grammarAccess.getModifierAccess().getDefKeyword_3()); 
                    match(input,12,FOLLOW_12_in_rule__Modifier__Alternatives1183); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:588:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:592:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:593:1: ( ( rule__Type__Group_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:593:1: ( ( rule__Type__Group_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:594:1: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:595:1: ( rule__Type__Group_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:595:2: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1217);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:599:6: ( ( rule__Type__Group_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:599:6: ( ( rule__Type__Group_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:600:1: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:601:1: ( rule__Type__Group_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:601:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1235);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:610:1: rule__Type__Alternatives_0_2 : ( ( ( rule__Type__Group_0_2_0__0 ) ) | ( ( rule__Type__Group_0_2_1__0 ) ) );
    public final void rule__Type__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:614:1: ( ( ( rule__Type__Group_0_2_0__0 ) ) | ( ( rule__Type__Group_0_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:615:1: ( ( rule__Type__Group_0_2_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:615:1: ( ( rule__Type__Group_0_2_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:616:1: ( rule__Type__Group_0_2_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0_2_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:617:1: ( rule__Type__Group_0_2_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:617:2: rule__Type__Group_0_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0_2_0__0_in_rule__Type__Alternatives_0_21268);
                    rule__Type__Group_0_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:621:6: ( ( rule__Type__Group_0_2_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:621:6: ( ( rule__Type__Group_0_2_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:622:1: ( rule__Type__Group_0_2_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0_2_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:623:1: ( rule__Type__Group_0_2_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:623:2: rule__Type__Group_0_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0_2_1__0_in_rule__Type__Alternatives_0_21286);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:632:1: rule__Literal__Alternatives : ( ( ruleBasicLiteral ) | ( ruleTupleLiteral ) | ( ruleListLiteral ) | ( ruleSetLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:636:1: ( ( ruleBasicLiteral ) | ( ruleTupleLiteral ) | ( ruleListLiteral ) | ( ruleSetLiteral ) )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt8=4;
                    }
                    break;
                case RULE_LIT:
                    {
                    alt8=1;
                    }
                    break;
                case 21:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:637:1: ( ruleBasicLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:637:1: ( ruleBasicLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:638:1: ruleBasicLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBasicLiteral_in_rule__Literal__Alternatives1319);
                    ruleBasicLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBasicLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:643:6: ( ruleTupleLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:643:6: ( ruleTupleLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:644:1: ruleTupleLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTupleLiteral_in_rule__Literal__Alternatives1336);
                    ruleTupleLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:649:6: ( ruleListLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:649:6: ( ruleListLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:650:1: ruleListLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleListLiteral_in_rule__Literal__Alternatives1353);
                    ruleListLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:655:6: ( ruleSetLiteral )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:655:6: ( ruleSetLiteral )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:656:1: ruleSetLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSetLiteral_in_rule__Literal__Alternatives1370);
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


    // $ANTLR start "rule__SubGroupType__Alternatives"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:666:1: rule__SubGroupType__Alternatives : ( ( ( rule__SubGroupType__Group_0__0 ) ) | ( ( rule__SubGroupType__Group_1__0 ) ) );
    public final void rule__SubGroupType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:670:1: ( ( ( rule__SubGroupType__Group_0__0 ) ) | ( ( rule__SubGroupType__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==15||LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:671:1: ( ( rule__SubGroupType__Group_0__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:671:1: ( ( rule__SubGroupType__Group_0__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:672:1: ( rule__SubGroupType__Group_0__0 )
                    {
                     before(grammarAccess.getSubGroupTypeAccess().getGroup_0()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:673:1: ( rule__SubGroupType__Group_0__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:673:2: rule__SubGroupType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SubGroupType__Group_0__0_in_rule__SubGroupType__Alternatives1402);
                    rule__SubGroupType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubGroupTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:677:6: ( ( rule__SubGroupType__Group_1__0 ) )
                    {
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:677:6: ( ( rule__SubGroupType__Group_1__0 ) )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:678:1: ( rule__SubGroupType__Group_1__0 )
                    {
                     before(grammarAccess.getSubGroupTypeAccess().getGroup_1()); 
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:679:1: ( rule__SubGroupType__Group_1__0 )
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:679:2: rule__SubGroupType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SubGroupType__Group_1__0_in_rule__SubGroupType__Alternatives1420);
                    rule__SubGroupType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubGroupTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SubGroupType__Alternatives"


    // $ANTLR start "rule__Decl__Group_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:690:1: rule__Decl__Group_0__0 : rule__Decl__Group_0__0__Impl rule__Decl__Group_0__1 ;
    public final void rule__Decl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:694:1: ( rule__Decl__Group_0__0__Impl rule__Decl__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:695:2: rule__Decl__Group_0__0__Impl rule__Decl__Group_0__1
            {
            pushFollow(FOLLOW_rule__Decl__Group_0__0__Impl_in_rule__Decl__Group_0__01451);
            rule__Decl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group_0__1_in_rule__Decl__Group_0__01454);
            rule__Decl__Group_0__1();

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
    // $ANTLR end "rule__Decl__Group_0__0"


    // $ANTLR start "rule__Decl__Group_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:702:1: rule__Decl__Group_0__0__Impl : ( 'type' ) ;
    public final void rule__Decl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:706:1: ( ( 'type' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:707:1: ( 'type' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:707:1: ( 'type' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:708:1: 'type'
            {
             before(grammarAccess.getDeclAccess().getTypeKeyword_0_0()); 
            match(input,13,FOLLOW_13_in_rule__Decl__Group_0__0__Impl1482); 
             after(grammarAccess.getDeclAccess().getTypeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_0__0__Impl"


    // $ANTLR start "rule__Decl__Group_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:721:1: rule__Decl__Group_0__1 : rule__Decl__Group_0__1__Impl rule__Decl__Group_0__2 ;
    public final void rule__Decl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:725:1: ( rule__Decl__Group_0__1__Impl rule__Decl__Group_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:726:2: rule__Decl__Group_0__1__Impl rule__Decl__Group_0__2
            {
            pushFollow(FOLLOW_rule__Decl__Group_0__1__Impl_in_rule__Decl__Group_0__11513);
            rule__Decl__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group_0__2_in_rule__Decl__Group_0__11516);
            rule__Decl__Group_0__2();

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
    // $ANTLR end "rule__Decl__Group_0__1"


    // $ANTLR start "rule__Decl__Group_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:733:1: rule__Decl__Group_0__1__Impl : ( () ) ;
    public final void rule__Decl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:737:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:738:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:738:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:739:1: ()
            {
             before(grammarAccess.getDeclAccess().getTypeDeclAction_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:740:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:742:1: 
            {
            }

             after(grammarAccess.getDeclAccess().getTypeDeclAction_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_0__1__Impl"


    // $ANTLR start "rule__Decl__Group_0__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:752:1: rule__Decl__Group_0__2 : rule__Decl__Group_0__2__Impl ;
    public final void rule__Decl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:756:1: ( rule__Decl__Group_0__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:757:2: rule__Decl__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Decl__Group_0__2__Impl_in_rule__Decl__Group_0__21574);
            rule__Decl__Group_0__2__Impl();

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
    // $ANTLR end "rule__Decl__Group_0__2"


    // $ANTLR start "rule__Decl__Group_0__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:763:1: rule__Decl__Group_0__2__Impl : ( ( rule__Decl__NameAssignment_0_2 ) ) ;
    public final void rule__Decl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:767:1: ( ( ( rule__Decl__NameAssignment_0_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:768:1: ( ( rule__Decl__NameAssignment_0_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:768:1: ( ( rule__Decl__NameAssignment_0_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:769:1: ( rule__Decl__NameAssignment_0_2 )
            {
             before(grammarAccess.getDeclAccess().getNameAssignment_0_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:770:1: ( rule__Decl__NameAssignment_0_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:770:2: rule__Decl__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Decl__NameAssignment_0_2_in_rule__Decl__Group_0__2__Impl1601);
            rule__Decl__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_0__2__Impl"


    // $ANTLR start "rule__Decl__Group_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:786:1: rule__Decl__Group_1__0 : rule__Decl__Group_1__0__Impl rule__Decl__Group_1__1 ;
    public final void rule__Decl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:790:1: ( rule__Decl__Group_1__0__Impl rule__Decl__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:791:2: rule__Decl__Group_1__0__Impl rule__Decl__Group_1__1
            {
            pushFollow(FOLLOW_rule__Decl__Group_1__0__Impl_in_rule__Decl__Group_1__01637);
            rule__Decl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group_1__1_in_rule__Decl__Group_1__01640);
            rule__Decl__Group_1__1();

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
    // $ANTLR end "rule__Decl__Group_1__0"


    // $ANTLR start "rule__Decl__Group_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:798:1: rule__Decl__Group_1__0__Impl : ( 'featuregroup' ) ;
    public final void rule__Decl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:802:1: ( ( 'featuregroup' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:803:1: ( 'featuregroup' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:803:1: ( 'featuregroup' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:804:1: 'featuregroup'
            {
             before(grammarAccess.getDeclAccess().getFeaturegroupKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Decl__Group_1__0__Impl1668); 
             after(grammarAccess.getDeclAccess().getFeaturegroupKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_1__0__Impl"


    // $ANTLR start "rule__Decl__Group_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:817:1: rule__Decl__Group_1__1 : rule__Decl__Group_1__1__Impl rule__Decl__Group_1__2 ;
    public final void rule__Decl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:821:1: ( rule__Decl__Group_1__1__Impl rule__Decl__Group_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:822:2: rule__Decl__Group_1__1__Impl rule__Decl__Group_1__2
            {
            pushFollow(FOLLOW_rule__Decl__Group_1__1__Impl_in_rule__Decl__Group_1__11699);
            rule__Decl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group_1__2_in_rule__Decl__Group_1__11702);
            rule__Decl__Group_1__2();

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
    // $ANTLR end "rule__Decl__Group_1__1"


    // $ANTLR start "rule__Decl__Group_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:829:1: rule__Decl__Group_1__1__Impl : ( () ) ;
    public final void rule__Decl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:833:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:834:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:834:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:835:1: ()
            {
             before(grammarAccess.getDeclAccess().getFeatureGroupDeclAction_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:836:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:838:1: 
            {
            }

             after(grammarAccess.getDeclAccess().getFeatureGroupDeclAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_1__1__Impl"


    // $ANTLR start "rule__Decl__Group_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:848:1: rule__Decl__Group_1__2 : rule__Decl__Group_1__2__Impl rule__Decl__Group_1__3 ;
    public final void rule__Decl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:852:1: ( rule__Decl__Group_1__2__Impl rule__Decl__Group_1__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:853:2: rule__Decl__Group_1__2__Impl rule__Decl__Group_1__3
            {
            pushFollow(FOLLOW_rule__Decl__Group_1__2__Impl_in_rule__Decl__Group_1__21760);
            rule__Decl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group_1__3_in_rule__Decl__Group_1__21763);
            rule__Decl__Group_1__3();

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
    // $ANTLR end "rule__Decl__Group_1__2"


    // $ANTLR start "rule__Decl__Group_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:860:1: rule__Decl__Group_1__2__Impl : ( ( rule__Decl__NameAssignment_1_2 ) ) ;
    public final void rule__Decl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:864:1: ( ( ( rule__Decl__NameAssignment_1_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:865:1: ( ( rule__Decl__NameAssignment_1_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:865:1: ( ( rule__Decl__NameAssignment_1_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:866:1: ( rule__Decl__NameAssignment_1_2 )
            {
             before(grammarAccess.getDeclAccess().getNameAssignment_1_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:867:1: ( rule__Decl__NameAssignment_1_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:867:2: rule__Decl__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Decl__NameAssignment_1_2_in_rule__Decl__Group_1__2__Impl1790);
            rule__Decl__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_1__2__Impl"


    // $ANTLR start "rule__Decl__Group_1__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:877:1: rule__Decl__Group_1__3 : rule__Decl__Group_1__3__Impl rule__Decl__Group_1__4 ;
    public final void rule__Decl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:881:1: ( rule__Decl__Group_1__3__Impl rule__Decl__Group_1__4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:882:2: rule__Decl__Group_1__3__Impl rule__Decl__Group_1__4
            {
            pushFollow(FOLLOW_rule__Decl__Group_1__3__Impl_in_rule__Decl__Group_1__31820);
            rule__Decl__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group_1__4_in_rule__Decl__Group_1__31823);
            rule__Decl__Group_1__4();

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
    // $ANTLR end "rule__Decl__Group_1__3"


    // $ANTLR start "rule__Decl__Group_1__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:889:1: rule__Decl__Group_1__3__Impl : ( ( rule__Decl__Group_1_3__0 )? ) ;
    public final void rule__Decl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:893:1: ( ( ( rule__Decl__Group_1_3__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:894:1: ( ( rule__Decl__Group_1_3__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:894:1: ( ( rule__Decl__Group_1_3__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:895:1: ( rule__Decl__Group_1_3__0 )?
            {
             before(grammarAccess.getDeclAccess().getGroup_1_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:896:1: ( rule__Decl__Group_1_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:896:2: rule__Decl__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Decl__Group_1_3__0_in_rule__Decl__Group_1__3__Impl1850);
                    rule__Decl__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_1__3__Impl"


    // $ANTLR start "rule__Decl__Group_1__4"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:906:1: rule__Decl__Group_1__4 : rule__Decl__Group_1__4__Impl ;
    public final void rule__Decl__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:910:1: ( rule__Decl__Group_1__4__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:911:2: rule__Decl__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Decl__Group_1__4__Impl_in_rule__Decl__Group_1__41881);
            rule__Decl__Group_1__4__Impl();

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
    // $ANTLR end "rule__Decl__Group_1__4"


    // $ANTLR start "rule__Decl__Group_1__4__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:917:1: rule__Decl__Group_1__4__Impl : ( ( rule__Decl__BodyAssignment_1_4 ) ) ;
    public final void rule__Decl__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:921:1: ( ( ( rule__Decl__BodyAssignment_1_4 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:922:1: ( ( rule__Decl__BodyAssignment_1_4 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:922:1: ( ( rule__Decl__BodyAssignment_1_4 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:923:1: ( rule__Decl__BodyAssignment_1_4 )
            {
             before(grammarAccess.getDeclAccess().getBodyAssignment_1_4()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:924:1: ( rule__Decl__BodyAssignment_1_4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:924:2: rule__Decl__BodyAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Decl__BodyAssignment_1_4_in_rule__Decl__Group_1__4__Impl1908);
            rule__Decl__BodyAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getBodyAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_1__4__Impl"


    // $ANTLR start "rule__Decl__Group_1_3__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:944:1: rule__Decl__Group_1_3__0 : rule__Decl__Group_1_3__0__Impl rule__Decl__Group_1_3__1 ;
    public final void rule__Decl__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:948:1: ( rule__Decl__Group_1_3__0__Impl rule__Decl__Group_1_3__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:949:2: rule__Decl__Group_1_3__0__Impl rule__Decl__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Decl__Group_1_3__0__Impl_in_rule__Decl__Group_1_3__01948);
            rule__Decl__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group_1_3__1_in_rule__Decl__Group_1_3__01951);
            rule__Decl__Group_1_3__1();

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
    // $ANTLR end "rule__Decl__Group_1_3__0"


    // $ANTLR start "rule__Decl__Group_1_3__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:956:1: rule__Decl__Group_1_3__0__Impl : ( '<:' ) ;
    public final void rule__Decl__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:960:1: ( ( '<:' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:961:1: ( '<:' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:961:1: ( '<:' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:962:1: '<:'
            {
             before(grammarAccess.getDeclAccess().getLessThanSignColonKeyword_1_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Decl__Group_1_3__0__Impl1979); 
             after(grammarAccess.getDeclAccess().getLessThanSignColonKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_1_3__0__Impl"


    // $ANTLR start "rule__Decl__Group_1_3__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:975:1: rule__Decl__Group_1_3__1 : rule__Decl__Group_1_3__1__Impl rule__Decl__Group_1_3__2 ;
    public final void rule__Decl__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:979:1: ( rule__Decl__Group_1_3__1__Impl rule__Decl__Group_1_3__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:980:2: rule__Decl__Group_1_3__1__Impl rule__Decl__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__Decl__Group_1_3__1__Impl_in_rule__Decl__Group_1_3__12010);
            rule__Decl__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group_1_3__2_in_rule__Decl__Group_1_3__12013);
            rule__Decl__Group_1_3__2();

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
    // $ANTLR end "rule__Decl__Group_1_3__1"


    // $ANTLR start "rule__Decl__Group_1_3__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:987:1: rule__Decl__Group_1_3__1__Impl : ( ( rule__Decl__SupersAssignment_1_3_1 ) ) ;
    public final void rule__Decl__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:991:1: ( ( ( rule__Decl__SupersAssignment_1_3_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:992:1: ( ( rule__Decl__SupersAssignment_1_3_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:992:1: ( ( rule__Decl__SupersAssignment_1_3_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:993:1: ( rule__Decl__SupersAssignment_1_3_1 )
            {
             before(grammarAccess.getDeclAccess().getSupersAssignment_1_3_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:994:1: ( rule__Decl__SupersAssignment_1_3_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:994:2: rule__Decl__SupersAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Decl__SupersAssignment_1_3_1_in_rule__Decl__Group_1_3__1__Impl2040);
            rule__Decl__SupersAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getSupersAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_1_3__1__Impl"


    // $ANTLR start "rule__Decl__Group_1_3__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1004:1: rule__Decl__Group_1_3__2 : rule__Decl__Group_1_3__2__Impl ;
    public final void rule__Decl__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1008:1: ( rule__Decl__Group_1_3__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1009:2: rule__Decl__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Decl__Group_1_3__2__Impl_in_rule__Decl__Group_1_3__22070);
            rule__Decl__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__Decl__Group_1_3__2"


    // $ANTLR start "rule__Decl__Group_1_3__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1015:1: rule__Decl__Group_1_3__2__Impl : ( ( rule__Decl__Group_1_3_2__0 )* ) ;
    public final void rule__Decl__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1019:1: ( ( ( rule__Decl__Group_1_3_2__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1020:1: ( ( rule__Decl__Group_1_3_2__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1020:1: ( ( rule__Decl__Group_1_3_2__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1021:1: ( rule__Decl__Group_1_3_2__0 )*
            {
             before(grammarAccess.getDeclAccess().getGroup_1_3_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1022:1: ( rule__Decl__Group_1_3_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1022:2: rule__Decl__Group_1_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Decl__Group_1_3_2__0_in_rule__Decl__Group_1_3__2__Impl2097);
            	    rule__Decl__Group_1_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDeclAccess().getGroup_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_1_3__2__Impl"


    // $ANTLR start "rule__Decl__Group_1_3_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1038:1: rule__Decl__Group_1_3_2__0 : rule__Decl__Group_1_3_2__0__Impl rule__Decl__Group_1_3_2__1 ;
    public final void rule__Decl__Group_1_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1042:1: ( rule__Decl__Group_1_3_2__0__Impl rule__Decl__Group_1_3_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1043:2: rule__Decl__Group_1_3_2__0__Impl rule__Decl__Group_1_3_2__1
            {
            pushFollow(FOLLOW_rule__Decl__Group_1_3_2__0__Impl_in_rule__Decl__Group_1_3_2__02134);
            rule__Decl__Group_1_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group_1_3_2__1_in_rule__Decl__Group_1_3_2__02137);
            rule__Decl__Group_1_3_2__1();

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
    // $ANTLR end "rule__Decl__Group_1_3_2__0"


    // $ANTLR start "rule__Decl__Group_1_3_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1050:1: rule__Decl__Group_1_3_2__0__Impl : ( ',' ) ;
    public final void rule__Decl__Group_1_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1054:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1055:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1055:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1056:1: ','
            {
             before(grammarAccess.getDeclAccess().getCommaKeyword_1_3_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Decl__Group_1_3_2__0__Impl2165); 
             after(grammarAccess.getDeclAccess().getCommaKeyword_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_1_3_2__0__Impl"


    // $ANTLR start "rule__Decl__Group_1_3_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1069:1: rule__Decl__Group_1_3_2__1 : rule__Decl__Group_1_3_2__1__Impl ;
    public final void rule__Decl__Group_1_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1073:1: ( rule__Decl__Group_1_3_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1074:2: rule__Decl__Group_1_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Decl__Group_1_3_2__1__Impl_in_rule__Decl__Group_1_3_2__12196);
            rule__Decl__Group_1_3_2__1__Impl();

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
    // $ANTLR end "rule__Decl__Group_1_3_2__1"


    // $ANTLR start "rule__Decl__Group_1_3_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1080:1: rule__Decl__Group_1_3_2__1__Impl : ( ( rule__Decl__SupersAssignment_1_3_2_1 ) ) ;
    public final void rule__Decl__Group_1_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1084:1: ( ( ( rule__Decl__SupersAssignment_1_3_2_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1085:1: ( ( rule__Decl__SupersAssignment_1_3_2_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1085:1: ( ( rule__Decl__SupersAssignment_1_3_2_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1086:1: ( rule__Decl__SupersAssignment_1_3_2_1 )
            {
             before(grammarAccess.getDeclAccess().getSupersAssignment_1_3_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1087:1: ( rule__Decl__SupersAssignment_1_3_2_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1087:2: rule__Decl__SupersAssignment_1_3_2_1
            {
            pushFollow(FOLLOW_rule__Decl__SupersAssignment_1_3_2_1_in_rule__Decl__Group_1_3_2__1__Impl2223);
            rule__Decl__SupersAssignment_1_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getSupersAssignment_1_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group_1_3_2__1__Impl"


    // $ANTLR start "rule__FeatureGroupBody__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1101:1: rule__FeatureGroupBody__Group__0 : rule__FeatureGroupBody__Group__0__Impl rule__FeatureGroupBody__Group__1 ;
    public final void rule__FeatureGroupBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1105:1: ( rule__FeatureGroupBody__Group__0__Impl rule__FeatureGroupBody__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1106:2: rule__FeatureGroupBody__Group__0__Impl rule__FeatureGroupBody__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureGroupBody__Group__0__Impl_in_rule__FeatureGroupBody__Group__02257);
            rule__FeatureGroupBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureGroupBody__Group__1_in_rule__FeatureGroupBody__Group__02260);
            rule__FeatureGroupBody__Group__1();

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
    // $ANTLR end "rule__FeatureGroupBody__Group__0"


    // $ANTLR start "rule__FeatureGroupBody__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1113:1: rule__FeatureGroupBody__Group__0__Impl : ( '{' ) ;
    public final void rule__FeatureGroupBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1117:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1118:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1118:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1119:1: '{'
            {
             before(grammarAccess.getFeatureGroupBodyAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__FeatureGroupBody__Group__0__Impl2288); 
             after(grammarAccess.getFeatureGroupBodyAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGroupBody__Group__0__Impl"


    // $ANTLR start "rule__FeatureGroupBody__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1132:1: rule__FeatureGroupBody__Group__1 : rule__FeatureGroupBody__Group__1__Impl rule__FeatureGroupBody__Group__2 ;
    public final void rule__FeatureGroupBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1136:1: ( rule__FeatureGroupBody__Group__1__Impl rule__FeatureGroupBody__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1137:2: rule__FeatureGroupBody__Group__1__Impl rule__FeatureGroupBody__Group__2
            {
            pushFollow(FOLLOW_rule__FeatureGroupBody__Group__1__Impl_in_rule__FeatureGroupBody__Group__12319);
            rule__FeatureGroupBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureGroupBody__Group__2_in_rule__FeatureGroupBody__Group__12322);
            rule__FeatureGroupBody__Group__2();

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
    // $ANTLR end "rule__FeatureGroupBody__Group__1"


    // $ANTLR start "rule__FeatureGroupBody__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1144:1: rule__FeatureGroupBody__Group__1__Impl : ( () ) ;
    public final void rule__FeatureGroupBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1148:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1149:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1149:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1150:1: ()
            {
             before(grammarAccess.getFeatureGroupBodyAccess().getFeatureGroupBodyAction_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1151:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1153:1: 
            {
            }

             after(grammarAccess.getFeatureGroupBodyAccess().getFeatureGroupBodyAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGroupBody__Group__1__Impl"


    // $ANTLR start "rule__FeatureGroupBody__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1163:1: rule__FeatureGroupBody__Group__2 : rule__FeatureGroupBody__Group__2__Impl rule__FeatureGroupBody__Group__3 ;
    public final void rule__FeatureGroupBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1167:1: ( rule__FeatureGroupBody__Group__2__Impl rule__FeatureGroupBody__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1168:2: rule__FeatureGroupBody__Group__2__Impl rule__FeatureGroupBody__Group__3
            {
            pushFollow(FOLLOW_rule__FeatureGroupBody__Group__2__Impl_in_rule__FeatureGroupBody__Group__22380);
            rule__FeatureGroupBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureGroupBody__Group__3_in_rule__FeatureGroupBody__Group__22383);
            rule__FeatureGroupBody__Group__3();

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
    // $ANTLR end "rule__FeatureGroupBody__Group__2"


    // $ANTLR start "rule__FeatureGroupBody__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1175:1: rule__FeatureGroupBody__Group__2__Impl : ( ( rule__FeatureGroupBody__GroupElementsAssignment_2 )* ) ;
    public final void rule__FeatureGroupBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1179:1: ( ( ( rule__FeatureGroupBody__GroupElementsAssignment_2 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1180:1: ( ( rule__FeatureGroupBody__GroupElementsAssignment_2 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1180:1: ( ( rule__FeatureGroupBody__GroupElementsAssignment_2 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1181:1: ( rule__FeatureGroupBody__GroupElementsAssignment_2 )*
            {
             before(grammarAccess.getFeatureGroupBodyAccess().getGroupElementsAssignment_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1182:1: ( rule__FeatureGroupBody__GroupElementsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=9 && LA12_0<=12)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1182:2: rule__FeatureGroupBody__GroupElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__FeatureGroupBody__GroupElementsAssignment_2_in_rule__FeatureGroupBody__Group__2__Impl2410);
            	    rule__FeatureGroupBody__GroupElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFeatureGroupBodyAccess().getGroupElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGroupBody__Group__2__Impl"


    // $ANTLR start "rule__FeatureGroupBody__Group__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1192:1: rule__FeatureGroupBody__Group__3 : rule__FeatureGroupBody__Group__3__Impl ;
    public final void rule__FeatureGroupBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1196:1: ( rule__FeatureGroupBody__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1197:2: rule__FeatureGroupBody__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FeatureGroupBody__Group__3__Impl_in_rule__FeatureGroupBody__Group__32441);
            rule__FeatureGroupBody__Group__3__Impl();

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
    // $ANTLR end "rule__FeatureGroupBody__Group__3"


    // $ANTLR start "rule__FeatureGroupBody__Group__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1203:1: rule__FeatureGroupBody__Group__3__Impl : ( '}' ) ;
    public final void rule__FeatureGroupBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1207:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1208:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1208:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1209:1: '}'
            {
             before(grammarAccess.getFeatureGroupBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__FeatureGroupBody__Group__3__Impl2469); 
             after(grammarAccess.getFeatureGroupBodyAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGroupBody__Group__3__Impl"


    // $ANTLR start "rule__GroupAttrDecl__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1230:1: rule__GroupAttrDecl__Group__0 : rule__GroupAttrDecl__Group__0__Impl rule__GroupAttrDecl__Group__1 ;
    public final void rule__GroupAttrDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1234:1: ( rule__GroupAttrDecl__Group__0__Impl rule__GroupAttrDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1235:2: rule__GroupAttrDecl__Group__0__Impl rule__GroupAttrDecl__Group__1
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__Group__0__Impl_in_rule__GroupAttrDecl__Group__02508);
            rule__GroupAttrDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupAttrDecl__Group__1_in_rule__GroupAttrDecl__Group__02511);
            rule__GroupAttrDecl__Group__1();

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
    // $ANTLR end "rule__GroupAttrDecl__Group__0"


    // $ANTLR start "rule__GroupAttrDecl__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1242:1: rule__GroupAttrDecl__Group__0__Impl : ( ( rule__GroupAttrDecl__ModifierAssignment_0 ) ) ;
    public final void rule__GroupAttrDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1246:1: ( ( ( rule__GroupAttrDecl__ModifierAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1247:1: ( ( rule__GroupAttrDecl__ModifierAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1247:1: ( ( rule__GroupAttrDecl__ModifierAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1248:1: ( rule__GroupAttrDecl__ModifierAssignment_0 )
            {
             before(grammarAccess.getGroupAttrDeclAccess().getModifierAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1249:1: ( rule__GroupAttrDecl__ModifierAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1249:2: rule__GroupAttrDecl__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__ModifierAssignment_0_in_rule__GroupAttrDecl__Group__0__Impl2538);
            rule__GroupAttrDecl__ModifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAttrDeclAccess().getModifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__Group__0__Impl"


    // $ANTLR start "rule__GroupAttrDecl__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1259:1: rule__GroupAttrDecl__Group__1 : rule__GroupAttrDecl__Group__1__Impl rule__GroupAttrDecl__Group__2 ;
    public final void rule__GroupAttrDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1263:1: ( rule__GroupAttrDecl__Group__1__Impl rule__GroupAttrDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1264:2: rule__GroupAttrDecl__Group__1__Impl rule__GroupAttrDecl__Group__2
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__Group__1__Impl_in_rule__GroupAttrDecl__Group__12568);
            rule__GroupAttrDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupAttrDecl__Group__2_in_rule__GroupAttrDecl__Group__12571);
            rule__GroupAttrDecl__Group__2();

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
    // $ANTLR end "rule__GroupAttrDecl__Group__1"


    // $ANTLR start "rule__GroupAttrDecl__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1271:1: rule__GroupAttrDecl__Group__1__Impl : ( ( rule__GroupAttrDecl__AttributeNameAssignment_1 ) ) ;
    public final void rule__GroupAttrDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1275:1: ( ( ( rule__GroupAttrDecl__AttributeNameAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1276:1: ( ( rule__GroupAttrDecl__AttributeNameAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1276:1: ( ( rule__GroupAttrDecl__AttributeNameAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1277:1: ( rule__GroupAttrDecl__AttributeNameAssignment_1 )
            {
             before(grammarAccess.getGroupAttrDeclAccess().getAttributeNameAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1278:1: ( rule__GroupAttrDecl__AttributeNameAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1278:2: rule__GroupAttrDecl__AttributeNameAssignment_1
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__AttributeNameAssignment_1_in_rule__GroupAttrDecl__Group__1__Impl2598);
            rule__GroupAttrDecl__AttributeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAttrDeclAccess().getAttributeNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__Group__1__Impl"


    // $ANTLR start "rule__GroupAttrDecl__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1288:1: rule__GroupAttrDecl__Group__2 : rule__GroupAttrDecl__Group__2__Impl ;
    public final void rule__GroupAttrDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1292:1: ( rule__GroupAttrDecl__Group__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1293:2: rule__GroupAttrDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__Group__2__Impl_in_rule__GroupAttrDecl__Group__22628);
            rule__GroupAttrDecl__Group__2__Impl();

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
    // $ANTLR end "rule__GroupAttrDecl__Group__2"


    // $ANTLR start "rule__GroupAttrDecl__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1299:1: rule__GroupAttrDecl__Group__2__Impl : ( ( rule__GroupAttrDecl__Alternatives_2 ) ) ;
    public final void rule__GroupAttrDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1303:1: ( ( ( rule__GroupAttrDecl__Alternatives_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1304:1: ( ( rule__GroupAttrDecl__Alternatives_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1304:1: ( ( rule__GroupAttrDecl__Alternatives_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1305:1: ( rule__GroupAttrDecl__Alternatives_2 )
            {
             before(grammarAccess.getGroupAttrDeclAccess().getAlternatives_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1306:1: ( rule__GroupAttrDecl__Alternatives_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1306:2: rule__GroupAttrDecl__Alternatives_2
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__Alternatives_2_in_rule__GroupAttrDecl__Group__2__Impl2655);
            rule__GroupAttrDecl__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAttrDeclAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__Group__2__Impl"


    // $ANTLR start "rule__GroupAttrDecl__Group_2_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1322:1: rule__GroupAttrDecl__Group_2_0__0 : rule__GroupAttrDecl__Group_2_0__0__Impl rule__GroupAttrDecl__Group_2_0__1 ;
    public final void rule__GroupAttrDecl__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1326:1: ( rule__GroupAttrDecl__Group_2_0__0__Impl rule__GroupAttrDecl__Group_2_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1327:2: rule__GroupAttrDecl__Group_2_0__0__Impl rule__GroupAttrDecl__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__Group_2_0__0__Impl_in_rule__GroupAttrDecl__Group_2_0__02691);
            rule__GroupAttrDecl__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupAttrDecl__Group_2_0__1_in_rule__GroupAttrDecl__Group_2_0__02694);
            rule__GroupAttrDecl__Group_2_0__1();

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
    // $ANTLR end "rule__GroupAttrDecl__Group_2_0__0"


    // $ANTLR start "rule__GroupAttrDecl__Group_2_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1334:1: rule__GroupAttrDecl__Group_2_0__0__Impl : ( ':' ) ;
    public final void rule__GroupAttrDecl__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1338:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1339:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1339:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1340:1: ':'
            {
             before(grammarAccess.getGroupAttrDeclAccess().getColonKeyword_2_0_0()); 
            match(input,19,FOLLOW_19_in_rule__GroupAttrDecl__Group_2_0__0__Impl2722); 
             after(grammarAccess.getGroupAttrDeclAccess().getColonKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__Group_2_0__0__Impl"


    // $ANTLR start "rule__GroupAttrDecl__Group_2_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1353:1: rule__GroupAttrDecl__Group_2_0__1 : rule__GroupAttrDecl__Group_2_0__1__Impl ;
    public final void rule__GroupAttrDecl__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1357:1: ( rule__GroupAttrDecl__Group_2_0__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1358:2: rule__GroupAttrDecl__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__Group_2_0__1__Impl_in_rule__GroupAttrDecl__Group_2_0__12753);
            rule__GroupAttrDecl__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__GroupAttrDecl__Group_2_0__1"


    // $ANTLR start "rule__GroupAttrDecl__Group_2_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1364:1: rule__GroupAttrDecl__Group_2_0__1__Impl : ( ( rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1 ) ) ;
    public final void rule__GroupAttrDecl__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1368:1: ( ( ( rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1369:1: ( ( rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1369:1: ( ( rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1370:1: ( rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1 )
            {
             before(grammarAccess.getGroupAttrDeclAccess().getAttributeTypeAssignment_2_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1371:1: ( rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1371:2: rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1_in_rule__GroupAttrDecl__Group_2_0__1__Impl2780);
            rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAttrDeclAccess().getAttributeTypeAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__Group_2_0__1__Impl"


    // $ANTLR start "rule__GroupAttrDecl__Group_2_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1385:1: rule__GroupAttrDecl__Group_2_1__0 : rule__GroupAttrDecl__Group_2_1__0__Impl rule__GroupAttrDecl__Group_2_1__1 ;
    public final void rule__GroupAttrDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1389:1: ( rule__GroupAttrDecl__Group_2_1__0__Impl rule__GroupAttrDecl__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1390:2: rule__GroupAttrDecl__Group_2_1__0__Impl rule__GroupAttrDecl__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__Group_2_1__0__Impl_in_rule__GroupAttrDecl__Group_2_1__02814);
            rule__GroupAttrDecl__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupAttrDecl__Group_2_1__1_in_rule__GroupAttrDecl__Group_2_1__02817);
            rule__GroupAttrDecl__Group_2_1__1();

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
    // $ANTLR end "rule__GroupAttrDecl__Group_2_1__0"


    // $ANTLR start "rule__GroupAttrDecl__Group_2_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1397:1: rule__GroupAttrDecl__Group_2_1__0__Impl : ( '=' ) ;
    public final void rule__GroupAttrDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1401:1: ( ( '=' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1402:1: ( '=' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1402:1: ( '=' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1403:1: '='
            {
             before(grammarAccess.getGroupAttrDeclAccess().getEqualsSignKeyword_2_1_0()); 
            match(input,20,FOLLOW_20_in_rule__GroupAttrDecl__Group_2_1__0__Impl2845); 
             after(grammarAccess.getGroupAttrDeclAccess().getEqualsSignKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__Group_2_1__0__Impl"


    // $ANTLR start "rule__GroupAttrDecl__Group_2_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1416:1: rule__GroupAttrDecl__Group_2_1__1 : rule__GroupAttrDecl__Group_2_1__1__Impl ;
    public final void rule__GroupAttrDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1420:1: ( rule__GroupAttrDecl__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1421:2: rule__GroupAttrDecl__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__Group_2_1__1__Impl_in_rule__GroupAttrDecl__Group_2_1__12876);
            rule__GroupAttrDecl__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__GroupAttrDecl__Group_2_1__1"


    // $ANTLR start "rule__GroupAttrDecl__Group_2_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1427:1: rule__GroupAttrDecl__Group_2_1__1__Impl : ( ( rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1 ) ) ;
    public final void rule__GroupAttrDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1431:1: ( ( ( rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1432:1: ( ( rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1432:1: ( ( rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1433:1: ( rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1 )
            {
             before(grammarAccess.getGroupAttrDeclAccess().getAttributeLiteralAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1434:1: ( rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1434:2: rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1_in_rule__GroupAttrDecl__Group_2_1__1__Impl2903);
            rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAttrDeclAccess().getAttributeLiteralAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__Group_2_1__1__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1448:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1452:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1453:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__02937);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__02940);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1460:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1464:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1465:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1465:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1466:1: ()
            {
             before(grammarAccess.getTypeAccess().getBasicTypeAction_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1467:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1469:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1479:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl rule__Type__Group_0__2 ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1483:1: ( rule__Type__Group_0__1__Impl rule__Type__Group_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1484:2: rule__Type__Group_0__1__Impl rule__Type__Group_0__2
            {
            pushFollow(FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__12998);
            rule__Type__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0__2_in_rule__Type__Group_0__13001);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1491:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__BaseTypeAssignment_0_1 ) ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1495:1: ( ( ( rule__Type__BaseTypeAssignment_0_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1496:1: ( ( rule__Type__BaseTypeAssignment_0_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1496:1: ( ( rule__Type__BaseTypeAssignment_0_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1497:1: ( rule__Type__BaseTypeAssignment_0_1 )
            {
             before(grammarAccess.getTypeAccess().getBaseTypeAssignment_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1498:1: ( rule__Type__BaseTypeAssignment_0_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1498:2: rule__Type__BaseTypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Type__BaseTypeAssignment_0_1_in_rule__Type__Group_0__1__Impl3028);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1508:1: rule__Type__Group_0__2 : rule__Type__Group_0__2__Impl ;
    public final void rule__Type__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1512:1: ( rule__Type__Group_0__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1513:2: rule__Type__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0__2__Impl_in_rule__Type__Group_0__23058);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1519:1: rule__Type__Group_0__2__Impl : ( ( rule__Type__Alternatives_0_2 )* ) ;
    public final void rule__Type__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1523:1: ( ( ( rule__Type__Alternatives_0_2 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1524:1: ( ( rule__Type__Alternatives_0_2 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1524:1: ( ( rule__Type__Alternatives_0_2 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1525:1: ( rule__Type__Alternatives_0_2 )*
            {
             before(grammarAccess.getTypeAccess().getAlternatives_0_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1526:1: ( rule__Type__Alternatives_0_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17||LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1526:2: rule__Type__Alternatives_0_2
            	    {
            	    pushFollow(FOLLOW_rule__Type__Alternatives_0_2_in_rule__Type__Group_0__2__Impl3085);
            	    rule__Type__Alternatives_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1542:1: rule__Type__Group_0_2_0__0 : rule__Type__Group_0_2_0__0__Impl rule__Type__Group_0_2_0__1 ;
    public final void rule__Type__Group_0_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1546:1: ( rule__Type__Group_0_2_0__0__Impl rule__Type__Group_0_2_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1547:2: rule__Type__Group_0_2_0__0__Impl rule__Type__Group_0_2_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_0__0__Impl_in_rule__Type__Group_0_2_0__03122);
            rule__Type__Group_0_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_2_0__1_in_rule__Type__Group_0_2_0__03125);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1554:1: rule__Type__Group_0_2_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1558:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1559:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1559:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1560:1: ()
            {
             before(grammarAccess.getTypeAccess().getListTypeBaseAction_0_2_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1561:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1563:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1573:1: rule__Type__Group_0_2_0__1 : rule__Type__Group_0_2_0__1__Impl rule__Type__Group_0_2_0__2 ;
    public final void rule__Type__Group_0_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1577:1: ( rule__Type__Group_0_2_0__1__Impl rule__Type__Group_0_2_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1578:2: rule__Type__Group_0_2_0__1__Impl rule__Type__Group_0_2_0__2
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_0__1__Impl_in_rule__Type__Group_0_2_0__13183);
            rule__Type__Group_0_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_2_0__2_in_rule__Type__Group_0_2_0__13186);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1585:1: rule__Type__Group_0_2_0__1__Impl : ( '[' ) ;
    public final void rule__Type__Group_0_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1589:1: ( ( '[' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1590:1: ( '[' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1590:1: ( '[' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1591:1: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_2_0_1()); 
            match(input,21,FOLLOW_21_in_rule__Type__Group_0_2_0__1__Impl3214); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1604:1: rule__Type__Group_0_2_0__2 : rule__Type__Group_0_2_0__2__Impl ;
    public final void rule__Type__Group_0_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1608:1: ( rule__Type__Group_0_2_0__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1609:2: rule__Type__Group_0_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_0__2__Impl_in_rule__Type__Group_0_2_0__23245);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1615:1: rule__Type__Group_0_2_0__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_0_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1619:1: ( ( ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1620:1: ( ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1620:1: ( ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1621:1: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2_0_2()); 
            match(input,22,FOLLOW_22_in_rule__Type__Group_0_2_0__2__Impl3273); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1640:1: rule__Type__Group_0_2_1__0 : rule__Type__Group_0_2_1__0__Impl rule__Type__Group_0_2_1__1 ;
    public final void rule__Type__Group_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1644:1: ( rule__Type__Group_0_2_1__0__Impl rule__Type__Group_0_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1645:2: rule__Type__Group_0_2_1__0__Impl rule__Type__Group_0_2_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_1__0__Impl_in_rule__Type__Group_0_2_1__03310);
            rule__Type__Group_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_2_1__1_in_rule__Type__Group_0_2_1__03313);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1652:1: rule__Type__Group_0_2_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1656:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1657:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1657:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1658:1: ()
            {
             before(grammarAccess.getTypeAccess().getSetTypeBaseAction_0_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1659:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1661:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1671:1: rule__Type__Group_0_2_1__1 : rule__Type__Group_0_2_1__1__Impl rule__Type__Group_0_2_1__2 ;
    public final void rule__Type__Group_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1675:1: ( rule__Type__Group_0_2_1__1__Impl rule__Type__Group_0_2_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1676:2: rule__Type__Group_0_2_1__1__Impl rule__Type__Group_0_2_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_1__1__Impl_in_rule__Type__Group_0_2_1__13371);
            rule__Type__Group_0_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_0_2_1__2_in_rule__Type__Group_0_2_1__13374);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1683:1: rule__Type__Group_0_2_1__1__Impl : ( '{' ) ;
    public final void rule__Type__Group_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1687:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1688:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1688:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1689:1: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_0_2_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Type__Group_0_2_1__1__Impl3402); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1702:1: rule__Type__Group_0_2_1__2 : rule__Type__Group_0_2_1__2__Impl ;
    public final void rule__Type__Group_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1706:1: ( rule__Type__Group_0_2_1__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1707:2: rule__Type__Group_0_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0_2_1__2__Impl_in_rule__Type__Group_0_2_1__23433);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1713:1: rule__Type__Group_0_2_1__2__Impl : ( '}' ) ;
    public final void rule__Type__Group_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1717:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1718:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1718:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1719:1: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_0_2_1_2()); 
            match(input,18,FOLLOW_18_in_rule__Type__Group_0_2_1__2__Impl3461); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1738:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1742:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1743:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03498);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03501);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1750:1: rule__Type__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1754:1: ( ( '<' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1755:1: ( '<' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1755:1: ( '<' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1756:1: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Type__Group_1__0__Impl3529); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1769:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1773:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1774:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13560);
            rule__Type__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__13563);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1781:1: rule__Type__Group_1__1__Impl : ( () ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1785:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1786:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1786:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1787:1: ()
            {
             before(grammarAccess.getTypeAccess().getTupleTypeAction_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1788:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1790:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1800:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl rule__Type__Group_1__3 ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1804:1: ( rule__Type__Group_1__2__Impl rule__Type__Group_1__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1805:2: rule__Type__Group_1__2__Impl rule__Type__Group_1__3
            {
            pushFollow(FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__23621);
            rule__Type__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__3_in_rule__Type__Group_1__23624);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1812:1: rule__Type__Group_1__2__Impl : ( ( rule__Type__ElemTypesAssignment_1_2 ) ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1816:1: ( ( ( rule__Type__ElemTypesAssignment_1_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1817:1: ( ( rule__Type__ElemTypesAssignment_1_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1817:1: ( ( rule__Type__ElemTypesAssignment_1_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1818:1: ( rule__Type__ElemTypesAssignment_1_2 )
            {
             before(grammarAccess.getTypeAccess().getElemTypesAssignment_1_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1819:1: ( rule__Type__ElemTypesAssignment_1_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1819:2: rule__Type__ElemTypesAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Type__ElemTypesAssignment_1_2_in_rule__Type__Group_1__2__Impl3651);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1829:1: rule__Type__Group_1__3 : rule__Type__Group_1__3__Impl rule__Type__Group_1__4 ;
    public final void rule__Type__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1833:1: ( rule__Type__Group_1__3__Impl rule__Type__Group_1__4 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1834:2: rule__Type__Group_1__3__Impl rule__Type__Group_1__4
            {
            pushFollow(FOLLOW_rule__Type__Group_1__3__Impl_in_rule__Type__Group_1__33681);
            rule__Type__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__4_in_rule__Type__Group_1__33684);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1841:1: rule__Type__Group_1__3__Impl : ( ( ( rule__Type__Group_1_3__0 ) ) ( ( rule__Type__Group_1_3__0 )* ) ) ;
    public final void rule__Type__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1845:1: ( ( ( ( rule__Type__Group_1_3__0 ) ) ( ( rule__Type__Group_1_3__0 )* ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1846:1: ( ( ( rule__Type__Group_1_3__0 ) ) ( ( rule__Type__Group_1_3__0 )* ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1846:1: ( ( ( rule__Type__Group_1_3__0 ) ) ( ( rule__Type__Group_1_3__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1847:1: ( ( rule__Type__Group_1_3__0 ) ) ( ( rule__Type__Group_1_3__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1847:1: ( ( rule__Type__Group_1_3__0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1848:1: ( rule__Type__Group_1_3__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup_1_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1849:1: ( rule__Type__Group_1_3__0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1849:2: rule__Type__Group_1_3__0
            {
            pushFollow(FOLLOW_rule__Type__Group_1_3__0_in_rule__Type__Group_1__3__Impl3713);
            rule__Type__Group_1_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup_1_3()); 

            }

            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1852:1: ( ( rule__Type__Group_1_3__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1853:1: ( rule__Type__Group_1_3__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_1_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1854:1: ( rule__Type__Group_1_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1854:2: rule__Type__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Type__Group_1_3__0_in_rule__Type__Group_1__3__Impl3725);
            	    rule__Type__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1865:1: rule__Type__Group_1__4 : rule__Type__Group_1__4__Impl ;
    public final void rule__Type__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1869:1: ( rule__Type__Group_1__4__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1870:2: rule__Type__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__4__Impl_in_rule__Type__Group_1__43758);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1876:1: rule__Type__Group_1__4__Impl : ( '>' ) ;
    public final void rule__Type__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1880:1: ( ( '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1881:1: ( '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1881:1: ( '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1882:1: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_4()); 
            match(input,24,FOLLOW_24_in_rule__Type__Group_1__4__Impl3786); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1905:1: rule__Type__Group_1_3__0 : rule__Type__Group_1_3__0__Impl rule__Type__Group_1_3__1 ;
    public final void rule__Type__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1909:1: ( rule__Type__Group_1_3__0__Impl rule__Type__Group_1_3__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1910:2: rule__Type__Group_1_3__0__Impl rule__Type__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1_3__0__Impl_in_rule__Type__Group_1_3__03827);
            rule__Type__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1_3__1_in_rule__Type__Group_1_3__03830);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1917:1: rule__Type__Group_1_3__0__Impl : ( '*' ) ;
    public final void rule__Type__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1921:1: ( ( '*' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1922:1: ( '*' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1922:1: ( '*' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1923:1: '*'
            {
             before(grammarAccess.getTypeAccess().getAsteriskKeyword_1_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Type__Group_1_3__0__Impl3858); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1936:1: rule__Type__Group_1_3__1 : rule__Type__Group_1_3__1__Impl ;
    public final void rule__Type__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1940:1: ( rule__Type__Group_1_3__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1941:2: rule__Type__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1_3__1__Impl_in_rule__Type__Group_1_3__13889);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1947:1: rule__Type__Group_1_3__1__Impl : ( ( rule__Type__ElemTypesAssignment_1_3_1 ) ) ;
    public final void rule__Type__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1951:1: ( ( ( rule__Type__ElemTypesAssignment_1_3_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1952:1: ( ( rule__Type__ElemTypesAssignment_1_3_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1952:1: ( ( rule__Type__ElemTypesAssignment_1_3_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1953:1: ( rule__Type__ElemTypesAssignment_1_3_1 )
            {
             before(grammarAccess.getTypeAccess().getElemTypesAssignment_1_3_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1954:1: ( rule__Type__ElemTypesAssignment_1_3_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1954:2: rule__Type__ElemTypesAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Type__ElemTypesAssignment_1_3_1_in_rule__Type__Group_1_3__1__Impl3916);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1968:1: rule__BasicLiteral__Group__0 : rule__BasicLiteral__Group__0__Impl rule__BasicLiteral__Group__1 ;
    public final void rule__BasicLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1972:1: ( rule__BasicLiteral__Group__0__Impl rule__BasicLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1973:2: rule__BasicLiteral__Group__0__Impl rule__BasicLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BasicLiteral__Group__0__Impl_in_rule__BasicLiteral__Group__03950);
            rule__BasicLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicLiteral__Group__1_in_rule__BasicLiteral__Group__03953);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1980:1: rule__BasicLiteral__Group__0__Impl : ( ( rule__BasicLiteral__TypeConsAssignment_0 ) ) ;
    public final void rule__BasicLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1984:1: ( ( ( rule__BasicLiteral__TypeConsAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1985:1: ( ( rule__BasicLiteral__TypeConsAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1985:1: ( ( rule__BasicLiteral__TypeConsAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1986:1: ( rule__BasicLiteral__TypeConsAssignment_0 )
            {
             before(grammarAccess.getBasicLiteralAccess().getTypeConsAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1987:1: ( rule__BasicLiteral__TypeConsAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1987:2: rule__BasicLiteral__TypeConsAssignment_0
            {
            pushFollow(FOLLOW_rule__BasicLiteral__TypeConsAssignment_0_in_rule__BasicLiteral__Group__0__Impl3980);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:1997:1: rule__BasicLiteral__Group__1 : rule__BasicLiteral__Group__1__Impl ;
    public final void rule__BasicLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2001:1: ( rule__BasicLiteral__Group__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2002:2: rule__BasicLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicLiteral__Group__1__Impl_in_rule__BasicLiteral__Group__14010);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2008:1: rule__BasicLiteral__Group__1__Impl : ( ( rule__BasicLiteral__LitAssignment_1 ) ) ;
    public final void rule__BasicLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2012:1: ( ( ( rule__BasicLiteral__LitAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2013:1: ( ( rule__BasicLiteral__LitAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2013:1: ( ( rule__BasicLiteral__LitAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2014:1: ( rule__BasicLiteral__LitAssignment_1 )
            {
             before(grammarAccess.getBasicLiteralAccess().getLitAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2015:1: ( rule__BasicLiteral__LitAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2015:2: rule__BasicLiteral__LitAssignment_1
            {
            pushFollow(FOLLOW_rule__BasicLiteral__LitAssignment_1_in_rule__BasicLiteral__Group__1__Impl4037);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2029:1: rule__TupleLiteral__Group__0 : rule__TupleLiteral__Group__0__Impl rule__TupleLiteral__Group__1 ;
    public final void rule__TupleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2033:1: ( rule__TupleLiteral__Group__0__Impl rule__TupleLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2034:2: rule__TupleLiteral__Group__0__Impl rule__TupleLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__0__Impl_in_rule__TupleLiteral__Group__04071);
            rule__TupleLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group__1_in_rule__TupleLiteral__Group__04074);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2041:1: rule__TupleLiteral__Group__0__Impl : ( '<' ) ;
    public final void rule__TupleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2045:1: ( ( '<' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2046:1: ( '<' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2046:1: ( '<' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2047:1: '<'
            {
             before(grammarAccess.getTupleLiteralAccess().getLessThanSignKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__TupleLiteral__Group__0__Impl4102); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2060:1: rule__TupleLiteral__Group__1 : rule__TupleLiteral__Group__1__Impl rule__TupleLiteral__Group__2 ;
    public final void rule__TupleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2064:1: ( rule__TupleLiteral__Group__1__Impl rule__TupleLiteral__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2065:2: rule__TupleLiteral__Group__1__Impl rule__TupleLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__1__Impl_in_rule__TupleLiteral__Group__14133);
            rule__TupleLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group__2_in_rule__TupleLiteral__Group__14136);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2072:1: rule__TupleLiteral__Group__1__Impl : ( () ) ;
    public final void rule__TupleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2076:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2077:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2077:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2078:1: ()
            {
             before(grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2079:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2081:1: 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2091:1: rule__TupleLiteral__Group__2 : rule__TupleLiteral__Group__2__Impl rule__TupleLiteral__Group__3 ;
    public final void rule__TupleLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2095:1: ( rule__TupleLiteral__Group__2__Impl rule__TupleLiteral__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2096:2: rule__TupleLiteral__Group__2__Impl rule__TupleLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__2__Impl_in_rule__TupleLiteral__Group__24194);
            rule__TupleLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group__3_in_rule__TupleLiteral__Group__24197);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2103:1: rule__TupleLiteral__Group__2__Impl : ( ( rule__TupleLiteral__Group_2__0 )? ) ;
    public final void rule__TupleLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2107:1: ( ( ( rule__TupleLiteral__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2108:1: ( ( rule__TupleLiteral__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2108:1: ( ( rule__TupleLiteral__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2109:1: ( rule__TupleLiteral__Group_2__0 )?
            {
             before(grammarAccess.getTupleLiteralAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2110:1: ( rule__TupleLiteral__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2110:2: rule__TupleLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TupleLiteral__Group_2__0_in_rule__TupleLiteral__Group__2__Impl4224);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2120:1: rule__TupleLiteral__Group__3 : rule__TupleLiteral__Group__3__Impl ;
    public final void rule__TupleLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2124:1: ( rule__TupleLiteral__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2125:2: rule__TupleLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group__3__Impl_in_rule__TupleLiteral__Group__34255);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2131:1: rule__TupleLiteral__Group__3__Impl : ( '>' ) ;
    public final void rule__TupleLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2135:1: ( ( '>' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2136:1: ( '>' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2136:1: ( '>' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2137:1: '>'
            {
             before(grammarAccess.getTupleLiteralAccess().getGreaterThanSignKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__TupleLiteral__Group__3__Impl4283); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2158:1: rule__TupleLiteral__Group_2__0 : rule__TupleLiteral__Group_2__0__Impl rule__TupleLiteral__Group_2__1 ;
    public final void rule__TupleLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2162:1: ( rule__TupleLiteral__Group_2__0__Impl rule__TupleLiteral__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2163:2: rule__TupleLiteral__Group_2__0__Impl rule__TupleLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2__0__Impl_in_rule__TupleLiteral__Group_2__04322);
            rule__TupleLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group_2__1_in_rule__TupleLiteral__Group_2__04325);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2170:1: rule__TupleLiteral__Group_2__0__Impl : ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) ) ;
    public final void rule__TupleLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2174:1: ( ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2175:1: ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2175:1: ( ( rule__TupleLiteral__ElemsAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2176:1: ( rule__TupleLiteral__ElemsAssignment_2_0 )
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2177:1: ( rule__TupleLiteral__ElemsAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2177:2: rule__TupleLiteral__ElemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__TupleLiteral__ElemsAssignment_2_0_in_rule__TupleLiteral__Group_2__0__Impl4352);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2187:1: rule__TupleLiteral__Group_2__1 : rule__TupleLiteral__Group_2__1__Impl ;
    public final void rule__TupleLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2191:1: ( rule__TupleLiteral__Group_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2192:2: rule__TupleLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2__1__Impl_in_rule__TupleLiteral__Group_2__14382);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2198:1: rule__TupleLiteral__Group_2__1__Impl : ( ( rule__TupleLiteral__Group_2_1__0 )* ) ;
    public final void rule__TupleLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2202:1: ( ( ( rule__TupleLiteral__Group_2_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2203:1: ( ( rule__TupleLiteral__Group_2_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2203:1: ( ( rule__TupleLiteral__Group_2_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2204:1: ( rule__TupleLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getTupleLiteralAccess().getGroup_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2205:1: ( rule__TupleLiteral__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2205:2: rule__TupleLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__0_in_rule__TupleLiteral__Group_2__1__Impl4409);
            	    rule__TupleLiteral__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2219:1: rule__TupleLiteral__Group_2_1__0 : rule__TupleLiteral__Group_2_1__0__Impl rule__TupleLiteral__Group_2_1__1 ;
    public final void rule__TupleLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2223:1: ( rule__TupleLiteral__Group_2_1__0__Impl rule__TupleLiteral__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2224:2: rule__TupleLiteral__Group_2_1__0__Impl rule__TupleLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__0__Impl_in_rule__TupleLiteral__Group_2_1__04444);
            rule__TupleLiteral__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__1_in_rule__TupleLiteral__Group_2_1__04447);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2231:1: rule__TupleLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__TupleLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2235:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2236:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2236:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2237:1: ','
            {
             before(grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_16_in_rule__TupleLiteral__Group_2_1__0__Impl4475); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2250:1: rule__TupleLiteral__Group_2_1__1 : rule__TupleLiteral__Group_2_1__1__Impl ;
    public final void rule__TupleLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2254:1: ( rule__TupleLiteral__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2255:2: rule__TupleLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleLiteral__Group_2_1__1__Impl_in_rule__TupleLiteral__Group_2_1__14506);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2261:1: rule__TupleLiteral__Group_2_1__1__Impl : ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) ) ;
    public final void rule__TupleLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2265:1: ( ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2266:1: ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2266:1: ( ( rule__TupleLiteral__ElemsAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2267:1: ( rule__TupleLiteral__ElemsAssignment_2_1_1 )
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2268:1: ( rule__TupleLiteral__ElemsAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2268:2: rule__TupleLiteral__ElemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__TupleLiteral__ElemsAssignment_2_1_1_in_rule__TupleLiteral__Group_2_1__1__Impl4533);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2282:1: rule__ListLiteral__Group__0 : rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 ;
    public final void rule__ListLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2286:1: ( rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2287:2: rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__04567);
            rule__ListLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__04570);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2294:1: rule__ListLiteral__Group__0__Impl : ( ( rule__ListLiteral__TypeConsAssignment_0 ) ) ;
    public final void rule__ListLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2298:1: ( ( ( rule__ListLiteral__TypeConsAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2299:1: ( ( rule__ListLiteral__TypeConsAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2299:1: ( ( rule__ListLiteral__TypeConsAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2300:1: ( rule__ListLiteral__TypeConsAssignment_0 )
            {
             before(grammarAccess.getListLiteralAccess().getTypeConsAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2301:1: ( rule__ListLiteral__TypeConsAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2301:2: rule__ListLiteral__TypeConsAssignment_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__TypeConsAssignment_0_in_rule__ListLiteral__Group__0__Impl4597);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2311:1: rule__ListLiteral__Group__1 : rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 ;
    public final void rule__ListLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2315:1: ( rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2316:2: rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__14627);
            rule__ListLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__14630);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2323:1: rule__ListLiteral__Group__1__Impl : ( '[' ) ;
    public final void rule__ListLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2327:1: ( ( '[' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2328:1: ( '[' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2328:1: ( '[' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2329:1: '['
            {
             before(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ListLiteral__Group__1__Impl4658); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2342:1: rule__ListLiteral__Group__2 : rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 ;
    public final void rule__ListLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2346:1: ( rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2347:2: rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__24689);
            rule__ListLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__3_in_rule__ListLiteral__Group__24692);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2354:1: rule__ListLiteral__Group__2__Impl : ( ( rule__ListLiteral__Group_2__0 )? ) ;
    public final void rule__ListLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2358:1: ( ( ( rule__ListLiteral__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2359:1: ( ( rule__ListLiteral__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2359:1: ( ( rule__ListLiteral__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2360:1: ( rule__ListLiteral__Group_2__0 )?
            {
             before(grammarAccess.getListLiteralAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2361:1: ( rule__ListLiteral__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LIT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2361:2: rule__ListLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ListLiteral__Group_2__0_in_rule__ListLiteral__Group__2__Impl4719);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2371:1: rule__ListLiteral__Group__3 : rule__ListLiteral__Group__3__Impl ;
    public final void rule__ListLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2375:1: ( rule__ListLiteral__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2376:2: rule__ListLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__3__Impl_in_rule__ListLiteral__Group__34750);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2382:1: rule__ListLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__ListLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2386:1: ( ( ']' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2387:1: ( ']' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2387:1: ( ']' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2388:1: ']'
            {
             before(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__ListLiteral__Group__3__Impl4778); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2409:1: rule__ListLiteral__Group_2__0 : rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 ;
    public final void rule__ListLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2413:1: ( rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2414:2: rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2__0__Impl_in_rule__ListLiteral__Group_2__04817);
            rule__ListLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_2__1_in_rule__ListLiteral__Group_2__04820);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2421:1: rule__ListLiteral__Group_2__0__Impl : ( ( rule__ListLiteral__ElemsAssignment_2_0 ) ) ;
    public final void rule__ListLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2425:1: ( ( ( rule__ListLiteral__ElemsAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2426:1: ( ( rule__ListLiteral__ElemsAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2426:1: ( ( rule__ListLiteral__ElemsAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2427:1: ( rule__ListLiteral__ElemsAssignment_2_0 )
            {
             before(grammarAccess.getListLiteralAccess().getElemsAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2428:1: ( rule__ListLiteral__ElemsAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2428:2: rule__ListLiteral__ElemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__ElemsAssignment_2_0_in_rule__ListLiteral__Group_2__0__Impl4847);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2438:1: rule__ListLiteral__Group_2__1 : rule__ListLiteral__Group_2__1__Impl ;
    public final void rule__ListLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2442:1: ( rule__ListLiteral__Group_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2443:2: rule__ListLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2__1__Impl_in_rule__ListLiteral__Group_2__14877);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2449:1: rule__ListLiteral__Group_2__1__Impl : ( ( rule__ListLiteral__Group_2_1__0 )* ) ;
    public final void rule__ListLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2453:1: ( ( ( rule__ListLiteral__Group_2_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2454:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2454:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2455:1: ( rule__ListLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getListLiteralAccess().getGroup_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2456:1: ( rule__ListLiteral__Group_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2456:2: rule__ListLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__0_in_rule__ListLiteral__Group_2__1__Impl4904);
            	    rule__ListLiteral__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2470:1: rule__ListLiteral__Group_2_1__0 : rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 ;
    public final void rule__ListLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2474:1: ( rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2475:2: rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__0__Impl_in_rule__ListLiteral__Group_2_1__04939);
            rule__ListLiteral__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__1_in_rule__ListLiteral__Group_2_1__04942);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2482:1: rule__ListLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ListLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2486:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2487:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2487:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2488:1: ','
            {
             before(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_16_in_rule__ListLiteral__Group_2_1__0__Impl4970); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2501:1: rule__ListLiteral__Group_2_1__1 : rule__ListLiteral__Group_2_1__1__Impl ;
    public final void rule__ListLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2505:1: ( rule__ListLiteral__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2506:2: rule__ListLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__1__Impl_in_rule__ListLiteral__Group_2_1__15001);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2512:1: rule__ListLiteral__Group_2_1__1__Impl : ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) ) ;
    public final void rule__ListLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2516:1: ( ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2517:1: ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2517:1: ( ( rule__ListLiteral__ElemsAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2518:1: ( rule__ListLiteral__ElemsAssignment_2_1_1 )
            {
             before(grammarAccess.getListLiteralAccess().getElemsAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2519:1: ( rule__ListLiteral__ElemsAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2519:2: rule__ListLiteral__ElemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ListLiteral__ElemsAssignment_2_1_1_in_rule__ListLiteral__Group_2_1__1__Impl5028);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2533:1: rule__SetLiteral__Group__0 : rule__SetLiteral__Group__0__Impl rule__SetLiteral__Group__1 ;
    public final void rule__SetLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2537:1: ( rule__SetLiteral__Group__0__Impl rule__SetLiteral__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2538:2: rule__SetLiteral__Group__0__Impl rule__SetLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__0__Impl_in_rule__SetLiteral__Group__05062);
            rule__SetLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group__1_in_rule__SetLiteral__Group__05065);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2545:1: rule__SetLiteral__Group__0__Impl : ( ( rule__SetLiteral__TypeConsAssignment_0 ) ) ;
    public final void rule__SetLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2549:1: ( ( ( rule__SetLiteral__TypeConsAssignment_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2550:1: ( ( rule__SetLiteral__TypeConsAssignment_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2550:1: ( ( rule__SetLiteral__TypeConsAssignment_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2551:1: ( rule__SetLiteral__TypeConsAssignment_0 )
            {
             before(grammarAccess.getSetLiteralAccess().getTypeConsAssignment_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2552:1: ( rule__SetLiteral__TypeConsAssignment_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2552:2: rule__SetLiteral__TypeConsAssignment_0
            {
            pushFollow(FOLLOW_rule__SetLiteral__TypeConsAssignment_0_in_rule__SetLiteral__Group__0__Impl5092);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2562:1: rule__SetLiteral__Group__1 : rule__SetLiteral__Group__1__Impl rule__SetLiteral__Group__2 ;
    public final void rule__SetLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2566:1: ( rule__SetLiteral__Group__1__Impl rule__SetLiteral__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2567:2: rule__SetLiteral__Group__1__Impl rule__SetLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__1__Impl_in_rule__SetLiteral__Group__15122);
            rule__SetLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group__2_in_rule__SetLiteral__Group__15125);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2574:1: rule__SetLiteral__Group__1__Impl : ( '{' ) ;
    public final void rule__SetLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2578:1: ( ( '{' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2579:1: ( '{' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2579:1: ( '{' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2580:1: '{'
            {
             before(grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__SetLiteral__Group__1__Impl5153); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2593:1: rule__SetLiteral__Group__2 : rule__SetLiteral__Group__2__Impl rule__SetLiteral__Group__3 ;
    public final void rule__SetLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2597:1: ( rule__SetLiteral__Group__2__Impl rule__SetLiteral__Group__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2598:2: rule__SetLiteral__Group__2__Impl rule__SetLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__2__Impl_in_rule__SetLiteral__Group__25184);
            rule__SetLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group__3_in_rule__SetLiteral__Group__25187);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2605:1: rule__SetLiteral__Group__2__Impl : ( ( rule__SetLiteral__Group_2__0 )? ) ;
    public final void rule__SetLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2609:1: ( ( ( rule__SetLiteral__Group_2__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2610:1: ( ( rule__SetLiteral__Group_2__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2610:1: ( ( rule__SetLiteral__Group_2__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2611:1: ( rule__SetLiteral__Group_2__0 )?
            {
             before(grammarAccess.getSetLiteralAccess().getGroup_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2612:1: ( rule__SetLiteral__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LIT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2612:2: rule__SetLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SetLiteral__Group_2__0_in_rule__SetLiteral__Group__2__Impl5214);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2622:1: rule__SetLiteral__Group__3 : rule__SetLiteral__Group__3__Impl ;
    public final void rule__SetLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2626:1: ( rule__SetLiteral__Group__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2627:2: rule__SetLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group__3__Impl_in_rule__SetLiteral__Group__35245);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2633:1: rule__SetLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__SetLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2637:1: ( ( '}' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2638:1: ( '}' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2638:1: ( '}' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2639:1: '}'
            {
             before(grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__SetLiteral__Group__3__Impl5273); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2660:1: rule__SetLiteral__Group_2__0 : rule__SetLiteral__Group_2__0__Impl rule__SetLiteral__Group_2__1 ;
    public final void rule__SetLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2664:1: ( rule__SetLiteral__Group_2__0__Impl rule__SetLiteral__Group_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2665:2: rule__SetLiteral__Group_2__0__Impl rule__SetLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2__0__Impl_in_rule__SetLiteral__Group_2__05312);
            rule__SetLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group_2__1_in_rule__SetLiteral__Group_2__05315);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2672:1: rule__SetLiteral__Group_2__0__Impl : ( ( rule__SetLiteral__ElemsAssignment_2_0 ) ) ;
    public final void rule__SetLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2676:1: ( ( ( rule__SetLiteral__ElemsAssignment_2_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2677:1: ( ( rule__SetLiteral__ElemsAssignment_2_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2677:1: ( ( rule__SetLiteral__ElemsAssignment_2_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2678:1: ( rule__SetLiteral__ElemsAssignment_2_0 )
            {
             before(grammarAccess.getSetLiteralAccess().getElemsAssignment_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2679:1: ( rule__SetLiteral__ElemsAssignment_2_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2679:2: rule__SetLiteral__ElemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__SetLiteral__ElemsAssignment_2_0_in_rule__SetLiteral__Group_2__0__Impl5342);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2689:1: rule__SetLiteral__Group_2__1 : rule__SetLiteral__Group_2__1__Impl ;
    public final void rule__SetLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2693:1: ( rule__SetLiteral__Group_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2694:2: rule__SetLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2__1__Impl_in_rule__SetLiteral__Group_2__15372);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2700:1: rule__SetLiteral__Group_2__1__Impl : ( ( rule__SetLiteral__Group_2_1__0 )* ) ;
    public final void rule__SetLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2704:1: ( ( ( rule__SetLiteral__Group_2_1__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2705:1: ( ( rule__SetLiteral__Group_2_1__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2705:1: ( ( rule__SetLiteral__Group_2_1__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2706:1: ( rule__SetLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getSetLiteralAccess().getGroup_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2707:1: ( rule__SetLiteral__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2707:2: rule__SetLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__0_in_rule__SetLiteral__Group_2__1__Impl5399);
            	    rule__SetLiteral__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2721:1: rule__SetLiteral__Group_2_1__0 : rule__SetLiteral__Group_2_1__0__Impl rule__SetLiteral__Group_2_1__1 ;
    public final void rule__SetLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2725:1: ( rule__SetLiteral__Group_2_1__0__Impl rule__SetLiteral__Group_2_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2726:2: rule__SetLiteral__Group_2_1__0__Impl rule__SetLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__0__Impl_in_rule__SetLiteral__Group_2_1__05434);
            rule__SetLiteral__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__1_in_rule__SetLiteral__Group_2_1__05437);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2733:1: rule__SetLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SetLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2737:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2738:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2738:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2739:1: ','
            {
             before(grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_16_in_rule__SetLiteral__Group_2_1__0__Impl5465); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2752:1: rule__SetLiteral__Group_2_1__1 : rule__SetLiteral__Group_2_1__1__Impl ;
    public final void rule__SetLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2756:1: ( rule__SetLiteral__Group_2_1__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2757:2: rule__SetLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SetLiteral__Group_2_1__1__Impl_in_rule__SetLiteral__Group_2_1__15496);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2763:1: rule__SetLiteral__Group_2_1__1__Impl : ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) ) ;
    public final void rule__SetLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2767:1: ( ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2768:1: ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2768:1: ( ( rule__SetLiteral__ElemsAssignment_2_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2769:1: ( rule__SetLiteral__ElemsAssignment_2_1_1 )
            {
             before(grammarAccess.getSetLiteralAccess().getElemsAssignment_2_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2770:1: ( rule__SetLiteral__ElemsAssignment_2_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2770:2: rule__SetLiteral__ElemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__SetLiteral__ElemsAssignment_2_1_1_in_rule__SetLiteral__Group_2_1__1__Impl5523);
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


    // $ANTLR start "rule__SubGroupDecl__Group__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2784:1: rule__SubGroupDecl__Group__0 : rule__SubGroupDecl__Group__0__Impl rule__SubGroupDecl__Group__1 ;
    public final void rule__SubGroupDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2788:1: ( rule__SubGroupDecl__Group__0__Impl rule__SubGroupDecl__Group__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2789:2: rule__SubGroupDecl__Group__0__Impl rule__SubGroupDecl__Group__1
            {
            pushFollow(FOLLOW_rule__SubGroupDecl__Group__0__Impl_in_rule__SubGroupDecl__Group__05557);
            rule__SubGroupDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupDecl__Group__1_in_rule__SubGroupDecl__Group__05560);
            rule__SubGroupDecl__Group__1();

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
    // $ANTLR end "rule__SubGroupDecl__Group__0"


    // $ANTLR start "rule__SubGroupDecl__Group__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2796:1: rule__SubGroupDecl__Group__0__Impl : ( ( rule__SubGroupDecl__Group_0__0 )? ) ;
    public final void rule__SubGroupDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2800:1: ( ( ( rule__SubGroupDecl__Group_0__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2801:1: ( ( rule__SubGroupDecl__Group_0__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2801:1: ( ( rule__SubGroupDecl__Group_0__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2802:1: ( rule__SubGroupDecl__Group_0__0 )?
            {
             before(grammarAccess.getSubGroupDeclAccess().getGroup_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2803:1: ( rule__SubGroupDecl__Group_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==19) ) {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==RULE_ID) ) {
                        int LA21_4 = input.LA(4);

                        if ( (LA21_4==15||(LA21_4>=19 && LA21_4<=20)) ) {
                            alt21=1;
                        }
                    }
                }
            }
            switch (alt21) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2803:2: rule__SubGroupDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SubGroupDecl__Group_0__0_in_rule__SubGroupDecl__Group__0__Impl5587);
                    rule__SubGroupDecl__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubGroupDeclAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupDecl__Group__0__Impl"


    // $ANTLR start "rule__SubGroupDecl__Group__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2813:1: rule__SubGroupDecl__Group__1 : rule__SubGroupDecl__Group__1__Impl rule__SubGroupDecl__Group__2 ;
    public final void rule__SubGroupDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2817:1: ( rule__SubGroupDecl__Group__1__Impl rule__SubGroupDecl__Group__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2818:2: rule__SubGroupDecl__Group__1__Impl rule__SubGroupDecl__Group__2
            {
            pushFollow(FOLLOW_rule__SubGroupDecl__Group__1__Impl_in_rule__SubGroupDecl__Group__15618);
            rule__SubGroupDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupDecl__Group__2_in_rule__SubGroupDecl__Group__15621);
            rule__SubGroupDecl__Group__2();

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
    // $ANTLR end "rule__SubGroupDecl__Group__1"


    // $ANTLR start "rule__SubGroupDecl__Group__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2825:1: rule__SubGroupDecl__Group__1__Impl : ( ( rule__SubGroupDecl__NameAssignment_1 ) ) ;
    public final void rule__SubGroupDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2829:1: ( ( ( rule__SubGroupDecl__NameAssignment_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2830:1: ( ( rule__SubGroupDecl__NameAssignment_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2830:1: ( ( rule__SubGroupDecl__NameAssignment_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2831:1: ( rule__SubGroupDecl__NameAssignment_1 )
            {
             before(grammarAccess.getSubGroupDeclAccess().getNameAssignment_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2832:1: ( rule__SubGroupDecl__NameAssignment_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2832:2: rule__SubGroupDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubGroupDecl__NameAssignment_1_in_rule__SubGroupDecl__Group__1__Impl5648);
            rule__SubGroupDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubGroupDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupDecl__Group__1__Impl"


    // $ANTLR start "rule__SubGroupDecl__Group__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2842:1: rule__SubGroupDecl__Group__2 : rule__SubGroupDecl__Group__2__Impl ;
    public final void rule__SubGroupDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2846:1: ( rule__SubGroupDecl__Group__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2847:2: rule__SubGroupDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SubGroupDecl__Group__2__Impl_in_rule__SubGroupDecl__Group__25678);
            rule__SubGroupDecl__Group__2__Impl();

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
    // $ANTLR end "rule__SubGroupDecl__Group__2"


    // $ANTLR start "rule__SubGroupDecl__Group__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2853:1: rule__SubGroupDecl__Group__2__Impl : ( ( rule__SubGroupDecl__TypeAssignment_2 ) ) ;
    public final void rule__SubGroupDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2857:1: ( ( ( rule__SubGroupDecl__TypeAssignment_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2858:1: ( ( rule__SubGroupDecl__TypeAssignment_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2858:1: ( ( rule__SubGroupDecl__TypeAssignment_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2859:1: ( rule__SubGroupDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getSubGroupDeclAccess().getTypeAssignment_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2860:1: ( rule__SubGroupDecl__TypeAssignment_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2860:2: rule__SubGroupDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SubGroupDecl__TypeAssignment_2_in_rule__SubGroupDecl__Group__2__Impl5705);
            rule__SubGroupDecl__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubGroupDeclAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupDecl__Group__2__Impl"


    // $ANTLR start "rule__SubGroupDecl__Group_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2876:1: rule__SubGroupDecl__Group_0__0 : rule__SubGroupDecl__Group_0__0__Impl rule__SubGroupDecl__Group_0__1 ;
    public final void rule__SubGroupDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2880:1: ( rule__SubGroupDecl__Group_0__0__Impl rule__SubGroupDecl__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2881:2: rule__SubGroupDecl__Group_0__0__Impl rule__SubGroupDecl__Group_0__1
            {
            pushFollow(FOLLOW_rule__SubGroupDecl__Group_0__0__Impl_in_rule__SubGroupDecl__Group_0__05741);
            rule__SubGroupDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupDecl__Group_0__1_in_rule__SubGroupDecl__Group_0__05744);
            rule__SubGroupDecl__Group_0__1();

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
    // $ANTLR end "rule__SubGroupDecl__Group_0__0"


    // $ANTLR start "rule__SubGroupDecl__Group_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2888:1: rule__SubGroupDecl__Group_0__0__Impl : ( ( rule__SubGroupDecl__CategoryNameAssignment_0_0 ) ) ;
    public final void rule__SubGroupDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2892:1: ( ( ( rule__SubGroupDecl__CategoryNameAssignment_0_0 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2893:1: ( ( rule__SubGroupDecl__CategoryNameAssignment_0_0 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2893:1: ( ( rule__SubGroupDecl__CategoryNameAssignment_0_0 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2894:1: ( rule__SubGroupDecl__CategoryNameAssignment_0_0 )
            {
             before(grammarAccess.getSubGroupDeclAccess().getCategoryNameAssignment_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2895:1: ( rule__SubGroupDecl__CategoryNameAssignment_0_0 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2895:2: rule__SubGroupDecl__CategoryNameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SubGroupDecl__CategoryNameAssignment_0_0_in_rule__SubGroupDecl__Group_0__0__Impl5771);
            rule__SubGroupDecl__CategoryNameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSubGroupDeclAccess().getCategoryNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupDecl__Group_0__0__Impl"


    // $ANTLR start "rule__SubGroupDecl__Group_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2905:1: rule__SubGroupDecl__Group_0__1 : rule__SubGroupDecl__Group_0__1__Impl ;
    public final void rule__SubGroupDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2909:1: ( rule__SubGroupDecl__Group_0__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2910:2: rule__SubGroupDecl__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SubGroupDecl__Group_0__1__Impl_in_rule__SubGroupDecl__Group_0__15801);
            rule__SubGroupDecl__Group_0__1__Impl();

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
    // $ANTLR end "rule__SubGroupDecl__Group_0__1"


    // $ANTLR start "rule__SubGroupDecl__Group_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2916:1: rule__SubGroupDecl__Group_0__1__Impl : ( ':' ) ;
    public final void rule__SubGroupDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2920:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2921:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2921:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2922:1: ':'
            {
             before(grammarAccess.getSubGroupDeclAccess().getColonKeyword_0_1()); 
            match(input,19,FOLLOW_19_in_rule__SubGroupDecl__Group_0__1__Impl5829); 
             after(grammarAccess.getSubGroupDeclAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupDecl__Group_0__1__Impl"


    // $ANTLR start "rule__SubGroupType__Group_0__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2939:1: rule__SubGroupType__Group_0__0 : rule__SubGroupType__Group_0__0__Impl rule__SubGroupType__Group_0__1 ;
    public final void rule__SubGroupType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2943:1: ( rule__SubGroupType__Group_0__0__Impl rule__SubGroupType__Group_0__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2944:2: rule__SubGroupType__Group_0__0__Impl rule__SubGroupType__Group_0__1
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_0__0__Impl_in_rule__SubGroupType__Group_0__05864);
            rule__SubGroupType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupType__Group_0__1_in_rule__SubGroupType__Group_0__05867);
            rule__SubGroupType__Group_0__1();

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
    // $ANTLR end "rule__SubGroupType__Group_0__0"


    // $ANTLR start "rule__SubGroupType__Group_0__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2951:1: rule__SubGroupType__Group_0__0__Impl : ( ':' ) ;
    public final void rule__SubGroupType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2955:1: ( ( ':' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2956:1: ( ':' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2956:1: ( ':' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2957:1: ':'
            {
             before(grammarAccess.getSubGroupTypeAccess().getColonKeyword_0_0()); 
            match(input,19,FOLLOW_19_in_rule__SubGroupType__Group_0__0__Impl5895); 
             after(grammarAccess.getSubGroupTypeAccess().getColonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_0__0__Impl"


    // $ANTLR start "rule__SubGroupType__Group_0__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2970:1: rule__SubGroupType__Group_0__1 : rule__SubGroupType__Group_0__1__Impl rule__SubGroupType__Group_0__2 ;
    public final void rule__SubGroupType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2974:1: ( rule__SubGroupType__Group_0__1__Impl rule__SubGroupType__Group_0__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2975:2: rule__SubGroupType__Group_0__1__Impl rule__SubGroupType__Group_0__2
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_0__1__Impl_in_rule__SubGroupType__Group_0__15926);
            rule__SubGroupType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupType__Group_0__2_in_rule__SubGroupType__Group_0__15929);
            rule__SubGroupType__Group_0__2();

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
    // $ANTLR end "rule__SubGroupType__Group_0__1"


    // $ANTLR start "rule__SubGroupType__Group_0__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2982:1: rule__SubGroupType__Group_0__1__Impl : ( () ) ;
    public final void rule__SubGroupType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2986:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2987:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2987:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2988:1: ()
            {
             before(grammarAccess.getSubGroupTypeAccess().getSubGroupTypeRefAction_0_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2989:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:2991:1: 
            {
            }

             after(grammarAccess.getSubGroupTypeAccess().getSubGroupTypeRefAction_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_0__1__Impl"


    // $ANTLR start "rule__SubGroupType__Group_0__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3001:1: rule__SubGroupType__Group_0__2 : rule__SubGroupType__Group_0__2__Impl ;
    public final void rule__SubGroupType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3005:1: ( rule__SubGroupType__Group_0__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3006:2: rule__SubGroupType__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_0__2__Impl_in_rule__SubGroupType__Group_0__25987);
            rule__SubGroupType__Group_0__2__Impl();

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
    // $ANTLR end "rule__SubGroupType__Group_0__2"


    // $ANTLR start "rule__SubGroupType__Group_0__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3012:1: rule__SubGroupType__Group_0__2__Impl : ( ( rule__SubGroupType__TypeAssignment_0_2 ) ) ;
    public final void rule__SubGroupType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3016:1: ( ( ( rule__SubGroupType__TypeAssignment_0_2 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3017:1: ( ( rule__SubGroupType__TypeAssignment_0_2 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3017:1: ( ( rule__SubGroupType__TypeAssignment_0_2 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3018:1: ( rule__SubGroupType__TypeAssignment_0_2 )
            {
             before(grammarAccess.getSubGroupTypeAccess().getTypeAssignment_0_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3019:1: ( rule__SubGroupType__TypeAssignment_0_2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3019:2: rule__SubGroupType__TypeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__SubGroupType__TypeAssignment_0_2_in_rule__SubGroupType__Group_0__2__Impl6014);
            rule__SubGroupType__TypeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSubGroupTypeAccess().getTypeAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_0__2__Impl"


    // $ANTLR start "rule__SubGroupType__Group_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3035:1: rule__SubGroupType__Group_1__0 : rule__SubGroupType__Group_1__0__Impl rule__SubGroupType__Group_1__1 ;
    public final void rule__SubGroupType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3039:1: ( rule__SubGroupType__Group_1__0__Impl rule__SubGroupType__Group_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3040:2: rule__SubGroupType__Group_1__0__Impl rule__SubGroupType__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_1__0__Impl_in_rule__SubGroupType__Group_1__06050);
            rule__SubGroupType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupType__Group_1__1_in_rule__SubGroupType__Group_1__06053);
            rule__SubGroupType__Group_1__1();

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
    // $ANTLR end "rule__SubGroupType__Group_1__0"


    // $ANTLR start "rule__SubGroupType__Group_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3047:1: rule__SubGroupType__Group_1__0__Impl : ( () ) ;
    public final void rule__SubGroupType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3051:1: ( ( () ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3052:1: ( () )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3052:1: ( () )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3053:1: ()
            {
             before(grammarAccess.getSubGroupTypeAccess().getSubGroupTypeAnonAction_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3054:1: ()
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3056:1: 
            {
            }

             after(grammarAccess.getSubGroupTypeAccess().getSubGroupTypeAnonAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_1__0__Impl"


    // $ANTLR start "rule__SubGroupType__Group_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3066:1: rule__SubGroupType__Group_1__1 : rule__SubGroupType__Group_1__1__Impl rule__SubGroupType__Group_1__2 ;
    public final void rule__SubGroupType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3070:1: ( rule__SubGroupType__Group_1__1__Impl rule__SubGroupType__Group_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3071:2: rule__SubGroupType__Group_1__1__Impl rule__SubGroupType__Group_1__2
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_1__1__Impl_in_rule__SubGroupType__Group_1__16111);
            rule__SubGroupType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupType__Group_1__2_in_rule__SubGroupType__Group_1__16114);
            rule__SubGroupType__Group_1__2();

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
    // $ANTLR end "rule__SubGroupType__Group_1__1"


    // $ANTLR start "rule__SubGroupType__Group_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3078:1: rule__SubGroupType__Group_1__1__Impl : ( ( rule__SubGroupType__Group_1_1__0 )? ) ;
    public final void rule__SubGroupType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3082:1: ( ( ( rule__SubGroupType__Group_1_1__0 )? ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3083:1: ( ( rule__SubGroupType__Group_1_1__0 )? )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3083:1: ( ( rule__SubGroupType__Group_1_1__0 )? )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3084:1: ( rule__SubGroupType__Group_1_1__0 )?
            {
             before(grammarAccess.getSubGroupTypeAccess().getGroup_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3085:1: ( rule__SubGroupType__Group_1_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3085:2: rule__SubGroupType__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__SubGroupType__Group_1_1__0_in_rule__SubGroupType__Group_1__1__Impl6141);
                    rule__SubGroupType__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubGroupTypeAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_1__1__Impl"


    // $ANTLR start "rule__SubGroupType__Group_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3095:1: rule__SubGroupType__Group_1__2 : rule__SubGroupType__Group_1__2__Impl rule__SubGroupType__Group_1__3 ;
    public final void rule__SubGroupType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3099:1: ( rule__SubGroupType__Group_1__2__Impl rule__SubGroupType__Group_1__3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3100:2: rule__SubGroupType__Group_1__2__Impl rule__SubGroupType__Group_1__3
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_1__2__Impl_in_rule__SubGroupType__Group_1__26172);
            rule__SubGroupType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupType__Group_1__3_in_rule__SubGroupType__Group_1__26175);
            rule__SubGroupType__Group_1__3();

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
    // $ANTLR end "rule__SubGroupType__Group_1__2"


    // $ANTLR start "rule__SubGroupType__Group_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3107:1: rule__SubGroupType__Group_1__2__Impl : ( '=' ) ;
    public final void rule__SubGroupType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3111:1: ( ( '=' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3112:1: ( '=' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3112:1: ( '=' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3113:1: '='
            {
             before(grammarAccess.getSubGroupTypeAccess().getEqualsSignKeyword_1_2()); 
            match(input,20,FOLLOW_20_in_rule__SubGroupType__Group_1__2__Impl6203); 
             after(grammarAccess.getSubGroupTypeAccess().getEqualsSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_1__2__Impl"


    // $ANTLR start "rule__SubGroupType__Group_1__3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3126:1: rule__SubGroupType__Group_1__3 : rule__SubGroupType__Group_1__3__Impl ;
    public final void rule__SubGroupType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3130:1: ( rule__SubGroupType__Group_1__3__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3131:2: rule__SubGroupType__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_1__3__Impl_in_rule__SubGroupType__Group_1__36234);
            rule__SubGroupType__Group_1__3__Impl();

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
    // $ANTLR end "rule__SubGroupType__Group_1__3"


    // $ANTLR start "rule__SubGroupType__Group_1__3__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3137:1: rule__SubGroupType__Group_1__3__Impl : ( ( rule__SubGroupType__BodyAssignment_1_3 ) ) ;
    public final void rule__SubGroupType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3141:1: ( ( ( rule__SubGroupType__BodyAssignment_1_3 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3142:1: ( ( rule__SubGroupType__BodyAssignment_1_3 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3142:1: ( ( rule__SubGroupType__BodyAssignment_1_3 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3143:1: ( rule__SubGroupType__BodyAssignment_1_3 )
            {
             before(grammarAccess.getSubGroupTypeAccess().getBodyAssignment_1_3()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3144:1: ( rule__SubGroupType__BodyAssignment_1_3 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3144:2: rule__SubGroupType__BodyAssignment_1_3
            {
            pushFollow(FOLLOW_rule__SubGroupType__BodyAssignment_1_3_in_rule__SubGroupType__Group_1__3__Impl6261);
            rule__SubGroupType__BodyAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSubGroupTypeAccess().getBodyAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_1__3__Impl"


    // $ANTLR start "rule__SubGroupType__Group_1_1__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3162:1: rule__SubGroupType__Group_1_1__0 : rule__SubGroupType__Group_1_1__0__Impl rule__SubGroupType__Group_1_1__1 ;
    public final void rule__SubGroupType__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3166:1: ( rule__SubGroupType__Group_1_1__0__Impl rule__SubGroupType__Group_1_1__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3167:2: rule__SubGroupType__Group_1_1__0__Impl rule__SubGroupType__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_1_1__0__Impl_in_rule__SubGroupType__Group_1_1__06299);
            rule__SubGroupType__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupType__Group_1_1__1_in_rule__SubGroupType__Group_1_1__06302);
            rule__SubGroupType__Group_1_1__1();

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
    // $ANTLR end "rule__SubGroupType__Group_1_1__0"


    // $ANTLR start "rule__SubGroupType__Group_1_1__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3174:1: rule__SubGroupType__Group_1_1__0__Impl : ( '<:' ) ;
    public final void rule__SubGroupType__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3178:1: ( ( '<:' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3179:1: ( '<:' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3179:1: ( '<:' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3180:1: '<:'
            {
             before(grammarAccess.getSubGroupTypeAccess().getLessThanSignColonKeyword_1_1_0()); 
            match(input,15,FOLLOW_15_in_rule__SubGroupType__Group_1_1__0__Impl6330); 
             after(grammarAccess.getSubGroupTypeAccess().getLessThanSignColonKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_1_1__0__Impl"


    // $ANTLR start "rule__SubGroupType__Group_1_1__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3193:1: rule__SubGroupType__Group_1_1__1 : rule__SubGroupType__Group_1_1__1__Impl rule__SubGroupType__Group_1_1__2 ;
    public final void rule__SubGroupType__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3197:1: ( rule__SubGroupType__Group_1_1__1__Impl rule__SubGroupType__Group_1_1__2 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3198:2: rule__SubGroupType__Group_1_1__1__Impl rule__SubGroupType__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_1_1__1__Impl_in_rule__SubGroupType__Group_1_1__16361);
            rule__SubGroupType__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupType__Group_1_1__2_in_rule__SubGroupType__Group_1_1__16364);
            rule__SubGroupType__Group_1_1__2();

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
    // $ANTLR end "rule__SubGroupType__Group_1_1__1"


    // $ANTLR start "rule__SubGroupType__Group_1_1__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3205:1: rule__SubGroupType__Group_1_1__1__Impl : ( ( rule__SubGroupType__SupersAssignment_1_1_1 ) ) ;
    public final void rule__SubGroupType__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3209:1: ( ( ( rule__SubGroupType__SupersAssignment_1_1_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3210:1: ( ( rule__SubGroupType__SupersAssignment_1_1_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3210:1: ( ( rule__SubGroupType__SupersAssignment_1_1_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3211:1: ( rule__SubGroupType__SupersAssignment_1_1_1 )
            {
             before(grammarAccess.getSubGroupTypeAccess().getSupersAssignment_1_1_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3212:1: ( rule__SubGroupType__SupersAssignment_1_1_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3212:2: rule__SubGroupType__SupersAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__SubGroupType__SupersAssignment_1_1_1_in_rule__SubGroupType__Group_1_1__1__Impl6391);
            rule__SubGroupType__SupersAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubGroupTypeAccess().getSupersAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_1_1__1__Impl"


    // $ANTLR start "rule__SubGroupType__Group_1_1__2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3222:1: rule__SubGroupType__Group_1_1__2 : rule__SubGroupType__Group_1_1__2__Impl ;
    public final void rule__SubGroupType__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3226:1: ( rule__SubGroupType__Group_1_1__2__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3227:2: rule__SubGroupType__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_1_1__2__Impl_in_rule__SubGroupType__Group_1_1__26421);
            rule__SubGroupType__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__SubGroupType__Group_1_1__2"


    // $ANTLR start "rule__SubGroupType__Group_1_1__2__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3233:1: rule__SubGroupType__Group_1_1__2__Impl : ( ( rule__SubGroupType__Group_1_1_2__0 )* ) ;
    public final void rule__SubGroupType__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3237:1: ( ( ( rule__SubGroupType__Group_1_1_2__0 )* ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3238:1: ( ( rule__SubGroupType__Group_1_1_2__0 )* )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3238:1: ( ( rule__SubGroupType__Group_1_1_2__0 )* )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3239:1: ( rule__SubGroupType__Group_1_1_2__0 )*
            {
             before(grammarAccess.getSubGroupTypeAccess().getGroup_1_1_2()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3240:1: ( rule__SubGroupType__Group_1_1_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3240:2: rule__SubGroupType__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__SubGroupType__Group_1_1_2__0_in_rule__SubGroupType__Group_1_1__2__Impl6448);
            	    rule__SubGroupType__Group_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSubGroupTypeAccess().getGroup_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_1_1__2__Impl"


    // $ANTLR start "rule__SubGroupType__Group_1_1_2__0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3256:1: rule__SubGroupType__Group_1_1_2__0 : rule__SubGroupType__Group_1_1_2__0__Impl rule__SubGroupType__Group_1_1_2__1 ;
    public final void rule__SubGroupType__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3260:1: ( rule__SubGroupType__Group_1_1_2__0__Impl rule__SubGroupType__Group_1_1_2__1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3261:2: rule__SubGroupType__Group_1_1_2__0__Impl rule__SubGroupType__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_1_1_2__0__Impl_in_rule__SubGroupType__Group_1_1_2__06485);
            rule__SubGroupType__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubGroupType__Group_1_1_2__1_in_rule__SubGroupType__Group_1_1_2__06488);
            rule__SubGroupType__Group_1_1_2__1();

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
    // $ANTLR end "rule__SubGroupType__Group_1_1_2__0"


    // $ANTLR start "rule__SubGroupType__Group_1_1_2__0__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3268:1: rule__SubGroupType__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__SubGroupType__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3272:1: ( ( ',' ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3273:1: ( ',' )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3273:1: ( ',' )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3274:1: ','
            {
             before(grammarAccess.getSubGroupTypeAccess().getCommaKeyword_1_1_2_0()); 
            match(input,16,FOLLOW_16_in_rule__SubGroupType__Group_1_1_2__0__Impl6516); 
             after(grammarAccess.getSubGroupTypeAccess().getCommaKeyword_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__SubGroupType__Group_1_1_2__1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3287:1: rule__SubGroupType__Group_1_1_2__1 : rule__SubGroupType__Group_1_1_2__1__Impl ;
    public final void rule__SubGroupType__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3291:1: ( rule__SubGroupType__Group_1_1_2__1__Impl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3292:2: rule__SubGroupType__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SubGroupType__Group_1_1_2__1__Impl_in_rule__SubGroupType__Group_1_1_2__16547);
            rule__SubGroupType__Group_1_1_2__1__Impl();

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
    // $ANTLR end "rule__SubGroupType__Group_1_1_2__1"


    // $ANTLR start "rule__SubGroupType__Group_1_1_2__1__Impl"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3298:1: rule__SubGroupType__Group_1_1_2__1__Impl : ( ( rule__SubGroupType__SupersAssignment_1_1_2_1 ) ) ;
    public final void rule__SubGroupType__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3302:1: ( ( ( rule__SubGroupType__SupersAssignment_1_1_2_1 ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3303:1: ( ( rule__SubGroupType__SupersAssignment_1_1_2_1 ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3303:1: ( ( rule__SubGroupType__SupersAssignment_1_1_2_1 ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3304:1: ( rule__SubGroupType__SupersAssignment_1_1_2_1 )
            {
             before(grammarAccess.getSubGroupTypeAccess().getSupersAssignment_1_1_2_1()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3305:1: ( rule__SubGroupType__SupersAssignment_1_1_2_1 )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3305:2: rule__SubGroupType__SupersAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__SubGroupType__SupersAssignment_1_1_2_1_in_rule__SubGroupType__Group_1_1_2__1__Impl6574);
            rule__SubGroupType__SupersAssignment_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSubGroupTypeAccess().getSupersAssignment_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__Model__DeclsAssignment"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3320:1: rule__Model__DeclsAssignment : ( ruleDecl ) ;
    public final void rule__Model__DeclsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3324:1: ( ( ruleDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3325:1: ( ruleDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3325:1: ( ruleDecl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3326:1: ruleDecl
            {
             before(grammarAccess.getModelAccess().getDeclsDeclParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDecl_in_rule__Model__DeclsAssignment6613);
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


    // $ANTLR start "rule__Decl__NameAssignment_0_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3335:1: rule__Decl__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Decl__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3339:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3340:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3340:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3341:1: RULE_ID
            {
             before(grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decl__NameAssignment_0_26644); 
             after(grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__NameAssignment_0_2"


    // $ANTLR start "rule__Decl__NameAssignment_1_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3350:1: rule__Decl__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Decl__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3354:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3355:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3355:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3356:1: RULE_ID
            {
             before(grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decl__NameAssignment_1_26675); 
             after(grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__NameAssignment_1_2"


    // $ANTLR start "rule__Decl__SupersAssignment_1_3_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3365:1: rule__Decl__SupersAssignment_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Decl__SupersAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3369:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3370:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3370:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3371:1: ( RULE_ID )
            {
             before(grammarAccess.getDeclAccess().getSupersFeatureGroupDeclCrossReference_1_3_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3372:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3373:1: RULE_ID
            {
             before(grammarAccess.getDeclAccess().getSupersFeatureGroupDeclIDTerminalRuleCall_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decl__SupersAssignment_1_3_16710); 
             after(grammarAccess.getDeclAccess().getSupersFeatureGroupDeclIDTerminalRuleCall_1_3_1_0_1()); 

            }

             after(grammarAccess.getDeclAccess().getSupersFeatureGroupDeclCrossReference_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__SupersAssignment_1_3_1"


    // $ANTLR start "rule__Decl__SupersAssignment_1_3_2_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3384:1: rule__Decl__SupersAssignment_1_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Decl__SupersAssignment_1_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3388:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3389:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3389:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3390:1: ( RULE_ID )
            {
             before(grammarAccess.getDeclAccess().getSupersFeatureGroupDeclCrossReference_1_3_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3391:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3392:1: RULE_ID
            {
             before(grammarAccess.getDeclAccess().getSupersFeatureGroupDeclIDTerminalRuleCall_1_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decl__SupersAssignment_1_3_2_16749); 
             after(grammarAccess.getDeclAccess().getSupersFeatureGroupDeclIDTerminalRuleCall_1_3_2_1_0_1()); 

            }

             after(grammarAccess.getDeclAccess().getSupersFeatureGroupDeclCrossReference_1_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__SupersAssignment_1_3_2_1"


    // $ANTLR start "rule__Decl__BodyAssignment_1_4"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3403:1: rule__Decl__BodyAssignment_1_4 : ( ruleFeatureGroupBody ) ;
    public final void rule__Decl__BodyAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3407:1: ( ( ruleFeatureGroupBody ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3408:1: ( ruleFeatureGroupBody )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3408:1: ( ruleFeatureGroupBody )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3409:1: ruleFeatureGroupBody
            {
             before(grammarAccess.getDeclAccess().getBodyFeatureGroupBodyParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleFeatureGroupBody_in_rule__Decl__BodyAssignment_1_46784);
            ruleFeatureGroupBody();

            state._fsp--;

             after(grammarAccess.getDeclAccess().getBodyFeatureGroupBodyParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__BodyAssignment_1_4"


    // $ANTLR start "rule__FeatureGroupBody__GroupElementsAssignment_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3418:1: rule__FeatureGroupBody__GroupElementsAssignment_2 : ( ruleGroupElementDecl ) ;
    public final void rule__FeatureGroupBody__GroupElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3422:1: ( ( ruleGroupElementDecl ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3423:1: ( ruleGroupElementDecl )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3423:1: ( ruleGroupElementDecl )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3424:1: ruleGroupElementDecl
            {
             before(grammarAccess.getFeatureGroupBodyAccess().getGroupElementsGroupElementDeclParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGroupElementDecl_in_rule__FeatureGroupBody__GroupElementsAssignment_26815);
            ruleGroupElementDecl();

            state._fsp--;

             after(grammarAccess.getFeatureGroupBodyAccess().getGroupElementsGroupElementDeclParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGroupBody__GroupElementsAssignment_2"


    // $ANTLR start "rule__GroupAttrDecl__ModifierAssignment_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3433:1: rule__GroupAttrDecl__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__GroupAttrDecl__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3437:1: ( ( ruleModifier ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3438:1: ( ruleModifier )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3438:1: ( ruleModifier )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3439:1: ruleModifier
            {
             before(grammarAccess.getGroupAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__GroupAttrDecl__ModifierAssignment_06846);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getGroupAttrDeclAccess().getModifierModifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__ModifierAssignment_0"


    // $ANTLR start "rule__GroupAttrDecl__AttributeNameAssignment_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3448:1: rule__GroupAttrDecl__AttributeNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GroupAttrDecl__AttributeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3452:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3453:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3453:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3454:1: RULE_ID
            {
             before(grammarAccess.getGroupAttrDeclAccess().getAttributeNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GroupAttrDecl__AttributeNameAssignment_16877); 
             after(grammarAccess.getGroupAttrDeclAccess().getAttributeNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__AttributeNameAssignment_1"


    // $ANTLR start "rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3463:1: rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1 : ( ruleType ) ;
    public final void rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3467:1: ( ( ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3468:1: ( ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3468:1: ( ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3469:1: ruleType
            {
             before(grammarAccess.getGroupAttrDeclAccess().getAttributeTypeTypeParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__GroupAttrDecl__AttributeTypeAssignment_2_0_16908);
            ruleType();

            state._fsp--;

             after(grammarAccess.getGroupAttrDeclAccess().getAttributeTypeTypeParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1"


    // $ANTLR start "rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3478:1: rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1 : ( ruleLiteral ) ;
    public final void rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3482:1: ( ( ruleLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3483:1: ( ruleLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3483:1: ( ruleLiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3484:1: ruleLiteral
            {
             before(grammarAccess.getGroupAttrDeclAccess().getAttributeLiteralLiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_16939);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getGroupAttrDeclAccess().getAttributeLiteralLiteralParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1"


    // $ANTLR start "rule__Type__BaseTypeAssignment_0_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3493:1: rule__Type__BaseTypeAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__BaseTypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3497:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3498:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3498:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3499:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getBaseTypeTypeDeclCrossReference_0_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3500:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3501:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__BaseTypeAssignment_0_16974); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3512:1: rule__Type__ElemTypesAssignment_1_2 : ( ruleType ) ;
    public final void rule__Type__ElemTypesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3516:1: ( ( ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3517:1: ( ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3517:1: ( ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3518:1: ruleType
            {
             before(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_1_27009);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3527:1: rule__Type__ElemTypesAssignment_1_3_1 : ( ruleType ) ;
    public final void rule__Type__ElemTypesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3531:1: ( ( ruleType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3532:1: ( ruleType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3532:1: ( ruleType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3533:1: ruleType
            {
             before(grammarAccess.getTypeAccess().getElemTypesTypeParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_1_3_17040);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3542:1: rule__BasicLiteral__TypeConsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BasicLiteral__TypeConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3546:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3547:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3547:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3548:1: ( RULE_ID )
            {
             before(grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3549:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3550:1: RULE_ID
            {
             before(grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BasicLiteral__TypeConsAssignment_07075); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3561:1: rule__BasicLiteral__LitAssignment_1 : ( RULE_LIT ) ;
    public final void rule__BasicLiteral__LitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3565:1: ( ( RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3566:1: ( RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3566:1: ( RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3567:1: RULE_LIT
            {
             before(grammarAccess.getBasicLiteralAccess().getLitLITTerminalRuleCall_1_0()); 
            match(input,RULE_LIT,FOLLOW_RULE_LIT_in_rule__BasicLiteral__LitAssignment_17110); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3576:1: rule__TupleLiteral__ElemsAssignment_2_0 : ( ruleLiteral ) ;
    public final void rule__TupleLiteral__ElemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3580:1: ( ( ruleLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3581:1: ( ruleLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3581:1: ( ruleLiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3582:1: ruleLiteral
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_07141);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3591:1: rule__TupleLiteral__ElemsAssignment_2_1_1 : ( ruleLiteral ) ;
    public final void rule__TupleLiteral__ElemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3595:1: ( ( ruleLiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3596:1: ( ruleLiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3596:1: ( ruleLiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3597:1: ruleLiteral
            {
             before(grammarAccess.getTupleLiteralAccess().getElemsLiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_1_17172);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3606:1: rule__ListLiteral__TypeConsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ListLiteral__TypeConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3610:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3611:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3611:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3612:1: ( RULE_ID )
            {
             before(grammarAccess.getListLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3613:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3614:1: RULE_ID
            {
             before(grammarAccess.getListLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListLiteral__TypeConsAssignment_07207); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3625:1: rule__ListLiteral__ElemsAssignment_2_0 : ( ruleELiteral ) ;
    public final void rule__ListLiteral__ElemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3629:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3630:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3630:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3631:1: ruleELiteral
            {
             before(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_07242);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3640:1: rule__ListLiteral__ElemsAssignment_2_1_1 : ( ruleELiteral ) ;
    public final void rule__ListLiteral__ElemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3644:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3645:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3645:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3646:1: ruleELiteral
            {
             before(grammarAccess.getListLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_1_17273);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3655:1: rule__SetLiteral__TypeConsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SetLiteral__TypeConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3659:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3660:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3660:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3661:1: ( RULE_ID )
            {
             before(grammarAccess.getSetLiteralAccess().getTypeConsTypeDeclCrossReference_0_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3662:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3663:1: RULE_ID
            {
             before(grammarAccess.getSetLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SetLiteral__TypeConsAssignment_07308); 
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3674:1: rule__SetLiteral__ElemsAssignment_2_0 : ( ruleELiteral ) ;
    public final void rule__SetLiteral__ElemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3678:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3679:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3679:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3680:1: ruleELiteral
            {
             before(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_07343);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3689:1: rule__SetLiteral__ElemsAssignment_2_1_1 : ( ruleELiteral ) ;
    public final void rule__SetLiteral__ElemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3693:1: ( ( ruleELiteral ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3694:1: ( ruleELiteral )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3694:1: ( ruleELiteral )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3695:1: ruleELiteral
            {
             before(grammarAccess.getSetLiteralAccess().getElemsELiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_1_17374);
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
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3704:1: rule__ELiteral__LitAssignment : ( RULE_LIT ) ;
    public final void rule__ELiteral__LitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3708:1: ( ( RULE_LIT ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3709:1: ( RULE_LIT )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3709:1: ( RULE_LIT )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3710:1: RULE_LIT
            {
             before(grammarAccess.getELiteralAccess().getLitLITTerminalRuleCall_0()); 
            match(input,RULE_LIT,FOLLOW_RULE_LIT_in_rule__ELiteral__LitAssignment7405); 
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


    // $ANTLR start "rule__SubGroupDecl__CategoryNameAssignment_0_0"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3719:1: rule__SubGroupDecl__CategoryNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__SubGroupDecl__CategoryNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3723:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3724:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3724:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3725:1: RULE_ID
            {
             before(grammarAccess.getSubGroupDeclAccess().getCategoryNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubGroupDecl__CategoryNameAssignment_0_07436); 
             after(grammarAccess.getSubGroupDeclAccess().getCategoryNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupDecl__CategoryNameAssignment_0_0"


    // $ANTLR start "rule__SubGroupDecl__NameAssignment_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3734:1: rule__SubGroupDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubGroupDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3738:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3739:1: ( RULE_ID )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3739:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3740:1: RULE_ID
            {
             before(grammarAccess.getSubGroupDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubGroupDecl__NameAssignment_17467); 
             after(grammarAccess.getSubGroupDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupDecl__NameAssignment_1"


    // $ANTLR start "rule__SubGroupDecl__TypeAssignment_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3749:1: rule__SubGroupDecl__TypeAssignment_2 : ( ruleSubGroupType ) ;
    public final void rule__SubGroupDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3753:1: ( ( ruleSubGroupType ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3754:1: ( ruleSubGroupType )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3754:1: ( ruleSubGroupType )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3755:1: ruleSubGroupType
            {
             before(grammarAccess.getSubGroupDeclAccess().getTypeSubGroupTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSubGroupType_in_rule__SubGroupDecl__TypeAssignment_27498);
            ruleSubGroupType();

            state._fsp--;

             after(grammarAccess.getSubGroupDeclAccess().getTypeSubGroupTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupDecl__TypeAssignment_2"


    // $ANTLR start "rule__SubGroupType__TypeAssignment_0_2"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3764:1: rule__SubGroupType__TypeAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__SubGroupType__TypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3768:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3769:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3769:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3770:1: ( RULE_ID )
            {
             before(grammarAccess.getSubGroupTypeAccess().getTypeFeatureGroupDeclCrossReference_0_2_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3771:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3772:1: RULE_ID
            {
             before(grammarAccess.getSubGroupTypeAccess().getTypeFeatureGroupDeclIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubGroupType__TypeAssignment_0_27533); 
             after(grammarAccess.getSubGroupTypeAccess().getTypeFeatureGroupDeclIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getSubGroupTypeAccess().getTypeFeatureGroupDeclCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__TypeAssignment_0_2"


    // $ANTLR start "rule__SubGroupType__SupersAssignment_1_1_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3783:1: rule__SubGroupType__SupersAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__SubGroupType__SupersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3787:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3788:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3788:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3789:1: ( RULE_ID )
            {
             before(grammarAccess.getSubGroupTypeAccess().getSupersFeatureGroupDeclCrossReference_1_1_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3790:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3791:1: RULE_ID
            {
             before(grammarAccess.getSubGroupTypeAccess().getSupersFeatureGroupDeclIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubGroupType__SupersAssignment_1_1_17572); 
             after(grammarAccess.getSubGroupTypeAccess().getSupersFeatureGroupDeclIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getSubGroupTypeAccess().getSupersFeatureGroupDeclCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__SupersAssignment_1_1_1"


    // $ANTLR start "rule__SubGroupType__SupersAssignment_1_1_2_1"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3802:1: rule__SubGroupType__SupersAssignment_1_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SubGroupType__SupersAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3806:1: ( ( ( RULE_ID ) ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3807:1: ( ( RULE_ID ) )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3807:1: ( ( RULE_ID ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3808:1: ( RULE_ID )
            {
             before(grammarAccess.getSubGroupTypeAccess().getSupersFeatureGroupDeclCrossReference_1_1_2_1_0()); 
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3809:1: ( RULE_ID )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3810:1: RULE_ID
            {
             before(grammarAccess.getSubGroupTypeAccess().getSupersFeatureGroupDeclIDTerminalRuleCall_1_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubGroupType__SupersAssignment_1_1_2_17611); 
             after(grammarAccess.getSubGroupTypeAccess().getSupersFeatureGroupDeclIDTerminalRuleCall_1_1_2_1_0_1()); 

            }

             after(grammarAccess.getSubGroupTypeAccess().getSupersFeatureGroupDeclCrossReference_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__SupersAssignment_1_1_2_1"


    // $ANTLR start "rule__SubGroupType__BodyAssignment_1_3"
    // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3821:1: rule__SubGroupType__BodyAssignment_1_3 : ( ruleFeatureGroupBody ) ;
    public final void rule__SubGroupType__BodyAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3825:1: ( ( ruleFeatureGroupBody ) )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3826:1: ( ruleFeatureGroupBody )
            {
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3826:1: ( ruleFeatureGroupBody )
            // ../edu.ksu.cis.projects.mdcf.devicemodel.ui/src-gen/edu/ksu/cis/projects/mdcf/devicemodel/ui/contentassist/antlr/internal/InternalDeviceModelingLanguage.g:3827:1: ruleFeatureGroupBody
            {
             before(grammarAccess.getSubGroupTypeAccess().getBodyFeatureGroupBodyParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleFeatureGroupBody_in_rule__SubGroupType__BodyAssignment_1_37646);
            ruleFeatureGroupBody();

            state._fsp--;

             after(grammarAccess.getSubGroupTypeAccess().getBodyFeatureGroupBodyParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubGroupType__BodyAssignment_1_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Alternatives_in_ruleDecl155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureGroupBody_in_entryRuleFeatureGroupBody182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureGroupBody189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureGroupBody__Group__0_in_ruleFeatureGroupBody215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElementDecl_in_entryRuleGroupElementDecl242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElementDecl249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElementDecl__Alternatives_in_ruleGroupElementDecl275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupAttrDecl_in_entryRuleGroupAttrDecl302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupAttrDecl309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group__0_in_ruleGroupAttrDecl335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_entryRuleBasicLiteral542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicLiteral549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__0_in_ruleBasicLiteral575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteral609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__0_in_ruleTupleLiteral635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__0_in_ruleSetLiteral755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_entryRuleELiteral782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleELiteral789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ELiteral__LitAssignment_in_ruleELiteral815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubGroupDecl_in_entryRuleSubGroupDecl842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubGroupDecl849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__Group__0_in_ruleSubGroupDecl875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubGroupType_in_entryRuleSubGroupType902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubGroupType909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Alternatives_in_ruleSubGroupType935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_0__0_in_rule__Decl__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1__0_in_rule__Decl__Alternatives989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupAttrDecl_in_rule__GroupElementDecl__Alternatives1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubGroupDecl_in_rule__GroupElementDecl__Alternatives1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group_2_0__0_in_rule__GroupAttrDecl__Alternatives_21071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group_2_1__0_in_rule__GroupAttrDecl__Alternatives_21089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Modifier__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Modifier__Alternatives1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Modifier__Alternatives1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Modifier__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__0_in_rule__Type__Alternatives_0_21268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__0_in_rule__Type__Alternatives_0_21286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicLiteral_in_rule__Literal__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_rule__Literal__Alternatives1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rule__Literal__Alternatives1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_rule__Literal__Alternatives1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_0__0_in_rule__SubGroupType__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1__0_in_rule__SubGroupType__Alternatives1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_0__0__Impl_in_rule__Decl__Group_0__01451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decl__Group_0__1_in_rule__Decl__Group_0__01454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Decl__Group_0__0__Impl1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_0__1__Impl_in_rule__Decl__Group_0__11513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decl__Group_0__2_in_rule__Decl__Group_0__11516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_0__2__Impl_in_rule__Decl__Group_0__21574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__NameAssignment_0_2_in_rule__Decl__Group_0__2__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1__0__Impl_in_rule__Decl__Group_1__01637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decl__Group_1__1_in_rule__Decl__Group_1__01640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Decl__Group_1__0__Impl1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1__1__Impl_in_rule__Decl__Group_1__11699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decl__Group_1__2_in_rule__Decl__Group_1__11702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1__2__Impl_in_rule__Decl__Group_1__21760 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Decl__Group_1__3_in_rule__Decl__Group_1__21763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__NameAssignment_1_2_in_rule__Decl__Group_1__2__Impl1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1__3__Impl_in_rule__Decl__Group_1__31820 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Decl__Group_1__4_in_rule__Decl__Group_1__31823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1_3__0_in_rule__Decl__Group_1__3__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1__4__Impl_in_rule__Decl__Group_1__41881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__BodyAssignment_1_4_in_rule__Decl__Group_1__4__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1_3__0__Impl_in_rule__Decl__Group_1_3__01948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decl__Group_1_3__1_in_rule__Decl__Group_1_3__01951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Decl__Group_1_3__0__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1_3__1__Impl_in_rule__Decl__Group_1_3__12010 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Decl__Group_1_3__2_in_rule__Decl__Group_1_3__12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__SupersAssignment_1_3_1_in_rule__Decl__Group_1_3__1__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1_3__2__Impl_in_rule__Decl__Group_1_3__22070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1_3_2__0_in_rule__Decl__Group_1_3__2__Impl2097 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1_3_2__0__Impl_in_rule__Decl__Group_1_3_2__02134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decl__Group_1_3_2__1_in_rule__Decl__Group_1_3_2__02137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Decl__Group_1_3_2__0__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group_1_3_2__1__Impl_in_rule__Decl__Group_1_3_2__12196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__SupersAssignment_1_3_2_1_in_rule__Decl__Group_1_3_2__1__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureGroupBody__Group__0__Impl_in_rule__FeatureGroupBody__Group__02257 = new BitSet(new long[]{0x0000000000041E10L});
    public static final BitSet FOLLOW_rule__FeatureGroupBody__Group__1_in_rule__FeatureGroupBody__Group__02260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FeatureGroupBody__Group__0__Impl2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureGroupBody__Group__1__Impl_in_rule__FeatureGroupBody__Group__12319 = new BitSet(new long[]{0x0000000000041E10L});
    public static final BitSet FOLLOW_rule__FeatureGroupBody__Group__2_in_rule__FeatureGroupBody__Group__12322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureGroupBody__Group__2__Impl_in_rule__FeatureGroupBody__Group__22380 = new BitSet(new long[]{0x0000000000041E10L});
    public static final BitSet FOLLOW_rule__FeatureGroupBody__Group__3_in_rule__FeatureGroupBody__Group__22383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureGroupBody__GroupElementsAssignment_2_in_rule__FeatureGroupBody__Group__2__Impl2410 = new BitSet(new long[]{0x0000000000001E12L});
    public static final BitSet FOLLOW_rule__FeatureGroupBody__Group__3__Impl_in_rule__FeatureGroupBody__Group__32441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FeatureGroupBody__Group__3__Impl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group__0__Impl_in_rule__GroupAttrDecl__Group__02508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group__1_in_rule__GroupAttrDecl__Group__02511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__ModifierAssignment_0_in_rule__GroupAttrDecl__Group__0__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group__1__Impl_in_rule__GroupAttrDecl__Group__12568 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group__2_in_rule__GroupAttrDecl__Group__12571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__AttributeNameAssignment_1_in_rule__GroupAttrDecl__Group__1__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group__2__Impl_in_rule__GroupAttrDecl__Group__22628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Alternatives_2_in_rule__GroupAttrDecl__Group__2__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group_2_0__0__Impl_in_rule__GroupAttrDecl__Group_2_0__02691 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group_2_0__1_in_rule__GroupAttrDecl__Group_2_0__02694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GroupAttrDecl__Group_2_0__0__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group_2_0__1__Impl_in_rule__GroupAttrDecl__Group_2_0__12753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__AttributeTypeAssignment_2_0_1_in_rule__GroupAttrDecl__Group_2_0__1__Impl2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group_2_1__0__Impl_in_rule__GroupAttrDecl__Group_2_1__02814 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group_2_1__1_in_rule__GroupAttrDecl__Group_2_1__02817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GroupAttrDecl__Group_2_1__0__Impl2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__Group_2_1__1__Impl_in_rule__GroupAttrDecl__Group_2_1__12876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_1_in_rule__GroupAttrDecl__Group_2_1__1__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__02937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__02940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__12998 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Type__Group_0__2_in_rule__Type__Group_0__13001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__BaseTypeAssignment_0_1_in_rule__Type__Group_0__1__Impl3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__2__Impl_in_rule__Type__Group_0__23058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_0_2_in_rule__Type__Group_0__2__Impl3085 = new BitSet(new long[]{0x0000000000220002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__0__Impl_in_rule__Type__Group_0_2_0__03122 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__1_in_rule__Type__Group_0_2_0__03125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__1__Impl_in_rule__Type__Group_0_2_0__13183 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__2_in_rule__Type__Group_0_2_0__13186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type__Group_0_2_0__1__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_0__2__Impl_in_rule__Type__Group_0_2_0__23245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type__Group_0_2_0__2__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__0__Impl_in_rule__Type__Group_0_2_1__03310 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__1_in_rule__Type__Group_0_2_1__03313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__1__Impl_in_rule__Type__Group_0_2_1__13371 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__2_in_rule__Type__Group_0_2_1__13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Group_0_2_1__1__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0_2_1__2__Impl_in_rule__Type__Group_0_2_1__23433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Group_0_2_1__2__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03498 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Type__Group_1__0__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13560 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__13563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__23621 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__3_in_rule__Type__Group_1__23624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ElemTypesAssignment_1_2_in_rule__Type__Group_1__2__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__3__Impl_in_rule__Type__Group_1__33681 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__4_in_rule__Type__Group_1__33684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_3__0_in_rule__Type__Group_1__3__Impl3713 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_3__0_in_rule__Type__Group_1__3__Impl3725 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__4__Impl_in_rule__Type__Group_1__43758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__Group_1__4__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_3__0__Impl_in_rule__Type__Group_1_3__03827 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Type__Group_1_3__1_in_rule__Type__Group_1_3__03830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Type__Group_1_3__0__Impl3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_3__1__Impl_in_rule__Type__Group_1_3__13889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ElemTypesAssignment_1_3_1_in_rule__Type__Group_1_3__1__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__0__Impl_in_rule__BasicLiteral__Group__03950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__1_in_rule__BasicLiteral__Group__03953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__TypeConsAssignment_0_in_rule__BasicLiteral__Group__0__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__Group__1__Impl_in_rule__BasicLiteral__Group__14010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicLiteral__LitAssignment_1_in_rule__BasicLiteral__Group__1__Impl4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__0__Impl_in_rule__TupleLiteral__Group__04071 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__1_in_rule__TupleLiteral__Group__04074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TupleLiteral__Group__0__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__1__Impl_in_rule__TupleLiteral__Group__14133 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__2_in_rule__TupleLiteral__Group__14136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__2__Impl_in_rule__TupleLiteral__Group__24194 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__3_in_rule__TupleLiteral__Group__24197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__0_in_rule__TupleLiteral__Group__2__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group__3__Impl_in_rule__TupleLiteral__Group__34255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TupleLiteral__Group__3__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__0__Impl_in_rule__TupleLiteral__Group_2__04322 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__1_in_rule__TupleLiteral__Group_2__04325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__ElemsAssignment_2_0_in_rule__TupleLiteral__Group_2__0__Impl4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2__1__Impl_in_rule__TupleLiteral__Group_2__14382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__0_in_rule__TupleLiteral__Group_2__1__Impl4409 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__0__Impl_in_rule__TupleLiteral__Group_2_1__04444 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__1_in_rule__TupleLiteral__Group_2_1__04447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TupleLiteral__Group_2_1__0__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__Group_2_1__1__Impl_in_rule__TupleLiteral__Group_2_1__14506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleLiteral__ElemsAssignment_2_1_1_in_rule__TupleLiteral__Group_2_1__1__Impl4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__04567 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__04570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__TypeConsAssignment_0_in_rule__ListLiteral__Group__0__Impl4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__14627 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__14630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ListLiteral__Group__1__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__24689 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__3_in_rule__ListLiteral__Group__24692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__0_in_rule__ListLiteral__Group__2__Impl4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__3__Impl_in_rule__ListLiteral__Group__34750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ListLiteral__Group__3__Impl4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__0__Impl_in_rule__ListLiteral__Group_2__04817 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__1_in_rule__ListLiteral__Group_2__04820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ElemsAssignment_2_0_in_rule__ListLiteral__Group_2__0__Impl4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__1__Impl_in_rule__ListLiteral__Group_2__14877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__0_in_rule__ListLiteral__Group_2__1__Impl4904 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__0__Impl_in_rule__ListLiteral__Group_2_1__04939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__1_in_rule__ListLiteral__Group_2_1__04942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ListLiteral__Group_2_1__0__Impl4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__1__Impl_in_rule__ListLiteral__Group_2_1__15001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ElemsAssignment_2_1_1_in_rule__ListLiteral__Group_2_1__1__Impl5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__0__Impl_in_rule__SetLiteral__Group__05062 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__1_in_rule__SetLiteral__Group__05065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__TypeConsAssignment_0_in_rule__SetLiteral__Group__0__Impl5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__1__Impl_in_rule__SetLiteral__Group__15122 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__2_in_rule__SetLiteral__Group__15125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SetLiteral__Group__1__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__2__Impl_in_rule__SetLiteral__Group__25184 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__3_in_rule__SetLiteral__Group__25187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__0_in_rule__SetLiteral__Group__2__Impl5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group__3__Impl_in_rule__SetLiteral__Group__35245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SetLiteral__Group__3__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__0__Impl_in_rule__SetLiteral__Group_2__05312 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__1_in_rule__SetLiteral__Group_2__05315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__ElemsAssignment_2_0_in_rule__SetLiteral__Group_2__0__Impl5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2__1__Impl_in_rule__SetLiteral__Group_2__15372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__0_in_rule__SetLiteral__Group_2__1__Impl5399 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__0__Impl_in_rule__SetLiteral__Group_2_1__05434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__1_in_rule__SetLiteral__Group_2_1__05437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SetLiteral__Group_2_1__0__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__Group_2_1__1__Impl_in_rule__SetLiteral__Group_2_1__15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetLiteral__ElemsAssignment_2_1_1_in_rule__SetLiteral__Group_2_1__1__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__Group__0__Impl_in_rule__SubGroupDecl__Group__05557 = new BitSet(new long[]{0x0000000000001E10L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__Group__1_in_rule__SubGroupDecl__Group__05560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__Group_0__0_in_rule__SubGroupDecl__Group__0__Impl5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__Group__1__Impl_in_rule__SubGroupDecl__Group__15618 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__Group__2_in_rule__SubGroupDecl__Group__15621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__NameAssignment_1_in_rule__SubGroupDecl__Group__1__Impl5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__Group__2__Impl_in_rule__SubGroupDecl__Group__25678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__TypeAssignment_2_in_rule__SubGroupDecl__Group__2__Impl5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__Group_0__0__Impl_in_rule__SubGroupDecl__Group_0__05741 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__Group_0__1_in_rule__SubGroupDecl__Group_0__05744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__CategoryNameAssignment_0_0_in_rule__SubGroupDecl__Group_0__0__Impl5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupDecl__Group_0__1__Impl_in_rule__SubGroupDecl__Group_0__15801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SubGroupDecl__Group_0__1__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_0__0__Impl_in_rule__SubGroupType__Group_0__05864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_0__1_in_rule__SubGroupType__Group_0__05867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SubGroupType__Group_0__0__Impl5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_0__1__Impl_in_rule__SubGroupType__Group_0__15926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_0__2_in_rule__SubGroupType__Group_0__15929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_0__2__Impl_in_rule__SubGroupType__Group_0__25987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__TypeAssignment_0_2_in_rule__SubGroupType__Group_0__2__Impl6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1__0__Impl_in_rule__SubGroupType__Group_1__06050 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1__1_in_rule__SubGroupType__Group_1__06053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1__1__Impl_in_rule__SubGroupType__Group_1__16111 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1__2_in_rule__SubGroupType__Group_1__16114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1_1__0_in_rule__SubGroupType__Group_1__1__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1__2__Impl_in_rule__SubGroupType__Group_1__26172 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1__3_in_rule__SubGroupType__Group_1__26175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SubGroupType__Group_1__2__Impl6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1__3__Impl_in_rule__SubGroupType__Group_1__36234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__BodyAssignment_1_3_in_rule__SubGroupType__Group_1__3__Impl6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1_1__0__Impl_in_rule__SubGroupType__Group_1_1__06299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1_1__1_in_rule__SubGroupType__Group_1_1__06302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SubGroupType__Group_1_1__0__Impl6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1_1__1__Impl_in_rule__SubGroupType__Group_1_1__16361 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1_1__2_in_rule__SubGroupType__Group_1_1__16364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__SupersAssignment_1_1_1_in_rule__SubGroupType__Group_1_1__1__Impl6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1_1__2__Impl_in_rule__SubGroupType__Group_1_1__26421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1_1_2__0_in_rule__SubGroupType__Group_1_1__2__Impl6448 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1_1_2__0__Impl_in_rule__SubGroupType__Group_1_1_2__06485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1_1_2__1_in_rule__SubGroupType__Group_1_1_2__06488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SubGroupType__Group_1_1_2__0__Impl6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__Group_1_1_2__1__Impl_in_rule__SubGroupType__Group_1_1_2__16547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubGroupType__SupersAssignment_1_1_2_1_in_rule__SubGroupType__Group_1_1_2__1__Impl6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_rule__Model__DeclsAssignment6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decl__NameAssignment_0_26644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decl__NameAssignment_1_26675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decl__SupersAssignment_1_3_16710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decl__SupersAssignment_1_3_2_16749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureGroupBody_in_rule__Decl__BodyAssignment_1_46784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElementDecl_in_rule__FeatureGroupBody__GroupElementsAssignment_26815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__GroupAttrDecl__ModifierAssignment_06846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GroupAttrDecl__AttributeNameAssignment_16877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__GroupAttrDecl__AttributeTypeAssignment_2_0_16908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__GroupAttrDecl__AttributeLiteralAssignment_2_1_16939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__BaseTypeAssignment_0_16974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_1_27009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Type__ElemTypesAssignment_1_3_17040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BasicLiteral__TypeConsAssignment_07075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_rule__BasicLiteral__LitAssignment_17110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_07141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TupleLiteral__ElemsAssignment_2_1_17172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListLiteral__TypeConsAssignment_07207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_07242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__ListLiteral__ElemsAssignment_2_1_17273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SetLiteral__TypeConsAssignment_07308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_07343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleELiteral_in_rule__SetLiteral__ElemsAssignment_2_1_17374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIT_in_rule__ELiteral__LitAssignment7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubGroupDecl__CategoryNameAssignment_0_07436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubGroupDecl__NameAssignment_17467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubGroupType_in_rule__SubGroupDecl__TypeAssignment_27498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubGroupType__TypeAssignment_0_27533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubGroupType__SupersAssignment_1_1_17572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubGroupType__SupersAssignment_1_1_2_17611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureGroupBody_in_rule__SubGroupType__BodyAssignment_1_37646 = new BitSet(new long[]{0x0000000000000002L});

}