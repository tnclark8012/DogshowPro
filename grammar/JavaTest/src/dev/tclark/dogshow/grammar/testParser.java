// $ANTLR 3.x C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g 2014-01-03 11:52:38

//TODO Puppy groups
package dev.tclark.dogshow.grammar;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.regex.Pattern;          
import java.util.regex.Matcher;

import com.google.gson.JsonElement;
import java.util.Iterator;
import java.util.Map.Entry;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class testParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREED_COUNT", "BREED_MISC", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "END_WORD", "FOLLOWING_TIME", "FRAG_BEST_IN_SHOW", "FRAG_BREED_ATTRIBUTE", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP", "FRAG_GROUP_NAME", "FRAG_MONTH", "FRAG_PROPER_NAME", "FRAG_RALLY_CLASS_NAME", "FRAG_RALLY_CLASS_SECTION", "FRAG_RALLY_ENTRANT_GROUP", "FRAG_RALLY_SINGLE_ENTRANT", "FRAG_RING", "FRAG_SEX", "FRAG_SPECIAL_GROUP_NAME", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_TO_FOLLOW", "FRAG_WEEK_DAY", "FallThrough", "GROUP_ENDING_ANNOUNCEMENT", "GROUP_NAME", "GROUP_RING", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "NON_CONFORMATION_CLASS_LEVEL", "NON_CONFORMATION_CLASS_NAME", "NON_CONFORMATION_CLASS_SECTION", "NON_CONFORMATION_CLASS_SUFFIX", "NON_CONFORMATION_SECOND_LINE", "NON_CONF_SECOND_LINE_COMMENT", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "RALLY_CLASS", "RALLY_ENTRY", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
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
	public static final int FOLLOWING_TIME=13;
	public static final int FRAG_BEST_IN_SHOW=14;
	public static final int FRAG_BREED_ATTRIBUTE=15;
	public static final int FRAG_BREED_NAME_ALT=16;
	public static final int FRAG_BREED_NAME_CATEGORY=17;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=18;
	public static final int FRAG_BREED_NAME_SINGLE=19;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=20;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP=21;
	public static final int FRAG_GROUP_NAME=22;
	public static final int FRAG_MONTH=23;
	public static final int FRAG_PROPER_NAME=24;
	public static final int FRAG_RALLY_CLASS_NAME=25;
	public static final int FRAG_RALLY_CLASS_SECTION=26;
	public static final int FRAG_RALLY_ENTRANT_GROUP=27;
	public static final int FRAG_RALLY_SINGLE_ENTRANT=28;
	public static final int FRAG_RING=29;
	public static final int FRAG_SEX=30;
	public static final int FRAG_SPECIAL_GROUP_NAME=31;
	public static final int FRAG_SPEC_CHAR=32;
	public static final int FRAG_SPEC_WORD_CHAR=33;
	public static final int FRAG_TIME_LABEL=34;
	public static final int FRAG_TITLE=35;
	public static final int FRAG_TO_FOLLOW=36;
	public static final int FRAG_WEEK_DAY=37;
	public static final int FallThrough=38;
	public static final int GROUP_ENDING_ANNOUNCEMENT=39;
	public static final int GROUP_NAME=40;
	public static final int GROUP_RING=41;
	public static final int INT=42;
	public static final int JUDGE_NAME=43;
	public static final int JUNIOR_CLASS=44;
	public static final int NON_CONFORMATION_CLASS_LEVEL=45;
	public static final int NON_CONFORMATION_CLASS_NAME=46;
	public static final int NON_CONFORMATION_CLASS_SECTION=47;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=48;
	public static final int NON_CONFORMATION_SECOND_LINE=49;
	public static final int NON_CONF_SECOND_LINE_COMMENT=50;
	public static final int PARENTHETICAL=51;
	public static final int PARENTHETICAL_INT=52;
	public static final int PARENTHETICAL_NAME=53;
	public static final int PHONE_NUMBER=54;
	public static final int RALLY_CLASS=55;
	public static final int RALLY_ENTRY=56;
	public static final int RING_TITLE=57;
	public static final int SPECIAL_SUFFIX=58;
	public static final int STANDALONE_COMMENT=59;
	public static final int TIME=60;
	public static final int WORD=61;
	public static final int WS=62;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g"; }


	String currentBlockTime = null;
	boolean debug = false;

	// Non-relational style objects for better JSON
	public boolean mRelational = true;
	JsonArray mShowRings = new JsonArray();
	String mCurrentJudge = null;
	int mCurrentRingNumber = -1;
	String mLastBreedName = null;
	String mCurrentClass = null;
	// end non-relational

	public void setRelationalParse(boolean value)
	{
		mRelational = value;
	}

	private JsonObject mergeJson(JsonObject dest, JsonObject src)
	{
		if( dest == null )
		{
			dest = new JsonObject();
		}
		if( src == null)
		{
			return dest;
		}
		Iterator<Entry<String, JsonElement>> i = src.entrySet().iterator();
		Entry<String, JsonElement> e;
		while(i.hasNext())
		{
			e = i.next();
			dest.add(e.getKey(), e.getValue());
		}
		return dest;
		
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
	  
	  



	// $ANTLR start "start"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:147:1: start returns [JsonObject json] : (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:3: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:4: (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:4: (mComment= big_comment )+
			int cnt1=0;
			loop1:
			do {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==BREED_NAME||(LA1_0 >= COMMENT && LA1_0 <= ELLIPSIS)||(LA1_0 >= GROUP_RING && LA1_0 <= INT)||LA1_0==NON_CONFORMATION_CLASS_NAME||LA1_0==NON_CONFORMATION_SECOND_LINE||LA1_0==PARENTHETICAL||LA1_0==PHONE_NUMBER||LA1_0==SPECIAL_SUFFIX||LA1_0==TIME) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:5: mComment= big_comment
					{
					pushFollow(FOLLOW_big_comment_in_start63);
					mComment=big_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {comments+=mComment;}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(1, input);
						throw eee;
				}
				cnt1++;
			} while (true);

			if ( state.backtracking==0 ) {json.addProperty("Comment", comments);}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:94: ( ( ring )=>mRing= ring )+
			int cnt2=0;
			loop2:
			do {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==RING_TITLE) && (synpred2_test())) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:95: ( ring )=>mRing= ring
					{
					pushFollow(FOLLOW_ring_in_start76);
					mRing=ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {ringArray.add(mRing);}
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

			if ( state.backtracking==0 ) {json.add("Rings", ringArray); if(!mRelational){json = new JsonObject(); json.add("Rings", mShowRings);}}
			match(input,EOF,FOLLOW_EOF_in_start83); if (state.failed) return json;
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
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:152:1: ring returns [JsonObject json] : RING_TITLE mRing= inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		Token RING_TITLE1=null;
		JsonObject mRing =null;

		json = new JsonObject();if(debug){System.out.println("ring...");}
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:154:3: ( RING_TITLE mRing= inner_ring )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:154:7: RING_TITLE mRing= inner_ring
			{
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring109); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Title", (RING_TITLE1!=null?RING_TITLE1.getText():null)); json.addProperty("Number", parseRingNumber((RING_TITLE1!=null?RING_TITLE1.getText():null)));if(!mRelational){mCurrentRingNumber=parseRingNumber((RING_TITLE1!=null?RING_TITLE1.getText():null));}}
			pushFollow(FOLLOW_inner_ring_in_ring114);
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
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:155:1: inner_ring returns [JsonObject json] : ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJugeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:2: ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==TIME) ) {
				alt5=1;
			}
			else if ( (LA5_0==COMMENT||LA5_0==JUDGE_NAME||(LA5_0 >= PARENTHETICAL && LA5_0 <= PARENTHETICAL_INT)) ) {
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
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:6: ( group_block )=>mGroupBlock= group_block ( comment )*
					{
					pushFollow(FOLLOW_group_block_in_inner_ring140);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:82: ( comment )*
					loop3:
					do {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==BREED_NAME||(LA3_0 >= COMMENT && LA3_0 <= ELLIPSIS)||LA3_0==INT||LA3_0==NON_CONFORMATION_CLASS_NAME||LA3_0==NON_CONFORMATION_SECOND_LINE||LA3_0==PARENTHETICAL||LA3_0==PHONE_NUMBER||LA3_0==TIME) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:82: comment
							{
							pushFollow(FOLLOW_comment_in_inner_ring143);
							comment();
							state._fsp--;
							if (state.failed) return json;
							}
							break;

						default :
							break loop3;
						}
					} while (true);

					}

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:158:7: ( (mJugeBlock= judge_block )+ )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:158:7: ( (mJugeBlock= judge_block )+ )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:158:8: (mJugeBlock= judge_block )+
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:158:8: (mJugeBlock= judge_block )+
					int cnt4=0;
					loop4:
					do {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMENT||LA4_0==JUDGE_NAME||(LA4_0 >= PARENTHETICAL && LA4_0 <= PARENTHETICAL_INT)) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:158:9: mJugeBlock= judge_block
							{
							pushFollow(FOLLOW_judge_block_in_inner_ring157);
							mJugeBlock=judge_block();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {judgeBlocks.add(mJugeBlock);}
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
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:159:1: judge_block returns [JsonObject json] : mName= judge_name (mBlock= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		String mName =null;
		JsonObject mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:161:5: (mName= judge_name (mBlock= timeblock )+ )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:161:9: mName= judge_name (mBlock= timeblock )+
			{
			pushFollow(FOLLOW_judge_name_in_judge_block187);
			mName=judge_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {if(!mRelational){mCurrentJudge = mName.trim();}json.addProperty("Judge", mName);}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:161:108: (mBlock= timeblock )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==INT||LA6_0==TIME) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:161:109: mBlock= timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block193);
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



	// $ANTLR start "judge_name"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:162:1: judge_name returns [String str] : ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ );
	public final String judge_name() throws RecognitionException {
		String str = null;


		Token JUDGE_NAME2=null;
		Token COMMENT3=null;
		Token PARENTHETICAL4=null;
		Token PARENTHETICAL_INT5=null;

		str = "";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:2: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==JUDGE_NAME) ) {
				alt9=1;
			}
			else if ( (LA9_0==COMMENT||(LA9_0 >= PARENTHETICAL && LA9_0 <= PARENTHETICAL_INT)) ) {
				alt9=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:4: ( JUDGE_NAME )+
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:4: ( JUDGE_NAME )+
					int cnt7=0;
					loop7:
					do {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==JUDGE_NAME) ) {
							int LA7_2 = input.LA(2);
							if ( (synpred8_test()) ) {
								alt7=1;
							}

						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:5: JUDGE_NAME
							{
							JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_name217); if (state.failed) return str;
							if ( state.backtracking==0 ) {str+=(JUDGE_NAME2!=null?JUDGE_NAME2.getText():null);}
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return str;}
								EarlyExitException eee =
									new EarlyExitException(7, input);
								throw eee;
						}
						cnt7++;
					} while (true);

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:42: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:42: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					int cnt8=0;
					loop8:
					do {
						int alt8=4;
						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA8_2 = input.LA(2);
							if ( (synpred10_test()) ) {
								alt8=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA8_3 = input.LA(2);
							if ( (synpred11_test()) ) {
								alt8=2;
							}

							}
							break;
						case PARENTHETICAL_INT:
							{
							int LA8_4 = input.LA(2);
							if ( (synpred12_test()) ) {
								alt8=3;
							}

							}
							break;
						}
						switch (alt8) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:43: COMMENT
							{
							COMMENT3=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_judge_name223); if (state.failed) return str;
							if ( state.backtracking==0 ) {str+=(COMMENT3!=null?COMMENT3.getText():null)+" ";}
							}
							break;
						case 2 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:76: PARENTHETICAL
							{
							PARENTHETICAL4=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_judge_name226); if (state.failed) return str;
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL4!=null?PARENTHETICAL4.getText():null)+" ";}
							}
							break;
						case 3 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:121: PARENTHETICAL_INT
							{
							PARENTHETICAL_INT5=(Token)match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_judge_name229); if (state.failed) return str;
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL_INT5!=null?PARENTHETICAL_INT5.getText():null)+" ";}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return str;}
								EarlyExitException eee =
									new EarlyExitException(8, input);
								throw eee;
						}
						cnt8++;
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
		return str;
	}
	// $ANTLR end "judge_name"



	// $ANTLR start "big_comment"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:1: big_comment returns [String str] : (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) ;
	public final String big_comment() throws RecognitionException {
		String str = null;


		Token TIME6=null;
		Token PHONE_NUMBER7=null;
		Token BREED_NAME8=null;
		Token SPECIAL_SUFFIX9=null;
		Token GROUP_RING10=null;
		Token NON_CONFORMATION_SECOND_LINE11=null;
		String mComment =null;

		str = "";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:3: ( (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			int alt10=7;
			switch ( input.LA(1) ) {
			case COMMENT:
			case DATE:
			case ELLIPSIS:
			case INT:
			case NON_CONFORMATION_CLASS_NAME:
			case PARENTHETICAL:
				{
				alt10=1;
				}
				break;
			case BREED_NAME:
				{
				int LA10_2 = input.LA(2);
				if ( (synpred13_test()) ) {
					alt10=1;
				}
				else if ( (synpred16_test()) ) {
					alt10=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case TIME:
				{
				int LA10_3 = input.LA(2);
				if ( (synpred13_test()) ) {
					alt10=1;
				}
				else if ( (synpred14_test()) ) {
					alt10=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case PHONE_NUMBER:
				{
				int LA10_4 = input.LA(2);
				if ( (synpred13_test()) ) {
					alt10=1;
				}
				else if ( (synpred15_test()) ) {
					alt10=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NON_CONFORMATION_SECOND_LINE:
				{
				int LA10_5 = input.LA(2);
				if ( (synpred13_test()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=7;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt10=5;
				}
				break;
			case GROUP_RING:
				{
				alt10=6;
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
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:8: mComment= comment
					{
					pushFollow(FOLLOW_comment_in_big_comment258);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:42: TIME
					{
					TIME6=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment261); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME6!=null?TIME6.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:64: PHONE_NUMBER
					{
					PHONE_NUMBER7=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_big_comment264); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER7!=null?PHONE_NUMBER7.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:102: BREED_NAME
					{
					BREED_NAME8=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment267); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME8!=null?BREED_NAME8.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:136: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX9=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment270); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX9!=null?SPECIAL_SUFFIX9.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:178: GROUP_RING
					{
					GROUP_RING10=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment273); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_RING10!=null?GROUP_RING10.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:212: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE11=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment276); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_SECOND_LINE11!=null?NON_CONFORMATION_SECOND_LINE11.getText():null);}
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
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:169:1: comment returns [String str] : ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) ;
	public final String comment() throws RecognitionException {
		String str = null;


		Token NON_CONFORMATION_CLASS_NAME12=null;
		Token BREED_NAME13=null;
		Token TIME14=null;
		Token COMMENT15=null;
		Token PARENTHETICAL16=null;
		Token INT17=null;
		Token ELLIPSIS18=null;
		Token DATE19=null;
		Token PHONE_NUMBER20=null;
		Token NON_CONFORMATION_SECOND_LINE21=null;

		str="";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:3: ( ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			int alt11=10;
			switch ( input.LA(1) ) {
			case NON_CONFORMATION_CLASS_NAME:
				{
				alt11=1;
				}
				break;
			case BREED_NAME:
				{
				alt11=2;
				}
				break;
			case TIME:
				{
				alt11=3;
				}
				break;
			case COMMENT:
				{
				alt11=4;
				}
				break;
			case PARENTHETICAL:
				{
				alt11=5;
				}
				break;
			case INT:
				{
				alt11=6;
				}
				break;
			case ELLIPSIS:
				{
				alt11=7;
				}
				break;
			case DATE:
				{
				alt11=8;
				}
				break;
			case PHONE_NUMBER:
				{
				alt11=9;
				}
				break;
			case NON_CONFORMATION_SECOND_LINE:
				{
				alt11=10;
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
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:6: NON_CONFORMATION_CLASS_NAME
					{
					NON_CONFORMATION_CLASS_NAME12=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment299); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME12!=null?NON_CONFORMATION_CLASS_NAME12.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:74: BREED_NAME
					{
					BREED_NAME13=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_comment302); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME13!=null?BREED_NAME13.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:108: TIME
					{
					TIME14=(Token)match(input,TIME,FOLLOW_TIME_in_comment305); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME14!=null?TIME14.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:130: COMMENT
					{
					COMMENT15=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment308); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT15!=null?COMMENT15.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:158: PARENTHETICAL
					{
					PARENTHETICAL16=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment311); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL16!=null?PARENTHETICAL16.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:198: INT
					{
					INT17=(Token)match(input,INT,FOLLOW_INT_in_comment314); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT17!=null?INT17.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:218: ELLIPSIS
					{
					ELLIPSIS18=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment317); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS18!=null?ELLIPSIS18.getText():null);}
					}
					break;
				case 8 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:248: DATE
					{
					DATE19=(Token)match(input,DATE,FOLLOW_DATE_in_comment320); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE19!=null?DATE19.getText():null);}
					}
					break;
				case 9 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:270: PHONE_NUMBER
					{
					PHONE_NUMBER20=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment323); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER20!=null?PHONE_NUMBER20.getText():null);}
					}
					break;
				case 10 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:171:308: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE21=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment326); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_SECOND_LINE21!=null?NON_CONFORMATION_SECOND_LINE21.getText():null);}
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
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:1: timeblock_comment returns [String str] : ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX ) ;
	public final String timeblock_comment() throws RecognitionException {
		String str = null;


		Token NON_CONFORMATION_CLASS_NAME22=null;
		Token BREED_NAME23=null;
		Token COMMENT24=null;
		Token PARENTHETICAL25=null;
		Token INT26=null;
		Token ELLIPSIS27=null;
		Token DATE28=null;
		Token PHONE_NUMBER29=null;

		str="";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:3: ( ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX )
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX )
			int alt12=9;
			switch ( input.LA(1) ) {
			case NON_CONFORMATION_CLASS_NAME:
				{
				alt12=1;
				}
				break;
			case BREED_NAME:
				{
				alt12=2;
				}
				break;
			case COMMENT:
				{
				alt12=3;
				}
				break;
			case PARENTHETICAL:
				{
				alt12=4;
				}
				break;
			case INT:
				{
				alt12=5;
				}
				break;
			case ELLIPSIS:
				{
				alt12=6;
				}
				break;
			case DATE:
				{
				alt12=7;
				}
				break;
			case PHONE_NUMBER:
				{
				alt12=8;
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt12=9;
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
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:6: NON_CONFORMATION_CLASS_NAME
					{
					NON_CONFORMATION_CLASS_NAME22=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment348); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME22!=null?NON_CONFORMATION_CLASS_NAME22.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:74: BREED_NAME
					{
					BREED_NAME23=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_timeblock_comment351); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME23!=null?BREED_NAME23.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:108: COMMENT
					{
					COMMENT24=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment354); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT24!=null?COMMENT24.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:136: PARENTHETICAL
					{
					PARENTHETICAL25=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_timeblock_comment357); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL25!=null?PARENTHETICAL25.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:176: INT
					{
					INT26=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment360); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT26!=null?INT26.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:196: ELLIPSIS
					{
					ELLIPSIS27=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment363); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS27!=null?ELLIPSIS27.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:226: DATE
					{
					DATE28=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock_comment366); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE28!=null?DATE28.getText():null);}
					}
					break;
				case 8 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:248: PHONE_NUMBER
					{
					PHONE_NUMBER29=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment369); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER29!=null?PHONE_NUMBER29.getText():null);}
					}
					break;
				case 9 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:174:286: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment372); if (state.failed) return str;
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
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:177:1: ring_comment returns [String str] : ( STANDALONE_COMMENT | timeblock_comment );
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT30=null;

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:178:5: ( STANDALONE_COMMENT | timeblock_comment )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==STANDALONE_COMMENT) ) {
				alt13=1;
			}
			else if ( (LA13_0==BREED_NAME||(LA13_0 >= COMMENT && LA13_0 <= ELLIPSIS)||LA13_0==INT||LA13_0==NON_CONFORMATION_CLASS_NAME||LA13_0==PARENTHETICAL||LA13_0==PHONE_NUMBER||LA13_0==SPECIAL_SUFFIX) ) {
				alt13=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:178:9: STANDALONE_COMMENT
					{
					STANDALONE_COMMENT30=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment394); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT30!=null?STANDALONE_COMMENT30.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:178:59: timeblock_comment
					{
					pushFollow(FOLLOW_timeblock_comment_in_ring_comment397);
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
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:180:1: timeblock returns [JsonObject json] : ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )* ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token INT31=null;
		Token TIME32=null;
		JsonArray rings =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; String time = "";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:2: ( ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )* )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:4: ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )*
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:4: ( ( INT FOLLOWING_TIME ) | TIME )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==INT) ) {
				alt14=1;
			}
			else if ( (LA14_0==TIME) ) {
				alt14=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:5: ( INT FOLLOWING_TIME )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:5: ( INT FOLLOWING_TIME )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:6: INT FOLLOWING_TIME
					{
					INT31=(Token)match(input,INT,FOLLOW_INT_in_timeblock420); if (state.failed) return json;
					if ( state.backtracking==0 ) {currentBlockTime=(INT31!=null?INT31.getText():null);json.addProperty("Time", currentBlockTime);}
					match(input,FOLLOWING_TIME,FOLLOW_FOLLOWING_TIME_in_timeblock423); if (state.failed) return json;
					}

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:98: TIME
					{
					TIME32=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock426); if (state.failed) return json;
					if ( state.backtracking==0 ) {currentBlockTime=(TIME32!=null?TIME32.getText():null);json.addProperty("Time", currentBlockTime);}
					}
					break;

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:177: (rings= inner_timeblock (mComment= timeblock_comment )* )*
			loop16:
			do {
				int alt16=2;
				switch ( input.LA(1) ) {
				case JUDGE_NAME:
					{
					int LA16_2 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt16=1;
					}

					}
					break;
				case COMMENT:
					{
					int LA16_3 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt16=1;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA16_4 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt16=1;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA16_5 = input.LA(2);
					if ( (synpred39_test()) ) {
						alt16=1;
					}

					}
					break;
				case INT:
					{
					int LA16_6 = input.LA(2);
					if ( (LA16_6==EOF||LA16_6==BREED_COUNT||LA16_6==BREED_NAME||(LA16_6 >= COMMENT && LA16_6 <= ELLIPSIS)||(LA16_6 >= INT && LA16_6 <= JUNIOR_CLASS)||LA16_6==NON_CONFORMATION_CLASS_NAME||(LA16_6 >= NON_CONF_SECOND_LINE_COMMENT && LA16_6 <= PARENTHETICAL_INT)||(LA16_6 >= PHONE_NUMBER && LA16_6 <= RALLY_CLASS)||(LA16_6 >= RING_TITLE && LA16_6 <= TIME)) ) {
						alt16=1;
					}

					}
					break;
				case BREED_NAME:
				case DATE:
				case ELLIPSIS:
				case NON_CONFORMATION_CLASS_NAME:
				case PHONE_NUMBER:
				case SPECIAL_SUFFIX:
				case STANDALONE_COMMENT:
					{
					alt16=1;
					}
					break;
				}
				switch (alt16) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:178: rings= inner_timeblock (mComment= timeblock_comment )*
					{
					pushFollow(FOLLOW_inner_timeblock_in_timeblock433);
					rings=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {if(json.has("Rings")){JsonArray already=json.getAsJsonArray("Rings");already.addAll(rings);json.add("Rings",already);}else{json.add("Rings", rings);}}
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:351: (mComment= timeblock_comment )*
					loop15:
					do {
						int alt15=2;
						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA15_2 = input.LA(2);
							if ( (synpred38_test()) ) {
								alt15=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA15_3 = input.LA(2);
							if ( (synpred38_test()) ) {
								alt15=1;
							}

							}
							break;
						case INT:
							{
							int LA15_4 = input.LA(2);
							if ( (synpred38_test()) ) {
								alt15=1;
							}

							}
							break;
						case NON_CONFORMATION_CLASS_NAME:
							{
							int LA15_5 = input.LA(2);
							if ( (synpred38_test()) ) {
								alt15=1;
							}

							}
							break;
						case BREED_NAME:
							{
							int LA15_6 = input.LA(2);
							if ( (synpred38_test()) ) {
								alt15=1;
							}

							}
							break;
						case ELLIPSIS:
							{
							int LA15_7 = input.LA(2);
							if ( (synpred38_test()) ) {
								alt15=1;
							}

							}
							break;
						case DATE:
							{
							int LA15_8 = input.LA(2);
							if ( (synpred38_test()) ) {
								alt15=1;
							}

							}
							break;
						case PHONE_NUMBER:
							{
							int LA15_9 = input.LA(2);
							if ( (synpred38_test()) ) {
								alt15=1;
							}

							}
							break;
						case SPECIAL_SUFFIX:
							{
							int LA15_10 = input.LA(2);
							if ( (synpred38_test()) ) {
								alt15=1;
							}

							}
							break;
						}
						switch (alt15) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:352: mComment= timeblock_comment
							{
							pushFollow(FOLLOW_timeblock_comment_in_timeblock439);
							mComment=timeblock_comment();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {comment+=mComment;}
							}
							break;

						default :
							break loop15;
						}
					} while (true);

					if ( state.backtracking==0 ) {if(!comment.equals("")){json.add("timeblock_comment",new JsonPrimitive(comment));}}
					}
					break;

				default :
					break loop16;
				}
			} while (true);

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



	// $ANTLR start "non_group_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:184:1: non_group_ring returns [JsonObject json] : INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) ;
	public final JsonObject non_group_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT33=null;
		JsonObject mRingWithBreed =null;
		JsonObject mRingWithoutBreed =null;

		json = new JsonObject();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:185:32: ( INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:186:2: INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			{
			INT33=(Token)match(input,INT,FOLLOW_INT_in_non_group_ring462); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count", parseIntSafely((INT33!=null?INT33.getText():null),0));}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:187:2: ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BREED_NAME) ) {
				alt17=1;
			}
			else if ( (LA17_0==BREED_COUNT||LA17_0==JUNIOR_CLASS||LA17_0==NON_CONFORMATION_CLASS_NAME||LA17_0==NON_CONF_SECOND_LINE_COMMENT||LA17_0==RALLY_CLASS) ) {
				alt17=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:188:2: (mRingWithBreed= ring_with_breed )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:188:2: (mRingWithBreed= ring_with_breed )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:188:3: mRingWithBreed= ring_with_breed
					{
					pushFollow(FOLLOW_ring_with_breed_in_non_group_ring472);
					mRingWithBreed=ring_with_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRingWithBreed);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:189:2: (mRingWithoutBreed= ring_without_breed )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:189:2: (mRingWithoutBreed= ring_without_breed )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:189:3: mRingWithoutBreed= ring_without_breed
					{
					pushFollow(FOLLOW_ring_without_breed_in_non_group_ring481);
					mRingWithoutBreed=ring_without_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRingWithoutBreed);}
					}

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
	// $ANTLR end "non_group_ring"



	// $ANTLR start "inner_timeblock"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:193:1: inner_timeblock returns [JsonArray array] : ( judge_name |nonGroupRing= non_group_ring | ring_comment )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject nonGroupRing =null;

		array = new JsonArray();int countAhead = 0;
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:2: ( ( judge_name |nonGroupRing= non_group_ring | ring_comment )+ )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:5: ( judge_name |nonGroupRing= non_group_ring | ring_comment )+
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:5: ( judge_name |nonGroupRing= non_group_ring | ring_comment )+
			int cnt18=0;
			loop18:
			do {
				int alt18=4;
				switch ( input.LA(1) ) {
				case NON_CONFORMATION_CLASS_NAME:
					{
					int LA18_1 = input.LA(2);
					if ( (synpred43_test()) ) {
						alt18=3;
					}

					}
					break;
				case BREED_NAME:
					{
					int LA18_2 = input.LA(2);
					if ( (synpred43_test()) ) {
						alt18=3;
					}

					}
					break;
				case COMMENT:
					{
					int LA18_3 = input.LA(2);
					if ( (synpred41_test()) ) {
						alt18=1;
					}
					else if ( (synpred43_test()) ) {
						alt18=3;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA18_4 = input.LA(2);
					if ( (synpred41_test()) ) {
						alt18=1;
					}
					else if ( (synpred43_test()) ) {
						alt18=3;
					}

					}
					break;
				case INT:
					{
					int LA18_5 = input.LA(2);
					if ( (synpred42_test()) ) {
						alt18=2;
					}
					else if ( (synpred43_test()) ) {
						alt18=3;
					}

					}
					break;
				case ELLIPSIS:
					{
					int LA18_6 = input.LA(2);
					if ( (synpred43_test()) ) {
						alt18=3;
					}

					}
					break;
				case DATE:
					{
					int LA18_7 = input.LA(2);
					if ( (synpred43_test()) ) {
						alt18=3;
					}

					}
					break;
				case PHONE_NUMBER:
					{
					int LA18_8 = input.LA(2);
					if ( (synpred43_test()) ) {
						alt18=3;
					}

					}
					break;
				case SPECIAL_SUFFIX:
					{
					int LA18_9 = input.LA(2);
					if ( (synpred43_test()) ) {
						alt18=3;
					}

					}
					break;
				case JUDGE_NAME:
					{
					int LA18_11 = input.LA(2);
					if ( (synpred41_test()) ) {
						alt18=1;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA18_12 = input.LA(2);
					if ( (synpred41_test()) ) {
						alt18=1;
					}

					}
					break;
				case STANDALONE_COMMENT:
					{
					int LA18_13 = input.LA(2);
					if ( (synpred43_test()) ) {
						alt18=3;
					}

					}
					break;
				}
				switch (alt18) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:6: judge_name
					{
					pushFollow(FOLLOW_judge_name_in_inner_timeblock508);
					judge_name();
					state._fsp--;
					if (state.failed) return array;
					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:17: nonGroupRing= non_group_ring
					{
					pushFollow(FOLLOW_non_group_ring_in_inner_timeblock512);
					nonGroupRing=non_group_ring();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {nonGroupRing.addProperty("BlockStart",currentBlockTime);nonGroupRing.addProperty("Number",mCurrentRingNumber);nonGroupRing.addProperty("Judge",mCurrentJudge);nonGroupRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=nonGroupRing.get("Count").getAsInt();if(!(nonGroupRing.has("type") && nonGroupRing.get("type").getAsString().equals("obedience_with_breed")))array.add(nonGroupRing);}
					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:443: ring_comment
					{
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock515);
					ring_comment();
					state._fsp--;
					if (state.failed) return array;
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					if (state.backtracking>0) {state.failed=true; return array;}
						EarlyExitException eee =
							new EarlyExitException(18, input);
						throw eee;
				}
				cnt18++;
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
		return array;
	}
	// $ANTLR end "inner_timeblock"



	// $ANTLR start "rally_walkthrough"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:199:1: rally_walkthrough returns [JsonObject json] : RALLY_CLASS ;
	public final JsonObject rally_walkthrough() throws RecognitionException {
		JsonObject json = null;


		json = new JsonObject();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:200:33: ( RALLY_CLASS )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:201:3: RALLY_CLASS
			{
			match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_walkthrough537); if (state.failed) return json;
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
	// $ANTLR end "rally_walkthrough"



	// $ANTLR start "ring_with_breed"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:203:1: ring_with_breed returns [JsonObject json] : breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) ;
	public final JsonObject ring_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT34=null;
		JsonObject breedName =null;
		JsonObject suffix =null;
		JsonObject obedience =null;

		json = new JsonObject();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:204:32: (breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:2: breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			{
			pushFollow(FOLLOW_breed_name_in_ring_with_breed555);
			breedName=breed_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {mergeJson(json,breedName);}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:51: (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			int alt20=3;
			switch ( input.LA(1) ) {
			case SPECIAL_SUFFIX:
				{
				int LA20_1 = input.LA(2);
				if ( (synpred44_test()) ) {
					alt20=1;
				}
				else if ( (true) ) {
					alt20=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return json;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case COMMENT:
				{
				switch ( input.LA(2) ) {
				case NON_CONFORMATION_SECOND_LINE:
					{
					alt20=2;
					}
					break;
				case INT:
					{
					int LA20_6 = input.LA(3);
					if ( (synpred45_test()) ) {
						alt20=2;
					}
					else if ( (true) ) {
						alt20=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return json;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 20, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case EOF:
				case BREED_NAME:
				case COMMENT:
				case DATE:
				case ELLIPSIS:
				case JUDGE_NAME:
				case NON_CONFORMATION_CLASS_NAME:
				case PARENTHETICAL:
				case PARENTHETICAL_INT:
				case PHONE_NUMBER:
				case RING_TITLE:
				case SPECIAL_SUFFIX:
				case STANDALONE_COMMENT:
				case TIME:
					{
					alt20=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return json;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EOF:
			case BREED_COUNT:
			case BREED_NAME:
			case DATE:
			case ELLIPSIS:
			case INT:
			case JUDGE_NAME:
			case NON_CONFORMATION_CLASS_NAME:
			case PARENTHETICAL:
			case PARENTHETICAL_INT:
			case PHONE_NUMBER:
			case RING_TITLE:
			case STANDALONE_COMMENT:
			case TIME:
				{
				alt20=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:52: suffix= special_suffix
					{
					pushFollow(FOLLOW_special_suffix_in_ring_with_breed561);
					suffix=special_suffix();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,suffix);}
					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:99: (obedience= obedience_with_breed )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:99: (obedience= obedience_with_breed )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:100: obedience= obedience_with_breed
					{
					pushFollow(FOLLOW_obedience_with_breed_in_ring_with_breed567);
					obedience=obedience_with_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("type","obedience_with_breed");}
					}

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:182: ( ( BREED_COUNT )? )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:182: ( ( BREED_COUNT )? )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:183: ( BREED_COUNT )?
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:183: ( BREED_COUNT )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==BREED_COUNT) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:184: BREED_COUNT
							{
							BREED_COUNT34=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_ring_with_breed573); if (state.failed) return json;
							if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT34!=null?BREED_COUNT34.getText():null));}
							}
							break;

					}

					}

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
	// $ANTLR end "ring_with_breed"



	// $ANTLR start "obedience_with_breed"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:207:1: obedience_with_breed returns [JsonObject json] : COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) ;
	public final JsonObject obedience_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token mEntry=null;
		Token mNumber=null;

		json = new JsonObject(); json.addProperty("Class",mCurrentClass);
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:208:73: ( COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:209:2: COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
			{
			match(input,COMMENT,FOLLOW_COMMENT_in_obedience_with_breed594); if (state.failed) return json;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:209:10: ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==NON_CONFORMATION_SECOND_LINE) ) {
				alt21=1;
			}
			else if ( (LA21_0==INT) ) {
				alt21=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:209:11: (mEntry= NON_CONFORMATION_SECOND_LINE )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:209:11: (mEntry= NON_CONFORMATION_SECOND_LINE )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:209:12: mEntry= NON_CONFORMATION_SECOND_LINE
					{
					mEntry=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed600); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("obedienceEntries",(mEntry!=null?mEntry.getText():null)); }
					}

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:209:102: (mNumber= INT )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:209:102: (mNumber= INT )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:209:103: mNumber= INT
					{
					mNumber=(Token)match(input,INT,FOLLOW_INT_in_obedience_with_breed607); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("obedienceEntries",parseIntSafely((mNumber!=null?mNumber.getText():null), 0)); }
					}

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
	// $ANTLR end "obedience_with_breed"



	// $ANTLR start "special_suffix"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:211:1: special_suffix returns [JsonObject json] : SPECIAL_SUFFIX ;
	public final JsonObject special_suffix() throws RecognitionException {
		JsonObject json = null;


		Token SPECIAL_SUFFIX35=null;

		json = new JsonObject();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:212:32: ( SPECIAL_SUFFIX )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:213:2: SPECIAL_SUFFIX
			{
			SPECIAL_SUFFIX35=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_suffix626); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("SpecialSuffix",(SPECIAL_SUFFIX35!=null?SPECIAL_SUFFIX35.getText():null));if(isSweepstakes((SPECIAL_SUFFIX35!=null?SPECIAL_SUFFIX35.getText():null)))json.addProperty("IsSweepstakes",true);}
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
	// $ANTLR end "special_suffix"



	// $ANTLR start "breed_name"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:215:1: breed_name returns [JsonObject json] : BREED_NAME ( BREED_NAME_SUFFIX )? ;
	public final JsonObject breed_name() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME36=null;
		Token BREED_NAME_SUFFIX37=null;

		json = new JsonObject(); String breedName ="";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:216:55: ( BREED_NAME ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:217:3: BREED_NAME ( BREED_NAME_SUFFIX )?
			{
			BREED_NAME36=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name645); if (state.failed) return json;
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME36!=null?BREED_NAME36.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:225:10: ( BREED_NAME_SUFFIX )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==BREED_NAME_SUFFIX) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:225:11: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX37=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name649); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("BreedSuffix", (BREED_NAME_SUFFIX37!=null?BREED_NAME_SUFFIX37.getText():null));}
					}
					break;

			}

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
	// $ANTLR end "breed_name"



	// $ANTLR start "ring_without_breed"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:228:1: ring_without_breed returns [JsonObject json] : ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) );
	public final JsonObject ring_without_breed() throws RecognitionException {
		JsonObject json = null;


		JsonObject mJuniorRing =null;
		JsonObject mEmptyRing =null;
		JsonObject mRallyRing =null;
		JsonObject mNonConformationRing =null;

		json = new JsonObject(); JsonObject ring;
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:229:49: ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) )
			int alt23=4;
			switch ( input.LA(1) ) {
			case JUNIOR_CLASS:
				{
				alt23=1;
				}
				break;
			case BREED_COUNT:
				{
				alt23=2;
				}
				break;
			case NON_CONF_SECOND_LINE_COMMENT:
			case RALLY_CLASS:
				{
				alt23=3;
				}
				break;
			case NON_CONFORMATION_CLASS_NAME:
				{
				alt23=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:230:2: (mJuniorRing= junior_ring )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:230:2: (mJuniorRing= junior_ring )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:230:3: mJuniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_ring_without_breed674);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mJuniorRing);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:231:2: (mEmptyRing= empty_breed_ring )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:231:2: (mEmptyRing= empty_breed_ring )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:231:3: mEmptyRing= empty_breed_ring
					{
					pushFollow(FOLLOW_empty_breed_ring_in_ring_without_breed683);
					mEmptyRing=empty_breed_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mEmptyRing);}
					}

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:2: (mRallyRing= rally_ring )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:2: (mRallyRing= rally_ring )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:3: mRallyRing= rally_ring
					{
					pushFollow(FOLLOW_rally_ring_in_ring_without_breed692);
					mRallyRing=rally_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRallyRing);}
					}

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:233:2: (mNonConformationRing= non_conformation_ring )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:233:2: (mNonConformationRing= non_conformation_ring )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:233:3: mNonConformationRing= non_conformation_ring
					{
					pushFollow(FOLLOW_non_conformation_ring_in_ring_without_breed701);
					mNonConformationRing=non_conformation_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mNonConformationRing);}
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
	// $ANTLR end "ring_without_breed"



	// $ANTLR start "rally_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:245:1: rally_ring returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) );
	public final JsonObject rally_ring() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		json = new JsonObject();String entries = "";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:246:53: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt25=1;
			}
			else if ( (LA25_0==RALLY_CLASS) ) {
				alt25=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:247:3: (rallyComment= rally_comment )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:247:3: (rallyComment= rally_comment )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:247:4: rallyComment= rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring729);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("comment", rallyComment);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:247:76: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:247:76: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:247:78: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring737);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:247:136: ( (line= rally_entry_line )* )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:247:137: (line= rally_entry_line )*
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:247:137: (line= rally_entry_line )*
					loop24:
					do {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==INT) ) {
							int LA24_2 = input.LA(2);
							if ( (LA24_2==RALLY_ENTRY) ) {
								alt24=1;
							}

						}
						else if ( (LA24_0==RALLY_ENTRY) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:247:138: line= rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring744);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop24;
						}
					} while (true);

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
	// $ANTLR end "rally_ring"



	// $ANTLR start "empty_breed_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:249:1: empty_breed_ring returns [JsonObject json] : ( BREED_COUNT ) ;
	public final JsonObject empty_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT38=null;

		json = new JsonObject();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:250:33: ( ( BREED_COUNT ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:251:3: ( BREED_COUNT )
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:251:3: ( BREED_COUNT )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:251:4: BREED_COUNT
			{
			BREED_COUNT38=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_empty_breed_ring770); if (state.failed) return json;
			if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT38!=null?BREED_COUNT38.getText():null));}
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
	// $ANTLR end "empty_breed_ring"



	// $ANTLR start "non_conformation_breed_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:253:1: non_conformation_breed_ring returns [JsonObject json] : BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) ;
	public final JsonObject non_conformation_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME39=null;

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:253:55: ( BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:254:2: BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE )
			{
			BREED_NAME39=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_non_conformation_breed_ring785); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("NonConformationBreed",(BREED_NAME39!=null?BREED_NAME39.getText():null));}
			match(input,COMMENT,FOLLOW_COMMENT_in_non_conformation_breed_ring788); if (state.failed) return json;
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
	// $ANTLR end "non_conformation_breed_ring"



	// $ANTLR start "breed_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:256:1: breed_ring returns [JsonObject json] : BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME40=null;
		Token BREED_NAME_SUFFIX41=null;
		Token BREED_COUNT42=null;

		json = new JsonObject();String breedName = "";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:257:55: ( BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:258:2: BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			BREED_NAME40=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring811); if (state.failed) return json;
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME40!=null?BREED_NAME40.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:266:10: ( BREED_NAME_SUFFIX )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==BREED_NAME_SUFFIX) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:266:11: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX41=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring815); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX41!=null?BREED_NAME_SUFFIX41.getText():null);}
					}
					break;

			}

			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:266:120: ( BREED_COUNT )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==BREED_COUNT) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:266:121: BREED_COUNT
					{
					BREED_COUNT42=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring823); if (state.failed) return json;
					if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT42!=null?BREED_COUNT42.getText():null));}
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



	// $ANTLR start "special_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:269:1: special_ring returns [JsonObject json] : ( BREED_NAME )? ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME43=null;
		Token SPECIAL_SUFFIX44=null;

		json = new JsonObject();String breedName= ""; String suffix="";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:270:71: ( ( BREED_NAME )? ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:271:3: ( BREED_NAME )? ( SPECIAL_SUFFIX )+
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:271:3: ( BREED_NAME )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==BREED_NAME) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:271:4: BREED_NAME
					{
					BREED_NAME43=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring848); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName+=(BREED_NAME43!=null?BREED_NAME43.getText():null);}
					}
					break;

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:271:47: ( SPECIAL_SUFFIX )+
			int cnt29=0;
			loop29:
			do {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==SPECIAL_SUFFIX) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:271:48: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX44=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring854); if (state.failed) return json;
					if ( state.backtracking==0 ) {suffix+= " " + (SPECIAL_SUFFIX44!=null?SPECIAL_SUFFIX44.getText():null);}
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(29, input);
						throw eee;
				}
				cnt29++;
			} while (true);

			if ( state.backtracking==0 ) {
					//breedName+= (SPECIAL_SUFFIX44!=null?SPECIAL_SUFFIX44.getText():null);
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
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:282:1: group_ring returns [String str] : GROUP_RING ( COMMENT | PARENTHETICAL )+ ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING45=null;
		Token COMMENT46=null;
		Token PARENTHETICAL47=null;

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:283:2: ( GROUP_RING ( COMMENT | PARENTHETICAL )+ )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:283:5: GROUP_RING ( COMMENT | PARENTHETICAL )+
			{
			GROUP_RING45=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring876); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(GROUP_RING45!=null?GROUP_RING45.getText():null);}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:283:39: ( COMMENT | PARENTHETICAL )+
			int cnt30=0;
			loop30:
			do {
				int alt30=3;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMENT) ) {
					alt30=1;
				}
				else if ( (LA30_0==PARENTHETICAL) ) {
					alt30=2;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:283:40: COMMENT
					{
					COMMENT46=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_group_ring880); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (COMMENT46!=null?COMMENT46.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:283:75: PARENTHETICAL
					{
					PARENTHETICAL47=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_group_ring883); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+= " " + (PARENTHETICAL47!=null?PARENTHETICAL47.getText():null);}
					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(30, input);
						throw eee;
				}
				cnt30++;
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
		return str;
	}
	// $ANTLR end "group_ring"



	// $ANTLR start "group_block"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:284:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME48=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:286:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:286:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT
			{
			TIME48=(Token)match(input,TIME,FOLLOW_TIME_in_group_block904); if (state.failed) return json;
			if ( state.backtracking==0 ) {currentBlockTime=(TIME48!=null?TIME48.getText():null);json.addProperty("TIME", currentBlockTime);}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:286:82: ( STANDALONE_COMMENT )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==STANDALONE_COMMENT) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:286:82: STANDALONE_COMMENT
					{
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block907); if (state.failed) return json;
					}
					break;

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:286:102: (mRing= group_ring )+
			int cnt32=0;
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==GROUP_RING) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:286:103: mRing= group_ring
					{
					pushFollow(FOLLOW_group_ring_in_group_block913);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {if(!mRelational){json = new JsonObject();String[] arr = parseGroupRing(mRing);json.addProperty("Group", arr[0]);json.addProperty("Judge",arr[1]);json.addProperty("Time",currentBlockTime);mShowRings.add(json);}else{rings.add(new JsonPrimitive(mRing));}}
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(32, input);
						throw eee;
				}
				cnt32++;
			} while (true);

			if ( state.backtracking==0 ) {if(mRelational){json.add("Rings", rings);}}
			match(input,GROUP_ENDING_ANNOUNCEMENT,FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block921); if (state.failed) return json;
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



	// $ANTLR start "non_conformation_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:292:1: non_conformation_ring returns [JsonObject json] : NON_CONFORMATION_CLASS_NAME ;
	public final JsonObject non_conformation_ring() throws RecognitionException {
		JsonObject json = null;


		Token NON_CONFORMATION_CLASS_NAME49=null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:294:2: ( NON_CONFORMATION_CLASS_NAME )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:294:4: NON_CONFORMATION_CLASS_NAME
			{
			NON_CONFORMATION_CLASS_NAME49=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring945); if (state.failed) return json;
			if ( state.backtracking==0 ) {mCurrentClass=(NON_CONFORMATION_CLASS_NAME49!=null?NON_CONFORMATION_CLASS_NAME49.getText():null);json.addProperty("Class",mCurrentClass);}
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
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:297:1: rally_ring_block returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) );
	public final JsonObject rally_ring_block() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		String entries = ""; json = new JsonObject();json.addProperty("Empty","rally: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:3: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt34=1;
			}
			else if ( (LA34_0==RALLY_CLASS) ) {
				alt34=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:5: (rallyComment= rally_comment )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:5: (rallyComment= rally_comment )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:6: rallyComment= rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring_block968);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("comment", rallyComment);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:80: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring_block976);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:138: ( (line= rally_entry_line )* )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:139: (line= rally_entry_line )*
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:139: (line= rally_entry_line )*
					loop33:
					do {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==INT||LA33_0==RALLY_ENTRY) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:299:140: line= rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring_block983);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop33;
						}
					} while (true);

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
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:300:1: rally_ring_name returns [String str] : RALLY_CLASS ;
	public final String rally_ring_name() throws RecognitionException {
		String str = null;


		Token RALLY_CLASS50=null;

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:301:2: ( RALLY_CLASS )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:301:4: RALLY_CLASS
			{
			RALLY_CLASS50=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_ring_name1000); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(RALLY_CLASS50!=null?RALLY_CLASS50.getText():null);}
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
	// $ANTLR end "rally_ring_name"



	// $ANTLR start "rally_entry_line"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:304:1: rally_entry_line returns [String str] : ( ( INT )? RALLY_ENTRY ) ;
	public final String rally_entry_line() throws RecognitionException {
		String str = null;


		Token INT51=null;
		Token RALLY_ENTRY52=null;

		str="";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:305:16: ( ( ( INT )? RALLY_ENTRY ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:306:3: ( ( INT )? RALLY_ENTRY )
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:306:3: ( ( INT )? RALLY_ENTRY )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:306:4: ( INT )? RALLY_ENTRY
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:306:4: ( INT )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==INT) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:306:4: INT
					{
					INT51=(Token)match(input,INT,FOLLOW_INT_in_rally_entry_line1022); if (state.failed) return str;
					}
					break;

			}

			if ( state.backtracking==0 ) {str+=(INT51!=null?INT51.getText():null);}
			RALLY_ENTRY52=(Token)match(input,RALLY_ENTRY,FOLLOW_RALLY_ENTRY_in_rally_entry_line1026); if (state.failed) return str;
			if ( state.backtracking==0 ) {str+=" "+(RALLY_ENTRY52!=null?RALLY_ENTRY52.getText():null);}
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
	// $ANTLR end "rally_entry_line"



	// $ANTLR start "rally_comment"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:308:1: rally_comment returns [String str] : ( NON_CONF_SECOND_LINE_COMMENT )+ ;
	public final String rally_comment() throws RecognitionException {
		String str = null;


		Token NON_CONF_SECOND_LINE_COMMENT53=null;

		str="";
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:309:16: ( ( NON_CONF_SECOND_LINE_COMMENT )+ )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:310:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:310:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			int cnt36=0;
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:310:4: NON_CONF_SECOND_LINE_COMMENT
					{
					NON_CONF_SECOND_LINE_COMMENT53=(Token)match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1047); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" "+(NON_CONF_SECOND_LINE_COMMENT53!=null?NON_CONF_SECOND_LINE_COMMENT53.getText():null);}
					}
					break;

				default :
					if ( cnt36 >= 1 ) break loop36;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(36, input);
						throw eee;
				}
				cnt36++;
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
		return str;
	}
	// $ANTLR end "rally_comment"



	// $ANTLR start "junior_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:317:1: junior_ring returns [JsonObject json] : JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token JUNIOR_CLASS54=null;

		json = new JsonObject();
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:318:33: ( JUNIOR_CLASS )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:319:3: JUNIOR_CLASS
			{
			JUNIOR_CLASS54=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring1072); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("ClassName", (JUNIOR_CLASS54!=null?JUNIOR_CLASS54.getText():null));}
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

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:95: ( ring )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:96: ring
		{
		pushFollow(FOLLOW_ring_in_synpred2_test71);
		ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred2_test

	// $ANTLR start synpred8_test
	public final void synpred8_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:5: ( JUDGE_NAME )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:5: JUDGE_NAME
		{
		match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_synpred8_test217); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred8_test

	// $ANTLR start synpred10_test
	public final void synpred10_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:43: ( COMMENT )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:43: COMMENT
		{
		match(input,COMMENT,FOLLOW_COMMENT_in_synpred10_test223); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred10_test

	// $ANTLR start synpred11_test
	public final void synpred11_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:76: ( PARENTHETICAL )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:76: PARENTHETICAL
		{
		match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_synpred11_test226); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred11_test

	// $ANTLR start synpred12_test
	public final void synpred12_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:121: ( PARENTHETICAL_INT )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:121: PARENTHETICAL_INT
		{
		match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_synpred12_test229); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred12_test

	// $ANTLR start synpred13_test
	public final void synpred13_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:8: (mComment= comment )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:8: mComment= comment
		{
		pushFollow(FOLLOW_comment_in_synpred13_test258);
		mComment=comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred13_test

	// $ANTLR start synpred14_test
	public final void synpred14_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:42: ( TIME )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:42: TIME
		{
		match(input,TIME,FOLLOW_TIME_in_synpred14_test261); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred14_test

	// $ANTLR start synpred15_test
	public final void synpred15_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:64: ( PHONE_NUMBER )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:64: PHONE_NUMBER
		{
		match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_synpred15_test264); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred15_test

	// $ANTLR start synpred16_test
	public final void synpred16_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:102: ( BREED_NAME )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:167:102: BREED_NAME
		{
		match(input,BREED_NAME,FOLLOW_BREED_NAME_in_synpred16_test267); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred16_test

	// $ANTLR start synpred38_test
	public final void synpred38_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:352: (mComment= timeblock_comment )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:352: mComment= timeblock_comment
		{
		pushFollow(FOLLOW_timeblock_comment_in_synpred38_test439);
		mComment=timeblock_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred38_test

	// $ANTLR start synpred39_test
	public final void synpred39_test_fragment() throws RecognitionException {
		JsonArray rings =null;
		String mComment =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:178: (rings= inner_timeblock (mComment= timeblock_comment )* )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:178: rings= inner_timeblock (mComment= timeblock_comment )*
		{
		pushFollow(FOLLOW_inner_timeblock_in_synpred39_test433);
		rings=inner_timeblock();
		state._fsp--;
		if (state.failed) return ;
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:351: (mComment= timeblock_comment )*
		loop39:
		do {
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==BREED_NAME||(LA39_0 >= COMMENT && LA39_0 <= ELLIPSIS)||LA39_0==INT||LA39_0==NON_CONFORMATION_CLASS_NAME||LA39_0==PARENTHETICAL||LA39_0==PHONE_NUMBER||LA39_0==SPECIAL_SUFFIX) ) {
				alt39=1;
			}

			switch (alt39) {
			case 1 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:182:352: mComment= timeblock_comment
				{
				pushFollow(FOLLOW_timeblock_comment_in_synpred39_test439);
				mComment=timeblock_comment();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				break loop39;
			}
		} while (true);

		}

	}
	// $ANTLR end synpred39_test

	// $ANTLR start synpred41_test
	public final void synpred41_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:6: ( judge_name )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:6: judge_name
		{
		pushFollow(FOLLOW_judge_name_in_synpred41_test508);
		judge_name();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred41_test

	// $ANTLR start synpred42_test
	public final void synpred42_test_fragment() throws RecognitionException {
		JsonObject nonGroupRing =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:17: (nonGroupRing= non_group_ring )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:17: nonGroupRing= non_group_ring
		{
		pushFollow(FOLLOW_non_group_ring_in_synpred42_test512);
		nonGroupRing=non_group_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred42_test

	// $ANTLR start synpred43_test
	public final void synpred43_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:443: ( ring_comment )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:195:443: ring_comment
		{
		pushFollow(FOLLOW_ring_comment_in_synpred43_test515);
		ring_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred43_test

	// $ANTLR start synpred44_test
	public final void synpred44_test_fragment() throws RecognitionException {
		JsonObject suffix =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:52: (suffix= special_suffix )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:52: suffix= special_suffix
		{
		pushFollow(FOLLOW_special_suffix_in_synpred44_test561);
		suffix=special_suffix();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred44_test

	// $ANTLR start synpred45_test
	public final void synpred45_test_fragment() throws RecognitionException {
		JsonObject obedience =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:99: ( (obedience= obedience_with_breed ) )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:99: (obedience= obedience_with_breed )
		{
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:99: (obedience= obedience_with_breed )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:205:100: obedience= obedience_with_breed
		{
		pushFollow(FOLLOW_obedience_with_breed_in_synpred45_test567);
		obedience=obedience_with_breed();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred45_test

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
	public final boolean synpred8_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred44_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred44_test_fragment(); // can never throw exception
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
	public final boolean synpred12_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred45_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred45_test_fragment(); // can never throw exception
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
	public final boolean synpred10_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred42_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred42_test_fragment(); // can never throw exception
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
	public final boolean synpred43_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred43_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_big_comment_in_start63 = new BitSet(new long[]{0x164A460000000740L});
	public static final BitSet FOLLOW_ring_in_start76 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_EOF_in_start83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring109 = new BitSet(new long[]{0x1018080000000100L});
	public static final BitSet FOLLOW_inner_ring_in_ring114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring140 = new BitSet(new long[]{0x104A440000000742L});
	public static final BitSet FOLLOW_comment_in_inner_ring143 = new BitSet(new long[]{0x104A440000000742L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring157 = new BitSet(new long[]{0x0018080000000102L});
	public static final BitSet FOLLOW_judge_name_in_judge_block187 = new BitSet(new long[]{0x1000040000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block193 = new BitSet(new long[]{0x1000040000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_name217 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMENT_in_judge_name223 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_judge_name226 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_judge_name229 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_comment_in_big_comment258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_big_comment264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_comment302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_comment305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_timeblock_comment351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_timeblock_comment357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_timeblock_comment366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_ring_comment397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock420 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FOLLOWING_TIME_in_timeblock423 = new BitSet(new long[]{0x0C584C0000000742L});
	public static final BitSet FOLLOW_TIME_in_timeblock426 = new BitSet(new long[]{0x0C584C0000000742L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock433 = new BitSet(new long[]{0x0C584C0000000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock439 = new BitSet(new long[]{0x0C584C0000000742L});
	public static final BitSet FOLLOW_INT_in_non_group_ring462 = new BitSet(new long[]{0x0084500000000050L});
	public static final BitSet FOLLOW_ring_with_breed_in_non_group_ring472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_without_breed_in_non_group_ring481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_name_in_inner_timeblock508 = new BitSet(new long[]{0x0C584C0000000742L});
	public static final BitSet FOLLOW_non_group_ring_in_inner_timeblock512 = new BitSet(new long[]{0x0C584C0000000742L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock515 = new BitSet(new long[]{0x0C584C0000000742L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_walkthrough537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_name_in_ring_with_breed555 = new BitSet(new long[]{0x0400000000000112L});
	public static final BitSet FOLLOW_special_suffix_in_ring_with_breed561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_ring_with_breed567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_ring_with_breed573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_obedience_with_breed594 = new BitSet(new long[]{0x0002040000000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_obedience_with_breed607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_suffix626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name645 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_ring_without_breed674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_breed_ring_in_ring_without_breed683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_in_ring_without_breed692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_conformation_ring_in_ring_without_breed701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring737 = new BitSet(new long[]{0x0100040000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring744 = new BitSet(new long[]{0x0100040000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_empty_breed_ring770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_non_conformation_breed_ring785 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_non_conformation_breed_ring788 = new BitSet(new long[]{0x0002040000000000L});
	public static final BitSet FOLLOW_set_in_non_conformation_breed_ring790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring811 = new BitSet(new long[]{0x0000000000000092L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring815 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring848 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring854 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring876 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_group_ring880 = new BitSet(new long[]{0x0008000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_group_ring883 = new BitSet(new long[]{0x0008000000000102L});
	public static final BitSet FOLLOW_TIME_in_group_block904 = new BitSet(new long[]{0x0800020000000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block907 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block913 = new BitSet(new long[]{0x0000028000000000L});
	public static final BitSet FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring_block968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring_block976 = new BitSet(new long[]{0x0100040000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring_block983 = new BitSet(new long[]{0x0100040000000002L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_ring_name1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_rally_entry_line1022 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RALLY_ENTRY_in_rally_entry_line1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1047 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred2_test71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_synpred8_test217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_synpred10_test223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_synpred11_test226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_synpred12_test229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred13_test258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred14_test261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_synpred15_test264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_synpred16_test267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred38_test439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred39_test433 = new BitSet(new long[]{0x0448440000000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred39_test439 = new BitSet(new long[]{0x0448440000000742L});
	public static final BitSet FOLLOW_judge_name_in_synpred41_test508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_group_ring_in_synpred42_test512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred43_test515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_suffix_in_synpred44_test561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_synpred45_test567 = new BitSet(new long[]{0x0000000000000002L});
}
