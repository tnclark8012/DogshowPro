// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-03-07 23:11:47

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREED_COUNT", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "END_WORD", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_GROUP_NAME", "FRAG_MONTH", "FRAG_PROPER_NAME", "FRAG_RING", "FRAG_SPECIAL_GROUP_NAME", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "FallThrough", "GROUP_RING", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
	};

	public static final int EOF=-1;
	public static final int BREED_COUNT=4;
	public static final int BREED_NAME=5;
	public static final int BREED_NAME_SUFFIX=6;
	public static final int COMMENT=7;
	public static final int DATE=8;
	public static final int ELLIPSIS=9;
	public static final int END_PUNCTUATION=10;
	public static final int END_WORD=11;
	public static final int FRAG_BREED_NAME_ALT=12;
	public static final int FRAG_BREED_NAME_CATEGORY=13;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=14;
	public static final int FRAG_BREED_NAME_SINGLE=15;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=16;
	public static final int FRAG_GROUP_NAME=17;
	public static final int FRAG_MONTH=18;
	public static final int FRAG_PROPER_NAME=19;
	public static final int FRAG_RING=20;
	public static final int FRAG_SPECIAL_GROUP_NAME=21;
	public static final int FRAG_SPEC_CHAR=22;
	public static final int FRAG_SPEC_WORD_CHAR=23;
	public static final int FRAG_TIME_LABEL=24;
	public static final int FRAG_TITLE=25;
	public static final int FRAG_WEEK_DAY=26;
	public static final int FallThrough=27;
	public static final int GROUP_RING=28;
	public static final int INT=29;
	public static final int JUDGE_NAME=30;
	public static final int JUNIOR_CLASS=31;
	public static final int PARENTHETICAL=32;
	public static final int PARENTHETICAL_INT=33;
	public static final int PARENTHETICAL_NAME=34;
	public static final int PHONE_NUMBER=35;
	public static final int RING_TITLE=36;
	public static final int SPECIAL_SUFFIX=37;
	public static final int STANDALONE_COMMENT=38;
	public static final int TIME=39;
	public static final int WORD=40;
	public static final int WS=41;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


public static final String[] ruleNames = new String[] {
	"invalidRule", "synpred17_test", "synpred27_test", "group_block", "special_ring", 
    "synpred13_test", "synpred20_test", "test_special", "synpred19_test", 
    "synpred32_test", "synpred24_test", "breed_ring", "synpred10_test", 
    "synpred15_test", "synpred18_test", "synpred1_test", "synpred3_test", 
    "start", "synpred21_test", "ring_comment", "synpred22_test", "synpred23_test", 
    "synpred26_test", "synpred28_test", "junior_ring", "synpred5_test", 
    "comment", "synpred11_test", "judge_name", "synpred16_test", "synpred9_test", 
    "synpred7_test", "synpred4_test", "inner_timeblock", "synpred30_test", 
    "big_comment", "synpred14_test", "timeblock", "group_ring", "ring", 
    "test_breed", "synpred25_test", "synpred8_test", "synpred12_test", "synpred6_test", 
    "judge_block", "inner_ring", "synpred29_test", "synpred2_test", "synpred33_test", 
    "synpred31_test"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
	false, // invalid decision
	false, false, false, false, false, false, false, false, false, true, false, 
	    true, false, true, false, false, false, false, false, false, false, 
	    false
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "test_special");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:13: ( ( special_ring )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:17: ( special_ring )+
			{
			dbg.location(25,17);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:17: ( special_ring )+
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:17: special_ring
					{
					dbg.location(25,17);
					pushFollow(FOLLOW_special_ring_in_test_special47);
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
		dbg.location(25, 29);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:1: test_breed : breed_ring ;
	public final void test_breed() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "test_breed");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:27:5: ( breed_ring )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:27:9: breed_ring
			{
			dbg.location(27,9);
			pushFollow(FOLLOW_breed_ring_in_test_breed61);
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
		dbg.location(27, 18);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:1: start returns [JsonObject json] : (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray(); System.out.println("starting...");
		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:3: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:4: (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF
			{
			dbg.location(30,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:4: (mComment= big_comment )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			do {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==BREED_NAME||(LA2_0 >= COMMENT && LA2_0 <= ELLIPSIS)||(LA2_0 >= GROUP_RING && LA2_0 <= INT)||LA2_0==PARENTHETICAL||LA2_0==PHONE_NUMBER||LA2_0==SPECIAL_SUFFIX||LA2_0==TIME) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:5: mComment= big_comment
					{
					dbg.location(30,13);
					pushFollow(FOLLOW_big_comment_in_start85);
					mComment=big_comment();
					state._fsp--;
					if (state.failed) return json;dbg.location(30,25);
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
			dbg.location(30,54);
			if ( state.backtracking==0 ) {json.addProperty("Comment", comments);}dbg.location(30,94);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:94: ( ( ring )=>mRing= ring )+
			int cnt3=0;
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:95: ( ring )=>mRing= ring
					{
					dbg.location(30,108);
					pushFollow(FOLLOW_ring_in_start98);
					mRing=ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(30,113);
					if ( state.backtracking==0 ) {ringArray.add(mRing);}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(3, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt3++;
			} while (true);
			} finally {dbg.exitSubRule(3);}
			dbg.location(30,145);
			if ( state.backtracking==0 ) {json.add("Rings", ringArray);}dbg.location(30,177);
			match(input,EOF,FOLLOW_EOF_in_start105); if (state.failed) return json;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 179);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:1: ring returns [JsonObject json] : RING_TITLE mRing= inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		Token RING_TITLE1=null;
		JsonObject mRing =null;

		json = new JsonObject();System.out.println("ring...");
		try { dbg.enterRule(getGrammarFileName(), "ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:35:3: ( RING_TITLE mRing= inner_ring )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:35:7: RING_TITLE mRing= inner_ring
			{
			dbg.location(35,7);
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring131); if (state.failed) return json;dbg.location(35,17);
			if ( state.backtracking==0 ) {json.addProperty("Title", (RING_TITLE1!=null?RING_TITLE1.getText():null));}dbg.location(35,69);
			pushFollow(FOLLOW_inner_ring_in_ring136);
			mRing=inner_ring();
			state._fsp--;
			if (state.failed) return json;dbg.location(35,80);
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
		dbg.location(35, 105);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:1: inner_ring returns [JsonObject json] : ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJudgeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJudgeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "inner_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:2: ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJudgeBlock= judge_block )+ ) )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==TIME) ) {
				alt6=1;
			}
			else if ( (LA6_0==COMMENT||LA6_0==JUDGE_NAME) ) {
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					{
					dbg.location(38,5);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:6: ( group_block )=>mGroupBlock= group_block ( comment )*
					{
					dbg.location(38,32);
					pushFollow(FOLLOW_group_block_in_inner_ring162);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;dbg.location(38,44);
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}dbg.location(38,82);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:82: ( comment )*
					try { dbg.enterSubRule(4);

					loop4:
					do {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= COMMENT && LA4_0 <= ELLIPSIS)||LA4_0==INT||LA4_0==PARENTHETICAL||LA4_0==TIME) ) {
							alt4=1;
						}

						} finally {dbg.exitDecision(4);}

						switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:82: comment
							{
							dbg.location(38,82);
							pushFollow(FOLLOW_comment_in_inner_ring165);
							comment();
							state._fsp--;
							if (state.failed) return json;
							}
							break;

						default :
							break loop4;
						}
					} while (true);
					} finally {dbg.exitSubRule(4);}

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:7: ( (mJudgeBlock= judge_block )+ )
					{
					dbg.location(39,7);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:7: ( (mJudgeBlock= judge_block )+ )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:8: (mJudgeBlock= judge_block )+
					{
					dbg.location(39,8);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:8: (mJudgeBlock= judge_block )+
					int cnt5=0;
					try { dbg.enterSubRule(5);

					loop5:
					do {
						int alt5=2;
						try { dbg.enterDecision(5, decisionCanBacktrack[5]);

						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMENT||LA5_0==JUDGE_NAME) ) {
							alt5=1;
						}

						} finally {dbg.exitDecision(5);}

						switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:9: mJudgeBlock= judge_block
							{
							dbg.location(39,20);
							pushFollow(FOLLOW_judge_block_in_inner_ring179);
							mJudgeBlock=judge_block();
							state._fsp--;
							if (state.failed) return json;dbg.location(39,32);
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
					dbg.location(39,66);
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
		dbg.location(39, 105);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:1: judge_block returns [JsonObject json] : mName= judge_name (mBlock= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		String mName =null;
		JsonObject mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "judge_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:5: (mName= judge_name (mBlock= timeblock )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:9: mName= judge_name (mBlock= timeblock )+
			{
			dbg.location(42,14);
			pushFollow(FOLLOW_judge_name_in_judge_block209);
			mName=judge_name();
			state._fsp--;
			if (state.failed) return json;dbg.location(42,25);
			if ( state.backtracking==0 ) {json.addProperty("Judge", mName);}dbg.location(42,61);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:61: (mBlock= timeblock )+
			int cnt7=0;
			try { dbg.enterSubRule(7);

			loop7:
			do {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==TIME) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:62: mBlock= timeblock
					{
					dbg.location(42,68);
					pushFollow(FOLLOW_timeblock_in_judge_block215);
					mBlock=timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(42,78);
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
			dbg.location(42,101);
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
		dbg.location(42, 132);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "judge_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "judge_block"



	// $ANTLR start "judge_name"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:1: judge_name returns [String str] : ( ( JUDGE_NAME ) | ( ( COMMENT )+ PARENTHETICAL ) );
	public final String judge_name() throws RecognitionException {
		String str = null;


		Token JUDGE_NAME2=null;
		Token COMMENT3=null;
		Token PARENTHETICAL4=null;

		str = "";
		try { dbg.enterRule(getGrammarFileName(), "judge_name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:2: ( ( JUDGE_NAME ) | ( ( COMMENT )+ PARENTHETICAL ) )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==JUDGE_NAME) ) {
				alt9=1;
			}
			else if ( (LA9_0==COMMENT) ) {
				alt9=2;
			}
			else {
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:4: ( JUDGE_NAME )
					{
					dbg.location(45,4);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:4: ( JUDGE_NAME )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:5: JUDGE_NAME
					{
					dbg.location(45,5);
					JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_name239); if (state.failed) return str;dbg.location(45,15);
					if ( state.backtracking==0 ) {str=(JUDGE_NAME2!=null?JUDGE_NAME2.getText():null);}
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:40: ( ( COMMENT )+ PARENTHETICAL )
					{
					dbg.location(45,40);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:40: ( ( COMMENT )+ PARENTHETICAL )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:41: ( COMMENT )+ PARENTHETICAL
					{
					dbg.location(45,41);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:41: ( COMMENT )+
					int cnt8=0;
					try { dbg.enterSubRule(8);

					loop8:
					do {
						int alt8=2;
						try { dbg.enterDecision(8, decisionCanBacktrack[8]);

						int LA8_0 = input.LA(1);
						if ( (LA8_0==COMMENT) ) {
							alt8=1;
						}

						} finally {dbg.exitDecision(8);}

						switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:42: COMMENT
							{
							dbg.location(45,42);
							COMMENT3=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_judge_name245); if (state.failed) return str;dbg.location(45,49);
							if ( state.backtracking==0 ) {str += (COMMENT3!=null?COMMENT3.getText():null);}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return str;}
								EarlyExitException eee =
									new EarlyExitException(8, input);
								dbg.recognitionException(eee);

								throw eee;
						}
						cnt8++;
					} while (true);
					} finally {dbg.exitSubRule(8);}
					dbg.location(45,75);
					PARENTHETICAL4=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_judge_name250); if (state.failed) return str;dbg.location(45,88);
					if ( state.backtracking==0 ) {str += (PARENTHETICAL4!=null?PARENTHETICAL4.getText():null);}
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
		dbg.location(45, 117);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "judge_name");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "judge_name"



	// $ANTLR start "big_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:1: big_comment returns [String str] : (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) ;
	public final String big_comment() throws RecognitionException {
		String str = null;


		Token TIME5=null;
		Token PHONE_NUMBER6=null;
		Token BREED_NAME7=null;
		Token SPECIAL_SUFFIX8=null;
		Token GROUP_RING9=null;
		String mComment =null;

		str = "";
		try { dbg.enterRule(getGrammarFileName(), "big_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:3: ( (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			{
			dbg.location(48,7);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			int alt10=6;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case TIME:
				{
				int LA10_1 = input.LA(2);
				if ( (synpred11_test()) ) {
					alt10=1;
				}
				else if ( (synpred12_test()) ) {
					alt10=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case COMMENT:
			case DATE:
			case ELLIPSIS:
			case INT:
			case PARENTHETICAL:
				{
				alt10=1;
				}
				break;
			case PHONE_NUMBER:
				{
				alt10=3;
				}
				break;
			case BREED_NAME:
				{
				alt10=4;
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt10=5;
				}
				break;
			case GROUP_RING:
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:8: mComment= comment
					{
					dbg.location(48,16);
					pushFollow(FOLLOW_comment_in_big_comment278);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;dbg.location(48,24);
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:42: TIME
					{
					dbg.location(48,42);
					TIME5=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment281); if (state.failed) return str;dbg.location(48,46);
					if ( state.backtracking==0 ) {str=(TIME5!=null?TIME5.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:64: PHONE_NUMBER
					{
					dbg.location(48,64);
					PHONE_NUMBER6=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_big_comment284); if (state.failed) return str;dbg.location(48,76);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER6!=null?PHONE_NUMBER6.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:102: BREED_NAME
					{
					dbg.location(48,102);
					BREED_NAME7=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment287); if (state.failed) return str;dbg.location(48,112);
					if ( state.backtracking==0 ) {str=(BREED_NAME7!=null?BREED_NAME7.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:136: SPECIAL_SUFFIX
					{
					dbg.location(48,136);
					SPECIAL_SUFFIX8=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment290); if (state.failed) return str;dbg.location(48,150);
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX8!=null?SPECIAL_SUFFIX8.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:178: GROUP_RING
					{
					dbg.location(48,178);
					GROUP_RING9=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment293); if (state.failed) return str;dbg.location(48,188);
					if ( state.backtracking==0 ) {str=(GROUP_RING9!=null?GROUP_RING9.getText():null);}
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
		dbg.location(48, 211);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:1: comment returns [String str] : ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE ) ;
	public final String comment() throws RecognitionException {
		String str = null;


		Token COMMENT10=null;

		str="";
		try { dbg.enterRule(getGrammarFileName(), "comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:3: ( ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:5: ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE )
			{
			dbg.location(52,5);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:5: ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE )
			int alt11=6;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case TIME:
				{
				alt11=1;
				}
				break;
			case COMMENT:
				{
				alt11=2;
				}
				break;
			case PARENTHETICAL:
				{
				alt11=3;
				}
				break;
			case INT:
				{
				alt11=4;
				}
				break;
			case ELLIPSIS:
				{
				alt11=5;
				}
				break;
			case DATE:
				{
				alt11=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:6: TIME
					{
					dbg.location(52,6);
					match(input,TIME,FOLLOW_TIME_in_comment316); if (state.failed) return str;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:11: COMMENT
					{
					dbg.location(52,11);
					COMMENT10=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment318); if (state.failed) return str;dbg.location(52,18);
					if ( state.backtracking==0 ) {str=(COMMENT10!=null?COMMENT10.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:39: PARENTHETICAL
					{
					dbg.location(52,39);
					match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment321); if (state.failed) return str;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:53: INT
					{
					dbg.location(52,53);
					match(input,INT,FOLLOW_INT_in_comment323); if (state.failed) return str;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:57: ELLIPSIS
					{
					dbg.location(52,57);
					match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment325); if (state.failed) return str;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:66: DATE
					{
					dbg.location(52,66);
					match(input,DATE,FOLLOW_DATE_in_comment327); if (state.failed) return str;
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 70);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "comment"



	// $ANTLR start "ring_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:60:1: ring_comment returns [String str] : STANDALONE_COMMENT ;
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT11=null;

		try { dbg.enterRule(getGrammarFileName(), "ring_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:61:5: ( STANDALONE_COMMENT )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:61:9: STANDALONE_COMMENT
			{
			dbg.location(61,9);
			STANDALONE_COMMENT11=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment354); if (state.failed) return str;dbg.location(61,27);
			if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT11!=null?STANDALONE_COMMENT11.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(61, 57);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:1: timeblock returns [JsonObject json] : ( TIME ) (mInnerBlock1= inner_timeblock (mComment= comment )* )* ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token TIME12=null;
		JsonArray mInnerBlock1 =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; int blockCounter = 0;
		try { dbg.enterRule(getGrammarFileName(), "timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:2: ( ( TIME ) (mInnerBlock1= inner_timeblock (mComment= comment )* )* )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:4: ( TIME ) (mInnerBlock1= inner_timeblock (mComment= comment )* )*
			{
			dbg.location(65,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:4: ( TIME )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:5: TIME
			{
			dbg.location(65,5);
			TIME12=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock377); if (state.failed) return json;dbg.location(65,9);
			if ( state.backtracking==0 ) {json.addProperty("Time", (TIME12!=null?TIME12.getText():null));}
			}
			dbg.location(65,50);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:50: (mInnerBlock1= inner_timeblock (mComment= comment )* )*
			try { dbg.enterSubRule(13);

			loop13:
			do {
				int alt13=2;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				int LA13_0 = input.LA(1);
				if ( (LA13_0==INT||LA13_0==STANDALONE_COMMENT) ) {
					alt13=1;
				}

				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:51: mInnerBlock1= inner_timeblock (mComment= comment )*
					{
					dbg.location(65,63);
					pushFollow(FOLLOW_inner_timeblock_in_timeblock384);
					mInnerBlock1=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(65,79);
					if ( state.backtracking==0 ) {json.add("Block"+(blockCounter++), mInnerBlock1);}dbg.location(65,131);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:131: (mComment= comment )*
					try { dbg.enterSubRule(12);

					loop12:
					do {
						int alt12=2;
						try { dbg.enterDecision(12, decisionCanBacktrack[12]);

						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA12_2 = input.LA(2);
							if ( (synpred21_test()) ) {
								alt12=1;
							}

							}
							break;
						case TIME:
							{
							int LA12_3 = input.LA(2);
							if ( (synpred21_test()) ) {
								alt12=1;
							}

							}
							break;
						case INT:
							{
							int LA12_4 = input.LA(2);
							if ( (LA12_4==EOF||(LA12_4 >= COMMENT && LA12_4 <= ELLIPSIS)||(LA12_4 >= INT && LA12_4 <= JUDGE_NAME)||LA12_4==PARENTHETICAL||LA12_4==RING_TITLE||(LA12_4 >= STANDALONE_COMMENT && LA12_4 <= TIME)) ) {
								alt12=1;
							}

							}
							break;
						case DATE:
						case ELLIPSIS:
						case PARENTHETICAL:
							{
							alt12=1;
							}
							break;
						}
						} finally {dbg.exitDecision(12);}

						switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:132: mComment= comment
							{
							dbg.location(65,140);
							pushFollow(FOLLOW_comment_in_timeblock390);
							mComment=comment();
							state._fsp--;
							if (state.failed) return json;dbg.location(65,148);
							if ( state.backtracking==0 ) {comment+=mComment;}
							}
							break;

						default :
							break loop12;
						}
					} while (true);
					} finally {dbg.exitSubRule(12);}

					}
					break;

				default :
					break loop13;
				}
			} while (true);
			} finally {dbg.exitSubRule(13);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(65, 176);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:1: inner_timeblock returns [JsonArray array] : (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | ring_comment )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mSpecialRing =null;
		JsonObject mJuniorRing =null;
		JsonObject mBreedRing =null;

		array = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "inner_timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:2: ( (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | ring_comment )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | ring_comment )+
			{
			dbg.location(69,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | ring_comment )+
			int cnt14=0;
			try { dbg.enterSubRule(14);

			loop14:
			do {
				int alt14=5;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==INT) ) {
					int LA14_2 = input.LA(2);
					if ( (synpred23_test()) ) {
						alt14=1;
					}
					else if ( (synpred24_test()) ) {
						alt14=2;
					}
					else if ( (synpred26_test()) ) {
						alt14=3;
					}

				}
				else if ( (LA14_0==STANDALONE_COMMENT) ) {
					int LA14_3 = input.LA(2);
					if ( (synpred27_test()) ) {
						alt14=4;
					}

				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:5: mSpecialRing= special_ring
					{
					dbg.location(69,17);
					pushFollow(FOLLOW_special_ring_in_inner_timeblock418);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(69,30);
					if ( state.backtracking==0 ) {array.add(mSpecialRing);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:57: mJuniorRing= junior_ring
					{
					dbg.location(69,68);
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock423);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(69,80);
					if ( state.backtracking==0 ) {array.add(mJuniorRing);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:106: ( ( breed_ring )=>mBreedRing= breed_ring )
					{
					dbg.location(69,106);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:106: ( ( breed_ring )=>mBreedRing= breed_ring )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:107: ( breed_ring )=>mBreedRing= breed_ring
					{
					dbg.location(69,131);
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock433);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(69,142);
					if ( state.backtracking==0 ) {array.add(mBreedRing);}
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:168: ring_comment
					{
					dbg.location(69,168);
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock437);
					ring_comment();
					state._fsp--;
					if (state.failed) return array;
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return array;}
						EarlyExitException eee =
							new EarlyExitException(14, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt14++;
			} while (true);
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
		dbg.location(69, 181);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:1: special_ring returns [JsonObject json] : INT ( BREED_NAME )? ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT13=null;
		Token BREED_NAME14=null;
		Token SPECIAL_SUFFIX15=null;

		json = new JsonObject(); String breedName = "";
		try { dbg.enterRule(getGrammarFileName(), "special_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:72:2: ( INT ( BREED_NAME )? ( SPECIAL_SUFFIX )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:72:6: INT ( BREED_NAME )? ( SPECIAL_SUFFIX )+
			{
			dbg.location(72,6);
			INT13=(Token)match(input,INT,FOLLOW_INT_in_special_ring459); if (state.failed) return json;dbg.location(72,9);
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT13!=null?INT13.getText():null));}dbg.location(72,49);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:72:49: ( BREED_NAME )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==BREED_NAME) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:72:50: BREED_NAME
					{
					dbg.location(72,50);
					BREED_NAME14=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring463); if (state.failed) return json;dbg.location(72,60);
					if ( state.backtracking==0 ) {breedName+=(BREED_NAME14!=null?BREED_NAME14.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(72,93);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:72:93: ( SPECIAL_SUFFIX )+
			int cnt16=0;
			try { dbg.enterSubRule(16);

			loop16:
			do {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				int LA16_0 = input.LA(1);
				if ( (LA16_0==SPECIAL_SUFFIX) ) {
					alt16=1;
				}

				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:72:94: SPECIAL_SUFFIX
					{
					dbg.location(72,94);
					SPECIAL_SUFFIX15=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring469); if (state.failed) return json;dbg.location(72,108);
					if ( state.backtracking==0 ) {breedName+= " " +(SPECIAL_SUFFIX15!=null?SPECIAL_SUFFIX15.getText():null);}
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(16, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt16++;
			} while (true);
			} finally {dbg.exitSubRule(16);}
			dbg.location(72,151);
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
		dbg.location(72, 193);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:1: junior_ring returns [JsonObject json] : INT JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT16=null;
		Token JUNIOR_CLASS17=null;

		json = new JsonObject();
		try { dbg.enterRule(getGrammarFileName(), "junior_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:75:2: ( INT JUNIOR_CLASS )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:75:7: INT JUNIOR_CLASS
			{
			dbg.location(75,7);
			INT16=(Token)match(input,INT,FOLLOW_INT_in_junior_ring494); if (state.failed) return json;dbg.location(75,10);
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT16!=null?INT16.getText():null));}dbg.location(75,50);
			JUNIOR_CLASS17=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring497); if (state.failed) return json;dbg.location(75,62);
			if ( state.backtracking==0 ) {json.addProperty("ClassName", (JUNIOR_CLASS17!=null?JUNIOR_CLASS17.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 113);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:77:1: group_ring returns [String str] : GROUP_RING ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING18=null;

		try { dbg.enterRule(getGrammarFileName(), "group_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:78:2: ( GROUP_RING )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:78:5: GROUP_RING
			{
			dbg.location(78,5);
			GROUP_RING18=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring512); if (state.failed) return str;dbg.location(78,15);
			if ( state.backtracking==0 ) {str=(GROUP_RING18!=null?GROUP_RING18.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 37);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:79:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME19=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "group_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:81:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:81:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+
			{
			dbg.location(81,4);
			TIME19=(Token)match(input,TIME,FOLLOW_TIME_in_group_block531); if (state.failed) return json;dbg.location(81,8);
			if ( state.backtracking==0 ) {json.addProperty("TIME", (TIME19!=null?TIME19.getText():null));}dbg.location(81,48);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:81:48: ( STANDALONE_COMMENT )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==STANDALONE_COMMENT) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:81:48: STANDALONE_COMMENT
					{
					dbg.location(81,48);
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block534); if (state.failed) return json;
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(81,68);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:81:68: (mRing= group_ring )+
			int cnt18=0;
			try { dbg.enterSubRule(18);

			loop18:
			do {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==GROUP_RING) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:81:69: mRing= group_ring
					{
					dbg.location(81,74);
					pushFollow(FOLLOW_group_ring_in_group_block540);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(81,86);
					if ( state.backtracking==0 ) {rings.add(new JsonPrimitive(mRing));}
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(18, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt18++;
			} while (true);
			} finally {dbg.exitSubRule(18);}
			dbg.location(81,127);
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
		dbg.location(81, 153);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:82:1: breed_ring returns [JsonObject json] : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT20=null;
		Token BREED_NAME21=null;
		Token BREED_NAME_SUFFIX22=null;
		Token BREED_COUNT23=null;

		json = new JsonObject();String breedName = "";
		try { dbg.enterRule(getGrammarFileName(), "breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:84:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:84:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			dbg.location(84,9);
			INT20=(Token)match(input,INT,FOLLOW_INT_in_breed_ring568); if (state.failed) return json;dbg.location(84,12);
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT20!=null?INT20.getText():null));}dbg.location(84,52);
			BREED_NAME21=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring571); if (state.failed) return json;dbg.location(84,62);
			if ( state.backtracking==0 ) {breedName+=(BREED_NAME21!=null?BREED_NAME21.getText():null);}dbg.location(84,93);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:84:93: ( BREED_NAME_SUFFIX )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==BREED_NAME_SUFFIX) ) {
				alt19=1;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:84:94: BREED_NAME_SUFFIX
					{
					dbg.location(84,94);
					BREED_NAME_SUFFIX22=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring575); if (state.failed) return json;dbg.location(84,111);
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX22!=null?BREED_NAME_SUFFIX22.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(84,159);
			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}dbg.location(84,203);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:84:203: ( BREED_COUNT )?
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==BREED_COUNT) ) {
				alt20=1;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:84:204: BREED_COUNT
					{
					dbg.location(84,204);
					BREED_COUNT23=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring583); if (state.failed) return json;dbg.location(84,215);
					if ( state.backtracking==0 ) {json.addProperty("BreedCount", (BREED_COUNT23!=null?BREED_COUNT23.getText():null));}
					}
					break;

			}
			} finally {dbg.exitSubRule(20);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(84, 268);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "breed_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "breed_ring"

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:95: ( ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:96: ring
		{
		dbg.location(30,96);
		pushFollow(FOLLOW_ring_in_synpred3_test93);
		ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred3_test

	// $ANTLR start synpred11_test
	public final void synpred11_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:8: (mComment= comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:8: mComment= comment
		{
		dbg.location(48,16);
		pushFollow(FOLLOW_comment_in_synpred11_test278);
		mComment=comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred11_test

	// $ANTLR start synpred12_test
	public final void synpred12_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:42: ( TIME )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:42: TIME
		{
		dbg.location(48,42);
		match(input,TIME,FOLLOW_TIME_in_synpred12_test281); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred12_test

	// $ANTLR start synpred21_test
	public final void synpred21_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:132: (mComment= comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:132: mComment= comment
		{
		dbg.location(65,140);
		pushFollow(FOLLOW_comment_in_synpred21_test390);
		mComment=comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred21_test

	// $ANTLR start synpred23_test
	public final void synpred23_test_fragment() throws RecognitionException {
		JsonObject mSpecialRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:5: (mSpecialRing= special_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:5: mSpecialRing= special_ring
		{
		dbg.location(69,17);
		pushFollow(FOLLOW_special_ring_in_synpred23_test418);
		mSpecialRing=special_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred23_test

	// $ANTLR start synpred24_test
	public final void synpred24_test_fragment() throws RecognitionException {
		JsonObject mJuniorRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:57: (mJuniorRing= junior_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:57: mJuniorRing= junior_ring
		{
		dbg.location(69,68);
		pushFollow(FOLLOW_junior_ring_in_synpred24_test423);
		mJuniorRing=junior_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred24_test

	// $ANTLR start synpred26_test
	public final void synpred26_test_fragment() throws RecognitionException {
		JsonObject mBreedRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:106: ( ( ( breed_ring )=>mBreedRing= breed_ring ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:106: ( ( breed_ring )=>mBreedRing= breed_ring )
		{
		dbg.location(69,106);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:106: ( ( breed_ring )=>mBreedRing= breed_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:107: ( breed_ring )=>mBreedRing= breed_ring
		{
		dbg.location(69,131);
		pushFollow(FOLLOW_breed_ring_in_synpred26_test433);
		mBreedRing=breed_ring();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred26_test

	// $ANTLR start synpred27_test
	public final void synpred27_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:168: ( ring_comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:168: ring_comment
		{
		dbg.location(69,168);
		pushFollow(FOLLOW_ring_comment_in_synpred27_test437);
		ring_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred27_test

	// Delegated rules

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
	public final boolean synpred11_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred11_test_fragment(); // can never throw exception
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
	public final boolean synpred12_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred12_test_fragment(); // can never throw exception
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
	public final boolean synpred21_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred21_test_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_special_ring_in_test_special47 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start85 = new BitSet(new long[]{0x000000B9300003A0L});
	public static final BitSet FOLLOW_ring_in_start98 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_EOF_in_start105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring131 = new BitSet(new long[]{0x0000008040000080L});
	public static final BitSet FOLLOW_inner_ring_in_ring136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring162 = new BitSet(new long[]{0x0000008120000382L});
	public static final BitSet FOLLOW_comment_in_inner_ring165 = new BitSet(new long[]{0x0000008120000382L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring179 = new BitSet(new long[]{0x0000000040000082L});
	public static final BitSet FOLLOW_judge_name_in_judge_block209 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block215 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_name239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_judge_name245 = new BitSet(new long[]{0x0000000100000080L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_judge_name250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_big_comment278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_big_comment284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_comment316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock377 = new BitSet(new long[]{0x0000004020000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock384 = new BitSet(new long[]{0x000000C120000382L});
	public static final BitSet FOLLOW_comment_in_timeblock390 = new BitSet(new long[]{0x000000C120000382L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock418 = new BitSet(new long[]{0x0000004020000002L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock423 = new BitSet(new long[]{0x0000004020000002L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock433 = new BitSet(new long[]{0x0000004020000002L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock437 = new BitSet(new long[]{0x0000004020000002L});
	public static final BitSet FOLLOW_INT_in_special_ring459 = new BitSet(new long[]{0x0000002000000020L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring463 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring469 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring494 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_group_block531 = new BitSet(new long[]{0x0000004010000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block534 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block540 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring568 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring571 = new BitSet(new long[]{0x0000000000000052L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring575 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred3_test93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred11_test278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred12_test281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred21_test390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_synpred23_test418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_synpred24_test423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred26_test433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred27_test437 = new BitSet(new long[]{0x0000000000000002L});
}
