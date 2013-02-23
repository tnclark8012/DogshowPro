// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-02-23 13:58:24

package dev.tclark.dogshow.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class testParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_MONTH", "FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_PROPER_NAME", "FRAG_RING", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "PROPER_NAME", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
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
	public static final int FRAG_MONTH=17;
	public static final int FRAG_PAREN_LEFT=18;
	public static final int FRAG_PAREN_RIGHT=19;
	public static final int FRAG_PROPER_NAME=20;
	public static final int FRAG_RING=21;
	public static final int FRAG_SPEC_CHAR=22;
	public static final int FRAG_SPEC_WORD_CHAR=23;
	public static final int FRAG_TIME_LABEL=24;
	public static final int FRAG_TITLE=25;
	public static final int FRAG_WEEK_DAY=26;
	public static final int INT=27;
	public static final int JUDGE_NAME=28;
	public static final int JUNIOR_CLASS=29;
	public static final int PARENTHETICAL=30;
	public static final int PARENTHETICAL_INT=31;
	public static final int PARENTHETICAL_NAME=32;
	public static final int PHONE_NUMBER=33;
	public static final int PROPER_NAME=34;
	public static final int RING_TITLE=35;
	public static final int SPECIAL_SUFFIX=36;
	public static final int STANDALONE_COMMENT=37;
	public static final int TIME=38;
	public static final int WORD=39;
	public static final int WS=40;

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:17: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:17: ( special_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:17: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_test_special32);
					special_ring();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:16:1: test_breed : breed_ring ;
	public final void test_breed() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:5: ( breed_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:9: breed_ring
			{
			pushFollow(FOLLOW_breed_ring_in_test_breed46);
			breed_ring();
			state._fsp--;

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:1: start : ( big_comment )+ ( ring )+ ( big_comment )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:9: ( ( big_comment )+ ( ring )+ ( big_comment )* EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:13: ( big_comment )+ ( ring )+ ( big_comment )* EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:13: ( big_comment )+
			int cnt2=0;
			loop2:
			do {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BREED_NAME||(LA2_0 >= COMMENT && LA2_0 <= ELLIPSIS)||(LA2_0 >= INT && LA2_0 <= JUDGE_NAME)||LA2_0==PHONE_NUMBER||LA2_0==TIME) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:13: big_comment
					{
					pushFollow(FOLLOW_big_comment_in_start57);
					big_comment();
					state._fsp--;

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

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:26: ( ring )+
			int cnt3=0;
			loop3:
			do {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==RING_TITLE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:26: ring
					{
					pushFollow(FOLLOW_ring_in_start60);
					ring();
					state._fsp--;

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

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:32: ( big_comment )*
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==BREED_NAME||(LA4_0 >= COMMENT && LA4_0 <= ELLIPSIS)||(LA4_0 >= INT && LA4_0 <= JUDGE_NAME)||LA4_0==PHONE_NUMBER||LA4_0==TIME) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:32: big_comment
					{
					pushFollow(FOLLOW_big_comment_in_start63);
					big_comment();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			} while (true);

			match(input,EOF,FOLLOW_EOF_in_start66); 
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:1: ring : RING_TITLE ( judge_block )+ ;
	public final void ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:9: ( RING_TITLE ( judge_block )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:13: RING_TITLE ( judge_block )+
			{
			match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring78); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:24: ( judge_block )+
			int cnt5=0;
			loop5:
			do {
				int alt5=2;
				alt5 = dfa5.predict(input);
				switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:24: judge_block
					{
					pushFollow(FOLLOW_judge_block_in_ring80);
					judge_block();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
						EarlyExitException eee =
							new EarlyExitException(5, input);
						throw eee;
				}
				cnt5++;
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
	// $ANTLR end "ring"



	// $ANTLR start "judge_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:1: judge_block : JUDGE_NAME ( timeblock )+ ;
	public final void judge_block() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:5: ( JUDGE_NAME ( timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:9: JUDGE_NAME ( timeblock )+
			{
			match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block95); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:20: ( timeblock )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				alt6 = dfa6.predict(input);
				switch (alt6) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:20: timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block97);
					timeblock();
					state._fsp--;

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:23:1: big_comment : ( comment | TIME | BREED_NAME ) ;
	public final void big_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:5: ( ( comment | TIME | BREED_NAME ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:9: ( comment | TIME | BREED_NAME )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:9: ( comment | TIME | BREED_NAME )
			int alt7=3;
			switch ( input.LA(1) ) {
			case COMMENT:
			case DATE:
			case ELLIPSIS:
			case INT:
			case JUDGE_NAME:
			case PHONE_NUMBER:
				{
				alt7=1;
				}
				break;
			case TIME:
				{
				alt7=2;
				}
				break;
			case BREED_NAME:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:10: comment
					{
					pushFollow(FOLLOW_comment_in_big_comment112);
					comment();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:18: TIME
					{
					match(input,TIME,FOLLOW_TIME_in_big_comment114); 
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:23: BREED_NAME
					{
					match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment116); 
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:1: comment : ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS ) ;
	public final void comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:9: ( ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
			{
			if ( (input.LA(1) >= COMMENT && input.LA(1) <= ELLIPSIS)||(input.LA(1) >= INT && input.LA(1) <= JUDGE_NAME)||input.LA(1)==PHONE_NUMBER ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:27:1: ring_comment : STANDALONE_COMMENT ;
	public final void ring_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:5: ( STANDALONE_COMMENT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:9: STANDALONE_COMMENT
			{
			match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment152); 
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:1: timeblock : TIME ( special_ring | junior_ring | breed_ring | comment )* ( special_ring | junior_ring | breed_ring | ring_comment ) ;
	public final void timeblock() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:13: ( TIME ( special_ring | junior_ring | breed_ring | comment )* ( special_ring | junior_ring | breed_ring | ring_comment ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:17: TIME ( special_ring | junior_ring | breed_ring | comment )* ( special_ring | junior_ring | breed_ring | ring_comment )
			{
			match(input,TIME,FOLLOW_TIME_in_timeblock164); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:22: ( special_ring | junior_ring | breed_ring | comment )*
			loop8:
			do {
				int alt8=5;
				alt8 = dfa8.predict(input);
				switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:23: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_timeblock167);
					special_ring();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:36: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_timeblock169);
					junior_ring();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:48: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_timeblock171);
					breed_ring();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:59: comment
					{
					pushFollow(FOLLOW_comment_in_timeblock173);
					comment();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:69: ( special_ring | junior_ring | breed_ring | ring_comment )
			int alt9=4;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==INT) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==BREED_NAME) ) {
					int LA9_3 = input.LA(3);
					if ( (LA9_3==SPECIAL_SUFFIX) ) {
						alt9=1;
					}
					else if ( (LA9_3==EOF||(LA9_3 >= BREED_COUNT && LA9_3 <= ELLIPSIS)||(LA9_3 >= INT && LA9_3 <= JUDGE_NAME)||LA9_3==PHONE_NUMBER||LA9_3==RING_TITLE||LA9_3==TIME) ) {
						alt9=3;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 9, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA9_1==JUNIOR_CLASS) ) {
					alt9=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA9_0==STANDALONE_COMMENT) ) {
				alt9=4;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:70: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_timeblock178);
					special_ring();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:83: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_timeblock180);
					junior_ring();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:95: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_timeblock182);
					breed_ring();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:106: ring_comment
					{
					pushFollow(FOLLOW_ring_comment_in_timeblock184);
					ring_comment();
					state._fsp--;

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:1: special_ring : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final void special_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:13: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:17: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			match(input,INT,FOLLOW_INT_in_special_ring193); 
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring195); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:32: ( SPECIAL_SUFFIX )+
			int cnt10=0;
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==SPECIAL_SUFFIX) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:32: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring197); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
						EarlyExitException eee =
							new EarlyExitException(10, input);
						throw eee;
				}
				cnt10++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:1: junior_ring : INT JUNIOR_CLASS ;
	public final void junior_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:12: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:17: INT JUNIOR_CLASS
			{
			match(input,INT,FOLLOW_INT_in_junior_ring207); 
			match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring209); 
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



	// $ANTLR start "breed_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:1: breed_ring : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final void breed_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			match(input,INT,FOLLOW_INT_in_breed_ring222); 
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring224); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:24: ( BREED_NAME_SUFFIX )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BREED_NAME_SUFFIX) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:24: BREED_NAME_SUFFIX
					{
					match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring226); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:43: ( BREED_COUNT )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==BREED_COUNT) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:43: BREED_COUNT
					{
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring229); 
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:35:1: breed_name : BREED_NAME BREED_NAME_SUFFIX ;
	public final void breed_name() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:5: ( BREED_NAME BREED_NAME_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:9: BREED_NAME BREED_NAME_SUFFIX
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name243); 
			match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name245); 
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

	// Delegated rules


	protected DFA5 dfa5 = new DFA5(this);
	protected DFA6 dfa6 = new DFA6(this);
	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA5_eotS =
		"\10\uffff";
	static final String DFA5_eofS =
		"\2\2\1\uffff\3\2\2\uffff";
	static final String DFA5_minS =
		"\2\6\1\uffff\3\6\2\uffff";
	static final String DFA5_maxS =
		"\2\46\1\uffff\3\46\2\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\2\3\uffff\2\1";
	static final String DFA5_specialS =
		"\10\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\2\1\uffff\3\2\20\uffff\1\2\1\1\4\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"\1\2\1\uffff\3\2\20\uffff\2\2\4\uffff\1\2\4\uffff\1\3",
			"",
			"\1\2\1\uffff\3\5\20\uffff\1\4\1\5\4\uffff\1\5\3\uffff\1\6\1\2",
			"\1\7\1\uffff\3\5\20\uffff\1\4\1\5\1\7\3\uffff\1\5\3\uffff\1\6\1\2",
			"\1\2\1\uffff\3\5\20\uffff\1\4\1\5\4\uffff\1\5\3\uffff\1\6\1\2",
			"",
			""
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
			return "()+ loopback of 19:24: ( judge_block )+";
		}
	}

	static final String DFA6_eotS =
		"\7\uffff";
	static final String DFA6_eofS =
		"\1\1\1\uffff\3\1\2\uffff";
	static final String DFA6_minS =
		"\1\6\1\uffff\3\6\2\uffff";
	static final String DFA6_maxS =
		"\1\46\1\uffff\3\46\2\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\2\3\uffff\2\1";
	static final String DFA6_specialS =
		"\7\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1\1\uffff\3\1\20\uffff\2\1\4\uffff\1\1\1\uffff\1\1\2\uffff\1\2",
			"",
			"\1\1\1\uffff\3\4\20\uffff\1\3\1\4\4\uffff\1\4\3\uffff\1\5\1\1",
			"\1\6\1\uffff\3\4\20\uffff\1\3\1\4\1\6\3\uffff\1\4\3\uffff\1\5\1\1",
			"\1\1\1\uffff\3\4\20\uffff\1\3\1\4\4\uffff\1\4\3\uffff\1\5\1\1",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 22:20: ( timeblock )+";
		}
	}

	static final String DFA8_eotS =
		"\30\uffff";
	static final String DFA8_eofS =
		"\4\uffff\10\2\1\uffff\3\2\1\uffff\3\2\4\uffff";
	static final String DFA8_minS =
		"\1\10\1\6\2\uffff\1\5\2\6\1\5\4\6\1\uffff\3\6\1\uffff\3\6\4\uffff";
	static final String DFA8_maxS =
		"\2\45\2\uffff\10\46\1\uffff\3\46\1\uffff\3\46\4\uffff";
	static final String DFA8_acceptS =
		"\2\uffff\1\5\1\4\10\uffff\1\3\3\uffff\1\2\3\uffff\1\1\1\3\1\2\1\1";
	static final String DFA8_specialS =
		"\30\uffff}>";
	static final String[] DFA8_transitionS = {
			"\3\3\20\uffff\1\1\1\3\4\uffff\1\3\3\uffff\1\2",
			"\1\4\1\uffff\3\3\20\uffff\2\3\1\5\3\uffff\1\3\3\uffff\1\3",
			"",
			"",
			"\1\10\1\2\1\7\3\13\20\uffff\1\12\1\11\4\uffff\1\13\1\uffff\1\2\1\6\1"+
			"\14\1\2",
			"\1\2\1\uffff\3\17\20\uffff\1\16\1\15\4\uffff\1\17\1\uffff\1\2\1\uffff"+
			"\1\20\1\2",
			"\1\2\1\uffff\3\23\20\uffff\1\22\1\21\4\uffff\1\23\1\uffff\1\2\1\6\1"+
			"\24\1\2",
			"\1\10\1\2\1\uffff\3\13\20\uffff\1\12\1\11\4\uffff\1\13\1\uffff\1\2\1"+
			"\uffff\1\14\1\2",
			"\1\2\1\uffff\3\13\20\uffff\1\12\1\11\4\uffff\1\13\1\uffff\1\2\1\uffff"+
			"\1\14\1\2",
			"\1\2\1\uffff\3\13\20\uffff\1\12\1\13\4\uffff\1\13\3\uffff\1\14\1\2",
			"\1\25\1\uffff\3\13\20\uffff\1\12\1\13\1\25\3\uffff\1\13\3\uffff\1\14"+
			"\1\2",
			"\1\2\1\uffff\3\13\20\uffff\1\12\1\13\4\uffff\1\13\3\uffff\1\14\1\2",
			"",
			"\1\2\1\uffff\3\17\20\uffff\1\16\1\17\4\uffff\1\17\3\uffff\1\20\1\2",
			"\1\26\1\uffff\3\17\20\uffff\1\16\1\17\1\26\3\uffff\1\17\3\uffff\1\20"+
			"\1\2",
			"\1\2\1\uffff\3\17\20\uffff\1\16\1\17\4\uffff\1\17\3\uffff\1\20\1\2",
			"",
			"\1\2\1\uffff\3\23\20\uffff\1\22\1\23\4\uffff\1\23\3\uffff\1\24\1\2",
			"\1\27\1\uffff\3\23\20\uffff\1\22\1\23\1\27\3\uffff\1\23\3\uffff\1\24"+
			"\1\2",
			"\1\2\1\uffff\3\23\20\uffff\1\22\1\23\4\uffff\1\23\3\uffff\1\24\1\2",
			"",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 30:22: ( special_ring | junior_ring | breed_ring | comment )*";
		}
	}

	public static final BitSet FOLLOW_special_ring_in_test_special32 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start57 = new BitSet(new long[]{0x0000004A18000740L});
	public static final BitSet FOLLOW_ring_in_start60 = new BitSet(new long[]{0x0000004A18000740L});
	public static final BitSet FOLLOW_big_comment_in_start63 = new BitSet(new long[]{0x0000004218000740L});
	public static final BitSet FOLLOW_EOF_in_start66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring78 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_judge_block_in_ring80 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block95 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block97 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_comment_in_big_comment112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock164 = new BitSet(new long[]{0x0000002218000700L});
	public static final BitSet FOLLOW_special_ring_in_timeblock167 = new BitSet(new long[]{0x0000002218000700L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock169 = new BitSet(new long[]{0x0000002218000700L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock171 = new BitSet(new long[]{0x0000002218000700L});
	public static final BitSet FOLLOW_comment_in_timeblock173 = new BitSet(new long[]{0x0000002218000700L});
	public static final BitSet FOLLOW_special_ring_in_timeblock178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_timeblock184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring193 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring195 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring197 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring207 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring222 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring224 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring226 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name243 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name245 = new BitSet(new long[]{0x0000000000000002L});
}
