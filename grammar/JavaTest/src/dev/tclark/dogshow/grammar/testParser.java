// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-03-06 20:54:46

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

@SuppressWarnings("all")
public class testParser extends Parser {
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:17: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:17: ( special_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:17: special_ring
					{
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:1: test_breed : breed_ring ;
	public final void test_breed() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:27:5: ( breed_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:27:9: breed_ring
			{
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
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:3: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:4: (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:4: (mComment= big_comment )+
			int cnt2=0;
			loop2:
			do {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BREED_NAME||(LA2_0 >= COMMENT && LA2_0 <= ELLIPSIS)||(LA2_0 >= GROUP_RING && LA2_0 <= INT)||LA2_0==PARENTHETICAL||LA2_0==PHONE_NUMBER||LA2_0==SPECIAL_SUFFIX||LA2_0==TIME) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:5: mComment= big_comment
					{
					pushFollow(FOLLOW_big_comment_in_start85);
					mComment=big_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {comments+=mComment;}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(2, input);
						throw eee;
				}
				cnt2++;
			} while (true);

			if ( state.backtracking==0 ) {json.addProperty("Comment", comments);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:94: ( ( ring )=>mRing= ring )+
			int cnt3=0;
			loop3:
			do {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==RING_TITLE) && (synpred3_test())) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:95: ( ring )=>mRing= ring
					{
					pushFollow(FOLLOW_ring_in_start98);
					mRing=ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {ringArray.add(mRing);}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(3, input);
						throw eee;
				}
				cnt3++;
			} while (true);

			if ( state.backtracking==0 ) {json.add("Rings", ringArray);}
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
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:35:3: ( RING_TITLE mRing= inner_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:35:7: RING_TITLE mRing= inner_ring
			{
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring131); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Title", (RING_TITLE1!=null?RING_TITLE1.getText():null));}
			pushFollow(FOLLOW_inner_ring_in_ring136);
			mRing=inner_ring();
			state._fsp--;
			if (state.failed) return json;
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
		return json;
	}
	// $ANTLR end "ring"



	// $ANTLR start "inner_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:1: inner_ring returns [JsonObject json] : ( ( group_block )=>mGroupBlock= group_block | ( (mJudgeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJudgeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:2: ( ( group_block )=>mGroupBlock= group_block | ( (mJudgeBlock= judge_block )+ ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==TIME) && (synpred4_test())) {
				alt5=1;
			}
			else if ( (LA5_0==JUDGE_NAME) ) {
				alt5=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:5: ( group_block )=>mGroupBlock= group_block
					{
					pushFollow(FOLLOW_group_block_in_inner_ring161);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:7: ( (mJudgeBlock= judge_block )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:7: ( (mJudgeBlock= judge_block )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:8: (mJudgeBlock= judge_block )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:8: (mJudgeBlock= judge_block )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:39:9: mJudgeBlock= judge_block
							{
							pushFollow(FOLLOW_judge_block_in_inner_ring174);
							mJudgeBlock=judge_block();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {judgeBlocks.add(mJudgeBlock);}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return json;}
								EarlyExitException eee =
									new EarlyExitException(4, input);
								throw eee;
						}
						cnt4++;
					} while (true);

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
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:5: ( JUDGE_NAME (mBlock= timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:9: JUDGE_NAME (mBlock= timeblock )+
			{
			JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block202); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Judge", (JUDGE_NAME2!=null?JUDGE_NAME2.getText():null));}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:66: (mBlock= timeblock )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==TIME) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:67: mBlock= timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block208);
					mBlock=timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {array.add(mBlock);}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(6, input);
						throw eee;
				}
				cnt6++;
			} while (true);

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
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:3: ( (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:7: (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:7: (mComment= comment | TIME | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			int alt7=5;
			switch ( input.LA(1) ) {
			case COMMENT:
			case DATE:
			case ELLIPSIS:
			case INT:
			case PARENTHETICAL:
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
			case SPECIAL_SUFFIX:
				{
				alt7=4;
				}
				break;
			case GROUP_RING:
				{
				alt7=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:8: mComment= comment
					{
					pushFollow(FOLLOW_comment_in_big_comment240);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:42: TIME
					{
					TIME3=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment243); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME3!=null?TIME3.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:64: BREED_NAME
					{
					BREED_NAME4=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment246); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME4!=null?BREED_NAME4.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:98: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX5=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment249); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX5!=null?SPECIAL_SUFFIX5.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:140: GROUP_RING
					{
					GROUP_RING6=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment252); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_RING6!=null?GROUP_RING6.getText():null);}
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
		return str;
	}
	// $ANTLR end "big_comment"



	// $ANTLR start "comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:1: comment returns [String str] : ( COMMENT | INT | DATE | PARENTHETICAL | PHONE_NUMBER | ELLIPSIS ) ;
	public final String comment() throws RecognitionException {
		String str = null;


		Token COMMENT7=null;
		Token INT8=null;
		Token DATE9=null;
		Token PARENTHETICAL10=null;
		Token PHONE_NUMBER11=null;
		Token ELLIPSIS12=null;

		str = null;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:3: ( ( COMMENT | INT | DATE | PARENTHETICAL | PHONE_NUMBER | ELLIPSIS ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:7: ( COMMENT | INT | DATE | PARENTHETICAL | PHONE_NUMBER | ELLIPSIS )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:7: ( COMMENT | INT | DATE | PARENTHETICAL | PHONE_NUMBER | ELLIPSIS )
			int alt8=6;
			switch ( input.LA(1) ) {
			case COMMENT:
				{
				alt8=1;
				}
				break;
			case INT:
				{
				alt8=2;
				}
				break;
			case DATE:
				{
				alt8=3;
				}
				break;
			case PARENTHETICAL:
				{
				alt8=4;
				}
				break;
			case PHONE_NUMBER:
				{
				alt8=5;
				}
				break;
			case ELLIPSIS:
				{
				alt8=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:8: COMMENT
					{
					COMMENT7=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment277); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT7!=null?COMMENT7.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:36: INT
					{
					INT8=(Token)match(input,INT,FOLLOW_INT_in_comment280); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT8!=null?INT8.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:56: DATE
					{
					DATE9=(Token)match(input,DATE,FOLLOW_DATE_in_comment283); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE9!=null?DATE9.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:78: PARENTHETICAL
					{
					PARENTHETICAL10=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment286); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL10!=null?PARENTHETICAL10.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:118: PHONE_NUMBER
					{
					PHONE_NUMBER11=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment289); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER11!=null?PHONE_NUMBER11.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:156: ELLIPSIS
					{
					ELLIPSIS12=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment292); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS12!=null?ELLIPSIS12.getText():null);}
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
		return str;
	}
	// $ANTLR end "comment"



	// $ANTLR start "timeblock_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:51:1: timeblock_comment returns [String str] : ( COMMENT | INT | PHONE_NUMBER | PARENTHETICAL | ELLIPSIS | TIME | BREED_NAME ) ;
	public final String timeblock_comment() throws RecognitionException {
		String str = null;


		Token COMMENT13=null;
		Token INT14=null;
		Token PHONE_NUMBER15=null;
		Token PARENTHETICAL16=null;
		Token ELLIPSIS17=null;
		Token TIME18=null;
		Token BREED_NAME19=null;

		str = null;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:2: ( ( COMMENT | INT | PHONE_NUMBER | PARENTHETICAL | ELLIPSIS | TIME | BREED_NAME ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:4: ( COMMENT | INT | PHONE_NUMBER | PARENTHETICAL | ELLIPSIS | TIME | BREED_NAME )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:4: ( COMMENT | INT | PHONE_NUMBER | PARENTHETICAL | ELLIPSIS | TIME | BREED_NAME )
			int alt9=7;
			switch ( input.LA(1) ) {
			case COMMENT:
				{
				alt9=1;
				}
				break;
			case INT:
				{
				alt9=2;
				}
				break;
			case PHONE_NUMBER:
				{
				alt9=3;
				}
				break;
			case PARENTHETICAL:
				{
				alt9=4;
				}
				break;
			case ELLIPSIS:
				{
				alt9=5;
				}
				break;
			case TIME:
				{
				alt9=6;
				}
				break;
			case BREED_NAME:
				{
				alt9=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:5: COMMENT
					{
					COMMENT13=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment317); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT13!=null?COMMENT13.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:33: INT
					{
					INT14=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment320); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT14!=null?INT14.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:53: PHONE_NUMBER
					{
					PHONE_NUMBER15=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment323); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER15!=null?PHONE_NUMBER15.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:91: PARENTHETICAL
					{
					PARENTHETICAL16=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_timeblock_comment326); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL16!=null?PARENTHETICAL16.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:131: ELLIPSIS
					{
					ELLIPSIS17=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment329); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS17!=null?ELLIPSIS17.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:161: TIME
					{
					TIME18=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock_comment332); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME18!=null?TIME18.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:183: BREED_NAME
					{
					BREED_NAME19=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_timeblock_comment335); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME19!=null?BREED_NAME19.getText():null);}
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
		return str;
	}
	// $ANTLR end "timeblock_comment"



	// $ANTLR start "ring_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:54:1: ring_comment returns [String str] : STANDALONE_COMMENT ;
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT20=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:5: ( STANDALONE_COMMENT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:9: STANDALONE_COMMENT
			{
			STANDALONE_COMMENT20=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment354); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT20!=null?STANDALONE_COMMENT20.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "ring_comment"



	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:57:1: timeblock returns [JsonObject json] : TIME (mInnerBlock1= inner_timeblock mComment= timeblock_comment )* ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token TIME21=null;
		JsonArray mInnerBlock1 =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; int blockCounter = 0;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:2: ( TIME (mInnerBlock1= inner_timeblock mComment= timeblock_comment )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:4: TIME (mInnerBlock1= inner_timeblock mComment= timeblock_comment )*
			{
			TIME21=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock376); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Time", (TIME21!=null?TIME21.getText():null));}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:48: (mInnerBlock1= inner_timeblock mComment= timeblock_comment )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==INT||LA10_0==STANDALONE_COMMENT) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:49: mInnerBlock1= inner_timeblock mComment= timeblock_comment
					{
					pushFollow(FOLLOW_inner_timeblock_in_timeblock382);
					mInnerBlock1=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.add("Block"+(blockCounter++), mInnerBlock1);}
					pushFollow(FOLLOW_timeblock_comment_in_timeblock387);
					mComment=timeblock_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {comment+=mComment;}
					}
					break;

				default :
					break loop10;
				}
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
		return json;
	}
	// $ANTLR end "timeblock"



	// $ANTLR start "inner_timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:61:1: inner_timeblock returns [JsonArray array] : (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )* (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment ) ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mSpecialRing =null;
		JsonObject mJuniorRing =null;
		JsonObject mBreedRing =null;
		String mComment =null;

		array = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:2: ( (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )* (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )* (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )*
			loop11:
			do {
				int alt11=4;
				alt11 = dfa11.predict(input);
				switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:5: mSpecialRing= special_ring
					{
					pushFollow(FOLLOW_special_ring_in_inner_timeblock413);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mSpecialRing);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:57: mJuniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock418);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mJuniorRing);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:106: ( breed_ring )=>mBreedRing= breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock427);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mBreedRing);}
					}
					break;

				default :
					break loop11;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:168: (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment )
			int alt12=4;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==INT) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==BREED_NAME) ) {
					int LA12_3 = input.LA(3);
					if ( (LA12_3==SPECIAL_SUFFIX) ) {
						alt12=1;
					}
					else if ( ((LA12_3 >= BREED_COUNT && LA12_3 <= COMMENT)||LA12_3==ELLIPSIS||LA12_3==INT||LA12_3==PARENTHETICAL||LA12_3==PHONE_NUMBER||LA12_3==TIME) ) {
						alt12=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return array;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 12, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA12_1==JUNIOR_CLASS) ) {
					alt12=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return array;}
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
			else if ( (LA12_0==STANDALONE_COMMENT) ) {
				alt12=4;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return array;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:169: mSpecialRing= special_ring
					{
					pushFollow(FOLLOW_special_ring_in_inner_timeblock435);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mSpecialRing);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:221: mJuniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock440);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mJuniorRing);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:270: mBreedRing= breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock445);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mBreedRing);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:316: mComment= ring_comment
					{
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock450);
					mComment=ring_comment();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(new JsonPrimitive(mComment));}
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
		return array;
	}
	// $ANTLR end "inner_timeblock"



	// $ANTLR start "special_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:1: special_ring returns [JsonObject json] : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT22=null;
		Token BREED_NAME23=null;
		Token SPECIAL_SUFFIX24=null;

		json = new JsonObject(); String breedName = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:66:2: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:66:6: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			INT22=(Token)match(input,INT,FOLLOW_INT_in_special_ring472); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT22!=null?INT22.getText():null));}
			BREED_NAME23=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring475); if (state.failed) return json;
			if ( state.backtracking==0 ) {breedName+=(BREED_NAME23!=null?BREED_NAME23.getText():null);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:66:90: ( SPECIAL_SUFFIX )+
			int cnt13=0;
			loop13:
			do {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==SPECIAL_SUFFIX) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:66:91: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX24=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring479); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName+= " " +(SPECIAL_SUFFIX24!=null?SPECIAL_SUFFIX24.getText():null);}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(13, input);
						throw eee;
				}
				cnt13++;
			} while (true);

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
		return json;
	}
	// $ANTLR end "special_ring"



	// $ANTLR start "junior_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:1: junior_ring returns [JsonObject json] : INT JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT25=null;
		Token JUNIOR_CLASS26=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:2: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:7: INT JUNIOR_CLASS
			{
			INT25=(Token)match(input,INT,FOLLOW_INT_in_junior_ring504); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT25!=null?INT25.getText():null));}
			JUNIOR_CLASS26=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring507); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("ClassName", (JUNIOR_CLASS26!=null?JUNIOR_CLASS26.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return json;
	}
	// $ANTLR end "junior_ring"



	// $ANTLR start "group_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:71:1: group_ring returns [String str] : GROUP_RING ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING27=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:72:2: ( GROUP_RING )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:72:5: GROUP_RING
			{
			GROUP_RING27=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring522); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(GROUP_RING27!=null?GROUP_RING27.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "group_ring"



	// $ANTLR start "group_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME28=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:75:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:75:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+
			{
			TIME28=(Token)match(input,TIME,FOLLOW_TIME_in_group_block541); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("TIME", (TIME28!=null?TIME28.getText():null));}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:75:48: ( STANDALONE_COMMENT )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==STANDALONE_COMMENT) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:75:48: STANDALONE_COMMENT
					{
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block544); if (state.failed) return json;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:75:68: (mRing= group_ring )+
			int cnt15=0;
			loop15:
			do {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==GROUP_RING) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:75:69: mRing= group_ring
					{
					pushFollow(FOLLOW_group_ring_in_group_block550);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {rings.add(new JsonPrimitive(mRing));}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(15, input);
						throw eee;
				}
				cnt15++;
			} while (true);

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
		return json;
	}
	// $ANTLR end "group_block"



	// $ANTLR start "breed_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:76:1: breed_ring returns [JsonObject json] : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT29=null;
		Token BREED_NAME30=null;
		Token BREED_NAME_SUFFIX31=null;
		Token BREED_COUNT32=null;

		json = new JsonObject();String breedName = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:78:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:78:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			INT29=(Token)match(input,INT,FOLLOW_INT_in_breed_ring578); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT29!=null?INT29.getText():null));}
			BREED_NAME30=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring581); if (state.failed) return json;
			if ( state.backtracking==0 ) {breedName+=(BREED_NAME30!=null?BREED_NAME30.getText():null);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:78:93: ( BREED_NAME_SUFFIX )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BREED_NAME_SUFFIX) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:78:94: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX31=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring585); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX31!=null?BREED_NAME_SUFFIX31.getText():null);}
					}
					break;

			}

			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:78:203: ( BREED_COUNT )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BREED_COUNT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:78:204: BREED_COUNT
					{
					BREED_COUNT32=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring593); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("BreedCount", (BREED_COUNT32!=null?BREED_COUNT32.getText():null));}
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
		return json;
	}
	// $ANTLR end "breed_ring"

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:95: ( ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:96: ring
		{
		pushFollow(FOLLOW_ring_in_synpred3_test93);
		ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred3_test

	// $ANTLR start synpred4_test
	public final void synpred4_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:5: ( group_block )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:6: group_block
		{
		pushFollow(FOLLOW_group_block_in_synpred4_test156);
		group_block();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred4_test

	// $ANTLR start synpred25_test
	public final void synpred25_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:106: ( breed_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:107: breed_ring
		{
		pushFollow(FOLLOW_breed_ring_in_synpred25_test422);
		breed_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred25_test

	// Delegated rules

	public final boolean synpred25_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_test_fragment(); // can never throw exception
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


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\20\uffff";
	static final String DFA11_eofS =
		"\10\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff";
	static final String DFA11_minS =
		"\1\36\1\6\1\uffff\1\5\2\6\1\5\2\6\1\uffff\1\6\1\uffff\1\6\3\uffff";
	static final String DFA11_maxS =
		"\1\50\1\40\1\uffff\6\51\1\uffff\1\51\1\uffff\1\51\3\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\4\6\uffff\1\3\1\uffff\1\2\1\uffff\1\1\2\3";
	static final String DFA11_specialS =
		"\3\uffff\1\1\2\uffff\1\3\1\2\1\0\7\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\1\11\uffff\1\2",
			"\1\3\31\uffff\1\4",
			"",
			"\1\7\1\2\1\6\1\2\1\uffff\1\2\23\uffff\1\10\2\uffff\1\2\2\uffff\1\2\2"+
			"\uffff\1\5\1\11\1\2",
			"\1\2\1\uffff\1\2\1\uffff\1\2\23\uffff\1\12\2\uffff\1\2\2\uffff\1\2\3"+
			"\uffff\1\13\1\2",
			"\1\2\1\uffff\1\2\1\uffff\1\2\23\uffff\1\14\2\uffff\1\2\2\uffff\1\2\2"+
			"\uffff\1\5\1\15\1\2",
			"\1\7\1\2\1\uffff\1\2\1\uffff\1\2\23\uffff\1\10\2\uffff\1\2\2\uffff\1"+
			"\2\3\uffff\1\11\1\2",
			"\1\2\1\uffff\1\2\1\uffff\1\2\23\uffff\1\10\2\uffff\1\2\2\uffff\1\2\3"+
			"\uffff\1\11\1\2",
			"\1\16\27\uffff\2\2\1\17\5\uffff\1\2\1\uffff\2\2",
			"",
			"\1\13\27\uffff\2\2\1\13\5\uffff\1\2\1\uffff\2\2",
			"",
			"\1\15\27\uffff\2\2\1\15\5\uffff\1\2\1\uffff\2\2",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 63:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_8 = input.LA(1);
						 
						int index11_8 = input.index();
						input.rewind();
						s = -1;
						if ( (LA11_8==EOF||(LA11_8 >= INT && LA11_8 <= JUDGE_NAME)||LA11_8==RING_TITLE||(LA11_8 >= STANDALONE_COMMENT && LA11_8 <= TIME)) ) {s = 2;}
						else if ( (LA11_8==BREED_NAME) && (synpred25_test())) {s = 14;}
						else if ( (LA11_8==JUNIOR_CLASS) && (synpred25_test())) {s = 15;}
						 
						input.seek(index11_8);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA11_3 = input.LA(1);
						 
						int index11_3 = input.index();
						input.rewind();
						s = -1;
						if ( (LA11_3==SPECIAL_SUFFIX) ) {s = 5;}
						else if ( (LA11_3==BREED_NAME_SUFFIX) ) {s = 6;}
						else if ( (LA11_3==BREED_COUNT) ) {s = 7;}
						else if ( (LA11_3==BREED_NAME||LA11_3==COMMENT||LA11_3==ELLIPSIS||LA11_3==PARENTHETICAL||LA11_3==PHONE_NUMBER||LA11_3==TIME) ) {s = 2;}
						else if ( (LA11_3==INT) ) {s = 8;}
						else if ( (LA11_3==STANDALONE_COMMENT) && (synpred25_test())) {s = 9;}
						 
						input.seek(index11_3);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA11_7 = input.LA(1);
						 
						int index11_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA11_7==BREED_NAME||LA11_7==COMMENT||LA11_7==ELLIPSIS||LA11_7==PARENTHETICAL||LA11_7==PHONE_NUMBER||LA11_7==TIME) ) {s = 2;}
						else if ( (LA11_7==INT) ) {s = 8;}
						else if ( (LA11_7==STANDALONE_COMMENT) && (synpred25_test())) {s = 9;}
						 
						input.seek(index11_7);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA11_6 = input.LA(1);
						 
						int index11_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA11_6==BREED_COUNT) ) {s = 7;}
						else if ( (LA11_6==BREED_NAME||LA11_6==COMMENT||LA11_6==ELLIPSIS||LA11_6==PARENTHETICAL||LA11_6==PHONE_NUMBER||LA11_6==TIME) ) {s = 2;}
						else if ( (LA11_6==INT) ) {s = 8;}
						else if ( (LA11_6==STANDALONE_COMMENT) && (synpred25_test())) {s = 9;}
						 
						input.seek(index11_6);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_special_ring_in_test_special47 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start85 = new BitSet(new long[]{0x000002D260000740L});
	public static final BitSet FOLLOW_ring_in_start98 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_EOF_in_start105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring131 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_inner_ring_in_ring136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring174 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block202 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block208 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_comment_in_big_comment240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_timeblock_comment326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock_comment332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_timeblock_comment335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock376 = new BitSet(new long[]{0x0000010040000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock382 = new BitSet(new long[]{0x0000021240000540L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock387 = new BitSet(new long[]{0x0000010040000002L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock413 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock418 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock427 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring472 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring475 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring479 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring504 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_group_block541 = new BitSet(new long[]{0x0000010020000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block544 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block550 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring578 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring581 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring585 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred3_test93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_synpred4_test156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred25_test422 = new BitSet(new long[]{0x0000000000000002L});
}
