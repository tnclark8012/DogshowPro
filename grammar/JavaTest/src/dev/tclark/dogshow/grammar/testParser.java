// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-02-27 01:09:45

package dev.tclark.dogshow.grammar;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class testParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_GROUP_NAME", "FRAG_MONTH", "FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_PROPER_NAME", "FRAG_RING", "FRAG_SPECIAL_GROUP_NAME", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "GROUP_RING", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "PROPER_NAME", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
	};

	public static final int EOF=-1;
	public static final int ATOM=4;
	public static final int BREED_COUNT=5;
	public static final int BREED_NAME=6;
	public static final int BREED_NAME_SUFFIX=7;
	public static final int COMMENT=8;
	public static final int DATE=9;
	public static final int ELLIPSIS=10;
	public static final int END_PUNCTUATION=11;
	public static final int FRAG_BREED_NAME_ALT=12;
	public static final int FRAG_BREED_NAME_CATEGORY=13;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=14;
	public static final int FRAG_BREED_NAME_SINGLE=15;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=16;
	public static final int FRAG_GROUP_NAME=17;
	public static final int FRAG_MONTH=18;
	public static final int FRAG_PAREN_LEFT=19;
	public static final int FRAG_PAREN_RIGHT=20;
	public static final int FRAG_PROPER_NAME=21;
	public static final int FRAG_RING=22;
	public static final int FRAG_SPECIAL_GROUP_NAME=23;
	public static final int FRAG_SPEC_CHAR=24;
	public static final int FRAG_SPEC_WORD_CHAR=25;
	public static final int FRAG_TIME_LABEL=26;
	public static final int FRAG_TITLE=27;
	public static final int FRAG_WEEK_DAY=28;
	public static final int GROUP_RING=29;
	public static final int INT=30;
	public static final int JUDGE_NAME=31;
	public static final int JUNIOR_CLASS=32;
	public static final int PARENTHETICAL=33;
	public static final int PARENTHETICAL_INT=34;
	public static final int PARENTHETICAL_NAME=35;
	public static final int PHONE_NUMBER=36;
	public static final int PROPER_NAME=37;
	public static final int RING_TITLE=38;
	public static final int SPECIAL_SUFFIX=39;
	public static final int STANDALONE_COMMENT=40;
	public static final int TIME=41;
	public static final int WORD=42;
	public static final int WS=43;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


public static final String[] ruleNames = new String[] {
	"invalidRule", "synpred23_test", "synpred2_test", "breed_ring", "test_special", 
    "inner_ring", "synpred31_test", "judge_block", "ring_comment", "junior_ring", 
    "synpred32_test", "synpred17_test", "synpred28_test", "synpred5_test", 
    "synpred6_test", "synpred14_test", "synpred9_test", "synpred16_test", 
    "synpred20_test", "synpred19_test", "synpred1_test", "synpred21_test", 
    "synpred22_test", "big_comment", "inner_timeblock", "group_ring", "synpred3_test", 
    "special_ring", "synpred25_test", "synpred24_test", "timeblock_comment", 
    "synpred13_test", "synpred8_test", "synpred30_test", "ring", "synpred27_test", 
    "synpred33_test", "group_block", "timeblock", "synpred10_test", "synpred26_test", 
    "synpred11_test", "synpred34_test", "synpred12_test", "start", "test_breed", 
    "synpred7_test", "synpred29_test", "synpred4_test", "synpred18_test", 
    "synpred15_test", "comment"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
	false, // invalid decision
	false, true, false, false, true, false, true, false, false, false, false, 
	    true, true, true, true, false, true, false, false, false, false, false
};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public testParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public testParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

public testParser(TokenStream input, DebugEventListener dbg) {
	super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
	dbg.semanticPredicate(result, predicate);
	return result;
}

	@Override public String[] getTokenNames() { return testParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g"; }


	  private boolean ahead(String text) {
	    System.out.println("Does " + input.toString() + " contain " + text + "?");
	    return input.toString().contains(text);
	  }



	// $ANTLR start "test_special"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "test_special");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:13: ( ( special_ring )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:17: ( special_ring )+
			{
			dbg.location(20,17);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:17: ( special_ring )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			do {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==INT) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:17: special_ring
					{
					dbg.location(20,17);
					pushFollow(FOLLOW_special_ring_in_test_special40);
					special_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(1, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt1++;
			} while (true);
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 29);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "test_special");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "test_special"



	// $ANTLR start "test_breed"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:1: test_breed : breed_ring ;
	public final void test_breed() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "test_breed");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:5: ( breed_ring )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:9: breed_ring
			{
			dbg.location(22,9);
			pushFollow(FOLLOW_breed_ring_in_test_breed54);
			breed_ring();
			state._fsp--;
			if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(22, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "test_breed");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "test_breed"



	// $ANTLR start "start"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:23:1: start returns [JsonObject json] : ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray(); System.out.println("starting...");
		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:3: ( ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+ EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:4: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+ EOF
			{
			dbg.location(25,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:4: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+
			int cnt4=0;
			try { dbg.enterSubRule(4);

			loop4:
			do {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==BREED_NAME||(LA4_0 >= COMMENT && LA4_0 <= ELLIPSIS)||(LA4_0 >= GROUP_RING && LA4_0 <= JUDGE_NAME)||LA4_0==PHONE_NUMBER||LA4_0==SPECIAL_SUFFIX||LA4_0==TIME) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:5: (mComment= big_comment )+ ( ( ring )=>mRing= ring )*
					{
					dbg.location(25,5);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:5: (mComment= big_comment )+
					int cnt2=0;
					try { dbg.enterSubRule(2);

					loop2:
					do {
						int alt2=2;
						try { dbg.enterDecision(2, decisionCanBacktrack[2]);

						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA2_2 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case INT:
							{
							int LA2_3 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case JUDGE_NAME:
							{
							int LA2_4 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case DATE:
							{
							int LA2_5 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case PHONE_NUMBER:
							{
							int LA2_6 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case ELLIPSIS:
							{
							int LA2_7 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case TIME:
							{
							int LA2_8 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case BREED_NAME:
							{
							int LA2_9 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case SPECIAL_SUFFIX:
							{
							int LA2_10 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case GROUP_RING:
							{
							int LA2_11 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						}
						} finally {dbg.exitDecision(2);}

						switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:6: mComment= big_comment
							{
							dbg.location(25,14);
							pushFollow(FOLLOW_big_comment_in_start79);
							mComment=big_comment();
							state._fsp--;
							if (state.failed) return json;dbg.location(25,26);
							if ( state.backtracking==0 ) {comments+=mComment;}
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return json;}
								EarlyExitException eee =
									new EarlyExitException(2, input);
								dbg.recognitionException(eee);

								throw eee;
						}
						cnt2++;
					} while (true);
					} finally {dbg.exitSubRule(2);}
					dbg.location(25,55);
					if ( state.backtracking==0 ) {json.addProperty("Comment", comments);}dbg.location(25,95);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:95: ( ( ring )=>mRing= ring )*
					try { dbg.enterSubRule(3);

					loop3:
					do {
						int alt3=2;
						try { dbg.enterDecision(3, decisionCanBacktrack[3]);

						int LA3_0 = input.LA(1);
						if ( (LA3_0==RING_TITLE) && (synpred3_test())) {
							alt3=1;
						}

						} finally {dbg.exitDecision(3);}

						switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:96: ( ring )=>mRing= ring
							{
							dbg.location(25,109);
							pushFollow(FOLLOW_ring_in_start92);
							mRing=ring();
							state._fsp--;
							if (state.failed) return json;dbg.location(25,114);
							if ( state.backtracking==0 ) {ringArray.add(mRing);}
							}
							break;

						default :
							break loop3;
						}
					} while (true);
					} finally {dbg.exitSubRule(3);}

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(4, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt4++;
			} while (true);
			} finally {dbg.exitSubRule(4);}
			dbg.location(25,148);
			if ( state.backtracking==0 ) {json.add("Rings", ringArray);}dbg.location(25,180);
			match(input,EOF,FOLLOW_EOF_in_start101); if (state.failed) return json;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(25, 182);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "start");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "start"



	// $ANTLR start "ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:27:1: ring returns [JsonObject json] : RING_TITLE mRing= inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		Token RING_TITLE1=null;
		JsonObject mRing =null;

		json = new JsonObject();System.out.println("ring...");
		try { dbg.enterRule(getGrammarFileName(), "ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:29:3: ( RING_TITLE mRing= inner_ring )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:29:7: RING_TITLE mRing= inner_ring
			{
			dbg.location(29,7);
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring124); if (state.failed) return json;dbg.location(29,17);
			if ( state.backtracking==0 ) {json.addProperty("Title", (RING_TITLE1!=null?RING_TITLE1.getText():null));}dbg.location(29,69);
			pushFollow(FOLLOW_inner_ring_in_ring129);
			mRing=inner_ring();
			state._fsp--;
			if (state.failed) return json;dbg.location(29,80);
			if ( state.backtracking==0 ) {json.add("Ring", mRing);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 105);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "ring"



	// $ANTLR start "inner_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:1: inner_ring returns [JsonObject json] : ( ( group_block )=>mGroupBlock= group_block | ( (mJudgeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJudgeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "inner_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:2: ( ( group_block )=>mGroupBlock= group_block | ( (mJudgeBlock= judge_block )+ ) )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==TIME) && (synpred5_test())) {
				alt6=1;
			}
			else if ( (LA6_0==JUDGE_NAME) ) {
				alt6=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:5: ( group_block )=>mGroupBlock= group_block
					{
					dbg.location(32,31);
					pushFollow(FOLLOW_group_block_in_inner_ring154);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;dbg.location(32,43);
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:7: ( (mJudgeBlock= judge_block )+ )
					{
					dbg.location(33,7);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:7: ( (mJudgeBlock= judge_block )+ )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:8: (mJudgeBlock= judge_block )+
					{
					dbg.location(33,8);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:8: (mJudgeBlock= judge_block )+
					int cnt5=0;
					try { dbg.enterSubRule(5);

					loop5:
					do {
						int alt5=2;
						try { dbg.enterDecision(5, decisionCanBacktrack[5]);

						int LA5_0 = input.LA(1);
						if ( (LA5_0==JUDGE_NAME) ) {
							int LA5_2 = input.LA(2);
							if ( (LA5_2==TIME) ) {
								int LA5_3 = input.LA(3);
								if ( (LA5_3==INT) ) {
									int LA5_4 = input.LA(4);
									if ( (LA5_4==BREED_NAME) ) {
										int LA5_6 = input.LA(5);
										if ( (synpred6_test()) ) {
											alt5=1;
										}

									}
									else if ( (LA5_4==JUNIOR_CLASS) ) {
										alt5=1;
									}

								}
								else if ( (LA5_3==STANDALONE_COMMENT) ) {
									alt5=1;
								}

							}

						}

						} finally {dbg.exitDecision(5);}

						switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:9: mJudgeBlock= judge_block
							{
							dbg.location(33,20);
							pushFollow(FOLLOW_judge_block_in_inner_ring167);
							mJudgeBlock=judge_block();
							state._fsp--;
							if (state.failed) return json;dbg.location(33,32);
							if ( state.backtracking==0 ) {judgeBlocks.add(mJudgeBlock);}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							if (state.backtracking>0) {state.failed=true; return json;}
								EarlyExitException eee =
									new EarlyExitException(5, input);
								dbg.recognitionException(eee);

								throw eee;
						}
						cnt5++;
					} while (true);
					} finally {dbg.exitSubRule(5);}
					dbg.location(33,66);
					if ( state.backtracking==0 ) {json.add("JudgeBlocks", judgeBlocks);}
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
			// do for sure before leaving
		}
		dbg.location(33, 105);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inner_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "inner_ring"



	// $ANTLR start "judge_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:1: judge_block returns [JsonObject json] : JUDGE_NAME (mBlock= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		Token JUDGE_NAME2=null;
		JsonObject mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "judge_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:5: ( JUDGE_NAME (mBlock= timeblock )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:9: JUDGE_NAME (mBlock= timeblock )+
			{
			dbg.location(36,9);
			JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block195); if (state.failed) return json;dbg.location(36,19);
			if ( state.backtracking==0 ) {json.addProperty("Judge", (JUDGE_NAME2!=null?JUDGE_NAME2.getText():null));}dbg.location(36,66);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:66: (mBlock= timeblock )+
			int cnt7=0;
			try { dbg.enterSubRule(7);

			loop7:
			do {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==TIME) ) {
					int LA7_2 = input.LA(2);
					if ( (LA7_2==INT) ) {
						int LA7_3 = input.LA(3);
						if ( (LA7_3==BREED_NAME) ) {
							int LA7_5 = input.LA(4);
							if ( (synpred7_test()) ) {
								alt7=1;
							}

						}
						else if ( (LA7_3==JUNIOR_CLASS) ) {
							alt7=1;
						}

					}
					else if ( (LA7_2==STANDALONE_COMMENT) ) {
						alt7=1;
					}

				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:67: mBlock= timeblock
					{
					dbg.location(36,73);
					pushFollow(FOLLOW_timeblock_in_judge_block201);
					mBlock=timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(36,83);
					if ( state.backtracking==0 ) {array.add(mBlock);}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(7, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt7++;
			} while (true);
			} finally {dbg.exitSubRule(7);}
			dbg.location(36,106);
			if ( state.backtracking==0 ) {json.add("TimeBlocks", array);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 137);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "judge_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "judge_block"



	// $ANTLR start "big_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:1: big_comment returns [String str] : (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) ;
	public final String big_comment() throws RecognitionException {
		String str = null;


		Token TIME3=null;
		Token BREED_NAME4=null;
		Token SPECIAL_SUFFIX5=null;
		Token GROUP_RING6=null;
		String mComment =null;

		str = null;
		try { dbg.enterRule(getGrammarFileName(), "big_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:3: ( (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:7: (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			{
			dbg.location(40,7);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:7: (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			int alt8=5;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case COMMENT:
			case DATE:
			case ELLIPSIS:
			case INT:
			case JUDGE_NAME:
			case PHONE_NUMBER:
				{
				alt8=1;
				}
				break;
			case TIME:
				{
				alt8=2;
				}
				break;
			case BREED_NAME:
				{
				alt8=3;
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt8=4;
				}
				break;
			case GROUP_RING:
				{
				alt8=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:8: mComment= comment
					{
					dbg.location(40,16);
					pushFollow(FOLLOW_comment_in_big_comment233);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;dbg.location(40,24);
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:42: TIME
					{
					dbg.location(40,42);
					TIME3=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment236); if (state.failed) return str;dbg.location(40,46);
					if ( state.backtracking==0 ) {str=(TIME3!=null?TIME3.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:64: BREED_NAME
					{
					dbg.location(40,64);
					BREED_NAME4=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment239); if (state.failed) return str;dbg.location(40,74);
					if ( state.backtracking==0 ) {str=(BREED_NAME4!=null?BREED_NAME4.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:98: SPECIAL_SUFFIX
					{
					dbg.location(40,98);
					SPECIAL_SUFFIX5=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment242); if (state.failed) return str;dbg.location(40,112);
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX5!=null?SPECIAL_SUFFIX5.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:140: GROUP_RING
					{
					dbg.location(40,140);
					GROUP_RING6=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment245); if (state.failed) return str;dbg.location(40,150);
					if ( state.backtracking==0 ) {str=(GROUP_RING6!=null?GROUP_RING6.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(40, 173);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "big_comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "big_comment"



	// $ANTLR start "comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:41:1: comment returns [String str] : ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS ) ;
	public final String comment() throws RecognitionException {
		String str = null;


		Token COMMENT7=null;
		Token INT8=null;
		Token JUDGE_NAME9=null;
		Token DATE10=null;
		Token PHONE_NUMBER11=null;
		Token ELLIPSIS12=null;

		str = null;
		try { dbg.enterRule(getGrammarFileName(), "comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:3: ( ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:7: ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )
			{
			dbg.location(43,7);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:7: ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )
			int alt9=6;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case COMMENT:
				{
				alt9=1;
				}
				break;
			case INT:
				{
				alt9=2;
				}
				break;
			case JUDGE_NAME:
				{
				alt9=3;
				}
				break;
			case DATE:
				{
				alt9=4;
				}
				break;
			case PHONE_NUMBER:
				{
				alt9=5;
				}
				break;
			case ELLIPSIS:
				{
				alt9=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:8: COMMENT
					{
					dbg.location(43,8);
					COMMENT7=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment270); if (state.failed) return str;dbg.location(43,15);
					if ( state.backtracking==0 ) {str=(COMMENT7!=null?COMMENT7.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:36: INT
					{
					dbg.location(43,36);
					INT8=(Token)match(input,INT,FOLLOW_INT_in_comment273); if (state.failed) return str;dbg.location(43,39);
					if ( state.backtracking==0 ) {str=(INT8!=null?INT8.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:56: JUDGE_NAME
					{
					dbg.location(43,56);
					JUDGE_NAME9=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_comment276); if (state.failed) return str;dbg.location(43,66);
					if ( state.backtracking==0 ) {str=(JUDGE_NAME9!=null?JUDGE_NAME9.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:90: DATE
					{
					dbg.location(43,90);
					DATE10=(Token)match(input,DATE,FOLLOW_DATE_in_comment279); if (state.failed) return str;dbg.location(43,94);
					if ( state.backtracking==0 ) {str=(DATE10!=null?DATE10.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:112: PHONE_NUMBER
					{
					dbg.location(43,112);
					PHONE_NUMBER11=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment282); if (state.failed) return str;dbg.location(43,124);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER11!=null?PHONE_NUMBER11.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:150: ELLIPSIS
					{
					dbg.location(43,150);
					ELLIPSIS12=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment285); if (state.failed) return str;dbg.location(43,158);
					if ( state.backtracking==0 ) {str=(ELLIPSIS12!=null?ELLIPSIS12.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(43, 179);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "comment"



	// $ANTLR start "timeblock_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:1: timeblock_comment returns [String str] : ( COMMENT | INT | PHONE_NUMBER | ELLIPSIS | TIME | BREED_NAME ) ;
	public final String timeblock_comment() throws RecognitionException {
		String str = null;


		Token COMMENT13=null;
		Token INT14=null;
		Token PHONE_NUMBER15=null;
		Token ELLIPSIS16=null;
		Token TIME17=null;
		Token BREED_NAME18=null;

		str = null;
		try { dbg.enterRule(getGrammarFileName(), "timeblock_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:2: ( ( COMMENT | INT | PHONE_NUMBER | ELLIPSIS | TIME | BREED_NAME ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:4: ( COMMENT | INT | PHONE_NUMBER | ELLIPSIS | TIME | BREED_NAME )
			{
			dbg.location(47,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:4: ( COMMENT | INT | PHONE_NUMBER | ELLIPSIS | TIME | BREED_NAME )
			int alt10=6;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case COMMENT:
				{
				alt10=1;
				}
				break;
			case INT:
				{
				alt10=2;
				}
				break;
			case PHONE_NUMBER:
				{
				alt10=3;
				}
				break;
			case ELLIPSIS:
				{
				alt10=4;
				}
				break;
			case TIME:
				{
				alt10=5;
				}
				break;
			case BREED_NAME:
				{
				alt10=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:5: COMMENT
					{
					dbg.location(47,5);
					COMMENT13=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment310); if (state.failed) return str;dbg.location(47,12);
					if ( state.backtracking==0 ) {str=(COMMENT13!=null?COMMENT13.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:33: INT
					{
					dbg.location(47,33);
					INT14=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment313); if (state.failed) return str;dbg.location(47,36);
					if ( state.backtracking==0 ) {str=(INT14!=null?INT14.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:53: PHONE_NUMBER
					{
					dbg.location(47,53);
					PHONE_NUMBER15=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment316); if (state.failed) return str;dbg.location(47,65);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER15!=null?PHONE_NUMBER15.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:91: ELLIPSIS
					{
					dbg.location(47,91);
					ELLIPSIS16=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment319); if (state.failed) return str;dbg.location(47,99);
					if ( state.backtracking==0 ) {str=(ELLIPSIS16!=null?ELLIPSIS16.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:121: TIME
					{
					dbg.location(47,121);
					TIME17=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock_comment322); if (state.failed) return str;dbg.location(47,125);
					if ( state.backtracking==0 ) {str=(TIME17!=null?TIME17.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:143: BREED_NAME
					{
					dbg.location(47,143);
					BREED_NAME18=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_timeblock_comment325); if (state.failed) return str;dbg.location(47,153);
					if ( state.backtracking==0 ) {str=(BREED_NAME18!=null?BREED_NAME18.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 176);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "timeblock_comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "timeblock_comment"



	// $ANTLR start "ring_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:1: ring_comment returns [String str] : STANDALONE_COMMENT ;
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT19=null;

		try { dbg.enterRule(getGrammarFileName(), "ring_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:5: ( STANDALONE_COMMENT )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:9: STANDALONE_COMMENT
			{
			dbg.location(49,9);
			STANDALONE_COMMENT19=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment344); if (state.failed) return str;dbg.location(49,27);
			if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT19!=null?STANDALONE_COMMENT19.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(49, 57);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ring_comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "ring_comment"



	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:51:1: timeblock returns [JsonObject json] : TIME mInnerBlock1= inner_timeblock ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )? ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token TIME20=null;
		Token DATE21=null;
		JsonArray mInnerBlock1 =null;
		String mComment =null;
		JsonArray mInnerBlock2 =null;

		json = new JsonObject(); String comment = ""; int blockCounter = 0;
		try { dbg.enterRule(getGrammarFileName(), "timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:2: ( TIME mInnerBlock1= inner_timeblock ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )? )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:6: TIME mInnerBlock1= inner_timeblock ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )?
			{
			dbg.location(53,6);
			TIME20=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock368); if (state.failed) return json;dbg.location(53,10);
			if ( state.backtracking==0 ) {json.addProperty("Time", (TIME20!=null?TIME20.getText():null));}dbg.location(53,62);
			pushFollow(FOLLOW_inner_timeblock_in_timeblock373);
			mInnerBlock1=inner_timeblock();
			state._fsp--;
			if (state.failed) return json;dbg.location(53,78);
			if ( state.backtracking==0 ) {json.add("Block"+(blockCounter++), mInnerBlock1);}dbg.location(53,130);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:130: ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			try {
				isCyclicDecision = true;
				alt12 = dfa12.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:131: ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock
					{
					dbg.location(53,131);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:131: ( options {greedy=false; } :mComment= timeblock_comment )*
					try { dbg.enterSubRule(11);

					loop11:
					do {
						int alt11=2;
						try { dbg.enterDecision(11, decisionCanBacktrack[11]);

						int LA11_0 = input.LA(1);
						if ( (LA11_0==BREED_NAME||LA11_0==COMMENT||LA11_0==ELLIPSIS||LA11_0==INT||LA11_0==PHONE_NUMBER||LA11_0==TIME) ) {
							alt11=1;
						}
						else if ( (LA11_0==DATE) ) {
							alt11=2;
						}

						} finally {dbg.exitDecision(11);}

						switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:156: mComment= timeblock_comment
							{
							dbg.location(53,164);
							pushFollow(FOLLOW_timeblock_comment_in_timeblock387);
							mComment=timeblock_comment();
							state._fsp--;
							if (state.failed) return json;dbg.location(53,182);
							if ( state.backtracking==0 ) {comment+=mComment;}
							}
							break;

						default :
							break loop11;
						}
					} while (true);
					} finally {dbg.exitSubRule(11);}
					dbg.location(53,210);
					if ( state.backtracking==0 ) {json.addProperty("Comment", comment);}dbg.location(53,250);
					DATE21=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock394); if (state.failed) return json;dbg.location(53,254);
					if ( state.backtracking==0 ) {json.addProperty("Date", (DATE21!=null?DATE21.getText():null));}dbg.location(53,294);
					match(input,INT,FOLLOW_INT_in_timeblock397); if (state.failed) return json;dbg.location(53,310);
					pushFollow(FOLLOW_inner_timeblock_in_timeblock401);
					mInnerBlock2=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(53,326);
					if ( state.backtracking==0 ) {json.add("Block"+(blockCounter++), mInnerBlock2);}
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(53, 378);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "timeblock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "timeblock"



	// $ANTLR start "inner_timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:54:1: inner_timeblock returns [JsonArray array] : (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )* (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment ) ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mSpecialRing =null;
		JsonObject mJuniorRing =null;
		JsonObject mBreedRing =null;
		String mComment =null;

		array = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "inner_timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:2: ( (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )* (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )* (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment )
			{
			dbg.location(56,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )*
			try { dbg.enterSubRule(13);

			loop13:
			do {
				int alt13=4;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				try {
					isCyclicDecision = true;
					alt13 = dfa13.predict(input);
				}
				catch (NoViableAltException nvae) {
					dbg.recognitionException(nvae);
					throw nvae;
				}
				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:5: mSpecialRing= special_ring
					{
					dbg.location(56,17);
					pushFollow(FOLLOW_special_ring_in_inner_timeblock425);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(56,30);
					if ( state.backtracking==0 ) {array.add(mSpecialRing);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:57: mJuniorRing= junior_ring
					{
					dbg.location(56,68);
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock430);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(56,80);
					if ( state.backtracking==0 ) {array.add(mJuniorRing);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:106: ( breed_ring )=>mBreedRing= breed_ring
					{
					dbg.location(56,130);
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock439);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(56,141);
					if ( state.backtracking==0 ) {array.add(mBreedRing);}
					}
					break;

				default :
					break loop13;
				}
			} while (true);
			} finally {dbg.exitSubRule(13);}
			dbg.location(56,168);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:168: (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment )
			int alt14=4;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==INT) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==BREED_NAME) ) {
					int LA14_3 = input.LA(3);
					if ( (LA14_3==SPECIAL_SUFFIX) ) {
						int LA14_5 = input.LA(4);
						if ( (synpred27_test()) ) {
							alt14=1;
						}
						else if ( (synpred29_test()) ) {
							alt14=3;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return array;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 14, 5, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA14_3==EOF||(LA14_3 >= BREED_COUNT && LA14_3 <= ELLIPSIS)||(LA14_3 >= GROUP_RING && LA14_3 <= JUDGE_NAME)||LA14_3==PHONE_NUMBER||LA14_3==RING_TITLE||LA14_3==TIME) ) {
						alt14=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return array;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 14, 3, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA14_1==JUNIOR_CLASS) ) {
					alt14=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return array;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA14_0==STANDALONE_COMMENT) ) {
				alt14=4;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return array;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:169: mSpecialRing= special_ring
					{
					dbg.location(56,181);
					pushFollow(FOLLOW_special_ring_in_inner_timeblock447);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(56,194);
					if ( state.backtracking==0 ) {array.add(mSpecialRing);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:221: mJuniorRing= junior_ring
					{
					dbg.location(56,232);
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock452);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(56,244);
					if ( state.backtracking==0 ) {array.add(mJuniorRing);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:270: mBreedRing= breed_ring
					{
					dbg.location(56,280);
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock457);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(56,291);
					if ( state.backtracking==0 ) {array.add(mBreedRing);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:316: mComment= ring_comment
					{
					dbg.location(56,324);
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock462);
					mComment=ring_comment();
					state._fsp--;
					if (state.failed) return array;dbg.location(56,337);
					if ( state.backtracking==0 ) {array.add(new JsonPrimitive(mComment));}
					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 378);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inner_timeblock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return array;
	}
	// $ANTLR end "inner_timeblock"



	// $ANTLR start "special_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:57:1: special_ring returns [JsonObject json] : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT22=null;
		Token BREED_NAME23=null;
		Token SPECIAL_SUFFIX24=null;

		json = new JsonObject(); String breedName = "";
		try { dbg.enterRule(getGrammarFileName(), "special_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:2: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:6: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			dbg.location(59,6);
			INT22=(Token)match(input,INT,FOLLOW_INT_in_special_ring484); if (state.failed) return json;dbg.location(59,9);
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT22!=null?INT22.getText():null));}dbg.location(59,49);
			BREED_NAME23=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring487); if (state.failed) return json;dbg.location(59,59);
			if ( state.backtracking==0 ) {breedName+=(BREED_NAME23!=null?BREED_NAME23.getText():null);}dbg.location(59,90);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:90: ( SPECIAL_SUFFIX )+
			int cnt15=0;
			try { dbg.enterSubRule(15);

			loop15:
			do {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==SPECIAL_SUFFIX) ) {
					int LA15_2 = input.LA(2);
					if ( (synpred30_test()) ) {
						alt15=1;
					}

				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:91: SPECIAL_SUFFIX
					{
					dbg.location(59,91);
					SPECIAL_SUFFIX24=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring491); if (state.failed) return json;dbg.location(59,105);
					if ( state.backtracking==0 ) {breedName+= " " +(SPECIAL_SUFFIX24!=null?SPECIAL_SUFFIX24.getText():null);}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(15, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt15++;
			} while (true);
			} finally {dbg.exitSubRule(15);}
			dbg.location(59,148);
			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 190);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "special_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "special_ring"



	// $ANTLR start "junior_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:60:1: junior_ring returns [JsonObject json] : INT JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT25=null;
		Token JUNIOR_CLASS26=null;

		json = new JsonObject();
		try { dbg.enterRule(getGrammarFileName(), "junior_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:62:2: ( INT JUNIOR_CLASS )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:62:7: INT JUNIOR_CLASS
			{
			dbg.location(62,7);
			INT25=(Token)match(input,INT,FOLLOW_INT_in_junior_ring516); if (state.failed) return json;dbg.location(62,10);
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT25!=null?INT25.getText():null));}dbg.location(62,50);
			JUNIOR_CLASS26=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring519); if (state.failed) return json;dbg.location(62,62);
			if ( state.backtracking==0 ) {json.addProperty("ClassName", (JUNIOR_CLASS26!=null?JUNIOR_CLASS26.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(62, 113);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "junior_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "junior_ring"



	// $ANTLR start "group_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:1: group_ring returns [String str] : GROUP_RING ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING27=null;

		try { dbg.enterRule(getGrammarFileName(), "group_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:2: ( GROUP_RING )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:5: GROUP_RING
			{
			dbg.location(65,5);
			GROUP_RING27=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring534); if (state.failed) return str;dbg.location(65,15);
			if ( state.backtracking==0 ) {str=(GROUP_RING27!=null?GROUP_RING27.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(65, 37);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "group_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "group_ring"



	// $ANTLR start "group_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:66:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME28=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "group_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+
			{
			dbg.location(68,4);
			TIME28=(Token)match(input,TIME,FOLLOW_TIME_in_group_block553); if (state.failed) return json;dbg.location(68,8);
			if ( state.backtracking==0 ) {json.addProperty("TIME", (TIME28!=null?TIME28.getText():null));}dbg.location(68,48);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:48: ( STANDALONE_COMMENT )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==STANDALONE_COMMENT) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:48: STANDALONE_COMMENT
					{
					dbg.location(68,48);
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block556); if (state.failed) return json;
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(68,68);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:68: (mRing= group_ring )+
			int cnt17=0;
			try { dbg.enterSubRule(17);

			loop17:
			do {
				int alt17=2;
				try { dbg.enterDecision(17, decisionCanBacktrack[17]);

				int LA17_0 = input.LA(1);
				if ( (LA17_0==GROUP_RING) ) {
					int LA17_2 = input.LA(2);
					if ( (synpred32_test()) ) {
						alt17=1;
					}

				}

				} finally {dbg.exitDecision(17);}

				switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:69: mRing= group_ring
					{
					dbg.location(68,74);
					pushFollow(FOLLOW_group_ring_in_group_block562);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(68,86);
					if ( state.backtracking==0 ) {rings.add(new JsonPrimitive(mRing));}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(17, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt17++;
			} while (true);
			} finally {dbg.exitSubRule(17);}
			dbg.location(68,127);
			if ( state.backtracking==0 ) {json.add("Rings", rings);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(68, 153);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "group_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "group_block"



	// $ANTLR start "breed_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:1: breed_ring returns [JsonObject json] : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT29=null;
		Token BREED_NAME30=null;
		Token BREED_NAME_SUFFIX31=null;
		Token BREED_COUNT32=null;

		json = new JsonObject();String breedName = "";
		try { dbg.enterRule(getGrammarFileName(), "breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:71:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:71:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			dbg.location(71,9);
			INT29=(Token)match(input,INT,FOLLOW_INT_in_breed_ring590); if (state.failed) return json;dbg.location(71,12);
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT29!=null?INT29.getText():null));}dbg.location(71,52);
			BREED_NAME30=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring593); if (state.failed) return json;dbg.location(71,62);
			if ( state.backtracking==0 ) {breedName+=(BREED_NAME30!=null?BREED_NAME30.getText():null);}dbg.location(71,93);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:71:93: ( BREED_NAME_SUFFIX )?
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==BREED_NAME_SUFFIX) ) {
				alt18=1;
			}
			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:71:94: BREED_NAME_SUFFIX
					{
					dbg.location(71,94);
					BREED_NAME_SUFFIX31=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring597); if (state.failed) return json;dbg.location(71,111);
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX31!=null?BREED_NAME_SUFFIX31.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(71,159);
			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}dbg.location(71,203);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:71:203: ( BREED_COUNT )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==BREED_COUNT) ) {
				alt19=1;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:71:204: BREED_COUNT
					{
					dbg.location(71,204);
					BREED_COUNT32=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring605); if (state.failed) return json;dbg.location(71,215);
					if ( state.backtracking==0 ) {json.addProperty("BreedCount", (BREED_COUNT32!=null?BREED_COUNT32.getText():null));}
					}
					break;

			}
			} finally {dbg.exitSubRule(19);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(71, 268);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "breed_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "breed_ring"

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:6: (mComment= big_comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:6: mComment= big_comment
		{
		dbg.location(25,14);
		pushFollow(FOLLOW_big_comment_in_synpred2_test79);
		mComment=big_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred2_test

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:96: ( ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:97: ring
		{
		dbg.location(25,97);
		pushFollow(FOLLOW_ring_in_synpred3_test87);
		ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred3_test

	// $ANTLR start synpred5_test
	public final void synpred5_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:5: ( group_block )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:6: group_block
		{
		dbg.location(32,6);
		pushFollow(FOLLOW_group_block_in_synpred5_test149);
		group_block();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred5_test

	// $ANTLR start synpred6_test
	public final void synpred6_test_fragment() throws RecognitionException {
		JsonObject mJudgeBlock =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:9: (mJudgeBlock= judge_block )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:9: mJudgeBlock= judge_block
		{
		dbg.location(33,20);
		pushFollow(FOLLOW_judge_block_in_synpred6_test167);
		mJudgeBlock=judge_block();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred6_test

	// $ANTLR start synpred7_test
	public final void synpred7_test_fragment() throws RecognitionException {
		JsonObject mBlock =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:67: (mBlock= timeblock )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:67: mBlock= timeblock
		{
		dbg.location(36,73);
		pushFollow(FOLLOW_timeblock_in_synpred7_test201);
		mBlock=timeblock();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred7_test

	// $ANTLR start synpred23_test
	public final void synpred23_test_fragment() throws RecognitionException {
		String mComment =null;
		JsonArray mInnerBlock2 =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:131: ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:131: ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock
		{
		dbg.location(53,131);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:131: ( options {greedy=false; } :mComment= timeblock_comment )*
		try { dbg.enterSubRule(22);

		loop22:
		do {
			int alt22=2;
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==BREED_NAME||LA22_0==COMMENT||LA22_0==ELLIPSIS||LA22_0==INT||LA22_0==PHONE_NUMBER||LA22_0==TIME) ) {
				alt22=1;
			}
			else if ( (LA22_0==DATE) ) {
				alt22=2;
			}

			} finally {dbg.exitDecision(22);}

			switch (alt22) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:156: mComment= timeblock_comment
				{
				dbg.location(53,164);
				pushFollow(FOLLOW_timeblock_comment_in_synpred23_test387);
				mComment=timeblock_comment();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				break loop22;
			}
		} while (true);
		} finally {dbg.exitSubRule(22);}
		dbg.location(53,250);
		match(input,DATE,FOLLOW_DATE_in_synpred23_test394); if (state.failed) return ;dbg.location(53,294);
		match(input,INT,FOLLOW_INT_in_synpred23_test397); if (state.failed) return ;dbg.location(53,310);
		pushFollow(FOLLOW_inner_timeblock_in_synpred23_test401);
		mInnerBlock2=inner_timeblock();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred23_test

	// $ANTLR start synpred24_test
	public final void synpred24_test_fragment() throws RecognitionException {
		JsonObject mSpecialRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:5: (mSpecialRing= special_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:5: mSpecialRing= special_ring
		{
		dbg.location(56,17);
		pushFollow(FOLLOW_special_ring_in_synpred24_test425);
		mSpecialRing=special_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred24_test

	// $ANTLR start synpred25_test
	public final void synpred25_test_fragment() throws RecognitionException {
		JsonObject mJuniorRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:57: (mJuniorRing= junior_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:57: mJuniorRing= junior_ring
		{
		dbg.location(56,68);
		pushFollow(FOLLOW_junior_ring_in_synpred25_test430);
		mJuniorRing=junior_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred25_test

	// $ANTLR start synpred26_test
	public final void synpred26_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:106: ( breed_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:107: breed_ring
		{
		dbg.location(56,107);
		pushFollow(FOLLOW_breed_ring_in_synpred26_test434);
		breed_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred26_test

	// $ANTLR start synpred27_test
	public final void synpred27_test_fragment() throws RecognitionException {
		JsonObject mSpecialRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:169: (mSpecialRing= special_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:169: mSpecialRing= special_ring
		{
		dbg.location(56,181);
		pushFollow(FOLLOW_special_ring_in_synpred27_test447);
		mSpecialRing=special_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred27_test

	// $ANTLR start synpred29_test
	public final void synpred29_test_fragment() throws RecognitionException {
		JsonObject mBreedRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:270: (mBreedRing= breed_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:270: mBreedRing= breed_ring
		{
		dbg.location(56,280);
		pushFollow(FOLLOW_breed_ring_in_synpred29_test457);
		mBreedRing=breed_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred29_test

	// $ANTLR start synpred30_test
	public final void synpred30_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:91: ( SPECIAL_SUFFIX )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:91: SPECIAL_SUFFIX
		{
		dbg.location(59,91);
		match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_synpred30_test491); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred30_test

	// $ANTLR start synpred32_test
	public final void synpred32_test_fragment() throws RecognitionException {
		String mRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:69: (mRing= group_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:69: mRing= group_ring
		{
		dbg.location(68,74);
		pushFollow(FOLLOW_group_ring_in_synpred32_test562);
		mRing=group_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred32_test

	// Delegated rules

	public final boolean synpred2_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred2_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred24_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred5_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred29_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred29_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred32_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred32_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred27_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred25_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred23_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred26_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred7_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred6_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred3_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred30_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred30_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA12 dfa12 = new DFA12(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA12_eotS =
		"\20\uffff";
	static final String DFA12_eofS =
		"\10\10\1\uffff\3\10\1\uffff\1\10\2\uffff";
	static final String DFA12_minS =
		"\10\6\1\uffff\3\6\1\0\1\6\1\uffff\1\0";
	static final String DFA12_maxS =
		"\10\51\1\uffff\3\51\1\0\1\51\1\uffff\1\0";
	static final String DFA12_acceptS =
		"\10\uffff\1\2\5\uffff\1\1\1\uffff";
	static final String DFA12_specialS =
		"\14\uffff\1\1\2\uffff\1\0}>";
	static final String[] DFA12_transitionS = {
			"\1\6\1\uffff\1\1\1\7\1\4\22\uffff\1\10\1\2\1\10\4\uffff\1\3\1\uffff\2"+
			"\10\1\uffff\1\5",
			"\1\6\1\uffff\1\1\1\7\1\4\22\uffff\1\10\1\2\1\10\4\uffff\1\3\1\uffff"+
			"\2\10\1\uffff\1\11",
			"\1\6\1\uffff\1\1\1\7\1\4\22\uffff\1\10\1\2\1\10\4\uffff\1\3\1\uffff"+
			"\2\10\1\uffff\1\11",
			"\1\6\1\uffff\1\1\1\7\1\4\22\uffff\1\10\1\2\1\10\4\uffff\1\3\1\uffff"+
			"\2\10\1\uffff\1\11",
			"\1\6\1\uffff\1\1\1\7\1\4\22\uffff\1\10\1\2\1\10\4\uffff\1\3\1\uffff"+
			"\2\10\1\uffff\1\11",
			"\1\6\1\uffff\1\1\1\7\1\4\22\uffff\1\10\1\12\1\10\4\uffff\1\3\1\uffff"+
			"\3\10\1\11",
			"\1\6\1\uffff\1\1\1\7\1\4\22\uffff\1\10\1\2\1\10\4\uffff\1\3\1\uffff"+
			"\2\10\1\uffff\1\11",
			"\1\10\1\uffff\3\10\22\uffff\1\10\1\13\1\10\4\uffff\1\10\1\uffff\2\10"+
			"\1\uffff\1\10",
			"",
			"\1\6\1\uffff\1\1\1\7\1\4\22\uffff\1\10\1\2\1\10\4\uffff\1\3\1\uffff"+
			"\2\10\1\uffff\1\11",
			"\1\14\1\uffff\1\1\1\7\1\4\22\uffff\1\10\1\2\2\10\3\uffff\1\3\1\uffff"+
			"\2\10\1\uffff\1\11",
			"\1\10\1\uffff\3\10\22\uffff\1\10\1\15\1\10\4\uffff\1\10\1\uffff\2\10"+
			"\1\16\1\10",
			"\1\uffff",
			"\1\17\1\uffff\3\10\22\uffff\3\10\1\16\3\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\10",
			"",
			"\1\uffff"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "53:130: ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_15 = input.LA(1);
						 
						int index12_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred23_test()) ) {s = 14;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index12_15);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_12 = input.LA(1);
						 
						int index12_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred23_test()) ) {s = 14;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index12_12);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 12, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA13_eotS =
		"\22\uffff";
	static final String DFA13_eofS =
		"\3\uffff\6\2\1\uffff\1\2\1\uffff\1\2\5\uffff";
	static final String DFA13_minS =
		"\1\36\1\6\1\uffff\1\5\2\6\1\5\2\6\1\uffff\1\6\1\uffff\1\6\1\uffff\1\0"+
		"\1\uffff\2\0";
	static final String DFA13_maxS =
		"\1\50\1\40\1\uffff\6\51\1\uffff\1\51\1\uffff\1\51\1\uffff\1\0\1\uffff"+
		"\2\0";
	static final String DFA13_acceptS =
		"\2\uffff\1\4\6\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff\1\3\2\uffff";
	static final String DFA13_specialS =
		"\3\uffff\1\4\2\uffff\1\1\1\3\1\6\5\uffff\1\2\1\uffff\1\5\1\0}>";
	static final String[] DFA13_transitionS = {
			"\1\1\11\uffff\1\2",
			"\1\3\31\uffff\1\4",
			"",
			"\1\7\1\2\1\6\3\2\22\uffff\1\2\1\10\1\2\4\uffff\1\2\1\uffff\1\2\1\5\1"+
			"\11\1\2",
			"\1\2\1\uffff\3\2\22\uffff\1\2\1\12\1\2\4\uffff\1\2\1\uffff\2\2\1\13"+
			"\1\2",
			"\1\2\1\uffff\3\2\22\uffff\1\2\1\14\1\2\4\uffff\1\2\1\uffff\1\2\1\5\1"+
			"\15\1\2",
			"\1\7\1\2\1\uffff\3\2\22\uffff\1\2\1\10\1\2\4\uffff\1\2\1\uffff\2\2\1"+
			"\11\1\2",
			"\1\2\1\uffff\3\2\22\uffff\1\2\1\10\1\2\4\uffff\1\2\1\uffff\2\2\1\11"+
			"\1\2",
			"\1\16\1\uffff\3\2\22\uffff\3\2\1\17\3\uffff\1\2\1\uffff\2\2\1\uffff"+
			"\1\2",
			"",
			"\1\20\1\uffff\3\2\22\uffff\3\2\1\13\3\uffff\1\2\1\uffff\2\2\1\uffff"+
			"\1\2",
			"",
			"\1\21\1\uffff\3\2\22\uffff\3\2\1\15\3\uffff\1\2\1\uffff\2\2\1\uffff"+
			"\1\2",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 56:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )*";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_17 = input.LA(1);
						 
						int index13_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred24_test()) ) {s = 13;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index13_17);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA13_6 = input.LA(1);
						 
						int index13_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_6==BREED_COUNT) ) {s = 7;}
						else if ( (LA13_6==EOF||LA13_6==BREED_NAME||(LA13_6 >= COMMENT && LA13_6 <= ELLIPSIS)||LA13_6==GROUP_RING||LA13_6==JUDGE_NAME||LA13_6==PHONE_NUMBER||(LA13_6 >= RING_TITLE && LA13_6 <= SPECIAL_SUFFIX)||LA13_6==TIME) ) {s = 2;}
						else if ( (LA13_6==INT) ) {s = 8;}
						else if ( (LA13_6==STANDALONE_COMMENT) && (synpred26_test())) {s = 9;}
						 
						input.seek(index13_6);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA13_14 = input.LA(1);
						 
						int index13_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred26_test()) ) {s = 15;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index13_14);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA13_7 = input.LA(1);
						 
						int index13_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_7==EOF||LA13_7==BREED_NAME||(LA13_7 >= COMMENT && LA13_7 <= ELLIPSIS)||LA13_7==GROUP_RING||LA13_7==JUDGE_NAME||LA13_7==PHONE_NUMBER||(LA13_7 >= RING_TITLE && LA13_7 <= SPECIAL_SUFFIX)||LA13_7==TIME) ) {s = 2;}
						else if ( (LA13_7==INT) ) {s = 8;}
						else if ( (LA13_7==STANDALONE_COMMENT) && (synpred26_test())) {s = 9;}
						 
						input.seek(index13_7);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA13_3 = input.LA(1);
						 
						int index13_3 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_3==SPECIAL_SUFFIX) ) {s = 5;}
						else if ( (LA13_3==BREED_NAME_SUFFIX) ) {s = 6;}
						else if ( (LA13_3==BREED_COUNT) ) {s = 7;}
						else if ( (LA13_3==EOF||LA13_3==BREED_NAME||(LA13_3 >= COMMENT && LA13_3 <= ELLIPSIS)||LA13_3==GROUP_RING||LA13_3==JUDGE_NAME||LA13_3==PHONE_NUMBER||LA13_3==RING_TITLE||LA13_3==TIME) ) {s = 2;}
						else if ( (LA13_3==INT) ) {s = 8;}
						else if ( (LA13_3==STANDALONE_COMMENT) && (synpred26_test())) {s = 9;}
						 
						input.seek(index13_3);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA13_16 = input.LA(1);
						 
						int index13_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_test()) ) {s = 11;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index13_16);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA13_8 = input.LA(1);
						 
						int index13_8 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_8==EOF||(LA13_8 >= COMMENT && LA13_8 <= ELLIPSIS)||(LA13_8 >= GROUP_RING && LA13_8 <= JUDGE_NAME)||LA13_8==PHONE_NUMBER||(LA13_8 >= RING_TITLE && LA13_8 <= SPECIAL_SUFFIX)||LA13_8==TIME) ) {s = 2;}
						else if ( (LA13_8==BREED_NAME) ) {s = 14;}
						else if ( (LA13_8==JUNIOR_CLASS) && (synpred26_test())) {s = 15;}
						 
						input.seek(index13_8);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_special_ring_in_test_special40 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start79 = new BitSet(new long[]{0x000002D0E0000740L});
	public static final BitSet FOLLOW_ring_in_start92 = new BitSet(new long[]{0x000002D0E0000740L});
	public static final BitSet FOLLOW_EOF_in_start101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring124 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_inner_ring_in_ring129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring167 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block195 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block201 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_comment_in_big_comment233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_comment276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock_comment322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_timeblock_comment325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock368 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock373 = new BitSet(new long[]{0x0000021040000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock387 = new BitSet(new long[]{0x0000021040000740L});
	public static final BitSet FOLLOW_DATE_in_timeblock394 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_INT_in_timeblock397 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock425 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock430 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock439 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring484 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring487 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring491 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring516 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_group_block553 = new BitSet(new long[]{0x0000010020000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block556 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block562 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring590 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring593 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring597 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_synpred2_test79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred3_test87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_synpred5_test149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_block_in_synpred6_test167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_in_synpred7_test201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred23_test387 = new BitSet(new long[]{0x0000021040000740L});
	public static final BitSet FOLLOW_DATE_in_synpred23_test394 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_INT_in_synpred23_test397 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred23_test401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_synpred24_test425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_synpred25_test430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred26_test434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_synpred27_test447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred29_test457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_synpred30_test491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_ring_in_synpred32_test562 = new BitSet(new long[]{0x0000000000000002L});
}
