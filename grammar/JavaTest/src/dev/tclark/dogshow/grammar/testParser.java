// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-02-23 21:46:57

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:17: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:17: ( special_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:20:17: special_ring
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:21:1: test_breed : breed_ring ;
	public final void test_breed() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:5: ( breed_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:9: breed_ring
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:23:1: start returns [JsonObject json] : ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray(); System.out.println("starting...");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:3: ( ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:4: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:4: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:5: (mComment= big_comment )+ ( ( ring )=>mRing= ring )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:5: (mComment= big_comment )+
					int cnt2=0;
					loop2:
					do {
						int alt2=2;
						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA2_2 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case INT:
							{
							int LA2_3 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case JUDGE_NAME:
							{
							int LA2_4 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case DATE:
							{
							int LA2_5 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case PHONE_NUMBER:
							{
							int LA2_6 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case ELLIPSIS:
							{
							int LA2_7 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case TIME:
							{
							int LA2_8 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						case BREED_NAME:
							{
							int LA2_9 = input.LA(2);
							if ( (synpred2_test()) ) {
								alt2=1;
							}

							}
							break;
						}
						switch (alt2) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:6: mComment= big_comment
							{
							pushFollow(FOLLOW_big_comment_in_start79);
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:95: ( ( ring )=>mRing= ring )*
					loop3:
					do {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==RING_TITLE) && (synpred3_test())) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:96: ( ring )=>mRing= ring
							{
							pushFollow(FOLLOW_ring_in_start92);
							mRing=ring();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {ringArray.add(mRing);}
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
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(4, input);
						throw eee;
				}
				cnt4++;
			} while (true);

			if ( state.backtracking==0 ) {json.add("Rings", ringArray);}
			match(input,EOF,FOLLOW_EOF_in_start101); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:27:1: ring returns [JsonObject json] : RING_TITLE mRing= inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		Token RING_TITLE1=null;
		JsonObject mRing =null;

		json = new JsonObject();System.out.println("ring...");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:29:3: ( RING_TITLE mRing= inner_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:29:7: RING_TITLE mRing= inner_ring
			{
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring124); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Title", (RING_TITLE1!=null?RING_TITLE1.getText():null));}
			pushFollow(FOLLOW_inner_ring_in_ring129);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:1: inner_ring returns [JsonObject json] : ( ( group_block )=>mGroupBlock= group_block | ( (mJudgeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJudgeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:2: ( ( group_block )=>mGroupBlock= group_block | ( (mJudgeBlock= judge_block )+ ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TIME) && (synpred5_test())) {
				alt6=1;
			}
			else if ( (LA6_0==JUDGE_NAME) ) {
				alt6=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:5: ( group_block )=>mGroupBlock= group_block
					{
					pushFollow(FOLLOW_group_block_in_inner_ring154);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:7: ( (mJudgeBlock= judge_block )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:7: ( (mJudgeBlock= judge_block )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:8: (mJudgeBlock= judge_block )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:8: (mJudgeBlock= judge_block )+
					int cnt5=0;
					loop5:
					do {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==JUDGE_NAME) ) {
							int LA5_2 = input.LA(2);
							if ( (LA5_2==TIME) ) {
								int LA5_3 = input.LA(3);
								if ( (LA5_3==INT) ) {
									int LA5_4 = input.LA(4);
									if ( (LA5_4==BREED_NAME) ) {
										int LA5_6 = input.LA(5);
										if ( (synpred6_test()) ) {
											alt5=1;
										}

									}
									else if ( (LA5_4==JUNIOR_CLASS) ) {
										alt5=1;
									}

								}
								else if ( (LA5_3==STANDALONE_COMMENT) ) {
									alt5=1;
								}

							}

						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:9: mJudgeBlock= judge_block
							{
							pushFollow(FOLLOW_judge_block_in_inner_ring167);
							mJudgeBlock=judge_block();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {judgeBlocks.add(mJudgeBlock);}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							if (state.backtracking>0) {state.failed=true; return json;}
								EarlyExitException eee =
									new EarlyExitException(5, input);
								throw eee;
						}
						cnt5++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:34:1: judge_block returns [JsonObject json] : JUDGE_NAME (mBlock= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		Token JUDGE_NAME2=null;
		JsonObject mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:5: ( JUDGE_NAME (mBlock= timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:9: JUDGE_NAME (mBlock= timeblock )+
			{
			JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block195); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Judge", (JUDGE_NAME2!=null?JUDGE_NAME2.getText():null));}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:66: (mBlock= timeblock )+
			int cnt7=0;
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==TIME) ) {
					int LA7_2 = input.LA(2);
					if ( (LA7_2==INT) ) {
						int LA7_3 = input.LA(3);
						if ( (LA7_3==BREED_NAME) ) {
							int LA7_5 = input.LA(4);
							if ( (synpred7_test()) ) {
								alt7=1;
							}

						}
						else if ( (LA7_3==JUNIOR_CLASS) ) {
							alt7=1;
						}

					}
					else if ( (LA7_2==STANDALONE_COMMENT) ) {
						alt7=1;
					}

				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:67: mBlock= timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block201);
					mBlock=timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {array.add(mBlock);}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(7, input);
						throw eee;
				}
				cnt7++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:1: big_comment returns [String str] : (mComment= comment | TIME | BREED_NAME ) ;
	public final String big_comment() throws RecognitionException {
		String str = null;


		Token TIME3=null;
		Token BREED_NAME4=null;
		String mComment =null;

		str = null;System.out.println("big_comment...");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:3: ( (mComment= comment | TIME | BREED_NAME ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:7: (mComment= comment | TIME | BREED_NAME )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:7: (mComment= comment | TIME | BREED_NAME )
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
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:8: mComment= comment
					{
					pushFollow(FOLLOW_comment_in_big_comment233);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:42: TIME
					{
					TIME3=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment236); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME3!=null?TIME3.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:64: BREED_NAME
					{
					BREED_NAME4=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment239); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME4!=null?BREED_NAME4.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:41:1: comment returns [String str] : ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS ) ;
	public final String comment() throws RecognitionException {
		String str = null;


		Token COMMENT5=null;
		Token INT6=null;
		Token JUDGE_NAME7=null;
		Token DATE8=null;
		Token PHONE_NUMBER9=null;
		Token ELLIPSIS10=null;

		str = null;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:3: ( ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:7: ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:7: ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )
			int alt9=6;
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
			case JUDGE_NAME:
				{
				alt9=3;
				}
				break;
			case DATE:
				{
				alt9=4;
				}
				break;
			case PHONE_NUMBER:
				{
				alt9=5;
				}
				break;
			case ELLIPSIS:
				{
				alt9=6;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:8: COMMENT
					{
					COMMENT5=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment264); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT5!=null?COMMENT5.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:36: INT
					{
					INT6=(Token)match(input,INT,FOLLOW_INT_in_comment267); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT6!=null?INT6.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:56: JUDGE_NAME
					{
					JUDGE_NAME7=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_comment270); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(JUDGE_NAME7!=null?JUDGE_NAME7.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:90: DATE
					{
					DATE8=(Token)match(input,DATE,FOLLOW_DATE_in_comment273); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE8!=null?DATE8.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:112: PHONE_NUMBER
					{
					PHONE_NUMBER9=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment276); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER9!=null?PHONE_NUMBER9.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:150: ELLIPSIS
					{
					ELLIPSIS10=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment279); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS10!=null?ELLIPSIS10.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:44:1: timeblock_comment returns [String str] : ( COMMENT | INT | JUDGE_NAME | PHONE_NUMBER | ELLIPSIS | TIME | BREED_NAME ) ;
	public final String timeblock_comment() throws RecognitionException {
		String str = null;


		Token COMMENT11=null;
		Token INT12=null;
		Token JUDGE_NAME13=null;
		Token PHONE_NUMBER14=null;
		Token ELLIPSIS15=null;
		Token TIME16=null;
		Token BREED_NAME17=null;

		str = null;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:2: ( ( COMMENT | INT | JUDGE_NAME | PHONE_NUMBER | ELLIPSIS | TIME | BREED_NAME ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:4: ( COMMENT | INT | JUDGE_NAME | PHONE_NUMBER | ELLIPSIS | TIME | BREED_NAME )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:4: ( COMMENT | INT | JUDGE_NAME | PHONE_NUMBER | ELLIPSIS | TIME | BREED_NAME )
			int alt10=7;
			switch ( input.LA(1) ) {
			case COMMENT:
				{
				alt10=1;
				}
				break;
			case INT:
				{
				alt10=2;
				}
				break;
			case JUDGE_NAME:
				{
				alt10=3;
				}
				break;
			case PHONE_NUMBER:
				{
				alt10=4;
				}
				break;
			case ELLIPSIS:
				{
				alt10=5;
				}
				break;
			case TIME:
				{
				alt10=6;
				}
				break;
			case BREED_NAME:
				{
				alt10=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:5: COMMENT
					{
					COMMENT11=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment301); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT11!=null?COMMENT11.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:33: INT
					{
					INT12=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment304); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT12!=null?INT12.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:53: JUDGE_NAME
					{
					JUDGE_NAME13=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_timeblock_comment307); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(JUDGE_NAME13!=null?JUDGE_NAME13.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:87: PHONE_NUMBER
					{
					PHONE_NUMBER14=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment310); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER14!=null?PHONE_NUMBER14.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:125: ELLIPSIS
					{
					ELLIPSIS15=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment313); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS15!=null?ELLIPSIS15.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:155: TIME
					{
					TIME16=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock_comment316); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME16!=null?TIME16.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:177: BREED_NAME
					{
					BREED_NAME17=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_timeblock_comment319); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME17!=null?BREED_NAME17.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:1: ring_comment returns [String str] : STANDALONE_COMMENT ;
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT18=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:5: ( STANDALONE_COMMENT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:9: STANDALONE_COMMENT
			{
			STANDALONE_COMMENT18=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment338); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT18!=null?STANDALONE_COMMENT18.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:1: timeblock returns [JsonObject json] : TIME mInnerBlock1= inner_timeblock ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )? ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token TIME19=null;
		Token DATE20=null;
		JsonArray mInnerBlock1 =null;
		String mComment =null;
		JsonArray mInnerBlock2 =null;

		json = new JsonObject(); String comment = ""; int blockCounter = 0;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:2: ( TIME mInnerBlock1= inner_timeblock ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:6: TIME mInnerBlock1= inner_timeblock ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )?
			{
			TIME19=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock362); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Time", (TIME19!=null?TIME19.getText():null));}
			pushFollow(FOLLOW_inner_timeblock_in_timeblock367);
			mInnerBlock1=inner_timeblock();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {json.add("Block"+(blockCounter++), mInnerBlock1);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:130: ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )?
			int alt12=2;
			alt12 = dfa12.predict(input);
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:131: ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:131: ( options {greedy=false; } :mComment= timeblock_comment )*
					loop11:
					do {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==BREED_NAME||LA11_0==COMMENT||LA11_0==ELLIPSIS||(LA11_0 >= INT && LA11_0 <= JUDGE_NAME)||LA11_0==PHONE_NUMBER||LA11_0==TIME) ) {
							alt11=1;
						}
						else if ( (LA11_0==DATE) ) {
							alt11=2;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:156: mComment= timeblock_comment
							{
							pushFollow(FOLLOW_timeblock_comment_in_timeblock381);
							mComment=timeblock_comment();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {comment+=mComment;}
							}
							break;

						default :
							break loop11;
						}
					} while (true);

					if ( state.backtracking==0 ) {json.addProperty("Comment", comment);}
					DATE20=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock388); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("Date", (DATE20!=null?DATE20.getText():null));}
					match(input,INT,FOLLOW_INT_in_timeblock391); if (state.failed) return json;
					pushFollow(FOLLOW_inner_timeblock_in_timeblock395);
					mInnerBlock2=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.add("Block"+(blockCounter++), mInnerBlock2);}
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
	// $ANTLR end "timeblock"



	// $ANTLR start "inner_timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:1: inner_timeblock returns [JsonArray array] : (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )* (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment ) ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mSpecialRing =null;
		JsonObject mJuniorRing =null;
		JsonObject mBreedRing =null;
		String mComment =null;

		array = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:2: ( (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )* (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )* (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )*
			loop13:
			do {
				int alt13=4;
				alt13 = dfa13.predict(input);
				switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:5: mSpecialRing= special_ring
					{
					pushFollow(FOLLOW_special_ring_in_inner_timeblock419);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mSpecialRing);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:57: mJuniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock424);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mJuniorRing);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:106: ( breed_ring )=>mBreedRing= breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock433);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mBreedRing);}
					}
					break;

				default :
					break loop13;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:168: (mSpecialRing= special_ring |mJuniorRing= junior_ring |mBreedRing= breed_ring |mComment= ring_comment )
			int alt14=4;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==INT) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==BREED_NAME) ) {
					int LA14_3 = input.LA(3);
					if ( (LA14_3==SPECIAL_SUFFIX) ) {
						alt14=1;
					}
					else if ( (LA14_3==EOF||(LA14_3 >= BREED_COUNT && LA14_3 <= ELLIPSIS)||(LA14_3 >= INT && LA14_3 <= JUDGE_NAME)||LA14_3==PHONE_NUMBER||LA14_3==RING_TITLE||LA14_3==TIME) ) {
						alt14=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return array;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 14, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA14_1==JUNIOR_CLASS) ) {
					alt14=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return array;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA14_0==STANDALONE_COMMENT) ) {
				alt14=4;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return array;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:169: mSpecialRing= special_ring
					{
					pushFollow(FOLLOW_special_ring_in_inner_timeblock441);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mSpecialRing);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:221: mJuniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock446);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mJuniorRing);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:270: mBreedRing= breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock451);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mBreedRing);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:316: mComment= ring_comment
					{
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock456);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:1: special_ring returns [JsonObject json] : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT21=null;
		Token BREED_NAME22=null;
		Token SPECIAL_SUFFIX23=null;

		json = new JsonObject(); String breedName = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:58:2: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:58:6: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			INT21=(Token)match(input,INT,FOLLOW_INT_in_special_ring478); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT21!=null?INT21.getText():null));}
			BREED_NAME22=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring481); if (state.failed) return json;
			if ( state.backtracking==0 ) {breedName+=(BREED_NAME22!=null?BREED_NAME22.getText():null);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:58:90: ( SPECIAL_SUFFIX )+
			int cnt15=0;
			loop15:
			do {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==SPECIAL_SUFFIX) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:58:91: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX23=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring485); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName+= " " +(SPECIAL_SUFFIX23!=null?SPECIAL_SUFFIX23.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:1: junior_ring returns [JsonObject json] : INT JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT24=null;
		Token JUNIOR_CLASS25=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:61:2: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:61:7: INT JUNIOR_CLASS
			{
			INT24=(Token)match(input,INT,FOLLOW_INT_in_junior_ring510); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT24!=null?INT24.getText():null));}
			JUNIOR_CLASS25=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring513); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("ClassName", (JUNIOR_CLASS25!=null?JUNIOR_CLASS25.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:63:1: group_ring returns [String str] : GROUP_RING ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING26=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:2: ( GROUP_RING )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:5: GROUP_RING
			{
			GROUP_RING26=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring528); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(GROUP_RING26!=null?GROUP_RING26.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:1: group_block returns [JsonObject json] : TIME STANDALONE_COMMENT (mRing= group_ring )+ ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME27=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:2: ( TIME STANDALONE_COMMENT (mRing= group_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:4: TIME STANDALONE_COMMENT (mRing= group_ring )+
			{
			TIME27=(Token)match(input,TIME,FOLLOW_TIME_in_group_block547); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("TIME", (TIME27!=null?TIME27.getText():null));}
			match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block550); if (state.failed) return json;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:67: (mRing= group_ring )+
			int cnt16=0;
			loop16:
			do {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==GROUP_RING) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:68: mRing= group_ring
					{
					pushFollow(FOLLOW_group_ring_in_group_block555);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {rings.add(new JsonPrimitive(mRing));}
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(16, input);
						throw eee;
				}
				cnt16++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:1: breed_ring returns [JsonObject json] : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT28=null;
		Token BREED_NAME29=null;
		Token BREED_NAME_SUFFIX30=null;
		Token BREED_COUNT31=null;

		json = new JsonObject();String breedName = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			INT28=(Token)match(input,INT,FOLLOW_INT_in_breed_ring583); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count", (INT28!=null?INT28.getText():null));}
			BREED_NAME29=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring586); if (state.failed) return json;
			if ( state.backtracking==0 ) {breedName+=(BREED_NAME29!=null?BREED_NAME29.getText():null);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:93: ( BREED_NAME_SUFFIX )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BREED_NAME_SUFFIX) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:94: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX30=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring590); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX30!=null?BREED_NAME_SUFFIX30.getText():null);}
					}
					break;

			}

			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:203: ( BREED_COUNT )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==BREED_COUNT) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:204: BREED_COUNT
					{
					BREED_COUNT31=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring598); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("BreedCount", (BREED_COUNT31!=null?BREED_COUNT31.getText():null));}
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

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:6: (mComment= big_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:6: mComment= big_comment
		{
		pushFollow(FOLLOW_big_comment_in_synpred2_test79);
		mComment=big_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred2_test

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:96: ( ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:25:97: ring
		{
		pushFollow(FOLLOW_ring_in_synpred3_test87);
		ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred3_test

	// $ANTLR start synpred5_test
	public final void synpred5_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:5: ( group_block )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:6: group_block
		{
		pushFollow(FOLLOW_group_block_in_synpred5_test149);
		group_block();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred5_test

	// $ANTLR start synpred6_test
	public final void synpred6_test_fragment() throws RecognitionException {
		JsonObject mJudgeBlock =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:9: (mJudgeBlock= judge_block )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:9: mJudgeBlock= judge_block
		{
		pushFollow(FOLLOW_judge_block_in_synpred6_test167);
		mJudgeBlock=judge_block();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred6_test

	// $ANTLR start synpred7_test
	public final void synpred7_test_fragment() throws RecognitionException {
		JsonObject mBlock =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:67: (mBlock= timeblock )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:36:67: mBlock= timeblock
		{
		pushFollow(FOLLOW_timeblock_in_synpred7_test201);
		mBlock=timeblock();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred7_test

	// $ANTLR start synpred22_test
	public final void synpred22_test_fragment() throws RecognitionException {
		String mComment =null;
		JsonArray mInnerBlock2 =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:131: ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:131: ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:131: ( options {greedy=false; } :mComment= timeblock_comment )*
		loop21:
		do {
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==BREED_NAME||LA21_0==COMMENT||LA21_0==ELLIPSIS||(LA21_0 >= INT && LA21_0 <= JUDGE_NAME)||LA21_0==PHONE_NUMBER||LA21_0==TIME) ) {
				alt21=1;
			}
			else if ( (LA21_0==DATE) ) {
				alt21=2;
			}

			switch (alt21) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:156: mComment= timeblock_comment
				{
				pushFollow(FOLLOW_timeblock_comment_in_synpred22_test381);
				mComment=timeblock_comment();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				break loop21;
			}
		} while (true);

		match(input,DATE,FOLLOW_DATE_in_synpred22_test388); if (state.failed) return ;
		match(input,INT,FOLLOW_INT_in_synpred22_test391); if (state.failed) return ;
		pushFollow(FOLLOW_inner_timeblock_in_synpred22_test395);
		mInnerBlock2=inner_timeblock();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred22_test

	// $ANTLR start synpred23_test
	public final void synpred23_test_fragment() throws RecognitionException {
		JsonObject mSpecialRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:5: (mSpecialRing= special_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:5: mSpecialRing= special_ring
		{
		pushFollow(FOLLOW_special_ring_in_synpred23_test419);
		mSpecialRing=special_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred23_test

	// $ANTLR start synpred24_test
	public final void synpred24_test_fragment() throws RecognitionException {
		JsonObject mJuniorRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:57: (mJuniorRing= junior_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:57: mJuniorRing= junior_ring
		{
		pushFollow(FOLLOW_junior_ring_in_synpred24_test424);
		mJuniorRing=junior_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred24_test

	// $ANTLR start synpred25_test
	public final void synpred25_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:106: ( breed_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:107: breed_ring
		{
		pushFollow(FOLLOW_breed_ring_in_synpred25_test428);
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
	public final boolean synpred23_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
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
	public final boolean synpred24_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred22_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_test_fragment(); // can never throw exception
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
	public final boolean synpred5_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_test_fragment(); // can never throw exception
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


	protected DFA12 dfa12 = new DFA12(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA12_eotS =
		"\25\uffff";
	static final String DFA12_eofS =
		"\11\11\1\uffff\6\11\1\uffff\1\11\3\uffff";
	static final String DFA12_minS =
		"\11\6\1\uffff\6\6\1\0\1\6\1\uffff\2\0";
	static final String DFA12_maxS =
		"\11\50\1\uffff\6\50\1\0\1\50\1\uffff\2\0";
	static final String DFA12_acceptS =
		"\11\uffff\1\2\10\uffff\1\1\2\uffff";
	static final String DFA12_specialS =
		"\20\uffff\1\0\2\uffff\1\1\1\2}>";
	static final String[] DFA12_transitionS = {
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\3\4\uffff\1\4\1\uffff\1\11\2"+
			"\uffff\1\6",
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\12\4\uffff\1\4\1\uffff\1\11"+
			"\2\uffff\1\13",
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\12\4\uffff\1\4\1\uffff\1\11"+
			"\2\uffff\1\13",
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\12\4\uffff\1\4\1\uffff\1\11"+
			"\2\uffff\1\14",
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\12\4\uffff\1\4\1\uffff\1\11"+
			"\2\uffff\1\13",
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\12\4\uffff\1\4\1\uffff\1\11"+
			"\2\uffff\1\13",
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\15\1\12\4\uffff\1\4\1\uffff\1\11"+
			"\1\uffff\1\11\1\13",
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\12\4\uffff\1\4\1\uffff\1\11"+
			"\2\uffff\1\13",
			"\1\11\1\uffff\3\11\22\uffff\1\16\1\11\4\uffff\1\11\1\uffff\1\11\2\uffff"+
			"\1\11",
			"",
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\12\4\uffff\1\4\1\uffff\1\11"+
			"\2\uffff\1\13",
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\12\4\uffff\1\4\1\uffff\1\11"+
			"\2\uffff\1\13",
			"\1\7\1\uffff\1\1\1\10\1\5\22\uffff\1\17\1\12\4\uffff\1\4\1\uffff\1\11"+
			"\1\uffff\1\11\1\13",
			"\1\20\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\12\1\11\3\uffff\1\4\1\uffff"+
			"\1\11\2\uffff\1\13",
			"\1\11\1\uffff\3\11\22\uffff\1\21\1\11\4\uffff\1\11\1\uffff\1\11\1\uffff"+
			"\1\22\1\11",
			"\1\23\1\uffff\1\1\1\10\1\5\22\uffff\1\2\1\12\1\11\3\uffff\1\4\1\uffff"+
			"\1\11\2\uffff\1\13",
			"\1\uffff",
			"\1\24\1\uffff\3\11\22\uffff\2\11\1\22\3\uffff\1\11\1\uffff\1\11\2\uffff"+
			"\1\11",
			"",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "52:130: ( ( options {greedy=false; } :mComment= timeblock_comment )* DATE INT mInnerBlock2= inner_timeblock )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_16 = input.LA(1);
						 
						int index12_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred22_test()) ) {s = 18;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index12_16);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_19 = input.LA(1);
						 
						int index12_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred22_test()) ) {s = 18;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index12_19);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA12_20 = input.LA(1);
						 
						int index12_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred22_test()) ) {s = 18;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index12_20);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 12, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA13_eotS =
		"\22\uffff";
	static final String DFA13_eofS =
		"\3\uffff\6\2\1\uffff\1\2\1\uffff\1\2\5\uffff";
	static final String DFA13_minS =
		"\1\35\1\6\1\uffff\1\5\2\6\1\5\2\6\1\uffff\1\6\1\uffff\1\6\1\uffff\1\0"+
		"\1\uffff\2\0";
	static final String DFA13_maxS =
		"\1\47\1\37\1\uffff\6\50\1\uffff\1\50\1\uffff\1\50\1\uffff\1\0\1\uffff"+
		"\2\0";
	static final String DFA13_acceptS =
		"\2\uffff\1\4\6\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff\1\3\2\uffff";
	static final String DFA13_specialS =
		"\3\uffff\1\3\2\uffff\1\1\1\4\1\5\5\uffff\1\6\1\uffff\1\2\1\0}>";
	static final String[] DFA13_transitionS = {
			"\1\1\11\uffff\1\2",
			"\1\3\30\uffff\1\4",
			"",
			"\1\7\1\2\1\6\3\2\22\uffff\1\10\1\2\4\uffff\1\2\1\uffff\1\2\1\5\1\11"+
			"\1\2",
			"\1\2\1\uffff\3\2\22\uffff\1\12\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1"+
			"\13\1\2",
			"\1\2\1\uffff\3\2\22\uffff\1\14\1\2\4\uffff\1\2\1\uffff\1\2\1\5\1\15"+
			"\1\2",
			"\1\7\1\2\1\uffff\3\2\22\uffff\1\10\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\1\11\1\2",
			"\1\2\1\uffff\3\2\22\uffff\1\10\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1"+
			"\11\1\2",
			"\1\16\1\uffff\3\2\22\uffff\2\2\1\17\3\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\1\2",
			"",
			"\1\20\1\uffff\3\2\22\uffff\2\2\1\13\3\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\1\2",
			"",
			"\1\21\1\uffff\3\2\22\uffff\2\2\1\15\3\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\1\2",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 55:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( breed_ring )=>mBreedRing= breed_ring )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_17 = input.LA(1);
						 
						int index13_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred23_test()) ) {s = 13;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index13_17);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA13_6 = input.LA(1);
						 
						int index13_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_6==BREED_COUNT) ) {s = 7;}
						else if ( (LA13_6==EOF||LA13_6==BREED_NAME||(LA13_6 >= COMMENT && LA13_6 <= ELLIPSIS)||LA13_6==JUDGE_NAME||LA13_6==PHONE_NUMBER||LA13_6==RING_TITLE||LA13_6==TIME) ) {s = 2;}
						else if ( (LA13_6==INT) ) {s = 8;}
						else if ( (LA13_6==STANDALONE_COMMENT) && (synpred25_test())) {s = 9;}
						 
						input.seek(index13_6);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA13_16 = input.LA(1);
						 
						int index13_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred24_test()) ) {s = 11;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index13_16);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA13_3 = input.LA(1);
						 
						int index13_3 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_3==SPECIAL_SUFFIX) ) {s = 5;}
						else if ( (LA13_3==BREED_NAME_SUFFIX) ) {s = 6;}
						else if ( (LA13_3==BREED_COUNT) ) {s = 7;}
						else if ( (LA13_3==EOF||LA13_3==BREED_NAME||(LA13_3 >= COMMENT && LA13_3 <= ELLIPSIS)||LA13_3==JUDGE_NAME||LA13_3==PHONE_NUMBER||LA13_3==RING_TITLE||LA13_3==TIME) ) {s = 2;}
						else if ( (LA13_3==INT) ) {s = 8;}
						else if ( (LA13_3==STANDALONE_COMMENT) && (synpred25_test())) {s = 9;}
						 
						input.seek(index13_3);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA13_7 = input.LA(1);
						 
						int index13_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_7==EOF||LA13_7==BREED_NAME||(LA13_7 >= COMMENT && LA13_7 <= ELLIPSIS)||LA13_7==JUDGE_NAME||LA13_7==PHONE_NUMBER||LA13_7==RING_TITLE||LA13_7==TIME) ) {s = 2;}
						else if ( (LA13_7==INT) ) {s = 8;}
						else if ( (LA13_7==STANDALONE_COMMENT) && (synpred25_test())) {s = 9;}
						 
						input.seek(index13_7);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA13_8 = input.LA(1);
						 
						int index13_8 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_8==EOF||(LA13_8 >= COMMENT && LA13_8 <= ELLIPSIS)||(LA13_8 >= INT && LA13_8 <= JUDGE_NAME)||LA13_8==PHONE_NUMBER||LA13_8==RING_TITLE||LA13_8==TIME) ) {s = 2;}
						else if ( (LA13_8==BREED_NAME) ) {s = 14;}
						else if ( (LA13_8==JUNIOR_CLASS) && (synpred25_test())) {s = 15;}
						 
						input.seek(index13_8);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA13_14 = input.LA(1);
						 
						int index13_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_test()) ) {s = 15;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index13_14);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_special_ring_in_test_special40 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start79 = new BitSet(new long[]{0x0000012860000740L});
	public static final BitSet FOLLOW_ring_in_start92 = new BitSet(new long[]{0x0000012860000740L});
	public static final BitSet FOLLOW_EOF_in_start101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring124 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_inner_ring_in_ring129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring167 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block195 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block201 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_comment_in_big_comment233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_comment270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_timeblock_comment307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock_comment316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_timeblock_comment319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock362 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock367 = new BitSet(new long[]{0x0000010860000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock381 = new BitSet(new long[]{0x0000010860000740L});
	public static final BitSet FOLLOW_DATE_in_timeblock388 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_INT_in_timeblock391 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock419 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock424 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock433 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring478 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring481 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring485 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring510 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_group_block547 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block550 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block555 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring583 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring586 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring590 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_synpred2_test79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred3_test87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_synpred5_test149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_block_in_synpred6_test167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_in_synpred7_test201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred22_test381 = new BitSet(new long[]{0x0000010860000740L});
	public static final BitSet FOLLOW_DATE_in_synpred22_test388 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_INT_in_synpred22_test391 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred22_test395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_synpred23_test419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_synpred24_test424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred25_test428 = new BitSet(new long[]{0x0000000000000002L});
}
