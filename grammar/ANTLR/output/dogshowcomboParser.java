// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g 2013-02-10 03:05:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class dogshowcomboParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_RING", "DATE", "ELLIPSIS", "END_PUNCTUATION", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_PLURAL", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SUFFIX", "FRAG_JUNIOR_CLASS", "FRAG_MONTH", "FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_RING", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "INT", "JUDGE", "JUNIOR_RING", "PARENTHETICAL", "PARENTHETICAL_INT", "RING_TITLE", "TIME", "WORD", "WS"
	};

	public static final int EOF=-1;
	public static final int ATOM=4;
	public static final int BREED_COUNT=5;
	public static final int BREED_RING=6;
	public static final int DATE=7;
	public static final int ELLIPSIS=8;
	public static final int END_PUNCTUATION=9;
	public static final int FRAG_BREED_NAME_ALT=10;
	public static final int FRAG_BREED_NAME_PLURAL=11;
	public static final int FRAG_BREED_NAME_SINGLE=12;
	public static final int FRAG_BREED_NAME_SUFFIX=13;
	public static final int FRAG_JUNIOR_CLASS=14;
	public static final int FRAG_MONTH=15;
	public static final int FRAG_PAREN_LEFT=16;
	public static final int FRAG_PAREN_RIGHT=17;
	public static final int FRAG_RING=18;
	public static final int FRAG_SPEC_CHAR=19;
	public static final int FRAG_SPEC_WORD_CHAR=20;
	public static final int FRAG_TIME_LABEL=21;
	public static final int FRAG_TITLE=22;
	public static final int FRAG_WEEK_DAY=23;
	public static final int INT=24;
	public static final int JUDGE=25;
	public static final int JUNIOR_RING=26;
	public static final int PARENTHETICAL=27;
	public static final int PARENTHETICAL_INT=28;
	public static final int RING_TITLE=29;
	public static final int TIME=30;
	public static final int WORD=31;
	public static final int WS=32;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public dogshowcomboParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public dogshowcomboParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return dogshowcomboParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g"; }



	// $ANTLR start "start"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:3:1: start : ( ring )+ EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:3:7: ( ( ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:3:9: ( ring )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:3:9: ( ring )+
			int cnt1=0;
			loop1:
			do {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==RING_TITLE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:3:9: ring
					{
					pushFollow(FOLLOW_ring_in_start10);
					ring();
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

			match(input,EOF,FOLLOW_EOF_in_start13); 
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:4:1: ring : RING_TITLE ( judge_block )+ ;
	public final void ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:4:6: ( RING_TITLE ( judge_block )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:4:8: RING_TITLE ( judge_block )+
			{
			match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring20); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:4:19: ( judge_block )+
			int cnt2=0;
			loop2:
			do {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==JUDGE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:4:19: judge_block
					{
					pushFollow(FOLLOW_judge_block_in_ring22);
					judge_block();
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:6:1: judge_block : JUDGE ( timeblock )+ ;
	public final void judge_block() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:7:2: ( JUDGE ( timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:7:4: JUDGE ( timeblock )+
			{
			match(input,JUDGE,FOLLOW_JUDGE_in_judge_block32); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:7:10: ( timeblock )+
			int cnt3=0;
			loop3:
			do {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==TIME) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:7:10: timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block34);
					timeblock();
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



	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:1: timeblock : TIME ( BREED_RING | JUNIOR_RING )+ ;
	public final void timeblock() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:9:2: ( TIME ( BREED_RING | JUNIOR_RING )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:9:4: TIME ( BREED_RING | JUNIOR_RING )+
			{
			match(input,TIME,FOLLOW_TIME_in_timeblock43); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:9:9: ( BREED_RING | JUNIOR_RING )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==BREED_RING||LA4_0==JUNIOR_RING) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:
					{
					if ( input.LA(1)==BREED_RING||input.LA(1)==JUNIOR_RING ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
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
	// $ANTLR end "timeblock"



	// $ANTLR start "junior_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:1: junior_ring : ( JUNIOR_RING )+ EOF ;
	public final void junior_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:2: ( ( JUNIOR_RING )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:4: ( JUNIOR_RING )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:4: ( JUNIOR_RING )+
			int cnt5=0;
			loop5:
			do {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==JUNIOR_RING) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:4: JUNIOR_RING
					{
					match(input,JUNIOR_RING,FOLLOW_JUNIOR_RING_in_junior_ring58); 
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

			match(input,EOF,FOLLOW_EOF_in_junior_ring61); 
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

	// Delegated rules



	public static final BitSet FOLLOW_ring_in_start10 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_EOF_in_start13 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring20 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_judge_block_in_ring22 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_JUDGE_in_judge_block32 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block34 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock43 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_JUNIOR_RING_in_junior_ring58 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_EOF_in_junior_ring61 = new BitSet(new long[]{0x0000000000000002L});
}
