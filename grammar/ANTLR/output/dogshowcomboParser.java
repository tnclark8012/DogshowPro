// $ANTLR 3.5 C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g 2013-02-20 23:20:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class dogshowcomboParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", 
		"BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", 
		"FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", 
		"FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_MONTH", 
		"FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_RING", "FRAG_SPEC_CHAR", 
		"FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", 
		"INT", "JUDGE", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", 
		"RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", 
		"WS", "'.'"
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
	public final void test_special() throws  {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:15: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:8:15: ( special_ring )+
			int cnt1=0;
			loop1:
			while (true) {
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
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
	}
	// $ANTLR end "test_special"



	// $ANTLR start "test_breed"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:9:1: test_breed : ( breed_ring )+ ;
	public final void test_breed() throws  {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:2: ( ( breed_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:4: ( breed_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:10:4: ( breed_ring )+
			int cnt2=0;
			loop2:
			while (true) {
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
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
	}
	// $ANTLR end "test_breed"



	// $ANTLR start "start"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:1: start returns [String s] : ( ring )+ EOF ;
	public final String start() throws  {
		String s = null;


		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:25: ( ( ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:27: ( ring )+ EOF
			{
			s = "show";
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:42: ( ring )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==RING_TITLE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:11:43: ring
					{
					pushFollow(FOLLOW_ring_in_start39);
					ring();
					state._fsp--;

					s+="r";
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match(input,EOF,FOLLOW_EOF_in_start45); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "start"



	// $ANTLR start "ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:1: ring : RING_TITLE ( judge_block )+ ;
	public final void ring() throws  {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:6: ( RING_TITLE ( judge_block )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:8: RING_TITLE ( judge_block )+
			{
			match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring52); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:19: ( judge_block )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==JUDGE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:12:19: judge_block
					{
					pushFollow(FOLLOW_judge_block_in_ring54);
					judge_block();
					state._fsp--;

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
	}
	// $ANTLR end "ring"



	// $ANTLR start "judge_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:14:1: judge_block : JUDGE ( timeblock )+ ;
	public final void judge_block() throws  {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:2: ( JUDGE ( timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:4: JUDGE ( timeblock )+
			{
			match(input,JUDGE,FOLLOW_JUDGE_in_judge_block64); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:10: ( timeblock )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==TIME) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:15:10: timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block66);
					timeblock();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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
	}
	// $ANTLR end "judge_block"



	// $ANTLR start "comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:1: comment : ( STANDALONE_COMMENT | ( ( COMMENT | INT )+ '.' ) );
	public final void comment() throws  {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:9: ( STANDALONE_COMMENT | ( ( COMMENT | INT )+ '.' ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==STANDALONE_COMMENT) ) {
				alt7=1;
			}
			else if ( (LA7_0==COMMENT||LA7_0==INT) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:11: STANDALONE_COMMENT
					{
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_comment75); 
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:30: ( ( COMMENT | INT )+ '.' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:30: ( ( COMMENT | INT )+ '.' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:32: ( COMMENT | INT )+ '.'
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:17:32: ( COMMENT | INT )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==COMMENT||LA6_0==INT) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:
							{
							if ( input.LA(1)==COMMENT||input.LA(1)==INT ) {
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
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					match(input,37,FOLLOW_37_in_comment86); 
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
	}
	// $ANTLR end "comment"



	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:19:1: timeblock : TIME ( breed_ring | special_ring | junior_ring | comment )+ ;
	public final void timeblock() throws  {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:2: ( TIME ( breed_ring | special_ring | junior_ring | comment )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:4: TIME ( breed_ring | special_ring | junior_ring | comment )+
			{
			match(input,TIME,FOLLOW_TIME_in_timeblock96); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:9: ( breed_ring | special_ring | junior_ring | comment )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=5;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==INT) ) {
					switch ( input.LA(2) ) {
					case BREED_NAME:
						{
						int LA8_4 = input.LA(3);
						if ( (LA8_4==EOF||LA8_4==BREED_COUNT||(LA8_4 >= BREED_NAME_SUFFIX && LA8_4 <= COMMENT)||(LA8_4 >= INT && LA8_4 <= JUDGE)||LA8_4==RING_TITLE||(LA8_4 >= STANDALONE_COMMENT && LA8_4 <= TIME)) ) {
							alt8=1;
						}
						else if ( (LA8_4==SPECIAL_SUFFIX) ) {
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
					case INT:
					case 37:
						{
						alt8=4;
						}
						break;
					}
				}
				else if ( (LA8_0==COMMENT||LA8_0==STANDALONE_COMMENT) ) {
					alt8=4;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:10: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_timeblock99);
					breed_ring();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:21: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_timeblock101);
					special_ring();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:34: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_timeblock103);
					junior_ring();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:20:46: comment
					{
					pushFollow(FOLLOW_comment_in_timeblock105);
					comment();
					state._fsp--;

					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
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
	}
	// $ANTLR end "timeblock"



	// $ANTLR start "special_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:1: special_ring : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final void special_ring() throws  {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:13: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:17: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			match(input,INT,FOLLOW_INT_in_special_ring115); 
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring117); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:32: ( SPECIAL_SUFFIX )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==SPECIAL_SUFFIX) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:21:32: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring119); 
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
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
	}
	// $ANTLR end "special_ring"



	// $ANTLR start "junior_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:22:1: junior_ring : INT JUNIOR_CLASS ;
	public final void junior_ring() throws  {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:22:12: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:22:14: INT JUNIOR_CLASS
			{
			match(input,INT,FOLLOW_INT_in_junior_ring126); 
			match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring128); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "junior_ring"



	// $ANTLR start "breed_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:23:1: breed_ring : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final void breed_ring() throws  {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:2: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:4: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			match(input,INT,FOLLOW_INT_in_breed_ring136); 
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring138); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:19: ( BREED_NAME_SUFFIX )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BREED_NAME_SUFFIX) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:19: BREED_NAME_SUFFIX
					{
					match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring140); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:38: ( BREED_COUNT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BREED_COUNT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:24:38: BREED_COUNT
					{
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring143); 
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
	}
	// $ANTLR end "breed_ring"



	// $ANTLR start "breed_name"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:25:1: breed_name : BREED_NAME BREED_NAME_SUFFIX ;
	public final void breed_name() throws  {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:26:2: ( BREED_NAME BREED_NAME_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:26:4: BREED_NAME BREED_NAME_SUFFIX
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name152); 
			match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name154); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "breed_name"

	// Delegated rules



	public static final BitSet FOLLOW_special_ring_in_test_special16 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed25 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ring_in_start39 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_EOF_in_start45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring52 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_judge_block_in_ring54 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_JUDGE_in_judge_block64 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block66 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_comment75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_comment86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock96 = new BitSet(new long[]{0x0000000204000100L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock99 = new BitSet(new long[]{0x0000000204000102L});
	public static final BitSet FOLLOW_special_ring_in_timeblock101 = new BitSet(new long[]{0x0000000204000102L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock103 = new BitSet(new long[]{0x0000000204000102L});
	public static final BitSet FOLLOW_comment_in_timeblock105 = new BitSet(new long[]{0x0000000204000102L});
	public static final BitSet FOLLOW_INT_in_special_ring115 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring117 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring119 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring126 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring136 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring138 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring140 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name152 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name154 = new BitSet(new long[]{0x0000000000000002L});
}
