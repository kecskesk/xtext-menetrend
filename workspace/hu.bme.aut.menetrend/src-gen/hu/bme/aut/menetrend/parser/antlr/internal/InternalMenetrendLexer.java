package hu.bme.aut.menetrend.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMenetrendLexer extends Lexer {
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

    public InternalMenetrendLexer() {;} 
    public InternalMenetrendLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMenetrendLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMenetrend.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:11:7: ( 'Stops' )
            // InternalMenetrend.g:11:9: 'Stops'
            {
            match("Stops"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:12:7: ( ',' )
            // InternalMenetrend.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:13:7: ( 'Schedules' )
            // InternalMenetrend.g:13:9: 'Schedules'
            {
            match("Schedules"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:14:7: ( 'Line' )
            // InternalMenetrend.g:14:9: 'Line'
            {
            match("Line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:15:7: ( ':' )
            // InternalMenetrend.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:16:7: ( '-' )
            // InternalMenetrend.g:16:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:17:7: ( '-[' )
            // InternalMenetrend.g:17:9: '-['
            {
            match("-["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:18:7: ( ']->' )
            // InternalMenetrend.g:18:9: ']->'
            {
            match("]->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:19:7: ( '...' )
            // InternalMenetrend.g:19:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:20:7: ( '/' )
            // InternalMenetrend.g:20:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:21:7: ( 'Bus' )
            // InternalMenetrend.g:21:9: 'Bus'
            {
            match("Bus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:22:7: ( 'Tram' )
            // InternalMenetrend.g:22:9: 'Tram'
            {
            match("Tram"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:23:7: ( 'Metro' )
            // InternalMenetrend.g:23:9: 'Metro'
            {
            match("Metro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:24:7: ( 'Troli' )
            // InternalMenetrend.g:24:9: 'Troli'
            {
            match("Troli"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:25:7: ( 'Hev' )
            // InternalMenetrend.g:25:9: 'Hev'
            {
            match("Hev"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:26:7: ( 'weekdays' )
            // InternalMenetrend.g:26:9: 'weekdays'
            {
            match("weekdays"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:27:7: ( 'weekends' )
            // InternalMenetrend.g:27:9: 'weekends'
            {
            match("weekends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:28:7: ( 'monday' )
            // InternalMenetrend.g:28:9: 'monday'
            {
            match("monday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:29:7: ( 'tuesday' )
            // InternalMenetrend.g:29:9: 'tuesday'
            {
            match("tuesday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:30:7: ( 'wednesday' )
            // InternalMenetrend.g:30:9: 'wednesday'
            {
            match("wednesday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:31:7: ( 'thursday' )
            // InternalMenetrend.g:31:9: 'thursday'
            {
            match("thursday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:32:7: ( 'friday' )
            // InternalMenetrend.g:32:9: 'friday'
            {
            match("friday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:33:7: ( 'saturday' )
            // InternalMenetrend.g:33:9: 'saturday'
            {
            match("saturday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:34:7: ( 'sunday' )
            // InternalMenetrend.g:34:9: 'sunday'
            {
            match("sunday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_BKV_ID_LF"
    public final void mRULE_BKV_ID_LF() throws RecognitionException {
        try {
            int _type = RULE_BKV_ID_LF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:1031:16: ( 'A' .. 'Z' RULE_INT ( 'A' .. 'Z' )? )
            // InternalMenetrend.g:1031:18: 'A' .. 'Z' RULE_INT ( 'A' .. 'Z' )?
            {
            matchRange('A','Z'); 
            mRULE_INT(); 
            // InternalMenetrend.g:1031:36: ( 'A' .. 'Z' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='A' && LA1_0<='Z')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMenetrend.g:1031:37: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BKV_ID_LF"

    // $ANTLR start "RULE_BKV_ID_LB"
    public final void mRULE_BKV_ID_LB() throws RecognitionException {
        try {
            int _type = RULE_BKV_ID_LB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:1033:16: ( ( 'A' .. 'Z' )? RULE_INT 'A' .. 'Z' )
            // InternalMenetrend.g:1033:18: ( 'A' .. 'Z' )? RULE_INT 'A' .. 'Z'
            {
            // InternalMenetrend.g:1033:18: ( 'A' .. 'Z' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMenetrend.g:1033:19: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;

            }

            mRULE_INT(); 
            matchRange('A','Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BKV_ID_LB"

    // $ANTLR start "RULE_DUAL_INT_NOLEADZERO"
    public final void mRULE_DUAL_INT_NOLEADZERO() throws RecognitionException {
        try {
            // InternalMenetrend.g:1035:35: ( RULE_DIGIT_ONE ( RULE_DIGIT )? )
            // InternalMenetrend.g:1035:37: RULE_DIGIT_ONE ( RULE_DIGIT )?
            {
            mRULE_DIGIT_ONE(); 
            // InternalMenetrend.g:1035:52: ( RULE_DIGIT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMenetrend.g:1035:52: RULE_DIGIT
                    {
                    mRULE_DIGIT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DUAL_INT_NOLEADZERO"

    // $ANTLR start "RULE_DUAL_INT_LEADZERO"
    public final void mRULE_DUAL_INT_LEADZERO() throws RecognitionException {
        try {
            // InternalMenetrend.g:1037:33: ( RULE_DIGIT ( RULE_DIGIT )? )
            // InternalMenetrend.g:1037:35: RULE_DIGIT ( RULE_DIGIT )?
            {
            mRULE_DIGIT(); 
            // InternalMenetrend.g:1037:46: ( RULE_DIGIT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMenetrend.g:1037:46: RULE_DIGIT
                    {
                    mRULE_DIGIT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DUAL_INT_LEADZERO"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalMenetrend.g:1039:21: ( '0' .. '9' )
            // InternalMenetrend.g:1039:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_DIGIT_ONE"
    public final void mRULE_DIGIT_ONE() throws RecognitionException {
        try {
            // InternalMenetrend.g:1041:25: ( '1' .. '9' )
            // InternalMenetrend.g:1041:27: '1' .. '9'
            {
            matchRange('1','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_ONE"

    // $ANTLR start "RULE_TIME_FORMAT"
    public final void mRULE_TIME_FORMAT() throws RecognitionException {
        try {
            int _type = RULE_TIME_FORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:1043:18: ( RULE_DUAL_INT_NOLEADZERO ':' RULE_DUAL_INT_LEADZERO )
            // InternalMenetrend.g:1043:20: RULE_DUAL_INT_NOLEADZERO ':' RULE_DUAL_INT_LEADZERO
            {
            mRULE_DUAL_INT_NOLEADZERO(); 
            match(':'); 
            mRULE_DUAL_INT_LEADZERO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME_FORMAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:1045:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMenetrend.g:1045:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMenetrend.g:1045:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMenetrend.g:1045:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMenetrend.g:1045:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMenetrend.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:1047:10: ( ( '0' .. '9' )+ )
            // InternalMenetrend.g:1047:12: ( '0' .. '9' )+
            {
            // InternalMenetrend.g:1047:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMenetrend.g:1047:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:1049:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMenetrend.g:1049:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMenetrend.g:1049:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMenetrend.g:1049:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMenetrend.g:1049:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMenetrend.g:1049:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMenetrend.g:1049:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:1049:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMenetrend.g:1049:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMenetrend.g:1049:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMenetrend.g:1049:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:1051:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMenetrend.g:1051:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMenetrend.g:1051:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMenetrend.g:1051:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:1053:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMenetrend.g:1053:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMenetrend.g:1053:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMenetrend.g:1053:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalMenetrend.g:1053:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMenetrend.g:1053:41: ( '\\r' )? '\\n'
                    {
                    // InternalMenetrend.g:1053:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMenetrend.g:1053:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:1055:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMenetrend.g:1055:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMenetrend.g:1055:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMenetrend.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMenetrend.g:1057:16: ( . )
            // InternalMenetrend.g:1057:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMenetrend.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_BKV_ID_LF | RULE_BKV_ID_LB | RULE_TIME_FORMAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=34;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalMenetrend.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalMenetrend.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalMenetrend.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalMenetrend.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalMenetrend.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalMenetrend.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalMenetrend.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalMenetrend.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalMenetrend.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalMenetrend.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalMenetrend.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalMenetrend.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalMenetrend.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalMenetrend.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalMenetrend.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalMenetrend.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalMenetrend.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalMenetrend.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalMenetrend.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalMenetrend.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalMenetrend.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalMenetrend.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalMenetrend.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalMenetrend.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalMenetrend.g:1:154: RULE_BKV_ID_LF
                {
                mRULE_BKV_ID_LF(); 

                }
                break;
            case 26 :
                // InternalMenetrend.g:1:169: RULE_BKV_ID_LB
                {
                mRULE_BKV_ID_LB(); 

                }
                break;
            case 27 :
                // InternalMenetrend.g:1:184: RULE_TIME_FORMAT
                {
                mRULE_TIME_FORMAT(); 

                }
                break;
            case 28 :
                // InternalMenetrend.g:1:201: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalMenetrend.g:1:209: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalMenetrend.g:1:218: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalMenetrend.g:1:230: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalMenetrend.g:1:246: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalMenetrend.g:1:262: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalMenetrend.g:1:270: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\35\1\uffff\1\35\1\uffff\1\43\2\32\1\50\12\35\2\64\1\32\1\uffff\2\32\2\uffff\2\35\1\uffff\1\75\1\uffff\1\35\10\uffff\13\35\1\uffff\1\64\2\uffff\1\64\2\uffff\2\35\1\uffff\1\75\1\35\1\120\3\35\1\124\12\35\1\137\1\uffff\1\140\2\35\1\uffff\10\35\1\154\1\35\2\uffff\1\156\1\157\11\35\1\uffff\1\35\2\uffff\3\35\1\175\2\35\1\u0080\1\35\1\u0082\4\35\1\uffff\1\u0087\1\35\1\uffff\1\35\1\uffff\1\35\1\u008b\1\u008c\1\35\1\uffff\1\u008e\1\u008f\1\u0090\2\uffff\1\u0091\4\uffff";
    static final String DFA16_eofS =
        "\u0092\uffff";
    static final String DFA16_minS =
        "\1\0\1\60\1\uffff\1\60\1\uffff\1\133\1\55\1\56\1\52\4\60\1\145\1\157\1\150\1\162\1\141\3\60\1\101\1\uffff\2\0\2\uffff\1\157\1\150\1\uffff\1\60\1\uffff\1\156\10\uffff\1\163\1\141\1\164\1\166\1\144\1\156\1\145\1\165\1\151\1\164\1\156\1\uffff\1\60\2\uffff\1\60\2\uffff\1\160\1\145\1\uffff\1\60\1\145\1\60\1\155\1\154\1\162\1\60\1\153\1\156\1\144\1\163\1\162\1\144\1\165\1\144\1\163\1\144\1\60\1\uffff\1\60\1\151\1\157\1\uffff\1\144\1\145\1\141\1\144\1\163\1\141\1\162\1\141\1\60\1\165\2\uffff\2\60\1\141\1\156\1\163\1\171\1\141\1\144\1\171\1\144\1\171\1\uffff\1\154\2\uffff\1\171\2\144\1\60\1\171\1\141\1\60\1\141\1\60\1\145\2\163\1\141\1\uffff\1\60\1\171\1\uffff\1\171\1\uffff\1\163\2\60\1\171\1\uffff\3\60\2\uffff\1\60\4\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\164\1\uffff\1\151\1\uffff\1\133\1\55\1\56\1\57\1\165\1\162\3\145\1\157\1\165\1\162\1\165\1\71\2\132\1\172\1\uffff\2\uffff\2\uffff\1\157\1\150\1\uffff\1\172\1\uffff\1\156\10\uffff\1\163\1\157\1\164\1\166\1\145\1\156\1\145\1\165\1\151\1\164\1\156\1\uffff\1\132\2\uffff\1\132\2\uffff\1\160\1\145\1\uffff\1\172\1\145\1\172\1\155\1\154\1\162\1\172\1\153\1\156\1\144\1\163\1\162\1\144\1\165\1\144\1\163\1\144\1\172\1\uffff\1\172\1\151\1\157\1\uffff\2\145\1\141\1\144\1\163\1\141\1\162\1\141\1\172\1\165\2\uffff\2\172\1\141\1\156\1\163\1\171\1\141\1\144\1\171\1\144\1\171\1\uffff\1\154\2\uffff\1\171\2\144\1\172\1\171\1\141\1\172\1\141\1\172\1\145\2\163\1\141\1\uffff\1\172\1\171\1\uffff\1\171\1\uffff\1\163\2\172\1\171\1\uffff\3\172\2\uffff\1\172\4\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\uffff\1\5\21\uffff\1\34\2\uffff\1\41\1\42\2\uffff\1\34\1\uffff\1\2\1\uffff\1\5\1\7\1\6\1\10\1\11\1\37\1\40\1\12\13\uffff\1\35\1\uffff\1\33\1\32\1\uffff\1\36\1\41\2\uffff\1\31\22\uffff\1\13\3\uffff\1\17\12\uffff\1\4\1\14\13\uffff\1\1\1\uffff\1\16\1\15\15\uffff\1\22\2\uffff\1\26\1\uffff\1\30\4\uffff\1\23\3\uffff\1\20\1\21\1\uffff\1\25\1\27\1\3\1\24";
    static final String DFA16_specialS =
        "\1\1\26\uffff\1\2\1\0\171\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\27\4\32\1\30\4\32\1\2\1\5\1\7\1\10\1\24\11\23\1\4\6\32\1\22\1\11\5\22\1\14\3\22\1\3\1\13\5\22\1\1\1\12\6\22\2\32\1\6\1\25\1\26\1\32\5\26\1\20\6\26\1\16\5\26\1\21\1\17\2\26\1\15\3\26\uff85\32",
            "\12\36\51\uffff\1\34\20\uffff\1\33",
            "",
            "\12\36\57\uffff\1\40",
            "",
            "\1\42",
            "\1\44",
            "\1\45",
            "\1\46\4\uffff\1\47",
            "\12\36\73\uffff\1\51",
            "\12\36\70\uffff\1\52",
            "\12\36\53\uffff\1\53",
            "\12\36\53\uffff\1\54",
            "\1\55",
            "\1\56",
            "\1\60\14\uffff\1\57",
            "\1\61",
            "\1\62\23\uffff\1\63",
            "\12\36",
            "\12\65\1\66\6\uffff\32\67",
            "\12\70\7\uffff\32\67",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\0\71",
            "\0\71",
            "",
            "",
            "\1\73",
            "\1\74",
            "",
            "\12\36\7\uffff\32\76\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101\15\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\106\1\105",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\12\70\1\66\6\uffff\32\67",
            "",
            "",
            "\12\70\7\uffff\32\67",
            "",
            "",
            "\1\115",
            "\1\116",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\117",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\141",
            "\1\142",
            "",
            "\1\143\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\155",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\176",
            "\1\177",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0081",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0088",
            "",
            "\1\u0089",
            "",
            "\1\u008a",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u008d",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_BKV_ID_LF | RULE_BKV_ID_LB | RULE_TIME_FORMAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_24 = input.LA(1);

                        s = -1;
                        if ( ((LA16_24>='\u0000' && LA16_24<='\uFFFF')) ) {s = 57;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='S') ) {s = 1;}

                        else if ( (LA16_0==',') ) {s = 2;}

                        else if ( (LA16_0=='L') ) {s = 3;}

                        else if ( (LA16_0==':') ) {s = 4;}

                        else if ( (LA16_0=='-') ) {s = 5;}

                        else if ( (LA16_0==']') ) {s = 6;}

                        else if ( (LA16_0=='.') ) {s = 7;}

                        else if ( (LA16_0=='/') ) {s = 8;}

                        else if ( (LA16_0=='B') ) {s = 9;}

                        else if ( (LA16_0=='T') ) {s = 10;}

                        else if ( (LA16_0=='M') ) {s = 11;}

                        else if ( (LA16_0=='H') ) {s = 12;}

                        else if ( (LA16_0=='w') ) {s = 13;}

                        else if ( (LA16_0=='m') ) {s = 14;}

                        else if ( (LA16_0=='t') ) {s = 15;}

                        else if ( (LA16_0=='f') ) {s = 16;}

                        else if ( (LA16_0=='s') ) {s = 17;}

                        else if ( (LA16_0=='A'||(LA16_0>='C' && LA16_0<='G')||(LA16_0>='I' && LA16_0<='K')||(LA16_0>='N' && LA16_0<='R')||(LA16_0>='U' && LA16_0<='Z')) ) {s = 18;}

                        else if ( ((LA16_0>='1' && LA16_0<='9')) ) {s = 19;}

                        else if ( (LA16_0=='0') ) {s = 20;}

                        else if ( (LA16_0=='^') ) {s = 21;}

                        else if ( (LA16_0=='_'||(LA16_0>='a' && LA16_0<='e')||(LA16_0>='g' && LA16_0<='l')||(LA16_0>='n' && LA16_0<='r')||(LA16_0>='u' && LA16_0<='v')||(LA16_0>='x' && LA16_0<='z')) ) {s = 22;}

                        else if ( (LA16_0=='\"') ) {s = 23;}

                        else if ( (LA16_0=='\'') ) {s = 24;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 25;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='+')||(LA16_0>=';' && LA16_0<='@')||(LA16_0>='[' && LA16_0<='\\')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_23 = input.LA(1);

                        s = -1;
                        if ( ((LA16_23>='\u0000' && LA16_23<='\uFFFF')) ) {s = 57;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}