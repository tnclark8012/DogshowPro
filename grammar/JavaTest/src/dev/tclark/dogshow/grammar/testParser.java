// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-02-23 19:40:35

package dev.tclark.dogshow.grammar;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:22:1: start returns [JsonObject json] : ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray(); System.out.println("starting...");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:3: ( ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:4: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:4: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )* )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:5: (mComment= big_comment )+ ( ( ring )=>mRing= ring )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:5: (mComment= big_comment )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:6: mComment= big_comment
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:95: ( ( ring )=>mRing= ring )*
					loop3:
					do {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==RING_TITLE) && (synpred3_test())) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:96: ( ring )=>mRing= ring
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:26:1: ring returns [JsonObject json] : RING_TITLE inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		Token RING_TITLE1=null;

		json = new JsonObject();System.out.println("ring...");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:3: ( RING_TITLE inner_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:28:7: RING_TITLE inner_ring
			{
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring124); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Title", (RING_TITLE1!=null?RING_TITLE1.getText():null));}
			pushFollow(FOLLOW_inner_ring_in_ring126);
			inner_ring();
			state._fsp--;
			if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:29:1: inner_ring : ( ( group_block )=> group_block | ( judge_block )+ );
	public final void inner_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:2: ( ( group_block )=> group_block | ( judge_block )+ )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TIME) && (synpred5_test())) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:5: ( group_block )=> group_block
					{
					pushFollow(FOLLOW_group_block_in_inner_ring139);
					group_block();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:7: ( judge_block )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:7: ( judge_block )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:7: judge_block
							{
							pushFollow(FOLLOW_judge_block_in_inner_ring147);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:32:1: judge_block : JUDGE_NAME ( timeblock )+ ;
	public final void judge_block() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:5: ( JUDGE_NAME ( timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:9: JUDGE_NAME ( timeblock )+
			{
			match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_block161); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:20: ( timeblock )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:20: timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block163);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:35:1: big_comment returns [String str] : (mComment= comment | TIME | BREED_NAME ) ;
	public final String big_comment() throws RecognitionException {
		String str = null;


		Token TIME2=null;
		Token BREED_NAME3=null;
		String mComment =null;

		str = null;System.out.println("big_comment...");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:4: ( (mComment= comment | TIME | BREED_NAME ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:8: (mComment= comment | TIME | BREED_NAME )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:8: (mComment= comment | TIME | BREED_NAME )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:9: mComment= comment
					{
					pushFollow(FOLLOW_comment_in_big_comment193);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:47: TIME
					{
					TIME2=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment196); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME2!=null?TIME2.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:37:69: BREED_NAME
					{
					BREED_NAME3=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment199); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME3!=null?BREED_NAME3.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:38:1: comment returns [String str] : ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS ) ;
	public final String comment() throws RecognitionException {
		String str = null;


		Token COMMENT4=null;
		Token INT5=null;
		Token JUDGE_NAME6=null;
		Token DATE7=null;
		Token PHONE_NUMBER8=null;
		Token ELLIPSIS9=null;

		str = null;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:3: ( ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:7: ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:7: ( COMMENT | INT | JUDGE_NAME | DATE | PHONE_NUMBER | ELLIPSIS )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:8: COMMENT
					{
					COMMENT4=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment224); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT4!=null?COMMENT4.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:36: INT
					{
					INT5=(Token)match(input,INT,FOLLOW_INT_in_comment227); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT5!=null?INT5.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:56: JUDGE_NAME
					{
					JUDGE_NAME6=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_comment230); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(JUDGE_NAME6!=null?JUDGE_NAME6.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:90: DATE
					{
					DATE7=(Token)match(input,DATE,FOLLOW_DATE_in_comment233); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE7!=null?DATE7.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:112: PHONE_NUMBER
					{
					PHONE_NUMBER8=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment236); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER8!=null?PHONE_NUMBER8.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:40:150: ELLIPSIS
					{
					ELLIPSIS9=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment239); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS9!=null?ELLIPSIS9.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:41:1: timeblock_comment : ( COMMENT | INT | JUDGE_NAME | PHONE_NUMBER | ELLIPSIS | TIME | BREED_NAME ) ;
	public final void timeblock_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:42:2: ( ( COMMENT | INT | JUDGE_NAME | PHONE_NUMBER | ELLIPSIS | TIME | BREED_NAME ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
			{
			if ( input.LA(1)==BREED_NAME||input.LA(1)==COMMENT||input.LA(1)==ELLIPSIS||(input.LA(1) >= INT && input.LA(1) <= JUDGE_NAME)||input.LA(1)==PHONE_NUMBER||input.LA(1)==TIME ) {
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
	// $ANTLR end "timeblock_comment"



	// $ANTLR start "ring_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:43:1: ring_comment : STANDALONE_COMMENT ;
	public final void ring_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:44:5: ( STANDALONE_COMMENT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:44:9: STANDALONE_COMMENT
			{
			match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment276); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:1: timeblock : TIME inner_timeblock ( ( options {greedy=false; } : timeblock_comment )* DATE INT inner_timeblock )? ;
	public final void timeblock() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:13: ( TIME inner_timeblock ( ( options {greedy=false; } : timeblock_comment )* DATE INT inner_timeblock )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:17: TIME inner_timeblock ( ( options {greedy=false; } : timeblock_comment )* DATE INT inner_timeblock )?
			{
			match(input,TIME,FOLLOW_TIME_in_timeblock288); if (state.failed) return ;
			pushFollow(FOLLOW_inner_timeblock_in_timeblock290);
			inner_timeblock();
			state._fsp--;
			if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:38: ( ( options {greedy=false; } : timeblock_comment )* DATE INT inner_timeblock )?
			int alt11=2;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:39: ( options {greedy=false; } : timeblock_comment )* DATE INT inner_timeblock
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:39: ( options {greedy=false; } : timeblock_comment )*
					loop10:
					do {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==BREED_NAME||LA10_0==COMMENT||LA10_0==ELLIPSIS||(LA10_0 >= INT && LA10_0 <= JUDGE_NAME)||LA10_0==PHONE_NUMBER||LA10_0==TIME) ) {
							alt10=1;
						}
						else if ( (LA10_0==DATE) ) {
							alt10=2;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:64: timeblock_comment
							{
							pushFollow(FOLLOW_timeblock_comment_in_timeblock301);
							timeblock_comment();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop10;
						}
					} while (true);

					match(input,DATE,FOLLOW_DATE_in_timeblock305); if (state.failed) return ;
					match(input,INT,FOLLOW_INT_in_timeblock307); if (state.failed) return ;
					pushFollow(FOLLOW_inner_timeblock_in_timeblock309);
					inner_timeblock();
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



	// $ANTLR start "inner_timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:47:1: inner_timeblock : ( special_ring | junior_ring | ( breed_ring )=> breed_ring )* ( special_ring | junior_ring | breed_ring | ring_comment ) ;
	public final void inner_timeblock() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:2: ( ( special_ring | junior_ring | ( breed_ring )=> breed_ring )* ( special_ring | junior_ring | breed_ring | ring_comment ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:4: ( special_ring | junior_ring | ( breed_ring )=> breed_ring )* ( special_ring | junior_ring | breed_ring | ring_comment )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:4: ( special_ring | junior_ring | ( breed_ring )=> breed_ring )*
			loop12:
			do {
				int alt12=4;
				alt12 = dfa12.predict(input);
				switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:5: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_inner_timeblock320);
					special_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:18: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock322);
					junior_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:30: ( breed_ring )=> breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock328);
					breed_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop12;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:57: ( special_ring | junior_ring | breed_ring | ring_comment )
			int alt13=4;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==INT) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==BREED_NAME) ) {
					int LA13_3 = input.LA(3);
					if ( (LA13_3==SPECIAL_SUFFIX) ) {
						alt13=1;
					}
					else if ( (LA13_3==EOF||(LA13_3 >= BREED_COUNT && LA13_3 <= ELLIPSIS)||(LA13_3 >= INT && LA13_3 <= JUDGE_NAME)||LA13_3==PHONE_NUMBER||LA13_3==RING_TITLE||LA13_3==TIME) ) {
						alt13=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 13, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA13_1==JUNIOR_CLASS) ) {
					alt13=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA13_0==STANDALONE_COMMENT) ) {
				alt13=4;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:58: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_inner_timeblock333);
					special_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:71: junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock335);
					junior_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:83: breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock337);
					breed_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:94: ring_comment
					{
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock339);
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
	// $ANTLR end "inner_timeblock"



	// $ANTLR start "special_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:1: special_ring : INT BREED_NAME ( SPECIAL_SUFFIX )+ ;
	public final void special_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:13: ( INT BREED_NAME ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:17: INT BREED_NAME ( SPECIAL_SUFFIX )+
			{
			match(input,INT,FOLLOW_INT_in_special_ring348); if (state.failed) return ;
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring350); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:32: ( SPECIAL_SUFFIX )+
			int cnt14=0;
			loop14:
			do {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==SPECIAL_SUFFIX) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:49:32: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring352); if (state.failed) return ;
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(14, input);
						throw eee;
				}
				cnt14++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:1: junior_ring : INT JUNIOR_CLASS ;
	public final void junior_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:12: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:50:17: INT JUNIOR_CLASS
			{
			match(input,INT,FOLLOW_INT_in_junior_ring362); if (state.failed) return ;
			match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring364); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:52:1: group_ring : GROUP_RING ;
	public final void group_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:2: ( GROUP_RING )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:53:5: GROUP_RING
			{
			match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring374); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:54:1: group_block : TIME STANDALONE_COMMENT ( group_ring )+ ;
	public final void group_block() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:2: ( TIME STANDALONE_COMMENT ( group_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:4: TIME STANDALONE_COMMENT ( group_ring )+
			{
			match(input,TIME,FOLLOW_TIME_in_group_block382); if (state.failed) return ;
			match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block384); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:28: ( group_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:55:28: group_ring
					{
					pushFollow(FOLLOW_group_ring_in_group_block386);
					group_ring();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(15, input);
						throw eee;
				}
				cnt15++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:56:1: breed_ring : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final void breed_ring() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:57:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:57:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			match(input,INT,FOLLOW_INT_in_breed_ring400); if (state.failed) return ;
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring402); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:57:24: ( BREED_NAME_SUFFIX )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BREED_NAME_SUFFIX) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:57:24: BREED_NAME_SUFFIX
					{
					match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring404); if (state.failed) return ;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:57:43: ( BREED_COUNT )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BREED_COUNT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:57:43: BREED_COUNT
					{
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring407); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:58:1: breed_name : BREED_NAME BREED_NAME_SUFFIX ;
	public final void breed_name() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:5: ( BREED_NAME BREED_NAME_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:59:9: BREED_NAME BREED_NAME_SUFFIX
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name421); if (state.failed) return ;
			match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name423); if (state.failed) return ;
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
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:6: (mComment= big_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:6: mComment= big_comment
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:96: ( ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:24:97: ring
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:5: ( group_block )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:30:6: group_block
		{
		pushFollow(FOLLOW_group_block_in_synpred5_test136);
		group_block();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred5_test

	// $ANTLR start synpred6_test
	public final void synpred6_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:7: ( judge_block )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:31:7: judge_block
		{
		pushFollow(FOLLOW_judge_block_in_synpred6_test147);
		judge_block();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred6_test

	// $ANTLR start synpred7_test
	public final void synpred7_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:20: ( timeblock )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:33:20: timeblock
		{
		pushFollow(FOLLOW_timeblock_in_synpred7_test163);
		timeblock();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred7_test

	// $ANTLR start synpred22_test
	public final void synpred22_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:39: ( ( options {greedy=false; } : timeblock_comment )* DATE INT inner_timeblock )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:39: ( options {greedy=false; } : timeblock_comment )* DATE INT inner_timeblock
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:39: ( options {greedy=false; } : timeblock_comment )*
		loop20:
		do {
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==BREED_NAME||LA20_0==COMMENT||LA20_0==ELLIPSIS||(LA20_0 >= INT && LA20_0 <= JUDGE_NAME)||LA20_0==PHONE_NUMBER||LA20_0==TIME) ) {
				alt20=1;
			}
			else if ( (LA20_0==DATE) ) {
				alt20=2;
			}

			switch (alt20) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:46:64: timeblock_comment
				{
				pushFollow(FOLLOW_timeblock_comment_in_synpred22_test301);
				timeblock_comment();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				break loop20;
			}
		} while (true);

		match(input,DATE,FOLLOW_DATE_in_synpred22_test305); if (state.failed) return ;
		match(input,INT,FOLLOW_INT_in_synpred22_test307); if (state.failed) return ;
		pushFollow(FOLLOW_inner_timeblock_in_synpred22_test309);
		inner_timeblock();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred22_test

	// $ANTLR start synpred23_test
	public final void synpred23_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:5: ( special_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:5: special_ring
		{
		pushFollow(FOLLOW_special_ring_in_synpred23_test320);
		special_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred23_test

	// $ANTLR start synpred24_test
	public final void synpred24_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:18: ( junior_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:18: junior_ring
		{
		pushFollow(FOLLOW_junior_ring_in_synpred24_test322);
		junior_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred24_test

	// $ANTLR start synpred25_test
	public final void synpred25_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:30: ( breed_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:48:31: breed_ring
		{
		pushFollow(FOLLOW_breed_ring_in_synpred25_test325);
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


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA11_eotS =
		"\25\uffff";
	static final String DFA11_eofS =
		"\3\3\1\uffff\14\3\1\uffff\1\3\3\uffff";
	static final String DFA11_minS =
		"\3\6\1\uffff\14\6\1\uffff\1\6\3\0";
	static final String DFA11_maxS =
		"\3\50\1\uffff\14\50\1\uffff\1\50\3\0";
	static final String DFA11_acceptS =
		"\3\uffff\1\2\14\uffff\1\1\4\uffff";
	static final String DFA11_specialS =
		"\22\uffff\1\1\1\0\1\2}>";
	static final String[] DFA11_transitionS = {
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\5\4\uffff\1\6\1\uffff\1\3\2"+
			"\uffff\1\10",
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\12\4\uffff\1\6\1\uffff\1\3"+
			"\2\uffff\1\13",
			"\1\3\1\uffff\3\3\22\uffff\1\14\1\3\4\uffff\1\3\1\uffff\1\3\2\uffff\1"+
			"\3",
			"",
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\12\4\uffff\1\6\1\uffff\1\3"+
			"\2\uffff\1\13",
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\12\4\uffff\1\6\1\uffff\1\3"+
			"\2\uffff\1\15",
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\12\4\uffff\1\6\1\uffff\1\3"+
			"\2\uffff\1\13",
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\12\4\uffff\1\6\1\uffff\1\3"+
			"\2\uffff\1\13",
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\16\1\12\4\uffff\1\6\1\uffff\1\3"+
			"\1\uffff\1\3\1\13",
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\12\4\uffff\1\6\1\uffff\1\3"+
			"\2\uffff\1\13",
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\12\4\uffff\1\6\1\uffff\1\3"+
			"\2\uffff\1\13",
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\12\4\uffff\1\6\1\uffff\1\3"+
			"\2\uffff\1\13",
			"\1\3\1\uffff\3\3\22\uffff\1\17\1\3\4\uffff\1\3\1\uffff\1\3\1\uffff\1"+
			"\20\1\3",
			"\1\11\1\uffff\1\1\1\2\1\7\22\uffff\1\21\1\12\4\uffff\1\6\1\uffff\1\3"+
			"\1\uffff\1\3\1\13",
			"\1\22\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\12\1\3\3\uffff\1\6\1\uffff"+
			"\1\3\2\uffff\1\13",
			"\1\23\1\uffff\3\3\22\uffff\2\3\1\20\3\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\1\3",
			"",
			"\1\24\1\uffff\1\1\1\2\1\7\22\uffff\1\4\1\12\1\3\3\uffff\1\6\1\uffff"+
			"\1\3\2\uffff\1\13",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
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
			return "46:38: ( ( options {greedy=false; } : timeblock_comment )* DATE INT inner_timeblock )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_19 = input.LA(1);
						 
						int index11_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred22_test()) ) {s = 16;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index11_19);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA11_18 = input.LA(1);
						 
						int index11_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred22_test()) ) {s = 16;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index11_18);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA11_20 = input.LA(1);
						 
						int index11_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred22_test()) ) {s = 16;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index11_20);
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

	static final String DFA12_eotS =
		"\22\uffff";
	static final String DFA12_eofS =
		"\3\uffff\6\2\1\uffff\1\2\1\uffff\1\2\5\uffff";
	static final String DFA12_minS =
		"\1\35\1\6\1\uffff\1\5\2\6\1\5\2\6\1\uffff\1\6\1\uffff\1\6\1\uffff\1\0"+
		"\1\uffff\2\0";
	static final String DFA12_maxS =
		"\1\47\1\37\1\uffff\6\50\1\uffff\1\50\1\uffff\1\50\1\uffff\1\0\1\uffff"+
		"\2\0";
	static final String DFA12_acceptS =
		"\2\uffff\1\4\6\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff\1\3\2\uffff";
	static final String DFA12_specialS =
		"\3\uffff\1\2\2\uffff\1\0\1\5\1\3\5\uffff\1\1\1\uffff\1\4\1\6}>";
	static final String[] DFA12_transitionS = {
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
			return "()* loopback of 48:4: ( special_ring | junior_ring | ( breed_ring )=> breed_ring )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_6 = input.LA(1);
						 
						int index12_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA12_6==BREED_COUNT) ) {s = 7;}
						else if ( (LA12_6==EOF||LA12_6==BREED_NAME||(LA12_6 >= COMMENT && LA12_6 <= ELLIPSIS)||LA12_6==JUDGE_NAME||LA12_6==PHONE_NUMBER||LA12_6==RING_TITLE||LA12_6==TIME) ) {s = 2;}
						else if ( (LA12_6==INT) ) {s = 8;}
						else if ( (LA12_6==STANDALONE_COMMENT) && (synpred25_test())) {s = 9;}
						 
						input.seek(index12_6);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_14 = input.LA(1);
						 
						int index12_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred25_test()) ) {s = 15;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index12_14);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA12_3 = input.LA(1);
						 
						int index12_3 = input.index();
						input.rewind();
						s = -1;
						if ( (LA12_3==SPECIAL_SUFFIX) ) {s = 5;}
						else if ( (LA12_3==BREED_NAME_SUFFIX) ) {s = 6;}
						else if ( (LA12_3==BREED_COUNT) ) {s = 7;}
						else if ( (LA12_3==EOF||LA12_3==BREED_NAME||(LA12_3 >= COMMENT && LA12_3 <= ELLIPSIS)||LA12_3==JUDGE_NAME||LA12_3==PHONE_NUMBER||LA12_3==RING_TITLE||LA12_3==TIME) ) {s = 2;}
						else if ( (LA12_3==INT) ) {s = 8;}
						else if ( (LA12_3==STANDALONE_COMMENT) && (synpred25_test())) {s = 9;}
						 
						input.seek(index12_3);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA12_8 = input.LA(1);
						 
						int index12_8 = input.index();
						input.rewind();
						s = -1;
						if ( (LA12_8==BREED_NAME) ) {s = 14;}
						else if ( (LA12_8==JUNIOR_CLASS) && (synpred25_test())) {s = 15;}
						else if ( (LA12_8==EOF||(LA12_8 >= COMMENT && LA12_8 <= ELLIPSIS)||(LA12_8 >= INT && LA12_8 <= JUDGE_NAME)||LA12_8==PHONE_NUMBER||LA12_8==RING_TITLE||LA12_8==TIME) ) {s = 2;}
						 
						input.seek(index12_8);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA12_16 = input.LA(1);
						 
						int index12_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred24_test()) ) {s = 11;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index12_16);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA12_7 = input.LA(1);
						 
						int index12_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA12_7==EOF||LA12_7==BREED_NAME||(LA12_7 >= COMMENT && LA12_7 <= ELLIPSIS)||LA12_7==JUDGE_NAME||LA12_7==PHONE_NUMBER||LA12_7==RING_TITLE||LA12_7==TIME) ) {s = 2;}
						else if ( (LA12_7==INT) ) {s = 8;}
						else if ( (LA12_7==STANDALONE_COMMENT) && (synpred25_test())) {s = 9;}
						 
						input.seek(index12_7);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA12_17 = input.LA(1);
						 
						int index12_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred23_test()) ) {s = 13;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index12_17);
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

	public static final BitSet FOLLOW_special_ring_in_test_special40 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start79 = new BitSet(new long[]{0x0000012860000740L});
	public static final BitSet FOLLOW_ring_in_start92 = new BitSet(new long[]{0x0000012860000740L});
	public static final BitSet FOLLOW_EOF_in_start101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring124 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_inner_ring_in_ring126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring147 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_block161 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block163 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_comment_in_big_comment193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_comment230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock288 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock290 = new BitSet(new long[]{0x0000010860000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock301 = new BitSet(new long[]{0x0000010860000740L});
	public static final BitSet FOLLOW_DATE_in_timeblock305 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_INT_in_timeblock307 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock320 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock322 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock328 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring348 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring350 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring352 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring362 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_group_block382 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block384 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block386 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring400 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring402 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring404 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name421 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_synpred2_test79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred3_test87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_synpred5_test136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_block_in_synpred6_test147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_in_synpred7_test163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred22_test301 = new BitSet(new long[]{0x0000010860000740L});
	public static final BitSet FOLLOW_DATE_in_synpred22_test305 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_INT_in_synpred22_test307 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred22_test309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_synpred23_test320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_synpred24_test322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred25_test325 = new BitSet(new long[]{0x0000000000000002L});
}
