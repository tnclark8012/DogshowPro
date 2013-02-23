<<<<<<< HEAD
// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-02-23 13:12:47

package dev.tclark.dogshow.grammar;
=======
// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-02-23 00:39:08

package dev.tclark.dogshow.grammar;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class testParser extends Parser {
	public static final String[] tokenNames = new String[] {
<<<<<<< HEAD
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_MONTH", "FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_PROPER_NAME", "FRAG_RING", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "PROPER_NAME", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
=======
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "BREED_COUNT", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_MONTH", "FRAG_PAREN_LEFT", "FRAG_PAREN_RIGHT", "FRAG_PROPER_NAME", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_WEEK_DAY", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "PROPER_NAME", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
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
<<<<<<< HEAD
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
=======
	public static final int FRAG_SPEC_CHAR=21;
	public static final int FRAG_SPEC_WORD_CHAR=22;
	public static final int FRAG_TIME_LABEL=23;
	public static final int FRAG_TITLE=24;
	public static final int FRAG_WEEK_DAY=25;
	public static final int INT=26;
	public static final int JUDGE_NAME=27;
	public static final int JUNIOR_CLASS=28;
	public static final int PARENTHETICAL=29;
	public static final int PARENTHETICAL_INT=30;
	public static final int PARENTHETICAL_NAME=31;
	public static final int PHONE_NUMBER=32;
	public static final int PROPER_NAME=33;
	public static final int RING_TITLE=34;
	public static final int SPECIAL_SUFFIX=35;
	public static final int STANDALONE_COMMENT=36;
	public static final int TIME=37;
	public static final int WORD=38;
	public static final int WS=39;
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb

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


<<<<<<< HEAD
	  private boolean ahead(String text) {
	  	System.out.println("Does " + input.toString() + " contain " + text + "?");
		return input.toString().contains(text);
	  }
=======
	JsonObject ring;
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb



	// $ANTLR start "test_special"
<<<<<<< HEAD
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:15: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:15: ( special_ring )+
=======
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:11:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:11:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:11:15: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:11:15: ( special_ring )+
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
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
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:15:15: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_test_special30);
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:11:15: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_test_special26);
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
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
<<<<<<< HEAD
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:16:1: test_breed : breed_ring ;
	public final void test_breed() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:2: ( breed_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:4: breed_ring
			{
			pushFollow(FOLLOW_breed_ring_in_test_breed39);
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:7: ( ( big_comment )+ ( ring )+ ( big_comment )* EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:9: ( big_comment )+ ( ring )+ ( big_comment )* EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:9: ( big_comment )+
=======
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:12:1: test_breed : ( breed_ring )+ ;
	public final void test_breed() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:13:2: ( ( breed_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:13:4: ( breed_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:13:4: ( breed_ring )+
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
			int cnt2=0;
			loop2:
			do {
				int alt2=2;
				int LA2_0 = input.LA(1);
<<<<<<< HEAD
				if ( (LA2_0==BREED_NAME||(LA2_0 >= COMMENT && LA2_0 <= ELLIPSIS)||(LA2_0 >= INT && LA2_0 <= JUDGE_NAME)||LA2_0==PHONE_NUMBER||LA2_0==TIME) ) {
=======
				if ( (LA2_0==INT) ) {
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
					alt2=1;
				}

				switch (alt2) {
				case 1 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:9: big_comment
					{
					pushFollow(FOLLOW_big_comment_in_start46);
					big_comment();
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:13:4: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_test_breed35);
					breed_ring();
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
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

<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:22: ( ring )+
=======
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:14:1: start returns [JsonObject json] : comment (myRing= ring )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		JsonObject myRing =null;

		json = new JsonObject(); JsonArray array = new JsonArray(); System.out.println("starting...");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:2: ( comment (myRing= ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:4: comment (myRing= ring )+ EOF
			{
			pushFollow(FOLLOW_comment_in_start54);
			comment();
			state._fsp--;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:12: (myRing= ring )+
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
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
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:22: ring
					{
					pushFollow(FOLLOW_ring_in_start49);
					ring();
					state._fsp--;

=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:17:13: myRing= ring
					{
					pushFollow(FOLLOW_ring_in_start59);
					myRing=ring();
					state._fsp--;

					array.add(myRing);
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
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

<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:28: ( big_comment )*
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==BREED_NAME||(LA4_0 >= COMMENT && LA4_0 <= ELLIPSIS)||(LA4_0 >= INT && LA4_0 <= JUDGE_NAME)||LA4_0==PHONE_NUMBER||LA4_0==TIME) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:28: big_comment
					{
					pushFollow(FOLLOW_big_comment_in_start52);
					big_comment();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			} while (true);

			match(input,EOF,FOLLOW_EOF_in_start55); 
=======
			json.add("Rings", array);
			match(input,EOF,FOLLOW_EOF_in_start65); 
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
<<<<<<< HEAD
		return ;
=======
		return json;
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
	}
	// $ANTLR end "start"



	// $ANTLR start "ring"
<<<<<<< HEAD
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:1: ring : RING_TITLE ( judge_block )+ ;
	public final void ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:6: ( RING_TITLE ( judge_block )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:8: RING_TITLE ( judge_block )+
			{
			match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring62); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:19: ( judge_block )+
			int cnt5=0;
			loop5:
			do {
				int alt5=2;
				alt5 = dfa5.predict(input);
				switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:19:19: judge_block
					{
					pushFollow(FOLLOW_judge_block_in_ring64);
					judge_block();
					state._fsp--;

=======
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:18:1: ring returns [JsonObject json] : RING_TITLE (judgeBlock= judge_block )+ ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		Token RING_TITLE1=null;
		JsonObject judgeBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray(); System.out.println("Starting ring...");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:2: ( RING_TITLE (judgeBlock= judge_block )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:4: RING_TITLE (judgeBlock= judge_block )+
			{
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring82); 
			json.addProperty("RingTitle", (RING_TITLE1!=null?RING_TITLE1.getText():null));
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:65: (judgeBlock= judge_block )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:66: judgeBlock= judge_block
					{
					pushFollow(FOLLOW_judge_block_in_ring88);
					judgeBlock=judge_block();
					state._fsp--;

					array.add(judgeBlock);
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
					}
					break;

				default :
<<<<<<< HEAD
					if ( cnt5 >= 1 ) break loop5;
						EarlyExitException eee =
							new EarlyExitException(5, input);
						throw eee;
				}
				cnt5++;
			} while (true);

=======
					if ( cnt4 >= 1 ) break loop4;
						EarlyExitException eee =
							new EarlyExitException(4, input);
						throw eee;
				}
				cnt4++;
			} while (true);

			System.out.println("Found new ring: " + (RING_TITLE1!=null?RING_TITLE1.getText():null)); json.add("JudgeBlocks", array);
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
<<<<<<< HEAD
		return ;
=======
		return json;
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
	}
	// $ANTLR end "ring"



<<<<<<< HEAD
	// $ANTLR start "judge_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:1: judge_block : JUDGE_NAME ( timeblock )+ ;
	public final void judge_block() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:2: ( JUDGE_NAME ( timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:4: JUDGE_NAME ( timeblock )+
			{
			match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block74); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:15: ( timeblock )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				alt6 = dfa6.predict(input);
				switch (alt6) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:15: timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block76);
					timeblock();
=======
	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:23:1: timeblock returns [JsonObject json] : TIME ( ( comment )? (breedRing= breed_ring |specialRing= special_ring |juniorRing= junior_ring )+ ) ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token TIME2=null;
		JsonObject breedRing =null;
		JsonObject specialRing =null;
		JsonObject juniorRing =null;

		json = new JsonObject(); JsonArray array = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:2: ( TIME ( ( comment )? (breedRing= breed_ring |specialRing= special_ring |juniorRing= junior_ring )+ ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:4: TIME ( ( comment )? (breedRing= breed_ring |specialRing= special_ring |juniorRing= junior_ring )+ )
			{
			TIME2=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock112); 
			json.addProperty("time", (TIME2!=null?TIME2.getText():null));
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:48: ( ( comment )? (breedRing= breed_ring |specialRing= special_ring |juniorRing= junior_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:50: ( comment )? (breedRing= breed_ring |specialRing= special_ring |juniorRing= junior_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:50: ( comment )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==INT) ) {
				int LA5_1 = input.LA(2);
				if ( ((LA5_1 >= COMMENT && LA5_1 <= ELLIPSIS)||(LA5_1 >= INT && LA5_1 <= JUDGE_NAME)||LA5_1==PHONE_NUMBER||LA5_1==TIME) ) {
					alt5=1;
				}
			}
			else if ( ((LA5_0 >= COMMENT && LA5_0 <= ELLIPSIS)||LA5_0==JUDGE_NAME||LA5_0==PHONE_NUMBER||LA5_0==TIME) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:50: comment
					{
					pushFollow(FOLLOW_comment_in_timeblock117);
					comment();
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
					state._fsp--;

					}
					break;

<<<<<<< HEAD
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:2: ( ( comment | TIME | BREED_NAME ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:4: ( comment | TIME | BREED_NAME )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:4: ( comment | TIME | BREED_NAME )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:5: comment
					{
					pushFollow(FOLLOW_comment_in_big_comment86);
					comment();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:13: TIME
					{
					match(input,TIME,FOLLOW_TIME_in_big_comment88); 
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:18: BREED_NAME
					{
					match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment90); 
					}
					break;

			}

=======
			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:59: (breedRing= breed_ring |specialRing= special_ring |juniorRing= junior_ring )+
			int cnt6=0;
			loop6:
			do {
				int alt6=4;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==INT) ) {
					int LA6_2 = input.LA(2);
					if ( (LA6_2==BREED_NAME) ) {
						int LA6_3 = input.LA(3);
						if ( (LA6_3==EOF||LA6_3==BREED_COUNT||LA6_3==BREED_NAME_SUFFIX||(LA6_3 >= INT && LA6_3 <= JUDGE_NAME)||LA6_3==RING_TITLE||LA6_3==TIME) ) {
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

				switch (alt6) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:60: breedRing= breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_timeblock123);
					breedRing=breed_ring();
					state._fsp--;

					array.add(breedRing);
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:110: specialRing= special_ring
					{
					pushFollow(FOLLOW_special_ring_in_timeblock128);
					specialRing=special_ring();
					state._fsp--;

					array.add(specialRing);
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:166: juniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_timeblock133);
					juniorRing=junior_ring();
					state._fsp--;

					array.add(juniorRing);
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

			json.add("BreedRings", array);System.out.println("Timeblock JSON: " + json );
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
<<<<<<< HEAD
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:2: ( STANDALONE_COMMENT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:4: STANDALONE_COMMENT
			{
			match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment119); 
=======
		return json;
	}
	// $ANTLR end "timeblock"



	// $ANTLR start "judge_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:27:1: judge_block returns [JsonObject json] : JUDGE_NAME (block= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		Token JUDGE_NAME3=null;
		JsonObject block =null;

		json = new JsonObject(); JsonArray array = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:2: ( JUDGE_NAME (block= timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:4: JUDGE_NAME (block= timeblock )+
			{
			JUDGE_NAME3=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block156); 
			json.addProperty("JudgeName",(JUDGE_NAME3!=null?JUDGE_NAME3.getText():null));
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:64: (block= timeblock )+
			int cnt7=0;
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==TIME) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:65: block= timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block162);
					block=timeblock();
					state._fsp--;

					array.add(block);
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

			json.add("Blocks", array);
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
<<<<<<< HEAD
		return ;
	}
	// $ANTLR end "ring_comment"



	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:1: timeblock : TIME ( special_ring | junior_ring | breed_ring | comment )* ( special_ring | junior_ring | breed_ring | ring_comment ) ;
	public final void timeblock() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:11: ( TIME ( special_ring | junior_ring | breed_ring | comment )* ( special_ring | junior_ring | breed_ring | ring_comment ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:13: TIME ( special_ring | junior_ring | breed_ring | comment )* ( special_ring | junior_ring | breed_ring | ring_comment )
			{
			match(input,TIME,FOLLOW_TIME_in_timeblock127); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:18: ( special_ring | junior_ring | breed_ring | comment )*
			loop8:
			do {
				int alt8=5;
				alt8 = dfa8.predict(input);
				switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:19: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_timeblock130);
					special_ring();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:32: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_timeblock132);
					junior_ring();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:44: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_timeblock134);
					breed_ring();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:55: comment
					{
					pushFollow(FOLLOW_comment_in_timeblock136);
					comment();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:65: ( special_ring | junior_ring | breed_ring | ring_comment )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:66: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_timeblock141);
					special_ring();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:79: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_timeblock143);
					junior_ring();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:91: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_timeblock145);
					breed_ring();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:102: ring_comment
					{
					pushFollow(FOLLOW_ring_comment_in_timeblock147);
					ring_comment();
					state._fsp--;

					}
					break;

			}

=======
		return json;
	}
	// $ANTLR end "judge_block"



	// $ANTLR start "comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:1: comment : ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+ ;
	public final void comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:9: ( ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:11: ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:11: ( TIME | COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==INT) ) {
					int LA8_2 = input.LA(2);
					if ( ((LA8_2 >= COMMENT && LA8_2 <= ELLIPSIS)||(LA8_2 >= INT && LA8_2 <= JUDGE_NAME)||LA8_2==PHONE_NUMBER||LA8_2==RING_TITLE||LA8_2==TIME) ) {
						alt8=1;
					}

				}
				else if ( ((LA8_0 >= COMMENT && LA8_0 <= ELLIPSIS)||LA8_0==JUDGE_NAME||LA8_0==PHONE_NUMBER||LA8_0==TIME) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= COMMENT && input.LA(1) <= ELLIPSIS)||(input.LA(1) >= INT && input.LA(1) <= JUDGE_NAME)||input.LA(1)==PHONE_NUMBER||input.LA(1)==TIME ) {
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
					if ( cnt8 >= 1 ) break loop8;
						EarlyExitException eee =
							new EarlyExitException(8, input);
						throw eee;
				}
				cnt8++;
			} while (true);

			System.out.println("Done with comment");
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
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
<<<<<<< HEAD
	// $ANTLR end "timeblock"
=======
	// $ANTLR end "comment"
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb



	// $ANTLR start "special_ring"
<<<<<<< HEAD
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:1: special_ring : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final void special_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:13: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:17: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			match(input,INT,FOLLOW_INT_in_special_ring156); 
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring158); 
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
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring160); 
=======
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:1: special_ring returns [JsonObject json] : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT4=null;
		Token BREED_NAME5=null;
		Token SPECIAL_SUFFIX6=null;

		json = new JsonObject(); String suff = ""; System.out.println("Found a special ring");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:2: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:6: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			INT4=(Token)match(input,INT,FOLLOW_INT_in_special_ring212); 
			json.addProperty("Count", (INT4!=null?INT4.getText():null)); 
			BREED_NAME5=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring215); 
			json.addProperty("Breed", (BREED_NAME5!=null?BREED_NAME5.getText():null)); 
			suff=null;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:120: ( SPECIAL_SUFFIX )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:121: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX6=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring220); 
					suff+=(SPECIAL_SUFFIX6!=null?SPECIAL_SUFFIX6.getText():null);
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
					}
					break;

				default :
<<<<<<< HEAD
					if ( cnt10 >= 1 ) break loop10;
						EarlyExitException eee =
							new EarlyExitException(10, input);
						throw eee;
				}
				cnt10++;
			} while (true);

=======
					if ( cnt9 >= 1 ) break loop9;
						EarlyExitException eee =
							new EarlyExitException(9, input);
						throw eee;
				}
				cnt9++;
			} while (true);

			json.addProperty("SpecialType",suff);
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
<<<<<<< HEAD
		return ;
=======
		return json;
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
	}
	// $ANTLR end "special_ring"



	// $ANTLR start "junior_ring"
<<<<<<< HEAD
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:1: junior_ring : INT JUNIOR_CLASS ;
	public final void junior_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:12: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:14: INT JUNIOR_CLASS
			{
			match(input,INT,FOLLOW_INT_in_junior_ring167); 
			match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring169); 
=======
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:1: junior_ring returns [JsonObject json] : INT JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT7=null;
		Token JUNIOR_CLASS8=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:2: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:4: INT JUNIOR_CLASS
			{
			INT7=(Token)match(input,INT,FOLLOW_INT_in_junior_ring242); 
			json.addProperty("Count", (INT7!=null?INT7.getText():null)); 
			JUNIOR_CLASS8=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring246); 
			json.addProperty("ClassName", (JUNIOR_CLASS8!=null?JUNIOR_CLASS8.getText():null)); 
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
<<<<<<< HEAD
		return ;
=======
		return json;
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
	}
	// $ANTLR end "junior_ring"



	// $ANTLR start "breed_ring"
<<<<<<< HEAD
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:1: breed_ring : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final void breed_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:2: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:4: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			match(input,INT,FOLLOW_INT_in_breed_ring177); 
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring179); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:19: ( BREED_NAME_SUFFIX )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BREED_NAME_SUFFIX) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:19: BREED_NAME_SUFFIX
					{
					match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring181); 
=======
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:1: breed_ring returns [JsonObject json] : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT9=null;
		Token BREED_NAME10=null;
		Token BREED_NAME_SUFFIX11=null;
		Token BREED_COUNT12=null;

		json = new JsonObject();String str = null;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:2: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:4: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			INT9=(Token)match(input,INT,FOLLOW_INT_in_breed_ring264); 
			json.addProperty("Count", (INT9!=null?INT9.getText():null)); 
			str = "";
			BREED_NAME10=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring268); 
			str += (BREED_NAME10!=null?BREED_NAME10.getText():null);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:96: ( BREED_NAME_SUFFIX )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BREED_NAME_SUFFIX) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:97: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX11=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring272); 
					str+= (BREED_NAME_SUFFIX11!=null?BREED_NAME_SUFFIX11.getText():null);
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
					}
					break;

			}

<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:38: ( BREED_COUNT )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==BREED_COUNT) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:38: BREED_COUNT
					{
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring184); 
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:150: ( BREED_COUNT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BREED_COUNT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:151: BREED_COUNT
					{
					BREED_COUNT12=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring279); 
					json.addProperty("BreedCount", (BREED_COUNT12!=null?BREED_COUNT12.getText():null));
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
					}
					break;

			}

<<<<<<< HEAD
=======
			System.out.println("BreedRing JSON: " + json);
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
<<<<<<< HEAD
		return ;
=======
		return json;
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
	}
	// $ANTLR end "breed_ring"



	// $ANTLR start "breed_name"
<<<<<<< HEAD
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:35:1: breed_name : BREED_NAME BREED_NAME_SUFFIX ;
	public final void breed_name() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:2: ( BREED_NAME BREED_NAME_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:4: BREED_NAME BREED_NAME_SUFFIX
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name193); 
			match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name195); 
=======
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:1: breed_name : BREED_NAME BREED_NAME_SUFFIX ;
	public final void breed_name() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:44:2: ( BREED_NAME BREED_NAME_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:44:4: BREED_NAME BREED_NAME_SUFFIX
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name292); 
			match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name294); 
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
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

<<<<<<< HEAD
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
			return "()+ loopback of 19:19: ( judge_block )+";
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
			return "()+ loopback of 22:15: ( timeblock )+";
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
			return "()* loopback of 30:18: ( special_ring | junior_ring | breed_ring | comment )*";
		}
	}

	public static final BitSet FOLLOW_special_ring_in_test_special30 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed39 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start46 = new BitSet(new long[]{0x0000004A18000740L});
	public static final BitSet FOLLOW_ring_in_start49 = new BitSet(new long[]{0x0000004A18000740L});
	public static final BitSet FOLLOW_big_comment_in_start52 = new BitSet(new long[]{0x0000004218000740L});
	public static final BitSet FOLLOW_EOF_in_start55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring62 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_judge_block_in_ring64 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block74 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block76 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_comment_in_big_comment86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock127 = new BitSet(new long[]{0x0000002218000700L});
	public static final BitSet FOLLOW_special_ring_in_timeblock130 = new BitSet(new long[]{0x0000002218000700L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock132 = new BitSet(new long[]{0x0000002218000700L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock134 = new BitSet(new long[]{0x0000002218000700L});
	public static final BitSet FOLLOW_comment_in_timeblock136 = new BitSet(new long[]{0x0000002218000700L});
	public static final BitSet FOLLOW_special_ring_in_timeblock141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_timeblock147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring156 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring158 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring160 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring167 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring177 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring179 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring181 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name193 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name195 = new BitSet(new long[]{0x0000000000000002L});
=======


	// $ANTLR start "test_pug"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:1: test_pug : BREED_NAME BREED_COUNT ;
	public final void test_pug() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:9: ( BREED_NAME BREED_COUNT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:11: BREED_NAME BREED_COUNT
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_test_pug338); 
			match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_test_pug340); 
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
	// $ANTLR end "test_pug"

	// Delegated rules



	public static final BitSet FOLLOW_special_ring_in_test_special26 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed35 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_comment_in_start54 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ring_in_start59 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_EOF_in_start65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring82 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_judge_block_in_ring88 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock112 = new BitSet(new long[]{0x000000210C000700L});
	public static final BitSet FOLLOW_comment_in_timeblock117 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_breed_ring_in_timeblock123 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_special_ring_in_timeblock128 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_junior_ring_in_timeblock133 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block156 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block162 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring212 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring215 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring220 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring242 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring264 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring268 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring272 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name292 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_test_pug338 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BREED_COUNT_in_test_pug340 = new BitSet(new long[]{0x0000000000000002L});
>>>>>>> 1c12b21f2f3d41571e10b6ace813083e99947ceb
}
