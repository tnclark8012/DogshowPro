// $ANTLR null C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-11-09 18:04:40

//TODO Puppy groups
package dev.tclark.dogshow.grammar;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.regex.Pattern;          
import java.util.regex.Matcher;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class testParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREED_COUNT", "BREED_MISC", "BREED_NAME", 
		"BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", 
		"END_WORD", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", 
		"FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_GROUP_NAME", 
		"FRAG_MONTH", "FRAG_PROPER_NAME", "FRAG_RALLY_CLASS_NAME", "FRAG_RALLY_CLASS_SECTION", 
		"FRAG_RALLY_ENTRANT_GROUP", "FRAG_RALLY_SINGLE_ENTRANT", "FRAG_RING", 
		"FRAG_SPECIAL_GROUP_NAME", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", 
		"FRAG_TITLE", "FRAG_TO_FOLLOW", "FRAG_WEEK_DAY", "FallThrough", "GROUP_RING", 
		"INT", "JUDGE_NAME", "JUNIOR_CLASS", "NON_CONFORMATION_CLASS_LEVEL", "NON_CONFORMATION_CLASS_NAME", 
		"NON_CONFORMATION_CLASS_SECTION", "NON_CONFORMATION_CLASS_SUFFIX", "NON_CONFORMATION_SECOND_LINE", 
		"NON_CONF_SECOND_LINE_COMMENT", "PARENTHETICAL", "PARENTHETICAL_INT", 
		"PARENTHETICAL_NAME", "PHONE_NUMBER", "RALLY_CLASS", "RALLY_ENTRY", "RING_TITLE", 
		"SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
	};
	public static final int EOF=-1;
	public static final int BREED_COUNT=4;
	public static final int BREED_MISC=5;
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
	public static final int FRAG_RALLY_CLASS_NAME=21;
	public static final int FRAG_RALLY_CLASS_SECTION=22;
	public static final int FRAG_RALLY_ENTRANT_GROUP=23;
	public static final int FRAG_RALLY_SINGLE_ENTRANT=24;
	public static final int FRAG_RING=25;
	public static final int FRAG_SPECIAL_GROUP_NAME=26;
	public static final int FRAG_SPEC_CHAR=27;
	public static final int FRAG_SPEC_WORD_CHAR=28;
	public static final int FRAG_TIME_LABEL=29;
	public static final int FRAG_TITLE=30;
	public static final int FRAG_TO_FOLLOW=31;
	public static final int FRAG_WEEK_DAY=32;
	public static final int FallThrough=33;
	public static final int GROUP_RING=34;
	public static final int INT=35;
	public static final int JUDGE_NAME=36;
	public static final int JUNIOR_CLASS=37;
	public static final int NON_CONFORMATION_CLASS_LEVEL=38;
	public static final int NON_CONFORMATION_CLASS_NAME=39;
	public static final int NON_CONFORMATION_CLASS_SECTION=40;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=41;
	public static final int NON_CONFORMATION_SECOND_LINE=42;
	public static final int NON_CONF_SECOND_LINE_COMMENT=43;
	public static final int PARENTHETICAL=44;
	public static final int PARENTHETICAL_INT=45;
	public static final int PARENTHETICAL_NAME=46;
	public static final int PHONE_NUMBER=47;
	public static final int RALLY_CLASS=48;
	public static final int RALLY_ENTRY=49;
	public static final int RING_TITLE=50;
	public static final int SPECIAL_SUFFIX=51;
	public static final int STANDALONE_COMMENT=52;
	public static final int TIME=53;
	public static final int WORD=54;
	public static final int WS=55;

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


	String currentBlockTime = null;
	boolean debug = false;

	// Non-relational style objects for better JSON
	public boolean mRelational = true;
	JsonArray mShowRings = new JsonArray();
	String mCurrentJudge = null;
	int mCurrentRingNumber = -1;
	String mLastBreedName = null;
	// end non-relational

	public void setRelationalParse(boolean value)
	{
		mRelational = value;
	}


	Pattern lastIntPattern = Pattern.compile("[^0-9]+([0-9]+)$");
	Pattern groupPattern = Pattern.compile("((?:(?:TERRIER|HERDING|NON-SPORTING|SPORTING|TOY|HOUND|WORKING) GROUP)|(?:BEST IN SHOW)) - (.*)");

	  
	  private boolean ahead(String text) {
	    System.out.println("Does " + input.toString() + " contain " + text + "?");
	    return input.toString().contains(text);
	  }
	  
	  private int parseIntSafely(String str, int defaultValue){
	  	try{
	  		return Integer.parseInt(str);
	  	}
	  	catch(NumberFormatException nfe)
	  	{
	  		return defaultValue;
	  	}
	  }
	  
	  private int parseRingNumber(String ringTitle)
	  {
		Matcher matcher = lastIntPattern.matcher(ringTitle);
		if (matcher.find()) {
			String someNumberStr = matcher.group(1);
			return Integer.parseInt(someNumberStr);
		}
		return -1;
	  }
	  
		private int[] parseBreedCount(String count)
		{//No for loop, like a boss
			int [] array = new int [4];
			String[] split = count.split("-");
			array[0] = parseIntSafely(split[0],0);
			array[1] = parseIntSafely(split[1],0);
			array[2] = parseIntSafely(split[2],0);
			array[3] = parseIntSafely(split[3],0);
			return array;
		}
		
		private String[] parseGroupRing(String groupRing)
		{
			String[] judgeAndGroup = new String[2];
			Matcher m = groupPattern.matcher(groupRing);
			if(m.find())
			{
				judgeAndGroup[0] = m.group(1);
				judgeAndGroup[1] = m.group(2);
			}
			return judgeAndGroup;
		}
		/**
		* adds the individual counts to the json, returns the total
		*/
		private int addBreedCountToJson(JsonObject json, String count)
		{
			int [] countArray = parseBreedCount(count);
			json.addProperty("DogCount", countArray[0]);
			json.addProperty("BitchCount", countArray[1]);
			json.addProperty("SpecialDogCount", countArray[2]);
			json.addProperty("SpecialBitchCount", countArray[3]);
			return countArray[0]+countArray[1]+countArray[2]+countArray[3];
		}
		/**
		* Is breedName is a veteran entry?
		*/
		private boolean isVeteran(String breedName)
		{
			return breedName.contains("Veteran");
		}
		
		/**
		* Is breed name if breedName is a sweepsatakes entry?
		*/
		private boolean isSweepstakes(String breedName)
		{
			return breedName.contains("Sweepstakes");
		}
	  
	  



	// $ANTLR start "test_special"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:1: test_special : ( special_ring )+ ;
	public final void test_special() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:13: ( ( special_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:17: ( special_ring )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:17: ( special_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:17: special_ring
					{
					pushFollow(FOLLOW_special_ring_in_test_special47);
					special_ring();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:122:1: test_breed : breed_ring ;
	public final void test_breed() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:123:5: ( breed_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:123:9: breed_ring
			{
			pushFollow(FOLLOW_breed_ring_in_test_breed61);
			breed_ring();
			state._fsp--;
			if (state.failed) return;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:124:1: start returns [JsonObject json] : (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:3: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:4: (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:4: (mComment= big_comment )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BREED_NAME||(LA2_0 >= COMMENT && LA2_0 <= ELLIPSIS)||(LA2_0 >= GROUP_RING && LA2_0 <= INT)||LA2_0==PARENTHETICAL||LA2_0==PHONE_NUMBER||LA2_0==SPECIAL_SUFFIX||LA2_0==TIME) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:5: mComment= big_comment
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
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			if ( state.backtracking==0 ) {json.addProperty("Comment", comments);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:94: ( ( ring )=>mRing= ring )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==RING_TITLE) && (synpred3_test())) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:95: ( ring )=>mRing= ring
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
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			if ( state.backtracking==0 ) {json.add("Rings", ringArray); if(!mRelational){json = new JsonObject(); json.add("Rings", mShowRings);}}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:129:1: ring returns [JsonObject json] : RING_TITLE mRing= inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		Token RING_TITLE1=null;
		JsonObject mRing =null;

		json = new JsonObject();if(debug){System.out.println("ring...");}
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:131:3: ( RING_TITLE mRing= inner_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:131:7: RING_TITLE mRing= inner_ring
			{
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring131); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Title", (RING_TITLE1!=null?RING_TITLE1.getText():null)); json.addProperty("Number", parseRingNumber((RING_TITLE1!=null?RING_TITLE1.getText():null)));if(!mRelational){mCurrentRingNumber=parseRingNumber((RING_TITLE1!=null?RING_TITLE1.getText():null));}}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:132:1: inner_ring returns [JsonObject json] : ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJugeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:2: ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TIME) ) {
				alt6=1;
			}
			else if ( (LA6_0==COMMENT||LA6_0==JUDGE_NAME||LA6_0==PARENTHETICAL) ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:6: ( group_block )=>mGroupBlock= group_block ( comment )*
					{
					pushFollow(FOLLOW_group_block_in_inner_ring162);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:82: ( comment )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= COMMENT && LA4_0 <= ELLIPSIS)||LA4_0==INT||LA4_0==PARENTHETICAL||LA4_0==PHONE_NUMBER||LA4_0==TIME) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:82: comment
							{
							pushFollow(FOLLOW_comment_in_inner_ring165);
							comment();
							state._fsp--;
							if (state.failed) return json;
							}
							break;

						default :
							break loop4;
						}
					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:7: ( (mJugeBlock= judge_block )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:7: ( (mJugeBlock= judge_block )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:8: (mJugeBlock= judge_block )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:8: (mJugeBlock= judge_block )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMENT||LA5_0==JUDGE_NAME||LA5_0==PARENTHETICAL) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:9: mJugeBlock= judge_block
							{
							pushFollow(FOLLOW_judge_block_in_inner_ring179);
							mJugeBlock=judge_block();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {judgeBlocks.add(mJugeBlock);}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							if (state.backtracking>0) {state.failed=true; return json;}
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:136:1: judge_block returns [JsonObject json] : mName= judge_name (mBlock= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		String mName =null;
		JsonObject mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:5: (mName= judge_name (mBlock= timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:9: mName= judge_name (mBlock= timeblock )+
			{
			pushFollow(FOLLOW_judge_name_in_judge_block209);
			mName=judge_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Judge", mName); if(!mRelational){mCurrentJudge = mName;}}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:102: (mBlock= timeblock )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==TIME) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:103: mBlock= timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block215);
					mBlock=timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {array.add(mBlock);}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return json;}
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

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



	// $ANTLR start "judge_name"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:139:1: judge_name returns [String str] : ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL )+ );
	public final String judge_name() throws RecognitionException {
		String str = null;


		Token JUDGE_NAME2=null;

		str = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:2: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL )+ )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==JUDGE_NAME) ) {
				alt10=1;
			}
			else if ( (LA10_0==COMMENT||LA10_0==PARENTHETICAL) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:4: ( JUDGE_NAME )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:4: ( JUDGE_NAME )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==JUDGE_NAME) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:5: JUDGE_NAME
							{
							JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_name239); if (state.failed) return str;
							if ( state.backtracking==0 ) {str=(JUDGE_NAME2!=null?JUDGE_NAME2.getText():null);}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return str;}
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:41: ( COMMENT | PARENTHETICAL )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:41: ( COMMENT | PARENTHETICAL )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMENT||LA9_0==PARENTHETICAL) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
							{
							if ( input.LA(1)==COMMENT||input.LA(1)==PARENTHETICAL ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return str;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							if (state.backtracking>0) {state.failed=true; return str;}
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
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
		return str;
	}
	// $ANTLR end "judge_name"



	// $ANTLR start "big_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:142:1: big_comment returns [String str] : (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) ;
	public final String big_comment() throws RecognitionException {
		String str = null;


		Token TIME3=null;
		Token PHONE_NUMBER4=null;
		Token BREED_NAME5=null;
		Token SPECIAL_SUFFIX6=null;
		Token GROUP_RING7=null;
		String mComment =null;

		str = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:3: ( (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			int alt11=6;
			switch ( input.LA(1) ) {
			case TIME:
				{
				int LA11_1 = input.LA(2);
				if ( (synpred13_test()) ) {
					alt11=1;
				}
				else if ( (synpred14_test()) ) {
					alt11=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COMMENT:
			case DATE:
			case ELLIPSIS:
			case INT:
			case PARENTHETICAL:
				{
				alt11=1;
				}
				break;
			case PHONE_NUMBER:
				{
				int LA11_3 = input.LA(2);
				if ( (synpred13_test()) ) {
					alt11=1;
				}
				else if ( (synpred15_test()) ) {
					alt11=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BREED_NAME:
				{
				alt11=4;
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt11=5;
				}
				break;
			case GROUP_RING:
				{
				alt11=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:8: mComment= comment
					{
					pushFollow(FOLLOW_comment_in_big_comment275);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:42: TIME
					{
					TIME3=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment278); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME3!=null?TIME3.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:64: PHONE_NUMBER
					{
					PHONE_NUMBER4=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_big_comment281); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER4!=null?PHONE_NUMBER4.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:102: BREED_NAME
					{
					BREED_NAME5=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment284); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME5!=null?BREED_NAME5.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:136: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX6=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment287); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX6!=null?SPECIAL_SUFFIX6.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:178: GROUP_RING
					{
					GROUP_RING7=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment290); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_RING7!=null?GROUP_RING7.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:146:1: comment returns [String str] : ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER ) ;
	public final String comment() throws RecognitionException {
		String str = null;


		Token TIME8=null;
		Token COMMENT9=null;
		Token PARENTHETICAL10=null;
		Token INT11=null;
		Token ELLIPSIS12=null;
		Token DATE13=null;
		Token PHONE_NUMBER14=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:3: ( ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:5: ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:5: ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER )
			int alt12=7;
			switch ( input.LA(1) ) {
			case TIME:
				{
				alt12=1;
				}
				break;
			case COMMENT:
				{
				alt12=2;
				}
				break;
			case PARENTHETICAL:
				{
				alt12=3;
				}
				break;
			case INT:
				{
				alt12=4;
				}
				break;
			case ELLIPSIS:
				{
				alt12=5;
				}
				break;
			case DATE:
				{
				alt12=6;
				}
				break;
			case PHONE_NUMBER:
				{
				alt12=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:6: TIME
					{
					TIME8=(Token)match(input,TIME,FOLLOW_TIME_in_comment313); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME8!=null?TIME8.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:28: COMMENT
					{
					COMMENT9=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment316); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT9!=null?COMMENT9.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:56: PARENTHETICAL
					{
					PARENTHETICAL10=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment319); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL10!=null?PARENTHETICAL10.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:96: INT
					{
					INT11=(Token)match(input,INT,FOLLOW_INT_in_comment322); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT11!=null?INT11.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:116: ELLIPSIS
					{
					ELLIPSIS12=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment325); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS12!=null?ELLIPSIS12.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:146: DATE
					{
					DATE13=(Token)match(input,DATE,FOLLOW_DATE_in_comment328); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE13!=null?DATE13.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:168: PHONE_NUMBER
					{
					PHONE_NUMBER14=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment331); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER14!=null?PHONE_NUMBER14.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:149:1: timeblock_comment returns [String str] : ( COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX ) ;
	public final String timeblock_comment() throws RecognitionException {
		String str = null;


		Token COMMENT15=null;
		Token PARENTHETICAL16=null;
		Token INT17=null;
		Token ELLIPSIS18=null;
		Token DATE19=null;
		Token PHONE_NUMBER20=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:3: ( ( COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:5: ( COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:5: ( COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX )
			int alt13=7;
			switch ( input.LA(1) ) {
			case COMMENT:
				{
				alt13=1;
				}
				break;
			case PARENTHETICAL:
				{
				alt13=2;
				}
				break;
			case INT:
				{
				alt13=3;
				}
				break;
			case ELLIPSIS:
				{
				alt13=4;
				}
				break;
			case DATE:
				{
				alt13=5;
				}
				break;
			case PHONE_NUMBER:
				{
				alt13=6;
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt13=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:6: COMMENT
					{
					COMMENT15=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment353); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT15!=null?COMMENT15.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:34: PARENTHETICAL
					{
					PARENTHETICAL16=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_timeblock_comment356); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL16!=null?PARENTHETICAL16.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:74: INT
					{
					INT17=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment359); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT17!=null?INT17.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:94: ELLIPSIS
					{
					ELLIPSIS18=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment362); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS18!=null?ELLIPSIS18.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:124: DATE
					{
					DATE19=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock_comment365); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE19!=null?DATE19.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:146: PHONE_NUMBER
					{
					PHONE_NUMBER20=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment368); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER20!=null?PHONE_NUMBER20.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:184: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment371); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:154:1: ring_comment returns [String str] : ( STANDALONE_COMMENT | timeblock_comment );
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT21=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:5: ( STANDALONE_COMMENT | timeblock_comment )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==STANDALONE_COMMENT) ) {
				alt14=1;
			}
			else if ( ((LA14_0 >= COMMENT && LA14_0 <= ELLIPSIS)||LA14_0==INT||LA14_0==PARENTHETICAL||LA14_0==PHONE_NUMBER||LA14_0==SPECIAL_SUFFIX) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:9: STANDALONE_COMMENT
					{
					STANDALONE_COMMENT21=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment393); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT21!=null?STANDALONE_COMMENT21.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:59: timeblock_comment
					{
					pushFollow(FOLLOW_timeblock_comment_in_ring_comment396);
					timeblock_comment();
					state._fsp--;
					if (state.failed) return str;
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
		return str;
	}
	// $ANTLR end "ring_comment"



	// $ANTLR start "timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:157:1: timeblock returns [JsonObject json] : ( TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )* ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token TIME22=null;
		JsonArray rings =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; String time = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:2: ( ( TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:4: ( TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )*
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:4: ( TIME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:5: TIME
			{
			TIME22=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock418); if (state.failed) return json;
			if ( state.backtracking==0 ) {currentBlockTime=(TIME22!=null?TIME22.getText():null);json.addProperty("Time", currentBlockTime);}
			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:84: (rings= inner_timeblock (mComment= timeblock_comment )* )*
			loop16:
			while (true) {
				int alt16=2;
				switch ( input.LA(1) ) {
				case COMMENT:
					{
					int LA16_2 = input.LA(2);
					if ( (synpred32_test()) ) {
						alt16=1;
					}

					}
					break;
				case DATE:
				case ELLIPSIS:
				case INT:
				case NON_CONF_SECOND_LINE_COMMENT:
				case PHONE_NUMBER:
				case RALLY_CLASS:
				case SPECIAL_SUFFIX:
				case STANDALONE_COMMENT:
					{
					alt16=1;
					}
					break;
				case PARENTHETICAL:
					{
					int LA16_4 = input.LA(2);
					if ( (synpred32_test()) ) {
						alt16=1;
					}

					}
					break;
				}
				switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:85: rings= inner_timeblock (mComment= timeblock_comment )*
					{
					pushFollow(FOLLOW_inner_timeblock_in_timeblock425);
					rings=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {if(json.has("Rings")){JsonArray already=json.getAsJsonArray("Rings");already.addAll(rings);json.add("Rings",already);}else{json.add("Rings", rings);}}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:258: (mComment= timeblock_comment )*
					loop15:
					while (true) {
						int alt15=2;
						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA15_2 = input.LA(2);
							if ( (synpred31_test()) ) {
								alt15=1;
							}

							}
							break;
						case INT:
							{
							int LA15_3 = input.LA(2);
							if ( (synpred31_test()) ) {
								alt15=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA15_4 = input.LA(2);
							if ( (synpred31_test()) ) {
								alt15=1;
							}

							}
							break;
						case ELLIPSIS:
							{
							int LA15_5 = input.LA(2);
							if ( (synpred31_test()) ) {
								alt15=1;
							}

							}
							break;
						case DATE:
							{
							int LA15_6 = input.LA(2);
							if ( (synpred31_test()) ) {
								alt15=1;
							}

							}
							break;
						case PHONE_NUMBER:
							{
							int LA15_7 = input.LA(2);
							if ( (synpred31_test()) ) {
								alt15=1;
							}

							}
							break;
						case SPECIAL_SUFFIX:
							{
							int LA15_8 = input.LA(2);
							if ( (synpred31_test()) ) {
								alt15=1;
							}

							}
							break;
						}
						switch (alt15) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:259: mComment= timeblock_comment
							{
							pushFollow(FOLLOW_timeblock_comment_in_timeblock431);
							mComment=timeblock_comment();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {comment+=mComment;}
							}
							break;

						default :
							break loop15;
						}
					}

					if ( state.backtracking==0 ) {if(!comment.equals("")){json.add("timeblock_comment",new JsonPrimitive(comment));}}
					}
					break;

				default :
					break loop16;
				}
			}

			if ( state.backtracking==0 ) {if(!mRelational&&json.has("Rings")){mShowRings.addAll(json.getAsJsonArray("Rings"));}}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:160:1: inner_timeblock returns [JsonArray array] : (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mSpecialRing =null;
		JsonObject mJuniorRing =null;
		JsonObject mBreedRing =null;
		JsonObject mConformation =null;
		JsonObject mRallyRing =null;

		array = new JsonArray();int countAhead = 0;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:2: ( (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=7;
				switch ( input.LA(1) ) {
				case COMMENT:
					{
					int LA17_1 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt17=6;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA17_2 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt17=6;
					}

					}
					break;
				case INT:
					{
					int LA17_3 = input.LA(2);
					if ( (synpred33_test()) ) {
						alt17=1;
					}
					else if ( (synpred34_test()) ) {
						alt17=2;
					}
					else if ( (synpred36_test()) ) {
						alt17=3;
					}
					else if ( (synpred37_test()) ) {
						alt17=4;
					}
					else if ( (synpred38_test()) ) {
						alt17=5;
					}
					else if ( (synpred39_test()) ) {
						alt17=6;
					}

					}
					break;
				case ELLIPSIS:
					{
					int LA17_4 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt17=6;
					}

					}
					break;
				case DATE:
					{
					int LA17_5 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt17=6;
					}

					}
					break;
				case PHONE_NUMBER:
					{
					int LA17_6 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt17=6;
					}

					}
					break;
				case SPECIAL_SUFFIX:
					{
					int LA17_7 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt17=6;
					}

					}
					break;
				case NON_CONF_SECOND_LINE_COMMENT:
					{
					int LA17_9 = input.LA(2);
					if ( (synpred38_test()) ) {
						alt17=5;
					}

					}
					break;
				case RALLY_CLASS:
					{
					int LA17_10 = input.LA(2);
					if ( (synpred38_test()) ) {
						alt17=5;
					}

					}
					break;
				case STANDALONE_COMMENT:
					{
					int LA17_11 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt17=6;
					}

					}
					break;
				}
				switch (alt17) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: mSpecialRing= special_ring
					{
					pushFollow(FOLLOW_special_ring_in_inner_timeblock459);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {mSpecialRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mSpecialRing.get("Count").getAsInt();array.add(mSpecialRing);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:167: mJuniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock464);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {mJuniorRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mJuniorRing.get("Count").getAsInt();array.add(mJuniorRing);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:324: ( ( breed_ring )=>mBreedRing= breed_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:324: ( ( breed_ring )=>mBreedRing= breed_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:325: ( breed_ring )=>mBreedRing= breed_ring
					{
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock474);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {mBreedRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mBreedRing.get("Count").getAsInt();array.add(mBreedRing);}
					}

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:492: (mConformation= non_conformation_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:492: (mConformation= non_conformation_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:493: mConformation= non_conformation_ring
					{
					pushFollow(FOLLOW_non_conformation_ring_in_inner_timeblock481);
					mConformation=non_conformation_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mConformation);}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:557: (mRallyRing= rally_ring_block )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:557: (mRallyRing= rally_ring_block )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:558: mRallyRing= rally_ring_block
					{
					pushFollow(FOLLOW_rally_ring_block_in_inner_timeblock488);
					mRallyRing=rally_ring_block();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {array.add(mRallyRing);}
					}

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:611: ( ring_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:611: ( ring_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:612: ring_comment
					{
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock493);
					ring_comment();
					state._fsp--;
					if (state.failed) return array;
					}

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return array;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
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



	// $ANTLR start "junior_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:164:1: junior_ring returns [JsonObject json] : INT JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT23=null;
		Token JUNIOR_CLASS24=null;

		json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:166:2: ( INT JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:166:7: INT JUNIOR_CLASS
			{
			INT23=(Token)match(input,INT,FOLLOW_INT_in_junior_ring517); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count",parseIntSafely((INT23!=null?INT23.getText():null), 0));}
			JUNIOR_CLASS24=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring520); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("ClassName", (JUNIOR_CLASS24!=null?JUNIOR_CLASS24.getText():null));}
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



	// $ANTLR start "special_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:167:1: special_ring returns [JsonObject json] : INT ( BREED_NAME )? ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT25=null;
		Token BREED_NAME26=null;
		Token SPECIAL_SUFFIX27=null;

		json = new JsonObject(); String suffix = ""; json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:2: ( INT ( BREED_NAME )? ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:6: INT ( BREED_NAME )? ( SPECIAL_SUFFIX )+
			{
			INT25=(Token)match(input,INT,FOLLOW_INT_in_special_ring541); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count", parseIntSafely((INT25!=null?INT25.getText():null), 0));}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:68: ( BREED_NAME )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==BREED_NAME) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:69: BREED_NAME
					{
					BREED_NAME26=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring545); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName+=(BREED_NAME26!=null?BREED_NAME26.getText():null);}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:112: ( SPECIAL_SUFFIX )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==SPECIAL_SUFFIX) ) {
					int LA19_2 = input.LA(2);
					if ( (synpred41_test()) ) {
						alt19=1;
					}

				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:113: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX27=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring551); if (state.failed) return json;
					if ( state.backtracking==0 ) {suffix+= " " + (SPECIAL_SUFFIX27!=null?SPECIAL_SUFFIX27.getText():null);}
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					if (state.backtracking>0) {state.failed=true; return json;}
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			if ( state.backtracking==0 ) {
					//breedName+= (SPECIAL_SUFFIX27!=null?SPECIAL_SUFFIX27.getText():null);
					if(isVeteran(suffix)){
						json.addProperty("IsVeteran",true);
					}
					json.addProperty("IsSweepstakes",true);
					mLastBreedName = breedName;
					json.addProperty("BreedName", breedName);
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
	// $ANTLR end "special_ring"



	// $ANTLR start "group_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:180:1: group_ring returns [String str] : GROUP_RING ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING28=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:2: ( GROUP_RING )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:5: GROUP_RING
			{
			GROUP_RING28=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring573); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(GROUP_RING28!=null?GROUP_RING28.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:182:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME29=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+
			{
			TIME29=(Token)match(input,TIME,FOLLOW_TIME_in_group_block592); if (state.failed) return json;
			if ( state.backtracking==0 ) {currentBlockTime=(TIME29!=null?TIME29.getText():null);json.addProperty("TIME", currentBlockTime);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:82: ( STANDALONE_COMMENT )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==STANDALONE_COMMENT) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:82: STANDALONE_COMMENT
					{
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block595); if (state.failed) return json;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:102: (mRing= group_ring )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==GROUP_RING) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:103: mRing= group_ring
					{
					pushFollow(FOLLOW_group_ring_in_group_block601);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {if(!mRelational){json = new JsonObject();String[] arr = parseGroupRing(mRing);json.addProperty("Group", arr[0]);json.addProperty("Judge",arr[1]);json.addProperty("Time",currentBlockTime);mShowRings.add(json);}else{rings.add(new JsonPrimitive(mRing));}}
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					if (state.backtracking>0) {state.failed=true; return json;}
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			if ( state.backtracking==0 ) {if(mRelational){json.add("Rings", rings);}}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:1: breed_ring returns [JsonObject json] : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT30=null;
		Token BREED_NAME31=null;
		Token BREED_NAME_SUFFIX32=null;
		Token BREED_COUNT33=null;

		json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";int total = 0;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			INT30=(Token)match(input,INT,FOLLOW_INT_in_breed_ring629); if (state.failed) return json;
			if ( state.backtracking==0 ) {total = parseIntSafely((INT30!=null?INT30.getText():null), 0);json.addProperty("Count", total);}
			BREED_NAME31=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring632); if (state.failed) return json;
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME31!=null?BREED_NAME31.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:10: ( BREED_NAME_SUFFIX )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==BREED_NAME_SUFFIX) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:11: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX32=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring636); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX32!=null?BREED_NAME_SUFFIX32.getText():null);}
					}
					break;

			}

			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:120: ( BREED_COUNT )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==BREED_COUNT) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:121: BREED_COUNT
					{
					BREED_COUNT33=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring644); if (state.failed) return json;
					if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT33!=null?BREED_COUNT33.getText():null));assert (counted==total);}
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



	// $ANTLR start "non_conformation_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:199:1: non_conformation_ring returns [JsonObject json] : ( INT NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE | INT ) ( NON_CONF_SECOND_LINE_COMMENT )* ) ;
	public final JsonObject non_conformation_ring() throws RecognitionException {
		JsonObject json = null;


		json = new JsonObject();json.addProperty("Empty","obedience: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:2: ( ( INT NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE | INT ) ( NON_CONF_SECOND_LINE_COMMENT )* ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:4: ( INT NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE | INT ) ( NON_CONF_SECOND_LINE_COMMENT )* )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:4: ( INT NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE | INT ) ( NON_CONF_SECOND_LINE_COMMENT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:5: INT NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE | INT ) ( NON_CONF_SECOND_LINE_COMMENT )*
			{
			match(input,INT,FOLLOW_INT_in_non_conformation_ring668); if (state.failed) return json;
			match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring670); if (state.failed) return json;
			if ( input.LA(1)==INT||input.LA(1)==NON_CONFORMATION_SECOND_LINE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:72: ( NON_CONF_SECOND_LINE_COMMENT )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA24_2 = input.LA(2);
					if ( (synpred47_test()) ) {
						alt24=1;
					}

				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:73: NON_CONF_SECOND_LINE_COMMENT
					{
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring679); if (state.failed) return json;
					}
					break;

				default :
					break loop24;
				}
			}

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
	// $ANTLR end "non_conformation_ring"



	// $ANTLR start "rally_ring_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:202:1: rally_ring_block returns [JsonObject json] : ( ( rally_comment ) | ( rally_ring_name ( rally_entry_line )* ) );
	public final JsonObject rally_ring_block() throws RecognitionException {
		JsonObject json = null;


		json = new JsonObject();json.addProperty("Empty","rally: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:3: ( ( rally_comment ) | ( rally_ring_name ( rally_entry_line )* ) )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt26=1;
			}
			else if ( (LA26_0==INT||LA26_0==RALLY_CLASS) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: ( rally_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: ( rally_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:6: rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring_block700);
					rally_comment();
					state._fsp--;
					if (state.failed) return json;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:21: ( rally_ring_name ( rally_entry_line )* )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:21: ( rally_ring_name ( rally_entry_line )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:23: rally_ring_name ( rally_entry_line )*
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring_block705);
					rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:39: ( rally_entry_line )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==INT) ) {
							int LA25_2 = input.LA(2);
							if ( (LA25_2==RALLY_ENTRY) ) {
								alt25=1;
							}

						}
						else if ( (LA25_0==RALLY_ENTRY) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:39: rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring_block707);
							rally_entry_line();
							state._fsp--;
							if (state.failed) return json;
							}
							break;

						default :
							break loop25;
						}
					}

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
	// $ANTLR end "rally_ring_block"



	// $ANTLR start "rally_ring_name"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:205:1: rally_ring_name : ( INT )? RALLY_CLASS ;
	public final void rally_ring_name() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:2: ( ( INT )? RALLY_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:4: ( INT )? RALLY_CLASS
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:4: ( INT )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==INT) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:4: INT
					{
					match(input,INT,FOLLOW_INT_in_rally_ring_name717); if (state.failed) return;
					}
					break;

			}

			match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_ring_name720); if (state.failed) return;
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
	// $ANTLR end "rally_ring_name"



	// $ANTLR start "rally_entry_line"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:1: rally_entry_line : ( ( INT )? RALLY_ENTRY ) ;
	public final void rally_entry_line() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:2: ( ( ( INT )? RALLY_ENTRY ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:4: ( ( INT )? RALLY_ENTRY )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:4: ( ( INT )? RALLY_ENTRY )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:5: ( INT )? RALLY_ENTRY
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:5: ( INT )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==INT) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:5: INT
					{
					match(input,INT,FOLLOW_INT_in_rally_entry_line731); if (state.failed) return;
					}
					break;

			}

			match(input,RALLY_ENTRY,FOLLOW_RALLY_ENTRY_in_rally_entry_line734); if (state.failed) return;
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
	// $ANTLR end "rally_entry_line"



	// $ANTLR start "rally_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:1: rally_comment : ( NON_CONF_SECOND_LINE_COMMENT )+ ;
	public final void rally_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:2: ( ( NON_CONF_SECOND_LINE_COMMENT )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA29_2 = input.LA(2);
					if ( (synpred52_test()) ) {
						alt29=1;
					}

				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:3: NON_CONF_SECOND_LINE_COMMENT
					{
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment742); if (state.failed) return;
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
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
	// $ANTLR end "rally_comment"

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:95: ( ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:96: ring
		{
		pushFollow(FOLLOW_ring_in_synpred3_test93);
		ring();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_test

	// $ANTLR start synpred13_test
	public final void synpred13_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:8: (mComment= comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:8: mComment= comment
		{
		pushFollow(FOLLOW_comment_in_synpred13_test275);
		mComment=comment();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred13_test

	// $ANTLR start synpred14_test
	public final void synpred14_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:42: ( TIME )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:42: TIME
		{
		match(input,TIME,FOLLOW_TIME_in_synpred14_test278); if (state.failed) return;
		}

	}
	// $ANTLR end synpred14_test

	// $ANTLR start synpred15_test
	public final void synpred15_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:64: ( PHONE_NUMBER )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:64: PHONE_NUMBER
		{
		match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_synpred15_test281); if (state.failed) return;
		}

	}
	// $ANTLR end synpred15_test

	// $ANTLR start synpred31_test
	public final void synpred31_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:259: (mComment= timeblock_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:259: mComment= timeblock_comment
		{
		pushFollow(FOLLOW_timeblock_comment_in_synpred31_test431);
		mComment=timeblock_comment();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred31_test

	// $ANTLR start synpred32_test
	public final void synpred32_test_fragment() throws RecognitionException {
		JsonArray rings =null;
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:85: (rings= inner_timeblock (mComment= timeblock_comment )* )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:85: rings= inner_timeblock (mComment= timeblock_comment )*
		{
		pushFollow(FOLLOW_inner_timeblock_in_synpred32_test425);
		rings=inner_timeblock();
		state._fsp--;
		if (state.failed) return;
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:258: (mComment= timeblock_comment )*
		loop32:
		while (true) {
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( ((LA32_0 >= COMMENT && LA32_0 <= ELLIPSIS)||LA32_0==INT||LA32_0==PARENTHETICAL||LA32_0==PHONE_NUMBER||LA32_0==SPECIAL_SUFFIX) ) {
				alt32=1;
			}

			switch (alt32) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:259: mComment= timeblock_comment
				{
				pushFollow(FOLLOW_timeblock_comment_in_synpred32_test431);
				mComment=timeblock_comment();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop32;
			}
		}

		}

	}
	// $ANTLR end synpred32_test

	// $ANTLR start synpred33_test
	public final void synpred33_test_fragment() throws RecognitionException {
		JsonObject mSpecialRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: (mSpecialRing= special_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: mSpecialRing= special_ring
		{
		pushFollow(FOLLOW_special_ring_in_synpred33_test459);
		mSpecialRing=special_ring();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred33_test

	// $ANTLR start synpred34_test
	public final void synpred34_test_fragment() throws RecognitionException {
		JsonObject mJuniorRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:167: (mJuniorRing= junior_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:167: mJuniorRing= junior_ring
		{
		pushFollow(FOLLOW_junior_ring_in_synpred34_test464);
		mJuniorRing=junior_ring();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred34_test

	// $ANTLR start synpred36_test
	public final void synpred36_test_fragment() throws RecognitionException {
		JsonObject mBreedRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:324: ( ( ( breed_ring )=>mBreedRing= breed_ring ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:324: ( ( breed_ring )=>mBreedRing= breed_ring )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:324: ( ( breed_ring )=>mBreedRing= breed_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:325: ( breed_ring )=>mBreedRing= breed_ring
		{
		pushFollow(FOLLOW_breed_ring_in_synpred36_test474);
		mBreedRing=breed_ring();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred36_test

	// $ANTLR start synpred37_test
	public final void synpred37_test_fragment() throws RecognitionException {
		JsonObject mConformation =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:492: ( (mConformation= non_conformation_ring ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:492: (mConformation= non_conformation_ring )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:492: (mConformation= non_conformation_ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:493: mConformation= non_conformation_ring
		{
		pushFollow(FOLLOW_non_conformation_ring_in_synpred37_test481);
		mConformation=non_conformation_ring();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred37_test

	// $ANTLR start synpred38_test
	public final void synpred38_test_fragment() throws RecognitionException {
		JsonObject mRallyRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:557: ( (mRallyRing= rally_ring_block ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:557: (mRallyRing= rally_ring_block )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:557: (mRallyRing= rally_ring_block )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:558: mRallyRing= rally_ring_block
		{
		pushFollow(FOLLOW_rally_ring_block_in_synpred38_test488);
		mRallyRing=rally_ring_block();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred38_test

	// $ANTLR start synpred39_test
	public final void synpred39_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:611: ( ( ring_comment ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:611: ( ring_comment )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:611: ( ring_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:612: ring_comment
		{
		pushFollow(FOLLOW_ring_comment_in_synpred39_test493);
		ring_comment();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred39_test

	// $ANTLR start synpred41_test
	public final void synpred41_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:113: ( SPECIAL_SUFFIX )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:113: SPECIAL_SUFFIX
		{
		match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_synpred41_test551); if (state.failed) return;
		}

	}
	// $ANTLR end synpred41_test

	// $ANTLR start synpred47_test
	public final void synpred47_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:73: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:73: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred47_test679); if (state.failed) return;
		}

	}
	// $ANTLR end synpred47_test

	// $ANTLR start synpred52_test
	public final void synpred52_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:3: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:3: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred52_test742); if (state.failed) return;
		}

	}
	// $ANTLR end synpred52_test

	// Delegated rules

	public final boolean synpred39_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred39_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred41_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred41_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred34_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred34_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred52_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred52_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred32_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred32_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred38_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred38_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred37_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred37_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred33_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred33_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred36_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred36_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred31_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred31_test_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_special_ring_in_test_special47 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start85 = new BitSet(new long[]{0x002C900C00000740L});
	public static final BitSet FOLLOW_ring_in_start98 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_EOF_in_start105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring131 = new BitSet(new long[]{0x0020101000000100L});
	public static final BitSet FOLLOW_inner_ring_in_ring136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring162 = new BitSet(new long[]{0x0020900800000702L});
	public static final BitSet FOLLOW_comment_in_inner_ring165 = new BitSet(new long[]{0x0020900800000702L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring179 = new BitSet(new long[]{0x0000101000000102L});
	public static final BitSet FOLLOW_judge_name_in_judge_block209 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block215 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_name239 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_comment_in_big_comment275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_big_comment281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_comment313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_timeblock_comment356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_timeblock_comment365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_ring_comment396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock418 = new BitSet(new long[]{0x0019980800000702L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock425 = new BitSet(new long[]{0x0019980800000702L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock431 = new BitSet(new long[]{0x0019980800000702L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock459 = new BitSet(new long[]{0x0019980800000702L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock464 = new BitSet(new long[]{0x0019980800000702L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock474 = new BitSet(new long[]{0x0019980800000702L});
	public static final BitSet FOLLOW_non_conformation_ring_in_inner_timeblock481 = new BitSet(new long[]{0x0019980800000702L});
	public static final BitSet FOLLOW_rally_ring_block_in_inner_timeblock488 = new BitSet(new long[]{0x0019980800000702L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock493 = new BitSet(new long[]{0x0019980800000702L});
	public static final BitSet FOLLOW_INT_in_junior_ring517 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring541 = new BitSet(new long[]{0x0008000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring545 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring551 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_group_block592 = new BitSet(new long[]{0x0010000400000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block595 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block601 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring629 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring632 = new BitSet(new long[]{0x0000000000000092L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring636 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_non_conformation_ring668 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring670 = new BitSet(new long[]{0x0000040800000000L});
	public static final BitSet FOLLOW_set_in_non_conformation_ring672 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring679 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring_block700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring_block705 = new BitSet(new long[]{0x0002000800000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring_block707 = new BitSet(new long[]{0x0002000800000002L});
	public static final BitSet FOLLOW_INT_in_rally_ring_name717 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_ring_name720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_rally_entry_line731 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RALLY_ENTRY_in_rally_entry_line734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment742 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_ring_in_synpred3_test93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred13_test275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred14_test278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_synpred15_test281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred31_test431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred32_test425 = new BitSet(new long[]{0x0008900800000702L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred32_test431 = new BitSet(new long[]{0x0008900800000702L});
	public static final BitSet FOLLOW_special_ring_in_synpred33_test459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_synpred34_test464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred36_test474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_conformation_ring_in_synpred37_test481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_block_in_synpred38_test488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred39_test493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_synpred41_test551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred47_test679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred52_test742 = new BitSet(new long[]{0x0000000000000002L});
}
