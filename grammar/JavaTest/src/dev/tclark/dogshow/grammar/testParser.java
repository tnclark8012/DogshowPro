// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-02-23 17:35:04

package dev.tclark.dogshow.grammar;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class testParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_GROUP_NAME", "FRAG_MONTH", "FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_PROPER_NAME", "FRAG_RING", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "GROUP_RING", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "PROPER_NAME", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
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
	public static final int FRAG_SPEC_CHAR=23;
	public static final int FRAG_SPEC_WORD_CHAR=24;
	public static final int FRAG_TIME_LABEL=25;
	public static final int FRAG_TITLE=26;
	public static final int FRAG_WEEK_DAY=27;
	public static final int GROUP_RING=28;
	public static final int INT=29;
	public static final int JUDGE_NAME=30;
	public static final int JUNIOR_CLASS=31;
	public static final int PARENTHETICAL=32;
	public static final int PARENTHETICAL_INT=33;
	public static final int PARENTHETICAL_NAME=34;
	public static final int PHONE_NUMBER=35;
	public static final int PROPER_NAME=36;
	public static final int RING_TITLE=37;
	public static final int SPECIAL_SUFFIX=38;
	public static final int STANDALONE_COMMENT=39;
	public static final int TIME=40;
	public static final int WORD=41;
	public static final int WS=42;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public testParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public testParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return testParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g"; }


	  private boolean ahead(String text) {
	    System.out.println("Does " + input.toString() + " contain " + text + "?");
	    return input.toString().contains(text);
	  }



	// $ANTLR start "test_special"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:17: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:17: ( special_ring )+
			int cnt1=0;
			loop1:
			do {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:17: special_ring
					{
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
						throw eee;
				}
				cnt1++;
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "test_special"



	// $ANTLR start "test_breed"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:1: test_breed : breed_ring ;
	public final void test_breed() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:5: ( breed_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:9: breed_ring
			{
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
		return ;
	}
	// $ANTLR end "test_breed"



	// $ANTLR start "start"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:1: start : ( ( big_comment )+ ( ring )=> ( ring )* )+ EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:9: ( ( ( big_comment )+ ( ring )=> ( ring )* )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:13: ( ( big_comment )+ ( ring )=> ( ring )* )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:13: ( ( big_comment )+ ( ring )=> ( ring )* )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==BREED_NAME||(LA4_0 >= COMMENT && LA4_0 <= ELLIPSIS)||(LA4_0 >= INT && LA4_0 <= JUDGE_NAME)||LA4_0==PHONE_NUMBER||LA4_0==TIME) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:14: ( big_comment )+ ( ring )=> ( ring )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:14: ( big_comment )+
					int cnt2=0;
					loop2:
					do {
						int alt2=2;
						switch ( input.LA(1) ) {
						case COMMENT:
						case DATE:
						case ELLIPSIS:
						case INT:
						case JUDGE_NAME:
						case PHONE_NUMBER:
							{
							int LA2_3 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case TIME:
							{
							int LA2_4 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case BREED_NAME:
							{
							int LA2_5 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						}
						switch (alt2) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:14: big_comment
							{
							pushFollow(FOLLOW_big_comment_in_start66);
							big_comment();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(2, input);
								throw eee;
						}
						cnt2++;
					} while (true);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:35: ( ring )*
					loop3:
					do {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==RING_TITLE) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:35: ring
							{
							pushFollow(FOLLOW_ring_in_start73);
							ring();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop3;
						}
					} while (true);

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(4, input);
						throw eee;
				}
				cnt4++;
			} while (true);

			match(input,EOF,FOLLOW_EOF_in_start79); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "start"



	// $ANTLR start "ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:23:1: ring : RING_TITLE inner_ring ;
	public final void ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:23:9: ( RING_TITLE inner_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:23:13: RING_TITLE inner_ring
			{
			match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring91); if (state.failed) return ;
			pushFollow(FOLLOW_inner_ring_in_ring93);
			inner_ring();
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
		return ;
	}
	// $ANTLR end "ring"



	// $ANTLR start "inner_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:1: inner_ring : ( ( group_block )=> group_block | ( judge_block )+ );
	public final void inner_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:2: ( ( group_block )=> group_block | ( judge_block )+ )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TIME) && (synpred6_test())) {
				alt6=1;
			}
			else if ( (LA6_0==JUDGE_NAME) ) {
				alt6=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:5: ( group_block )=> group_block
					{
					pushFollow(FOLLOW_group_block_in_inner_ring106);
					group_block();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:7: ( judge_block )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:7: ( judge_block )+
					int cnt5=0;
					loop5:
					do {
						int alt5=2;
						alt5 = dfa5.predict(input);
						switch (alt5) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:7: judge_block
							{
							pushFollow(FOLLOW_judge_block_in_inner_ring114);
							judge_block();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(5, input);
								throw eee;
						}
						cnt5++;
					} while (true);

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
		return ;
	}
	// $ANTLR end "inner_ring"



	// $ANTLR start "judge_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:27:1: judge_block : JUDGE_NAME ( timeblock )+ ;
	public final void judge_block() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:5: ( JUDGE_NAME ( timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:9: JUDGE_NAME ( timeblock )+
			{
			match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block128); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:20: ( timeblock )+
			int cnt7=0;
			loop7:
			do {
				int alt7=2;
				alt7 = dfa7.predict(input);
				switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:20: timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block130);
					timeblock();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(7, input);
						throw eee;
				}
				cnt7++;
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "judge_block"



	// $ANTLR start "big_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:29:1: big_comment : ( comment | TIME | BREED_NAME ) ;
	public final void big_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:5: ( ( comment | TIME | BREED_NAME ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:9: ( comment | TIME | BREED_NAME )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:9: ( comment | TIME | BREED_NAME )
			int alt8=3;
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
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:10: comment
					{
					pushFollow(FOLLOW_comment_in_big_comment145);
					comment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:18: TIME
					{
					match(input,TIME,FOLLOW_TIME_in_big_comment147); if (state.failed) return ;
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:23: BREED_NAME
					{
					match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment149); if (state.failed) return ;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "big_comment"



	// $ANTLR start "comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:1: comment : ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS ) ;
	public final void comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:9: ( ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
			{
			if ( (input.LA(1) >= COMMENT && input.LA(1) <= ELLIPSIS)||(input.LA(1) >= INT && input.LA(1) <= JUDGE_NAME)||input.LA(1)==PHONE_NUMBER ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "comment"



	// $ANTLR start "ring_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:1: ring_comment : STANDALONE_COMMENT ;
	public final void ring_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:5: ( STANDALONE_COMMENT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:9: STANDALONE_COMMENT
			{
			match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment185); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "ring_comment"



	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:1: timeblock : TIME ( special_ring | junior_ring | ( breed_ring )=> breed_ring | comment )* ( special_ring | junior_ring | breed_ring | ring_comment ) ;
	public final void timeblock() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:13: ( TIME ( special_ring | junior_ring | ( breed_ring )=> breed_ring | comment )* ( special_ring | junior_ring | breed_ring | ring_comment ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:17: TIME ( special_ring | junior_ring | ( breed_ring )=> breed_ring | comment )* ( special_ring | junior_ring | breed_ring | ring_comment )
			{
			match(input,TIME,FOLLOW_TIME_in_timeblock197); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:22: ( special_ring | junior_ring | ( breed_ring )=> breed_ring | comment )*
			loop9:
			do {
				int alt9=5;
				alt9 = dfa9.predict(input);
				switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:23: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_timeblock200);
					special_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:36: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_timeblock202);
					junior_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:48: ( breed_ring )=> breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_timeblock208);
					breed_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:73: comment
					{
					pushFollow(FOLLOW_comment_in_timeblock210);
					comment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop9;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:83: ( special_ring | junior_ring | breed_ring | ring_comment )
			int alt10=4;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==INT) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==BREED_NAME) ) {
					int LA10_3 = input.LA(3);
					if ( (LA10_3==SPECIAL_SUFFIX) ) {
						alt10=1;
					}
					else if ( (LA10_3==EOF||(LA10_3 >= BREED_COUNT && LA10_3 <= ELLIPSIS)||(LA10_3 >= INT && LA10_3 <= JUDGE_NAME)||LA10_3==PHONE_NUMBER||LA10_3==RING_TITLE||LA10_3==TIME) ) {
						alt10=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 10, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA10_1==JUNIOR_CLASS) ) {
					alt10=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA10_0==STANDALONE_COMMENT) ) {
				alt10=4;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:84: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_timeblock215);
					special_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:97: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_timeblock217);
					junior_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:109: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_timeblock219);
					breed_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:120: ring_comment
					{
					pushFollow(FOLLOW_ring_comment_in_timeblock221);
					ring_comment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "timeblock"



	// $ANTLR start "special_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:1: special_ring : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final void special_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:13: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:17: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			match(input,INT,FOLLOW_INT_in_special_ring230); if (state.failed) return ;
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring232); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:32: ( SPECIAL_SUFFIX )+
			int cnt11=0;
			loop11:
			do {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==SPECIAL_SUFFIX) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:32: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring234); if (state.failed) return ;
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(11, input);
						throw eee;
				}
				cnt11++;
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "special_ring"



	// $ANTLR start "junior_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:1: junior_ring : INT JUNIOR_CLASS ;
	public final void junior_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:12: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:17: INT JUNIOR_CLASS
			{
			match(input,INT,FOLLOW_INT_in_junior_ring244); if (state.failed) return ;
			match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring246); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "junior_ring"



	// $ANTLR start "group_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:1: group_ring : GROUP_RING ;
	public final void group_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:41:2: ( GROUP_RING )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:41:5: GROUP_RING
			{
			match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring256); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "group_ring"



	// $ANTLR start "group_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:1: group_block : TIME STANDALONE_COMMENT ( group_ring )+ ;
	public final void group_block() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:2: ( TIME STANDALONE_COMMENT ( group_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:4: TIME STANDALONE_COMMENT ( group_ring )+
			{
			match(input,TIME,FOLLOW_TIME_in_group_block264); if (state.failed) return ;
			match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block266); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:28: ( group_ring )+
			int cnt12=0;
			loop12:
			do {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==GROUP_RING) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:28: group_ring
					{
					pushFollow(FOLLOW_group_ring_in_group_block268);
					group_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(12, input);
						throw eee;
				}
				cnt12++;
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "group_block"



	// $ANTLR start "breed_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:44:1: breed_ring : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final void breed_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			match(input,INT,FOLLOW_INT_in_breed_ring282); if (state.failed) return ;
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring284); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:24: ( BREED_NAME_SUFFIX )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BREED_NAME_SUFFIX) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:24: BREED_NAME_SUFFIX
					{
					match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring286); if (state.failed) return ;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:43: ( BREED_COUNT )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==BREED_COUNT) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:45:43: BREED_COUNT
					{
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring289); if (state.failed) return ;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "breed_ring"



	// $ANTLR start "breed_name"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:1: breed_name : BREED_NAME BREED_NAME_SUFFIX ;
	public final void breed_name() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:5: ( BREED_NAME BREED_NAME_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:9: BREED_NAME BREED_NAME_SUFFIX
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name303); if (state.failed) return ;
			match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name305); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "breed_name"

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:14: ( big_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:14: big_comment
		{
		pushFollow(FOLLOW_big_comment_in_synpred2_test66);
		big_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred2_test

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:27: ( ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:28: ring
		{
		pushFollow(FOLLOW_ring_in_synpred3_test70);
		ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred3_test

	// $ANTLR start synpred6_test
	public final void synpred6_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:5: ( group_block )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:6: group_block
		{
		pushFollow(FOLLOW_group_block_in_synpred6_test103);
		group_block();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred6_test

	// $ANTLR start synpred7_test
	public final void synpred7_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:7: ( judge_block )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:7: judge_block
		{
		pushFollow(FOLLOW_judge_block_in_synpred7_test114);
		judge_block();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred7_test

	// $ANTLR start synpred8_test
	public final void synpred8_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:20: ( timeblock )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:20: timeblock
		{
		pushFollow(FOLLOW_timeblock_in_synpred8_test130);
		timeblock();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred8_test

	// $ANTLR start synpred16_test
	public final void synpred16_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:23: ( special_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:23: special_ring
		{
		pushFollow(FOLLOW_special_ring_in_synpred16_test200);
		special_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred16_test

	// $ANTLR start synpred17_test
	public final void synpred17_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:36: ( junior_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:36: junior_ring
		{
		pushFollow(FOLLOW_junior_ring_in_synpred17_test202);
		junior_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred17_test

	// $ANTLR start synpred18_test
	public final void synpred18_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:48: ( breed_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:49: breed_ring
		{
		pushFollow(FOLLOW_breed_ring_in_synpred18_test205);
		breed_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred18_test

	// Delegated rules

	public final boolean synpred2_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA5 dfa5 = new DFA5(this);
	protected DFA7 dfa7 = new DFA7(this);
	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA5_eotS =
		"\10\uffff";
	static final String DFA5_eofS =
		"\1\1\1\uffff\4\1\2\uffff";
	static final String DFA5_minS =
		"\1\6\1\uffff\4\6\1\uffff\1\0";
	static final String DFA5_maxS =
		"\1\50\1\uffff\4\50\1\uffff\1\0";
	static final String DFA5_acceptS =
		"\1\uffff\1\2\4\uffff\1\1\1\uffff";
	static final String DFA5_specialS =
		"\7\uffff\1\0}>";
	static final String[] DFA5_transitionS = {
			"\1\1\1\uffff\3\1\22\uffff\1\1\1\2\4\uffff\1\1\1\uffff\1\1\2\uffff\1\1",
			"",
			"\1\1\1\uffff\3\1\22\uffff\2\1\4\uffff\1\1\1\uffff\1\1\2\uffff\1\3",
			"\1\1\1\uffff\3\5\22\uffff\1\4\1\5\4\uffff\1\5\1\uffff\1\1\1\uffff\1"+
			"\6\1\1",
			"\1\7\1\uffff\3\5\22\uffff\1\4\1\5\1\6\3\uffff\1\5\1\uffff\1\1\1\uffff"+
			"\1\6\1\1",
			"\1\1\1\uffff\3\5\22\uffff\1\4\1\5\4\uffff\1\5\1\uffff\1\1\1\uffff\1"+
			"\6\1\1",
			"",
			"\1\uffff"
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 26:7: ( judge_block )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA5_7 = input.LA(1);
						 
						int index5_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 6;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index5_7);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 5, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA7_eotS =
		"\7\uffff";
	static final String DFA7_eofS =
		"\1\1\1\uffff\3\1\2\uffff";
	static final String DFA7_minS =
		"\1\6\1\uffff\3\6\1\uffff\1\0";
	static final String DFA7_maxS =
		"\1\50\1\uffff\3\50\1\uffff\1\0";
	static final String DFA7_acceptS =
		"\1\uffff\1\2\3\uffff\1\1\1\uffff";
	static final String DFA7_specialS =
		"\6\uffff\1\0}>";
	static final String[] DFA7_transitionS = {
			"\1\1\1\uffff\3\1\22\uffff\2\1\4\uffff\1\1\1\uffff\1\1\2\uffff\1\2",
			"",
			"\1\1\1\uffff\3\4\22\uffff\1\3\1\4\4\uffff\1\4\1\uffff\1\1\1\uffff\1"+
			"\5\1\1",
			"\1\6\1\uffff\3\4\22\uffff\1\3\1\4\1\5\3\uffff\1\4\1\uffff\1\1\1\uffff"+
			"\1\5\1\1",
			"\1\1\1\uffff\3\4\22\uffff\1\3\1\4\4\uffff\1\4\1\uffff\1\1\1\uffff\1"+
			"\5\1\1",
			"",
			"\1\uffff"
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 28:20: ( timeblock )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA7_6 = input.LA(1);
						 
						int index7_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred8_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index7_6);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 7, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA9_eotS =
		"\31\uffff";
	static final String DFA9_eofS =
		"\4\uffff\10\2\1\uffff\3\2\1\uffff\3\2\5\uffff";
	static final String DFA9_minS =
		"\1\10\1\6\2\uffff\1\5\2\6\1\5\4\6\1\uffff\3\6\1\uffff\3\6\1\uffff\1\0"+
		"\1\uffff\2\0";
	static final String DFA9_maxS =
		"\2\47\2\uffff\10\50\1\uffff\3\50\1\uffff\3\50\1\uffff\1\0\1\uffff\2\0";
	static final String DFA9_acceptS =
		"\2\uffff\1\5\1\4\10\uffff\1\3\3\uffff\1\2\3\uffff\1\1\1\uffff\1\3\2\uffff";
	static final String DFA9_specialS =
		"\4\uffff\1\5\2\uffff\1\10\1\7\1\2\1\0\1\4\11\uffff\1\3\1\uffff\1\6\1\1}>";
	static final String[] DFA9_transitionS = {
			"\3\3\22\uffff\1\1\1\3\4\uffff\1\3\3\uffff\1\2",
			"\1\4\1\uffff\3\3\22\uffff\2\3\1\5\3\uffff\1\3\3\uffff\1\3",
			"",
			"",
			"\1\10\1\2\1\7\3\13\22\uffff\1\12\1\11\4\uffff\1\13\1\uffff\1\2\1\6\1"+
			"\14\1\2",
			"\1\2\1\uffff\3\17\22\uffff\1\16\1\15\4\uffff\1\17\1\uffff\1\2\1\uffff"+
			"\1\20\1\2",
			"\1\2\1\uffff\3\23\22\uffff\1\22\1\21\4\uffff\1\23\1\uffff\1\2\1\6\1"+
			"\24\1\2",
			"\1\10\1\2\1\uffff\3\13\22\uffff\1\12\1\11\4\uffff\1\13\1\uffff\1\2\1"+
			"\uffff\1\14\1\2",
			"\1\2\1\uffff\3\13\22\uffff\1\12\1\11\4\uffff\1\13\1\uffff\1\2\1\uffff"+
			"\1\14\1\2",
			"\1\2\1\uffff\3\13\22\uffff\1\12\1\13\4\uffff\1\13\1\uffff\1\2\1\uffff"+
			"\1\14\1\2",
			"\1\25\1\uffff\3\13\22\uffff\1\12\1\13\1\26\3\uffff\1\13\1\uffff\1\2"+
			"\1\uffff\1\14\1\2",
			"\1\2\1\uffff\3\13\22\uffff\1\12\1\13\4\uffff\1\13\1\uffff\1\2\1\uffff"+
			"\1\14\1\2",
			"",
			"\1\2\1\uffff\3\17\22\uffff\1\16\1\17\4\uffff\1\17\1\uffff\1\2\1\uffff"+
			"\1\20\1\2",
			"\1\27\1\uffff\3\17\22\uffff\1\16\1\17\1\20\3\uffff\1\17\1\uffff\1\2"+
			"\1\uffff\1\20\1\2",
			"\1\2\1\uffff\3\17\22\uffff\1\16\1\17\4\uffff\1\17\1\uffff\1\2\1\uffff"+
			"\1\20\1\2",
			"",
			"\1\2\1\uffff\3\23\22\uffff\1\22\1\23\4\uffff\1\23\1\uffff\1\2\1\uffff"+
			"\1\24\1\2",
			"\1\30\1\uffff\3\23\22\uffff\1\22\1\23\1\24\3\uffff\1\23\1\uffff\1\2"+
			"\1\uffff\1\24\1\2",
			"\1\2\1\uffff\3\23\22\uffff\1\22\1\23\4\uffff\1\23\1\uffff\1\2\1\uffff"+
			"\1\24\1\2",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 36:22: ( special_ring | junior_ring | ( breed_ring )=> breed_ring | comment )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA9_10 = input.LA(1);
						 
						int index9_10 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_10==BREED_NAME) ) {s = 21;}
						else if ( (LA9_10==JUNIOR_CLASS) && (synpred18_test())) {s = 22;}
						else if ( (LA9_10==EOF||LA9_10==RING_TITLE||LA9_10==TIME) ) {s = 2;}
						else if ( (LA9_10==INT) ) {s = 10;}
						else if ( ((LA9_10 >= COMMENT && LA9_10 <= ELLIPSIS)||LA9_10==JUDGE_NAME||LA9_10==PHONE_NUMBER) ) {s = 11;}
						else if ( (LA9_10==STANDALONE_COMMENT) && (synpred18_test())) {s = 12;}
						 
						input.seek(index9_10);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA9_24 = input.LA(1);
						 
						int index9_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred16_test()) ) {s = 20;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index9_24);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA9_9 = input.LA(1);
						 
						int index9_9 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_9==EOF||LA9_9==BREED_NAME||LA9_9==RING_TITLE||LA9_9==TIME) ) {s = 2;}
						else if ( (LA9_9==INT) ) {s = 10;}
						else if ( ((LA9_9 >= COMMENT && LA9_9 <= ELLIPSIS)||LA9_9==JUDGE_NAME||LA9_9==PHONE_NUMBER) ) {s = 11;}
						else if ( (LA9_9==STANDALONE_COMMENT) && (synpred18_test())) {s = 12;}
						 
						input.seek(index9_9);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA9_21 = input.LA(1);
						 
						int index9_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred18_test()) ) {s = 22;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index9_21);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA9_11 = input.LA(1);
						 
						int index9_11 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_11==EOF||LA9_11==BREED_NAME||LA9_11==RING_TITLE||LA9_11==TIME) ) {s = 2;}
						else if ( (LA9_11==INT) ) {s = 10;}
						else if ( ((LA9_11 >= COMMENT && LA9_11 <= ELLIPSIS)||LA9_11==JUDGE_NAME||LA9_11==PHONE_NUMBER) ) {s = 11;}
						else if ( (LA9_11==STANDALONE_COMMENT) && (synpred18_test())) {s = 12;}
						 
						input.seek(index9_11);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA9_4 = input.LA(1);
						 
						int index9_4 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_4==SPECIAL_SUFFIX) ) {s = 6;}
						else if ( (LA9_4==BREED_NAME_SUFFIX) ) {s = 7;}
						else if ( (LA9_4==BREED_COUNT) ) {s = 8;}
						else if ( (LA9_4==EOF||LA9_4==BREED_NAME||LA9_4==RING_TITLE||LA9_4==TIME) ) {s = 2;}
						else if ( (LA9_4==JUDGE_NAME) ) {s = 9;}
						else if ( (LA9_4==INT) ) {s = 10;}
						else if ( ((LA9_4 >= COMMENT && LA9_4 <= ELLIPSIS)||LA9_4==PHONE_NUMBER) ) {s = 11;}
						else if ( (LA9_4==STANDALONE_COMMENT) && (synpred18_test())) {s = 12;}
						 
						input.seek(index9_4);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA9_23 = input.LA(1);
						 
						int index9_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred17_test()) ) {s = 16;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index9_23);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA9_8 = input.LA(1);
						 
						int index9_8 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_8==EOF||LA9_8==BREED_NAME||LA9_8==RING_TITLE||LA9_8==TIME) ) {s = 2;}
						else if ( (LA9_8==JUDGE_NAME) ) {s = 9;}
						else if ( (LA9_8==INT) ) {s = 10;}
						else if ( ((LA9_8 >= COMMENT && LA9_8 <= ELLIPSIS)||LA9_8==PHONE_NUMBER) ) {s = 11;}
						else if ( (LA9_8==STANDALONE_COMMENT) && (synpred18_test())) {s = 12;}
						 
						input.seek(index9_8);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA9_7 = input.LA(1);
						 
						int index9_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_7==BREED_COUNT) ) {s = 8;}
						else if ( (LA9_7==EOF||LA9_7==BREED_NAME||LA9_7==RING_TITLE||LA9_7==TIME) ) {s = 2;}
						else if ( (LA9_7==JUDGE_NAME) ) {s = 9;}
						else if ( (LA9_7==INT) ) {s = 10;}
						else if ( ((LA9_7 >= COMMENT && LA9_7 <= ELLIPSIS)||LA9_7==PHONE_NUMBER) ) {s = 11;}
						else if ( (LA9_7==STANDALONE_COMMENT) && (synpred18_test())) {s = 12;}
						 
						input.seek(index9_7);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 9, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_special_ring_in_test_special40 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start66 = new BitSet(new long[]{0x0000012860000740L});
	public static final BitSet FOLLOW_ring_in_start73 = new BitSet(new long[]{0x0000012860000740L});
	public static final BitSet FOLLOW_EOF_in_start79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring91 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_inner_ring_in_ring93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring114 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block128 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block130 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_comment_in_big_comment145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock197 = new BitSet(new long[]{0x0000008860000700L});
	public static final BitSet FOLLOW_special_ring_in_timeblock200 = new BitSet(new long[]{0x0000008860000700L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock202 = new BitSet(new long[]{0x0000008860000700L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock208 = new BitSet(new long[]{0x0000008860000700L});
	public static final BitSet FOLLOW_comment_in_timeblock210 = new BitSet(new long[]{0x0000008860000700L});
	public static final BitSet FOLLOW_special_ring_in_timeblock215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_timeblock221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring230 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring232 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring234 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring244 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_group_block264 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block266 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block268 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring282 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring284 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring286 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name303 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_synpred2_test66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred3_test70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_synpred6_test103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_block_in_synpred7_test114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_in_synpred8_test130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_synpred16_test200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_synpred17_test202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred18_test205 = new BitSet(new long[]{0x0000000000000002L});
}
