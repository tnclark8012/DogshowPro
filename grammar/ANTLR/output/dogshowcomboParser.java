// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g 2013-02-11 21:15:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class dogshowcomboParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_MONTH", "FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_RING", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "INT", "JUDGE", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS", "'.'"
	};

	public static final int EOF=-1;
	public static final int T__37=37;
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
	public static final int FRAG_RING=20;
	public static final int FRAG_SPEC_CHAR=21;
	public static final int FRAG_SPEC_WORD_CHAR=22;
	public static final int FRAG_TIME_LABEL=23;
	public static final int FRAG_TITLE=24;
	public static final int FRAG_WEEK_DAY=25;
	public static final int INT=26;
	public static final int JUDGE=27;
	public static final int JUNIOR_CLASS=28;
	public static final int PARENTHETICAL=29;
	public static final int PARENTHETICAL_INT=30;
	public static final int RING_TITLE=31;
	public static final int SPECIAL_SUFFIX=32;
	public static final int STANDALONE_COMMENT=33;
	public static final int TIME=34;
	public static final int WORD=35;
	public static final int WS=36;

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


	  private boolean ahead(String text) {
	  	System.out.println("Does " + input.toString() + " contain " + text + "?");
		return input.toString().contains(text);
	  }



	// $ANTLR start "test_special"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:15: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:15: ( special_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:15: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_test_special16);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:9:1: test_breed : ( breed_ring )+ ;
	public final void test_breed() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:2: ( ( breed_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:4: ( breed_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:4: ( breed_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:4: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_test_breed25);
					breed_ring();
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
	// $ANTLR end "test_breed"



	// $ANTLR start "start"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:1: start : ( ring )+ EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:7: ( ( ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:9: ( ring )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:9: ( ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:9: ring
					{
					pushFollow(FOLLOW_ring_in_start33);
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

			match(input,EOF,FOLLOW_EOF_in_start36); 
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:1: ring : RING_TITLE ( judge_block )+ ;
	public final void ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:6: ( RING_TITLE ( judge_block )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:8: RING_TITLE ( judge_block )+
			{
			match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring43); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:19: ( judge_block )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==JUDGE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:19: judge_block
					{
					pushFollow(FOLLOW_judge_block_in_ring45);
					judge_block();
					state._fsp--;

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
	// $ANTLR end "ring"



	// $ANTLR start "judge_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:14:1: judge_block : JUDGE ( timeblock )+ ;
	public final void judge_block() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:2: ( JUDGE ( timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:4: JUDGE ( timeblock )+
			{
			match(input,JUDGE,FOLLOW_JUDGE_in_judge_block55); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:10: ( timeblock )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:10: timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block57);
					timeblock();
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
	// $ANTLR end "judge_block"



	// $ANTLR start "comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:1: comment : INT BREED_NAME '.' ;
	public final void comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:9: ( INT BREED_NAME '.' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:11: INT BREED_NAME '.'
			{
			match(input,INT,FOLLOW_INT_in_comment66); 
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_comment68); 
			match(input,37,FOLLOW_37_in_comment70); 
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:19:1: timeblock : TIME ( breed_ring | special_ring | junior_ring | comment )+ ;
	public final void timeblock() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:2: ( TIME ( breed_ring | special_ring | junior_ring | comment )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:4: TIME ( breed_ring | special_ring | junior_ring | comment )+
			{
			match(input,TIME,FOLLOW_TIME_in_timeblock79); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:9: ( breed_ring | special_ring | junior_ring | comment )+
			int cnt6=0;
			loop6:
			do {
				int alt6=5;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==INT) ) {
					int LA6_2 = input.LA(2);
					if ( (LA6_2==BREED_NAME) ) {
						switch ( input.LA(3) ) {
						case 37:
							{
							alt6=4;
							}
							break;
						case EOF:
						case BREED_COUNT:
						case BREED_NAME_SUFFIX:
						case INT:
						case JUDGE:
						case RING_TITLE:
						case TIME:
							{
							alt6=1;
							}
							break;
						case SPECIAL_SUFFIX:
							{
							alt6=2;
							}
							break;
						}
					}
					else if ( (LA6_2==JUNIOR_CLASS) ) {
						alt6=3;
					}

				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:10: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_timeblock82);
					breed_ring();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:21: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_timeblock84);
					special_ring();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:34: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_timeblock86);
					junior_ring();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:46: comment
					{
					pushFollow(FOLLOW_comment_in_timeblock88);
					comment();
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
	// $ANTLR end "timeblock"



	// $ANTLR start "special_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:1: special_ring : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final void special_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:13: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:17: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			match(input,INT,FOLLOW_INT_in_special_ring98); 
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring100); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:32: ( SPECIAL_SUFFIX )+
			int cnt7=0;
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==SPECIAL_SUFFIX) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:32: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring102); 
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
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
	// $ANTLR end "special_ring"



	// $ANTLR start "junior_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:22:1: junior_ring : INT JUNIOR_CLASS ;
	public final void junior_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:22:12: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:22:14: INT JUNIOR_CLASS
			{
			match(input,INT,FOLLOW_INT_in_junior_ring109); 
			match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring111); 
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:23:1: breed_ring : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final void breed_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:2: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:4: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			match(input,INT,FOLLOW_INT_in_breed_ring119); 
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring121); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:19: ( BREED_NAME_SUFFIX )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BREED_NAME_SUFFIX) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:19: BREED_NAME_SUFFIX
					{
					match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring123); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:38: ( BREED_COUNT )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==BREED_COUNT) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:38: BREED_COUNT
					{
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring126); 
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:25:1: breed_name : BREED_NAME BREED_NAME_SUFFIX ;
	public final void breed_name() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:26:2: ( BREED_NAME BREED_NAME_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:26:4: BREED_NAME BREED_NAME_SUFFIX
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name135); 
			match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name137); 
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



	public static final BitSet FOLLOW_special_ring_in_test_special16 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed25 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ring_in_start33 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_EOF_in_start36 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring43 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_judge_block_in_ring45 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_JUDGE_in_judge_block55 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block57 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_INT_in_comment66 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_comment68 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_comment70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock79 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock82 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_special_ring_in_timeblock84 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock86 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_comment_in_timeblock88 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_INT_in_special_ring98 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring100 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring102 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring109 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring119 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring121 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring123 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name135 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name137 = new BitSet(new long[]{0x0000000000000002L});
}
