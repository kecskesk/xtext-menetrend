package hu.bme.aut.menetrend.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.aut.menetrend.services.MenetrendGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMenetrendParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_BKV_ID_LF", "RULE_BKV_ID_LB", "RULE_STRING", "RULE_TIME_FORMAT", "RULE_DIGIT_ONE", "RULE_DIGIT", "RULE_DUAL_INT_NOLEADZERO", "RULE_DUAL_INT_LEADZERO", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Stops'", "','", "'Schedules'", "'Line'", "':'", "'-'", "'-['", "']->'", "'...'", "'/'", "'Bus'", "'Tram'", "'Metro'", "'Troli'", "'Hev'", "'weekdays'", "'weekends'", "'monday'", "'tuesday'", "'wednesday'", "'thursday'", "'friday'", "'saturday'", "'sunday'"
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

        public InternalMenetrendParser(TokenStream input, MenetrendGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MenetrendGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMenetrend.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMenetrend.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMenetrend.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMenetrend.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Stops' ( (lv_stops_1_0= ruleStop ) ) (otherlv_2= ',' ( (lv_stops_3_0= ruleStop ) ) )* otherlv_4= 'Schedules' ( (lv_schedules_5_0= ruleSchedule ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_stops_1_0 = null;

        EObject lv_stops_3_0 = null;

        EObject lv_schedules_5_0 = null;



        	enterRule();

        try {
            // InternalMenetrend.g:78:2: ( (otherlv_0= 'Stops' ( (lv_stops_1_0= ruleStop ) ) (otherlv_2= ',' ( (lv_stops_3_0= ruleStop ) ) )* otherlv_4= 'Schedules' ( (lv_schedules_5_0= ruleSchedule ) )+ ) )
            // InternalMenetrend.g:79:2: (otherlv_0= 'Stops' ( (lv_stops_1_0= ruleStop ) ) (otherlv_2= ',' ( (lv_stops_3_0= ruleStop ) ) )* otherlv_4= 'Schedules' ( (lv_schedules_5_0= ruleSchedule ) )+ )
            {
            // InternalMenetrend.g:79:2: (otherlv_0= 'Stops' ( (lv_stops_1_0= ruleStop ) ) (otherlv_2= ',' ( (lv_stops_3_0= ruleStop ) ) )* otherlv_4= 'Schedules' ( (lv_schedules_5_0= ruleSchedule ) )+ )
            // InternalMenetrend.g:80:3: otherlv_0= 'Stops' ( (lv_stops_1_0= ruleStop ) ) (otherlv_2= ',' ( (lv_stops_3_0= ruleStop ) ) )* otherlv_4= 'Schedules' ( (lv_schedules_5_0= ruleSchedule ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getStopsKeyword_0());
            		
            // InternalMenetrend.g:84:3: ( (lv_stops_1_0= ruleStop ) )
            // InternalMenetrend.g:85:4: (lv_stops_1_0= ruleStop )
            {
            // InternalMenetrend.g:85:4: (lv_stops_1_0= ruleStop )
            // InternalMenetrend.g:86:5: lv_stops_1_0= ruleStop
            {

            					newCompositeNode(grammarAccess.getModelAccess().getStopsStopParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_stops_1_0=ruleStop();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"stops",
            						lv_stops_1_0,
            						"hu.bme.aut.menetrend.Menetrend.Stop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMenetrend.g:103:3: (otherlv_2= ',' ( (lv_stops_3_0= ruleStop ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMenetrend.g:104:4: otherlv_2= ',' ( (lv_stops_3_0= ruleStop ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMenetrend.g:108:4: ( (lv_stops_3_0= ruleStop ) )
            	    // InternalMenetrend.g:109:5: (lv_stops_3_0= ruleStop )
            	    {
            	    // InternalMenetrend.g:109:5: (lv_stops_3_0= ruleStop )
            	    // InternalMenetrend.g:110:6: lv_stops_3_0= ruleStop
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getStopsStopParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_stops_3_0=ruleStop();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stops",
            	    							lv_stops_3_0,
            	    							"hu.bme.aut.menetrend.Menetrend.Stop");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getSchedulesKeyword_3());
            		
            // InternalMenetrend.g:132:3: ( (lv_schedules_5_0= ruleSchedule ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMenetrend.g:133:4: (lv_schedules_5_0= ruleSchedule )
            	    {
            	    // InternalMenetrend.g:133:4: (lv_schedules_5_0= ruleSchedule )
            	    // InternalMenetrend.g:134:5: lv_schedules_5_0= ruleSchedule
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSchedulesScheduleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_schedules_5_0=ruleSchedule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"schedules",
            	    						lv_schedules_5_0,
            	    						"hu.bme.aut.menetrend.Menetrend.Schedule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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


    // $ANTLR start "entryRuleSchedule"
    // InternalMenetrend.g:155:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalMenetrend.g:155:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalMenetrend.g:156:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalMenetrend.g:162:1: ruleSchedule returns [EObject current=null] : (otherlv_0= 'Line' ( (lv_lineNumber_1_0= ruleLineNumber ) ) otherlv_2= ':' ( (lv_scheduleParts_3_0= ruleSchedulePart ) )+ ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineNumber_1_0 = null;

        EObject lv_scheduleParts_3_0 = null;



        	enterRule();

        try {
            // InternalMenetrend.g:168:2: ( (otherlv_0= 'Line' ( (lv_lineNumber_1_0= ruleLineNumber ) ) otherlv_2= ':' ( (lv_scheduleParts_3_0= ruleSchedulePart ) )+ ) )
            // InternalMenetrend.g:169:2: (otherlv_0= 'Line' ( (lv_lineNumber_1_0= ruleLineNumber ) ) otherlv_2= ':' ( (lv_scheduleParts_3_0= ruleSchedulePart ) )+ )
            {
            // InternalMenetrend.g:169:2: (otherlv_0= 'Line' ( (lv_lineNumber_1_0= ruleLineNumber ) ) otherlv_2= ':' ( (lv_scheduleParts_3_0= ruleSchedulePart ) )+ )
            // InternalMenetrend.g:170:3: otherlv_0= 'Line' ( (lv_lineNumber_1_0= ruleLineNumber ) ) otherlv_2= ':' ( (lv_scheduleParts_3_0= ruleSchedulePart ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getLineKeyword_0());
            		
            // InternalMenetrend.g:174:3: ( (lv_lineNumber_1_0= ruleLineNumber ) )
            // InternalMenetrend.g:175:4: (lv_lineNumber_1_0= ruleLineNumber )
            {
            // InternalMenetrend.g:175:4: (lv_lineNumber_1_0= ruleLineNumber )
            // InternalMenetrend.g:176:5: lv_lineNumber_1_0= ruleLineNumber
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getLineNumberLineNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_lineNumber_1_0=ruleLineNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduleRule());
            					}
            					set(
            						current,
            						"lineNumber",
            						lv_lineNumber_1_0,
            						"hu.bme.aut.menetrend.Menetrend.LineNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getColonKeyword_2());
            		
            // InternalMenetrend.g:197:3: ( (lv_scheduleParts_3_0= ruleSchedulePart ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||(LA3_0>=33 && LA3_0<=41)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMenetrend.g:198:4: (lv_scheduleParts_3_0= ruleSchedulePart )
            	    {
            	    // InternalMenetrend.g:198:4: (lv_scheduleParts_3_0= ruleSchedulePart )
            	    // InternalMenetrend.g:199:5: lv_scheduleParts_3_0= ruleSchedulePart
            	    {

            	    					newCompositeNode(grammarAccess.getScheduleAccess().getSchedulePartsSchedulePartParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_scheduleParts_3_0=ruleSchedulePart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScheduleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scheduleParts",
            	    						lv_scheduleParts_3_0,
            	    						"hu.bme.aut.menetrend.Menetrend.SchedulePart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleLineNumber"
    // InternalMenetrend.g:220:1: entryRuleLineNumber returns [EObject current=null] : iv_ruleLineNumber= ruleLineNumber EOF ;
    public final EObject entryRuleLineNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineNumber = null;


        try {
            // InternalMenetrend.g:220:51: (iv_ruleLineNumber= ruleLineNumber EOF )
            // InternalMenetrend.g:221:2: iv_ruleLineNumber= ruleLineNumber EOF
            {
             newCompositeNode(grammarAccess.getLineNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineNumber=ruleLineNumber();

            state._fsp--;

             current =iv_ruleLineNumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineNumber"


    // $ANTLR start "ruleLineNumber"
    // InternalMenetrend.g:227:1: ruleLineNumber returns [EObject current=null] : ( ( (lv_type_0_0= ruleTransportType ) ) otherlv_1= '-' ( ( (lv_number_2_1= ruleLineNumberInt | lv_number_2_2= ruleLineNumberBkvIdLf | lv_number_2_3= ruleLineNumberBkvIdLb ) ) ) ) ;
    public final EObject ruleLineNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_number_2_1 = null;

        AntlrDatatypeRuleToken lv_number_2_2 = null;

        AntlrDatatypeRuleToken lv_number_2_3 = null;



        	enterRule();

        try {
            // InternalMenetrend.g:233:2: ( ( ( (lv_type_0_0= ruleTransportType ) ) otherlv_1= '-' ( ( (lv_number_2_1= ruleLineNumberInt | lv_number_2_2= ruleLineNumberBkvIdLf | lv_number_2_3= ruleLineNumberBkvIdLb ) ) ) ) )
            // InternalMenetrend.g:234:2: ( ( (lv_type_0_0= ruleTransportType ) ) otherlv_1= '-' ( ( (lv_number_2_1= ruleLineNumberInt | lv_number_2_2= ruleLineNumberBkvIdLf | lv_number_2_3= ruleLineNumberBkvIdLb ) ) ) )
            {
            // InternalMenetrend.g:234:2: ( ( (lv_type_0_0= ruleTransportType ) ) otherlv_1= '-' ( ( (lv_number_2_1= ruleLineNumberInt | lv_number_2_2= ruleLineNumberBkvIdLf | lv_number_2_3= ruleLineNumberBkvIdLb ) ) ) )
            // InternalMenetrend.g:235:3: ( (lv_type_0_0= ruleTransportType ) ) otherlv_1= '-' ( ( (lv_number_2_1= ruleLineNumberInt | lv_number_2_2= ruleLineNumberBkvIdLf | lv_number_2_3= ruleLineNumberBkvIdLb ) ) )
            {
            // InternalMenetrend.g:235:3: ( (lv_type_0_0= ruleTransportType ) )
            // InternalMenetrend.g:236:4: (lv_type_0_0= ruleTransportType )
            {
            // InternalMenetrend.g:236:4: (lv_type_0_0= ruleTransportType )
            // InternalMenetrend.g:237:5: lv_type_0_0= ruleTransportType
            {

            					newCompositeNode(grammarAccess.getLineNumberAccess().getTypeTransportTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_0_0=ruleTransportType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineNumberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"hu.bme.aut.menetrend.Menetrend.TransportType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLineNumberAccess().getHyphenMinusKeyword_1());
            		
            // InternalMenetrend.g:258:3: ( ( (lv_number_2_1= ruleLineNumberInt | lv_number_2_2= ruleLineNumberBkvIdLf | lv_number_2_3= ruleLineNumberBkvIdLb ) ) )
            // InternalMenetrend.g:259:4: ( (lv_number_2_1= ruleLineNumberInt | lv_number_2_2= ruleLineNumberBkvIdLf | lv_number_2_3= ruleLineNumberBkvIdLb ) )
            {
            // InternalMenetrend.g:259:4: ( (lv_number_2_1= ruleLineNumberInt | lv_number_2_2= ruleLineNumberBkvIdLf | lv_number_2_3= ruleLineNumberBkvIdLb ) )
            // InternalMenetrend.g:260:5: (lv_number_2_1= ruleLineNumberInt | lv_number_2_2= ruleLineNumberBkvIdLf | lv_number_2_3= ruleLineNumberBkvIdLb )
            {
            // InternalMenetrend.g:260:5: (lv_number_2_1= ruleLineNumberInt | lv_number_2_2= ruleLineNumberBkvIdLf | lv_number_2_3= ruleLineNumberBkvIdLb )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_BKV_ID_LF:
                {
                alt4=2;
                }
                break;
            case RULE_BKV_ID_LB:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMenetrend.g:261:6: lv_number_2_1= ruleLineNumberInt
                    {

                    						newCompositeNode(grammarAccess.getLineNumberAccess().getNumberLineNumberIntParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_2_1=ruleLineNumberInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineNumberRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_2_1,
                    							"hu.bme.aut.menetrend.Menetrend.LineNumberInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:277:6: lv_number_2_2= ruleLineNumberBkvIdLf
                    {

                    						newCompositeNode(grammarAccess.getLineNumberAccess().getNumberLineNumberBkvIdLfParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_2_2=ruleLineNumberBkvIdLf();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineNumberRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_2_2,
                    							"hu.bme.aut.menetrend.Menetrend.LineNumberBkvIdLf");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMenetrend.g:293:6: lv_number_2_3= ruleLineNumberBkvIdLb
                    {

                    						newCompositeNode(grammarAccess.getLineNumberAccess().getNumberLineNumberBkvIdLbParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_2_3=ruleLineNumberBkvIdLb();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineNumberRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_2_3,
                    							"hu.bme.aut.menetrend.Menetrend.LineNumberBkvIdLb");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleLineNumber"


    // $ANTLR start "entryRuleLineNumberInt"
    // InternalMenetrend.g:315:1: entryRuleLineNumberInt returns [String current=null] : iv_ruleLineNumberInt= ruleLineNumberInt EOF ;
    public final String entryRuleLineNumberInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLineNumberInt = null;


        try {
            // InternalMenetrend.g:315:53: (iv_ruleLineNumberInt= ruleLineNumberInt EOF )
            // InternalMenetrend.g:316:2: iv_ruleLineNumberInt= ruleLineNumberInt EOF
            {
             newCompositeNode(grammarAccess.getLineNumberIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineNumberInt=ruleLineNumberInt();

            state._fsp--;

             current =iv_ruleLineNumberInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineNumberInt"


    // $ANTLR start "ruleLineNumberInt"
    // InternalMenetrend.g:322:1: ruleLineNumberInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLineNumberInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalMenetrend.g:328:2: (this_INT_0= RULE_INT )
            // InternalMenetrend.g:329:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getLineNumberIntAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleLineNumberInt"


    // $ANTLR start "entryRuleLineNumberBkvIdLf"
    // InternalMenetrend.g:339:1: entryRuleLineNumberBkvIdLf returns [String current=null] : iv_ruleLineNumberBkvIdLf= ruleLineNumberBkvIdLf EOF ;
    public final String entryRuleLineNumberBkvIdLf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLineNumberBkvIdLf = null;


        try {
            // InternalMenetrend.g:339:57: (iv_ruleLineNumberBkvIdLf= ruleLineNumberBkvIdLf EOF )
            // InternalMenetrend.g:340:2: iv_ruleLineNumberBkvIdLf= ruleLineNumberBkvIdLf EOF
            {
             newCompositeNode(grammarAccess.getLineNumberBkvIdLfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineNumberBkvIdLf=ruleLineNumberBkvIdLf();

            state._fsp--;

             current =iv_ruleLineNumberBkvIdLf.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineNumberBkvIdLf"


    // $ANTLR start "ruleLineNumberBkvIdLf"
    // InternalMenetrend.g:346:1: ruleLineNumberBkvIdLf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BKV_ID_LF_0= RULE_BKV_ID_LF ;
    public final AntlrDatatypeRuleToken ruleLineNumberBkvIdLf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BKV_ID_LF_0=null;


        	enterRule();

        try {
            // InternalMenetrend.g:352:2: (this_BKV_ID_LF_0= RULE_BKV_ID_LF )
            // InternalMenetrend.g:353:2: this_BKV_ID_LF_0= RULE_BKV_ID_LF
            {
            this_BKV_ID_LF_0=(Token)match(input,RULE_BKV_ID_LF,FOLLOW_2); 

            		current.merge(this_BKV_ID_LF_0);
            	

            		newLeafNode(this_BKV_ID_LF_0, grammarAccess.getLineNumberBkvIdLfAccess().getBKV_ID_LFTerminalRuleCall());
            	

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
    // $ANTLR end "ruleLineNumberBkvIdLf"


    // $ANTLR start "entryRuleLineNumberBkvIdLb"
    // InternalMenetrend.g:363:1: entryRuleLineNumberBkvIdLb returns [String current=null] : iv_ruleLineNumberBkvIdLb= ruleLineNumberBkvIdLb EOF ;
    public final String entryRuleLineNumberBkvIdLb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLineNumberBkvIdLb = null;


        try {
            // InternalMenetrend.g:363:57: (iv_ruleLineNumberBkvIdLb= ruleLineNumberBkvIdLb EOF )
            // InternalMenetrend.g:364:2: iv_ruleLineNumberBkvIdLb= ruleLineNumberBkvIdLb EOF
            {
             newCompositeNode(grammarAccess.getLineNumberBkvIdLbRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineNumberBkvIdLb=ruleLineNumberBkvIdLb();

            state._fsp--;

             current =iv_ruleLineNumberBkvIdLb.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineNumberBkvIdLb"


    // $ANTLR start "ruleLineNumberBkvIdLb"
    // InternalMenetrend.g:370:1: ruleLineNumberBkvIdLb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BKV_ID_LB_0= RULE_BKV_ID_LB ;
    public final AntlrDatatypeRuleToken ruleLineNumberBkvIdLb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BKV_ID_LB_0=null;


        	enterRule();

        try {
            // InternalMenetrend.g:376:2: (this_BKV_ID_LB_0= RULE_BKV_ID_LB )
            // InternalMenetrend.g:377:2: this_BKV_ID_LB_0= RULE_BKV_ID_LB
            {
            this_BKV_ID_LB_0=(Token)match(input,RULE_BKV_ID_LB,FOLLOW_2); 

            		current.merge(this_BKV_ID_LB_0);
            	

            		newLeafNode(this_BKV_ID_LB_0, grammarAccess.getLineNumberBkvIdLbAccess().getBKV_ID_LBTerminalRuleCall());
            	

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
    // $ANTLR end "ruleLineNumberBkvIdLb"


    // $ANTLR start "entryRuleSchedulePart"
    // InternalMenetrend.g:387:1: entryRuleSchedulePart returns [EObject current=null] : iv_ruleSchedulePart= ruleSchedulePart EOF ;
    public final EObject entryRuleSchedulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedulePart = null;


        try {
            // InternalMenetrend.g:387:53: (iv_ruleSchedulePart= ruleSchedulePart EOF )
            // InternalMenetrend.g:388:2: iv_ruleSchedulePart= ruleSchedulePart EOF
            {
             newCompositeNode(grammarAccess.getSchedulePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchedulePart=ruleSchedulePart();

            state._fsp--;

             current =iv_ruleSchedulePart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchedulePart"


    // $ANTLR start "ruleSchedulePart"
    // InternalMenetrend.g:394:1: ruleSchedulePart returns [EObject current=null] : (this_RelativeSchedule_0= ruleRelativeSchedule | this_AbsoluteSchedule_1= ruleAbsoluteSchedule ) ;
    public final EObject ruleSchedulePart() throws RecognitionException {
        EObject current = null;

        EObject this_RelativeSchedule_0 = null;

        EObject this_AbsoluteSchedule_1 = null;



        	enterRule();

        try {
            // InternalMenetrend.g:400:2: ( (this_RelativeSchedule_0= ruleRelativeSchedule | this_AbsoluteSchedule_1= ruleAbsoluteSchedule ) )
            // InternalMenetrend.g:401:2: (this_RelativeSchedule_0= ruleRelativeSchedule | this_AbsoluteSchedule_1= ruleAbsoluteSchedule )
            {
            // InternalMenetrend.g:401:2: (this_RelativeSchedule_0= ruleRelativeSchedule | this_AbsoluteSchedule_1= ruleAbsoluteSchedule )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=33 && LA5_0<=41)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMenetrend.g:402:3: this_RelativeSchedule_0= ruleRelativeSchedule
                    {

                    			newCompositeNode(grammarAccess.getSchedulePartAccess().getRelativeScheduleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeSchedule_0=ruleRelativeSchedule();

                    state._fsp--;


                    			current = this_RelativeSchedule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:411:3: this_AbsoluteSchedule_1= ruleAbsoluteSchedule
                    {

                    			newCompositeNode(grammarAccess.getSchedulePartAccess().getAbsoluteScheduleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbsoluteSchedule_1=ruleAbsoluteSchedule();

                    state._fsp--;


                    			current = this_AbsoluteSchedule_1;
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
    // $ANTLR end "ruleSchedulePart"


    // $ANTLR start "entryRuleRelativeSchedule"
    // InternalMenetrend.g:423:1: entryRuleRelativeSchedule returns [EObject current=null] : iv_ruleRelativeSchedule= ruleRelativeSchedule EOF ;
    public final EObject entryRuleRelativeSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeSchedule = null;


        try {
            // InternalMenetrend.g:423:57: (iv_ruleRelativeSchedule= ruleRelativeSchedule EOF )
            // InternalMenetrend.g:424:2: iv_ruleRelativeSchedule= ruleRelativeSchedule EOF
            {
             newCompositeNode(grammarAccess.getRelativeScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeSchedule=ruleRelativeSchedule();

            state._fsp--;

             current =iv_ruleRelativeSchedule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelativeSchedule"


    // $ANTLR start "ruleRelativeSchedule"
    // InternalMenetrend.g:430:1: ruleRelativeSchedule returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) ( (lv_targets_1_0= ruleRelativeTarget ) )+ ) ;
    public final EObject ruleRelativeSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_targets_1_0 = null;



        	enterRule();

        try {
            // InternalMenetrend.g:436:2: ( ( ( (otherlv_0= RULE_STRING ) ) ( (lv_targets_1_0= ruleRelativeTarget ) )+ ) )
            // InternalMenetrend.g:437:2: ( ( (otherlv_0= RULE_STRING ) ) ( (lv_targets_1_0= ruleRelativeTarget ) )+ )
            {
            // InternalMenetrend.g:437:2: ( ( (otherlv_0= RULE_STRING ) ) ( (lv_targets_1_0= ruleRelativeTarget ) )+ )
            // InternalMenetrend.g:438:3: ( (otherlv_0= RULE_STRING ) ) ( (lv_targets_1_0= ruleRelativeTarget ) )+
            {
            // InternalMenetrend.g:438:3: ( (otherlv_0= RULE_STRING ) )
            // InternalMenetrend.g:439:4: (otherlv_0= RULE_STRING )
            {
            // InternalMenetrend.g:439:4: (otherlv_0= RULE_STRING )
            // InternalMenetrend.g:440:5: otherlv_0= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelativeScheduleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getRelativeScheduleAccess().getStartStopCrossReference_0_0());
            				

            }


            }

            // InternalMenetrend.g:451:3: ( (lv_targets_1_0= ruleRelativeTarget ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMenetrend.g:452:4: (lv_targets_1_0= ruleRelativeTarget )
            	    {
            	    // InternalMenetrend.g:452:4: (lv_targets_1_0= ruleRelativeTarget )
            	    // InternalMenetrend.g:453:5: lv_targets_1_0= ruleRelativeTarget
            	    {

            	    					newCompositeNode(grammarAccess.getRelativeScheduleAccess().getTargetsRelativeTargetParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_targets_1_0=ruleRelativeTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelativeScheduleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_1_0,
            	    						"hu.bme.aut.menetrend.Menetrend.RelativeTarget");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleRelativeSchedule"


    // $ANTLR start "entryRuleRelativeTarget"
    // InternalMenetrend.g:474:1: entryRuleRelativeTarget returns [EObject current=null] : iv_ruleRelativeTarget= ruleRelativeTarget EOF ;
    public final EObject entryRuleRelativeTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeTarget = null;


        try {
            // InternalMenetrend.g:474:55: (iv_ruleRelativeTarget= ruleRelativeTarget EOF )
            // InternalMenetrend.g:475:2: iv_ruleRelativeTarget= ruleRelativeTarget EOF
            {
             newCompositeNode(grammarAccess.getRelativeTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeTarget=ruleRelativeTarget();

            state._fsp--;

             current =iv_ruleRelativeTarget; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelativeTarget"


    // $ANTLR start "ruleRelativeTarget"
    // InternalMenetrend.g:481:1: ruleRelativeTarget returns [EObject current=null] : (otherlv_0= '-[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']->' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleRelativeTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_length_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMenetrend.g:487:2: ( (otherlv_0= '-[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']->' ( (otherlv_3= RULE_STRING ) ) ) )
            // InternalMenetrend.g:488:2: (otherlv_0= '-[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']->' ( (otherlv_3= RULE_STRING ) ) )
            {
            // InternalMenetrend.g:488:2: (otherlv_0= '-[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']->' ( (otherlv_3= RULE_STRING ) ) )
            // InternalMenetrend.g:489:3: otherlv_0= '-[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']->' ( (otherlv_3= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeTargetAccess().getHyphenMinusLeftSquareBracketKeyword_0());
            		
            // InternalMenetrend.g:493:3: ( (lv_length_1_0= RULE_INT ) )
            // InternalMenetrend.g:494:4: (lv_length_1_0= RULE_INT )
            {
            // InternalMenetrend.g:494:4: (lv_length_1_0= RULE_INT )
            // InternalMenetrend.g:495:5: lv_length_1_0= RULE_INT
            {
            lv_length_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_length_1_0, grammarAccess.getRelativeTargetAccess().getLengthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelativeTargetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeTargetAccess().getRightSquareBracketHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalMenetrend.g:515:3: ( (otherlv_3= RULE_STRING ) )
            // InternalMenetrend.g:516:4: (otherlv_3= RULE_STRING )
            {
            // InternalMenetrend.g:516:4: (otherlv_3= RULE_STRING )
            // InternalMenetrend.g:517:5: otherlv_3= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelativeTargetRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getRelativeTargetAccess().getTargetStopCrossReference_3_0());
            				

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
    // $ANTLR end "ruleRelativeTarget"


    // $ANTLR start "entryRuleAbsoluteSchedule"
    // InternalMenetrend.g:532:1: entryRuleAbsoluteSchedule returns [EObject current=null] : iv_ruleAbsoluteSchedule= ruleAbsoluteSchedule EOF ;
    public final EObject entryRuleAbsoluteSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteSchedule = null;


        try {
            // InternalMenetrend.g:532:57: (iv_ruleAbsoluteSchedule= ruleAbsoluteSchedule EOF )
            // InternalMenetrend.g:533:2: iv_ruleAbsoluteSchedule= ruleAbsoluteSchedule EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsoluteSchedule=ruleAbsoluteSchedule();

            state._fsp--;

             current =iv_ruleAbsoluteSchedule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbsoluteSchedule"


    // $ANTLR start "ruleAbsoluteSchedule"
    // InternalMenetrend.g:539:1: ruleAbsoluteSchedule returns [EObject current=null] : ( ( (lv_daytype_0_0= ruleDayType ) ) ( (lv_departures_1_0= ruleDeparture ) ) ( (otherlv_2= ',' | otherlv_3= '...' ) ( (lv_departures_4_0= ruleDeparture ) ) )* ) ;
    public final EObject ruleAbsoluteSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_daytype_0_0 = null;

        EObject lv_departures_1_0 = null;

        EObject lv_departures_4_0 = null;



        	enterRule();

        try {
            // InternalMenetrend.g:545:2: ( ( ( (lv_daytype_0_0= ruleDayType ) ) ( (lv_departures_1_0= ruleDeparture ) ) ( (otherlv_2= ',' | otherlv_3= '...' ) ( (lv_departures_4_0= ruleDeparture ) ) )* ) )
            // InternalMenetrend.g:546:2: ( ( (lv_daytype_0_0= ruleDayType ) ) ( (lv_departures_1_0= ruleDeparture ) ) ( (otherlv_2= ',' | otherlv_3= '...' ) ( (lv_departures_4_0= ruleDeparture ) ) )* )
            {
            // InternalMenetrend.g:546:2: ( ( (lv_daytype_0_0= ruleDayType ) ) ( (lv_departures_1_0= ruleDeparture ) ) ( (otherlv_2= ',' | otherlv_3= '...' ) ( (lv_departures_4_0= ruleDeparture ) ) )* )
            // InternalMenetrend.g:547:3: ( (lv_daytype_0_0= ruleDayType ) ) ( (lv_departures_1_0= ruleDeparture ) ) ( (otherlv_2= ',' | otherlv_3= '...' ) ( (lv_departures_4_0= ruleDeparture ) ) )*
            {
            // InternalMenetrend.g:547:3: ( (lv_daytype_0_0= ruleDayType ) )
            // InternalMenetrend.g:548:4: (lv_daytype_0_0= ruleDayType )
            {
            // InternalMenetrend.g:548:4: (lv_daytype_0_0= ruleDayType )
            // InternalMenetrend.g:549:5: lv_daytype_0_0= ruleDayType
            {

            					newCompositeNode(grammarAccess.getAbsoluteScheduleAccess().getDaytypeDayTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_daytype_0_0=ruleDayType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteScheduleRule());
            					}
            					set(
            						current,
            						"daytype",
            						lv_daytype_0_0,
            						"hu.bme.aut.menetrend.Menetrend.DayType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMenetrend.g:566:3: ( (lv_departures_1_0= ruleDeparture ) )
            // InternalMenetrend.g:567:4: (lv_departures_1_0= ruleDeparture )
            {
            // InternalMenetrend.g:567:4: (lv_departures_1_0= ruleDeparture )
            // InternalMenetrend.g:568:5: lv_departures_1_0= ruleDeparture
            {

            					newCompositeNode(grammarAccess.getAbsoluteScheduleAccess().getDeparturesDepartureParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_departures_1_0=ruleDeparture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteScheduleRule());
            					}
            					add(
            						current,
            						"departures",
            						lv_departures_1_0,
            						"hu.bme.aut.menetrend.Menetrend.Departure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMenetrend.g:585:3: ( (otherlv_2= ',' | otherlv_3= '...' ) ( (lv_departures_4_0= ruleDeparture ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMenetrend.g:586:4: (otherlv_2= ',' | otherlv_3= '...' ) ( (lv_departures_4_0= ruleDeparture ) )
            	    {
            	    // InternalMenetrend.g:586:4: (otherlv_2= ',' | otherlv_3= '...' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==19) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==26) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMenetrend.g:587:5: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,19,FOLLOW_17); 

            	            					newLeafNode(otherlv_2, grammarAccess.getAbsoluteScheduleAccess().getCommaKeyword_2_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMenetrend.g:592:5: otherlv_3= '...'
            	            {
            	            otherlv_3=(Token)match(input,26,FOLLOW_17); 

            	            					newLeafNode(otherlv_3, grammarAccess.getAbsoluteScheduleAccess().getFullStopFullStopFullStopKeyword_2_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalMenetrend.g:597:4: ( (lv_departures_4_0= ruleDeparture ) )
            	    // InternalMenetrend.g:598:5: (lv_departures_4_0= ruleDeparture )
            	    {
            	    // InternalMenetrend.g:598:5: (lv_departures_4_0= ruleDeparture )
            	    // InternalMenetrend.g:599:6: lv_departures_4_0= ruleDeparture
            	    {

            	    						newCompositeNode(grammarAccess.getAbsoluteScheduleAccess().getDeparturesDepartureParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_departures_4_0=ruleDeparture();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAbsoluteScheduleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"departures",
            	    							lv_departures_4_0,
            	    							"hu.bme.aut.menetrend.Menetrend.Departure");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleAbsoluteSchedule"


    // $ANTLR start "entryRuleDeparture"
    // InternalMenetrend.g:621:1: entryRuleDeparture returns [EObject current=null] : iv_ruleDeparture= ruleDeparture EOF ;
    public final EObject entryRuleDeparture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeparture = null;


        try {
            // InternalMenetrend.g:621:50: (iv_ruleDeparture= ruleDeparture EOF )
            // InternalMenetrend.g:622:2: iv_ruleDeparture= ruleDeparture EOF
            {
             newCompositeNode(grammarAccess.getDepartureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeparture=ruleDeparture();

            state._fsp--;

             current =iv_ruleDeparture; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeparture"


    // $ANTLR start "ruleDeparture"
    // InternalMenetrend.g:628:1: ruleDeparture returns [EObject current=null] : (this_SimpleTimeFormat_0= ruleSimpleTimeFormat | this_ComplexTimeMiddle_1= ruleComplexTimeMiddle | this_ComplexTimeEnd_2= ruleComplexTimeEnd ) ;
    public final EObject ruleDeparture() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleTimeFormat_0 = null;

        EObject this_ComplexTimeMiddle_1 = null;

        EObject this_ComplexTimeEnd_2 = null;



        	enterRule();

        try {
            // InternalMenetrend.g:634:2: ( (this_SimpleTimeFormat_0= ruleSimpleTimeFormat | this_ComplexTimeMiddle_1= ruleComplexTimeMiddle | this_ComplexTimeEnd_2= ruleComplexTimeEnd ) )
            // InternalMenetrend.g:635:2: (this_SimpleTimeFormat_0= ruleSimpleTimeFormat | this_ComplexTimeMiddle_1= ruleComplexTimeMiddle | this_ComplexTimeEnd_2= ruleComplexTimeEnd )
            {
            // InternalMenetrend.g:635:2: (this_SimpleTimeFormat_0= ruleSimpleTimeFormat | this_ComplexTimeMiddle_1= ruleComplexTimeMiddle | this_ComplexTimeEnd_2= ruleComplexTimeEnd )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_TIME_FORMAT) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt9=2;
                    }
                    break;
                case 27:
                    {
                    alt9=3;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 19:
                case 21:
                case 26:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                    {
                    alt9=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMenetrend.g:636:3: this_SimpleTimeFormat_0= ruleSimpleTimeFormat
                    {

                    			newCompositeNode(grammarAccess.getDepartureAccess().getSimpleTimeFormatParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleTimeFormat_0=ruleSimpleTimeFormat();

                    state._fsp--;


                    			current = this_SimpleTimeFormat_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:645:3: this_ComplexTimeMiddle_1= ruleComplexTimeMiddle
                    {

                    			newCompositeNode(grammarAccess.getDepartureAccess().getComplexTimeMiddleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexTimeMiddle_1=ruleComplexTimeMiddle();

                    state._fsp--;


                    			current = this_ComplexTimeMiddle_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMenetrend.g:654:3: this_ComplexTimeEnd_2= ruleComplexTimeEnd
                    {

                    			newCompositeNode(grammarAccess.getDepartureAccess().getComplexTimeEndParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexTimeEnd_2=ruleComplexTimeEnd();

                    state._fsp--;


                    			current = this_ComplexTimeEnd_2;
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
    // $ANTLR end "ruleDeparture"


    // $ANTLR start "entryRuleSimpleTimeFormat"
    // InternalMenetrend.g:666:1: entryRuleSimpleTimeFormat returns [EObject current=null] : iv_ruleSimpleTimeFormat= ruleSimpleTimeFormat EOF ;
    public final EObject entryRuleSimpleTimeFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTimeFormat = null;


        try {
            // InternalMenetrend.g:666:57: (iv_ruleSimpleTimeFormat= ruleSimpleTimeFormat EOF )
            // InternalMenetrend.g:667:2: iv_ruleSimpleTimeFormat= ruleSimpleTimeFormat EOF
            {
             newCompositeNode(grammarAccess.getSimpleTimeFormatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleTimeFormat=ruleSimpleTimeFormat();

            state._fsp--;

             current =iv_ruleSimpleTimeFormat; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleTimeFormat"


    // $ANTLR start "ruleSimpleTimeFormat"
    // InternalMenetrend.g:673:1: ruleSimpleTimeFormat returns [EObject current=null] : ( (lv_from_0_0= RULE_TIME_FORMAT ) ) ;
    public final EObject ruleSimpleTimeFormat() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;


        	enterRule();

        try {
            // InternalMenetrend.g:679:2: ( ( (lv_from_0_0= RULE_TIME_FORMAT ) ) )
            // InternalMenetrend.g:680:2: ( (lv_from_0_0= RULE_TIME_FORMAT ) )
            {
            // InternalMenetrend.g:680:2: ( (lv_from_0_0= RULE_TIME_FORMAT ) )
            // InternalMenetrend.g:681:3: (lv_from_0_0= RULE_TIME_FORMAT )
            {
            // InternalMenetrend.g:681:3: (lv_from_0_0= RULE_TIME_FORMAT )
            // InternalMenetrend.g:682:4: lv_from_0_0= RULE_TIME_FORMAT
            {
            lv_from_0_0=(Token)match(input,RULE_TIME_FORMAT,FOLLOW_2); 

            				newLeafNode(lv_from_0_0, grammarAccess.getSimpleTimeFormatAccess().getFromTIME_FORMATTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSimpleTimeFormatRule());
            				}
            				setWithLastConsumed(
            					current,
            					"from",
            					lv_from_0_0,
            					"hu.bme.aut.menetrend.Menetrend.TIME_FORMAT");
            			

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
    // $ANTLR end "ruleSimpleTimeFormat"


    // $ANTLR start "entryRuleComplexTimeMiddle"
    // InternalMenetrend.g:701:1: entryRuleComplexTimeMiddle returns [EObject current=null] : iv_ruleComplexTimeMiddle= ruleComplexTimeMiddle EOF ;
    public final EObject entryRuleComplexTimeMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTimeMiddle = null;


        try {
            // InternalMenetrend.g:701:58: (iv_ruleComplexTimeMiddle= ruleComplexTimeMiddle EOF )
            // InternalMenetrend.g:702:2: iv_ruleComplexTimeMiddle= ruleComplexTimeMiddle EOF
            {
             newCompositeNode(grammarAccess.getComplexTimeMiddleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexTimeMiddle=ruleComplexTimeMiddle();

            state._fsp--;

             current =iv_ruleComplexTimeMiddle; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplexTimeMiddle"


    // $ANTLR start "ruleComplexTimeMiddle"
    // InternalMenetrend.g:708:1: ruleComplexTimeMiddle returns [EObject current=null] : ( ( (lv_from_0_0= RULE_TIME_FORMAT ) ) otherlv_1= '-' ( (lv_until_2_0= RULE_TIME_FORMAT ) ) otherlv_3= '/' ( (lv_frequency_4_0= RULE_INT ) ) ) ;
    public final EObject ruleComplexTimeMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_until_2_0=null;
        Token otherlv_3=null;
        Token lv_frequency_4_0=null;


        	enterRule();

        try {
            // InternalMenetrend.g:714:2: ( ( ( (lv_from_0_0= RULE_TIME_FORMAT ) ) otherlv_1= '-' ( (lv_until_2_0= RULE_TIME_FORMAT ) ) otherlv_3= '/' ( (lv_frequency_4_0= RULE_INT ) ) ) )
            // InternalMenetrend.g:715:2: ( ( (lv_from_0_0= RULE_TIME_FORMAT ) ) otherlv_1= '-' ( (lv_until_2_0= RULE_TIME_FORMAT ) ) otherlv_3= '/' ( (lv_frequency_4_0= RULE_INT ) ) )
            {
            // InternalMenetrend.g:715:2: ( ( (lv_from_0_0= RULE_TIME_FORMAT ) ) otherlv_1= '-' ( (lv_until_2_0= RULE_TIME_FORMAT ) ) otherlv_3= '/' ( (lv_frequency_4_0= RULE_INT ) ) )
            // InternalMenetrend.g:716:3: ( (lv_from_0_0= RULE_TIME_FORMAT ) ) otherlv_1= '-' ( (lv_until_2_0= RULE_TIME_FORMAT ) ) otherlv_3= '/' ( (lv_frequency_4_0= RULE_INT ) )
            {
            // InternalMenetrend.g:716:3: ( (lv_from_0_0= RULE_TIME_FORMAT ) )
            // InternalMenetrend.g:717:4: (lv_from_0_0= RULE_TIME_FORMAT )
            {
            // InternalMenetrend.g:717:4: (lv_from_0_0= RULE_TIME_FORMAT )
            // InternalMenetrend.g:718:5: lv_from_0_0= RULE_TIME_FORMAT
            {
            lv_from_0_0=(Token)match(input,RULE_TIME_FORMAT,FOLLOW_11); 

            					newLeafNode(lv_from_0_0, grammarAccess.getComplexTimeMiddleAccess().getFromTIME_FORMATTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexTimeMiddleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"from",
            						lv_from_0_0,
            						"hu.bme.aut.menetrend.Menetrend.TIME_FORMAT");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTimeMiddleAccess().getHyphenMinusKeyword_1());
            		
            // InternalMenetrend.g:738:3: ( (lv_until_2_0= RULE_TIME_FORMAT ) )
            // InternalMenetrend.g:739:4: (lv_until_2_0= RULE_TIME_FORMAT )
            {
            // InternalMenetrend.g:739:4: (lv_until_2_0= RULE_TIME_FORMAT )
            // InternalMenetrend.g:740:5: lv_until_2_0= RULE_TIME_FORMAT
            {
            lv_until_2_0=(Token)match(input,RULE_TIME_FORMAT,FOLLOW_19); 

            					newLeafNode(lv_until_2_0, grammarAccess.getComplexTimeMiddleAccess().getUntilTIME_FORMATTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexTimeMiddleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"until",
            						lv_until_2_0,
            						"hu.bme.aut.menetrend.Menetrend.TIME_FORMAT");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexTimeMiddleAccess().getSolidusKeyword_3());
            		
            // InternalMenetrend.g:760:3: ( (lv_frequency_4_0= RULE_INT ) )
            // InternalMenetrend.g:761:4: (lv_frequency_4_0= RULE_INT )
            {
            // InternalMenetrend.g:761:4: (lv_frequency_4_0= RULE_INT )
            // InternalMenetrend.g:762:5: lv_frequency_4_0= RULE_INT
            {
            lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_frequency_4_0, grammarAccess.getComplexTimeMiddleAccess().getFrequencyINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexTimeMiddleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleComplexTimeMiddle"


    // $ANTLR start "entryRuleComplexTimeEnd"
    // InternalMenetrend.g:782:1: entryRuleComplexTimeEnd returns [EObject current=null] : iv_ruleComplexTimeEnd= ruleComplexTimeEnd EOF ;
    public final EObject entryRuleComplexTimeEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTimeEnd = null;


        try {
            // InternalMenetrend.g:782:55: (iv_ruleComplexTimeEnd= ruleComplexTimeEnd EOF )
            // InternalMenetrend.g:783:2: iv_ruleComplexTimeEnd= ruleComplexTimeEnd EOF
            {
             newCompositeNode(grammarAccess.getComplexTimeEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexTimeEnd=ruleComplexTimeEnd();

            state._fsp--;

             current =iv_ruleComplexTimeEnd; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplexTimeEnd"


    // $ANTLR start "ruleComplexTimeEnd"
    // InternalMenetrend.g:789:1: ruleComplexTimeEnd returns [EObject current=null] : ( ( (lv_from_0_0= RULE_TIME_FORMAT ) ) otherlv_1= '/' ( (lv_frequency_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_until_4_0= RULE_TIME_FORMAT ) ) ) ;
    public final EObject ruleComplexTimeEnd() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_frequency_2_0=null;
        Token otherlv_3=null;
        Token lv_until_4_0=null;


        	enterRule();

        try {
            // InternalMenetrend.g:795:2: ( ( ( (lv_from_0_0= RULE_TIME_FORMAT ) ) otherlv_1= '/' ( (lv_frequency_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_until_4_0= RULE_TIME_FORMAT ) ) ) )
            // InternalMenetrend.g:796:2: ( ( (lv_from_0_0= RULE_TIME_FORMAT ) ) otherlv_1= '/' ( (lv_frequency_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_until_4_0= RULE_TIME_FORMAT ) ) )
            {
            // InternalMenetrend.g:796:2: ( ( (lv_from_0_0= RULE_TIME_FORMAT ) ) otherlv_1= '/' ( (lv_frequency_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_until_4_0= RULE_TIME_FORMAT ) ) )
            // InternalMenetrend.g:797:3: ( (lv_from_0_0= RULE_TIME_FORMAT ) ) otherlv_1= '/' ( (lv_frequency_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_until_4_0= RULE_TIME_FORMAT ) )
            {
            // InternalMenetrend.g:797:3: ( (lv_from_0_0= RULE_TIME_FORMAT ) )
            // InternalMenetrend.g:798:4: (lv_from_0_0= RULE_TIME_FORMAT )
            {
            // InternalMenetrend.g:798:4: (lv_from_0_0= RULE_TIME_FORMAT )
            // InternalMenetrend.g:799:5: lv_from_0_0= RULE_TIME_FORMAT
            {
            lv_from_0_0=(Token)match(input,RULE_TIME_FORMAT,FOLLOW_19); 

            					newLeafNode(lv_from_0_0, grammarAccess.getComplexTimeEndAccess().getFromTIME_FORMATTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexTimeEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"from",
            						lv_from_0_0,
            						"hu.bme.aut.menetrend.Menetrend.TIME_FORMAT");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTimeEndAccess().getSolidusKeyword_1());
            		
            // InternalMenetrend.g:819:3: ( (lv_frequency_2_0= RULE_INT ) )
            // InternalMenetrend.g:820:4: (lv_frequency_2_0= RULE_INT )
            {
            // InternalMenetrend.g:820:4: (lv_frequency_2_0= RULE_INT )
            // InternalMenetrend.g:821:5: lv_frequency_2_0= RULE_INT
            {
            lv_frequency_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_frequency_2_0, grammarAccess.getComplexTimeEndAccess().getFrequencyINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexTimeEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexTimeEndAccess().getSolidusKeyword_3());
            		
            // InternalMenetrend.g:841:3: ( (lv_until_4_0= RULE_TIME_FORMAT ) )
            // InternalMenetrend.g:842:4: (lv_until_4_0= RULE_TIME_FORMAT )
            {
            // InternalMenetrend.g:842:4: (lv_until_4_0= RULE_TIME_FORMAT )
            // InternalMenetrend.g:843:5: lv_until_4_0= RULE_TIME_FORMAT
            {
            lv_until_4_0=(Token)match(input,RULE_TIME_FORMAT,FOLLOW_2); 

            					newLeafNode(lv_until_4_0, grammarAccess.getComplexTimeEndAccess().getUntilTIME_FORMATTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexTimeEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"until",
            						lv_until_4_0,
            						"hu.bme.aut.menetrend.Menetrend.TIME_FORMAT");
            				

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
    // $ANTLR end "ruleComplexTimeEnd"


    // $ANTLR start "entryRuleStop"
    // InternalMenetrend.g:863:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalMenetrend.g:863:45: (iv_ruleStop= ruleStop EOF )
            // InternalMenetrend.g:864:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalMenetrend.g:870:1: ruleStop returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMenetrend.g:876:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalMenetrend.g:877:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalMenetrend.g:877:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMenetrend.g:878:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalMenetrend.g:878:3: (lv_name_0_0= RULE_STRING )
            // InternalMenetrend.g:879:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStopAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStopRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStop"


    // $ANTLR start "ruleTransportType"
    // InternalMenetrend.g:898:1: ruleTransportType returns [Enumerator current=null] : ( (enumLiteral_0= 'Bus' ) | (enumLiteral_1= 'Tram' ) | (enumLiteral_2= 'Metro' ) | (enumLiteral_3= 'Troli' ) | (enumLiteral_4= 'Hev' ) ) ;
    public final Enumerator ruleTransportType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMenetrend.g:904:2: ( ( (enumLiteral_0= 'Bus' ) | (enumLiteral_1= 'Tram' ) | (enumLiteral_2= 'Metro' ) | (enumLiteral_3= 'Troli' ) | (enumLiteral_4= 'Hev' ) ) )
            // InternalMenetrend.g:905:2: ( (enumLiteral_0= 'Bus' ) | (enumLiteral_1= 'Tram' ) | (enumLiteral_2= 'Metro' ) | (enumLiteral_3= 'Troli' ) | (enumLiteral_4= 'Hev' ) )
            {
            // InternalMenetrend.g:905:2: ( (enumLiteral_0= 'Bus' ) | (enumLiteral_1= 'Tram' ) | (enumLiteral_2= 'Metro' ) | (enumLiteral_3= 'Troli' ) | (enumLiteral_4= 'Hev' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            case 31:
                {
                alt10=4;
                }
                break;
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
                    // InternalMenetrend.g:906:3: (enumLiteral_0= 'Bus' )
                    {
                    // InternalMenetrend.g:906:3: (enumLiteral_0= 'Bus' )
                    // InternalMenetrend.g:907:4: enumLiteral_0= 'Bus'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTransportTypeAccess().getBUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTransportTypeAccess().getBUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:914:3: (enumLiteral_1= 'Tram' )
                    {
                    // InternalMenetrend.g:914:3: (enumLiteral_1= 'Tram' )
                    // InternalMenetrend.g:915:4: enumLiteral_1= 'Tram'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTransportTypeAccess().getTRAMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTransportTypeAccess().getTRAMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMenetrend.g:922:3: (enumLiteral_2= 'Metro' )
                    {
                    // InternalMenetrend.g:922:3: (enumLiteral_2= 'Metro' )
                    // InternalMenetrend.g:923:4: enumLiteral_2= 'Metro'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTransportTypeAccess().getMETROEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTransportTypeAccess().getMETROEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMenetrend.g:930:3: (enumLiteral_3= 'Troli' )
                    {
                    // InternalMenetrend.g:930:3: (enumLiteral_3= 'Troli' )
                    // InternalMenetrend.g:931:4: enumLiteral_3= 'Troli'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTransportTypeAccess().getTROLIEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTransportTypeAccess().getTROLIEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMenetrend.g:938:3: (enumLiteral_4= 'Hev' )
                    {
                    // InternalMenetrend.g:938:3: (enumLiteral_4= 'Hev' )
                    // InternalMenetrend.g:939:4: enumLiteral_4= 'Hev'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTransportTypeAccess().getHEVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTransportTypeAccess().getHEVEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleTransportType"


    // $ANTLR start "ruleDayType"
    // InternalMenetrend.g:949:1: ruleDayType returns [Enumerator current=null] : ( (enumLiteral_0= 'weekdays' ) | (enumLiteral_1= 'weekends' ) | (enumLiteral_2= 'monday' ) | (enumLiteral_3= 'tuesday' ) | (enumLiteral_4= 'wednesday' ) | (enumLiteral_5= 'thursday' ) | (enumLiteral_6= 'friday' ) | (enumLiteral_7= 'saturday' ) | (enumLiteral_8= 'sunday' ) ) ;
    public final Enumerator ruleDayType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalMenetrend.g:955:2: ( ( (enumLiteral_0= 'weekdays' ) | (enumLiteral_1= 'weekends' ) | (enumLiteral_2= 'monday' ) | (enumLiteral_3= 'tuesday' ) | (enumLiteral_4= 'wednesday' ) | (enumLiteral_5= 'thursday' ) | (enumLiteral_6= 'friday' ) | (enumLiteral_7= 'saturday' ) | (enumLiteral_8= 'sunday' ) ) )
            // InternalMenetrend.g:956:2: ( (enumLiteral_0= 'weekdays' ) | (enumLiteral_1= 'weekends' ) | (enumLiteral_2= 'monday' ) | (enumLiteral_3= 'tuesday' ) | (enumLiteral_4= 'wednesday' ) | (enumLiteral_5= 'thursday' ) | (enumLiteral_6= 'friday' ) | (enumLiteral_7= 'saturday' ) | (enumLiteral_8= 'sunday' ) )
            {
            // InternalMenetrend.g:956:2: ( (enumLiteral_0= 'weekdays' ) | (enumLiteral_1= 'weekends' ) | (enumLiteral_2= 'monday' ) | (enumLiteral_3= 'tuesday' ) | (enumLiteral_4= 'wednesday' ) | (enumLiteral_5= 'thursday' ) | (enumLiteral_6= 'friday' ) | (enumLiteral_7= 'saturday' ) | (enumLiteral_8= 'sunday' ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case 35:
                {
                alt11=3;
                }
                break;
            case 36:
                {
                alt11=4;
                }
                break;
            case 37:
                {
                alt11=5;
                }
                break;
            case 38:
                {
                alt11=6;
                }
                break;
            case 39:
                {
                alt11=7;
                }
                break;
            case 40:
                {
                alt11=8;
                }
                break;
            case 41:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMenetrend.g:957:3: (enumLiteral_0= 'weekdays' )
                    {
                    // InternalMenetrend.g:957:3: (enumLiteral_0= 'weekdays' )
                    // InternalMenetrend.g:958:4: enumLiteral_0= 'weekdays'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDayTypeAccess().getWEEKDAYSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDayTypeAccess().getWEEKDAYSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMenetrend.g:965:3: (enumLiteral_1= 'weekends' )
                    {
                    // InternalMenetrend.g:965:3: (enumLiteral_1= 'weekends' )
                    // InternalMenetrend.g:966:4: enumLiteral_1= 'weekends'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDayTypeAccess().getWEEKENDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDayTypeAccess().getWEEKENDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMenetrend.g:973:3: (enumLiteral_2= 'monday' )
                    {
                    // InternalMenetrend.g:973:3: (enumLiteral_2= 'monday' )
                    // InternalMenetrend.g:974:4: enumLiteral_2= 'monday'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDayTypeAccess().getMONDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDayTypeAccess().getMONDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMenetrend.g:981:3: (enumLiteral_3= 'tuesday' )
                    {
                    // InternalMenetrend.g:981:3: (enumLiteral_3= 'tuesday' )
                    // InternalMenetrend.g:982:4: enumLiteral_3= 'tuesday'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDayTypeAccess().getTUESDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDayTypeAccess().getTUESDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMenetrend.g:989:3: (enumLiteral_4= 'wednesday' )
                    {
                    // InternalMenetrend.g:989:3: (enumLiteral_4= 'wednesday' )
                    // InternalMenetrend.g:990:4: enumLiteral_4= 'wednesday'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDayTypeAccess().getWEDNESDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDayTypeAccess().getWEDNESDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMenetrend.g:997:3: (enumLiteral_5= 'thursday' )
                    {
                    // InternalMenetrend.g:997:3: (enumLiteral_5= 'thursday' )
                    // InternalMenetrend.g:998:4: enumLiteral_5= 'thursday'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDayTypeAccess().getTHURSDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDayTypeAccess().getTHURSDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMenetrend.g:1005:3: (enumLiteral_6= 'friday' )
                    {
                    // InternalMenetrend.g:1005:3: (enumLiteral_6= 'friday' )
                    // InternalMenetrend.g:1006:4: enumLiteral_6= 'friday'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDayTypeAccess().getFRIDAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDayTypeAccess().getFRIDAYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMenetrend.g:1013:3: (enumLiteral_7= 'saturday' )
                    {
                    // InternalMenetrend.g:1013:3: (enumLiteral_7= 'saturday' )
                    // InternalMenetrend.g:1014:4: enumLiteral_7= 'saturday'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDayTypeAccess().getSATURDAYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDayTypeAccess().getSATURDAYEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMenetrend.g:1021:3: (enumLiteral_8= 'sunday' )
                    {
                    // InternalMenetrend.g:1021:3: (enumLiteral_8= 'sunday' )
                    // InternalMenetrend.g:1022:4: enumLiteral_8= 'sunday'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDayTypeAccess().getSUNDAYEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDayTypeAccess().getSUNDAYEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleDayType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000003FE00000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000003FE00000082L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004080002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});

}