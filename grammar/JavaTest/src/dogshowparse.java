// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g 2013-02-22 18:30:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class dogshowparse extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_MONTH", "FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "INT", "JUDGE", "JUDGE_ADDRESS", "JUDGE_NAME", "JUNIOR_CLASS", "NAME_PARENTHETICAL", "PARENTHETICAL", "PARENTHETICAL_INT", "PHONE_NUMBER", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
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
	public static final int FRAG_SPEC_CHAR=20;
	public static final int FRAG_SPEC_WORD_CHAR=21;
	public static final int FRAG_TIME_LABEL=22;
	public static final int FRAG_TITLE=23;
	public static final int FRAG_WEEK_DAY=24;
	public static final int INT=25;
	public static final int JUDGE=26;
	public static final int JUDGE_ADDRESS=27;
	public static final int JUDGE_NAME=28;
	public static final int JUNIOR_CLASS=29;
	public static final int NAME_PARENTHETICAL=30;
	public static final int PARENTHETICAL=31;
	public static final int PARENTHETICAL_INT=32;
	public static final int PHONE_NUMBER=33;
	public static final int RING_TITLE=34;
	public static final int SPECIAL_SUFFIX=35;
	public static final int STANDALONE_COMMENT=36;
	public static final int TIME=37;
	public static final int WORD=38;
	public static final int WS=39;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public dogshowparse(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public dogshowparse(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return dogshowparse.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g"; }


	String show = "";
	@Override
		public void reportError(RecognitionException e){
			System.err.println( "Syntax: " + e.token.getLine() + ", " + e.token.getText() );
		}
		


	// $ANTLR start "test_special"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:11:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:11:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:11:15: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:11:15: ( special_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:11:15: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_test_special24);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:12:1: test_breed : ( breed_ring )+ ;
	public final void test_breed() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:13:2: ( ( breed_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:13:4: ( breed_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:13:4: ( breed_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:13:4: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_test_breed33);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:14:1: start : comment ring EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:14:7: ( comment ring EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:14:9: comment ring EOF
			{
			pushFollow(FOLLOW_comment_in_start41);
			comment();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_ring_in_start43);
			ring();
			state._fsp--;
			if (state.failed) return ;
			match(input,EOF,FOLLOW_EOF_in_start45); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:15:1: ring : RING_TITLE ( judge_block )+ ;
	public final void ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:15:6: ( RING_TITLE ( judge_block )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:15:8: RING_TITLE ( judge_block )+
			{
			match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring52); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:15:19: ( judge_block )+
			int cnt3=0;
			loop3:
			do {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==JUDGE_NAME) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:15:19: judge_block
					{
					pushFollow(FOLLOW_judge_block_in_ring54);
					judge_block();
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:17:1: judge_block : JUDGE_NAME ( timeblock )+ ;
	public final void judge_block() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:18:2: ( JUDGE_NAME ( timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:18:4: JUDGE_NAME ( timeblock )+
			{
			match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block64); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:18:15: ( timeblock )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==TIME) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:18:15: timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block66);
					timeblock();
					state._fsp--;
					if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:20:1: comment : ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+ ;
	public final void comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:20:9: ( ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:20:11: ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:20:11: ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+
			int cnt5=0;
			loop5:
			do {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==INT) ) {
					int LA5_2 = input.LA(2);
					if ( ((LA5_2 >= COMMENT && LA5_2 <= ELLIPSIS)||LA5_2==INT||LA5_2==JUDGE_NAME||(LA5_2 >= PHONE_NUMBER && LA5_2 <= RING_TITLE)||LA5_2==TIME) ) {
						alt5=1;
					}

				}
				else if ( ((LA5_0 >= COMMENT && LA5_0 <= ELLIPSIS)||LA5_0==JUDGE_NAME||LA5_0==PHONE_NUMBER||LA5_0==TIME) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:
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
	// $ANTLR end "comment"



	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:22:1: timeblock : TIME ( ( breed_ring | special_ring | junior_ring )=> ( ( comment )? breed_ring | special_ring | junior_ring ) )+ ;
	public final void timeblock() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:2: ( TIME ( ( breed_ring | special_ring | junior_ring )=> ( ( comment )? breed_ring | special_ring | junior_ring ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:4: TIME ( ( breed_ring | special_ring | junior_ring )=> ( ( comment )? breed_ring | special_ring | junior_ring ) )+
			{
			match(input,TIME,FOLLOW_TIME_in_timeblock99); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:9: ( ( breed_ring | special_ring | junior_ring )=> ( ( comment )? breed_ring | special_ring | junior_ring ) )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==JUDGE_NAME) ) {
					int LA8_2 = input.LA(2);
					if ( (LA8_2==TIME) ) {
						int LA8_6 = input.LA(3);
						if ( (synpred1_dogshowparse()) ) {
							alt8=1;
						}

					}
					else if ( (LA8_2==INT) && (synpred1_dogshowparse())) {
						alt8=1;
					}
					else if ( ((LA8_2 >= COMMENT && LA8_2 <= ELLIPSIS)||LA8_2==JUDGE_NAME||LA8_2==PHONE_NUMBER) && (synpred1_dogshowparse())) {
						alt8=1;
					}

				}
				else if ( (LA8_0==TIME) ) {
					int LA8_3 = input.LA(2);
					if ( (synpred1_dogshowparse()) ) {
						alt8=1;
					}

				}
				else if ( (LA8_0==INT) && (synpred1_dogshowparse())) {
					alt8=1;
				}
				else if ( ((LA8_0 >= COMMENT && LA8_0 <= ELLIPSIS)||LA8_0==PHONE_NUMBER) && (synpred1_dogshowparse())) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:10: ( breed_ring | special_ring | junior_ring )=> ( ( comment )? breed_ring | special_ring | junior_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:49: ( ( comment )? breed_ring | special_ring | junior_ring )
					int alt7=3;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==INT) ) {
						switch ( input.LA(2) ) {
						case BREED_NAME:
							{
							int LA7_3 = input.LA(3);
							if ( (LA7_3==EOF||LA7_3==BREED_COUNT||(LA7_3 >= BREED_NAME_SUFFIX && LA7_3 <= ELLIPSIS)||LA7_3==INT||LA7_3==JUDGE_NAME||LA7_3==PHONE_NUMBER||LA7_3==TIME) ) {
								alt7=1;
							}
							else if ( (LA7_3==SPECIAL_SUFFIX) ) {
								alt7=2;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 7, 3, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case JUNIOR_CLASS:
							{
							alt7=3;
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
							alt7=1;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 7, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( ((LA7_0 >= COMMENT && LA7_0 <= ELLIPSIS)||LA7_0==JUDGE_NAME||LA7_0==PHONE_NUMBER||LA7_0==TIME) ) {
						alt7=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:50: ( comment )? breed_ring
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:50: ( comment )?
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==INT) ) {
								int LA6_1 = input.LA(2);
								if ( ((LA6_1 >= COMMENT && LA6_1 <= ELLIPSIS)||LA6_1==INT||LA6_1==JUDGE_NAME||LA6_1==PHONE_NUMBER||LA6_1==TIME) ) {
									alt6=1;
								}
							}
							else if ( ((LA6_0 >= COMMENT && LA6_0 <= ELLIPSIS)||LA6_0==JUDGE_NAME||LA6_0==PHONE_NUMBER||LA6_0==TIME) ) {
								alt6=1;
							}
							switch (alt6) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:50: comment
									{
									pushFollow(FOLLOW_comment_in_timeblock111);
									comment();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

							}

							pushFollow(FOLLOW_breed_ring_in_timeblock114);
							breed_ring();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:70: special_ring
							{
							pushFollow(FOLLOW_special_ring_in_timeblock116);
							special_ring();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:83: junior_ring
							{
							pushFollow(FOLLOW_junior_ring_in_timeblock118);
							junior_ring();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:24:1: special_ring : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final void special_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:24:13: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:24:17: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			match(input,INT,FOLLOW_INT_in_special_ring129); if (state.failed) return ;
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring131); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:24:32: ( SPECIAL_SUFFIX )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:24:32: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring133); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:25:1: junior_ring : INT JUNIOR_CLASS ;
	public final void junior_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:25:12: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:25:14: INT JUNIOR_CLASS
			{
			match(input,INT,FOLLOW_INT_in_junior_ring140); if (state.failed) return ;
			match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring142); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:26:1: breed_ring : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final void breed_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:27:2: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:27:4: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			match(input,INT,FOLLOW_INT_in_breed_ring150); if (state.failed) return ;
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring152); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:27:19: ( BREED_NAME_SUFFIX )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BREED_NAME_SUFFIX) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:27:19: BREED_NAME_SUFFIX
					{
					match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring154); if (state.failed) return ;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:27:38: ( BREED_COUNT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BREED_COUNT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:27:38: BREED_COUNT
					{
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring157); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:28:1: breed_name : BREED_NAME BREED_NAME_SUFFIX ;
	public final void breed_name() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:29:2: ( BREED_NAME BREED_NAME_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:29:4: BREED_NAME BREED_NAME_SUFFIX
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name166); if (state.failed) return ;
			match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name168); if (state.failed) return ;
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

	// $ANTLR start synpred1_dogshowparse
	public final void synpred1_dogshowparse_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:10: ( breed_ring | special_ring | junior_ring )
		int alt12=3;
		int LA12_0 = input.LA(1);
		if ( (LA12_0==INT) ) {
			int LA12_1 = input.LA(2);
			if ( (LA12_1==BREED_NAME) ) {
				int LA12_2 = input.LA(3);
				if ( (LA12_2==EOF||LA12_2==BREED_COUNT||LA12_2==BREED_NAME_SUFFIX) ) {
					alt12=1;
				}
				else if ( (LA12_2==SPECIAL_SUFFIX) ) {
					alt12=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
							input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA12_1==JUNIOR_CLASS) ) {
				alt12=3;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 12, 1, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}
		}
		else {
			if (state.backtracking>0) {state.failed=true; return ;}
			NoViableAltException nvae =
				new NoViableAltException("", 12, 0, input);
			throw nvae;
		}
		switch (alt12) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:11: breed_ring
				{
				pushFollow(FOLLOW_breed_ring_in_synpred1_dogshowparse103);
				breed_ring();
				state._fsp--;
				if (state.failed) return ;
				}
				break;
			case 2 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:22: special_ring
				{
				pushFollow(FOLLOW_special_ring_in_synpred1_dogshowparse105);
				special_ring();
				state._fsp--;
				if (state.failed) return ;
				}
				break;
			case 3 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowparse.g:23:35: junior_ring
				{
				pushFollow(FOLLOW_junior_ring_in_synpred1_dogshowparse107);
				junior_ring();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

		}
	}
	// $ANTLR end synpred1_dogshowparse

	// Delegated rules

	public final boolean synpred1_dogshowparse() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_dogshowparse_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_special_ring_in_test_special24 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed33 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_comment_in_start41 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ring_in_start43 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_start45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring52 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_judge_block_in_ring54 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block64 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block66 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock99 = new BitSet(new long[]{0x0000002212000700L});
	public static final BitSet FOLLOW_comment_in_timeblock111 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock114 = new BitSet(new long[]{0x0000002212000702L});
	public static final BitSet FOLLOW_special_ring_in_timeblock116 = new BitSet(new long[]{0x0000002212000702L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock118 = new BitSet(new long[]{0x0000002212000702L});
	public static final BitSet FOLLOW_INT_in_special_ring129 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring131 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring133 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring140 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring150 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring152 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring154 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name166 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred1_dogshowparse103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_synpred1_dogshowparse105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_synpred1_dogshowparse107 = new BitSet(new long[]{0x0000000000000002L});
}
