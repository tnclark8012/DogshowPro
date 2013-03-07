// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-03-07 00:14:34

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "END_WORD", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_GROUP_NAME", "FRAG_MONTH", "FRAG_PROPER_NAME", "FRAG_RING", "FRAG_SPECIAL_GROUP_NAME", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "FallThrough", "GROUP_RING", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "PROPER_NAME", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
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
	public static final int END_WORD=12;
	public static final int FRAG_BREED_NAME_ALT=13;
	public static final int FRAG_BREED_NAME_CATEGORY=14;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=15;
	public static final int FRAG_BREED_NAME_SINGLE=16;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=17;
	public static final int FRAG_GROUP_NAME=18;
	public static final int FRAG_MONTH=19;
	public static final int FRAG_PROPER_NAME=20;
	public static final int FRAG_RING=21;
	public static final int FRAG_SPECIAL_GROUP_NAME=22;
	public static final int FRAG_SPEC_CHAR=23;
	public static final int FRAG_SPEC_WORD_CHAR=24;
	public static final int FRAG_TIME_LABEL=25;
	public static final int FRAG_TITLE=26;
	public static final int FRAG_WEEK_DAY=27;
	public static final int FallThrough=28;
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
	"invalidRule", "synpred28_test", "synpred4_test", "synpred26_test", "big_comment", 
    "judge_block", "group_ring", "synpred21_test", "synpred11_test", "timeblock", 
    "test_breed", "synpred17_test", "synpred27_test", "synpred29_test", 
    "synpred23_test", "synpred25_test", "synpred9_test", "start", "synpred7_test", 
    "ring", "synpred18_test", "inner_timeblock", "synpred16_test", "junior_ring", 
    "ring_comment", "synpred1_test", "synpred10_test", "test_special", "synpred2_test", 
    "synpred14_test", "comment", "synpred20_test", "synpred12_test", "group_block", 
    "special_ring", "synpred15_test", "synpred6_test", "synpred8_test", 
    "inner_ring", "synpred19_test", "synpred3_test", "synpred5_test", "synpred22_test", 
    "synpred13_test", "synpred24_test", "breed_ring"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
	false, // invalid decision
	false, false, false, false, false, false, false, true, false, true, false, 
	    true, false, false, false, false, false, false, false
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
				if ( (LA2_0==BREED_NAME||(LA2_0 >= COMMENT && LA2_0 <= ELLIPSIS)||(LA2_0 >= GROUP_RING && LA2_0 <= INT)||LA2_0==PARENTHETICAL||LA2_0==SPECIAL_SUFFIX||LA2_0==TIME) ) {
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
						if ( (LA5_0==JUDGE_NAME) ) {
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:1: judge_block returns [JsonObject json] : JUDGE_NAME (mBlock= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		Token JUDGE_NAME2=null;
		JsonObject mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "judge_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:5: ( JUDGE_NAME (mBlock= timeblock )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:9: JUDGE_NAME (mBlock= timeblock )+
			{
			dbg.location(42,9);
			JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block207); if (state.failed) return json;dbg.location(42,19);
			if ( state.backtracking==0 ) {json.addProperty("Judge", (JUDGE_NAME2!=null?JUDGE_NAME2.getText():null));}dbg.location(42,66);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:66: (mBlock= timeblock )+
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:67: mBlock= timeblock
					{
					dbg.location(42,73);
					pushFollow(FOLLOW_timeblock_in_judge_block213);
					mBlock=timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(42,83);
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
			dbg.location(42,106);
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
		dbg.location(42, 137);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:44:1: big_comment returns [String str] : (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) ;
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
		dbg.location(44, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:3: ( (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:7: (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			{
			dbg.location(46,7);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:7: (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			int alt8=5;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case TIME:
				{
				int LA8_1 = input.LA(2);
				if ( (synpred9_test()) ) {
					alt8=1;
				}
				else if ( (synpred10_test()) ) {
					alt8=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
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
				alt8=1;
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:8: mComment= comment
					{
					dbg.location(46,16);
					pushFollow(FOLLOW_comment_in_big_comment245);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;dbg.location(46,24);
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:42: TIME
					{
					dbg.location(46,42);
					TIME3=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment248); if (state.failed) return str;dbg.location(46,46);
					if ( state.backtracking==0 ) {str=(TIME3!=null?TIME3.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:64: BREED_NAME
					{
					dbg.location(46,64);
					BREED_NAME4=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment251); if (state.failed) return str;dbg.location(46,74);
					if ( state.backtracking==0 ) {str=(BREED_NAME4!=null?BREED_NAME4.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:98: SPECIAL_SUFFIX
					{
					dbg.location(46,98);
					SPECIAL_SUFFIX5=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment254); if (state.failed) return str;dbg.location(46,112);
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX5!=null?SPECIAL_SUFFIX5.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:140: GROUP_RING
					{
					dbg.location(46,140);
					GROUP_RING6=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment257); if (state.failed) return str;dbg.location(46,150);
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
		dbg.location(46, 173);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:1: comment returns [String str] : ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE ) ;
	public final String comment() throws RecognitionException {
		String str = null;


		Token COMMENT7=null;

		str=null;
		try { dbg.enterRule(getGrammarFileName(), "comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:3: ( ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:5: ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE )
			{
			dbg.location(50,5);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:5: ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE )
			int alt9=6;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case TIME:
				{
				alt9=1;
				}
				break;
			case COMMENT:
				{
				alt9=2;
				}
				break;
			case PARENTHETICAL:
				{
				alt9=3;
				}
				break;
			case INT:
				{
				alt9=4;
				}
				break;
			case ELLIPSIS:
				{
				alt9=5;
				}
				break;
			case DATE:
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:6: TIME
					{
					dbg.location(50,6);
					match(input,TIME,FOLLOW_TIME_in_comment280); if (state.failed) return str;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:11: COMMENT
					{
					dbg.location(50,11);
					COMMENT7=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment282); if (state.failed) return str;dbg.location(50,18);
					if ( state.backtracking==0 ) {str=(COMMENT7!=null?COMMENT7.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:39: PARENTHETICAL
					{
					dbg.location(50,39);
					match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment285); if (state.failed) return str;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:53: INT
					{
					dbg.location(50,53);
					match(input,INT,FOLLOW_INT_in_comment287); if (state.failed) return str;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:57: ELLIPSIS
					{
					dbg.location(50,57);
					match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment289); if (state.failed) return str;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:66: DATE
					{
					dbg.location(50,66);
					match(input,DATE,FOLLOW_DATE_in_comment291); if (state.failed) return str;
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
		dbg.location(50, 70);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:58:1: ring_comment returns [String str] : STANDALONE_COMMENT ;
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT8=null;

		try { dbg.enterRule(getGrammarFileName(), "ring_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:5: ( STANDALONE_COMMENT )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:9: STANDALONE_COMMENT
			{
			dbg.location(59,9);
			STANDALONE_COMMENT8=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment318); if (state.failed) return str;dbg.location(59,27);
			if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT8!=null?STANDALONE_COMMENT8.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 57);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:61:1: timeblock returns [JsonObject json] : TIME (mInnerBlock1= inner_timeblock (mComment= comment )* )* ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token TIME9=null;
		JsonArray mInnerBlock1 =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; int blockCounter = 0;
		try { dbg.enterRule(getGrammarFileName(), "timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:2: ( TIME (mInnerBlock1= inner_timeblock (mComment= comment )* )* )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:4: TIME (mInnerBlock1= inner_timeblock (mComment= comment )* )*
			{
			dbg.location(63,4);
			TIME9=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock340); if (state.failed) return json;dbg.location(63,8);
			if ( state.backtracking==0 ) {json.addProperty("Time", (TIME9!=null?TIME9.getText():null));}dbg.location(63,48);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:48: (mInnerBlock1= inner_timeblock (mComment= comment )* )*
			try { dbg.enterSubRule(11);

			loop11:
			do {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==INT||LA11_0==STANDALONE_COMMENT) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:49: mInnerBlock1= inner_timeblock (mComment= comment )*
					{
					dbg.location(63,61);
					pushFollow(FOLLOW_inner_timeblock_in_timeblock346);
					mInnerBlock1=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(63,77);
					if ( state.backtracking==0 ) {json.add("Block"+(blockCounter++), mInnerBlock1);}dbg.location(63,129);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:129: (mComment= comment )*
					try { dbg.enterSubRule(10);

					loop10:
					do {
						int alt10=2;
						try { dbg.enterDecision(10, decisionCanBacktrack[10]);

						switch ( input.LA(1) ) {
						case TIME:
							{
							int LA10_2 = input.LA(2);
							if ( (synpred18_test()) ) {
								alt10=1;
							}

							}
							break;
						case INT:
							{
							int LA10_3 = input.LA(2);
							if ( (LA10_3==EOF||(LA10_3 >= COMMENT && LA10_3 <= ELLIPSIS)||(LA10_3 >= INT && LA10_3 <= JUDGE_NAME)||LA10_3==PARENTHETICAL||LA10_3==RING_TITLE||(LA10_3 >= STANDALONE_COMMENT && LA10_3 <= TIME)) ) {
								alt10=1;
							}

							}
							break;
						case COMMENT:
						case DATE:
						case ELLIPSIS:
						case PARENTHETICAL:
							{
							alt10=1;
							}
							break;
						}
						} finally {dbg.exitDecision(10);}

						switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:130: mComment= comment
							{
							dbg.location(63,138);
							pushFollow(FOLLOW_comment_in_timeblock352);
							mComment=comment();
							state._fsp--;
							if (state.failed) return json;dbg.location(63,146);
							if ( state.backtracking==0 ) {comment+=mComment;}
							}
							break;

						default :
							break loop10;
						}
					} while (true);
					} finally {dbg.exitSubRule(10);}

					}
					break;

				default :
					break loop11;
				}
			} while (true);
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
		dbg.location(63, 174);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:1: inner_timeblock returns [JsonArray array] : (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | ring_comment )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mSpecialRing =null;
		JsonObject mJuniorRing =null;
		JsonObject mBreedRing =null;

		array = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "inner_timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:2: ( (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | ring_comment )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | ring_comment )+
			{
			dbg.location(67,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | ring_comment )+
			int cnt12=0;
			try { dbg.enterSubRule(12);

			loop12:
			do {
				int alt12=5;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==INT) ) {
					int LA12_2 = input.LA(2);
					if ( (synpred20_test()) ) {
						alt12=1;
					}
					else if ( (synpred21_test()) ) {
						alt12=2;
					}
					else if ( (synpred23_test()) ) {
						alt12=3;
					}

				}
				else if ( (LA12_0==STANDALONE_COMMENT) ) {
					int LA12_3 = input.LA(2);
					if ( (synpred24_test()) ) {
						alt12=4;
					}

				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:5: mSpecialRing= special_ring
					{
					dbg.location(67,17);
					pushFollow(FOLLOW_special_ring_in_inner_timeblock380);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(67,30);
					if ( state.backtracking==0 ) {array.add(mSpecialRing);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:57: mJuniorRing= junior_ring
					{
					dbg.location(67,68);
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock385);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(67,80);
					if ( state.backtracking==0 ) {array.add(mJuniorRing);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:106: ( ( breed_ring )=>mBreedRing= breed_ring )
					{
					dbg.location(67,106);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:106: ( ( breed_ring )=>mBreedRing= breed_ring )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:107: ( breed_ring )=>mBreedRing= breed_ring
					{
					dbg.location(67,131);
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock395);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(67,142);
					if ( state.backtracking==0 ) {array.add(mBreedRing);}
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:168: ring_comment
					{
					dbg.location(67,168);
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock399);
					ring_comment();
					state._fsp--;
					if (state.failed) return array;
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					if (state.backtracking>0) {state.failed=true; return array;}
						EarlyExitException eee =
							new EarlyExitException(12, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt12++;
			} while (true);
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
		dbg.location(67, 181);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:1: special_ring returns [JsonObject json] : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT10=null;
		Token BREED_NAME11=null;
		Token SPECIAL_SUFFIX12=null;

		json = new JsonObject(); String breedName = "";
		try { dbg.enterRule(getGrammarFileName(), "special_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(68, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:2: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:6: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			dbg.location(70,6);
			INT10=(Token)match(input,INT,FOLLOW_INT_in_special_ring421); if (state.failed) return json;dbg.location(70,9);
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT10!=null?INT10.getText():null));}dbg.location(70,49);
			BREED_NAME11=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring424); if (state.failed) return json;dbg.location(70,59);
			if ( state.backtracking==0 ) {breedName+=(BREED_NAME11!=null?BREED_NAME11.getText():null);}dbg.location(70,90);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:90: ( SPECIAL_SUFFIX )+
			int cnt13=0;
			try { dbg.enterSubRule(13);

			loop13:
			do {
				int alt13=2;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				int LA13_0 = input.LA(1);
				if ( (LA13_0==SPECIAL_SUFFIX) ) {
					alt13=1;
				}

				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:91: SPECIAL_SUFFIX
					{
					dbg.location(70,91);
					SPECIAL_SUFFIX12=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring428); if (state.failed) return json;dbg.location(70,105);
					if ( state.backtracking==0 ) {breedName+= " " +(SPECIAL_SUFFIX12!=null?SPECIAL_SUFFIX12.getText():null);}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(13, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt13++;
			} while (true);
			} finally {dbg.exitSubRule(13);}
			dbg.location(70,148);
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
		dbg.location(70, 190);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:71:1: junior_ring returns [JsonObject json] : INT JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT13=null;
		Token JUNIOR_CLASS14=null;

		json = new JsonObject();
		try { dbg.enterRule(getGrammarFileName(), "junior_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:2: ( INT JUNIOR_CLASS )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:7: INT JUNIOR_CLASS
			{
			dbg.location(73,7);
			INT13=(Token)match(input,INT,FOLLOW_INT_in_junior_ring453); if (state.failed) return json;dbg.location(73,10);
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT13!=null?INT13.getText():null));}dbg.location(73,50);
			JUNIOR_CLASS14=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring456); if (state.failed) return json;dbg.location(73,62);
			if ( state.backtracking==0 ) {json.addProperty("ClassName", (JUNIOR_CLASS14!=null?JUNIOR_CLASS14.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(73, 113);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:75:1: group_ring returns [String str] : GROUP_RING ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING15=null;

		try { dbg.enterRule(getGrammarFileName(), "group_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:76:2: ( GROUP_RING )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:76:5: GROUP_RING
			{
			dbg.location(76,5);
			GROUP_RING15=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring471); if (state.failed) return str;dbg.location(76,15);
			if ( state.backtracking==0 ) {str=(GROUP_RING15!=null?GROUP_RING15.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(76, 37);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:77:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME16=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "group_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:79:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:79:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+
			{
			dbg.location(79,4);
			TIME16=(Token)match(input,TIME,FOLLOW_TIME_in_group_block490); if (state.failed) return json;dbg.location(79,8);
			if ( state.backtracking==0 ) {json.addProperty("TIME", (TIME16!=null?TIME16.getText():null));}dbg.location(79,48);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:79:48: ( STANDALONE_COMMENT )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==STANDALONE_COMMENT) ) {
				alt14=1;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:79:48: STANDALONE_COMMENT
					{
					dbg.location(79,48);
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block493); if (state.failed) return json;
					}
					break;

			}
			} finally {dbg.exitSubRule(14);}
			dbg.location(79,68);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:79:68: (mRing= group_ring )+
			int cnt15=0;
			try { dbg.enterSubRule(15);

			loop15:
			do {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==GROUP_RING) ) {
					alt15=1;
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:79:69: mRing= group_ring
					{
					dbg.location(79,74);
					pushFollow(FOLLOW_group_ring_in_group_block499);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(79,86);
					if ( state.backtracking==0 ) {rings.add(new JsonPrimitive(mRing));}
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
			dbg.location(79,127);
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
		dbg.location(79, 153);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:80:1: breed_ring returns [JsonObject json] : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT17=null;
		Token BREED_NAME18=null;
		Token BREED_NAME_SUFFIX19=null;
		Token BREED_COUNT20=null;

		json = new JsonObject();String breedName = "";
		try { dbg.enterRule(getGrammarFileName(), "breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:82:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:82:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			dbg.location(82,9);
			INT17=(Token)match(input,INT,FOLLOW_INT_in_breed_ring527); if (state.failed) return json;dbg.location(82,12);
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT17!=null?INT17.getText():null));}dbg.location(82,52);
			BREED_NAME18=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring530); if (state.failed) return json;dbg.location(82,62);
			if ( state.backtracking==0 ) {breedName+=(BREED_NAME18!=null?BREED_NAME18.getText():null);}dbg.location(82,93);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:82:93: ( BREED_NAME_SUFFIX )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==BREED_NAME_SUFFIX) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:82:94: BREED_NAME_SUFFIX
					{
					dbg.location(82,94);
					BREED_NAME_SUFFIX19=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring534); if (state.failed) return json;dbg.location(82,111);
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX19!=null?BREED_NAME_SUFFIX19.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(82,159);
			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}dbg.location(82,203);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:82:203: ( BREED_COUNT )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==BREED_COUNT) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:82:204: BREED_COUNT
					{
					dbg.location(82,204);
					BREED_COUNT20=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring542); if (state.failed) return json;dbg.location(82,215);
					if ( state.backtracking==0 ) {json.addProperty("BreedCount", (BREED_COUNT20!=null?BREED_COUNT20.getText():null));}
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(82, 268);

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

	// $ANTLR start synpred9_test
	public final void synpred9_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:8: (mComment= comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:8: mComment= comment
		{
		dbg.location(46,16);
		pushFollow(FOLLOW_comment_in_synpred9_test245);
		mComment=comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred9_test

	// $ANTLR start synpred10_test
	public final void synpred10_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:42: ( TIME )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:42: TIME
		{
		dbg.location(46,42);
		match(input,TIME,FOLLOW_TIME_in_synpred10_test248); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred10_test

	// $ANTLR start synpred18_test
	public final void synpred18_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:130: (mComment= comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:130: mComment= comment
		{
		dbg.location(63,138);
		pushFollow(FOLLOW_comment_in_synpred18_test352);
		mComment=comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred18_test

	// $ANTLR start synpred20_test
	public final void synpred20_test_fragment() throws RecognitionException {
		JsonObject mSpecialRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:5: (mSpecialRing= special_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:5: mSpecialRing= special_ring
		{
		dbg.location(67,17);
		pushFollow(FOLLOW_special_ring_in_synpred20_test380);
		mSpecialRing=special_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred20_test

	// $ANTLR start synpred21_test
	public final void synpred21_test_fragment() throws RecognitionException {
		JsonObject mJuniorRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:57: (mJuniorRing= junior_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:57: mJuniorRing= junior_ring
		{
		dbg.location(67,68);
		pushFollow(FOLLOW_junior_ring_in_synpred21_test385);
		mJuniorRing=junior_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred21_test

	// $ANTLR start synpred23_test
	public final void synpred23_test_fragment() throws RecognitionException {
		JsonObject mBreedRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:106: ( ( ( breed_ring )=>mBreedRing= breed_ring ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:106: ( ( breed_ring )=>mBreedRing= breed_ring )
		{
		dbg.location(67,106);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:106: ( ( breed_ring )=>mBreedRing= breed_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:107: ( breed_ring )=>mBreedRing= breed_ring
		{
		dbg.location(67,131);
		pushFollow(FOLLOW_breed_ring_in_synpred23_test395);
		mBreedRing=breed_ring();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred23_test

	// $ANTLR start synpred24_test
	public final void synpred24_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:168: ( ring_comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:168: ring_comment
		{
		dbg.location(67,168);
		pushFollow(FOLLOW_ring_comment_in_synpred24_test399);
		ring_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred24_test

	// Delegated rules

	public final boolean synpred10_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred10_test_fragment(); // can never throw exception
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
	public final boolean synpred9_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred9_test_fragment(); // can never throw exception
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
	public final boolean synpred20_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred20_test_fragment(); // can never throw exception
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
	public final boolean synpred18_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred18_test_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_special_ring_in_test_special47 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start85 = new BitSet(new long[]{0x000002C260000740L});
	public static final BitSet FOLLOW_ring_in_start98 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_EOF_in_start105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring131 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_inner_ring_in_ring136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring162 = new BitSet(new long[]{0x0000020240000702L});
	public static final BitSet FOLLOW_comment_in_inner_ring165 = new BitSet(new long[]{0x0000020240000702L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring179 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block207 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block213 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_comment_in_big_comment245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_comment280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock340 = new BitSet(new long[]{0x0000010040000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock346 = new BitSet(new long[]{0x0000030240000702L});
	public static final BitSet FOLLOW_comment_in_timeblock352 = new BitSet(new long[]{0x0000030240000702L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock380 = new BitSet(new long[]{0x0000010040000002L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock385 = new BitSet(new long[]{0x0000010040000002L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock395 = new BitSet(new long[]{0x0000010040000002L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock399 = new BitSet(new long[]{0x0000010040000002L});
	public static final BitSet FOLLOW_INT_in_special_ring421 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring424 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring428 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring453 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_group_block490 = new BitSet(new long[]{0x0000010020000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block493 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block499 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring527 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring530 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring534 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred3_test93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred9_test245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred10_test248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred18_test352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_synpred20_test380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_synpred21_test385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred23_test395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred24_test399 = new BitSet(new long[]{0x0000000000000002L});
}
