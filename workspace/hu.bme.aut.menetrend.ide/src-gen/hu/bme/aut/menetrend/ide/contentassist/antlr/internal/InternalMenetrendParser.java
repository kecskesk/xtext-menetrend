package hu.bme.aut.menetrend.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hu.bme.aut.menetrend.services.MenetrendGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMenetrendParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_BKV_ID_LF", "RULE_BKV_ID_LB", "RULE_STRING", "RULE_TIME_FORMAT", "RULE_DIGIT_ONE", "RULE_DIGIT", "RULE_DUAL_INT_NOLEADZERO", "RULE_DUAL_INT_LEADZERO", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'...'", "'Bus'", "'Tram'", "'Metro'", "'Troli'", "'Hev'", "'weekdays'", "'weekends'", "'monday'", "'tuesday'", "'wednesday'", "'thursday'", "'friday'", "'saturday'", "'sunday'", "'Stops'", "'Schedules'", "'Line'", "':'", "'-'", "'-['", "']->'", "'/'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_DUAL_INT_LEADZERO=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int RULE_DIGIT_ONE=9;
    public static final int RULE_DUAL_INT_NOLEADZERO=11;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_BKV_ID_LB=6;
    public static final int RULE_ID=13;
    public static final int RULE_WS=16;
    public static final int RULE_DIGIT=10;
    public static final int RULE_TIME_FORMAT=8;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_BKV_ID_LF=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMenetrendParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMenetrendParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMenetrendParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMenetrend.g"; }


    	private MenetrendGrammarAccess grammarAccess;

    	public void setGrammarAccess(MenetrendGrammarAccess grammarAccess) {
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
    // InternalMenetrend.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMenetrend.g:54:1: ( ruleModel EOF )
            // InternalMenetrend.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMenetrend.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMenetrend.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMenetrend.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMenetrend.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMenetrend.g:69:3: ( rule__Model__Group__0 )
            // InternalMenetrend.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSchedule"
    // InternalMenetrend.g:78:1: entryRuleSchedule : ruleSchedule EOF ;
    public final void entryRuleSchedule() throws RecognitionException {
        try {
            // InternalMenetrend.g:79:1: ( ruleSchedule EOF )
            // InternalMenetrend.g:80:1: ruleSchedule EOF
            {
             before(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            ruleSchedule();

            state._fsp--;

             after(grammarAccess.getScheduleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalMenetrend.g:87:1: ruleSchedule : ( ( rule__Schedule__Group__0 ) ) ;
    public final void ruleSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:91:2: ( ( ( rule__Schedule__Group__0 ) ) )
            // InternalMenetrend.g:92:2: ( ( rule__Schedule__Group__0 ) )
            {
            // InternalMenetrend.g:92:2: ( ( rule__Schedule__Group__0 ) )
            // InternalMenetrend.g:93:3: ( rule__Schedule__Group__0 )
            {
             before(grammarAccess.getScheduleAccess().getGroup()); 
            // InternalMenetrend.g:94:3: ( rule__Schedule__Group__0 )
            // InternalMenetrend.g:94:4: rule__Schedule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleLineNumber"
    // InternalMenetrend.g:103:1: entryRuleLineNumber : ruleLineNumber EOF ;
    public final void entryRuleLineNumber() throws RecognitionException {
        try {
            // InternalMenetrend.g:104:1: ( ruleLineNumber EOF )
            // InternalMenetrend.g:105:1: ruleLineNumber EOF
            {
             before(grammarAccess.getLineNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleLineNumber();

            state._fsp--;

             after(grammarAccess.getLineNumberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineNumber"


    // $ANTLR start "ruleLineNumber"
    // InternalMenetrend.g:112:1: ruleLineNumber : ( ( rule__LineNumber__Group__0 ) ) ;
    public final void ruleLineNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:116:2: ( ( ( rule__LineNumber__Group__0 ) ) )
            // InternalMenetrend.g:117:2: ( ( rule__LineNumber__Group__0 ) )
            {
            // InternalMenetrend.g:117:2: ( ( rule__LineNumber__Group__0 ) )
            // InternalMenetrend.g:118:3: ( rule__LineNumber__Group__0 )
            {
             before(grammarAccess.getLineNumberAccess().getGroup()); 
            // InternalMenetrend.g:119:3: ( rule__LineNumber__Group__0 )
            // InternalMenetrend.g:119:4: rule__LineNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineNumber"


    // $ANTLR start "entryRuleLineNumberInt"
    // InternalMenetrend.g:128:1: entryRuleLineNumberInt : ruleLineNumberInt EOF ;
    public final void entryRuleLineNumberInt() throws RecognitionException {
        try {
            // InternalMenetrend.g:129:1: ( ruleLineNumberInt EOF )
            // InternalMenetrend.g:130:1: ruleLineNumberInt EOF
            {
             before(grammarAccess.getLineNumberIntRule()); 
            pushFollow(FOLLOW_1);
            ruleLineNumberInt();

            state._fsp--;

             after(grammarAccess.getLineNumberIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineNumberInt"


    // $ANTLR start "ruleLineNumberInt"
    // InternalMenetrend.g:137:1: ruleLineNumberInt : ( RULE_INT ) ;
    public final void ruleLineNumberInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:141:2: ( ( RULE_INT ) )
            // InternalMenetrend.g:142:2: ( RULE_INT )
            {
            // InternalMenetrend.g:142:2: ( RULE_INT )
            // InternalMenetrend.g:143:3: RULE_INT
            {
             before(grammarAccess.getLineNumberIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineNumberIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineNumberInt"


    // $ANTLR start "entryRuleLineNumberBkvIdLf"
    // InternalMenetrend.g:153:1: entryRuleLineNumberBkvIdLf : ruleLineNumberBkvIdLf EOF ;
    public final void entryRuleLineNumberBkvIdLf() throws RecognitionException {
        try {
            // InternalMenetrend.g:154:1: ( ruleLineNumberBkvIdLf EOF )
            // InternalMenetrend.g:155:1: ruleLineNumberBkvIdLf EOF
            {
             before(grammarAccess.getLineNumberBkvIdLfRule()); 
            pushFollow(FOLLOW_1);
            ruleLineNumberBkvIdLf();

            state._fsp--;

             after(grammarAccess.getLineNumberBkvIdLfRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineNumberBkvIdLf"


    // $ANTLR start "ruleLineNumberBkvIdLf"
    // InternalMenetrend.g:162:1: ruleLineNumberBkvIdLf : ( RULE_BKV_ID_LF ) ;
    public final void ruleLineNumberBkvIdLf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:166:2: ( ( RULE_BKV_ID_LF ) )
            // InternalMenetrend.g:167:2: ( RULE_BKV_ID_LF )
            {
            // InternalMenetrend.g:167:2: ( RULE_BKV_ID_LF )
            // InternalMenetrend.g:168:3: RULE_BKV_ID_LF
            {
             before(grammarAccess.getLineNumberBkvIdLfAccess().getBKV_ID_LFTerminalRuleCall()); 
            match(input,RULE_BKV_ID_LF,FOLLOW_2); 
             after(grammarAccess.getLineNumberBkvIdLfAccess().getBKV_ID_LFTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineNumberBkvIdLf"


    // $ANTLR start "entryRuleLineNumberBkvIdLb"
    // InternalMenetrend.g:178:1: entryRuleLineNumberBkvIdLb : ruleLineNumberBkvIdLb EOF ;
    public final void entryRuleLineNumberBkvIdLb() throws RecognitionException {
        try {
            // InternalMenetrend.g:179:1: ( ruleLineNumberBkvIdLb EOF )
            // InternalMenetrend.g:180:1: ruleLineNumberBkvIdLb EOF
            {
             before(grammarAccess.getLineNumberBkvIdLbRule()); 
            pushFollow(FOLLOW_1);
            ruleLineNumberBkvIdLb();

            state._fsp--;

             after(grammarAccess.getLineNumberBkvIdLbRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineNumberBkvIdLb"


    // $ANTLR start "ruleLineNumberBkvIdLb"
    // InternalMenetrend.g:187:1: ruleLineNumberBkvIdLb : ( RULE_BKV_ID_LB ) ;
    public final void ruleLineNumberBkvIdLb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:191:2: ( ( RULE_BKV_ID_LB ) )
            // InternalMenetrend.g:192:2: ( RULE_BKV_ID_LB )
            {
            // InternalMenetrend.g:192:2: ( RULE_BKV_ID_LB )
            // InternalMenetrend.g:193:3: RULE_BKV_ID_LB
            {
             before(grammarAccess.getLineNumberBkvIdLbAccess().getBKV_ID_LBTerminalRuleCall()); 
            match(input,RULE_BKV_ID_LB,FOLLOW_2); 
             after(grammarAccess.getLineNumberBkvIdLbAccess().getBKV_ID_LBTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineNumberBkvIdLb"


    // $ANTLR start "entryRuleSchedulePart"
    // InternalMenetrend.g:203:1: entryRuleSchedulePart : ruleSchedulePart EOF ;
    public final void entryRuleSchedulePart() throws RecognitionException {
        try {
            // InternalMenetrend.g:204:1: ( ruleSchedulePart EOF )
            // InternalMenetrend.g:205:1: ruleSchedulePart EOF
            {
             before(grammarAccess.getSchedulePartRule()); 
            pushFollow(FOLLOW_1);
            ruleSchedulePart();

            state._fsp--;

             after(grammarAccess.getSchedulePartRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchedulePart"


    // $ANTLR start "ruleSchedulePart"
    // InternalMenetrend.g:212:1: ruleSchedulePart : ( ( rule__SchedulePart__Alternatives ) ) ;
    public final void ruleSchedulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:216:2: ( ( ( rule__SchedulePart__Alternatives ) ) )
            // InternalMenetrend.g:217:2: ( ( rule__SchedulePart__Alternatives ) )
            {
            // InternalMenetrend.g:217:2: ( ( rule__SchedulePart__Alternatives ) )
            // InternalMenetrend.g:218:3: ( rule__SchedulePart__Alternatives )
            {
             before(grammarAccess.getSchedulePartAccess().getAlternatives()); 
            // InternalMenetrend.g:219:3: ( rule__SchedulePart__Alternatives )
            // InternalMenetrend.g:219:4: rule__SchedulePart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SchedulePart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSchedulePartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchedulePart"


    // $ANTLR start "entryRuleRelativeSchedule"
    // InternalMenetrend.g:228:1: entryRuleRelativeSchedule : ruleRelativeSchedule EOF ;
    public final void entryRuleRelativeSchedule() throws RecognitionException {
        try {
            // InternalMenetrend.g:229:1: ( ruleRelativeSchedule EOF )
            // InternalMenetrend.g:230:1: ruleRelativeSchedule EOF
            {
             before(grammarAccess.getRelativeScheduleRule()); 
            pushFollow(FOLLOW_1);
            ruleRelativeSchedule();

            state._fsp--;

             after(grammarAccess.getRelativeScheduleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelativeSchedule"


    // $ANTLR start "ruleRelativeSchedule"
    // InternalMenetrend.g:237:1: ruleRelativeSchedule : ( ( rule__RelativeSchedule__Group__0 ) ) ;
    public final void ruleRelativeSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:241:2: ( ( ( rule__RelativeSchedule__Group__0 ) ) )
            // InternalMenetrend.g:242:2: ( ( rule__RelativeSchedule__Group__0 ) )
            {
            // InternalMenetrend.g:242:2: ( ( rule__RelativeSchedule__Group__0 ) )
            // InternalMenetrend.g:243:3: ( rule__RelativeSchedule__Group__0 )
            {
             before(grammarAccess.getRelativeScheduleAccess().getGroup()); 
            // InternalMenetrend.g:244:3: ( rule__RelativeSchedule__Group__0 )
            // InternalMenetrend.g:244:4: rule__RelativeSchedule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelativeSchedule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeScheduleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelativeSchedule"


    // $ANTLR start "entryRuleRelativeTarget"
    // InternalMenetrend.g:253:1: entryRuleRelativeTarget : ruleRelativeTarget EOF ;
    public final void entryRuleRelativeTarget() throws RecognitionException {
        try {
            // InternalMenetrend.g:254:1: ( ruleRelativeTarget EOF )
            // InternalMenetrend.g:255:1: ruleRelativeTarget EOF
            {
             before(grammarAccess.getRelativeTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleRelativeTarget();

            state._fsp--;

             after(grammarAccess.getRelativeTargetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelativeTarget"


    // $ANTLR start "ruleRelativeTarget"
    // InternalMenetrend.g:262:1: ruleRelativeTarget : ( ( rule__RelativeTarget__Group__0 ) ) ;
    public final void ruleRelativeTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:266:2: ( ( ( rule__RelativeTarget__Group__0 ) ) )
            // InternalMenetrend.g:267:2: ( ( rule__RelativeTarget__Group__0 ) )
            {
            // InternalMenetrend.g:267:2: ( ( rule__RelativeTarget__Group__0 ) )
            // InternalMenetrend.g:268:3: ( rule__RelativeTarget__Group__0 )
            {
             before(grammarAccess.getRelativeTargetAccess().getGroup()); 
            // InternalMenetrend.g:269:3: ( rule__RelativeTarget__Group__0 )
            // InternalMenetrend.g:269:4: rule__RelativeTarget__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelativeTarget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeTargetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelativeTarget"


    // $ANTLR start "entryRuleAbsoluteSchedule"
    // InternalMenetrend.g:278:1: entryRuleAbsoluteSchedule : ruleAbsoluteSchedule EOF ;
    public final void entryRuleAbsoluteSchedule() throws RecognitionException {
        try {
            // InternalMenetrend.g:279:1: ( ruleAbsoluteSchedule EOF )
            // InternalMenetrend.g:280:1: ruleAbsoluteSchedule EOF
            {
             before(grammarAccess.getAbsoluteScheduleRule()); 
            pushFollow(FOLLOW_1);
            ruleAbsoluteSchedule();

            state._fsp--;

             after(grammarAccess.getAbsoluteScheduleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbsoluteSchedule"


    // $ANTLR start "ruleAbsoluteSchedule"
    // InternalMenetrend.g:287:1: ruleAbsoluteSchedule : ( ( rule__AbsoluteSchedule__Group__0 ) ) ;
    public final void ruleAbsoluteSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:291:2: ( ( ( rule__AbsoluteSchedule__Group__0 ) ) )
            // InternalMenetrend.g:292:2: ( ( rule__AbsoluteSchedule__Group__0 ) )
            {
            // InternalMenetrend.g:292:2: ( ( rule__AbsoluteSchedule__Group__0 ) )
            // InternalMenetrend.g:293:3: ( rule__AbsoluteSchedule__Group__0 )
            {
             before(grammarAccess.getAbsoluteScheduleAccess().getGroup()); 
            // InternalMenetrend.g:294:3: ( rule__AbsoluteSchedule__Group__0 )
            // InternalMenetrend.g:294:4: rule__AbsoluteSchedule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteSchedule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteScheduleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbsoluteSchedule"


    // $ANTLR start "entryRuleDeparture"
    // InternalMenetrend.g:303:1: entryRuleDeparture : ruleDeparture EOF ;
    public final void entryRuleDeparture() throws RecognitionException {
        try {
            // InternalMenetrend.g:304:1: ( ruleDeparture EOF )
            // InternalMenetrend.g:305:1: ruleDeparture EOF
            {
             before(grammarAccess.getDepartureRule()); 
            pushFollow(FOLLOW_1);
            ruleDeparture();

            state._fsp--;

             after(grammarAccess.getDepartureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeparture"


    // $ANTLR start "ruleDeparture"
    // InternalMenetrend.g:312:1: ruleDeparture : ( ( rule__Departure__Alternatives ) ) ;
    public final void ruleDeparture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:316:2: ( ( ( rule__Departure__Alternatives ) ) )
            // InternalMenetrend.g:317:2: ( ( rule__Departure__Alternatives ) )
            {
            // InternalMenetrend.g:317:2: ( ( rule__Departure__Alternatives ) )
            // InternalMenetrend.g:318:3: ( rule__Departure__Alternatives )
            {
             before(grammarAccess.getDepartureAccess().getAlternatives()); 
            // InternalMenetrend.g:319:3: ( rule__Departure__Alternatives )
            // InternalMenetrend.g:319:4: rule__Departure__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Departure__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDepartureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeparture"


    // $ANTLR start "entryRuleSimpleTimeFormat"
    // InternalMenetrend.g:328:1: entryRuleSimpleTimeFormat : ruleSimpleTimeFormat EOF ;
    public final void entryRuleSimpleTimeFormat() throws RecognitionException {
        try {
            // InternalMenetrend.g:329:1: ( ruleSimpleTimeFormat EOF )
            // InternalMenetrend.g:330:1: ruleSimpleTimeFormat EOF
            {
             before(grammarAccess.getSimpleTimeFormatRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleTimeFormat();

            state._fsp--;

             after(grammarAccess.getSimpleTimeFormatRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleTimeFormat"


    // $ANTLR start "ruleSimpleTimeFormat"
    // InternalMenetrend.g:337:1: ruleSimpleTimeFormat : ( ( rule__SimpleTimeFormat__FromAssignment ) ) ;
    public final void ruleSimpleTimeFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:341:2: ( ( ( rule__SimpleTimeFormat__FromAssignment ) ) )
            // InternalMenetrend.g:342:2: ( ( rule__SimpleTimeFormat__FromAssignment ) )
            {
            // InternalMenetrend.g:342:2: ( ( rule__SimpleTimeFormat__FromAssignment ) )
            // InternalMenetrend.g:343:3: ( rule__SimpleTimeFormat__FromAssignment )
            {
             before(grammarAccess.getSimpleTimeFormatAccess().getFromAssignment()); 
            // InternalMenetrend.g:344:3: ( rule__SimpleTimeFormat__FromAssignment )
            // InternalMenetrend.g:344:4: rule__SimpleTimeFormat__FromAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTimeFormat__FromAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTimeFormatAccess().getFromAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleTimeFormat"


    // $ANTLR start "entryRuleComplexTimeMiddle"
    // InternalMenetrend.g:353:1: entryRuleComplexTimeMiddle : ruleComplexTimeMiddle EOF ;
    public final void entryRuleComplexTimeMiddle() throws RecognitionException {
        try {
            // InternalMenetrend.g:354:1: ( ruleComplexTimeMiddle EOF )
            // InternalMenetrend.g:355:1: ruleComplexTimeMiddle EOF
            {
             before(grammarAccess.getComplexTimeMiddleRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexTimeMiddle();

            state._fsp--;

             after(grammarAccess.getComplexTimeMiddleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplexTimeMiddle"


    // $ANTLR start "ruleComplexTimeMiddle"
    // InternalMenetrend.g:362:1: ruleComplexTimeMiddle : ( ( rule__ComplexTimeMiddle__Group__0 ) ) ;
    public final void ruleComplexTimeMiddle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:366:2: ( ( ( rule__ComplexTimeMiddle__Group__0 ) ) )
            // InternalMenetrend.g:367:2: ( ( rule__ComplexTimeMiddle__Group__0 ) )
            {
            // InternalMenetrend.g:367:2: ( ( rule__ComplexTimeMiddle__Group__0 ) )
            // InternalMenetrend.g:368:3: ( rule__ComplexTimeMiddle__Group__0 )
            {
             before(grammarAccess.getComplexTimeMiddleAccess().getGroup()); 
            // InternalMenetrend.g:369:3: ( rule__ComplexTimeMiddle__Group__0 )
            // InternalMenetrend.g:369:4: rule__ComplexTimeMiddle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTimeMiddle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTimeMiddleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexTimeMiddle"


    // $ANTLR start "entryRuleComplexTimeEnd"
    // InternalMenetrend.g:378:1: entryRuleComplexTimeEnd : ruleComplexTimeEnd EOF ;
    public final void entryRuleComplexTimeEnd() throws RecognitionException {
        try {
            // InternalMenetrend.g:379:1: ( ruleComplexTimeEnd EOF )
            // InternalMenetrend.g:380:1: ruleComplexTimeEnd EOF
            {
             before(grammarAccess.getComplexTimeEndRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexTimeEnd();

            state._fsp--;

             after(grammarAccess.getComplexTimeEndRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplexTimeEnd"


    // $ANTLR start "ruleComplexTimeEnd"
    // InternalMenetrend.g:387:1: ruleComplexTimeEnd : ( ( rule__ComplexTimeEnd__Group__0 ) ) ;
    public final void ruleComplexTimeEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:391:2: ( ( ( rule__ComplexTimeEnd__Group__0 ) ) )
            // InternalMenetrend.g:392:2: ( ( rule__ComplexTimeEnd__Group__0 ) )
            {
            // InternalMenetrend.g:392:2: ( ( rule__ComplexTimeEnd__Group__0 ) )
            // InternalMenetrend.g:393:3: ( rule__ComplexTimeEnd__Group__0 )
            {
             before(grammarAccess.getComplexTimeEndAccess().getGroup()); 
            // InternalMenetrend.g:394:3: ( rule__ComplexTimeEnd__Group__0 )
            // InternalMenetrend.g:394:4: rule__ComplexTimeEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTimeEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTimeEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexTimeEnd"


    // $ANTLR start "entryRuleStop"
    // InternalMenetrend.g:403:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // InternalMenetrend.g:404:1: ( ruleStop EOF )
            // InternalMenetrend.g:405:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalMenetrend.g:412:1: ruleStop : ( ( rule__Stop__NameAssignment ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:416:2: ( ( ( rule__Stop__NameAssignment ) ) )
            // InternalMenetrend.g:417:2: ( ( rule__Stop__NameAssignment ) )
            {
            // InternalMenetrend.g:417:2: ( ( rule__Stop__NameAssignment ) )
            // InternalMenetrend.g:418:3: ( rule__Stop__NameAssignment )
            {
             before(grammarAccess.getStopAccess().getNameAssignment()); 
            // InternalMenetrend.g:419:3: ( rule__Stop__NameAssignment )
            // InternalMenetrend.g:419:4: rule__Stop__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Stop__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "ruleTransportType"
    // InternalMenetrend.g:428:1: ruleTransportType : ( ( rule__TransportType__Alternatives ) ) ;
    public final void ruleTransportType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:432:1: ( ( ( rule__TransportType__Alternatives ) ) )
            // InternalMenetrend.g:433:2: ( ( rule__TransportType__Alternatives ) )
            {
            // InternalMenetrend.g:433:2: ( ( rule__TransportType__Alternatives ) )
            // InternalMenetrend.g:434:3: ( rule__TransportType__Alternatives )
            {
             before(grammarAccess.getTransportTypeAccess().getAlternatives()); 
            // InternalMenetrend.g:435:3: ( rule__TransportType__Alternatives )
            // InternalMenetrend.g:435:4: rule__TransportType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TransportType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransportTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransportType"


    // $ANTLR start "ruleDayType"
    // InternalMenetrend.g:444:1: ruleDayType : ( ( rule__DayType__Alternatives ) ) ;
    public final void ruleDayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:448:1: ( ( ( rule__DayType__Alternatives ) ) )
            // InternalMenetrend.g:449:2: ( ( rule__DayType__Alternatives ) )
            {
            // InternalMenetrend.g:449:2: ( ( rule__DayType__Alternatives ) )
            // InternalMenetrend.g:450:3: ( rule__DayType__Alternatives )
            {
             before(grammarAccess.getDayTypeAccess().getAlternatives()); 
            // InternalMenetrend.g:451:3: ( rule__DayType__Alternatives )
            // InternalMenetrend.g:451:4: rule__DayType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DayType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDayTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDayType"


    // $ANTLR start "rule__LineNumber__NumberAlternatives_2_0"
    // InternalMenetrend.g:459:1: rule__LineNumber__NumberAlternatives_2_0 : ( ( ruleLineNumberInt ) | ( ruleLineNumberBkvIdLf ) | ( ruleLineNumberBkvIdLb ) );
    public final void rule__LineNumber__NumberAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:463:1: ( ( ruleLineNumberInt ) | ( ruleLineNumberBkvIdLf ) | ( ruleLineNumberBkvIdLb ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case RULE_BKV_ID_LF:
                {
                alt1=2;
                }
                break;
            case RULE_BKV_ID_LB:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMenetrend.g:464:2: ( ruleLineNumberInt )
                    {
                    // InternalMenetrend.g:464:2: ( ruleLineNumberInt )
                    // InternalMenetrend.g:465:3: ruleLineNumberInt
                    {
                     before(grammarAccess.getLineNumberAccess().getNumberLineNumberIntParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLineNumberInt();

                    state._fsp--;

                     after(grammarAccess.getLineNumberAccess().getNumberLineNumberIntParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:470:2: ( ruleLineNumberBkvIdLf )
                    {
                    // InternalMenetrend.g:470:2: ( ruleLineNumberBkvIdLf )
                    // InternalMenetrend.g:471:3: ruleLineNumberBkvIdLf
                    {
                     before(grammarAccess.getLineNumberAccess().getNumberLineNumberBkvIdLfParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLineNumberBkvIdLf();

                    state._fsp--;

                     after(grammarAccess.getLineNumberAccess().getNumberLineNumberBkvIdLfParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMenetrend.g:476:2: ( ruleLineNumberBkvIdLb )
                    {
                    // InternalMenetrend.g:476:2: ( ruleLineNumberBkvIdLb )
                    // InternalMenetrend.g:477:3: ruleLineNumberBkvIdLb
                    {
                     before(grammarAccess.getLineNumberAccess().getNumberLineNumberBkvIdLbParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLineNumberBkvIdLb();

                    state._fsp--;

                     after(grammarAccess.getLineNumberAccess().getNumberLineNumberBkvIdLbParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__LineNumber__NumberAlternatives_2_0"


    // $ANTLR start "rule__SchedulePart__Alternatives"
    // InternalMenetrend.g:486:1: rule__SchedulePart__Alternatives : ( ( ruleRelativeSchedule ) | ( ruleAbsoluteSchedule ) );
    public final void rule__SchedulePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:490:1: ( ( ruleRelativeSchedule ) | ( ruleAbsoluteSchedule ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=25 && LA2_0<=33)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMenetrend.g:491:2: ( ruleRelativeSchedule )
                    {
                    // InternalMenetrend.g:491:2: ( ruleRelativeSchedule )
                    // InternalMenetrend.g:492:3: ruleRelativeSchedule
                    {
                     before(grammarAccess.getSchedulePartAccess().getRelativeScheduleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRelativeSchedule();

                    state._fsp--;

                     after(grammarAccess.getSchedulePartAccess().getRelativeScheduleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:497:2: ( ruleAbsoluteSchedule )
                    {
                    // InternalMenetrend.g:497:2: ( ruleAbsoluteSchedule )
                    // InternalMenetrend.g:498:3: ruleAbsoluteSchedule
                    {
                     before(grammarAccess.getSchedulePartAccess().getAbsoluteScheduleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAbsoluteSchedule();

                    state._fsp--;

                     after(grammarAccess.getSchedulePartAccess().getAbsoluteScheduleParserRuleCall_1()); 

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
    // $ANTLR end "rule__SchedulePart__Alternatives"


    // $ANTLR start "rule__AbsoluteSchedule__Alternatives_2_0"
    // InternalMenetrend.g:507:1: rule__AbsoluteSchedule__Alternatives_2_0 : ( ( ',' ) | ( '...' ) );
    public final void rule__AbsoluteSchedule__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:511:1: ( ( ',' ) | ( '...' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMenetrend.g:512:2: ( ',' )
                    {
                    // InternalMenetrend.g:512:2: ( ',' )
                    // InternalMenetrend.g:513:3: ','
                    {
                     before(grammarAccess.getAbsoluteScheduleAccess().getCommaKeyword_2_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAbsoluteScheduleAccess().getCommaKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:518:2: ( '...' )
                    {
                    // InternalMenetrend.g:518:2: ( '...' )
                    // InternalMenetrend.g:519:3: '...'
                    {
                     before(grammarAccess.getAbsoluteScheduleAccess().getFullStopFullStopFullStopKeyword_2_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAbsoluteScheduleAccess().getFullStopFullStopFullStopKeyword_2_0_1()); 

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
    // $ANTLR end "rule__AbsoluteSchedule__Alternatives_2_0"


    // $ANTLR start "rule__Departure__Alternatives"
    // InternalMenetrend.g:528:1: rule__Departure__Alternatives : ( ( ruleSimpleTimeFormat ) | ( ruleComplexTimeMiddle ) | ( ruleComplexTimeEnd ) );
    public final void rule__Departure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:532:1: ( ( ruleSimpleTimeFormat ) | ( ruleComplexTimeMiddle ) | ( ruleComplexTimeEnd ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TIME_FORMAT) ) {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    alt4=2;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 18:
                case 19:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 36:
                    {
                    alt4=1;
                    }
                    break;
                case 41:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMenetrend.g:533:2: ( ruleSimpleTimeFormat )
                    {
                    // InternalMenetrend.g:533:2: ( ruleSimpleTimeFormat )
                    // InternalMenetrend.g:534:3: ruleSimpleTimeFormat
                    {
                     before(grammarAccess.getDepartureAccess().getSimpleTimeFormatParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleTimeFormat();

                    state._fsp--;

                     after(grammarAccess.getDepartureAccess().getSimpleTimeFormatParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:539:2: ( ruleComplexTimeMiddle )
                    {
                    // InternalMenetrend.g:539:2: ( ruleComplexTimeMiddle )
                    // InternalMenetrend.g:540:3: ruleComplexTimeMiddle
                    {
                     before(grammarAccess.getDepartureAccess().getComplexTimeMiddleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexTimeMiddle();

                    state._fsp--;

                     after(grammarAccess.getDepartureAccess().getComplexTimeMiddleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMenetrend.g:545:2: ( ruleComplexTimeEnd )
                    {
                    // InternalMenetrend.g:545:2: ( ruleComplexTimeEnd )
                    // InternalMenetrend.g:546:3: ruleComplexTimeEnd
                    {
                     before(grammarAccess.getDepartureAccess().getComplexTimeEndParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexTimeEnd();

                    state._fsp--;

                     after(grammarAccess.getDepartureAccess().getComplexTimeEndParserRuleCall_2()); 

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
    // $ANTLR end "rule__Departure__Alternatives"


    // $ANTLR start "rule__TransportType__Alternatives"
    // InternalMenetrend.g:555:1: rule__TransportType__Alternatives : ( ( ( 'Bus' ) ) | ( ( 'Tram' ) ) | ( ( 'Metro' ) ) | ( ( 'Troli' ) ) | ( ( 'Hev' ) ) );
    public final void rule__TransportType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:559:1: ( ( ( 'Bus' ) ) | ( ( 'Tram' ) ) | ( ( 'Metro' ) ) | ( ( 'Troli' ) ) | ( ( 'Hev' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMenetrend.g:560:2: ( ( 'Bus' ) )
                    {
                    // InternalMenetrend.g:560:2: ( ( 'Bus' ) )
                    // InternalMenetrend.g:561:3: ( 'Bus' )
                    {
                     before(grammarAccess.getTransportTypeAccess().getBUSEnumLiteralDeclaration_0()); 
                    // InternalMenetrend.g:562:3: ( 'Bus' )
                    // InternalMenetrend.g:562:4: 'Bus'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransportTypeAccess().getBUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:566:2: ( ( 'Tram' ) )
                    {
                    // InternalMenetrend.g:566:2: ( ( 'Tram' ) )
                    // InternalMenetrend.g:567:3: ( 'Tram' )
                    {
                     before(grammarAccess.getTransportTypeAccess().getTRAMEnumLiteralDeclaration_1()); 
                    // InternalMenetrend.g:568:3: ( 'Tram' )
                    // InternalMenetrend.g:568:4: 'Tram'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransportTypeAccess().getTRAMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMenetrend.g:572:2: ( ( 'Metro' ) )
                    {
                    // InternalMenetrend.g:572:2: ( ( 'Metro' ) )
                    // InternalMenetrend.g:573:3: ( 'Metro' )
                    {
                     before(grammarAccess.getTransportTypeAccess().getMETROEnumLiteralDeclaration_2()); 
                    // InternalMenetrend.g:574:3: ( 'Metro' )
                    // InternalMenetrend.g:574:4: 'Metro'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransportTypeAccess().getMETROEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMenetrend.g:578:2: ( ( 'Troli' ) )
                    {
                    // InternalMenetrend.g:578:2: ( ( 'Troli' ) )
                    // InternalMenetrend.g:579:3: ( 'Troli' )
                    {
                     before(grammarAccess.getTransportTypeAccess().getTROLIEnumLiteralDeclaration_3()); 
                    // InternalMenetrend.g:580:3: ( 'Troli' )
                    // InternalMenetrend.g:580:4: 'Troli'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransportTypeAccess().getTROLIEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMenetrend.g:584:2: ( ( 'Hev' ) )
                    {
                    // InternalMenetrend.g:584:2: ( ( 'Hev' ) )
                    // InternalMenetrend.g:585:3: ( 'Hev' )
                    {
                     before(grammarAccess.getTransportTypeAccess().getHEVEnumLiteralDeclaration_4()); 
                    // InternalMenetrend.g:586:3: ( 'Hev' )
                    // InternalMenetrend.g:586:4: 'Hev'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransportTypeAccess().getHEVEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__TransportType__Alternatives"


    // $ANTLR start "rule__DayType__Alternatives"
    // InternalMenetrend.g:594:1: rule__DayType__Alternatives : ( ( ( 'weekdays' ) ) | ( ( 'weekends' ) ) | ( ( 'monday' ) ) | ( ( 'tuesday' ) ) | ( ( 'wednesday' ) ) | ( ( 'thursday' ) ) | ( ( 'friday' ) ) | ( ( 'saturday' ) ) | ( ( 'sunday' ) ) );
    public final void rule__DayType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:598:1: ( ( ( 'weekdays' ) ) | ( ( 'weekends' ) ) | ( ( 'monday' ) ) | ( ( 'tuesday' ) ) | ( ( 'wednesday' ) ) | ( ( 'thursday' ) ) | ( ( 'friday' ) ) | ( ( 'saturday' ) ) | ( ( 'sunday' ) ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            case 29:
                {
                alt6=5;
                }
                break;
            case 30:
                {
                alt6=6;
                }
                break;
            case 31:
                {
                alt6=7;
                }
                break;
            case 32:
                {
                alt6=8;
                }
                break;
            case 33:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMenetrend.g:599:2: ( ( 'weekdays' ) )
                    {
                    // InternalMenetrend.g:599:2: ( ( 'weekdays' ) )
                    // InternalMenetrend.g:600:3: ( 'weekdays' )
                    {
                     before(grammarAccess.getDayTypeAccess().getWEEKDAYSEnumLiteralDeclaration_0()); 
                    // InternalMenetrend.g:601:3: ( 'weekdays' )
                    // InternalMenetrend.g:601:4: 'weekdays'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayTypeAccess().getWEEKDAYSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:605:2: ( ( 'weekends' ) )
                    {
                    // InternalMenetrend.g:605:2: ( ( 'weekends' ) )
                    // InternalMenetrend.g:606:3: ( 'weekends' )
                    {
                     before(grammarAccess.getDayTypeAccess().getWEEKENDSEnumLiteralDeclaration_1()); 
                    // InternalMenetrend.g:607:3: ( 'weekends' )
                    // InternalMenetrend.g:607:4: 'weekends'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayTypeAccess().getWEEKENDSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMenetrend.g:611:2: ( ( 'monday' ) )
                    {
                    // InternalMenetrend.g:611:2: ( ( 'monday' ) )
                    // InternalMenetrend.g:612:3: ( 'monday' )
                    {
                     before(grammarAccess.getDayTypeAccess().getMONDAYEnumLiteralDeclaration_2()); 
                    // InternalMenetrend.g:613:3: ( 'monday' )
                    // InternalMenetrend.g:613:4: 'monday'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayTypeAccess().getMONDAYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMenetrend.g:617:2: ( ( 'tuesday' ) )
                    {
                    // InternalMenetrend.g:617:2: ( ( 'tuesday' ) )
                    // InternalMenetrend.g:618:3: ( 'tuesday' )
                    {
                     before(grammarAccess.getDayTypeAccess().getTUESDAYEnumLiteralDeclaration_3()); 
                    // InternalMenetrend.g:619:3: ( 'tuesday' )
                    // InternalMenetrend.g:619:4: 'tuesday'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayTypeAccess().getTUESDAYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMenetrend.g:623:2: ( ( 'wednesday' ) )
                    {
                    // InternalMenetrend.g:623:2: ( ( 'wednesday' ) )
                    // InternalMenetrend.g:624:3: ( 'wednesday' )
                    {
                     before(grammarAccess.getDayTypeAccess().getWEDNESDAYEnumLiteralDeclaration_4()); 
                    // InternalMenetrend.g:625:3: ( 'wednesday' )
                    // InternalMenetrend.g:625:4: 'wednesday'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayTypeAccess().getWEDNESDAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMenetrend.g:629:2: ( ( 'thursday' ) )
                    {
                    // InternalMenetrend.g:629:2: ( ( 'thursday' ) )
                    // InternalMenetrend.g:630:3: ( 'thursday' )
                    {
                     before(grammarAccess.getDayTypeAccess().getTHURSDAYEnumLiteralDeclaration_5()); 
                    // InternalMenetrend.g:631:3: ( 'thursday' )
                    // InternalMenetrend.g:631:4: 'thursday'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayTypeAccess().getTHURSDAYEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMenetrend.g:635:2: ( ( 'friday' ) )
                    {
                    // InternalMenetrend.g:635:2: ( ( 'friday' ) )
                    // InternalMenetrend.g:636:3: ( 'friday' )
                    {
                     before(grammarAccess.getDayTypeAccess().getFRIDAYEnumLiteralDeclaration_6()); 
                    // InternalMenetrend.g:637:3: ( 'friday' )
                    // InternalMenetrend.g:637:4: 'friday'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayTypeAccess().getFRIDAYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMenetrend.g:641:2: ( ( 'saturday' ) )
                    {
                    // InternalMenetrend.g:641:2: ( ( 'saturday' ) )
                    // InternalMenetrend.g:642:3: ( 'saturday' )
                    {
                     before(grammarAccess.getDayTypeAccess().getSATURDAYEnumLiteralDeclaration_7()); 
                    // InternalMenetrend.g:643:3: ( 'saturday' )
                    // InternalMenetrend.g:643:4: 'saturday'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayTypeAccess().getSATURDAYEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMenetrend.g:647:2: ( ( 'sunday' ) )
                    {
                    // InternalMenetrend.g:647:2: ( ( 'sunday' ) )
                    // InternalMenetrend.g:648:3: ( 'sunday' )
                    {
                     before(grammarAccess.getDayTypeAccess().getSUNDAYEnumLiteralDeclaration_8()); 
                    // InternalMenetrend.g:649:3: ( 'sunday' )
                    // InternalMenetrend.g:649:4: 'sunday'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayTypeAccess().getSUNDAYEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__DayType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMenetrend.g:657:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:661:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMenetrend.g:662:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMenetrend.g:669:1: rule__Model__Group__0__Impl : ( 'Stops' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:673:1: ( ( 'Stops' ) )
            // InternalMenetrend.g:674:1: ( 'Stops' )
            {
            // InternalMenetrend.g:674:1: ( 'Stops' )
            // InternalMenetrend.g:675:2: 'Stops'
            {
             before(grammarAccess.getModelAccess().getStopsKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getStopsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMenetrend.g:684:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:688:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMenetrend.g:689:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMenetrend.g:696:1: rule__Model__Group__1__Impl : ( ( rule__Model__StopsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:700:1: ( ( ( rule__Model__StopsAssignment_1 ) ) )
            // InternalMenetrend.g:701:1: ( ( rule__Model__StopsAssignment_1 ) )
            {
            // InternalMenetrend.g:701:1: ( ( rule__Model__StopsAssignment_1 ) )
            // InternalMenetrend.g:702:2: ( rule__Model__StopsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getStopsAssignment_1()); 
            // InternalMenetrend.g:703:2: ( rule__Model__StopsAssignment_1 )
            // InternalMenetrend.g:703:3: rule__Model__StopsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__StopsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStopsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMenetrend.g:711:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:715:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMenetrend.g:716:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMenetrend.g:723:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:727:1: ( ( ( rule__Model__Group_2__0 )* ) )
            // InternalMenetrend.g:728:1: ( ( rule__Model__Group_2__0 )* )
            {
            // InternalMenetrend.g:728:1: ( ( rule__Model__Group_2__0 )* )
            // InternalMenetrend.g:729:2: ( rule__Model__Group_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalMenetrend.g:730:2: ( rule__Model__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMenetrend.g:730:3: rule__Model__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMenetrend.g:738:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:742:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMenetrend.g:743:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMenetrend.g:750:1: rule__Model__Group__3__Impl : ( 'Schedules' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:754:1: ( ( 'Schedules' ) )
            // InternalMenetrend.g:755:1: ( 'Schedules' )
            {
            // InternalMenetrend.g:755:1: ( 'Schedules' )
            // InternalMenetrend.g:756:2: 'Schedules'
            {
             before(grammarAccess.getModelAccess().getSchedulesKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSchedulesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMenetrend.g:765:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:769:1: ( rule__Model__Group__4__Impl )
            // InternalMenetrend.g:770:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMenetrend.g:776:1: rule__Model__Group__4__Impl : ( ( ( rule__Model__SchedulesAssignment_4 ) ) ( ( rule__Model__SchedulesAssignment_4 )* ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:780:1: ( ( ( ( rule__Model__SchedulesAssignment_4 ) ) ( ( rule__Model__SchedulesAssignment_4 )* ) ) )
            // InternalMenetrend.g:781:1: ( ( ( rule__Model__SchedulesAssignment_4 ) ) ( ( rule__Model__SchedulesAssignment_4 )* ) )
            {
            // InternalMenetrend.g:781:1: ( ( ( rule__Model__SchedulesAssignment_4 ) ) ( ( rule__Model__SchedulesAssignment_4 )* ) )
            // InternalMenetrend.g:782:2: ( ( rule__Model__SchedulesAssignment_4 ) ) ( ( rule__Model__SchedulesAssignment_4 )* )
            {
            // InternalMenetrend.g:782:2: ( ( rule__Model__SchedulesAssignment_4 ) )
            // InternalMenetrend.g:783:3: ( rule__Model__SchedulesAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getSchedulesAssignment_4()); 
            // InternalMenetrend.g:784:3: ( rule__Model__SchedulesAssignment_4 )
            // InternalMenetrend.g:784:4: rule__Model__SchedulesAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Model__SchedulesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSchedulesAssignment_4()); 

            }

            // InternalMenetrend.g:787:2: ( ( rule__Model__SchedulesAssignment_4 )* )
            // InternalMenetrend.g:788:3: ( rule__Model__SchedulesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getSchedulesAssignment_4()); 
            // InternalMenetrend.g:789:3: ( rule__Model__SchedulesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMenetrend.g:789:4: rule__Model__SchedulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__SchedulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSchedulesAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalMenetrend.g:799:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:803:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalMenetrend.g:804:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // InternalMenetrend.g:811:1: rule__Model__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:815:1: ( ( ',' ) )
            // InternalMenetrend.g:816:1: ( ',' )
            {
            // InternalMenetrend.g:816:1: ( ',' )
            // InternalMenetrend.g:817:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // InternalMenetrend.g:826:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:830:1: ( rule__Model__Group_2__1__Impl )
            // InternalMenetrend.g:831:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // InternalMenetrend.g:837:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__StopsAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:841:1: ( ( ( rule__Model__StopsAssignment_2_1 ) ) )
            // InternalMenetrend.g:842:1: ( ( rule__Model__StopsAssignment_2_1 ) )
            {
            // InternalMenetrend.g:842:1: ( ( rule__Model__StopsAssignment_2_1 ) )
            // InternalMenetrend.g:843:2: ( rule__Model__StopsAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getStopsAssignment_2_1()); 
            // InternalMenetrend.g:844:2: ( rule__Model__StopsAssignment_2_1 )
            // InternalMenetrend.g:844:3: rule__Model__StopsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__StopsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStopsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__Schedule__Group__0"
    // InternalMenetrend.g:853:1: rule__Schedule__Group__0 : rule__Schedule__Group__0__Impl rule__Schedule__Group__1 ;
    public final void rule__Schedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:857:1: ( rule__Schedule__Group__0__Impl rule__Schedule__Group__1 )
            // InternalMenetrend.g:858:2: rule__Schedule__Group__0__Impl rule__Schedule__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Schedule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__0"


    // $ANTLR start "rule__Schedule__Group__0__Impl"
    // InternalMenetrend.g:865:1: rule__Schedule__Group__0__Impl : ( 'Line' ) ;
    public final void rule__Schedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:869:1: ( ( 'Line' ) )
            // InternalMenetrend.g:870:1: ( 'Line' )
            {
            // InternalMenetrend.g:870:1: ( 'Line' )
            // InternalMenetrend.g:871:2: 'Line'
            {
             before(grammarAccess.getScheduleAccess().getLineKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__0__Impl"


    // $ANTLR start "rule__Schedule__Group__1"
    // InternalMenetrend.g:880:1: rule__Schedule__Group__1 : rule__Schedule__Group__1__Impl rule__Schedule__Group__2 ;
    public final void rule__Schedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:884:1: ( rule__Schedule__Group__1__Impl rule__Schedule__Group__2 )
            // InternalMenetrend.g:885:2: rule__Schedule__Group__1__Impl rule__Schedule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Schedule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__1"


    // $ANTLR start "rule__Schedule__Group__1__Impl"
    // InternalMenetrend.g:892:1: rule__Schedule__Group__1__Impl : ( ( rule__Schedule__LineNumberAssignment_1 ) ) ;
    public final void rule__Schedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:896:1: ( ( ( rule__Schedule__LineNumberAssignment_1 ) ) )
            // InternalMenetrend.g:897:1: ( ( rule__Schedule__LineNumberAssignment_1 ) )
            {
            // InternalMenetrend.g:897:1: ( ( rule__Schedule__LineNumberAssignment_1 ) )
            // InternalMenetrend.g:898:2: ( rule__Schedule__LineNumberAssignment_1 )
            {
             before(grammarAccess.getScheduleAccess().getLineNumberAssignment_1()); 
            // InternalMenetrend.g:899:2: ( rule__Schedule__LineNumberAssignment_1 )
            // InternalMenetrend.g:899:3: rule__Schedule__LineNumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__LineNumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getLineNumberAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__1__Impl"


    // $ANTLR start "rule__Schedule__Group__2"
    // InternalMenetrend.g:907:1: rule__Schedule__Group__2 : rule__Schedule__Group__2__Impl rule__Schedule__Group__3 ;
    public final void rule__Schedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:911:1: ( rule__Schedule__Group__2__Impl rule__Schedule__Group__3 )
            // InternalMenetrend.g:912:2: rule__Schedule__Group__2__Impl rule__Schedule__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Schedule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__2"


    // $ANTLR start "rule__Schedule__Group__2__Impl"
    // InternalMenetrend.g:919:1: rule__Schedule__Group__2__Impl : ( ':' ) ;
    public final void rule__Schedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:923:1: ( ( ':' ) )
            // InternalMenetrend.g:924:1: ( ':' )
            {
            // InternalMenetrend.g:924:1: ( ':' )
            // InternalMenetrend.g:925:2: ':'
            {
             before(grammarAccess.getScheduleAccess().getColonKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__2__Impl"


    // $ANTLR start "rule__Schedule__Group__3"
    // InternalMenetrend.g:934:1: rule__Schedule__Group__3 : rule__Schedule__Group__3__Impl ;
    public final void rule__Schedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:938:1: ( rule__Schedule__Group__3__Impl )
            // InternalMenetrend.g:939:2: rule__Schedule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__3"


    // $ANTLR start "rule__Schedule__Group__3__Impl"
    // InternalMenetrend.g:945:1: rule__Schedule__Group__3__Impl : ( ( ( rule__Schedule__SchedulePartsAssignment_3 ) ) ( ( rule__Schedule__SchedulePartsAssignment_3 )* ) ) ;
    public final void rule__Schedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:949:1: ( ( ( ( rule__Schedule__SchedulePartsAssignment_3 ) ) ( ( rule__Schedule__SchedulePartsAssignment_3 )* ) ) )
            // InternalMenetrend.g:950:1: ( ( ( rule__Schedule__SchedulePartsAssignment_3 ) ) ( ( rule__Schedule__SchedulePartsAssignment_3 )* ) )
            {
            // InternalMenetrend.g:950:1: ( ( ( rule__Schedule__SchedulePartsAssignment_3 ) ) ( ( rule__Schedule__SchedulePartsAssignment_3 )* ) )
            // InternalMenetrend.g:951:2: ( ( rule__Schedule__SchedulePartsAssignment_3 ) ) ( ( rule__Schedule__SchedulePartsAssignment_3 )* )
            {
            // InternalMenetrend.g:951:2: ( ( rule__Schedule__SchedulePartsAssignment_3 ) )
            // InternalMenetrend.g:952:3: ( rule__Schedule__SchedulePartsAssignment_3 )
            {
             before(grammarAccess.getScheduleAccess().getSchedulePartsAssignment_3()); 
            // InternalMenetrend.g:953:3: ( rule__Schedule__SchedulePartsAssignment_3 )
            // InternalMenetrend.g:953:4: rule__Schedule__SchedulePartsAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Schedule__SchedulePartsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getSchedulePartsAssignment_3()); 

            }

            // InternalMenetrend.g:956:2: ( ( rule__Schedule__SchedulePartsAssignment_3 )* )
            // InternalMenetrend.g:957:3: ( rule__Schedule__SchedulePartsAssignment_3 )*
            {
             before(grammarAccess.getScheduleAccess().getSchedulePartsAssignment_3()); 
            // InternalMenetrend.g:958:3: ( rule__Schedule__SchedulePartsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||(LA9_0>=25 && LA9_0<=33)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMenetrend.g:958:4: rule__Schedule__SchedulePartsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Schedule__SchedulePartsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getScheduleAccess().getSchedulePartsAssignment_3()); 

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
    // $ANTLR end "rule__Schedule__Group__3__Impl"


    // $ANTLR start "rule__LineNumber__Group__0"
    // InternalMenetrend.g:968:1: rule__LineNumber__Group__0 : rule__LineNumber__Group__0__Impl rule__LineNumber__Group__1 ;
    public final void rule__LineNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:972:1: ( rule__LineNumber__Group__0__Impl rule__LineNumber__Group__1 )
            // InternalMenetrend.g:973:2: rule__LineNumber__Group__0__Impl rule__LineNumber__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LineNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineNumber__Group__0"


    // $ANTLR start "rule__LineNumber__Group__0__Impl"
    // InternalMenetrend.g:980:1: rule__LineNumber__Group__0__Impl : ( ( rule__LineNumber__TypeAssignment_0 ) ) ;
    public final void rule__LineNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:984:1: ( ( ( rule__LineNumber__TypeAssignment_0 ) ) )
            // InternalMenetrend.g:985:1: ( ( rule__LineNumber__TypeAssignment_0 ) )
            {
            // InternalMenetrend.g:985:1: ( ( rule__LineNumber__TypeAssignment_0 ) )
            // InternalMenetrend.g:986:2: ( rule__LineNumber__TypeAssignment_0 )
            {
             before(grammarAccess.getLineNumberAccess().getTypeAssignment_0()); 
            // InternalMenetrend.g:987:2: ( rule__LineNumber__TypeAssignment_0 )
            // InternalMenetrend.g:987:3: rule__LineNumber__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LineNumber__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLineNumberAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineNumber__Group__0__Impl"


    // $ANTLR start "rule__LineNumber__Group__1"
    // InternalMenetrend.g:995:1: rule__LineNumber__Group__1 : rule__LineNumber__Group__1__Impl rule__LineNumber__Group__2 ;
    public final void rule__LineNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:999:1: ( rule__LineNumber__Group__1__Impl rule__LineNumber__Group__2 )
            // InternalMenetrend.g:1000:2: rule__LineNumber__Group__1__Impl rule__LineNumber__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__LineNumber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineNumber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineNumber__Group__1"


    // $ANTLR start "rule__LineNumber__Group__1__Impl"
    // InternalMenetrend.g:1007:1: rule__LineNumber__Group__1__Impl : ( '-' ) ;
    public final void rule__LineNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1011:1: ( ( '-' ) )
            // InternalMenetrend.g:1012:1: ( '-' )
            {
            // InternalMenetrend.g:1012:1: ( '-' )
            // InternalMenetrend.g:1013:2: '-'
            {
             before(grammarAccess.getLineNumberAccess().getHyphenMinusKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLineNumberAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineNumber__Group__1__Impl"


    // $ANTLR start "rule__LineNumber__Group__2"
    // InternalMenetrend.g:1022:1: rule__LineNumber__Group__2 : rule__LineNumber__Group__2__Impl ;
    public final void rule__LineNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1026:1: ( rule__LineNumber__Group__2__Impl )
            // InternalMenetrend.g:1027:2: rule__LineNumber__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineNumber__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineNumber__Group__2"


    // $ANTLR start "rule__LineNumber__Group__2__Impl"
    // InternalMenetrend.g:1033:1: rule__LineNumber__Group__2__Impl : ( ( rule__LineNumber__NumberAssignment_2 ) ) ;
    public final void rule__LineNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1037:1: ( ( ( rule__LineNumber__NumberAssignment_2 ) ) )
            // InternalMenetrend.g:1038:1: ( ( rule__LineNumber__NumberAssignment_2 ) )
            {
            // InternalMenetrend.g:1038:1: ( ( rule__LineNumber__NumberAssignment_2 ) )
            // InternalMenetrend.g:1039:2: ( rule__LineNumber__NumberAssignment_2 )
            {
             before(grammarAccess.getLineNumberAccess().getNumberAssignment_2()); 
            // InternalMenetrend.g:1040:2: ( rule__LineNumber__NumberAssignment_2 )
            // InternalMenetrend.g:1040:3: rule__LineNumber__NumberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LineNumber__NumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineNumberAccess().getNumberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineNumber__Group__2__Impl"


    // $ANTLR start "rule__RelativeSchedule__Group__0"
    // InternalMenetrend.g:1049:1: rule__RelativeSchedule__Group__0 : rule__RelativeSchedule__Group__0__Impl rule__RelativeSchedule__Group__1 ;
    public final void rule__RelativeSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1053:1: ( rule__RelativeSchedule__Group__0__Impl rule__RelativeSchedule__Group__1 )
            // InternalMenetrend.g:1054:2: rule__RelativeSchedule__Group__0__Impl rule__RelativeSchedule__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RelativeSchedule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeSchedule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeSchedule__Group__0"


    // $ANTLR start "rule__RelativeSchedule__Group__0__Impl"
    // InternalMenetrend.g:1061:1: rule__RelativeSchedule__Group__0__Impl : ( ( rule__RelativeSchedule__StartAssignment_0 ) ) ;
    public final void rule__RelativeSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1065:1: ( ( ( rule__RelativeSchedule__StartAssignment_0 ) ) )
            // InternalMenetrend.g:1066:1: ( ( rule__RelativeSchedule__StartAssignment_0 ) )
            {
            // InternalMenetrend.g:1066:1: ( ( rule__RelativeSchedule__StartAssignment_0 ) )
            // InternalMenetrend.g:1067:2: ( rule__RelativeSchedule__StartAssignment_0 )
            {
             before(grammarAccess.getRelativeScheduleAccess().getStartAssignment_0()); 
            // InternalMenetrend.g:1068:2: ( rule__RelativeSchedule__StartAssignment_0 )
            // InternalMenetrend.g:1068:3: rule__RelativeSchedule__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RelativeSchedule__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeScheduleAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeSchedule__Group__0__Impl"


    // $ANTLR start "rule__RelativeSchedule__Group__1"
    // InternalMenetrend.g:1076:1: rule__RelativeSchedule__Group__1 : rule__RelativeSchedule__Group__1__Impl ;
    public final void rule__RelativeSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1080:1: ( rule__RelativeSchedule__Group__1__Impl )
            // InternalMenetrend.g:1081:2: rule__RelativeSchedule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeSchedule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeSchedule__Group__1"


    // $ANTLR start "rule__RelativeSchedule__Group__1__Impl"
    // InternalMenetrend.g:1087:1: rule__RelativeSchedule__Group__1__Impl : ( ( ( rule__RelativeSchedule__TargetsAssignment_1 ) ) ( ( rule__RelativeSchedule__TargetsAssignment_1 )* ) ) ;
    public final void rule__RelativeSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1091:1: ( ( ( ( rule__RelativeSchedule__TargetsAssignment_1 ) ) ( ( rule__RelativeSchedule__TargetsAssignment_1 )* ) ) )
            // InternalMenetrend.g:1092:1: ( ( ( rule__RelativeSchedule__TargetsAssignment_1 ) ) ( ( rule__RelativeSchedule__TargetsAssignment_1 )* ) )
            {
            // InternalMenetrend.g:1092:1: ( ( ( rule__RelativeSchedule__TargetsAssignment_1 ) ) ( ( rule__RelativeSchedule__TargetsAssignment_1 )* ) )
            // InternalMenetrend.g:1093:2: ( ( rule__RelativeSchedule__TargetsAssignment_1 ) ) ( ( rule__RelativeSchedule__TargetsAssignment_1 )* )
            {
            // InternalMenetrend.g:1093:2: ( ( rule__RelativeSchedule__TargetsAssignment_1 ) )
            // InternalMenetrend.g:1094:3: ( rule__RelativeSchedule__TargetsAssignment_1 )
            {
             before(grammarAccess.getRelativeScheduleAccess().getTargetsAssignment_1()); 
            // InternalMenetrend.g:1095:3: ( rule__RelativeSchedule__TargetsAssignment_1 )
            // InternalMenetrend.g:1095:4: rule__RelativeSchedule__TargetsAssignment_1
            {
            pushFollow(FOLLOW_15);
            rule__RelativeSchedule__TargetsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeScheduleAccess().getTargetsAssignment_1()); 

            }

            // InternalMenetrend.g:1098:2: ( ( rule__RelativeSchedule__TargetsAssignment_1 )* )
            // InternalMenetrend.g:1099:3: ( rule__RelativeSchedule__TargetsAssignment_1 )*
            {
             before(grammarAccess.getRelativeScheduleAccess().getTargetsAssignment_1()); 
            // InternalMenetrend.g:1100:3: ( rule__RelativeSchedule__TargetsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMenetrend.g:1100:4: rule__RelativeSchedule__TargetsAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RelativeSchedule__TargetsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRelativeScheduleAccess().getTargetsAssignment_1()); 

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
    // $ANTLR end "rule__RelativeSchedule__Group__1__Impl"


    // $ANTLR start "rule__RelativeTarget__Group__0"
    // InternalMenetrend.g:1110:1: rule__RelativeTarget__Group__0 : rule__RelativeTarget__Group__0__Impl rule__RelativeTarget__Group__1 ;
    public final void rule__RelativeTarget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1114:1: ( rule__RelativeTarget__Group__0__Impl rule__RelativeTarget__Group__1 )
            // InternalMenetrend.g:1115:2: rule__RelativeTarget__Group__0__Impl rule__RelativeTarget__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RelativeTarget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeTarget__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeTarget__Group__0"


    // $ANTLR start "rule__RelativeTarget__Group__0__Impl"
    // InternalMenetrend.g:1122:1: rule__RelativeTarget__Group__0__Impl : ( '-[' ) ;
    public final void rule__RelativeTarget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1126:1: ( ( '-[' ) )
            // InternalMenetrend.g:1127:1: ( '-[' )
            {
            // InternalMenetrend.g:1127:1: ( '-[' )
            // InternalMenetrend.g:1128:2: '-['
            {
             before(grammarAccess.getRelativeTargetAccess().getHyphenMinusLeftSquareBracketKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRelativeTargetAccess().getHyphenMinusLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeTarget__Group__0__Impl"


    // $ANTLR start "rule__RelativeTarget__Group__1"
    // InternalMenetrend.g:1137:1: rule__RelativeTarget__Group__1 : rule__RelativeTarget__Group__1__Impl rule__RelativeTarget__Group__2 ;
    public final void rule__RelativeTarget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1141:1: ( rule__RelativeTarget__Group__1__Impl rule__RelativeTarget__Group__2 )
            // InternalMenetrend.g:1142:2: rule__RelativeTarget__Group__1__Impl rule__RelativeTarget__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RelativeTarget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeTarget__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeTarget__Group__1"


    // $ANTLR start "rule__RelativeTarget__Group__1__Impl"
    // InternalMenetrend.g:1149:1: rule__RelativeTarget__Group__1__Impl : ( ( rule__RelativeTarget__LengthAssignment_1 ) ) ;
    public final void rule__RelativeTarget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1153:1: ( ( ( rule__RelativeTarget__LengthAssignment_1 ) ) )
            // InternalMenetrend.g:1154:1: ( ( rule__RelativeTarget__LengthAssignment_1 ) )
            {
            // InternalMenetrend.g:1154:1: ( ( rule__RelativeTarget__LengthAssignment_1 ) )
            // InternalMenetrend.g:1155:2: ( rule__RelativeTarget__LengthAssignment_1 )
            {
             before(grammarAccess.getRelativeTargetAccess().getLengthAssignment_1()); 
            // InternalMenetrend.g:1156:2: ( rule__RelativeTarget__LengthAssignment_1 )
            // InternalMenetrend.g:1156:3: rule__RelativeTarget__LengthAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeTarget__LengthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeTargetAccess().getLengthAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeTarget__Group__1__Impl"


    // $ANTLR start "rule__RelativeTarget__Group__2"
    // InternalMenetrend.g:1164:1: rule__RelativeTarget__Group__2 : rule__RelativeTarget__Group__2__Impl rule__RelativeTarget__Group__3 ;
    public final void rule__RelativeTarget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1168:1: ( rule__RelativeTarget__Group__2__Impl rule__RelativeTarget__Group__3 )
            // InternalMenetrend.g:1169:2: rule__RelativeTarget__Group__2__Impl rule__RelativeTarget__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__RelativeTarget__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeTarget__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeTarget__Group__2"


    // $ANTLR start "rule__RelativeTarget__Group__2__Impl"
    // InternalMenetrend.g:1176:1: rule__RelativeTarget__Group__2__Impl : ( ']->' ) ;
    public final void rule__RelativeTarget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1180:1: ( ( ']->' ) )
            // InternalMenetrend.g:1181:1: ( ']->' )
            {
            // InternalMenetrend.g:1181:1: ( ']->' )
            // InternalMenetrend.g:1182:2: ']->'
            {
             before(grammarAccess.getRelativeTargetAccess().getRightSquareBracketHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRelativeTargetAccess().getRightSquareBracketHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeTarget__Group__2__Impl"


    // $ANTLR start "rule__RelativeTarget__Group__3"
    // InternalMenetrend.g:1191:1: rule__RelativeTarget__Group__3 : rule__RelativeTarget__Group__3__Impl ;
    public final void rule__RelativeTarget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1195:1: ( rule__RelativeTarget__Group__3__Impl )
            // InternalMenetrend.g:1196:2: rule__RelativeTarget__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeTarget__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeTarget__Group__3"


    // $ANTLR start "rule__RelativeTarget__Group__3__Impl"
    // InternalMenetrend.g:1202:1: rule__RelativeTarget__Group__3__Impl : ( ( rule__RelativeTarget__TargetAssignment_3 ) ) ;
    public final void rule__RelativeTarget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1206:1: ( ( ( rule__RelativeTarget__TargetAssignment_3 ) ) )
            // InternalMenetrend.g:1207:1: ( ( rule__RelativeTarget__TargetAssignment_3 ) )
            {
            // InternalMenetrend.g:1207:1: ( ( rule__RelativeTarget__TargetAssignment_3 ) )
            // InternalMenetrend.g:1208:2: ( rule__RelativeTarget__TargetAssignment_3 )
            {
             before(grammarAccess.getRelativeTargetAccess().getTargetAssignment_3()); 
            // InternalMenetrend.g:1209:2: ( rule__RelativeTarget__TargetAssignment_3 )
            // InternalMenetrend.g:1209:3: rule__RelativeTarget__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RelativeTarget__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelativeTargetAccess().getTargetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeTarget__Group__3__Impl"


    // $ANTLR start "rule__AbsoluteSchedule__Group__0"
    // InternalMenetrend.g:1218:1: rule__AbsoluteSchedule__Group__0 : rule__AbsoluteSchedule__Group__0__Impl rule__AbsoluteSchedule__Group__1 ;
    public final void rule__AbsoluteSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1222:1: ( rule__AbsoluteSchedule__Group__0__Impl rule__AbsoluteSchedule__Group__1 )
            // InternalMenetrend.g:1223:2: rule__AbsoluteSchedule__Group__0__Impl rule__AbsoluteSchedule__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__AbsoluteSchedule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbsoluteSchedule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__Group__0"


    // $ANTLR start "rule__AbsoluteSchedule__Group__0__Impl"
    // InternalMenetrend.g:1230:1: rule__AbsoluteSchedule__Group__0__Impl : ( ( rule__AbsoluteSchedule__DaytypeAssignment_0 ) ) ;
    public final void rule__AbsoluteSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1234:1: ( ( ( rule__AbsoluteSchedule__DaytypeAssignment_0 ) ) )
            // InternalMenetrend.g:1235:1: ( ( rule__AbsoluteSchedule__DaytypeAssignment_0 ) )
            {
            // InternalMenetrend.g:1235:1: ( ( rule__AbsoluteSchedule__DaytypeAssignment_0 ) )
            // InternalMenetrend.g:1236:2: ( rule__AbsoluteSchedule__DaytypeAssignment_0 )
            {
             before(grammarAccess.getAbsoluteScheduleAccess().getDaytypeAssignment_0()); 
            // InternalMenetrend.g:1237:2: ( rule__AbsoluteSchedule__DaytypeAssignment_0 )
            // InternalMenetrend.g:1237:3: rule__AbsoluteSchedule__DaytypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteSchedule__DaytypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteScheduleAccess().getDaytypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__Group__0__Impl"


    // $ANTLR start "rule__AbsoluteSchedule__Group__1"
    // InternalMenetrend.g:1245:1: rule__AbsoluteSchedule__Group__1 : rule__AbsoluteSchedule__Group__1__Impl rule__AbsoluteSchedule__Group__2 ;
    public final void rule__AbsoluteSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1249:1: ( rule__AbsoluteSchedule__Group__1__Impl rule__AbsoluteSchedule__Group__2 )
            // InternalMenetrend.g:1250:2: rule__AbsoluteSchedule__Group__1__Impl rule__AbsoluteSchedule__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__AbsoluteSchedule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbsoluteSchedule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__Group__1"


    // $ANTLR start "rule__AbsoluteSchedule__Group__1__Impl"
    // InternalMenetrend.g:1257:1: rule__AbsoluteSchedule__Group__1__Impl : ( ( rule__AbsoluteSchedule__DeparturesAssignment_1 ) ) ;
    public final void rule__AbsoluteSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1261:1: ( ( ( rule__AbsoluteSchedule__DeparturesAssignment_1 ) ) )
            // InternalMenetrend.g:1262:1: ( ( rule__AbsoluteSchedule__DeparturesAssignment_1 ) )
            {
            // InternalMenetrend.g:1262:1: ( ( rule__AbsoluteSchedule__DeparturesAssignment_1 ) )
            // InternalMenetrend.g:1263:2: ( rule__AbsoluteSchedule__DeparturesAssignment_1 )
            {
             before(grammarAccess.getAbsoluteScheduleAccess().getDeparturesAssignment_1()); 
            // InternalMenetrend.g:1264:2: ( rule__AbsoluteSchedule__DeparturesAssignment_1 )
            // InternalMenetrend.g:1264:3: rule__AbsoluteSchedule__DeparturesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteSchedule__DeparturesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteScheduleAccess().getDeparturesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__Group__1__Impl"


    // $ANTLR start "rule__AbsoluteSchedule__Group__2"
    // InternalMenetrend.g:1272:1: rule__AbsoluteSchedule__Group__2 : rule__AbsoluteSchedule__Group__2__Impl ;
    public final void rule__AbsoluteSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1276:1: ( rule__AbsoluteSchedule__Group__2__Impl )
            // InternalMenetrend.g:1277:2: rule__AbsoluteSchedule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteSchedule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__Group__2"


    // $ANTLR start "rule__AbsoluteSchedule__Group__2__Impl"
    // InternalMenetrend.g:1283:1: rule__AbsoluteSchedule__Group__2__Impl : ( ( rule__AbsoluteSchedule__Group_2__0 )* ) ;
    public final void rule__AbsoluteSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1287:1: ( ( ( rule__AbsoluteSchedule__Group_2__0 )* ) )
            // InternalMenetrend.g:1288:1: ( ( rule__AbsoluteSchedule__Group_2__0 )* )
            {
            // InternalMenetrend.g:1288:1: ( ( rule__AbsoluteSchedule__Group_2__0 )* )
            // InternalMenetrend.g:1289:2: ( rule__AbsoluteSchedule__Group_2__0 )*
            {
             before(grammarAccess.getAbsoluteScheduleAccess().getGroup_2()); 
            // InternalMenetrend.g:1290:2: ( rule__AbsoluteSchedule__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=18 && LA11_0<=19)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMenetrend.g:1290:3: rule__AbsoluteSchedule__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__AbsoluteSchedule__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAbsoluteScheduleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__Group__2__Impl"


    // $ANTLR start "rule__AbsoluteSchedule__Group_2__0"
    // InternalMenetrend.g:1299:1: rule__AbsoluteSchedule__Group_2__0 : rule__AbsoluteSchedule__Group_2__0__Impl rule__AbsoluteSchedule__Group_2__1 ;
    public final void rule__AbsoluteSchedule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1303:1: ( rule__AbsoluteSchedule__Group_2__0__Impl rule__AbsoluteSchedule__Group_2__1 )
            // InternalMenetrend.g:1304:2: rule__AbsoluteSchedule__Group_2__0__Impl rule__AbsoluteSchedule__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__AbsoluteSchedule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbsoluteSchedule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__Group_2__0"


    // $ANTLR start "rule__AbsoluteSchedule__Group_2__0__Impl"
    // InternalMenetrend.g:1311:1: rule__AbsoluteSchedule__Group_2__0__Impl : ( ( rule__AbsoluteSchedule__Alternatives_2_0 ) ) ;
    public final void rule__AbsoluteSchedule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1315:1: ( ( ( rule__AbsoluteSchedule__Alternatives_2_0 ) ) )
            // InternalMenetrend.g:1316:1: ( ( rule__AbsoluteSchedule__Alternatives_2_0 ) )
            {
            // InternalMenetrend.g:1316:1: ( ( rule__AbsoluteSchedule__Alternatives_2_0 ) )
            // InternalMenetrend.g:1317:2: ( rule__AbsoluteSchedule__Alternatives_2_0 )
            {
             before(grammarAccess.getAbsoluteScheduleAccess().getAlternatives_2_0()); 
            // InternalMenetrend.g:1318:2: ( rule__AbsoluteSchedule__Alternatives_2_0 )
            // InternalMenetrend.g:1318:3: rule__AbsoluteSchedule__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteSchedule__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteScheduleAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__Group_2__0__Impl"


    // $ANTLR start "rule__AbsoluteSchedule__Group_2__1"
    // InternalMenetrend.g:1326:1: rule__AbsoluteSchedule__Group_2__1 : rule__AbsoluteSchedule__Group_2__1__Impl ;
    public final void rule__AbsoluteSchedule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1330:1: ( rule__AbsoluteSchedule__Group_2__1__Impl )
            // InternalMenetrend.g:1331:2: rule__AbsoluteSchedule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteSchedule__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__Group_2__1"


    // $ANTLR start "rule__AbsoluteSchedule__Group_2__1__Impl"
    // InternalMenetrend.g:1337:1: rule__AbsoluteSchedule__Group_2__1__Impl : ( ( rule__AbsoluteSchedule__DeparturesAssignment_2_1 ) ) ;
    public final void rule__AbsoluteSchedule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1341:1: ( ( ( rule__AbsoluteSchedule__DeparturesAssignment_2_1 ) ) )
            // InternalMenetrend.g:1342:1: ( ( rule__AbsoluteSchedule__DeparturesAssignment_2_1 ) )
            {
            // InternalMenetrend.g:1342:1: ( ( rule__AbsoluteSchedule__DeparturesAssignment_2_1 ) )
            // InternalMenetrend.g:1343:2: ( rule__AbsoluteSchedule__DeparturesAssignment_2_1 )
            {
             before(grammarAccess.getAbsoluteScheduleAccess().getDeparturesAssignment_2_1()); 
            // InternalMenetrend.g:1344:2: ( rule__AbsoluteSchedule__DeparturesAssignment_2_1 )
            // InternalMenetrend.g:1344:3: rule__AbsoluteSchedule__DeparturesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteSchedule__DeparturesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteScheduleAccess().getDeparturesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__Group_2__1__Impl"


    // $ANTLR start "rule__ComplexTimeMiddle__Group__0"
    // InternalMenetrend.g:1353:1: rule__ComplexTimeMiddle__Group__0 : rule__ComplexTimeMiddle__Group__0__Impl rule__ComplexTimeMiddle__Group__1 ;
    public final void rule__ComplexTimeMiddle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1357:1: ( rule__ComplexTimeMiddle__Group__0__Impl rule__ComplexTimeMiddle__Group__1 )
            // InternalMenetrend.g:1358:2: rule__ComplexTimeMiddle__Group__0__Impl rule__ComplexTimeMiddle__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ComplexTimeMiddle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTimeMiddle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__Group__0"


    // $ANTLR start "rule__ComplexTimeMiddle__Group__0__Impl"
    // InternalMenetrend.g:1365:1: rule__ComplexTimeMiddle__Group__0__Impl : ( ( rule__ComplexTimeMiddle__FromAssignment_0 ) ) ;
    public final void rule__ComplexTimeMiddle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1369:1: ( ( ( rule__ComplexTimeMiddle__FromAssignment_0 ) ) )
            // InternalMenetrend.g:1370:1: ( ( rule__ComplexTimeMiddle__FromAssignment_0 ) )
            {
            // InternalMenetrend.g:1370:1: ( ( rule__ComplexTimeMiddle__FromAssignment_0 ) )
            // InternalMenetrend.g:1371:2: ( rule__ComplexTimeMiddle__FromAssignment_0 )
            {
             before(grammarAccess.getComplexTimeMiddleAccess().getFromAssignment_0()); 
            // InternalMenetrend.g:1372:2: ( rule__ComplexTimeMiddle__FromAssignment_0 )
            // InternalMenetrend.g:1372:3: rule__ComplexTimeMiddle__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTimeMiddle__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTimeMiddleAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__Group__0__Impl"


    // $ANTLR start "rule__ComplexTimeMiddle__Group__1"
    // InternalMenetrend.g:1380:1: rule__ComplexTimeMiddle__Group__1 : rule__ComplexTimeMiddle__Group__1__Impl rule__ComplexTimeMiddle__Group__2 ;
    public final void rule__ComplexTimeMiddle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1384:1: ( rule__ComplexTimeMiddle__Group__1__Impl rule__ComplexTimeMiddle__Group__2 )
            // InternalMenetrend.g:1385:2: rule__ComplexTimeMiddle__Group__1__Impl rule__ComplexTimeMiddle__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ComplexTimeMiddle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTimeMiddle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__Group__1"


    // $ANTLR start "rule__ComplexTimeMiddle__Group__1__Impl"
    // InternalMenetrend.g:1392:1: rule__ComplexTimeMiddle__Group__1__Impl : ( '-' ) ;
    public final void rule__ComplexTimeMiddle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1396:1: ( ( '-' ) )
            // InternalMenetrend.g:1397:1: ( '-' )
            {
            // InternalMenetrend.g:1397:1: ( '-' )
            // InternalMenetrend.g:1398:2: '-'
            {
             before(grammarAccess.getComplexTimeMiddleAccess().getHyphenMinusKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComplexTimeMiddleAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__Group__1__Impl"


    // $ANTLR start "rule__ComplexTimeMiddle__Group__2"
    // InternalMenetrend.g:1407:1: rule__ComplexTimeMiddle__Group__2 : rule__ComplexTimeMiddle__Group__2__Impl rule__ComplexTimeMiddle__Group__3 ;
    public final void rule__ComplexTimeMiddle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1411:1: ( rule__ComplexTimeMiddle__Group__2__Impl rule__ComplexTimeMiddle__Group__3 )
            // InternalMenetrend.g:1412:2: rule__ComplexTimeMiddle__Group__2__Impl rule__ComplexTimeMiddle__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ComplexTimeMiddle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTimeMiddle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__Group__2"


    // $ANTLR start "rule__ComplexTimeMiddle__Group__2__Impl"
    // InternalMenetrend.g:1419:1: rule__ComplexTimeMiddle__Group__2__Impl : ( ( rule__ComplexTimeMiddle__UntilAssignment_2 ) ) ;
    public final void rule__ComplexTimeMiddle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1423:1: ( ( ( rule__ComplexTimeMiddle__UntilAssignment_2 ) ) )
            // InternalMenetrend.g:1424:1: ( ( rule__ComplexTimeMiddle__UntilAssignment_2 ) )
            {
            // InternalMenetrend.g:1424:1: ( ( rule__ComplexTimeMiddle__UntilAssignment_2 ) )
            // InternalMenetrend.g:1425:2: ( rule__ComplexTimeMiddle__UntilAssignment_2 )
            {
             before(grammarAccess.getComplexTimeMiddleAccess().getUntilAssignment_2()); 
            // InternalMenetrend.g:1426:2: ( rule__ComplexTimeMiddle__UntilAssignment_2 )
            // InternalMenetrend.g:1426:3: rule__ComplexTimeMiddle__UntilAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTimeMiddle__UntilAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexTimeMiddleAccess().getUntilAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__Group__2__Impl"


    // $ANTLR start "rule__ComplexTimeMiddle__Group__3"
    // InternalMenetrend.g:1434:1: rule__ComplexTimeMiddle__Group__3 : rule__ComplexTimeMiddle__Group__3__Impl rule__ComplexTimeMiddle__Group__4 ;
    public final void rule__ComplexTimeMiddle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1438:1: ( rule__ComplexTimeMiddle__Group__3__Impl rule__ComplexTimeMiddle__Group__4 )
            // InternalMenetrend.g:1439:2: rule__ComplexTimeMiddle__Group__3__Impl rule__ComplexTimeMiddle__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ComplexTimeMiddle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTimeMiddle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__Group__3"


    // $ANTLR start "rule__ComplexTimeMiddle__Group__3__Impl"
    // InternalMenetrend.g:1446:1: rule__ComplexTimeMiddle__Group__3__Impl : ( '/' ) ;
    public final void rule__ComplexTimeMiddle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1450:1: ( ( '/' ) )
            // InternalMenetrend.g:1451:1: ( '/' )
            {
            // InternalMenetrend.g:1451:1: ( '/' )
            // InternalMenetrend.g:1452:2: '/'
            {
             before(grammarAccess.getComplexTimeMiddleAccess().getSolidusKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComplexTimeMiddleAccess().getSolidusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__Group__3__Impl"


    // $ANTLR start "rule__ComplexTimeMiddle__Group__4"
    // InternalMenetrend.g:1461:1: rule__ComplexTimeMiddle__Group__4 : rule__ComplexTimeMiddle__Group__4__Impl ;
    public final void rule__ComplexTimeMiddle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1465:1: ( rule__ComplexTimeMiddle__Group__4__Impl )
            // InternalMenetrend.g:1466:2: rule__ComplexTimeMiddle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTimeMiddle__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__Group__4"


    // $ANTLR start "rule__ComplexTimeMiddle__Group__4__Impl"
    // InternalMenetrend.g:1472:1: rule__ComplexTimeMiddle__Group__4__Impl : ( ( rule__ComplexTimeMiddle__FrequencyAssignment_4 ) ) ;
    public final void rule__ComplexTimeMiddle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1476:1: ( ( ( rule__ComplexTimeMiddle__FrequencyAssignment_4 ) ) )
            // InternalMenetrend.g:1477:1: ( ( rule__ComplexTimeMiddle__FrequencyAssignment_4 ) )
            {
            // InternalMenetrend.g:1477:1: ( ( rule__ComplexTimeMiddle__FrequencyAssignment_4 ) )
            // InternalMenetrend.g:1478:2: ( rule__ComplexTimeMiddle__FrequencyAssignment_4 )
            {
             before(grammarAccess.getComplexTimeMiddleAccess().getFrequencyAssignment_4()); 
            // InternalMenetrend.g:1479:2: ( rule__ComplexTimeMiddle__FrequencyAssignment_4 )
            // InternalMenetrend.g:1479:3: rule__ComplexTimeMiddle__FrequencyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTimeMiddle__FrequencyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComplexTimeMiddleAccess().getFrequencyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__Group__4__Impl"


    // $ANTLR start "rule__ComplexTimeEnd__Group__0"
    // InternalMenetrend.g:1488:1: rule__ComplexTimeEnd__Group__0 : rule__ComplexTimeEnd__Group__0__Impl rule__ComplexTimeEnd__Group__1 ;
    public final void rule__ComplexTimeEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1492:1: ( rule__ComplexTimeEnd__Group__0__Impl rule__ComplexTimeEnd__Group__1 )
            // InternalMenetrend.g:1493:2: rule__ComplexTimeEnd__Group__0__Impl rule__ComplexTimeEnd__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ComplexTimeEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTimeEnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__Group__0"


    // $ANTLR start "rule__ComplexTimeEnd__Group__0__Impl"
    // InternalMenetrend.g:1500:1: rule__ComplexTimeEnd__Group__0__Impl : ( ( rule__ComplexTimeEnd__FromAssignment_0 ) ) ;
    public final void rule__ComplexTimeEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1504:1: ( ( ( rule__ComplexTimeEnd__FromAssignment_0 ) ) )
            // InternalMenetrend.g:1505:1: ( ( rule__ComplexTimeEnd__FromAssignment_0 ) )
            {
            // InternalMenetrend.g:1505:1: ( ( rule__ComplexTimeEnd__FromAssignment_0 ) )
            // InternalMenetrend.g:1506:2: ( rule__ComplexTimeEnd__FromAssignment_0 )
            {
             before(grammarAccess.getComplexTimeEndAccess().getFromAssignment_0()); 
            // InternalMenetrend.g:1507:2: ( rule__ComplexTimeEnd__FromAssignment_0 )
            // InternalMenetrend.g:1507:3: rule__ComplexTimeEnd__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTimeEnd__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTimeEndAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__Group__0__Impl"


    // $ANTLR start "rule__ComplexTimeEnd__Group__1"
    // InternalMenetrend.g:1515:1: rule__ComplexTimeEnd__Group__1 : rule__ComplexTimeEnd__Group__1__Impl rule__ComplexTimeEnd__Group__2 ;
    public final void rule__ComplexTimeEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1519:1: ( rule__ComplexTimeEnd__Group__1__Impl rule__ComplexTimeEnd__Group__2 )
            // InternalMenetrend.g:1520:2: rule__ComplexTimeEnd__Group__1__Impl rule__ComplexTimeEnd__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ComplexTimeEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTimeEnd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__Group__1"


    // $ANTLR start "rule__ComplexTimeEnd__Group__1__Impl"
    // InternalMenetrend.g:1527:1: rule__ComplexTimeEnd__Group__1__Impl : ( '/' ) ;
    public final void rule__ComplexTimeEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1531:1: ( ( '/' ) )
            // InternalMenetrend.g:1532:1: ( '/' )
            {
            // InternalMenetrend.g:1532:1: ( '/' )
            // InternalMenetrend.g:1533:2: '/'
            {
             before(grammarAccess.getComplexTimeEndAccess().getSolidusKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComplexTimeEndAccess().getSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__Group__1__Impl"


    // $ANTLR start "rule__ComplexTimeEnd__Group__2"
    // InternalMenetrend.g:1542:1: rule__ComplexTimeEnd__Group__2 : rule__ComplexTimeEnd__Group__2__Impl rule__ComplexTimeEnd__Group__3 ;
    public final void rule__ComplexTimeEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1546:1: ( rule__ComplexTimeEnd__Group__2__Impl rule__ComplexTimeEnd__Group__3 )
            // InternalMenetrend.g:1547:2: rule__ComplexTimeEnd__Group__2__Impl rule__ComplexTimeEnd__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ComplexTimeEnd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTimeEnd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__Group__2"


    // $ANTLR start "rule__ComplexTimeEnd__Group__2__Impl"
    // InternalMenetrend.g:1554:1: rule__ComplexTimeEnd__Group__2__Impl : ( ( rule__ComplexTimeEnd__FrequencyAssignment_2 ) ) ;
    public final void rule__ComplexTimeEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1558:1: ( ( ( rule__ComplexTimeEnd__FrequencyAssignment_2 ) ) )
            // InternalMenetrend.g:1559:1: ( ( rule__ComplexTimeEnd__FrequencyAssignment_2 ) )
            {
            // InternalMenetrend.g:1559:1: ( ( rule__ComplexTimeEnd__FrequencyAssignment_2 ) )
            // InternalMenetrend.g:1560:2: ( rule__ComplexTimeEnd__FrequencyAssignment_2 )
            {
             before(grammarAccess.getComplexTimeEndAccess().getFrequencyAssignment_2()); 
            // InternalMenetrend.g:1561:2: ( rule__ComplexTimeEnd__FrequencyAssignment_2 )
            // InternalMenetrend.g:1561:3: rule__ComplexTimeEnd__FrequencyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTimeEnd__FrequencyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexTimeEndAccess().getFrequencyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__Group__2__Impl"


    // $ANTLR start "rule__ComplexTimeEnd__Group__3"
    // InternalMenetrend.g:1569:1: rule__ComplexTimeEnd__Group__3 : rule__ComplexTimeEnd__Group__3__Impl rule__ComplexTimeEnd__Group__4 ;
    public final void rule__ComplexTimeEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1573:1: ( rule__ComplexTimeEnd__Group__3__Impl rule__ComplexTimeEnd__Group__4 )
            // InternalMenetrend.g:1574:2: rule__ComplexTimeEnd__Group__3__Impl rule__ComplexTimeEnd__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ComplexTimeEnd__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTimeEnd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__Group__3"


    // $ANTLR start "rule__ComplexTimeEnd__Group__3__Impl"
    // InternalMenetrend.g:1581:1: rule__ComplexTimeEnd__Group__3__Impl : ( '/' ) ;
    public final void rule__ComplexTimeEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1585:1: ( ( '/' ) )
            // InternalMenetrend.g:1586:1: ( '/' )
            {
            // InternalMenetrend.g:1586:1: ( '/' )
            // InternalMenetrend.g:1587:2: '/'
            {
             before(grammarAccess.getComplexTimeEndAccess().getSolidusKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComplexTimeEndAccess().getSolidusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__Group__3__Impl"


    // $ANTLR start "rule__ComplexTimeEnd__Group__4"
    // InternalMenetrend.g:1596:1: rule__ComplexTimeEnd__Group__4 : rule__ComplexTimeEnd__Group__4__Impl ;
    public final void rule__ComplexTimeEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1600:1: ( rule__ComplexTimeEnd__Group__4__Impl )
            // InternalMenetrend.g:1601:2: rule__ComplexTimeEnd__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTimeEnd__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__Group__4"


    // $ANTLR start "rule__ComplexTimeEnd__Group__4__Impl"
    // InternalMenetrend.g:1607:1: rule__ComplexTimeEnd__Group__4__Impl : ( ( rule__ComplexTimeEnd__UntilAssignment_4 ) ) ;
    public final void rule__ComplexTimeEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1611:1: ( ( ( rule__ComplexTimeEnd__UntilAssignment_4 ) ) )
            // InternalMenetrend.g:1612:1: ( ( rule__ComplexTimeEnd__UntilAssignment_4 ) )
            {
            // InternalMenetrend.g:1612:1: ( ( rule__ComplexTimeEnd__UntilAssignment_4 ) )
            // InternalMenetrend.g:1613:2: ( rule__ComplexTimeEnd__UntilAssignment_4 )
            {
             before(grammarAccess.getComplexTimeEndAccess().getUntilAssignment_4()); 
            // InternalMenetrend.g:1614:2: ( rule__ComplexTimeEnd__UntilAssignment_4 )
            // InternalMenetrend.g:1614:3: rule__ComplexTimeEnd__UntilAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTimeEnd__UntilAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComplexTimeEndAccess().getUntilAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__Group__4__Impl"


    // $ANTLR start "rule__Model__StopsAssignment_1"
    // InternalMenetrend.g:1623:1: rule__Model__StopsAssignment_1 : ( ruleStop ) ;
    public final void rule__Model__StopsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1627:1: ( ( ruleStop ) )
            // InternalMenetrend.g:1628:2: ( ruleStop )
            {
            // InternalMenetrend.g:1628:2: ( ruleStop )
            // InternalMenetrend.g:1629:3: ruleStop
            {
             before(grammarAccess.getModelAccess().getStopsStopParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStopsStopParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StopsAssignment_1"


    // $ANTLR start "rule__Model__StopsAssignment_2_1"
    // InternalMenetrend.g:1638:1: rule__Model__StopsAssignment_2_1 : ( ruleStop ) ;
    public final void rule__Model__StopsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1642:1: ( ( ruleStop ) )
            // InternalMenetrend.g:1643:2: ( ruleStop )
            {
            // InternalMenetrend.g:1643:2: ( ruleStop )
            // InternalMenetrend.g:1644:3: ruleStop
            {
             before(grammarAccess.getModelAccess().getStopsStopParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStopsStopParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StopsAssignment_2_1"


    // $ANTLR start "rule__Model__SchedulesAssignment_4"
    // InternalMenetrend.g:1653:1: rule__Model__SchedulesAssignment_4 : ( ruleSchedule ) ;
    public final void rule__Model__SchedulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1657:1: ( ( ruleSchedule ) )
            // InternalMenetrend.g:1658:2: ( ruleSchedule )
            {
            // InternalMenetrend.g:1658:2: ( ruleSchedule )
            // InternalMenetrend.g:1659:3: ruleSchedule
            {
             before(grammarAccess.getModelAccess().getSchedulesScheduleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSchedule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSchedulesScheduleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SchedulesAssignment_4"


    // $ANTLR start "rule__Schedule__LineNumberAssignment_1"
    // InternalMenetrend.g:1668:1: rule__Schedule__LineNumberAssignment_1 : ( ruleLineNumber ) ;
    public final void rule__Schedule__LineNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1672:1: ( ( ruleLineNumber ) )
            // InternalMenetrend.g:1673:2: ( ruleLineNumber )
            {
            // InternalMenetrend.g:1673:2: ( ruleLineNumber )
            // InternalMenetrend.g:1674:3: ruleLineNumber
            {
             before(grammarAccess.getScheduleAccess().getLineNumberLineNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLineNumber();

            state._fsp--;

             after(grammarAccess.getScheduleAccess().getLineNumberLineNumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__LineNumberAssignment_1"


    // $ANTLR start "rule__Schedule__SchedulePartsAssignment_3"
    // InternalMenetrend.g:1683:1: rule__Schedule__SchedulePartsAssignment_3 : ( ruleSchedulePart ) ;
    public final void rule__Schedule__SchedulePartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1687:1: ( ( ruleSchedulePart ) )
            // InternalMenetrend.g:1688:2: ( ruleSchedulePart )
            {
            // InternalMenetrend.g:1688:2: ( ruleSchedulePart )
            // InternalMenetrend.g:1689:3: ruleSchedulePart
            {
             before(grammarAccess.getScheduleAccess().getSchedulePartsSchedulePartParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSchedulePart();

            state._fsp--;

             after(grammarAccess.getScheduleAccess().getSchedulePartsSchedulePartParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__SchedulePartsAssignment_3"


    // $ANTLR start "rule__LineNumber__TypeAssignment_0"
    // InternalMenetrend.g:1698:1: rule__LineNumber__TypeAssignment_0 : ( ruleTransportType ) ;
    public final void rule__LineNumber__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1702:1: ( ( ruleTransportType ) )
            // InternalMenetrend.g:1703:2: ( ruleTransportType )
            {
            // InternalMenetrend.g:1703:2: ( ruleTransportType )
            // InternalMenetrend.g:1704:3: ruleTransportType
            {
             before(grammarAccess.getLineNumberAccess().getTypeTransportTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTransportType();

            state._fsp--;

             after(grammarAccess.getLineNumberAccess().getTypeTransportTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineNumber__TypeAssignment_0"


    // $ANTLR start "rule__LineNumber__NumberAssignment_2"
    // InternalMenetrend.g:1713:1: rule__LineNumber__NumberAssignment_2 : ( ( rule__LineNumber__NumberAlternatives_2_0 ) ) ;
    public final void rule__LineNumber__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1717:1: ( ( ( rule__LineNumber__NumberAlternatives_2_0 ) ) )
            // InternalMenetrend.g:1718:2: ( ( rule__LineNumber__NumberAlternatives_2_0 ) )
            {
            // InternalMenetrend.g:1718:2: ( ( rule__LineNumber__NumberAlternatives_2_0 ) )
            // InternalMenetrend.g:1719:3: ( rule__LineNumber__NumberAlternatives_2_0 )
            {
             before(grammarAccess.getLineNumberAccess().getNumberAlternatives_2_0()); 
            // InternalMenetrend.g:1720:3: ( rule__LineNumber__NumberAlternatives_2_0 )
            // InternalMenetrend.g:1720:4: rule__LineNumber__NumberAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LineNumber__NumberAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLineNumberAccess().getNumberAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineNumber__NumberAssignment_2"


    // $ANTLR start "rule__RelativeSchedule__StartAssignment_0"
    // InternalMenetrend.g:1728:1: rule__RelativeSchedule__StartAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__RelativeSchedule__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1732:1: ( ( ( RULE_STRING ) ) )
            // InternalMenetrend.g:1733:2: ( ( RULE_STRING ) )
            {
            // InternalMenetrend.g:1733:2: ( ( RULE_STRING ) )
            // InternalMenetrend.g:1734:3: ( RULE_STRING )
            {
             before(grammarAccess.getRelativeScheduleAccess().getStartStopCrossReference_0_0()); 
            // InternalMenetrend.g:1735:3: ( RULE_STRING )
            // InternalMenetrend.g:1736:4: RULE_STRING
            {
             before(grammarAccess.getRelativeScheduleAccess().getStartStopSTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelativeScheduleAccess().getStartStopSTRINGTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRelativeScheduleAccess().getStartStopCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeSchedule__StartAssignment_0"


    // $ANTLR start "rule__RelativeSchedule__TargetsAssignment_1"
    // InternalMenetrend.g:1747:1: rule__RelativeSchedule__TargetsAssignment_1 : ( ruleRelativeTarget ) ;
    public final void rule__RelativeSchedule__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1751:1: ( ( ruleRelativeTarget ) )
            // InternalMenetrend.g:1752:2: ( ruleRelativeTarget )
            {
            // InternalMenetrend.g:1752:2: ( ruleRelativeTarget )
            // InternalMenetrend.g:1753:3: ruleRelativeTarget
            {
             before(grammarAccess.getRelativeScheduleAccess().getTargetsRelativeTargetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeTarget();

            state._fsp--;

             after(grammarAccess.getRelativeScheduleAccess().getTargetsRelativeTargetParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeSchedule__TargetsAssignment_1"


    // $ANTLR start "rule__RelativeTarget__LengthAssignment_1"
    // InternalMenetrend.g:1762:1: rule__RelativeTarget__LengthAssignment_1 : ( RULE_INT ) ;
    public final void rule__RelativeTarget__LengthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1766:1: ( ( RULE_INT ) )
            // InternalMenetrend.g:1767:2: ( RULE_INT )
            {
            // InternalMenetrend.g:1767:2: ( RULE_INT )
            // InternalMenetrend.g:1768:3: RULE_INT
            {
             before(grammarAccess.getRelativeTargetAccess().getLengthINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRelativeTargetAccess().getLengthINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeTarget__LengthAssignment_1"


    // $ANTLR start "rule__RelativeTarget__TargetAssignment_3"
    // InternalMenetrend.g:1777:1: rule__RelativeTarget__TargetAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__RelativeTarget__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1781:1: ( ( ( RULE_STRING ) ) )
            // InternalMenetrend.g:1782:2: ( ( RULE_STRING ) )
            {
            // InternalMenetrend.g:1782:2: ( ( RULE_STRING ) )
            // InternalMenetrend.g:1783:3: ( RULE_STRING )
            {
             before(grammarAccess.getRelativeTargetAccess().getTargetStopCrossReference_3_0()); 
            // InternalMenetrend.g:1784:3: ( RULE_STRING )
            // InternalMenetrend.g:1785:4: RULE_STRING
            {
             before(grammarAccess.getRelativeTargetAccess().getTargetStopSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelativeTargetAccess().getTargetStopSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelativeTargetAccess().getTargetStopCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeTarget__TargetAssignment_3"


    // $ANTLR start "rule__AbsoluteSchedule__DaytypeAssignment_0"
    // InternalMenetrend.g:1796:1: rule__AbsoluteSchedule__DaytypeAssignment_0 : ( ruleDayType ) ;
    public final void rule__AbsoluteSchedule__DaytypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1800:1: ( ( ruleDayType ) )
            // InternalMenetrend.g:1801:2: ( ruleDayType )
            {
            // InternalMenetrend.g:1801:2: ( ruleDayType )
            // InternalMenetrend.g:1802:3: ruleDayType
            {
             before(grammarAccess.getAbsoluteScheduleAccess().getDaytypeDayTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDayType();

            state._fsp--;

             after(grammarAccess.getAbsoluteScheduleAccess().getDaytypeDayTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__DaytypeAssignment_0"


    // $ANTLR start "rule__AbsoluteSchedule__DeparturesAssignment_1"
    // InternalMenetrend.g:1811:1: rule__AbsoluteSchedule__DeparturesAssignment_1 : ( ruleDeparture ) ;
    public final void rule__AbsoluteSchedule__DeparturesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1815:1: ( ( ruleDeparture ) )
            // InternalMenetrend.g:1816:2: ( ruleDeparture )
            {
            // InternalMenetrend.g:1816:2: ( ruleDeparture )
            // InternalMenetrend.g:1817:3: ruleDeparture
            {
             before(grammarAccess.getAbsoluteScheduleAccess().getDeparturesDepartureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeparture();

            state._fsp--;

             after(grammarAccess.getAbsoluteScheduleAccess().getDeparturesDepartureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__DeparturesAssignment_1"


    // $ANTLR start "rule__AbsoluteSchedule__DeparturesAssignment_2_1"
    // InternalMenetrend.g:1826:1: rule__AbsoluteSchedule__DeparturesAssignment_2_1 : ( ruleDeparture ) ;
    public final void rule__AbsoluteSchedule__DeparturesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1830:1: ( ( ruleDeparture ) )
            // InternalMenetrend.g:1831:2: ( ruleDeparture )
            {
            // InternalMenetrend.g:1831:2: ( ruleDeparture )
            // InternalMenetrend.g:1832:3: ruleDeparture
            {
             before(grammarAccess.getAbsoluteScheduleAccess().getDeparturesDepartureParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeparture();

            state._fsp--;

             after(grammarAccess.getAbsoluteScheduleAccess().getDeparturesDepartureParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteSchedule__DeparturesAssignment_2_1"


    // $ANTLR start "rule__SimpleTimeFormat__FromAssignment"
    // InternalMenetrend.g:1841:1: rule__SimpleTimeFormat__FromAssignment : ( RULE_TIME_FORMAT ) ;
    public final void rule__SimpleTimeFormat__FromAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1845:1: ( ( RULE_TIME_FORMAT ) )
            // InternalMenetrend.g:1846:2: ( RULE_TIME_FORMAT )
            {
            // InternalMenetrend.g:1846:2: ( RULE_TIME_FORMAT )
            // InternalMenetrend.g:1847:3: RULE_TIME_FORMAT
            {
             before(grammarAccess.getSimpleTimeFormatAccess().getFromTIME_FORMATTerminalRuleCall_0()); 
            match(input,RULE_TIME_FORMAT,FOLLOW_2); 
             after(grammarAccess.getSimpleTimeFormatAccess().getFromTIME_FORMATTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTimeFormat__FromAssignment"


    // $ANTLR start "rule__ComplexTimeMiddle__FromAssignment_0"
    // InternalMenetrend.g:1856:1: rule__ComplexTimeMiddle__FromAssignment_0 : ( RULE_TIME_FORMAT ) ;
    public final void rule__ComplexTimeMiddle__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1860:1: ( ( RULE_TIME_FORMAT ) )
            // InternalMenetrend.g:1861:2: ( RULE_TIME_FORMAT )
            {
            // InternalMenetrend.g:1861:2: ( RULE_TIME_FORMAT )
            // InternalMenetrend.g:1862:3: RULE_TIME_FORMAT
            {
             before(grammarAccess.getComplexTimeMiddleAccess().getFromTIME_FORMATTerminalRuleCall_0_0()); 
            match(input,RULE_TIME_FORMAT,FOLLOW_2); 
             after(grammarAccess.getComplexTimeMiddleAccess().getFromTIME_FORMATTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__FromAssignment_0"


    // $ANTLR start "rule__ComplexTimeMiddle__UntilAssignment_2"
    // InternalMenetrend.g:1871:1: rule__ComplexTimeMiddle__UntilAssignment_2 : ( RULE_TIME_FORMAT ) ;
    public final void rule__ComplexTimeMiddle__UntilAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1875:1: ( ( RULE_TIME_FORMAT ) )
            // InternalMenetrend.g:1876:2: ( RULE_TIME_FORMAT )
            {
            // InternalMenetrend.g:1876:2: ( RULE_TIME_FORMAT )
            // InternalMenetrend.g:1877:3: RULE_TIME_FORMAT
            {
             before(grammarAccess.getComplexTimeMiddleAccess().getUntilTIME_FORMATTerminalRuleCall_2_0()); 
            match(input,RULE_TIME_FORMAT,FOLLOW_2); 
             after(grammarAccess.getComplexTimeMiddleAccess().getUntilTIME_FORMATTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__UntilAssignment_2"


    // $ANTLR start "rule__ComplexTimeMiddle__FrequencyAssignment_4"
    // InternalMenetrend.g:1886:1: rule__ComplexTimeMiddle__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__ComplexTimeMiddle__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1890:1: ( ( RULE_INT ) )
            // InternalMenetrend.g:1891:2: ( RULE_INT )
            {
            // InternalMenetrend.g:1891:2: ( RULE_INT )
            // InternalMenetrend.g:1892:3: RULE_INT
            {
             before(grammarAccess.getComplexTimeMiddleAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getComplexTimeMiddleAccess().getFrequencyINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeMiddle__FrequencyAssignment_4"


    // $ANTLR start "rule__ComplexTimeEnd__FromAssignment_0"
    // InternalMenetrend.g:1901:1: rule__ComplexTimeEnd__FromAssignment_0 : ( RULE_TIME_FORMAT ) ;
    public final void rule__ComplexTimeEnd__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1905:1: ( ( RULE_TIME_FORMAT ) )
            // InternalMenetrend.g:1906:2: ( RULE_TIME_FORMAT )
            {
            // InternalMenetrend.g:1906:2: ( RULE_TIME_FORMAT )
            // InternalMenetrend.g:1907:3: RULE_TIME_FORMAT
            {
             before(grammarAccess.getComplexTimeEndAccess().getFromTIME_FORMATTerminalRuleCall_0_0()); 
            match(input,RULE_TIME_FORMAT,FOLLOW_2); 
             after(grammarAccess.getComplexTimeEndAccess().getFromTIME_FORMATTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__FromAssignment_0"


    // $ANTLR start "rule__ComplexTimeEnd__FrequencyAssignment_2"
    // InternalMenetrend.g:1916:1: rule__ComplexTimeEnd__FrequencyAssignment_2 : ( RULE_INT ) ;
    public final void rule__ComplexTimeEnd__FrequencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1920:1: ( ( RULE_INT ) )
            // InternalMenetrend.g:1921:2: ( RULE_INT )
            {
            // InternalMenetrend.g:1921:2: ( RULE_INT )
            // InternalMenetrend.g:1922:3: RULE_INT
            {
             before(grammarAccess.getComplexTimeEndAccess().getFrequencyINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getComplexTimeEndAccess().getFrequencyINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__FrequencyAssignment_2"


    // $ANTLR start "rule__ComplexTimeEnd__UntilAssignment_4"
    // InternalMenetrend.g:1931:1: rule__ComplexTimeEnd__UntilAssignment_4 : ( RULE_TIME_FORMAT ) ;
    public final void rule__ComplexTimeEnd__UntilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1935:1: ( ( RULE_TIME_FORMAT ) )
            // InternalMenetrend.g:1936:2: ( RULE_TIME_FORMAT )
            {
            // InternalMenetrend.g:1936:2: ( RULE_TIME_FORMAT )
            // InternalMenetrend.g:1937:3: RULE_TIME_FORMAT
            {
             before(grammarAccess.getComplexTimeEndAccess().getUntilTIME_FORMATTerminalRuleCall_4_0()); 
            match(input,RULE_TIME_FORMAT,FOLLOW_2); 
             after(grammarAccess.getComplexTimeEndAccess().getUntilTIME_FORMATTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTimeEnd__UntilAssignment_4"


    // $ANTLR start "rule__Stop__NameAssignment"
    // InternalMenetrend.g:1946:1: rule__Stop__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Stop__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMenetrend.g:1950:1: ( ( RULE_STRING ) )
            // InternalMenetrend.g:1951:2: ( RULE_STRING )
            {
            // InternalMenetrend.g:1951:2: ( RULE_STRING )
            // InternalMenetrend.g:1952:3: RULE_STRING
            {
             before(grammarAccess.getStopAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStopAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000003FE000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000003FE000082L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});

}