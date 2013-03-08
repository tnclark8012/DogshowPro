// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-02-22 20:44:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class testParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_MONTH", "FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_PROPER_NAME", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "INT", "JUDGE_ADDRESS", "JUDGE_NAME", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "PROPER_NAME", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
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
	public static final int FRAG_SPEC_CHAR=21;
	public static final int FRAG_SPEC_WORD_CHAR=22;
	public static final int FRAG_TIME_LABEL=23;
	public static final int FRAG_TITLE=24;
	public static final int FRAG_WEEK_DAY=25;
	public static final int INT=26;
	public static final int JUDGE_ADDRESS=27;
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



	// $ANTLR start "test_special"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:3:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:3:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:3:15: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:3:15: ( special_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:3:15: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_test_special9);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:4:1: test_breed : ( breed_ring )+ ;
	public final void test_breed() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:5:2: ( ( breed_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:5:4: ( breed_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:5:4: ( breed_ring )+
			int cnt2=0;
			loop2:
			do {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==INT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:5:4: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_test_breed18);
					breed_ring();
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:6:1: start : comment ( ring )+ EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:6:7: ( comment ( ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:6:9: comment ( ring )+ EOF
			{
			pushFollow(FOLLOW_comment_in_start26);
			comment();
			state._fsp--;
			if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:6:17: ( ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:6:17: ring
					{
					pushFollow(FOLLOW_ring_in_start28);
					ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(3, input);
						throw eee;
				}
				cnt3++;
			} while (true);

			match(input,EOF,FOLLOW_EOF_in_start31); if (state.failed) return ;
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


	public static class ring_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:7:1: ring : RING_TITLE ( judge_block )+ ;
	public final testParser.ring_return ring() throws RecognitionException {
		testParser.ring_return retval = new testParser.ring_return();
		retval.start = input.LT(1);

		Token RING_TITLE1=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:7:6: ( RING_TITLE ( judge_block )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:7:8: RING_TITLE ( judge_block )+
			{
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring38); if (state.failed) return retval;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:7:19: ( judge_block )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==JUDGE_NAME) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:7:19: judge_block
					{
					pushFollow(FOLLOW_judge_block_in_ring40);
					judge_block();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(4, input);
						throw eee;
				}
				cnt4++;
			} while (true);

			if ( state.backtracking==0 ) {System.out.println("Found new ring: " + (RING_TITLE1!=null?RING_TITLE1.getText():null) + "\n" +  input.toString(retval.start,input.LT(-1)));}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ring"



	// $ANTLR start "judge_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:9:1: judge_block : JUDGE_NAME ( timeblock )+ ;
	public final void judge_block() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:10:2: ( JUDGE_NAME ( timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:10:4: JUDGE_NAME ( timeblock )+
			{
			match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block52); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:10:15: ( timeblock )+
			int cnt5=0;
			loop5:
			do {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==TIME) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:10:15: timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block54);
					timeblock();
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



	// $ANTLR start "comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:12:1: comment : ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+ ;
	public final void comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:12:9: ( ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:12:11: ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:12:11: ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==INT) ) {
					int LA6_2 = input.LA(2);
					if ( ((LA6_2 >= COMMENT && LA6_2 <= ELLIPSIS)||LA6_2==INT||LA6_2==JUDGE_NAME||LA6_2==PHONE_NUMBER||LA6_2==RING_TITLE||LA6_2==TIME) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= COMMENT && LA6_0 <= ELLIPSIS)||LA6_0==JUDGE_NAME||LA6_0==PHONE_NUMBER||LA6_0==TIME) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= COMMENT && input.LA(1) <= ELLIPSIS)||input.LA(1)==INT||input.LA(1)==JUDGE_NAME||input.LA(1)==PHONE_NUMBER||input.LA(1)==TIME ) {
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
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return ;}
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
	// $ANTLR end "comment"



	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:14:1: timeblock : TIME ( ( breed_ring | special_ring | junior_ring )=> ( ( comment )? breed_ring | special_ring | junior_ring )+ ) ;
	public final void timeblock() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:2: ( TIME ( ( breed_ring | special_ring | junior_ring )=> ( ( comment )? breed_ring | special_ring | junior_ring )+ ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:4: TIME ( ( breed_ring | special_ring | junior_ring )=> ( ( comment )? breed_ring | special_ring | junior_ring )+ )
			{
			match(input,TIME,FOLLOW_TIME_in_timeblock87); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:9: ( ( breed_ring | special_ring | junior_ring )=> ( ( comment )? breed_ring | special_ring | junior_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:10: ( breed_ring | special_ring | junior_ring )=> ( ( comment )? breed_ring | special_ring | junior_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:49: ( ( comment )? breed_ring | special_ring | junior_ring )+
			int cnt8=0;
			loop8:
			do {
				int alt8=4;
				switch ( input.LA(1) ) {
				case JUDGE_NAME:
					{
					int LA8_2 = input.LA(2);
					if ( ((LA8_2 >= COMMENT && LA8_2 <= ELLIPSIS)||LA8_2==INT||LA8_2==JUDGE_NAME||LA8_2==PHONE_NUMBER||LA8_2==TIME) ) {
						alt8=1;
					}

					}
					break;
				case COMMENT:
				case DATE:
				case ELLIPSIS:
				case PHONE_NUMBER:
				case TIME:
					{
					alt8=1;
					}
					break;
				case INT:
					{
					switch ( input.LA(2) ) {
					case BREED_NAME:
						{
						int LA8_6 = input.LA(3);
						if ( (LA8_6==EOF||LA8_6==BREED_COUNT||(LA8_6 >= BREED_NAME_SUFFIX && LA8_6 <= ELLIPSIS)||LA8_6==INT||LA8_6==JUDGE_NAME||LA8_6==PHONE_NUMBER||LA8_6==RING_TITLE||LA8_6==TIME) ) {
							alt8=1;
						}
						else if ( (LA8_6==SPECIAL_SUFFIX) ) {
							alt8=2;
						}

						}
						break;
					case JUNIOR_CLASS:
						{
						alt8=3;
						}
						break;
					case COMMENT:
					case DATE:
					case ELLIPSIS:
					case INT:
					case JUDGE_NAME:
					case PHONE_NUMBER:
					case TIME:
						{
						alt8=1;
						}
						break;
					}
					}
					break;
				}
				switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:50: ( comment )? breed_ring
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:50: ( comment )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==INT) ) {
						int LA7_1 = input.LA(2);
						if ( ((LA7_1 >= COMMENT && LA7_1 <= ELLIPSIS)||LA7_1==INT||LA7_1==JUDGE_NAME||LA7_1==PHONE_NUMBER||LA7_1==TIME) ) {
							alt7=1;
						}
					}
					else if ( ((LA7_0 >= COMMENT && LA7_0 <= ELLIPSIS)||LA7_0==JUDGE_NAME||LA7_0==PHONE_NUMBER||LA7_0==TIME) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:50: comment
							{
							pushFollow(FOLLOW_comment_in_timeblock99);
							comment();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_breed_ring_in_timeblock102);
					breed_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:70: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_timeblock104);
					special_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:83: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_timeblock106);
					junior_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(8, input);
						throw eee;
				}
				cnt8++;
			} while (true);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:16:1: special_ring : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final void special_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:16:13: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:16:17: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			match(input,INT,FOLLOW_INT_in_special_ring117); if (state.failed) return ;
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring119); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:16:32: ( SPECIAL_SUFFIX )+
			int cnt9=0;
			loop9:
			do {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==SPECIAL_SUFFIX) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:16:32: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring121); if (state.failed) return ;
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(9, input);
						throw eee;
				}
				cnt9++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:1: junior_ring : INT JUNIOR_CLASS ;
	public final void junior_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:12: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:14: INT JUNIOR_CLASS
			{
			match(input,INT,FOLLOW_INT_in_junior_ring128); if (state.failed) return ;
			match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring130); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:1: breed_ring : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final void breed_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:2: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:4: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			match(input,INT,FOLLOW_INT_in_breed_ring138); if (state.failed) return ;
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring140); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:19: ( BREED_NAME_SUFFIX )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BREED_NAME_SUFFIX) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:19: BREED_NAME_SUFFIX
					{
					match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring142); if (state.failed) return ;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:38: ( BREED_COUNT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BREED_COUNT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:38: BREED_COUNT
					{
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring145); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:1: breed_name : BREED_NAME BREED_NAME_SUFFIX ;
	public final void breed_name() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:2: ( BREED_NAME BREED_NAME_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:4: BREED_NAME BREED_NAME_SUFFIX
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name154); if (state.failed) return ;
			match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name156); if (state.failed) return ;
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



	public static final BitSet FOLLOW_special_ring_in_test_special9 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed18 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_comment_in_start26 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ring_in_start28 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_EOF_in_start31 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring38 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_judge_block_in_ring40 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block52 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block54 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock87 = new BitSet(new long[]{0x0000004214000700L});
	public static final BitSet FOLLOW_comment_in_timeblock99 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock102 = new BitSet(new long[]{0x0000004214000702L});
	public static final BitSet FOLLOW_special_ring_in_timeblock104 = new BitSet(new long[]{0x0000004214000702L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock106 = new BitSet(new long[]{0x0000004214000702L});
	public static final BitSet FOLLOW_INT_in_special_ring117 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring119 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring121 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring128 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring138 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring140 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring142 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name154 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name156 = new BitSet(new long[]{0x0000000000000002L});
}
