// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g 2013-02-10 22:51:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class dogshowcomboParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", "DATE", "ELLIPSIS", "END_PUNCTUATION", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_PLURAL", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SUFFIX", "FRAG_MONTH", "FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_RING", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "INT", "JUDGE", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", "RING_TITLE", "SPECIAL_SUFFIX", "TIME", "WORD", "WS"
	};

	public static final int EOF=-1;
	public static final int ATOM=4;
	public static final int BREED_COUNT=5;
	public static final int BREED_NAME=6;
	public static final int DATE=7;
	public static final int ELLIPSIS=8;
	public static final int END_PUNCTUATION=9;
	public static final int FRAG_BREED_NAME_ALT=10;
	public static final int FRAG_BREED_NAME_PLURAL=11;
	public static final int FRAG_BREED_NAME_SINGLE=12;
	public static final int FRAG_BREED_NAME_SUFFIX=13;
	public static final int FRAG_MONTH=14;
	public static final int FRAG_PAREN_LEFT=15;
	public static final int FRAG_PAREN_RIGHT=16;
	public static final int FRAG_RING=17;
	public static final int FRAG_SPEC_CHAR=18;
	public static final int FRAG_SPEC_WORD_CHAR=19;
	public static final int FRAG_TIME_LABEL=20;
	public static final int FRAG_TITLE=21;
	public static final int FRAG_WEEK_DAY=22;
	public static final int INT=23;
	public static final int JUDGE=24;
	public static final int JUNIOR_CLASS=25;
	public static final int PARENTHETICAL=26;
	public static final int PARENTHETICAL_INT=27;
	public static final int RING_TITLE=28;
	public static final int SPECIAL_SUFFIX=29;
	public static final int TIME=30;
	public static final int WORD=31;
	public static final int WS=32;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


public static final String[] ruleNames = new String[] {
	"invalidRule", "special_ring", "junior_ring", "start", "test_special", 
    "ring", "judge_block", "timeblock", "breed_ring", "test_breed"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
	false, // invalid decision
	false, false, false, false, false, false, false, false
};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public dogshowcomboParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public dogshowcomboParser(TokenStream input, int port, RecognizerSharedState state) {
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

public dogshowcomboParser(TokenStream input, DebugEventListener dbg) {
	super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
	dbg.semanticPredicate(result, predicate);
	return result;
}

	@Override public String[] getTokenNames() { return dogshowcomboParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g"; }


	  private boolean ahead(String text) {
	  	System.out.println("Does " + input.toString() + " contain " + text + "?");
		return input.toString().contains(text);
	  }



	// $ANTLR start "test_special"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "test_special");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(8, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:13: ( ( special_ring )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:15: ( special_ring )+
			{
			dbg.location(8,15);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:15: ( special_ring )+
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:15: special_ring
					{
					dbg.location(8,15);
					pushFollow(FOLLOW_special_ring_in_test_special16);
					special_ring();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
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
		dbg.location(8, 27);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:9:1: test_breed : ( breed_ring )+ EOF ;
	public final void test_breed() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "test_breed");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:2: ( ( breed_ring )+ EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:4: ( breed_ring )+ EOF
			{
			dbg.location(10,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:4: ( breed_ring )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			do {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==INT) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:4: breed_ring
					{
					dbg.location(10,4);
					pushFollow(FOLLOW_breed_ring_in_test_breed25);
					breed_ring();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
						EarlyExitException eee =
							new EarlyExitException(2, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt2++;
			} while (true);
			} finally {dbg.exitSubRule(2);}
			dbg.location(10,16);
			match(input,EOF,FOLLOW_EOF_in_test_breed28); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(10, 18);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:1: start : ( ring )+ EOF ;
	public final void start() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(11, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:7: ( ( ring )+ EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:9: ( ring )+ EOF
			{
			dbg.location(11,9);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:9: ( ring )+
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			do {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==RING_TITLE) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:9: ring
					{
					dbg.location(11,9);
					pushFollow(FOLLOW_ring_in_start35);
					ring();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
						EarlyExitException eee =
							new EarlyExitException(3, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt3++;
			} while (true);
			} finally {dbg.exitSubRule(3);}
			dbg.location(11,15);
			match(input,EOF,FOLLOW_EOF_in_start38); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(11, 17);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "start");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "start"



	// $ANTLR start "ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:1: ring : RING_TITLE ( judge_block )+ ;
	public final void ring() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:6: ( RING_TITLE ( judge_block )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:8: RING_TITLE ( judge_block )+
			{
			dbg.location(12,8);
			match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring45); dbg.location(12,19);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:19: ( judge_block )+
			int cnt4=0;
			try { dbg.enterSubRule(4);

			loop4:
			do {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==JUDGE) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:19: judge_block
					{
					dbg.location(12,19);
					pushFollow(FOLLOW_judge_block_in_ring47);
					judge_block();
					state._fsp--;

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
						EarlyExitException eee =
							new EarlyExitException(4, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt4++;
			} while (true);
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(12, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "ring"



	// $ANTLR start "judge_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:14:1: judge_block : JUDGE ( timeblock )+ ;
	public final void judge_block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "judge_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:2: ( JUDGE ( timeblock )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:4: JUDGE ( timeblock )+
			{
			dbg.location(15,4);
			match(input,JUDGE,FOLLOW_JUDGE_in_judge_block57); dbg.location(15,10);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:10: ( timeblock )+
			int cnt5=0;
			try { dbg.enterSubRule(5);

			loop5:
			do {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==TIME) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:10: timeblock
					{
					dbg.location(15,10);
					pushFollow(FOLLOW_timeblock_in_judge_block59);
					timeblock();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
						EarlyExitException eee =
							new EarlyExitException(5, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt5++;
			} while (true);
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(15, 19);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "judge_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "judge_block"



	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:16:1: timeblock : TIME ( breed_ring | special_ring | junior_ring )+ ;
	public final void timeblock() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:2: ( TIME ( breed_ring | special_ring | junior_ring )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:4: TIME ( breed_ring | special_ring | junior_ring )+
			{
			dbg.location(17,4);
			match(input,TIME,FOLLOW_TIME_in_timeblock68); dbg.location(17,9);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:9: ( breed_ring | special_ring | junior_ring )+
			int cnt6=0;
			try { dbg.enterSubRule(6);

			loop6:
			do {
				int alt6=4;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==INT) ) {
					int LA6_2 = input.LA(2);
					if ( (LA6_2==BREED_NAME) ) {
						int LA6_3 = input.LA(3);
						if ( (LA6_3==EOF||LA6_3==BREED_COUNT||(LA6_3 >= INT && LA6_3 <= JUDGE)||LA6_3==RING_TITLE||LA6_3==TIME) ) {
							alt6=1;
						}
						else if ( (LA6_3==SPECIAL_SUFFIX) ) {
							alt6=2;
						}

					}
					else if ( (LA6_2==JUNIOR_CLASS) ) {
						alt6=3;
					}

				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:10: breed_ring
					{
					dbg.location(17,10);
					pushFollow(FOLLOW_breed_ring_in_timeblock71);
					breed_ring();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:21: special_ring
					{
					dbg.location(17,21);
					pushFollow(FOLLOW_special_ring_in_timeblock73);
					special_ring();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:34: junior_ring
					{
					dbg.location(17,34);
					pushFollow(FOLLOW_junior_ring_in_timeblock75);
					junior_ring();
					state._fsp--;

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
						EarlyExitException eee =
							new EarlyExitException(6, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt6++;
			} while (true);
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 46);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "timeblock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "timeblock"



	// $ANTLR start "special_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:19:1: special_ring : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final void special_ring() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "special_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:19:13: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:19:17: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			dbg.location(19,17);
			match(input,INT,FOLLOW_INT_in_special_ring87); dbg.location(19,21);
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring89); dbg.location(19,32);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:19:32: ( SPECIAL_SUFFIX )+
			int cnt7=0;
			try { dbg.enterSubRule(7);

			loop7:
			do {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==SPECIAL_SUFFIX) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:19:32: SPECIAL_SUFFIX
					{
					dbg.location(19,32);
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring91); 
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
						EarlyExitException eee =
							new EarlyExitException(7, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt7++;
			} while (true);
			} finally {dbg.exitSubRule(7);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(19, 46);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "special_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "special_ring"



	// $ANTLR start "junior_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:1: junior_ring : INT JUNIOR_CLASS ;
	public final void junior_ring() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "junior_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:12: ( INT JUNIOR_CLASS )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:14: INT JUNIOR_CLASS
			{
			dbg.location(20,14);
			match(input,INT,FOLLOW_INT_in_junior_ring98); dbg.location(20,18);
			match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring100); 
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
			dbg.exitRule(getGrammarFileName(), "junior_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "junior_ring"



	// $ANTLR start "breed_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:1: breed_ring : INT BREED_NAME ( BREED_COUNT )? ;
	public final void breed_ring() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:22:2: ( INT BREED_NAME ( BREED_COUNT )? )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:22:4: INT BREED_NAME ( BREED_COUNT )?
			{
			dbg.location(22,4);
			match(input,INT,FOLLOW_INT_in_breed_ring108); dbg.location(22,8);
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring110); dbg.location(22,19);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:22:19: ( BREED_COUNT )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==BREED_COUNT) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:22:19: BREED_COUNT
					{
					dbg.location(22,19);
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring112); 
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
		dbg.location(22, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "breed_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "breed_ring"

	// Delegated rules



	public static final BitSet FOLLOW_special_ring_in_test_special16 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed25 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_EOF_in_test_breed28 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_start35 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EOF_in_start38 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring45 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_judge_block_in_ring47 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_JUDGE_in_judge_block57 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block59 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock68 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock71 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_special_ring_in_timeblock73 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock75 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_INT_in_special_ring87 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring89 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring91 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring98 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring108 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring110 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring112 = new BitSet(new long[]{0x0000000000000002L});
}
